package au.com.woolworths.feature.product.list.generated.callback;

import androidx.compose.ui.state.ToggleableState;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListOptionsChildFilterBindingImpl;
import au.com.woolworths.feature.product.list.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.ui.FilterOptionsClickListener;

/* loaded from: classes3.dex */
public final class OnStateChangedListener implements au.com.woolworths.checkbox.OnStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final EpoxyItemProductListOptionsChildFilterBindingImpl f5276a;

    public interface Listener {
    }

    public OnStateChangedListener(EpoxyItemProductListOptionsChildFilterBindingImpl epoxyItemProductListOptionsChildFilterBindingImpl) {
        this.f5276a = epoxyItemProductListOptionsChildFilterBindingImpl;
    }

    @Override // au.com.woolworths.checkbox.OnStateChangedListener
    public final void a(ToggleableState toggleableState) {
        EpoxyItemProductListOptionsChildFilterBindingImpl epoxyItemProductListOptionsChildFilterBindingImpl = this.f5276a;
        FilterMenuItem filterMenuItem = epoxyItemProductListOptionsChildFilterBindingImpl.C;
        FilterOptionsClickListener filterOptionsClickListener = epoxyItemProductListOptionsChildFilterBindingImpl.D;
        if (filterOptionsClickListener != null) {
            filterOptionsClickListener.j4(filterMenuItem, toggleableState);
        }
    }
}
