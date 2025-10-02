package coil3.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil3.util.LifecyclesKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/request/LifecycleRequestDelegate;", "Lcoil3/request/RequestDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LifecycleRequestDelegate implements RequestDelegate, DefaultLifecycleObserver {
    public final Lifecycle d;
    public final Job e;

    public LifecycleRequestDelegate(Lifecycle lifecycle, Job job) {
        this.d = lifecycle;
        this.e = job;
    }

    @Override // coil3.request.RequestDelegate
    public final Object a(Continuation continuation) throws Throwable {
        Object objA = LifecyclesKt.a(this.d, (ContinuationImpl) continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    @Override // coil3.request.RequestDelegate
    public final void complete() {
        this.d.c(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.e.cancel((CancellationException) null);
    }

    @Override // coil3.request.RequestDelegate
    public final void start() {
        this.d.a(this);
    }
}
