package au.com.woolworths.foundation.rewards.onboarding.ui;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent;
import au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkContract;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/OnboardingCoachMarkContract$ViewState;", "viewState", "onboarding-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OnboardingCoachMarkKt {
    public static final void a(final String str, Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1131439334);
        if ((((composerImplV.n(str) ? 4 : 2) | i | 48) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(-580075079, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkKt$OnboardingCoachMark$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        OnboardingCoachMarkKt.b(str, Modifier.Companion.d, composableLambdaImpl, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.barcode.ui.a(str, modifier2, composableLambdaImpl, i, 3);
        }
    }

    public static final void b(String str, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Object obj;
        ComposerImpl composerImplV = composer.v(-1307447065);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(modifier) ? 32 : 16) | (composerImplV.I(composableLambdaImpl) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1145745941);
            if (((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue()) {
                obj = null;
            } else {
                composerImplV.F(1890788296);
                ViewModelStoreOwner viewModelStoreOwnerA = LocalViewModelStoreOwner.a(composerImplV);
                if (viewModelStoreOwnerA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                HiltViewModelFactory hiltViewModelFactoryA = HiltViewModelKt.a(viewModelStoreOwnerA, composerImplV);
                composerImplV.F(1729797275);
                ViewModel viewModelB = ViewModelKt.b(OnboardingCoachMarksViewModel.class, viewModelStoreOwnerA, hiltViewModelFactoryA, viewModelStoreOwnerA instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.Empty.b, composerImplV);
                composerImplV.V(false);
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean zN = composerImplV.n(str);
                Object objG = composerImplV.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    OnboardingCoachMarkViewModelImpl onboardingCoachMarkViewModelImpl = new OnboardingCoachMarkViewModelImpl((OnboardingCoachMarksViewModel) viewModelB, str);
                    composerImplV.A(onboardingCoachMarkViewModelImpl);
                    obj = onboardingCoachMarkViewModelImpl;
                } else {
                    obj = objG;
                }
                composerImplV.V(false);
            }
            composerImplV.V(false);
            final OnboardingCoachMarkViewModel onboardingCoachMarkViewModelNoOp = (OnboardingCoachMarkViewModelImpl) obj;
            if (onboardingCoachMarkViewModelNoOp == null) {
                onboardingCoachMarkViewModelNoOp = new OnboardingCoachMarkViewModelNoOp();
            }
            final MutableState mutableStateA = FlowExtKt.a(onboardingCoachMarkViewModelNoOp.getD(), composerImplV);
            final Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
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
            CoachMarkFrameKt.a(ComposableLambdaKt.c(932487969, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkKt$OnboardingCoachMarkWx$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProgressiveCoachMarkContent progressiveCoachMarkContent = ((OnboardingCoachMarkContract.ViewState) mutableStateA.getD()).f8640a;
                        if (progressiveCoachMarkContent != null) {
                            composer2.o(-1633490746);
                            OnboardingCoachMarkViewModel onboardingCoachMarkViewModel = onboardingCoachMarkViewModelNoOp;
                            boolean zI = composer2.I(onboardingCoachMarkViewModel) | composer2.I(progressiveCoachMarkContent);
                            Object objG2 = composer2.G();
                            Object obj4 = Composer.Companion.f1624a;
                            if (zI || objG2 == obj4) {
                                objG2 = new OnboardingCoachMarkKt$OnboardingCoachMarkWx$1$1$1$1$1(onboardingCoachMarkViewModel, progressiveCoachMarkContent, null);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            EffectsKt.e(composer2, progressiveCoachMarkContent, (Function2) objG2);
                            Function0 function02 = onboardingCoachMarkViewModel.getB().f8639a;
                            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                            composer2.o(-1746271574);
                            boolean zI2 = composer2.I(onboardingCoachMarkViewModel) | composer2.I(progressiveCoachMarkContent);
                            Object obj5 = context;
                            boolean zI3 = zI2 | composer2.I(obj5);
                            Object objG3 = composer2.G();
                            if (zI3 || objG3 == obj4) {
                                objG3 = new androidx.lifecycle.compose.b(29, onboardingCoachMarkViewModel, progressiveCoachMarkContent, obj5);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            ProgressiveCoachMarkKt.a(progressiveCoachMarkContent, function02, (Function1) objG3, modifierE, composer2, 3072, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, ((OnboardingCoachMarkContract.ViewState) mutableStateA.getD()).f8640a != null, onboardingCoachMarkViewModelNoOp.getB().f8639a, null, null, composableLambdaImpl, composerImplV, ((i2 << 18) & 234881024) | 6, 230);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.barcode.ui.a(str, modifier, composableLambdaImpl, i, 2);
        }
    }
}
