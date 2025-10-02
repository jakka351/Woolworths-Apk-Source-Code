package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesContract;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SavedRecipesScreenKt$SavedRecipesContent$1$1$1$1 extends FunctionReferenceImpl implements Function1<RecipeCardSummaryData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecipeCardSummaryData p0 = (RecipeCardSummaryData) obj;
        Intrinsics.h(p0, "p0");
        SavedRecipesViewModel savedRecipesViewModel = (SavedRecipesViewModel) this.receiver;
        savedRecipesViewModel.getClass();
        savedRecipesViewModel.j.f(new SavedRecipesContract.Actions.LaunchRecipeDetails(p0.getId()));
        return Unit.f24250a;
    }
}
