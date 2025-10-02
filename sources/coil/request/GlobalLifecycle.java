package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/GlobalLifecycle;", "Landroidx/lifecycle/Lifecycle;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlobalLifecycle extends Lifecycle {
    public static final GlobalLifecycle b = new GlobalLifecycle();
    public static final GlobalLifecycle$owner$1 c = new GlobalLifecycle$owner$1();

    @Override // androidx.lifecycle.Lifecycle
    public final void a(LifecycleObserver lifecycleObserver) {
        if (!(lifecycleObserver instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
        GlobalLifecycle$owner$1 globalLifecycle$owner$1 = c;
        defaultLifecycleObserver.onCreate(globalLifecycle$owner$1);
        defaultLifecycleObserver.onStart(globalLifecycle$owner$1);
        defaultLifecycleObserver.onResume(globalLifecycle$owner$1);
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: b */
    public final Lifecycle.State getD() {
        return Lifecycle.State.h;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void c(LifecycleObserver lifecycleObserver) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
