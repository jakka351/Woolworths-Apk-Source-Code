package au.com.woolworths.shared.ui.compose.progressstepper;

import androidx.compose.animation.TransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.product.details.d;
import com.google.android.gms.common.ConnectionResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"", "isFirstTimeLoad", "Landroidx/compose/ui/unit/Dp;", "offsetAnimationValue", "Landroidx/compose/ui/graphics/Color;", "colorTransition", "shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProgressStepperBarKt {
    public static final void a(Modifier modifier, long j, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(2019100338);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            float f = 8;
            Modifier modifierA = ClipKt.a(modifier, RoundedCornerShapeKt.b(f));
            long j2 = ToneColors.i;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier modifierC = SizeKt.c(SizeKt.e(BackgroundKt.b(modifierA, j2, rectangleShapeKt$RectangleShape$1), 1.0f), 1.0f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierC);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            BoxKt.a(SizeKt.e(SizeKt.c(BackgroundKt.b(ClipKt.a(Modifier.Companion.d, RoundedCornerShapeKt.b(f)), ((Color) TransitionKt.a(InfiniteTransitionKt.c(null, composerImplV, 1), j, Color.i, AnimationSpecKt.a(4, 0L, AnimationSpecKt.e(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0, EasingKt.d, 2), RepeatMode.e), composerImplV, (i2 & 112) | 4488, 8).getD()).f1766a, rectangleShapeKt$RectangleShape$1), 1.0f), 1.0f), composerImplV, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.wpay.ui.common.component.a(modifier, j, i, 1, (byte) 0);
        }
    }

    public static final void b(Modifier modifier, final long j, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(2138149053);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if (((i2 | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            BoxWithConstraintsKt.a(SizeKt.c(SizeKt.e(BackgroundKt.b(ClipKt.a(modifier, RoundedCornerShapeKt.b(8)), ToneColors.i, RectangleShapeKt.f1779a), 1.0f), 1.0f), null, false, ComposableLambdaKt.c(1649017107, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepperBarKt$IndeterminateProgressStepperBar$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        InfiniteTransition infiniteTransitionC = InfiniteTransitionKt.c(null, composer2, 1);
                        Dp dp = new Dp(-BoxWithConstraints.f());
                        Dp dp2 = new Dp(BoxWithConstraints.f());
                        boolean z = true;
                        TwoWayConverter twoWayConverter = VectorConvertersKt.c;
                        composer2.o(5004770);
                        if ((iIntValue & 14) != 4) {
                            z = false;
                        }
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (z || objG == composer$Companion$Empty$1) {
                            objG = new d(BoxWithConstraints, 4);
                            composer2.A(objG);
                        }
                        composer2.l();
                        InfiniteTransition.TransitionAnimationState transitionAnimationStateB = InfiniteTransitionKt.b(infiniteTransitionC, dp, dp2, twoWayConverter, AnimationSpecKt.a(4, 0L, AnimationSpecKt.b((Function1) objG), RepeatMode.d), null, composer2, 32776, 16);
                        composer2.o(5004770);
                        boolean zN = composer2.n(transitionAnimationStateB);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == composer$Companion$Empty$1) {
                            objG2 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.d(transitionAnimationStateB, 4);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        BoxKt.a(SizeKt.e(SizeKt.c(BackgroundKt.b(ClipKt.a(OffsetKt.a(Modifier.Companion.d, (Function1) objG2), RoundedCornerShapeKt.b(8)), j, RectangleShapeKt.f1779a), 1.0f), 1.0f), composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3072, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.wpay.ui.common.component.a(modifier, j, i, 2, (byte) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.Modifier r19, long r20, final au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepType r22, boolean r23, kotlin.jvm.functions.Function0 r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepperBarKt.c(androidx.compose.ui.Modifier, long, au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepType, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
