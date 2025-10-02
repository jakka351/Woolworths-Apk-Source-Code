package au.com.woolworths.design.wx.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.onboarding.sdui.data.ButtonData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingContentData;
import au.com.woolworths.feature.shop.onboarding.sdui.ui.OnboardingSduiScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(Object obj, int i, int i2, Object obj2) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ColorSchemeKt.a((ColorScheme) this.e, (ComposableLambdaImpl) this.f, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                OnboardingSduiScreenKt.a((ButtonData) this.e, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                OnboardingSduiScreenKt.j((OnboardingContentData.VerticalContentData) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
