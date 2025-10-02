package au.com.woolworths.feature.rewards.account.preferences;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.TermsAndConditionsContentKt;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import au.com.woolworths.shop.cart.ui.cart.CartMarketplaceSellerKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsOffersRoundelsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ g(String str, String str2, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                RewardsPreferenceDetailsContentKt.i(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                TermsAndConditionsContentKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                VocSurveyCardKt.c(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                CartMarketplaceSellerKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            case 4:
                ProductDetailsOffersRoundelsKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                ProductDetailsOffersRoundelsKt.c(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
