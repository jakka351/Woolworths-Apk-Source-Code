package au.com.woolworths.shop.checkout.ui.epoxy.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView;
import com.airbnb.epoxy.EpoxyModelWithView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/epoxy/view/EditOrderBannerEpoxyView;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerView;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditOrderBannerEpoxyView extends EpoxyModelWithView<EditOrderBannerView> {
    public final EditOrderEventHandler n;

    public EditOrderBannerEpoxyView(EditOrderEventHandler eventHandler) {
        Intrinsics.h(eventHandler, "eventHandler");
        this.n = eventHandler;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Intrinsics.g(context, "getContext(...)");
        EditOrderBannerView editOrderBannerView = new EditOrderBannerView(context, null, 6, 0);
        editOrderBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        editOrderBannerView.setEvenHandler(this.n);
        return editOrderBannerView;
    }
}
