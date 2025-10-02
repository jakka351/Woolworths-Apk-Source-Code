package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProgressIndicatorKt$LinearProgressIndicator$8 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;
    public final /* synthetic */ float l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$8(float f, int i, int i2, int i3, long j, long j2, Modifier modifier) {
        super(2);
        this.h = modifier;
        this.i = j;
        this.j = j2;
        this.k = i;
        this.l = f;
        this.m = i2;
        this.n = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        final int i3;
        int i4;
        final long j;
        float f;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.m | 1);
        float f2 = ProgressIndicatorKt.f1473a;
        ComposerImpl composerImplV = ((Composer) obj).v(567589233);
        int i5 = iA & 6;
        Modifier modifier = this.h;
        if (i5 == 0) {
            i = (composerImplV.n(modifier) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i6 = iA & 48;
        long j2 = this.i;
        if (i6 == 0) {
            i |= composerImplV.s(j2) ? 32 : 16;
        }
        int i7 = iA & KyberEngine.KyberPolyBytes;
        long j3 = this.j;
        if (i7 == 0) {
            i |= composerImplV.s(j3) ? 256 : 128;
        }
        int i8 = iA & 3072;
        int i9 = this.k;
        if (i8 == 0) {
            i |= composerImplV.r(i9) ? 2048 : 1024;
        }
        int i10 = this.n;
        int i11 = i10 & 16;
        float f3 = this.l;
        final long j4 = j3;
        if (i11 != 0) {
            i |= 24576;
        } else if ((iA & 24576) == 0) {
            i |= composerImplV.q(f3) ? 16384 : 8192;
        }
        if ((i & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            i2 = i10;
            j = j2;
            i4 = iA;
            f = f3;
            i3 = i9;
        } else {
            composerImplV.u0();
            if ((iA & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            } else if (i11 != 0) {
                f3 = ProgressIndicatorDefaults.c;
            }
            final float f4 = f3;
            composerImplV.W();
            InfiniteTransition infiniteTransitionC = InfiniteTransitionKt.c(null, composerImplV, 1);
            i2 = i10;
            i3 = i9;
            i4 = iA;
            final InfiniteTransition.TransitionAnimationState transitionAnimationStateA = InfiniteTransitionKt.a(infiniteTransitionC, BitmapDescriptorFactory.HUE_RED, 1.0f, AnimationSpecKt.a(6, 0L, AnimationSpecKt.b(ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1.h), null), null, composerImplV, 4536, 8);
            final InfiniteTransition.TransitionAnimationState transitionAnimationStateA2 = InfiniteTransitionKt.a(infiniteTransitionC, BitmapDescriptorFactory.HUE_RED, 1.0f, AnimationSpecKt.a(6, 0L, AnimationSpecKt.b(ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1.h), null), null, composerImplV, 4536, 8);
            final InfiniteTransition.TransitionAnimationState transitionAnimationStateA3 = InfiniteTransitionKt.a(infiniteTransitionC, BitmapDescriptorFactory.HUE_RED, 1.0f, AnimationSpecKt.a(6, 0L, AnimationSpecKt.b(ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1.h), null), null, composerImplV, 4536, 8);
            final InfiniteTransition.TransitionAnimationState transitionAnimationStateA4 = InfiniteTransitionKt.a(infiniteTransitionC, BitmapDescriptorFactory.HUE_RED, 1.0f, AnimationSpecKt.a(6, 0L, AnimationSpecKt.b(ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1.h), null), null, composerImplV, 4536, 8);
            Modifier modifierR = SizeKt.r(ProgressSemanticsKt.a(modifier.x0(ProgressIndicatorKt.b)), ProgressIndicatorKt.c, ProgressIndicatorKt.d);
            boolean zN = ((i & 7168) == 2048) | ((57344 & i) == 16384) | composerImplV.n(transitionAnimationStateA) | ((((i & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composerImplV.s(j4)) || (i & KyberEngine.KyberPolyBytes) == 256) | composerImplV.n(transitionAnimationStateA2) | ((((i & 112) ^ 48) > 32 && composerImplV.s(j2)) || (i & 48) == 32) | composerImplV.n(transitionAnimationStateA3) | composerImplV.n(transitionAnimationStateA4);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                j4 = j4;
                j = j2;
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        DrawScope drawScope = (DrawScope) obj3;
                        float fB = Size.b(drawScope.h());
                        int i12 = i3;
                        float fC = f4;
                        if (i12 != 0 && Size.b(drawScope.h()) <= Size.d(drawScope.h())) {
                            fC += drawScope.C(fB);
                        }
                        float fC2 = fC / drawScope.C(Size.d(drawScope.h()));
                        State state = transitionAnimationStateA;
                        if (((Number) state.getD()).floatValue() < 1.0f - fC2) {
                            ProgressIndicatorKt.d(drawScope, ((Number) state.getD()).floatValue() > BitmapDescriptorFactory.HUE_RED ? ((Number) state.getD()).floatValue() + fC2 : 0.0f, 1.0f, j4, fB, i3);
                        }
                        float fFloatValue = ((Number) state.getD()).floatValue();
                        State state2 = transitionAnimationStateA2;
                        if (fFloatValue - ((Number) state2.getD()).floatValue() > BitmapDescriptorFactory.HUE_RED) {
                            ProgressIndicatorKt.d(drawScope, ((Number) state.getD()).floatValue(), ((Number) state2.getD()).floatValue(), j, fB, i3);
                        }
                        float fFloatValue2 = ((Number) state2.getD()).floatValue();
                        State state3 = transitionAnimationStateA3;
                        if (fFloatValue2 > fC2) {
                            ProgressIndicatorKt.d(drawScope, ((Number) state3.getD()).floatValue() > BitmapDescriptorFactory.HUE_RED ? ((Number) state3.getD()).floatValue() + fC2 : 0.0f, ((Number) state2.getD()).floatValue() < 1.0f ? ((Number) state2.getD()).floatValue() - fC2 : 1.0f, j4, fB, i3);
                        }
                        float fFloatValue3 = ((Number) state3.getD()).floatValue();
                        State state4 = transitionAnimationStateA4;
                        if (fFloatValue3 - ((Number) state4.getD()).floatValue() > BitmapDescriptorFactory.HUE_RED) {
                            ProgressIndicatorKt.d(drawScope, ((Number) state3.getD()).floatValue(), ((Number) state4.getD()).floatValue(), j, fB, i3);
                        }
                        if (((Number) state4.getD()).floatValue() > fC2) {
                            ProgressIndicatorKt.d(drawScope, BitmapDescriptorFactory.HUE_RED, ((Number) state4.getD()).floatValue() < 1.0f ? ((Number) state4.getD()).floatValue() - fC2 : 1.0f, j4, fB, i3);
                        }
                        return Unit.f24250a;
                    }
                };
                i3 = i3;
                composerImplV.A(function1);
                objG = function1;
            } else {
                j = j2;
                j4 = j4;
            }
            CanvasKt.a(modifierR, (Function1) objG, composerImplV, 0);
            f = f4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new ProgressIndicatorKt$LinearProgressIndicator$8(f, i3, i4, i2, j, j4, modifier);
        }
        return Unit.f24250a;
    }
}
