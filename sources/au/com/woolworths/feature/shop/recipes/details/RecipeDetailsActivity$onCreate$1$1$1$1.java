package au.com.woolworths.feature.shop.recipes.details;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsContract;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipesDetailsScreens;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import au.com.woolworths.feature.shop.recipes.details.data.UserInteractionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RecipeDetailsActivity$onCreate$1$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        m();
        return Unit.f24250a;
    }

    public final void m() {
        RecipeDetailData recipeDetailData;
        UserInteractionData userInteractionData;
        Boolean bool;
        RecipeDetailsViewModel recipeDetailsViewModel = (RecipeDetailsViewModel) this.receiver;
        AnalyticsManager analyticsManager = recipeDetailsViewModel.h;
        if (!recipeDetailsViewModel.g.d()) {
            analyticsManager.a(RecipesDetailsScreens.e);
            recipeDetailsViewModel.v6(RecipeDetailsFullPageErrorState.f);
            return;
        }
        RecipeDetailsContract.ViewState viewState = (RecipeDetailsContract.ViewState) recipeDetailsViewModel.k.e();
        if (viewState == null || (recipeDetailData = viewState.b) == null || (userInteractionData = recipeDetailData.o) == null || (bool = userInteractionData.f8024a) == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        boolean z = !zBooleanValue;
        TrackingMetadata trackingMetadata = recipeDetailsViewModel.l;
        if (trackingMetadata != null) {
            analyticsManager.j(zBooleanValue ? RecipeDetailsActions.t : RecipeDetailsActions.q, trackingMetadata);
        }
        BuildersKt.c(ViewModelKt.a(recipeDetailsViewModel), null, null, new RecipeDetailsViewModel$toggleRecipeSave$1$2(recipeDetailsViewModel, z, zBooleanValue, null), 3);
    }
}
