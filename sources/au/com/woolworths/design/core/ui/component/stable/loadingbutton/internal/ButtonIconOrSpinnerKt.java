package au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.button.internal.ButtonIconKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ButtonIconOrSpinnerKt {
    public static final void a(boolean z, final ImageVector icon, final ButtonSpec.Size size, final long j, Composer composer, int i) {
        Intrinsics.h(icon, "icon");
        Intrinsics.h(size, "size");
        ComposerImpl composerImplV = composer.v(2073401943);
        int i2 = i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.n(icon) ? 32 : 16) | (composerImplV.r(size.ordinal()) ? 256 : 128) | (composerImplV.s(j) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierZ = SizeKt.z(Modifier.Companion.d, null, 3);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierZ);
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
            AnimatedVisibilityKt.d(!z, null, EnterExitTransitionKt.e(null, 3), EnterExitTransitionKt.f(null, 3), null, ComposableLambdaKt.c(-840240199, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.ButtonIconOrSpinnerKt$ButtonIconOrSpinner$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    ButtonIconKt.a(icon, size, null, (Composer) obj2, 0);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 200064, 18);
            AnimatedVisibilityKt.d(z, null, EnterExitTransitionKt.e(null, 3), EnterExitTransitionKt.f(null, 3), null, ComposableLambdaKt.c(1588934882, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.ButtonIconOrSpinnerKt$ButtonIconOrSpinner$1$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    long j2 = j;
                    ButtonLoadingSpinnerKt.a(size, j2, (Composer) obj2, 0);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 14) | 200064, 18);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(z, icon, size, j, i, 0);
        }
    }
}
