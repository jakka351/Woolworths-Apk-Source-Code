package au.com.woolworths.android.onesite.base.ui.generated.callback;

import android.view.View;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBindingImpl;

/* loaded from: classes3.dex */
public final class OnFocusChangeListener implements View.OnFocusChangeListener {
    public final IncludeSearchableToolbarWrapperBindingImpl d;

    public interface Listener {
    }

    public OnFocusChangeListener(IncludeSearchableToolbarWrapperBindingImpl includeSearchableToolbarWrapperBindingImpl) {
        this.d = includeSearchableToolbarWrapperBindingImpl;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.d.E;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
