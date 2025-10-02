package au.com.woolworths.feature.shop.signup.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.compose.b;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.shop.signup.SignUpContract;
import au.com.woolworths.feature.shop.signup.SignUpViewModel;
import au.com.woolworths.feature.shop.signup.data.SignUpError;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"signup_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SignUpScreenKt {
    public static final void a(SignUpError signUpError, Function1 function1, Function0 function0, Composer composer, int i) {
        FullPageMessageSpec fullPageMessageSpecF;
        ComposerImpl composerImplV = composer.v(-430765627);
        int i2 = (composerImplV.n(signUpError) ? 4 : 2) | i | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a);
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 14) == 4) | ((i2 & 112) == 32) | composerImplV.I(lifecycleOwner);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new b(lifecycleOwner, function1, signUpError, 24);
                composerImplV.A(objG);
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
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (signUpError instanceof SignUpError.NoBrowserInstalled) {
                composerImplV.o(-1756661099);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.e(null, StringResources_androidKt.c(composerImplV, R.string.signup_generic_error_title), StringResources_androidKt.c(composerImplV, R.string.no_browser_installed_message), StringResources_androidKt.c(composerImplV, R.string.try_again_button_text), function0);
                composerImplV.V(false);
            } else {
                composerImplV.o(-1756647237);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, StringResources_androidKt.c(composerImplV, R.string.signup_server_error), null, function0, composerImplV, 23);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
            FullPageMessageUiKt.a(fullPageMessageSpecF, null, null, composerImplV, 0, 6);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(signUpError, function1, function0, i, 7);
        }
    }

    public static final void b(Function0 function0, final Function0 onRetry, final Function1 onSignUpSuccess, final Function0 onLoginClicked, final Function1 onErrorShown, SignUpViewModel viewModel, Composer composer, final int i) {
        final SignUpViewModel signUpViewModel;
        ComposerImpl composerImpl;
        final Function0 onNavigateUp = function0;
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onRetry, "onRetry");
        Intrinsics.h(onSignUpSuccess, "onSignUpSuccess");
        Intrinsics.h(onLoginClicked, "onLoginClicked");
        Intrinsics.h(onErrorShown, "onErrorShown");
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(327805635);
        int i2 = i | (composerImplV.I(onNavigateUp) ? 4 : 2) | (composerImplV.I(onRetry) ? 32 : 16) | (composerImplV.I(onSignUpSuccess) ? 256 : 128) | (composerImplV.I(onLoginClicked) ? 2048 : 1024) | (composerImplV.I(onErrorShown) ? 16384 : 8192) | (composerImplV.I(viewModel) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            signUpViewModel = viewModel;
            composerImpl = composerImplV;
        } else {
            Flow flow = viewModel.g;
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(viewModel) | ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                SignUpScreenKt$SignUpScreen$1$1 signUpScreenKt$SignUpScreen$1$1 = new SignUpScreenKt$SignUpScreen$1$1(viewModel, onNavigateUp, onSignUpSuccess, onLoginClicked, null);
                signUpViewModel = viewModel;
                onNavigateUp = onNavigateUp;
                composerImplV.A(signUpScreenKt$SignUpScreen$1$1);
                objG = signUpScreenKt$SignUpScreen$1$1;
            } else {
                signUpViewModel = viewModel;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
            composerImpl = composerImplV;
            ScaffoldKt.a(WindowInsetsPaddingKt.d(Modifier.Companion.d, WindowInsets_androidKt.c(composerImplV)).x0(SizeKt.c), ComposableLambdaKt.c(-1024248953, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.signup.ui.SignUpScreenKt$SignUpScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.title_activity_signup);
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final Function0 function02 = onNavigateUp;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(-2009703687, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.signup.ui.SignUpScreenKt$SignUpScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).e.b, StringResources_androidKt.c(composer3, R.string.content_description_back_button), function02, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 638);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-114103472, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.signup.ui.SignUpScreenKt$SignUpScreen$3
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
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
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
                        SignUpContract.ViewState viewState = (SignUpContract.ViewState) FlowExtKt.a(signUpViewModel.i, composer2).getD();
                        if (viewState instanceof SignUpContract.ViewState.Initial) {
                            composer2.o(1276361109);
                            CircularProgressIndicatorKt.b(null, 0L, BitmapDescriptorFactory.HUE_RED, 0, composer2, 0, 15);
                            composer2.l();
                        } else {
                            if (!(viewState instanceof SignUpContract.ViewState.Failed)) {
                                composer2.o(-2037040968);
                                composer2.l();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.o(1276487899);
                            SignUpScreenKt.a(((SignUpContract.ViewState.Failed) viewState).getF8109a(), onErrorShown, onRetry, composer2, 0);
                            composer2.l();
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 12582960, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final SignUpViewModel signUpViewModel2 = signUpViewModel;
            recomposeScopeImplX.d = new Function2(onRetry, onSignUpSuccess, onLoginClicked, onErrorShown, signUpViewModel2, i) { // from class: au.com.woolworths.feature.shop.signup.ui.a
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ Function1 h;
                public final /* synthetic */ SignUpViewModel i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    SignUpScreenKt.b(this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
