package au.com.woolworths.feature.shop.login.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.login.LoginViewModel;
import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiViewModel;
import au.com.woolworths.feature.shop.onboarding.sdui.ui.OnboardingSduiScreenKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Function j;
    public final /* synthetic */ Object k;

    public /* synthetic */ a(OnboardingSduiViewModel onboardingSduiViewModel, Function1 function1, Function0 function0, Function0 function02, Function1 function12, Function0 function03, Function0 function04, int i) {
        this.i = onboardingSduiViewModel;
        this.j = function1;
        this.e = function0;
        this.f = function02;
        this.k = function12;
        this.g = function03;
        this.h = function04;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                LoginScreenKt.b(this.e, this.f, this.g, this.h, (Function0) this.i, (Function0) this.j, (LoginViewModel) this.k, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                OnboardingSduiScreenKt.i((OnboardingSduiViewModel) this.i, (Function1) this.j, this.e, this.f, (Function1) this.k, this.g, this.h, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, LoginViewModel loginViewModel, int i) {
        this.e = function0;
        this.f = function02;
        this.g = function03;
        this.h = function04;
        this.i = function05;
        this.j = function06;
        this.k = loginViewModel;
    }
}
