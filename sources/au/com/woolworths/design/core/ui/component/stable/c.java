package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ c(boolean z, Function1 function1, Modifier modifier, boolean z2, int i, int i2, int i3) {
        this.d = i3;
        this.e = z;
        this.f = function1;
        this.g = modifier;
        this.h = z2;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                CheckboxKt.a(RecomposeScopeImplKt.a(this.i | 1), this.j, (Composer) obj, this.g, this.f, this.e, this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                au.com.woolworths.design.wx.component.SwitchKt.a(RecomposeScopeImplKt.a(this.i | 1), this.j, (Composer) obj, this.g, this.f, this.e, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                PointsScreenKt.a(RecomposeScopeImplKt.a(this.i | 1), this.j, (Composer) obj, this.g, this.f, this.e, this.h);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(boolean z, boolean z2, Modifier modifier, Function1 function1, int i, int i2) {
        this.d = 2;
        this.e = z;
        this.h = z2;
        this.g = modifier;
        this.f = function1;
        this.i = i;
        this.j = i2;
    }
}
