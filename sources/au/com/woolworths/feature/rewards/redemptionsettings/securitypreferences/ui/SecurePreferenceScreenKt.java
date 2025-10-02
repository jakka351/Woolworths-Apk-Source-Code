package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.RewardsSecurePreference;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.RewardsSecurePreferenceLoadingState;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"redemption-settings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SecurePreferenceScreenKt {
    public static final void a(String str, String str2, Composer composer, int i) {
        int i2;
        float f;
        ColumnScopeInstance columnScopeInstance;
        String str3;
        boolean z;
        ComposerImpl composerImplV = composer.v(-1658378488);
        if ((i & 48) == 0) {
            i2 = (composerImplV.n(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            str3 = str2;
        } else {
            float f2 = 24;
            Modifier modifierH = PaddingKt.h(BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e), f2, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composerImplV, null);
            composerImplV.o(-1422480316);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f948a;
            if (str == null) {
                columnScopeInstance = columnScopeInstance2;
                f = f2;
            } else {
                SpacerKt.c(columnScopeInstance2, f2, composerImplV, 54);
                f = f2;
                columnScopeInstance = columnScopeInstance2;
                TextKt.b(str, null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, 0, 0, 65022);
                composerImplV = composerImplV;
            }
            composerImplV.V(false);
            composerImplV.o(-1422472967);
            if (str2 == null) {
                z = false;
                str3 = str2;
            } else {
                SpacerKt.c(columnScopeInstance, str == null ? f : 8, composerImplV, 6);
                ComposerImpl composerImpl = composerImplV;
                str3 = str2;
                TextKt.b(str3, null, WxTheme.a(composerImplV).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImpl, 0, 0, 65018);
                composerImplV = composerImpl;
                z = false;
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(str, str3, i, 0);
        }
    }

    public static final void b(final SecurityPreferencesContract.ViewState viewState, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(viewState, "viewState");
        ComposerImpl composerImplV = composer.v(-1945369262);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SecurityPreferencesContract.Content content = viewState.f6459a;
            boolean z = content instanceof SecurityPreferencesContract.Content.Preference;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(-545948655);
                RewardsSecurePreference rewardsSecurePreference = ((SecurityPreferencesContract.Content.Preference) content).f6454a;
                composerImplV.o(5004770);
                boolean z2 = (i2 & 14) == 4;
                Object objG = composerImplV.G();
                if (z2 || objG == composer$Companion$Empty$1) {
                    objG = new l(viewState, 8);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                SecurePreferenceUIKt.b(rewardsSecurePreference, false, (Function1) objG, null, composerImplV, 48);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else {
                if (content instanceof SecurityPreferencesContract.Content.Loading) {
                    composerImplV.o(-545580468);
                    a(null, null, composerImplV, 438);
                    composerImplV.V(false);
                } else if (content instanceof SecurityPreferencesContract.Content.Changing) {
                    composerImplV.o(-545390066);
                    RewardsSecurePreferenceLoadingState rewardsSecurePreferenceLoadingState = ((SecurityPreferencesContract.Content.Changing) content).f6451a;
                    a(rewardsSecurePreferenceLoadingState != null ? rewardsSecurePreferenceLoadingState.f6466a : null, rewardsSecurePreferenceLoadingState != null ? rewardsSecurePreferenceLoadingState.b : null, composerImplV, 6);
                    composerImplV.V(false);
                } else if (content instanceof SecurityPreferencesContract.Content.NoConnection) {
                    composerImplV.o(-545159395);
                    String strC = StringResources_androidKt.c(composerImplV, R.string.rewards_redemption_security_connection_error);
                    composerImplV.o(5004770);
                    boolean z3 = (i2 & 14) == 4;
                    Object objG2 = composerImplV.G();
                    if (z3 || objG2 == composer$Companion$Empty$1) {
                        final int i4 = 0;
                        objG2 = new Function0() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        viewState.d.invoke(SecurityPreferencesContract.ViewModelAction.RetryFetch.f6458a);
                                        break;
                                    default:
                                        viewState.d.invoke(SecurityPreferencesContract.ViewModelAction.RetryFetch.f6458a);
                                        break;
                                }
                                return Unit.f24250a;
                            }
                        };
                        composerImplV.A(objG2);
                    }
                    composerImplV.V(false);
                    FullPageMessageSpec fullPageMessageSpecC = FullPageMessageSpec.Companion.c(null, null, strC, null, (Function0) objG2, composerImplV, 23);
                    composerImplV = composerImplV;
                    FullPageMessageUiKt.a(fullPageMessageSpecC, null, null, composerImplV, 0, 6);
                    composerImplV.V(false);
                } else if (content instanceof SecurityPreferencesContract.Content.ServerError) {
                    composerImplV.o(-544698363);
                    String strC2 = StringResources_androidKt.c(composerImplV, R.string.rewards_redemption_security_server_error);
                    composerImplV.o(5004770);
                    boolean z4 = (i2 & 14) == 4;
                    Object objG3 = composerImplV.G();
                    if (z4 || objG3 == composer$Companion$Empty$1) {
                        final int i5 = 1;
                        objG3 = new Function0() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        viewState.d.invoke(SecurityPreferencesContract.ViewModelAction.RetryFetch.f6458a);
                                        break;
                                    default:
                                        viewState.d.invoke(SecurityPreferencesContract.ViewModelAction.RetryFetch.f6458a);
                                        break;
                                }
                                return Unit.f24250a;
                            }
                        };
                        composerImplV.A(objG3);
                    }
                    composerImplV.V(false);
                    FullPageMessageSpec fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, strC2, null, (Function0) objG3, composerImplV, 23);
                    composerImplV = composerImplV;
                    FullPageMessageUiKt.a(fullPageMessageSpecF, null, null, composerImplV, 0, 6);
                    composerImplV.V(false);
                } else {
                    if (!(content instanceof SecurityPreferencesContract.Content.UpdateError)) {
                        throw au.com.woolworths.android.onesite.a.w(-17612570, composerImplV, false);
                    }
                    composerImplV.o(-544239997);
                    String strC3 = StringResources_androidKt.c(composerImplV, R.string.rewards_redemption_security_update_title);
                    String strC4 = StringResources_androidKt.c(composerImplV, R.string.rewards_redemption_security_update_message);
                    composerImplV.o(-1633490746);
                    boolean zI = ((i2 & 14) == 4) | composerImplV.I(content);
                    Object objG4 = composerImplV.G();
                    if (zI || objG4 == composer$Companion$Empty$1) {
                        objG4 = new au.com.woolworths.feature.rewards.card.overlay.ui.b(16, viewState, content);
                        composerImplV.A(objG4);
                    }
                    composerImplV.V(false);
                    FullPageMessageSpec fullPageMessageSpecC2 = FullPageMessageSpec.Companion.c(null, strC3, strC4, null, (Function0) objG4, composerImplV, 18);
                    composerImplV = composerImplV;
                    FullPageMessageUiKt.a(fullPageMessageSpecC2, null, null, composerImplV, 0, 6);
                    composerImplV.V(false);
                }
            }
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(viewState, i, 26, modifier);
        }
    }
}
