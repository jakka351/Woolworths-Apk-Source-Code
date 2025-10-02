package au.com.woolworths.feature.product.list.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Rect e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ int i;

    public /* synthetic */ k(Rect rect, float f, float f2, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = rect;
        this.f = f;
        this.g = f2;
        this.h = modifier;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                CoachMarkKt.c(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.CoachMarkKt.c(this.e, this.f, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
        }
        return Unit.f24250a;
    }
}
