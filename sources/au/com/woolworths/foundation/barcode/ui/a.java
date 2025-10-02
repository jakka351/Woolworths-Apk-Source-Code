package au.com.woolworths.foundation.barcode.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.TopRowContainerKt;
import au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ ComposableLambdaImpl g;

    public /* synthetic */ a(String str, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.d = 0;
        BarcodeType barcodeType = BarcodeType.d;
        this.e = str;
        this.f = modifier;
        this.g = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        ComposableLambdaImpl composableLambdaImpl = this.g;
        Modifier modifier = this.f;
        String str = this.e;
        switch (i) {
            case 0:
                BarcodeType barcodeType = BarcodeType.d;
                ((Integer) obj2).getClass();
                BarcodeUiKt.a(str, modifier, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(3505));
                break;
            case 1:
                ((Integer) obj2).getClass();
                TopRowContainerKt.a(str, modifier, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                OnboardingCoachMarkKt.b(str, modifier, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                OnboardingCoachMarkKt.a(str, modifier, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(385));
                break;
        }
        return unit;
    }

    public /* synthetic */ a(String str, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = modifier;
        this.g = composableLambdaImpl;
    }
}
