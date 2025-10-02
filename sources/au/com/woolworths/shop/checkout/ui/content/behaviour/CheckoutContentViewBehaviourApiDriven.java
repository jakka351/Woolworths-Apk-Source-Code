package au.com.woolworths.shop.checkout.ui.content.behaviour;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.LegacyNotifications;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsTotal;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/behaviour/CheckoutContentViewBehaviourApiDriven;", "Lau/com/woolworths/shop/checkout/ui/content/behaviour/CheckoutContentViewBehaviour;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutContentViewBehaviourApiDriven implements CheckoutContentViewBehaviour {
    @Override // au.com.woolworths.shop.checkout.ui.content.behaviour.CheckoutContentViewBehaviour
    public final boolean a(Checkout checkout, LegacyNotifications legacyNotifications) {
        CheckoutOrderTotalDetails checkoutOrderTotalDetails;
        OrderTotalDetailsTotal orderTotalDetailsTotal;
        if (checkout == null || (checkoutOrderTotalDetails = checkout.c) == null || (orderTotalDetailsTotal = checkoutOrderTotalDetails.c) == null) {
            return true;
        }
        return orderTotalDetailsTotal.f;
    }
}
