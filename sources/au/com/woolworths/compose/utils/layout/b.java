package au.com.woolworths.compose.utils.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;

    public /* synthetic */ b(float f, int i, int i2) {
        this.d = i2;
        this.e = f;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                SpacerKt.a(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            default:
                SpacerKt.b(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
        }
        return Unit.f24250a;
    }
}
