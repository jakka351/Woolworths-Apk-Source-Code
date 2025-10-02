package au.com.woolworths.feature.shop.recipes.recipes.models;

import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import com.woolworths.shop.recipes.RecipeListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/sdui/shop/actionablecard/ActionableCard;", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnActionableCard1;", "recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeListQueryOnActionableCard1ExtKt {
    @NotNull
    public static final ActionableCard toUiModel(@NotNull RecipeListQuery.OnActionableCard1 onActionableCard1) {
        Intrinsics.h(onActionableCard1, "<this>");
        return new ActionableCard(onActionableCard1.getImage(), onActionableCard1.getAltText(), CardHeightExtKt.toUiModel(onActionableCard1.getCardHeight()), onActionableCard1.getLink(), onActionableCard1.getAnalytics(), null, null);
    }
}
