package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.contentpage.ui.ContentPageShareButtonKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration.CalibrationProgressLottieKt;
import au.com.woolworths.feature.shop.recipes.search.ui.RecipeSearchScreenKt;
import au.com.woolworths.sdui.legacy.banner.designcoreadapter.StandardAlertKt;
import au.com.woolworths.shared.ui.compose.shop.SignInOrRegisterNzButtonKt;
import au.com.woolworths.shop.lists.ui.lists.banner.ListsBannerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ a(Modifier modifier, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = modifier;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                OfferFeedInlineBannerKt.a(RecomposeScopeImplKt.a(1), composer, this.e, this.f);
                break;
            case 1:
                ContentPageShareButtonKt.a(RecomposeScopeImplKt.a(7), composer, this.e, this.f);
                break;
            case 2:
                CalibrationProgressLottieKt.a(RecomposeScopeImplKt.a(439), composer, this.e, this.f);
                break;
            case 3:
                RecipeSearchScreenKt.a(RecomposeScopeImplKt.a(1), composer, this.e, this.f);
                break;
            case 4:
                StandardAlertKt.a(RecomposeScopeImplKt.a(385), composer, this.e, this.f);
                break;
            case 5:
                SignInOrRegisterNzButtonKt.a(RecomposeScopeImplKt.a(7), composer, this.e, this.f);
                break;
            default:
                ListsBannerKt.a(RecomposeScopeImplKt.a(7), composer, this.e, this.f);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Function0 function0, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.f = function0;
        this.e = modifier;
    }
}
