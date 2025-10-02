package coil.request;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import coil.target.ViewTarget;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {
    public final View d;
    public ViewTargetRequestDelegate e;

    public ViewTargetRequestManager(View view) {
        this.d = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.e;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        viewTargetRequestDelegate.d.d(viewTargetRequestDelegate.e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.e;
        if (viewTargetRequestDelegate != null) {
            Lifecycle lifecycle = viewTargetRequestDelegate.g;
            viewTargetRequestDelegate.h.cancel((CancellationException) null);
            ViewTarget viewTarget = viewTargetRequestDelegate.f;
            if (viewTarget instanceof LifecycleObserver) {
                lifecycle.c((LifecycleObserver) viewTarget);
            }
            lifecycle.c(viewTargetRequestDelegate);
        }
    }
}
