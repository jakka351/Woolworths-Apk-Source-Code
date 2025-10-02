package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import com.woolworths.product.list.ProductsBySearchQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/advertising/data/google/model/UniversalInventoryContainerData;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnUniversalInventoryContainer;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsBySearchQueryOnUniversalInventoryContainerExtKt {
    @NotNull
    public static final UniversalInventoryContainerData toUiModel(@NotNull ProductsBySearchQuery.OnUniversalInventoryContainer onUniversalInventoryContainer) {
        Intrinsics.h(onUniversalInventoryContainer, "<this>");
        ProductsBySearchQuery.GoogleAdBannerCard googleAdBannerCard = onUniversalInventoryContainer.getGoogleAdBannerCard();
        ActionableCard uiModel = null;
        GoogleAdBannerCard uiModel2 = googleAdBannerCard != null ? ProductsBySearchQueryGoogleAdBannerCardExtKt.toUiModel(googleAdBannerCard) : null;
        ProductsBySearchQuery.NextBestAction nextBestAction = onUniversalInventoryContainer.getNextBestAction();
        if (nextBestAction != null && nextBestAction.getOnActionableCard() != null) {
            uiModel = ProductsBySearchQueryOnActionableCard1ExtKt.toUiModel(nextBestAction.getOnActionableCard());
        }
        return new UniversalInventoryContainerData(uiModel2, uiModel);
    }
}
