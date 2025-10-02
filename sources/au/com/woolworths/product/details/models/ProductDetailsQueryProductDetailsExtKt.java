package au.com.woolworths.product.details.models;

import android.os.Parcelable;
import com.woolworths.product.details.ProductDetailsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/details/models/ProductDetailsData;", "Lcom/woolworths/product/details/ProductDetailsQuery$ProductDetails;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsQueryProductDetailsExtKt {
    @NotNull
    public static final ProductDetailsData toUiModel(@NotNull ProductDetailsQuery.ProductDetails productDetails) {
        Intrinsics.h(productDetails, "<this>");
        List<ProductDetailsQuery.Feed> feed = productDetails.getFeed();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = feed.iterator();
        while (true) {
            Parcelable uiModel = null;
            if (!it.hasNext()) {
                break;
            }
            ProductDetailsQuery.Feed feed2 = (ProductDetailsQuery.Feed) it.next();
            if (feed2.getOnActionableCard() != null) {
                uiModel = ProductDetailsQueryOnActionableCardExtKt.toUiModel(feed2.getOnActionableCard());
            } else if (feed2.getOnCouponBanner() != null) {
                uiModel = ProductDetailsQueryOnCouponBannerExtKt.toUiModel(feed2.getOnCouponBanner());
            } else if (feed2.getOnFormattedBanner() != null) {
                uiModel = ProductDetailsQueryOnFormattedBannerExtKt.toUiModel(feed2.getOnFormattedBanner());
            } else if (feed2.getOnProductCard() != null) {
                uiModel = ProductDetailsQueryOnProductCardExtKt.toUiModel(feed2.getOnProductCard());
            } else if (feed2.getOnInsetBanner() != null) {
                uiModel = ProductDetailsQueryOnInsetBannerExtKt.toUiModel(feed2.getOnInsetBanner());
            } else if (feed2.getOnProductRatingsAndReviewsSummary() != null) {
                uiModel = ProductDetailsQueryOnProductRatingsAndReviewsSummaryExtKt.toUiModel(feed2.getOnProductRatingsAndReviewsSummary());
            } else if (feed2.getOnPromotionBanner() != null) {
                uiModel = ProductDetailsQueryOnPromotionBannerExtKt.toUiModel(feed2.getOnPromotionBanner());
            } else if (feed2.getOnFormattedContent() != null) {
                uiModel = ProductDetailsQueryOnFormattedContentExtKt.toUiModel(feed2.getOnFormattedContent());
            } else if (feed2.getOnProductDisclaimer() != null) {
                uiModel = ProductDetailsQueryOnProductDisclaimerExtKt.toUiModel(feed2.getOnProductDisclaimer());
            } else if (feed2.getOnProductOriginAndHealthInfo() != null) {
                uiModel = ProductDetailsQueryOnProductOriginAndHealthInfoExtKt.toUiModel(feed2.getOnProductOriginAndHealthInfo());
            } else if (feed2.getOnProductNutritionInfo() != null) {
                uiModel = ProductDetailsQueryOnProductNutritionInfoExtKt.toUiModel(feed2.getOnProductNutritionInfo());
            } else if (feed2.getOnProductDetailsMarketplace() != null) {
                uiModel = ProductDetailsQueryOnProductDetailsMarketplaceExtKt.toUiModel(feed2.getOnProductDetailsMarketplace());
            } else if (feed2.getOnHealthierHorizontalList() != null) {
                uiModel = ProductDetailsQueryOnHealthierHorizontalListExtKt.toUiModel(feed2.getOnHealthierHorizontalList());
            } else if (feed2.getOnDividerCard() != null) {
                uiModel = ProductDetailsQueryOnDividerCardExtKt.toUiModel(feed2.getOnDividerCard());
            } else if (feed2.getOnFooter() != null) {
                uiModel = ProductDetailsQueryOnFooterExtKt.toUiModel(feed2.getOnFooter());
            } else if (feed2.getOnProductHorizontalList() != null) {
                uiModel = ProductDetailsQueryOnProductHorizontalListExtKt.toUiModel(feed2.getOnProductHorizontalList());
            }
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        List<ProductDetailsQuery.ImageList> imageList = productDetails.getImageList();
        ArrayList arrayList2 = new ArrayList();
        for (ProductDetailsQuery.ImageList imageList2 : imageList) {
            ProductImage uiModel2 = imageList2 != null ? ProductDetailsQueryImageListExtKt.toUiModel(imageList2) : null;
            if (uiModel2 != null) {
                arrayList2.add(uiModel2);
            }
        }
        return new ProductDetailsData(arrayList, arrayList2, null, 4, null);
    }
}
