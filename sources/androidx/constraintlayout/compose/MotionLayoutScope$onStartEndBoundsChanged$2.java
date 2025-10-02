package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.node.Ref;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MotionLayoutScope$onStartEndBoundsChanged$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(-1096247907);
        boolean zN = composer.n(null);
        Object objG = composer.G();
        if (zN || objG == (composer$Companion$Empty$1 = Composer.Companion.f1624a)) {
            throw null;
        }
        String str = (String) objG;
        Object objG2 = composer.G();
        Object obj4 = objG2;
        if (objG2 == composer$Companion$Empty$1) {
            int[] iArr = new int[4];
            for (int i = 0; i < 4; i++) {
                iArr[i] = 0;
            }
            composer.A(iArr);
            obj4 = iArr;
        }
        int[] iArr2 = (int[]) obj4;
        Object objG3 = composer.G();
        Rect rect = Rect.e;
        Object obj5 = objG3;
        if (objG3 == composer$Companion$Empty$1) {
            Ref ref = new Ref();
            ref.f1932a = rect;
            composer.A(ref);
            obj5 = ref;
        }
        Ref ref2 = (Ref) obj5;
        Object objG4 = composer.G();
        Object obj6 = objG4;
        if (objG4 == composer$Companion$Empty$1) {
            int[] iArr3 = new int[4];
            for (int i2 = 0; i2 < 4; i2++) {
                iArr3[i2] = 0;
            }
            composer.A(iArr3);
            obj6 = iArr3;
        }
        int[] iArr4 = (int[]) obj6;
        Object objG5 = composer.G();
        Object obj7 = objG5;
        if (objG5 == composer$Companion$Empty$1) {
            Ref ref3 = new Ref();
            ref3.f1932a = rect;
            composer.A(ref3);
            obj7 = ref3;
        }
        boolean zN2 = composer.n(null) | composer.n(str) | composer.I(null) | composer.I(iArr2) | composer.I(ref2) | composer.I(iArr4) | composer.I((Ref) obj7);
        Object objG6 = composer.G();
        if (zN2 || objG6 == composer$Companion$Empty$1) {
            objG6 = new MotionLayoutScope$onStartEndBoundsChanged$2$1$1(1);
            composer.A(objG6);
        }
        Modifier modifierA = OnPlacedModifierKt.a(modifier, (Function1) objG6);
        composer.l();
        return modifierA;
    }
}
