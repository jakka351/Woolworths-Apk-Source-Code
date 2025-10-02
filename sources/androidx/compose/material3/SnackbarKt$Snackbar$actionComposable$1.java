package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SnackbarKt$Snackbar$actionComposable$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f1404a;
            ButtonColors buttonColorsB = ButtonDefaults.b(0L, 0L, composer, 13);
            final String str = null;
            byte b = 0;
            boolean zN = composer.n(null);
            Object objG = composer.G();
            if (zN || objG == Composer.Companion.f1624a) {
                final byte b2 = b == true ? 1 : 0;
                objG = new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        b2.a();
                        return Unit.f24250a;
                    }
                };
                composer.A(objG);
            }
            ButtonKt.b((Function0) objG, null, false, null, buttonColorsB, null, ComposableLambdaKt.c(521110564, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    Composer composer2 = (Composer) obj4;
                    if ((((Number) obj5).intValue() & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    }
                    return Unit.f24250a;
                }
            }, composer), composer, 805306368, 494);
        }
        return Unit.f24250a;
    }
}
