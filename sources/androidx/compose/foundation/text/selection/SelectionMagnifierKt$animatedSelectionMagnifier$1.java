package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1(Function0 function0, Function1 function1) {
        super(3);
        this.h = function0;
        this.i = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(759876635);
        AnimationVector2D animationVector2D = SelectionMagnifierKt.f1213a;
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = SnapshotStateKt.d(this.h);
            composer.A(objG);
        }
        State state = (State) objG;
        Object objG2 = composer.G();
        if (objG2 == composer$Companion$Empty$1) {
            objG2 = new Animatable(new Offset(((Offset) state.getD()).f1751a), SelectionMagnifierKt.b, new Offset(SelectionMagnifierKt.c), 8);
            composer.A(objG2);
        }
        Animatable animatable = (Animatable) objG2;
        boolean zI = composer.I(animatable);
        Object objG3 = composer.G();
        if (zI || objG3 == composer$Companion$Empty$1) {
            objG3 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(state, animatable, null);
            composer.A(objG3);
        }
        EffectsKt.e(composer, Unit.f24250a, (Function2) objG3);
        final AnimationState animationState = animatable.c;
        boolean zN = composer.n(animationState);
        Object objG4 = composer.G();
        if (zN || objG4 == composer$Companion$Empty$1) {
            objG4 = new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new Offset(((Offset) animationState.getD()).f1751a);
                }
            };
            composer.A(objG4);
        }
        Modifier modifier = (Modifier) this.i.invoke((Function0) objG4);
        composer.l();
        return modifier;
    }
}
