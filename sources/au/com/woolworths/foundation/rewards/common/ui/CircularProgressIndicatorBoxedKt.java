package au.com.woolworths.foundation.rewards.common.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CircularProgressIndicatorBoxedKt {
    public static final void a(Modifier modifier, PaddingValues paddingValues, Alignment alignment, Composer composer, int i) {
        PaddingValues paddingValues2;
        Alignment alignment2;
        ComposerImpl composerImplV = composer.v(1104872964);
        if (((i | 432) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            paddingValues2 = paddingValues;
            alignment2 = alignment;
        } else {
            float f = 32;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
            Modifier modifierE = PaddingKt.e(modifier, paddingValuesImpl);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            Modifier.Companion companion = Modifier.Companion.d;
            BiasAlignment biasAlignment = Alignment.Companion.e;
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 28, WxTheme.a(composerImplV).h(), 0L, composerImplV, TestTagKt.a(boxScopeInstance.g(companion, biasAlignment), "LoadingSpinner"));
            composerImplV.V(true);
            paddingValues2 = paddingValuesImpl;
            alignment2 = biasAlignment;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(modifier, paddingValues2, alignment2, i, 9);
        }
    }
}
