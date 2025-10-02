package au.com.woolworths.feature.rewards.account.authentication.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationFullPageMessageError;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContentKt;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsToggleGroupData;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.LandingScreenKt;
import au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt;
import au.com.woolworths.feature.shop.myorders.details.models.LocationImage;
import au.com.woolworths.foundation.rewards.common.ui.OfferStatusBadgeKt;
import au.com.woolworths.foundation.shop.nhp.model.TextWithAltData;
import au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt;
import au.com.woolworths.foundation.shop.nhp.ui.pp.InlineProductCarouselKt;
import au.com.woolworths.shared.ui.compose.breadcrumb.ProgressStepItemsKt;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryConfig;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.ui.recipe.RecipeCardKt;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.domain.model.substitution.ProductSubstitute;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutRewardsAndDiscountsUiKt;
import au.com.woolworths.shop.checkout.ui.substitution.component.ProductSubstituteItemKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(Object obj, Object obj2, boolean z, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(7);
                RewardsLoginScreenKt.a(this.e, (RewardsAuthenticationFullPageMessageError) this.f, (Function0) this.g, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                RewardsPreferenceDetailsContentKt.k((PreferenceDetailsToggleGroupData) this.f, this.e, (Function2) this.g, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                LandingScreenKt.c((EverydayExtraLandingViewModel) this.f, this.e, (Function0) this.g, (Composer) obj, iA3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(1);
                RequestLocationPermissionPrimingDialogContentKt.a((String) this.f, (LocationImage) this.g, this.e, (Composer) obj, iA4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iA5 = RecomposeScopeImplKt.a(439);
                OfferStatusBadgeKt.a((String) this.f, this.e, (Modifier) this.g, (Composer) obj, iA5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iA6 = RecomposeScopeImplKt.a(1);
                EdrOfferBannerKt.e((TextWithAltData) this.f, this.e, (Function0) this.g, (Composer) obj, iA6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iA7 = RecomposeScopeImplKt.a(1);
                InlineProductCarouselKt.a((List) this.f, this.e, (Modifier) this.g, (Composer) obj, iA7);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iA8 = RecomposeScopeImplKt.a(1);
                ProgressStepItemsKt.a((String) this.f, (String) this.g, this.e, (Composer) obj, iA8);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iA9 = RecomposeScopeImplKt.a(1);
                RecipeCardKt.c((RecipeCardSummaryData) this.f, (RecipeCardSummaryConfig) this.g, this.e, (Composer) obj, iA9);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iA10 = RecomposeScopeImplKt.a(1);
                CheckoutRewardsAndDiscountsUiKt.a((CheckoutRewardsAndDiscount) this.f, this.e, (Function0) this.g, (Composer) obj, iA10);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA11 = RecomposeScopeImplKt.a(1);
                ProductSubstituteItemKt.a((ProductSubstitute) this.f, this.e, (Function2) this.g, (Composer) obj, iA11);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Object obj, boolean z, Object obj2, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = z;
        this.g = obj2;
    }

    public /* synthetic */ a(boolean z, RewardsAuthenticationFullPageMessageError rewardsAuthenticationFullPageMessageError, Function0 function0, int i) {
        this.d = 0;
        this.e = z;
        this.f = rewardsAuthenticationFullPageMessageError;
        this.g = function0;
    }
}
