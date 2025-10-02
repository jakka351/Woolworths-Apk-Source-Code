package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScopeImpl a(LifecycleOwner lifecycleOwner) {
        Intrinsics.h(lifecycleOwner, "<this>");
        Lifecycle d = lifecycleOwner.getD();
        Intrinsics.h(d, "<this>");
        AtomicReference atomicReference = d.f2786a;
        while (true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.f2779a.get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            Job jobB = SupervisorKt.b();
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(d, CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, MainDispatcherLoader.f24726a.T()));
            java.util.concurrent.atomic.AtomicReference atomicReference2 = atomicReference.f2779a;
            while (!atomicReference2.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            }
            DefaultScheduler defaultScheduler2 = Dispatchers.f24691a;
            BuildersKt.c(lifecycleCoroutineScopeImpl2, MainDispatcherLoader.f24726a.T(), null, new LifecycleCoroutineScopeImpl$register$1(lifecycleCoroutineScopeImpl2, null), 2);
            return lifecycleCoroutineScopeImpl2;
        }
    }
}
