package au.com.woolworths.feature.product.list.legacy.generated.callback;

import android.view.View;
import au.com.woolworths.feature.product.list.legacy.databinding.IncludeSearchableToolbarWrapperWithComposeLegacyBindingImpl;

/* loaded from: classes3.dex */
public final class OnFocusChangeListener implements View.OnFocusChangeListener {
    public final IncludeSearchableToolbarWrapperWithComposeLegacyBindingImpl d;

    public interface Listener {
    }

    public OnFocusChangeListener(IncludeSearchableToolbarWrapperWithComposeLegacyBindingImpl includeSearchableToolbarWrapperWithComposeLegacyBindingImpl) {
        this.d = includeSearchableToolbarWrapperWithComposeLegacyBindingImpl;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.d.C;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
