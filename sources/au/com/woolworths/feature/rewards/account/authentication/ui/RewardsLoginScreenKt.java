package au.com.woolworths.feature.rewards.account.authentication.ui;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationFullPageMessageError;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModelNew;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState;", "viewState", "account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsLoginScreenKt {
    public static final void a(boolean z, RewardsAuthenticationFullPageMessageError rewardsAuthenticationFullPageMessageError, Function0 onErrorButton, Composer composer, int i) {
        ComposerImpl composerImpl;
        Function0 function0;
        FullPageMessageSpec fullPageMessageSpecE;
        int i2;
        int i3;
        FullPageMessageSpec fullPageMessageSpec;
        ComposerImpl composerImpl2;
        Intrinsics.h(onErrorButton, "onErrorButton");
        ComposerImpl composerImplV = composer.v(1139008310);
        if ((((composerImplV.n(rewardsAuthenticationFullPageMessageError) ? 32 : 16) | i | (composerImplV.I(onErrorButton) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function0 = onErrorButton;
            composerImpl2 = composerImplV;
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (rewardsAuthenticationFullPageMessageError instanceof RewardsAuthenticationFullPageMessageError.ConnectionError) {
                composerImplV.o(-1028881347);
                composerImpl = composerImplV;
                FullPageMessageSpec fullPageMessageSpecC = FullPageMessageSpec.Companion.c(null, StringResources_androidKt.c(composerImplV, R.string.no_network_heading), StringResources_androidKt.c(composerImplV, R.string.rewards_authentication_connection_error_message), null, onErrorButton, composerImpl, 19);
                composerImpl.V(false);
                fullPageMessageSpec = fullPageMessageSpecC;
                function0 = onErrorButton;
            } else {
                composerImpl = composerImplV;
                if (rewardsAuthenticationFullPageMessageError instanceof RewardsAuthenticationFullPageMessageError.ServerError) {
                    composerImpl.o(-1028869001);
                    fullPageMessageSpecE = FullPageMessageSpec.Companion.f(null, null, StringResources_androidKt.c(composerImpl, R.string.server_error_heading), StringResources_androidKt.c(composerImpl, R.string.rewards_authentication_server_error_message), null, onErrorButton, composerImpl, 19);
                    function0 = onErrorButton;
                    composerImpl = composerImpl;
                    composerImpl.V(false);
                } else {
                    function0 = onErrorButton;
                    if (rewardsAuthenticationFullPageMessageError instanceof RewardsAuthenticationFullPageMessageError.CustomError) {
                        composerImpl.o(-1028856608);
                        if (z) {
                            i2 = -1028853636;
                            i3 = R.string.rewards_signup_generic_error_title;
                        } else {
                            i2 = -1028851350;
                            i3 = R.string.rewards_login_generic_error_title;
                        }
                        fullPageMessageSpecE = FullPageMessageSpec.Companion.d(null, d.l(composerImpl, i2, i3, composerImpl, false), ((RewardsAuthenticationFullPageMessageError.CustomError) rewardsAuthenticationFullPageMessageError).f5664a.getText(context).toString(), StringResources_androidKt.c(composerImpl, R.string.try_again), function0);
                        composerImpl.V(false);
                    } else {
                        if (!(rewardsAuthenticationFullPageMessageError instanceof RewardsAuthenticationFullPageMessageError.UserBlockedError)) {
                            throw au.com.woolworths.android.onesite.a.w(-1028883357, composerImpl, false);
                        }
                        composerImpl.o(-1028836902);
                        fullPageMessageSpecE = FullPageMessageSpec.Companion.e(PainterResources_androidKt.a(2131231409, 0, composerImpl), StringResources_androidKt.c(composerImpl, R.string.rewards_login_blocked_error_title), StringResources_androidKt.c(composerImpl, R.string.rewards_login_blocked_error_message), StringResources_androidKt.c(composerImpl, R.string.rewards_login_contact_us_button_title), function0);
                        composerImpl.V(false);
                    }
                }
                fullPageMessageSpec = fullPageMessageSpecE;
            }
            ComposerImpl composerImpl3 = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpec, null, null, composerImpl3, 0, 6);
            composerImpl2 = composerImpl3;
            composerImpl2.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(z, rewardsAuthenticationFullPageMessageError, function0, i);
        }
    }

    public static final void b(Function0 function0, Composer composer, int i) {
        Function0 function02;
        ComposerImpl composerImplV = composer.v(-730691894);
        int i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
        } else {
            function02 = function0;
            AlertDialogKt.a(StringResources_androidKt.c(composerImplV, R.string.rewards_force_logout_message), StringResources_androidKt.c(composerImplV, android.R.string.ok), null, StringResources_androidKt.c(composerImplV, R.string.rewards_force_logout_title), null, null, function02, composerImplV, (i2 << 18) & 3670016, 52);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(i, 0, function02);
        }
    }

    public static final void c(Function0 onNavigateUp, Function0 onError, Function0 onSuccessfulLogin, Function0 onContactUs, Function3 onLaunchAuth0Form, Function0 onForceLogoutDialogDismiss, RewardsAuthenticationViewModelNew viewModel, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onError, "onError");
        Intrinsics.h(onSuccessfulLogin, "onSuccessfulLogin");
        Intrinsics.h(onContactUs, "onContactUs");
        Intrinsics.h(onLaunchAuth0Form, "onLaunchAuth0Form");
        Intrinsics.h(onForceLogoutDialogDismiss, "onForceLogoutDialogDismiss");
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(-1309543577);
        int i2 = i | (composerImplV.I(onNavigateUp) ? 4 : 2) | (composerImplV.I(onError) ? 32 : 16) | (composerImplV.I(onSuccessfulLogin) ? 256 : 128) | (composerImplV.I(onContactUs) ? 2048 : 1024) | (composerImplV.I(onLaunchAuth0Form) ? 16384 : 8192) | (composerImplV.I(onForceLogoutDialogDismiss) ? 131072 : 65536) | (composerImplV.I(viewModel) ? 1048576 : 524288);
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            MutableState mutableStateA = FlowExtKt.a(viewModel.i, composerImplV);
            Flow flow = viewModel.k;
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(viewModel) | ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                RewardsLoginScreenKt$RewardsLoginScreen$1$1 rewardsLoginScreenKt$RewardsLoginScreen$1$1 = new RewardsLoginScreenKt$RewardsLoginScreen$1$1(viewModel, onSuccessfulLogin, onLaunchAuth0Form, onContactUs, null);
                composerImplV.A(rewardsLoginScreenKt$RewardsLoginScreen$1$1);
                objG = rewardsLoginScreenKt$RewardsLoginScreen$1$1;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
            composerImpl = composerImplV;
            d((RewardsAuthenticationContractNew.ViewState) mutableStateA.getD(), onNavigateUp, onError, onForceLogoutDialogDismiss, composerImpl, ((i2 >> 6) & 7168) | ((i2 << 3) & 1008));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(onNavigateUp, onError, onSuccessfulLogin, onContactUs, onLaunchAuth0Form, onForceLogoutDialogDismiss, viewModel, i);
        }
    }

    public static final void d(final RewardsAuthenticationContractNew.ViewState viewState, final Function0 function0, final Function0 function02, final Function0 function03, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1021720584);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(viewState) : composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function03) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-228439356, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.authentication.ui.RewardsLoginScreenKt$RewardsLoginScreenUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.rewards_login_title);
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final Function0 function04 = function0;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(-606388462, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.authentication.ui.RewardsLoginScreenKt$RewardsLoginScreenUi$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function04, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 638);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-1910313253, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.authentication.ui.RewardsLoginScreenKt$RewardsLoginScreenUi$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, fillElement);
                        ComposeUiNode.e3.getClass();
                        Function0 function04 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function04);
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
                        RewardsAuthenticationContractNew.ViewState viewState2 = viewState;
                        if (viewState2 instanceof RewardsAuthenticationContractNew.ViewState.Loading) {
                            composer2.o(-1875966498);
                            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composer2, null);
                            composer2.l();
                        } else if (viewState2 instanceof RewardsAuthenticationContractNew.ViewState.ForcedLoggedOut) {
                            composer2.o(-1875815559);
                            RewardsLoginScreenKt.b(function03, composer2, 0);
                            composer2.l();
                        } else if (viewState2 instanceof RewardsAuthenticationContractNew.ViewState.Error) {
                            composer2.o(-1875605937);
                            RewardsLoginScreenKt.a(false, ((RewardsAuthenticationContractNew.ViewState.Error) viewState2).f5659a, function02, composer2, 6);
                            composer2.l();
                        } else {
                            composer2.o(-1875376072);
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(viewState, function0, function02, function03, i, 3);
        }
    }
}
