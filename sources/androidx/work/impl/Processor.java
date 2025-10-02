package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.ListenableFutureKt;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;

@RestrictTo
/* loaded from: classes.dex */
public class Processor implements ForegroundProcessor {
    public static final String l = Logger.g("Processor");
    public final Context b;
    public final Configuration c;
    public final WorkManagerTaskExecutor d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f3928a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public Processor(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor, WorkDatabase workDatabase) {
        this.b = context;
        this.c = configuration;
        this.d = workManagerTaskExecutor;
        this.e = workDatabase;
    }

    public static boolean d(String str, WorkerWrapper workerWrapper, int i) {
        String str2 = l;
        if (workerWrapper == null) {
            Logger.e().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        workerWrapper.n.E(new WorkerStoppedException(i));
        Logger.e().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(ExecutionListener executionListener) {
        synchronized (this.k) {
            this.j.add(executionListener);
        }
    }

    public final WorkerWrapper b(String str) {
        WorkerWrapper workerWrapper = (WorkerWrapper) this.f.remove(str);
        boolean z = workerWrapper != null;
        if (!z) {
            workerWrapper = (WorkerWrapper) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        try {
                            this.b.startService(SystemForegroundDispatcher.b(this.b));
                        } catch (Throwable th) {
                            Logger.e().d(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f3928a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f3928a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return workerWrapper;
    }

    public final WorkerWrapper c(String str) {
        WorkerWrapper workerWrapper = (WorkerWrapper) this.f.get(str);
        return workerWrapper == null ? (WorkerWrapper) this.g.get(str) : workerWrapper;
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.k) {
            z = c(str) != null;
        }
        return z;
    }

    public final void f(ExecutionListener executionListener) {
        synchronized (this.k) {
            this.j.remove(executionListener);
        }
    }

    public final boolean g(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        Throwable th;
        WorkGenerationalId workGenerationalId = startStopToken.f3931a;
        final String str = workGenerationalId.f3985a;
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.e.p(new Callable() { // from class: androidx.work.impl.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.d.e;
                WorkTagDao workTagDaoA = workDatabase.A();
                String str2 = str;
                arrayList.addAll(workTagDaoA.b(str2));
                return workDatabase.z().t(str2);
            }
        });
        if (workSpec == null) {
            Logger.e().h(l, "Didn't find WorkSpec for id " + workGenerationalId);
            this.d.d.execute(new androidx.camera.core.impl.utils.futures.e(18, this, workGenerationalId));
            return false;
        }
        synchronized (this.k) {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
                try {
                    if (e(str)) {
                        Set set = (Set) this.h.get(str);
                        if (((StartStopToken) set.iterator().next()).f3931a.b == workGenerationalId.b) {
                            set.add(startStopToken);
                            Logger.e().a(l, "Work " + workGenerationalId + " is already enqueued for processing");
                        } else {
                            this.d.d.execute(new androidx.camera.core.impl.utils.futures.e(18, this, workGenerationalId));
                        }
                        return false;
                    }
                    if (workSpec.t != workGenerationalId.b) {
                        this.d.d.execute(new androidx.camera.core.impl.utils.futures.e(18, this, workGenerationalId));
                        return false;
                    }
                    WorkerWrapper.Builder builder = new WorkerWrapper.Builder(this.b, this.c, this.d, this, this.e, workSpec, arrayList);
                    if (runtimeExtras != null) {
                        builder.h = runtimeExtras;
                    }
                    WorkerWrapper workerWrapper = new WorkerWrapper(builder);
                    CoroutineDispatcher coroutineDispatcher = workerWrapper.e.b;
                    JobImpl jobImplA = JobKt.a();
                    coroutineDispatcher.getClass();
                    ListenableFuture listenableFutureA = ListenableFutureKt.a(CoroutineContext.Element.DefaultImpls.c(coroutineDispatcher, jobImplA), new WorkerWrapper$launch$1(workerWrapper, null));
                    listenableFutureA.addListener(new b(0, this, listenableFutureA, workerWrapper), this.d.d);
                    this.g.put(str, workerWrapper);
                    HashSet hashSet = new HashSet();
                    hashSet.add(startStopToken);
                    this.h.put(str, hashSet);
                    Logger.e().a(l, getClass().getSimpleName() + ": processing " + workGenerationalId);
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }
}
