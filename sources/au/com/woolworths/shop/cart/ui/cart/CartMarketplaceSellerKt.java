package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartMarketplaceSellerKt {
    public static final void a(String str, String str2, Composer composer, int i) {
        String str3;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-720858589);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            str3 = str2;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            float f2 = 8;
            Modifier modifierI = PaddingKt.i(BackgroundKt.b(SizeKt.e(companion, 1.0f), WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a), f, f, f2, f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierI);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            TextKt.b(str, rowScopeInstance.a(companion, 0.35f, true), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).s, composerImplV, i2 & 14, 0, 65532);
            SpacerKt.d(rowScopeInstance, f2, composerImplV, 54);
            str3 = str2;
            TextKt.b(str3, rowScopeInstance.a(companion, 0.65f, true), ToneColors.f, 0L, null, 0L, null, new TextAlign(6), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).s, composerImplV, (i2 >> 3) & 14, 0, 65016);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.preferences.g(str, str3, i, 3);
        }
    }
}
