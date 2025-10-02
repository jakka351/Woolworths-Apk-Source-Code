package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import com.woolworths.product.list.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/aem/components/model/merchcard/MerchCardData;", "Lcom/woolworths/product/list/ProductListQuery$OnMerchCard;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryOnMerchCardExtKt {
    @NotNull
    public static final MerchCardData toUiModel(@NotNull ProductListQuery.OnMerchCard onMerchCard) {
        Intrinsics.h(onMerchCard, "<this>");
        ImageWithAltText uiModel = ProductListQueryMerchCardGridImageWithAltExtKt.toUiModel(onMerchCard.getMerchCardGridImageWithAlt());
        ImageWithAltText uiModel2 = ProductListQueryMerchCardListImageWithAltExtKt.toUiModel(onMerchCard.getMerchCardListImageWithAlt());
        String merchCardTitle = onMerchCard.getMerchCardTitle();
        String merchCardDescription = onMerchCard.getMerchCardDescription();
        ProductListQuery.MerchCardButton merchCardButton = onMerchCard.getMerchCardButton();
        ButtonData uiModel3 = merchCardButton != null ? ProductListApiDataKt.toUiModel(merchCardButton) : null;
        ProductListQuery.MerchCardAction merchCardAction = onMerchCard.getMerchCardAction();
        ActionData uiModel4 = merchCardAction != null ? ProductListQueryMerchCardActionExtKt.toUiModel(merchCardAction) : null;
        ProductListQuery.MerchCardAnalytics merchCardAnalytics = onMerchCard.getMerchCardAnalytics();
        AnalyticsData uiModel5 = merchCardAnalytics != null ? ProductListQueryMerchCardAnalyticsExtKt.toUiModel(merchCardAnalytics) : null;
        ProductListQuery.MerchCardImpressionAnalytics merchCardImpressionAnalytics = onMerchCard.getMerchCardImpressionAnalytics();
        return new MerchCardData(uiModel, uiModel2, merchCardTitle, merchCardDescription, uiModel3, uiModel4, uiModel5, merchCardImpressionAnalytics != null ? ProductListQueryMerchCardImpressionAnalyticsExtKt.toUiModel(merchCardImpressionAnalytics) : null);
    }
}
