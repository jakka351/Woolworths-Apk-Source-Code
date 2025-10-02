package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData;
import com.woolworths.product.list.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/advertising/data/google/model/UniversalInventoryContainerData;", "Lcom/woolworths/product/list/ProductListQuery$OnUniversalInventoryContainer;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryOnUniversalInventoryContainerExtKt {
    @NotNull
    public static final UniversalInventoryContainerData toUiModel(@NotNull ProductListQuery.OnUniversalInventoryContainer onUniversalInventoryContainer) {
        Intrinsics.h(onUniversalInventoryContainer, "<this>");
        ProductListQuery.GoogleAdBannerCard googleAdBannerCard = onUniversalInventoryContainer.getGoogleAdBannerCard();
        Object uiModel = null;
        GoogleAdBannerCard uiModel2 = googleAdBannerCard != null ? ProductListQueryGoogleAdBannerCardExtKt.toUiModel(googleAdBannerCard) : null;
        ProductListQuery.NextBestAction nextBestAction = onUniversalInventoryContainer.getNextBestAction();
        if (nextBestAction != null) {
            if (nextBestAction.getOnActionableCard() != null) {
                uiModel = ProductListQueryOnActionableCard1ExtKt.toUiModel(nextBestAction.getOnActionableCard());
            } else if (nextBestAction.getOnEdrOfferBanner() != null) {
                uiModel = ProductListQueryOnEdrOfferBannerExtKt.toUiModel(nextBestAction.getOnEdrOfferBanner());
            } else if (nextBestAction.getOnPersonalisedProductsBanner() != null) {
                uiModel = ProductListQueryOnPersonalisedProductsBannerExtKt.toUiModel(nextBestAction.getOnPersonalisedProductsBanner());
            }
        }
        return new UniversalInventoryContainerData(uiModel2, uiModel);
    }
}
