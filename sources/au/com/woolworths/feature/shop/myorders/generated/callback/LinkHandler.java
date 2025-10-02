package au.com.woolworths.feature.shop.myorders.generated.callback;

import au.com.woolworths.feature.shop.myorders.databinding.EpoxyItemOrderOverviewBindingImpl;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;

/* loaded from: classes3.dex */
public final class LinkHandler implements au.com.woolworths.android.onesite.handlers.LinkHandler {
    public final EpoxyItemOrderOverviewBindingImpl d;

    public interface Listener {
    }

    public LinkHandler(EpoxyItemOrderOverviewBindingImpl epoxyItemOrderOverviewBindingImpl) {
        this.d = epoxyItemOrderOverviewBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.handlers.LinkHandler
    public final boolean U3(String str, String str2) {
        OrderDetailsClickHandler orderDetailsClickHandler = this.d.N;
        if (orderDetailsClickHandler == null) {
            return false;
        }
        orderDetailsClickHandler.K3();
        return false;
    }
}
