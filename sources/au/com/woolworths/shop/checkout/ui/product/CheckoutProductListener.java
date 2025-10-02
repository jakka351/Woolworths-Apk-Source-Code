package au.com.woolworths.shop.checkout.ui.product;

import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductCampaignInfo;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductSubstitutionOption;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProducts;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductsSubstitutionInfo;
import au.com.woolworths.shop.checkout.domain.model.MarketProductRow;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutSubstitutionPreferences;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/product/CheckoutProductListener;", "Lau/com/woolworths/shop/checkout/ui/product/CheckoutPromoCodeListener;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CheckoutProductListener extends CheckoutPromoCodeListener {
    void B5(CheckoutProductsSubstitutionInfo checkoutProductsSubstitutionInfo);

    void D3(boolean z, CheckoutProduct checkoutProduct);

    void E1(int i, boolean z);

    void E4(CheckoutProduct checkoutProduct);

    void F0(boolean z, CheckoutSubstitutionPreferences checkoutSubstitutionPreferences, ArrayList arrayList);

    void H3();

    void I4(CheckoutProduct checkoutProduct);

    void O0(CheckoutProduct checkoutProduct);

    void W3(CheckoutProductCampaignInfo checkoutProductCampaignInfo);

    void X1();

    void c1(CheckoutSubstitutionPreferences checkoutSubstitutionPreferences);

    void f1(CheckoutProductSubstitutionOption checkoutProductSubstitutionOption, ArrayList arrayList);

    void u4(MarketProductRow marketProductRow, String str, String str2);

    void w1(CheckoutProducts checkoutProducts);

    void x1(CheckoutProduct checkoutProduct);
}
