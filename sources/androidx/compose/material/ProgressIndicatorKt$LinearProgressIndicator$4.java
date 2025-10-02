package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProgressIndicatorKt$LinearProgressIndicator$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$4(Modifier modifier, long j, long j2, int i) {
        super(2);
        this.h = modifier;
        this.i = j;
        this.j = j2;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ComposerImpl composerImpl;
        final long j;
        int i2;
        long j2;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.k | 1);
        float f = ProgressIndicatorKt.f1310a;
        ComposerImpl composerImplV = ((Composer) obj).v(1501635280);
        int i3 = iA & 6;
        Modifier modifier = this.h;
        if (i3 == 0) {
            i = (composerImplV.n(modifier) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i4 = iA & 48;
        long j3 = this.i;
        if (i4 == 0) {
            i |= composerImplV.s(j3) ? 32 : 16;
        }
        int i5 = iA & KyberEngine.KyberPolyBytes;
        final long j4 = this.j;
        if (i5 == 0) {
            i |= composerImplV.s(j4) ? 256 : 128;
        }
        if ((iA & 3072) == 0) {
            i |= composerImplV.r(0) ? 2048 : 1024;
        }
        if (composerImplV.z(i & 1, (i & 1171) != 1170)) {
            composerImplV.u0();
            if ((iA & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            InfiniteTransition infiniteTransitionC = InfiniteTransitionKt.c(null, composerImplV, 1);
            i2 = iA;
            final InfiniteTransition.TransitionAnimationState transitionAnimationStateA = InfiniteTransitionKt.a(infiniteTransitionC, BitmapDescriptorFactory.HUE_RED, 1.0f, AnimationSpecKt.a(6, 0L, AnimationSpecKt.b(ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2.h), null), null, composerImplV, 4536, 8);
            final InfiniteTransition.TransitionAnimationState transitionAnimationStateA2 = InfiniteTransitionKt.a(infiniteTransitionC, BitmapDescriptorFactory.HUE_RED, 1.0f, AnimationSpecKt.a(6, 0L, AnimationSpecKt.b(ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2.h), null), null, composerImplV, 4536, 8);
            final InfiniteTransition.TransitionAnimationState transitionAnimationStateA3 = InfiniteTransitionKt.a(infiniteTransitionC, BitmapDescriptorFactory.HUE_RED, 1.0f, AnimationSpecKt.a(6, 0L, AnimationSpecKt.b(ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2.h), null), null, composerImplV, 4536, 8);
            final InfiniteTransition.TransitionAnimationState transitionAnimationStateA4 = InfiniteTransitionKt.a(infiniteTransitionC, BitmapDescriptorFactory.HUE_RED, 1.0f, AnimationSpecKt.a(6, 0L, AnimationSpecKt.b(ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2.h), null), null, composerImplV, 4536, 8);
            composerImpl = composerImplV;
            float f2 = 10;
            Modifier modifierR = SizeKt.r(ProgressSemanticsKt.a(PaddingKt.h(SemanticsModifierKt.b(LayoutModifierKt.a(modifier, new ProgressIndicatorKt$increaseSemanticsBounds$1(f2)), true, ProgressIndicatorKt$increaseSemanticsBounds$2.h), BitmapDescriptorFactory.HUE_RED, f2, 1)), ProgressIndicatorKt.b, ProgressIndicatorKt.f1310a);
            boolean zN = ((((i & 7168) ^ 3072) > 2048 && composerImpl.r(0)) || (i & 3072) == 2048) | ((((i & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composerImpl.s(j4)) || (i & KyberEngine.KyberPolyBytes) == 256) | composerImpl.n(transitionAnimationStateA) | composerImpl.n(transitionAnimationStateA2) | ((((i & 112) ^ 48) > 32 && composerImpl.s(j3)) || (i & 48) == 32) | composerImpl.n(transitionAnimationStateA3) | composerImpl.n(transitionAnimationStateA4);
            Object objG = composerImpl.G();
            if (zN || objG == Composer.Companion.f1624a) {
                j = j3;
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        DrawScope drawScope = (DrawScope) obj3;
                        float fB = Size.b(drawScope.h());
                        ProgressIndicatorKt.e(drawScope, BitmapDescriptorFactory.HUE_RED, 1.0f, j4, fB, 0);
                        State state = transitionAnimationStateA;
                        float fFloatValue = ((Number) state.getD()).floatValue();
                        State state2 = transitionAnimationStateA2;
                        if (fFloatValue - ((Number) state2.getD()).floatValue() > BitmapDescriptorFactory.HUE_RED) {
                            ProgressIndicatorKt.e(drawScope, ((Number) state.getD()).floatValue(), ((Number) state2.getD()).floatValue(), j, fB, 0);
                        }
                        State state3 = transitionAnimationStateA3;
                        float fFloatValue2 = ((Number) state3.getD()).floatValue();
                        State state4 = transitionAnimationStateA4;
                        if (fFloatValue2 - ((Number) state4.getD()).floatValue() > BitmapDescriptorFactory.HUE_RED) {
                            ProgressIndicatorKt.e(drawScope, ((Number) state3.getD()).floatValue(), ((Number) state4.getD()).floatValue(), j, fB, 0);
                        }
                        return Unit.f24250a;
                    }
                };
                j2 = j4;
                composerImpl.A(function1);
                objG = function1;
            } else {
                j2 = j4;
                j = j3;
            }
            CanvasKt.a(modifierR, (Function1) objG, composerImpl, 0);
        } else {
            composerImpl = composerImplV;
            j = j3;
            i2 = iA;
            j2 = j4;
            composerImpl.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new ProgressIndicatorKt$LinearProgressIndicator$4(modifier, j, j2, i2);
        }
        return Unit.f24250a;
    }
}
