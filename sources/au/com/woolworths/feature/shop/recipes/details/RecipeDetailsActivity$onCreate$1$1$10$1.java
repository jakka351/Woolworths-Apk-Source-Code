package au.com.woolworths.feature.shop.recipes.details;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsContract;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions;
import au.com.woolworths.feature.shop.recipes.details.data.IngredientsSectionData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeServesData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RecipeDetailsActivity$onCreate$1$1$10$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RecipeDetailData recipeDetailData;
        RecipeDetailData recipeDetailData2;
        IngredientsSectionData ingredientsSectionData;
        RecipeServesData recipeServesData;
        RecipeDetailsViewModel recipeDetailsViewModel = (RecipeDetailsViewModel) this.receiver;
        AnalyticsManager analyticsManager = recipeDetailsViewModel.h;
        MutableLiveData mutableLiveData = recipeDetailsViewModel.k;
        RecipeDetailsContract.ViewState viewState = (RecipeDetailsContract.ViewState) mutableLiveData.e();
        if (viewState == null || (recipeDetailData2 = viewState.b) == null || (ingredientsSectionData = recipeDetailData2.h) == null || (recipeServesData = ingredientsSectionData.f8017a) == null) {
            analyticsManager.c(RecipeDetailsActions.e);
        } else {
            analyticsManager.j(RecipeDetailsActions.e, TrackingMetadata.Companion.a(TrackableValue.q0, Integer.valueOf(recipeServesData.f8022a)));
        }
        RecipeDetailsContract.ViewState viewState2 = (RecipeDetailsContract.ViewState) mutableLiveData.e();
        if (viewState2 != null && (recipeDetailData = viewState2.b) != null) {
            recipeDetailsViewModel.n.f(new RecipeDetailsContract.Actions.LaunchShop(recipeDetailData));
        }
        return Unit.f24250a;
    }
}
