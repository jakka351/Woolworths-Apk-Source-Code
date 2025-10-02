package au.com.woolworths.shared.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import com.halilibo.richtext.ui.SimpleTableLayoutKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ e(float f, Modifier modifier, Brush brush, Brush brush2, int i, int i2) {
        this.f = f;
        this.g = modifier;
        this.i = brush;
        this.j = brush2;
        this.e = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                GradientHorizontalProgressIndicatorKt.a(this.f, this.g, (Brush) this.i, (Brush) this.j, this.e, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                SimpleTableLayoutKt.a(this.e, (List) this.i, (Function1) this.j, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ e(int i, List list, Function1 function1, float f, Modifier modifier, int i2) {
        this.e = i;
        this.i = list;
        this.j = function1;
        this.f = f;
        this.g = modifier;
        this.h = i2;
    }
}
