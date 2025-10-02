package au.com.woolworths.feature.shop.onboarding.sdui.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiContract;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingFooterData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c(OnboardingSduiContract.ViewState viewState, Function1 function1, Function0 function0, int i) {
        this.g = viewState;
        this.e = function1;
        this.h = function0;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(this.f | 1);
                OnboardingSduiScreenKt.h((OnboardingSduiContract.ViewState) this.g, this.e, (Function0) this.h, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(this.f | 1);
                OnboardingSduiScreenKt.d((OnboardingFooterData) this.g, (Modifier) this.h, this.e, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(OnboardingFooterData onboardingFooterData, Modifier modifier, Function1 function1, int i) {
        this.g = onboardingFooterData;
        this.h = modifier;
        this.e = function1;
        this.f = i;
    }
}
