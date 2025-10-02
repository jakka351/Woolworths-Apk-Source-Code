package coil3.request;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        viewTargetRequestDelegate.d.b(viewTargetRequestDelegate.e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.e;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.b();
        }
    }
}
