package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.google.android.gms.common.ConnectionResult;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "position", "account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LoadingPlaceholderItemUiKt {
    public static final void a(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(427367119);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            long jA = ColorResources_androidKt.a(composerImplV, R.color.animated_loading_view_background);
            long jA2 = ColorResources_androidKt.a(composerImplV, R.color.animated_loading_view_loader);
            InfiniteTransition.TransitionAnimationState transitionAnimationStateA = InfiniteTransitionKt.a(InfiniteTransitionKt.c("infinite", composerImplV, 0), -0.5f, 1.0f, AnimationSpecKt.a(4, 0L, AnimationSpecKt.e(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0, EasingKt.b, 2), RepeatMode.d), "loading", composerImplV, 29064, 0);
            composerImplV.o(5004770);
            boolean zS = composerImplV.s(jA);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zS || objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.product.list.compose.filter.e(jA, 3);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierC = DrawModifierKt.c(modifier, (Function1) objG);
            composerImplV.o(-1633490746);
            boolean zN = composerImplV.n(transitionAnimationStateA) | composerImplV.s(jA2);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                objG2 = new e(jA2, transitionAnimationStateA);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            CanvasKt.a(modifierC, (Function1) objG2, composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 12, modifier);
        }
    }

    public static final void b(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        ComposerImpl composerImplV = composer.v(477560086);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            if (i4 != 0) {
                modifier = companion;
            }
            Modifier modifierG = PaddingKt.g(modifier, 16, 12);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            a(SizeKt.g(SizeKt.e(companion, 1.0f), 20), composerImplV, 6);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(modifier, i, i2, 0);
        }
    }
}
