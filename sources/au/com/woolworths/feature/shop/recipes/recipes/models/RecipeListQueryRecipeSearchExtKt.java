package au.com.woolworths.feature.shop.recipes.recipes.models;

import com.woolworths.shop.recipes.RecipeListQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/shop/recipes/recipes/models/RecipeSearchData;", "Lcom/woolworths/shop/recipes/RecipeListQuery$RecipeSearch;", "recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeListQueryRecipeSearchExtKt {
    @NotNull
    public static final RecipeSearchData toUiModel(@NotNull RecipeListQuery.RecipeSearch recipeSearch) {
        Intrinsics.h(recipeSearch, "<this>");
        int totalNumberOfRecipes = recipeSearch.getTotalNumberOfRecipes();
        Integer nextPage = recipeSearch.getNextPage();
        String title = recipeSearch.getTitle();
        List<RecipeListQuery.RecipeListFeed> recipeListFeed = recipeSearch.getRecipeListFeed();
        ArrayList arrayList = new ArrayList();
        for (RecipeListQuery.RecipeListFeed recipeListFeed2 : recipeListFeed) {
            Object uiModel = null;
            if ((recipeListFeed2 != null ? recipeListFeed2.getOnActionableCard() : null) != null) {
                uiModel = RecipeListQueryOnActionableCardExtKt.toUiModel(recipeListFeed2.getOnActionableCard());
            } else if ((recipeListFeed2 != null ? recipeListFeed2.getOnGoogleAdBannerCard() : null) != null) {
                uiModel = RecipeListQueryOnGoogleAdBannerCardExtKt.toUiModel(recipeListFeed2.getOnGoogleAdBannerCard());
            } else if ((recipeListFeed2 != null ? recipeListFeed2.getOnUniversalInventoryContainer() : null) != null) {
                uiModel = RecipeListQueryOnUniversalInventoryContainerExtKt.toUiModel(recipeListFeed2.getOnUniversalInventoryContainer());
            } else if ((recipeListFeed2 != null ? recipeListFeed2.getOnRecipeSummaryCard() : null) != null) {
                uiModel = RecipeListQueryOnRecipeSummaryCardExtKt.toUiModel(recipeListFeed2.getOnRecipeSummaryCard());
            }
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        return new RecipeSearchData(null, totalNumberOfRecipes, nextPage, title, arrayList);
    }
}
