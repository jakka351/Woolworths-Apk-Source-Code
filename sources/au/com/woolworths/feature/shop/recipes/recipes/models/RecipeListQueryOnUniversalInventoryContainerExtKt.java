package au.com.woolworths.feature.shop.recipes.recipes.models;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import com.woolworths.shop.recipes.RecipeListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/advertising/data/google/model/UniversalInventoryContainerData;", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnUniversalInventoryContainer;", "recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeListQueryOnUniversalInventoryContainerExtKt {
    @NotNull
    public static final UniversalInventoryContainerData toUiModel(@NotNull RecipeListQuery.OnUniversalInventoryContainer onUniversalInventoryContainer) {
        Intrinsics.h(onUniversalInventoryContainer, "<this>");
        RecipeListQuery.GoogleAdBannerCard googleAdBannerCard = onUniversalInventoryContainer.getGoogleAdBannerCard();
        ActionableCard uiModel = null;
        GoogleAdBannerCard uiModel2 = googleAdBannerCard != null ? RecipeListQueryGoogleAdBannerCardExtKt.toUiModel(googleAdBannerCard) : null;
        RecipeListQuery.NextBestAction nextBestAction = onUniversalInventoryContainer.getNextBestAction();
        if (nextBestAction != null && nextBestAction.getOnActionableCard() != null) {
            uiModel = RecipeListQueryOnActionableCard1ExtKt.toUiModel(nextBestAction.getOnActionableCard());
        }
        return new UniversalInventoryContainerData(uiModel2, uiModel);
    }
}
