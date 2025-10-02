package au.com.woolworths.compose.utils.layout;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c(Object obj, float f, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.e = f;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).intValue();
                int iA = RecomposeScopeImplKt.a(this.f | 1);
                SpacerKt.c((ColumnScope) this.g, this.e, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).intValue();
                int iA2 = RecomposeScopeImplKt.a(this.f | 1);
                SpacerKt.d((RowScope) this.g, this.e, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }
}
