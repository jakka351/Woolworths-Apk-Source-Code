package au.com.woolworths.compose.utils.modifier;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AlphaShadowKt {
    public static Modifier a(Modifier alphaShadow, final float f) {
        final float f2 = 0;
        Intrinsics.h(alphaShadow, "$this$alphaShadow");
        return ComposedModifierKt.a(alphaShadow, new au.com.woolworths.android.onesite.repository.b(8), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: au.com.woolworths.compose.utils.modifier.AlphaShadowKt$alphaShadow$2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier composed = (Modifier) obj;
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                Intrinsics.h(composed, "$this$composed");
                composer.o(2139710745);
                composer.o(1849434622);
                Object objG = composer.G();
                Object obj4 = Composer.Companion.f1624a;
                if (objG == obj4) {
                    objG = AndroidPaint_androidKt.a();
                    composer.A(objG);
                }
                Paint paint = (Paint) objG;
                Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
                if (objE == obj4) {
                    objE = paint.getF1759a();
                    composer.A(objE);
                }
                Object obj5 = (android.graphics.Paint) objE;
                composer.l();
                composer.o(-1224400529);
                float f3 = f;
                boolean zQ = composer.q(f3) | composer.q(1.0f);
                float f4 = f2;
                boolean zQ2 = zQ | composer.q(f4) | composer.I(obj5) | composer.I(paint);
                Object objG2 = composer.G();
                if (zQ2 || objG2 == obj4) {
                    Object aVar = new a(f3, f4, obj5, paint, 0);
                    composer.A(aVar);
                    objG2 = aVar;
                }
                composer.l();
                Modifier modifierD = DrawModifierKt.d(Modifier.Companion.d, (Function1) objG2);
                composer.l();
                return modifierD;
            }
        });
    }
}
