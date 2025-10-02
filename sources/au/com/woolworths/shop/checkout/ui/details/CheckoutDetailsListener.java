package au.com.woolworths.shop.checkout.ui.details;

import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOption;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOptionModeId;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import au.com.woolworths.shop.checkout.domain.model.PreferenceId;
import au.com.woolworths.shop.checkout.domain.model.address.MarketAddressType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsListener;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CheckoutDetailsListener {
    void G5(PreferenceId preferenceId, boolean z);

    void M4(PreferenceId preferenceId, String str);

    void N3(PackagingMethodOption packagingMethodOption);

    void Z0(MarketAddressType marketAddressType, CollectionMethodOptionModeId collectionMethodOptionModeId);

    void e1(String str);

    void f4(CollectionMethodOption collectionMethodOption);

    void l2(String str, String str2);

    void n2(CollectionMethodOptionModeId collectionMethodOptionModeId);
}
