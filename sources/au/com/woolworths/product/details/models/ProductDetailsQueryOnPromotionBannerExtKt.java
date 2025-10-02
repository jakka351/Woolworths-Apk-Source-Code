package au.com.woolworths.product.details.models;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.promotion.banner.data.PromotionBannerApiData;
import au.com.woolworths.promotion.banner.data.PromotionMarkdownContent;
import com.woolworths.product.details.ProductDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/promotion/banner/data/PromotionBannerApiData;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionBanner;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQueryOnPromotionBannerExtKt {
    @NotNull
    public static final PromotionBannerApiData toUiModel(@NotNull ProductDetailsQuery.OnPromotionBanner onPromotionBanner) {
        Intrinsics.h(onPromotionBanner, "<this>");
        InsetBannerApiData uiModel = ProductDetailsQueryBannerExtKt.toUiModel(onPromotionBanner.getBanner());
        ProductDetailsQuery.PromotionContent promotionContent = onPromotionBanner.getPromotionContent();
        PromotionMarkdownContent uiModel2 = null;
        if (promotionContent != null && promotionContent.getOnPromotionMarkdownContent() != null) {
            uiModel2 = ProductDetailsQueryOnPromotionMarkdownContentExtKt.toUiModel(promotionContent.getOnPromotionMarkdownContent());
        }
        return new PromotionBannerApiData(uiModel, uiModel2);
    }
}
