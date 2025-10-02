package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.RealImageLoader;
import coil.target.ViewTarget;
import coil.util.Utils;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/ViewTargetRequestDelegate;", "Lcoil/request/RequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewTargetRequestDelegate implements RequestDelegate {
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f.getClass();
        Utils.c(null);
        throw null;
    }

    @Override // coil.request.RequestDelegate
    public final void r() {
        this.f.getClass();
        throw null;
    }

    @Override // coil.request.RequestDelegate
    public final void start() {
        Lifecycle lifecycle = this.g;
        lifecycle.a(this);
        ViewTarget viewTarget = this.f;
        if (viewTarget instanceof LifecycleObserver) {
            LifecycleObserver lifecycleObserver = (LifecycleObserver) viewTarget;
            lifecycle.c(lifecycleObserver);
            lifecycle.a(lifecycleObserver);
        }
        viewTarget.getClass();
        Utils.c(null);
        throw null;
    }
}
