package au.com.woolworths.feature.shop.recipes.details;

import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsContract;
import au.com.woolworths.feature.shop.recipes.details.data.RecipeDetailData;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RecipeDetailsActivity$onCreate$1$1$11$1 extends AdaptedFunctionReference implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RecipeDetailsViewModel recipeDetailsViewModel = (RecipeDetailsViewModel) this.d;
        RecipeDetailsContract.ViewState viewState = (RecipeDetailsContract.ViewState) recipeDetailsViewModel.k.e();
        if (viewState != null) {
            SharedFlowImpl sharedFlowImpl = recipeDetailsViewModel.n;
            RecipeDetailData recipeDetailData = viewState.b;
            Intrinsics.e(recipeDetailData);
            VideoData videoData = recipeDetailData.r;
            Intrinsics.e(videoData);
            sharedFlowImpl.f(new RecipeDetailsContract.Actions.LaunchFullPageVideoPlayer(videoData, viewState.f));
        }
        return Unit.f24250a;
    }
}
