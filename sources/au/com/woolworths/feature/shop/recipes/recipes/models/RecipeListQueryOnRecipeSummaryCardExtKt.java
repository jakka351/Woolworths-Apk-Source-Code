package au.com.woolworths.feature.shop.recipes.recipes.models;

import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeDuration;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import com.woolworths.shop.recipes.RecipeListQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCardSummaryData;", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnRecipeSummaryCard;", "recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeListQueryOnRecipeSummaryCardExtKt {
    @NotNull
    public static final RecipeCardSummaryData toUiModel(@NotNull RecipeListQuery.OnRecipeSummaryCard onRecipeSummaryCard) {
        List arrayList;
        Intrinsics.h(onRecipeSummaryCard, "<this>");
        String str = onRecipeSummaryCard.getRecipeSummaryCardFragment().c;
        String str2 = onRecipeSummaryCard.getRecipeSummaryCardFragment().f10200a;
        String str3 = onRecipeSummaryCard.getRecipeSummaryCardFragment().b;
        List list = onRecipeSummaryCard.getRecipeSummaryCardFragment().d;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = EmptyList.d;
        }
        String str4 = onRecipeSummaryCard.getRecipeSummaryCardFragment().e;
        Boolean bool = onRecipeSummaryCard.getRecipeSummaryCardFragment().f;
        RecipeSummaryCardFragment.RecipePrepDuration recipePrepDuration = onRecipeSummaryCard.getRecipeSummaryCardFragment().g;
        RecipeDuration uiModel = recipePrepDuration != null ? RecipeSummaryCardFragmentRecipePrepDurationExtKt.toUiModel(recipePrepDuration) : null;
        RecipeSummaryCardFragment.RecipeCookDuration recipeCookDuration = onRecipeSummaryCard.getRecipeSummaryCardFragment().h;
        RecipeDuration uiModel2 = recipeCookDuration != null ? RecipeSummaryCardFragmentRecipeCookDurationExtKt.toUiModel(recipeCookDuration) : null;
        RecipeSummaryCardFragment.RecipeCostPerServe recipeCostPerServe = onRecipeSummaryCard.getRecipeSummaryCardFragment().i;
        return new RecipeCardSummaryData(str, str2, str3, arrayList, str4, bool, uiModel, uiModel2, recipeCostPerServe != null ? RecipeSummaryCardFragmentRecipeCostPerServeExtKt.toUiModel(recipeCostPerServe) : null);
    }
}
