package coil3.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil3.RealImageLoader;
import coil3.target.ViewTarget;
import coil3.util.LifecyclesKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/request/ViewTargetRequestDelegate;", "Lcoil3/request/RequestDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewTargetRequestDelegate implements RequestDelegate, DefaultLifecycleObserver {
    public final RealImageLoader d;
    public final ImageRequest e;
    public final ViewTarget f;
    public final Lifecycle g;
    public final Job h;

    public ViewTargetRequestDelegate(RealImageLoader realImageLoader, ImageRequest imageRequest, ViewTarget viewTarget, Lifecycle lifecycle, Job job) {
        this.d = realImageLoader;
        this.e = imageRequest;
        this.f = viewTarget;
        this.g = lifecycle;
        this.h = job;
    }

    @Override // coil3.request.RequestDelegate
    public final Object a(Continuation continuation) {
        Object objA;
        Lifecycle lifecycle = this.g;
        return (lifecycle == null || (objA = LifecyclesKt.a(lifecycle, (ContinuationImpl) continuation)) != CoroutineSingletons.d) ? Unit.f24250a : objA;
    }

    public final void b() {
        this.h.cancel((CancellationException) null);
        ViewTarget viewTarget = this.f;
        boolean z = viewTarget instanceof LifecycleObserver;
        Lifecycle lifecycle = this.g;
        if (z && lifecycle != null) {
            lifecycle.c((LifecycleObserver) viewTarget);
        }
        if (lifecycle != null) {
            lifecycle.c(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f.getClass();
        ViewTargetRequestManagerKt.a(null);
        throw null;
    }

    @Override // coil3.request.RequestDelegate
    public final void r() {
        this.f.getClass();
        throw null;
    }

    @Override // coil3.request.RequestDelegate
    public final void start() {
        Lifecycle lifecycle = this.g;
        if (lifecycle != null) {
            lifecycle.a(this);
        }
        ViewTarget viewTarget = this.f;
        if ((viewTarget instanceof LifecycleObserver) && lifecycle != null) {
            LifecycleObserver lifecycleObserver = (LifecycleObserver) viewTarget;
            lifecycle.c(lifecycleObserver);
            lifecycle.a(lifecycleObserver);
        }
        viewTarget.getClass();
        ViewTargetRequestManagerKt.a(null);
        throw null;
    }
}
