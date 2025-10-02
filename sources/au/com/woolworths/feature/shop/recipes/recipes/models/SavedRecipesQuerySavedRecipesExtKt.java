package au.com.woolworths.feature.shop.recipes.recipes.models;

import com.woolworths.shop.recipes.SavedRecipesQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/shop/recipes/recipes/models/RecipeSearchData;", "Lcom/woolworths/shop/recipes/SavedRecipesQuery$SavedRecipes;", "recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SavedRecipesQuerySavedRecipesExtKt {
    @NotNull
    public static final RecipeSearchData toUiModel(@NotNull SavedRecipesQuery.SavedRecipes savedRecipes) {
        Intrinsics.h(savedRecipes, "<this>");
        List<SavedRecipesQuery.Recipe> recipes = savedRecipes.getRecipes();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(recipes, 10));
        Iterator<T> it = recipes.iterator();
        while (it.hasNext()) {
            arrayList.add(SavedRecipesQueryRecipeExtKt.toUiModel((SavedRecipesQuery.Recipe) it.next()));
        }
        return new RecipeSearchData(arrayList, savedRecipes.getTotalNumberOfRecipes(), savedRecipes.getNextPage(), null, null);
    }
}
