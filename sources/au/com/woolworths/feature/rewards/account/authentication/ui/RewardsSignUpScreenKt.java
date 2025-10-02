package au.com.woolworths.feature.rewards.account.authentication.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.design.core.ui.component.experimental.tag.d;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModelNew;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"", "urlToLoad", "callbackUrlPattern", "callbackUrlPatternRegex", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContractNew$ViewState;", "viewState", "account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsSignUpScreenKt {
    public static final void a(AppEnvironment appEnvironment, Function0 onNavigateUp, Function3 onError, RewardsAuthenticationViewModelNew viewModel, Function0 onWebViewError, Function1 onAppCallback, Composer composer, int i) {
        boolean z;
        ComposerImpl composerImpl;
        Intrinsics.h(appEnvironment, "appEnvironment");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onError, "onError");
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onWebViewError, "onWebViewError");
        Intrinsics.h(onAppCallback, "onAppCallback");
        ComposerImpl composerImplV = composer.v(1124236712);
        int i2 = i | (composerImplV.I(appEnvironment) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(onError) ? 256 : 128) | (composerImplV.I(viewModel) ? 2048 : 1024) | (composerImplV.I(onWebViewError) ? 16384 : 8192) | (composerImplV.I(onAppCallback) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = SnapshotStateKt.f("");
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == obj) {
                objD = SnapshotStateKt.f("");
                composerImplV.A(objD);
            }
            MutableState mutableState2 = (MutableState) objD;
            Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD2 == obj) {
                objD2 = SnapshotStateKt.f(null);
                composerImplV.A(objD2);
            }
            MutableState mutableState3 = (MutableState) objD2;
            composerImplV.V(false);
            MutableState mutableStateA = FlowExtKt.a(viewModel.i, composerImplV);
            RewardsAuthenticationContractNew.ViewState viewState = (RewardsAuthenticationContractNew.ViewState) mutableStateA.getD();
            composerImplV.o(-1224400529);
            boolean zN = composerImplV.n(mutableStateA);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == obj) {
                Object rewardsSignUpScreenKt$RewardsSignUpScreen$1$1 = new RewardsSignUpScreenKt$RewardsSignUpScreen$1$1(mutableStateA, mutableState, mutableState2, mutableState3, null);
                composerImplV.A(rewardsSignUpScreenKt$RewardsSignUpScreen$1$1);
                objG2 = rewardsSignUpScreenKt$RewardsSignUpScreen$1$1;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, viewState, (Function2) objG2);
            RewardsAuthenticationContractNew.ViewState viewState2 = (RewardsAuthenticationContractNew.ViewState) mutableStateA.getD();
            composerImplV.o(-1224400529);
            boolean z2 = (i2 & 896) == 256;
            Object objG3 = composerImplV.G();
            if (z2 || objG3 == obj) {
                z = false;
                Object bVar = new androidx.work.impl.utils.b(onError, mutableState, mutableState2, mutableState3, 5);
                composerImplV.A(bVar);
                objG3 = bVar;
            } else {
                z = false;
            }
            composerImplV.V(z);
            composerImpl = composerImplV;
            b(viewState2, appEnvironment, onNavigateUp, (Function0) objG3, onWebViewError, onAppCallback, composerImpl, ((i2 << 3) & 1008) | (57344 & i2) | (458752 & i2));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productsearch.c(appEnvironment, onNavigateUp, onError, viewModel, onWebViewError, onAppCallback, i);
        }
    }

    public static final void b(final RewardsAuthenticationContractNew.ViewState viewState, final AppEnvironment appEnvironment, final Function0 function0, final Function0 function02, final Function0 function03, final Function1 function1, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1216005909);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(appEnvironment) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function1) ? 131072 : 65536;
        }
        if ((i2 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(9392303, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.authentication.ui.RewardsSignUpScreenKt$RewardsSignUpScreenUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.rewards_signup_title);
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final Function0 function04 = function0;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(-2033312863, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.authentication.ui.RewardsSignUpScreenKt$RewardsSignUpScreenUi$1.1
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
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-1739598280, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.authentication.ui.RewardsSignUpScreenKt$RewardsSignUpScreenUi$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2;
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer3.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer3.c()) {
                        composer3.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(SizeKt.c, paddingValues);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier modifierD = ComposedModifierKt.d(composer3, modifierE);
                        ComposeUiNode.e3.getClass();
                        Function0 function04 = ComposeUiNode.Companion.b;
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function04);
                        } else {
                            composer3.e();
                        }
                        Updater.b(composer3, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function2);
                        }
                        Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                        RewardsAuthenticationContractNew.ViewState viewState2 = viewState;
                        if (viewState2 instanceof RewardsAuthenticationContractNew.ViewState.Loading) {
                            composer3.o(1602058669);
                            composer2 = composer3;
                            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composer2, null);
                            composer2.l();
                        } else {
                            composer2 = composer3;
                            if (viewState2 instanceof RewardsAuthenticationContractNew.ViewState.Error) {
                                composer2.o(1602201951);
                                RewardsLoginScreenKt.a(true, ((RewardsAuthenticationContractNew.ViewState.Error) viewState2).f5659a, function02, composer2, 6);
                                composer2.l();
                            } else if (viewState2 instanceof RewardsAuthenticationContractNew.ViewState.Signup) {
                                composer2.o(1602487368);
                                RewardsAuthenticationContractNew.ViewState.Signup signup = (RewardsAuthenticationContractNew.ViewState.Signup) viewState2;
                                RewardsSignUpWebViewKt.a(signup.f5662a, signup.b, signup.c, appEnvironment, function03, function1, composer2, 0);
                                composer2.l();
                            } else {
                                composer2.o(1602860980);
                                composer2.l();
                            }
                        }
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(viewState, appEnvironment, function0, function02, function03, function1, i, 3);
        }
    }
}
