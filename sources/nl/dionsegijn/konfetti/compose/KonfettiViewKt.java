package nl.dionsegijn.konfetti.compose;

import android.graphics.Rect;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import au.com.woolworths.shared.ui.compose.ConfettiKt$Confetti$2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import nl.dionsegijn.konfetti.core.Particle;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KonfettiViewKt {
    public static final void a(final Modifier modifier, final List list, final ConfettiKt$Confetti$2 confettiKt$Confetti$2, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-487900041);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        composerImplV.F(-3687241);
        Object objG = composerImplV.G();
        Object obj = Composer.Companion.f1624a;
        if (objG == obj) {
            objG = SnapshotStateKt.f(EmptyList.d);
            composerImplV.A(objG);
        }
        composerImplV.V(false);
        final MutableState mutableState = (MutableState) objG;
        composerImplV.F(-3687241);
        Object objG2 = composerImplV.G();
        if (objG2 == obj) {
            objG2 = SnapshotStateKt.f(0L);
            composerImplV.A(objG2);
        }
        composerImplV.V(false);
        MutableState mutableState2 = (MutableState) objG2;
        composerImplV.F(-3687241);
        Object objG3 = composerImplV.G();
        if (objG3 == obj) {
            objG3 = SnapshotStateKt.f(new Rect());
            composerImplV.A(objG3);
        }
        composerImplV.V(false);
        final MutableState mutableState3 = (MutableState) objG3;
        EffectsKt.e(composerImplV, Unit.f24250a, new KonfettiViewKt$KonfettiView$1(objectRef, list, mutableState2, mutableState, confettiKt$Confetti$2, mutableState3, null));
        composerImplV.F(-3686930);
        boolean zN = composerImplV.n(mutableState3);
        Object objG4 = composerImplV.G();
        if (zN || objG4 == obj) {
            objG4 = new Function1<LayoutCoordinates, Unit>() { // from class: nl.dionsegijn.konfetti.compose.KonfettiViewKt$KonfettiView$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    LayoutCoordinates it = (LayoutCoordinates) obj2;
                    Intrinsics.h(it, "it");
                    mutableState3.setValue(new Rect(0, 0, (int) (it.a() >> 32), (int) (it.a() & 4294967295L)));
                    return Unit.f24250a;
                }
            };
            composerImplV.A(objG4);
        }
        composerImplV.V(false);
        Modifier modifierA = OnGloballyPositionedModifierKt.a(modifier, (Function1) objG4);
        composerImplV.F(-3686930);
        boolean zN2 = composerImplV.n(mutableState);
        Object objG5 = composerImplV.G();
        if (zN2 || objG5 == obj) {
            objG5 = new Function1<DrawScope, Unit>() { // from class: nl.dionsegijn.konfetti.compose.KonfettiViewKt$KonfettiView$3$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    DrawScope Canvas = (DrawScope) obj2;
                    Intrinsics.h(Canvas, "$this$Canvas");
                    for (Particle particle : (Iterable) mutableState.getD()) {
                        CanvasDrawScope$drawContext$1 e = Canvas.getE();
                        long jD = e.d();
                        e.a().save();
                        CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = e.f1798a;
                        float f = particle.f;
                        float f2 = particle.b;
                        float f3 = 2;
                        float f4 = (particle.c / f3) + particle.f26634a;
                        canvasDrawScopeKt$asDrawTransform$1.d(OffsetKt.a(f4, (particle.d / f3) + f2), f);
                        canvasDrawScopeKt$asDrawTransform$1.e(OffsetKt.a(f4, f2), particle.g, 1.0f);
                        DrawShapesKt.a(particle.h, Canvas, particle);
                        e.a().m();
                        e.h(jD);
                    }
                    return Unit.f24250a;
                }
            };
            composerImplV.A(objG5);
        }
        composerImplV.V(false);
        CanvasKt.a(modifierA, (Function1) objG5, composerImplV, 0);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX == null) {
            return;
        }
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: nl.dionsegijn.konfetti.compose.KonfettiViewKt$KonfettiView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ((Number) obj3).intValue();
                int i2 = i | 1;
                KonfettiViewKt.a(modifier, list, confettiKt$Confetti$2, (Composer) obj2, i2);
                return Unit.f24250a;
            }
        };
    }
}
