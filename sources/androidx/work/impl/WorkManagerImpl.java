package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.tracing.Trace;
import androidx.work.Configuration;
import androidx.work.ConfigurationKt$createDefaultTracer$tracer$1;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.SerialExecutorImpl;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.internal.ContextScope;

@RestrictTo
/* loaded from: classes.dex */
public class WorkManagerImpl extends WorkManager {
    public static WorkManagerImpl k;
    public static WorkManagerImpl l;
    public static final Object m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3939a;
    public final Configuration b;
    public final WorkDatabase c;
    public final TaskExecutor d;
    public final List e;
    public final Processor f;
    public final PreferenceUtils g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final Trackers j;

    /* renamed from: androidx.work.impl.WorkManagerImpl$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            List list = (List) obj;
            if (list == null || list.size() <= 0) {
                return null;
            }
            return ((WorkSpec.WorkInfoPojo) list.get(0)).a();
        }
    }

    @RequiresApi
    public static class Api24Impl {
    }

    static {
        Logger.g("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public WorkManagerImpl(Context context, final Configuration configuration, TaskExecutor taskExecutor, final WorkDatabase workDatabase, final List list, Processor processor, Trackers trackers) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        Logger.LogcatLogger logcatLogger = new Logger.LogcatLogger(configuration.h);
        synchronized (Logger.f3904a) {
            try {
                if (Logger.b == null) {
                    Logger.b = logcatLogger;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3939a = applicationContext;
        this.d = taskExecutor;
        this.c = workDatabase;
        this.f = processor;
        this.j = trackers;
        this.b = configuration;
        this.e = list;
        CoroutineDispatcher coroutineDispatcherA = taskExecutor.a();
        Intrinsics.g(coroutineDispatcherA, "taskExecutor.taskCoroutineDispatcher");
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineDispatcherA);
        this.g = new PreferenceUtils(workDatabase);
        final SerialExecutorImpl serialExecutorImplD = taskExecutor.d();
        String str = Schedulers.f3930a;
        processor.a(new ExecutionListener() { // from class: androidx.work.impl.c
            @Override // androidx.work.impl.ExecutionListener
            public final void d(WorkGenerationalId workGenerationalId, boolean z) {
                String str2 = Schedulers.f3930a;
                serialExecutorImplD.execute(new d(list, workGenerationalId, configuration, workDatabase, 0));
            }
        });
        taskExecutor.b(new ForceStopRunnable(applicationContext, this));
        String str2 = UnfinishedWorkListenerKt.f3934a;
        if (ProcessUtils.a(applicationContext, configuration)) {
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(applicationContext, null), FlowKt.r(FlowKt.c(new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(workDatabase.z().y(), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(4, null)), -1))), contextScopeA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WorkManagerImpl e(Context context) {
        WorkManagerImpl workManagerImplE;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    workManagerImplE = k;
                    if (workManagerImplE == null) {
                        workManagerImplE = l;
                    }
                }
                return workManagerImplE;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (workManagerImplE == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof Configuration.Provider)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            f(applicationContext, ((Configuration.Provider) applicationContext).g());
            workManagerImplE = e(applicationContext);
        }
        return workManagerImplE;
    }

    public static void f(Context context, Configuration configuration) {
        synchronized (m) {
            try {
                WorkManagerImpl workManagerImpl = k;
                if (workManagerImpl != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (workManagerImpl == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = WorkManagerImplExtKt.a(applicationContext, configuration);
                    }
                    k = l;
                }
            } finally {
            }
        }
    }

    @Override // androidx.work.WorkManager
    public final Operation b(String str, ExistingWorkPolicy existingWorkPolicy, List list) {
        return new WorkContinuationImpl(this, str, existingWorkPolicy, list, null).a();
    }

    public final WorkContinuationImpl d(ExistingWorkPolicy existingWorkPolicy, List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new WorkContinuationImpl(this, "SYNC_UNIQUE_WORKER_NAME", existingWorkPolicy, list, null);
    }

    public final void g() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        ConfigurationKt$createDefaultTracer$tracer$1 configurationKt$createDefaultTracer$tracer$1 = this.b.m;
        androidx.lifecycle.d dVar = new androidx.lifecycle.d(this, 3);
        Intrinsics.h(configurationKt$createDefaultTracer$tracer$1, "<this>");
        boolean zD = Trace.d();
        if (zD) {
            try {
                configurationKt$createDefaultTracer$tracer$1.a("ReschedulingWork");
            } catch (Throwable th) {
                if (zD) {
                    android.os.Trace.endSection();
                }
                throw th;
            }
        }
        dVar.invoke();
        if (zD) {
            android.os.Trace.endSection();
        }
    }
}
