package au.com.woolworths.feature.product.list.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;

    public /* synthetic */ g(float f, int i, int i2, int i3) {
        this.d = i3;
        this.e = i;
        this.f = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CoachMarkKt.b(this.f, this.e, RecomposeScopeImplKt.a(391), composer);
                break;
            default:
                au.com.woolworths.feature.product.list.legacy.compose.CoachMarkKt.b(this.f, this.e, RecomposeScopeImplKt.a(391), composer);
                break;
        }
        return Unit.f24250a;
    }
}
