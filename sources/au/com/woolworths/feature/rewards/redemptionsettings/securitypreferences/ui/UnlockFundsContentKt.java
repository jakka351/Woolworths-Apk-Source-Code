package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shared.ui.compose.rewards.ContentCtaButtonKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"redemption-settings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class UnlockFundsContentKt {
    public static final void a(Function1 onPrimaryCtaClick, Function1 onSecondaryCtaClick, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(null, "data");
        Intrinsics.h(onPrimaryCtaClick, "onPrimaryCtaClick");
        Intrinsics.h(onSecondaryCtaClick, "onSecondaryCtaClick");
        ComposerImpl composerImplV = composer.v(-61475098);
        if (((i | (composerImplV.I(null) ? 4 : 2)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
            if (recomposeScopeImplX != null) {
                recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(onPrimaryCtaClick, onSecondaryCtaClick, modifier, i, 11);
                return;
            }
            return;
        }
        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
        int i2 = composerImplV.P;
        PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
        Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
        ComposeUiNode.e3.getClass();
        Function0 function0 = ComposeUiNode.Companion.b;
        composerImplV.i();
        if (composerImplV.O) {
            composerImplV.K(function0);
        } else {
            composerImplV.e();
        }
        Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
        Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
        Function2 function2 = ComposeUiNode.Companion.j;
        if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
            androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
        }
        Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
        composerImplV.o(782532593);
        composerImplV.V(false);
        TextKt.b(null, null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, 0, 0, 65022);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
        SpacerKt.c(columnScopeInstance, 8, composerImplV, 54);
        TextKt.b(null, null, WxTheme.a(composerImplV).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65018);
        SpacerKt.c(columnScopeInstance, 24, composerImplV, 54);
        ContentCtaButtonKt.c(null, onPrimaryCtaClick, null, false, composerImplV, 48, 12);
        throw null;
    }
}
