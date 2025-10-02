package au.com.woolworths.feature.product.list.generated.callback;

import android.view.View;
import au.com.woolworths.feature.product.list.databinding.IncludeSearchableToolbarWrapperWithComposeBindingImpl;

/* loaded from: classes3.dex */
public final class OnFocusChangeListener implements View.OnFocusChangeListener {
    public final IncludeSearchableToolbarWrapperWithComposeBindingImpl d;

    public interface Listener {
    }

    public OnFocusChangeListener(IncludeSearchableToolbarWrapperWithComposeBindingImpl includeSearchableToolbarWrapperWithComposeBindingImpl) {
        this.d = includeSearchableToolbarWrapperWithComposeBindingImpl;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.d.A;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
