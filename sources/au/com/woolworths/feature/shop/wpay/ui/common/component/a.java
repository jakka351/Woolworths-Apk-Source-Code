package au.com.woolworths.feature.shop.wpay.ui.common.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepperBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;

    public /* synthetic */ a(Modifier modifier, long j, int i, int i2) {
        this.d = 0;
        this.e = modifier;
        this.f = j;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                LoadingScreenKt.a(this.e, this.f, (Composer) obj, iA, this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(this.g | 1);
                ProgressStepperBarKt.a(this.e, this.f, (Composer) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(this.g | 1);
                ProgressStepperBarKt.b(this.e, this.f, (Composer) obj, iA3);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Modifier modifier, long j, int i, int i2, byte b) {
        this.d = i2;
        this.e = modifier;
        this.f = j;
        this.g = i;
    }
}
