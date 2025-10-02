package au.com.woolworths.foundation.rewards.common.ui;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WoolworthsColors;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "animatedScale", "animatedAlpha", "common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PulsingIndicatorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f8571a = 16;
    public static final float b = 8;

    public static final void a(final PulsingIndicatorColor pulsingIndicatorColor, final Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-989406240);
        if ((i & 6) == 0) {
            i3 = (composerImplV.r(pulsingIndicatorColor.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(1372902253, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.PulsingIndicatorKt$PulsingIndicator$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[PulsingIndicatorColor.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            PulsingIndicatorColor pulsingIndicatorColor = PulsingIndicatorColor.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long j;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierK = SizeKt.k(modifier, PulsingIndicatorKt.f8571a);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierK);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        int iOrdinal = pulsingIndicatorColor.ordinal();
                        if (iOrdinal == 0) {
                            j = RewardsColors.f5157a;
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            j = WoolworthsColors.f5164a;
                        }
                        long j2 = j;
                        InfiniteTransition infiniteTransitionC = InfiniteTransitionKt.c("Pulsing", composer2, 0);
                        CubicBezierEasing cubicBezierEasing = EasingKt.b;
                        InfiniteTransition.TransitionAnimationState transitionAnimationStateA = InfiniteTransitionKt.a(infiniteTransitionC, 0.5f, 1.0f, AnimationSpecKt.a(6, 0L, new TweenSpec(500, 600, cubicBezierEasing), null), "OuterCircleScale", composer2, 29112, 0);
                        InfiniteTransition.TransitionAnimationState transitionAnimationStateA2 = InfiniteTransitionKt.a(infiniteTransitionC, 0.75f, BitmapDescriptorFactory.HUE_RED, AnimationSpecKt.a(6, 0L, new TweenSpec(500, 600, cubicBezierEasing), null), "OuterCircleAlpha", composer2, 29112, 0);
                        FillElement fillElement = SizeKt.c;
                        composer2.o(-1633490746);
                        boolean zN = composer2.n(transitionAnimationStateA) | composer2.n(transitionAnimationStateA2);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new a(transitionAnimationStateA, transitionAnimationStateA2, 0);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierA = GraphicsLayerModifierKt.a(fillElement, (Function1) objG);
                        RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
                        Modifier modifierA2 = ClipKt.a(modifierA, roundedCornerShape);
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
                        BoxKt.a(BackgroundKt.b(modifierA2, j2, rectangleShapeKt$RectangleShape$1), composer2, 0);
                        BoxKt.a(SizeKt.k(BackgroundKt.b(ClipKt.a(Modifier.Companion.d, roundedCornerShape), j2, rectangleShapeKt$RectangleShape$1), PulsingIndicatorKt.b), composer2, 0);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.a(pulsingIndicatorColor, modifier2, i, i2, 9);
        }
    }
}
