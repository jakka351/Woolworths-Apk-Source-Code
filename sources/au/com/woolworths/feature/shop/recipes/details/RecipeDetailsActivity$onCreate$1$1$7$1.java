package au.com.woolworths.feature.shop.recipes.details;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.recipes.details.analytics.RecipeDetailsActions;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCardKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RecipeDetailsActivity$onCreate$1$1$7$1 extends FunctionReferenceImpl implements Function1<DynamicSizeCardData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((DynamicSizeCardData) obj);
        return Unit.f24250a;
    }

    public final void m(DynamicSizeCardData p0) {
        Intrinsics.h(p0, "p0");
        RecipeDetailsViewModel recipeDetailsViewModel = (RecipeDetailsViewModel) this.receiver;
        AnalyticsManager analyticsManager = recipeDetailsViewModel.h;
        if (p0 instanceof ActionableCard) {
            analyticsManager.j(RecipeDetailsActions.g, ActionableCardKt.a((ActionableCard) p0));
        } else if (p0 instanceof GoogleAdBannerCard) {
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) p0;
            BuildersKt.c(ViewModelKt.a(recipeDetailsViewModel), null, null, new RecipeDetailsViewModel$onGoogleAdBannerImpression$1(recipeDetailsViewModel, googleAdBannerCard, null), 3);
            analyticsManager.j(RecipeDetailsActions.i, GoogleAdBannerCardKt.a(googleAdBannerCard));
        }
    }
}
