package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsContract;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RecipeDetailsActivity$onCreate$1$1$8$1 extends FunctionReferenceImpl implements Function2<HorizontalListDataInterface, Object, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object p1) {
        HorizontalListDataInterface p0 = (HorizontalListDataInterface) obj;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        RecipeDetailsViewModel recipeDetailsViewModel = (RecipeDetailsViewModel) this.receiver;
        recipeDetailsViewModel.getClass();
        if (p1 instanceof RecipeCardSummaryData) {
            RecipeCardSummaryData recipeCardSummaryData = (RecipeCardSummaryData) p1;
            AnalyticsManager analyticsManager = recipeDetailsViewModel.h;
            RecipeDetailsActions recipeDetailsActions = RecipeDetailsActions.j;
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.m2, recipeCardSummaryData.getId());
            trackingMetadataA.b(TrackableValue.o2, recipeCardSummaryData.getTitle());
            analyticsManager.j(recipeDetailsActions, trackingMetadataA);
            recipeDetailsViewModel.n.f(new RecipeDetailsContract.Actions.LaunchRecipeDetails(recipeCardSummaryData.getId()));
        } else {
            if (!(p1 instanceof RecipeMoreCard)) {
                throw new IllegalStateException(androidx.camera.core.impl.b.n(p1, "HorizontalListData with items of type ", " is not expected and can't be displayed"));
            }
            recipeDetailsViewModel.G0(p0);
        }
        return Unit.f24250a;
    }
}
