package au.com.woolworths.feature.product.list.legacy.generated.callback;

import androidx.compose.ui.state.ToggleableState;
import au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductListOptionsChildFilterLegacyBindingImpl;
import au.com.woolworths.feature.product.list.legacy.ui.FilterMenuItem;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOptionsClickListener;

/* loaded from: classes3.dex */
public final class OnStateChangedListener implements au.com.woolworths.checkbox.OnStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final EpoxyItemProductListOptionsChildFilterLegacyBindingImpl f5371a;

    public interface Listener {
    }

    public OnStateChangedListener(EpoxyItemProductListOptionsChildFilterLegacyBindingImpl epoxyItemProductListOptionsChildFilterLegacyBindingImpl) {
        this.f5371a = epoxyItemProductListOptionsChildFilterLegacyBindingImpl;
    }

    @Override // au.com.woolworths.checkbox.OnStateChangedListener
    public final void a(ToggleableState toggleableState) {
        EpoxyItemProductListOptionsChildFilterLegacyBindingImpl epoxyItemProductListOptionsChildFilterLegacyBindingImpl = this.f5371a;
        FilterMenuItem filterMenuItem = epoxyItemProductListOptionsChildFilterLegacyBindingImpl.C;
        FilterOptionsClickListener filterOptionsClickListener = epoxyItemProductListOptionsChildFilterLegacyBindingImpl.D;
        if (filterOptionsClickListener != null) {
            filterOptionsClickListener.V0(filterMenuItem, toggleableState);
        }
    }
}
