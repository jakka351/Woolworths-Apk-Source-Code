package au.com.woolworths.android.onesite.utils.preload;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/utils/preload/PreLoaderService;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PreLoaderService {

    /* renamed from: a, reason: collision with root package name */
    public final Set f4603a;
    public final DispatcherProvider b;

    public PreLoaderService(Set serviceProviders, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(serviceProviders, "serviceProviders");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f4603a = serviceProviders;
        this.b = dispatcherProvider;
    }

    public final void a() {
        PreLoaderService$start$$inlined$CoroutineExceptionHandler$1 preLoaderService$start$$inlined$CoroutineExceptionHandler$1 = new PreLoaderService$start$$inlined$CoroutineExceptionHandler$1();
        Job jobB = SupervisorKt.b();
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        Iterator it = this.f4603a.iterator();
        while (it.hasNext()) {
            BuildersKt.c(contextScopeA, preLoaderService$start$$inlined$CoroutineExceptionHandler$1, null, new PreLoaderService$start$1$1((PreLoader) it.next(), null), 2);
        }
    }
}
