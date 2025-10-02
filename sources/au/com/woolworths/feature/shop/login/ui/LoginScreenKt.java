package au.com.woolworths.feature.shop.login.ui;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.navigation.internal.c;
import au.com.woolworths.design.core.ui.component.stable.button.internal.d;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.feature.shop.login.ConnectionErrorState;
import au.com.woolworths.feature.shop.login.LoginContract;
import au.com.woolworths.feature.shop.login.LoginErrorState;
import au.com.woolworths.feature.shop.login.LoginFullPageErrorState;
import au.com.woolworths.feature.shop.login.LoginViewModel;
import au.com.woolworths.feature.shop.login.ServerErrorState;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/LoginContract$ViewState;", "viewState", "login_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LoginScreenKt {
    public static final void a(LoginFullPageErrorState loginFullPageErrorState, Function0 function0, Function2 function2, Composer composer, int i) {
        int i2;
        Context context;
        LifecycleOwner lifecycleOwner;
        ComposerImpl composerImpl;
        FullPageMessageSpec fullPageMessageSpec;
        FullPageMessageSpec fullPageMessageSpecD;
        ComposerImpl composerImplV = composer.v(-1282468707);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(loginFullPageErrorState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Context context2 = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 14) == 4) | ((i2 & 896) == 256) | composerImplV.I(context2) | composerImplV.I(lifecycleOwner2);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                context = context2;
                lifecycleOwner = lifecycleOwner2;
                c cVar = new c(lifecycleOwner, function2, loginFullPageErrorState, context, 4);
                composerImplV.A(cVar);
                objG = cVar;
            } else {
                context = context2;
                lifecycleOwner = lifecycleOwner2;
            }
            composerImplV.V(false);
            EffectsKt.c(lifecycleOwner, (Function1) objG, composerImplV);
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
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
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (loginFullPageErrorState instanceof ConnectionErrorState) {
                composerImplV.o(-1696087853);
                ConnectionErrorState connectionErrorState = (ConnectionErrorState) loginFullPageErrorState;
                fullPageMessageSpecD = FullPageMessageSpec.Companion.b(connectionErrorState.getD().getText(context).toString(), connectionErrorState.getE().getText(context).toString(), function0, composerImplV, 3);
                composerImplV.V(false);
            } else {
                if (loginFullPageErrorState instanceof LoginErrorState) {
                    composerImplV.o(-1696077791);
                    LoginErrorState loginErrorState = (LoginErrorState) loginFullPageErrorState;
                    fullPageMessageSpecD = FullPageMessageSpec.Companion.d(null, loginErrorState.getD().getText(context).toString(), loginErrorState.getE().getText(context).toString(), StringResources_androidKt.c(composerImplV, R.string.try_again_button_text), function0);
                    composerImplV.V(false);
                } else {
                    if (!(loginFullPageErrorState instanceof ServerErrorState)) {
                        composerImplV.o(-1696089350);
                        composerImplV.V(false);
                        throw new NoWhenBranchMatchedException();
                    }
                    composerImplV.o(-1696064223);
                    ServerErrorState serverErrorState = (ServerErrorState) loginFullPageErrorState;
                    String string = serverErrorState.getD().getText(context).toString();
                    String string2 = serverErrorState.getE().getText(context).toString();
                    composerImplV.o(-1696057825);
                    String strC = Intrinsics.c(serverErrorState.getE(), Boolean.TRUE) ? StringResources_androidKt.c(composerImplV, R.string.try_again) : null;
                    composerImplV.V(false);
                    FullPageMessageSpec fullPageMessageSpecE = FullPageMessageSpec.Companion.e(null, string, string2, strC, function0, composerImplV, 3);
                    composerImpl = composerImplV;
                    composerImpl.V(false);
                    fullPageMessageSpec = fullPageMessageSpecE;
                    FullPageMessageUiKt.a(fullPageMessageSpec, null, null, composerImpl, 0, 6);
                    composerImpl.V(true);
                }
            }
            fullPageMessageSpec = fullPageMessageSpecD;
            composerImpl = composerImplV;
            FullPageMessageUiKt.a(fullPageMessageSpec, null, null, composerImpl, 0, 6);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(loginFullPageErrorState, function0, function2, i, 19);
        }
    }

    public static final void b(final Function0 onNavigateUp, final Function0 onErrorTryAgain, Function0 onCloseLogin, Function0 onLaunchPickUpLocator, Function0 onLaunchAddressPickerAndCloseLogin, Function0 onSignUpClicked, LoginViewModel viewModel, Composer composer, int i) {
        final LoginViewModel loginViewModel;
        Flow flow;
        ComposerImpl composerImpl;
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onErrorTryAgain, "onErrorTryAgain");
        Intrinsics.h(onCloseLogin, "onCloseLogin");
        Intrinsics.h(onLaunchPickUpLocator, "onLaunchPickUpLocator");
        Intrinsics.h(onLaunchAddressPickerAndCloseLogin, "onLaunchAddressPickerAndCloseLogin");
        Intrinsics.h(onSignUpClicked, "onSignUpClicked");
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(-155839687);
        int i2 = i | (composerImplV.I(onNavigateUp) ? 4 : 2) | (composerImplV.I(onErrorTryAgain) ? 32 : 16) | (composerImplV.I(onCloseLogin) ? 256 : 128) | (composerImplV.I(onLaunchPickUpLocator) ? 2048 : 1024) | (composerImplV.I(onLaunchAddressPickerAndCloseLogin) ? 16384 : 8192) | (composerImplV.I(onSignUpClicked) ? 131072 : 65536) | (composerImplV.I(viewModel) ? 1048576 : 524288);
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
            loginViewModel = viewModel;
            composerImpl = composerImplV;
        } else {
            final MutableState mutableStateA = FlowExtKt.a(viewModel.n, composerImplV);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            Flow flow2 = viewModel.p;
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(viewModel) | ((i2 & 7168) == 2048) | ((458752 & i2) == 131072) | ((i2 & 57344) == 16384);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                loginViewModel = viewModel;
                flow = flow2;
                LoginScreenKt$LoginScreen$1$1 loginScreenKt$LoginScreen$1$1 = new LoginScreenKt$LoginScreen$1$1(loginViewModel, onCloseLogin, onLaunchPickUpLocator, onSignUpClicked, onLaunchAddressPickerAndCloseLogin, null);
                composerImplV.A(loginScreenKt$LoginScreen$1$1);
                objG = loginScreenKt$LoginScreen$1$1;
            } else {
                loginViewModel = viewModel;
                flow = flow2;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(loginViewModel) | composerImplV.I(lifecycleOwner);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new d(2, lifecycleOwner, loginViewModel);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.c(lifecycleOwner, (Function1) objG2, composerImplV);
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(-186396866, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.login.ui.LoginScreenKt$LoginScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function0 = onNavigateUp;
                        TopNavBarKt.b(StringResources_androidKt.c(composer2, R.string.login_title), null, null, null, 0L, 0L, 0L, null, 0, ComposableLambdaKt.c(1087636559, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.login.ui.LoginScreenKt$LoginScreen$3.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 905969664, 0, 1278);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-532960336, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.login.ui.LoginScreenKt$LoginScreen$4
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
                        State state = mutableStateA;
                        if (((LoginContract.ViewState) state.getD()).f7451a) {
                            composer2.o(1022164489);
                            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composer2, null);
                            composer2.l();
                        } else if (((LoginContract.ViewState) state.getD()).b != null) {
                            composer2.o(1022288675);
                            LoginFullPageErrorState loginFullPageErrorState = ((LoginContract.ViewState) state.getD()).b;
                            Intrinsics.e(loginFullPageErrorState);
                            composer2.o(5004770);
                            LoginViewModel loginViewModel2 = loginViewModel;
                            boolean zI3 = composer2.I(loginViewModel2);
                            Object objG3 = composer2.G();
                            if (zI3 || objG3 == Composer.Companion.f1624a) {
                                objG3 = new b(loginViewModel2, 0);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            LoginScreenKt.a(loginFullPageErrorState, onErrorTryAgain, (Function2) objG3, composer2, 0);
                            composer2.l();
                        } else {
                            composer2.o(1022618732);
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 1018);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(onNavigateUp, onErrorTryAgain, onCloseLogin, onLaunchPickUpLocator, onLaunchAddressPickerAndCloseLogin, onSignUpClicked, loginViewModel, i);
        }
    }
}
