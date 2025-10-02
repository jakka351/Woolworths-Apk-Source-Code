package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TooltipKt$TooltipBox$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        float f = TooltipKt.f1525a;
        final Transition transition = null;
        ComposedModifierKt.a(Modifier.Companion.d, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                Modifier modifier = (Modifier) obj3;
                Composer composer2 = (Composer) obj4;
                ((Number) obj5).intValue();
                composer2.o(-1498516085);
                TwoWayConverter twoWayConverter = VectorConvertersKt.f788a;
                Transition transition2 = transition;
                TransitionState transitionState = transition2.f776a;
                MutableState mutableState = transition2.d;
                boolean zBooleanValue = ((Boolean) transitionState.a()).booleanValue();
                composer2.o(-1553362193);
                float f2 = zBooleanValue ? 1.0f : 0.8f;
                composer2.l();
                Float fValueOf = Float.valueOf(f2);
                SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState;
                boolean zBooleanValue2 = ((Boolean) snapshotMutableStateImpl.getD()).booleanValue();
                composer2.o(-1553362193);
                float f3 = zBooleanValue2 ? 1.0f : 0.8f;
                composer2.l();
                Transition.TransitionAnimationState transitionAnimationStateD = TransitionKt.d(transition2, fValueOf, Float.valueOf(f3), (FiniteAnimationSpec) TooltipKt$animateTooltip$2$scale$2.h.invoke(transition2.f(), composer2, 0), twoWayConverter, composer2, 196608);
                boolean zBooleanValue3 = ((Boolean) transition2.f776a.a()).booleanValue();
                composer2.o(2073045083);
                float f4 = zBooleanValue3 ? 1.0f : 0.0f;
                composer2.l();
                Float fValueOf2 = Float.valueOf(f4);
                boolean zBooleanValue4 = ((Boolean) snapshotMutableStateImpl.getD()).booleanValue();
                composer2.o(2073045083);
                float f5 = zBooleanValue4 ? 1.0f : 0.0f;
                composer2.l();
                Modifier modifierB = GraphicsLayerModifierKt.b(modifier, ((Number) transitionAnimationStateD.getD()).floatValue(), ((Number) transitionAnimationStateD.getD()).floatValue(), ((Number) TransitionKt.d(transition2, fValueOf2, Float.valueOf(f5), (FiniteAnimationSpec) TooltipKt$animateTooltip$2$alpha$2.h.invoke(transition2.f(), composer2, 0), twoWayConverter, composer2, 196608).getD()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 131064);
                composer2.l();
                return modifierB;
            }
        });
        throw null;
    }
}
