package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.SecureDollarsConfigKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"redemption-settings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SecureDollarsScreenKt {
    public static final void a(final SecureDollarsContract.ViewState viewState, final String str, final Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1982156725);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(viewState) : composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierH = PaddingKt.h(modifier, 32, BitmapDescriptorFactory.HUE_RED, 2);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
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
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-451736942, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.SecureDollarsScreenKt$ErrorScreen$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.secure_dollars_error_subtitle);
                        composer2.o(5004770);
                        SecureDollarsContract.ViewState viewState2 = viewState;
                        boolean zI = composer2.I(viewState2);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            objG = new f(viewState2, 7);
                            composer2.A(objG);
                        }
                        composer2.l();
                        FullPageMessageUiKt.a(FullPageMessageSpec.Companion.c(null, str, strC, null, (Function0) objG, composer2, 18), modifier, null, composer2, 0, 4);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(viewState, str, modifier, i, 6);
        }
    }

    public static final void b(SecureDollarsContract.ViewState viewState, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(745128224);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(viewState) : composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 24;
            Modifier modifierE = SizeKt.e(PaddingKt.h(modifier, f, BitmapDescriptorFactory.HUE_RED, 2), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            SpacerKt.c(columnScopeInstance, 84, composerImplV, 54);
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composerImplV, null);
            SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
            TextKt.b(SecureDollarsConfigKt.a(viewState.f6446a, viewState.c).f6469a, null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, 0, 0, 65022);
            composerImplV = composerImplV;
            SpacerKt.c(columnScopeInstance, 48, composerImplV, 54);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(viewState, i, 13, modifier);
        }
    }

    public static final void c(SecureDollarsContract.ViewState viewState, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        SecureDollarsContract.Content content = viewState.d;
        ComposerImpl composerImplV = composer.v(610237732);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else if (Intrinsics.c(content, SecureDollarsContract.Content.Loading.f6443a)) {
            composerImplV.o(-1972052192);
            b(viewState, modifier, composerImplV, i2 & 126);
            composerImplV.V(false);
        } else {
            if (!(content instanceof SecureDollarsContract.Content.Error)) {
                throw au.com.woolworths.android.onesite.a.w(-1972054282, composerImplV, false);
            }
            composerImplV.o(-1972047468);
            String str = ((SecureDollarsContract.Content.Error) content).f6442a;
            if (str == null) {
                str = SecureDollarsConfigKt.a(viewState.f6446a, viewState.c).b;
            }
            a(viewState, str, modifier, composerImplV, (i2 & 14) | KyberEngine.KyberPolyBytes);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(viewState, i, 25, modifier);
        }
    }
}
