package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.foundation.shop.nhp.model.TextWithAltData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.sdui.model.action.ActionData;
import com.woolworths.product.list.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBannerData;", "Lcom/woolworths/product/list/ProductListQuery$OnEdrOfferBanner;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryOnEdrOfferBannerExtKt {
    @NotNull
    public static final EdrOfferBannerData toUiModel(@NotNull ProductListQuery.OnEdrOfferBanner onEdrOfferBanner) {
        Intrinsics.h(onEdrOfferBanner, "<this>");
        String offerId = onEdrOfferBanner.getOfferId();
        String offerIdV1 = onEdrOfferBanner.getOfferIdV1();
        String linkedEdrHashCrn = onEdrOfferBanner.getLinkedEdrHashCrn();
        String bannerTitle = onEdrOfferBanner.getBannerTitle();
        String bannerDescription = onEdrOfferBanner.getBannerDescription();
        String bannerIconUrl = onEdrOfferBanner.getBannerIconUrl();
        ProductListQuery.BannerButtonAction bannerButtonAction = onEdrOfferBanner.getBannerButtonAction();
        ActionData uiModel = bannerButtonAction != null ? ProductListQueryBannerButtonActionExtKt.toUiModel(bannerButtonAction) : null;
        ProductListQuery.BannerButtonLabel bannerButtonLabel = onEdrOfferBanner.getBannerButtonLabel();
        TextWithAltData uiModel2 = bannerButtonLabel != null ? ProductListQueryBannerButtonLabelExtKt.toUiModel(bannerButtonLabel) : null;
        ProductListQuery.BannerAction bannerAction = onEdrOfferBanner.getBannerAction();
        ActionData uiModel3 = bannerAction != null ? ProductListQueryBannerActionExtKt.toUiModel(bannerAction) : null;
        ProductListQuery.BannerAnalytics bannerAnalytics = onEdrOfferBanner.getBannerAnalytics();
        AnalyticsData uiModel4 = bannerAnalytics != null ? ProductListQueryBannerAnalyticsExtKt.toUiModel(bannerAnalytics) : null;
        ProductListQuery.CommonAnalytics commonAnalytics = onEdrOfferBanner.getCommonAnalytics();
        AnalyticsData uiModel5 = commonAnalytics != null ? ProductListQueryCommonAnalyticsExtKt.toUiModel(commonAnalytics) : null;
        ProductListQuery.BannerImpressionAnalytics bannerImpressionAnalytics = onEdrOfferBanner.getBannerImpressionAnalytics();
        return new EdrOfferBannerData(offerId, offerIdV1, linkedEdrHashCrn, bannerTitle, bannerDescription, bannerIconUrl, uiModel, uiModel2, uiModel3, uiModel4, uiModel5, bannerImpressionAnalytics != null ? ProductListQueryBannerImpressionAnalyticsExtKt.toUiModel(bannerImpressionAnalytics) : null);
    }
}
