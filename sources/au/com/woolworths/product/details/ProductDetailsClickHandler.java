package au.com.woolworths.product.details;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.product.details.models.HealthierHorizontalListData;
import au.com.woolworths.product.details.models.ProductImage;
import au.com.woolworths.product.details.ui.CollapsibleContentUiModel;
import au.com.woolworths.product.details.ui.ProductNutritionInfoUiModel;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.promotion.banner.ui.PromotionBannerListener;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsClickHandler;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerClickListener;", "Lau/com/woolworths/promotion/banner/ui/PromotionBannerListener;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductDetailsClickHandler extends InsetBannerClickListener, PromotionBannerListener {
    void F5(ProductCard productCard, String str);

    void I5(ProductCard productCard);

    void M0(String str, String str2);

    void M3(String str, String str2);

    void M5(ProductCard productCard, String str);

    void Q3();

    void T1(ProductNutritionInfoUiModel productNutritionInfoUiModel);

    void U();

    void W5();

    void X5(ProductImage productImage);

    void d4(String str);

    void e(ProductCard productCard);

    void g1(String str, String str2);

    void g4(InfoSection infoSection);

    void h1(ProductCard productCard);

    void i2(ProductCard productCard, String str);

    void i5();

    void k0();

    void k3(ProductCard productCard, String str);

    void m(DynamicSizeCardData dynamicSizeCardData);

    void o3(String str, String str2);

    void q1(CollapsibleContentUiModel collapsibleContentUiModel);

    void t(ProductCard productCard);

    void v0(HealthierHorizontalListData healthierHorizontalListData);

    void z0(String str, String str2, String str3);
}
