package androidx.lifecycle;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.os.Recreator;
import androidx.os.SavedStateRegistryOwner;
import androidx.work.Configuration;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.JobSchedulerExtKt;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.EnqueueUtilsKt;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import coil3.ImageLoader;
import coil3.RealImageLoader;
import coil3.disk.DiskCache;
import coil3.memory.EmptyStrongMemoryCache;
import coil3.memory.MemoryCache;
import coil3.memory.RealMemoryCache;
import coil3.memory.RealStrongMemoryCache;
import coil3.memory.RealWeakMemoryCache;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import com.google.firebase.sessions.UuidGenerator;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Handshake;
import okhttp3.WebSocket;
import okio.FileSystem;
import okio.Path;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipFilesKt;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [coil3.memory.a] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        int iF;
        Pair pair;
        Pair pair2;
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                return SavedStateHandleSupport.c((ViewModelStoreOwner) obj);
            case 1:
                SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) obj;
                savedStateRegistryOwner.getD().a(new Recreator(savedStateRegistryOwner));
                return unit;
            case 2:
                WorkContinuationImpl workContinuationImpl = (WorkContinuationImpl) obj;
                String str = WorkContinuationImpl.j;
                String str2 = EnqueueRunnable.f3996a;
                WorkManagerImpl workManagerImpl = workContinuationImpl.f3935a;
                if (WorkContinuationImpl.b(workContinuationImpl, new HashSet())) {
                    throw new IllegalStateException("WorkContinuation has cycles (" + workContinuationImpl + ")");
                }
                WorkDatabase workDatabase = workManagerImpl.c;
                Configuration configuration = workManagerImpl.b;
                workDatabase.c();
                try {
                    EnqueueUtilsKt.a(workDatabase, configuration, workContinuationImpl);
                    boolean zA = EnqueueRunnable.a(workContinuationImpl);
                    workDatabase.r();
                    if (zA) {
                        Schedulers.b(configuration, workManagerImpl.c, workManagerImpl.e);
                    }
                    return unit;
                } finally {
                    workDatabase.l();
                }
            case 3:
                WorkManagerImpl workManagerImpl2 = (WorkManagerImpl) obj;
                WorkDatabase workDatabase2 = workManagerImpl2.c;
                int i2 = Build.VERSION.SDK_INT;
                Context context = workManagerImpl2.f3939a;
                String str3 = SystemJobScheduler.i;
                if (i2 >= 34) {
                    JobSchedulerExtKt.b(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListE = SystemJobScheduler.e(context, jobScheduler);
                if (arrayListE != null && !arrayListE.isEmpty()) {
                    Iterator it = arrayListE.iterator();
                    while (it.hasNext()) {
                        SystemJobScheduler.d(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                workDatabase2.z().u();
                Schedulers.b(workManagerImpl2.b, workDatabase2, workManagerImpl2.e);
                return unit;
            case 4:
                Member memberN = ((ShopAccountInteractor) obj).n();
                if (memberN != null) {
                    return memberN.getShopperId();
                }
                return null;
            case 5:
                return CollectionsKt.Q((Pair) obj);
            case 6:
                MemoryCache.Builder builder = new MemoryCache.Builder();
                final Context context2 = ((ImageLoader.Builder) obj).f13047a;
                final double d = 0.2d;
                try {
                    Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                    Intrinsics.e(systemService);
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
                }
                builder.f13112a = new Function0() { // from class: coil3.memory.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int largeMemoryClass;
                        Context context3 = context2;
                        try {
                            Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                            Intrinsics.e(systemService2);
                            ActivityManager activityManager = (ActivityManager) systemService2;
                            largeMemoryClass = (context3.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                        } catch (Exception unused2) {
                            largeMemoryClass = 256;
                        }
                        return Long.valueOf((long) (d * largeMemoryClass * llqqqql.c0063c0063c00630063));
                    }
                };
                RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache();
                coil3.memory.a aVar = builder.f13112a;
                if (aVar == null) {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
                long jLongValue = ((Number) aVar.invoke()).longValue();
                return new RealMemoryCache(jLongValue > 0 ? new RealStrongMemoryCache(jLongValue, realWeakMemoryCache) : new EmptyStrongMemoryCache(realWeakMemoryCache), realWeakMemoryCache);
            case 7:
                return (DiskCache) ((RealImageLoader) obj).f13050a.d.getD();
            case 8:
                return new CallFactoryNetworkClient((Call.Factory) ((androidx.lifecycle.compose.d) obj).invoke());
            case 9:
                return (WebSocket.Factory) ((com.apollographql.apollo.network.http.a) obj).invoke();
            case 10:
                String string = ((UuidGenerator) obj).next().toString();
                Intrinsics.g(string, "toString(...)");
                return string;
            case 11:
                return ((Iterable) obj).iterator();
            case 12:
                return obj;
            case 13:
                Function0 function0 = (Function0) obj;
                Handshake.Companion companion = Handshake.e;
                try {
                    return (List) function0.invoke();
                } catch (SSLPeerUnverifiedException unused2) {
                    return EmptyList.d;
                }
            case 14:
                return (List) obj;
            default:
                ResourceFileSystem resourceFileSystem = (ResourceFileSystem) obj;
                ClassLoader classLoader = resourceFileSystem.g;
                FileSystem fileSystem = resourceFileSystem.h;
                Enumeration<URL> resources = classLoader.getResources("");
                Intrinsics.g(resources, "getResources(...)");
                ArrayList<URL> list = Collections.list(resources);
                Intrinsics.g(list, "list(...)");
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    Intrinsics.e(url);
                    if (Intrinsics.c(url.getProtocol(), "file")) {
                        String str4 = Path.e;
                        pair2 = new Pair(fileSystem, Path.Companion.b(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                Intrinsics.g(resources2, "getResources(...)");
                ArrayList<URL> list2 = Collections.list(resources2);
                Intrinsics.g(list2, "list(...)");
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    Intrinsics.e(url2);
                    String string2 = url2.toString();
                    Intrinsics.g(string2, "toString(...)");
                    int i3 = 0;
                    if (StringsKt.W(string2, "jar:file:", false) && (iF = StringsKt.F(0, 6, string2, "!")) != -1) {
                        String str5 = Path.e;
                        String strSubstring = string2.substring(4, iF);
                        Intrinsics.g(strSubstring, "substring(...)");
                        pair = new Pair(ZipFilesKt.c(Path.Companion.b(new File(URI.create(strSubstring))), fileSystem, new okio.internal.a(i3)), ResourceFileSystem.j);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return CollectionsKt.c0(arrayList2, arrayList);
        }
    }
}
