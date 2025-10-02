package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsContract;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RecipeDetailsActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        RecipeDetailsViewModel recipeDetailsViewModel = (RecipeDetailsViewModel) this.receiver;
        SharedFlowImpl sharedFlowImpl = recipeDetailsViewModel.n;
        TrackingMetadata trackingMetadata = recipeDetailsViewModel.l;
        if (trackingMetadata != null) {
            recipeDetailsViewModel.h.j(RecipeDetailsActions.l, trackingMetadata);
        }
        sharedFlowImpl.f(new RecipeDetailsContract.Actions.ShareRecipe(p0));
        sharedFlowImpl.f(RecipeDetailsContract.Actions.PerformSuccessHaptic.f8009a);
        return Unit.f24250a;
    }
}
