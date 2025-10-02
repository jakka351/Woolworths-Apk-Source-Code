package au.com.woolworths.shop.checkout.ui.details;

import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOption;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOptionModeId;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import au.com.woolworths.shop.checkout.domain.model.PreferenceId;
import au.com.woolworths.shop.checkout.domain.model.address.MarketAddressType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/checkout/ui/details/CheckoutDetailsContentKt$previewCheckoutDetailsListener$1", "Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsListener;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutDetailsContentKt$previewCheckoutDetailsListener$1 implements CheckoutDetailsListener {
    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void G5(PreferenceId preferenceId, boolean z) {
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void M4(PreferenceId preferenceId, String value) {
        Intrinsics.h(value, "value");
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void N3(PackagingMethodOption packagingMethod) {
        Intrinsics.h(packagingMethod, "packagingMethod");
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void Z0(MarketAddressType marketAddressType, CollectionMethodOptionModeId collectionMethodOptionModeId) {
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void e1(String str) {
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void f4(CollectionMethodOption modeId) {
        Intrinsics.h(modeId, "modeId");
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void l2(String str, String str2) {
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void n2(CollectionMethodOptionModeId collectionMethodOptionModeId) {
    }
}
