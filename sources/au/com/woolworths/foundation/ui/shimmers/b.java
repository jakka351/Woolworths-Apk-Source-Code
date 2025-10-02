package au.com.woolworths.foundation.ui.shimmers;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Dp g;
    public final /* synthetic */ Dp h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ b(Modifier modifier, float f, Dp dp, Dp dp2, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = f;
        this.g = dp;
        this.h = dp2;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ShimmerKt.a(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                au.com.woolworths.shared.ui.compose.rewards.ShimmerKt.a(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1), this.j);
                break;
        }
        return Unit.f24250a;
    }
}
