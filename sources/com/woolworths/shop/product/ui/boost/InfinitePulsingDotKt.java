package com.woolworths.shop.product.ui.boost;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "outerCircleRadius", "outerCircleOpacity", "product-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InfinitePulsingDotKt {
    public static final void a(Modifier modifier, long j, Composer composer, int i) {
        long j2;
        Modifier modifier2;
        Modifier modifier3;
        long j3;
        ComposerImpl composerImplV = composer.v(-68575439);
        if (((i | 22) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            j3 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                j2 = CoreTheme.d(composerImplV).f4872a.f;
                modifier2 = Modifier.Companion.d;
            } else {
                composerImplV.j();
                modifier2 = modifier;
                j2 = j;
            }
            composerImplV.W();
            final long j4 = CoreTheme.b(composerImplV).e.c.f4854a;
            final long j5 = CoreTheme.d(composerImplV).f4872a.g;
            final Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            InfiniteTransition infiniteTransitionC = InfiniteTransitionKt.c("infinite_pulsing_circle", composerImplV, 0);
            final long j6 = j2;
            final InfiniteTransition.TransitionAnimationState transitionAnimationStateA = InfiniteTransitionKt.a(infiniteTransitionC, density.T1(4), density.T1(8), AnimationSpecKt.a(6, 0L, AnimationSpecKt.e(1000, nlnlnnn.xxx00780078x0078, null, 4), null), "outerCircleRadius", composerImplV, 28680, 0);
            final InfiniteTransition.TransitionAnimationState transitionAnimationStateA2 = InfiniteTransitionKt.a(infiniteTransitionC, 0.8f, BitmapDescriptorFactory.HUE_RED, AnimationSpecKt.a(6, 0L, AnimationSpecKt.e(1000, nlnlnnn.xxx00780078x0078, null, 4), null), "outerCircleOpacity", composerImplV, 29112, 0);
            final Modifier modifier4 = modifier2;
            SurfaceKt.b(SizeKt.q(modifier2, 16), null, 0L, 0L, null, null, ComposableLambdaKt.c(-1444737931, new Function2<Composer, Integer, Unit>() { // from class: com.woolworths.shop.product.ui.boost.InfinitePulsingDotKt$InfinitePulsingDot$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierB = BackgroundKt.b(modifier4, j6, RectangleShapeKt.f1779a);
                        composer2.o(-1224400529);
                        boolean zS = composer2.s(j5) | composer2.n(transitionAnimationStateA2) | composer2.n(transitionAnimationStateA) | composer2.s(j4);
                        final Density density2 = density;
                        boolean zN = zS | composer2.n(density2);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            final long j7 = j5;
                            final long j8 = j4;
                            final State state = transitionAnimationStateA2;
                            final State state2 = transitionAnimationStateA;
                            objG = new Function1() { // from class: com.woolworths.shop.product.ui.boost.a
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    DrawScope Canvas = (DrawScope) obj3;
                                    Intrinsics.h(Canvas, "$this$Canvas");
                                    DrawScope.j0(Canvas, Color.b(j7, ((Number) state.getD()).floatValue()), ((Number) state2.getD()).floatValue(), 0L, null, 0, 124);
                                    DrawScope.j0(Canvas, j8, density2.T1(4), 0L, null, 0, 124);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG);
                        }
                        composer2.l();
                        CanvasKt.a(modifierB, (Function1) objG, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 62);
            composerImplV = composerImplV;
            modifier3 = modifier2;
            j3 = j6;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.wx.component.icon.a(modifier3, j3, i, 1);
        }
    }
}
