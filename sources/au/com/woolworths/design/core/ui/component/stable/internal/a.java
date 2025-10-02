package au.com.woolworths.design.core.ui.component.stable.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.ButtonLoadingSpinnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(long j, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.e = j;
        this.f = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(49);
                CoreRippleConfigurationKt.a(this.e, (ComposableLambdaImpl) this.f, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                ButtonLoadingSpinnerKt.a((ButtonSpec.Size) this.f, this.e, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(ButtonSpec.Size size, long j, int i) {
        this.f = size;
        this.e = j;
    }
}
