package au.com.woolworths.feature.shop.recipes.recipes.models;

import au.com.woolworths.shop.aem.components.model.recipe.RecipeCostPerServeData;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCostPerServeData;", "Lau/com/woolworths/shop/aem/components/recipes/fragment/RecipeSummaryCardFragment$RecipeCostPerServe;", "recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeSummaryCardFragmentRecipeCostPerServeExtKt {
    @NotNull
    public static final RecipeCostPerServeData toUiModel(@NotNull RecipeSummaryCardFragment.RecipeCostPerServe recipeCostPerServe) {
        Intrinsics.h(recipeCostPerServe, "<this>");
        return new RecipeCostPerServeData(recipeCostPerServe.f10202a, null);
    }
}
