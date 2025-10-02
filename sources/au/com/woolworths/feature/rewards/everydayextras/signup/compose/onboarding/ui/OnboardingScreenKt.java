package au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.navigation.compose.d;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopBarLiftOnScrollElevationKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.FooterButtonKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.LoadingUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeFooter;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState;", "viewState", "everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OnboardingScreenKt {
    public static final void a(EverydayExtrasSubscribeFooter everydayExtrasSubscribeFooter, boolean z, Function1 function1, Composer composer, int i) {
        EverydayExtrasSubscribeFooterItem everydayExtrasSubscribeFooterItem;
        ComposerImpl composerImplV = composer.v(1713658387);
        int i2 = (i & 6) == 0 ? (composerImplV.I(everydayExtrasSubscribeFooter) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = BackgroundKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), ToneColors.k, RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
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
            List<EverydayExtrasSubscribeFooterItem> list = everydayExtrasSubscribeFooter.e;
            int i4 = -370312887;
            composerImplV.o(-370312887);
            if (list != null) {
                for (EverydayExtrasSubscribeFooterItem everydayExtrasSubscribeFooterItem2 : list) {
                    composerImplV.o(i4);
                    if (z) {
                        everydayExtrasSubscribeFooterItem = everydayExtrasSubscribeFooterItem2;
                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
                    } else {
                        everydayExtrasSubscribeFooterItem = everydayExtrasSubscribeFooterItem2;
                    }
                    composerImplV.V(false);
                    boolean z2 = everydayExtrasSubscribeFooterItem instanceof EverydayExtrasSubscribeFooterItem.Button;
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (z2) {
                        composerImplV.o(-375999235);
                        EverydayExtrasSubscribeFooterItem.Button button = (EverydayExtrasSubscribeFooterItem.Button) everydayExtrasSubscribeFooterItem;
                        String str = button.d;
                        EverydayExtrasButtonStyle everydayExtrasButtonStyle = button.g;
                        composerImplV.o(-1633490746);
                        boolean zN = ((i2 & 896) == 256) | composerImplV.n(everydayExtrasSubscribeFooterItem);
                        Object objG = composerImplV.G();
                        if (zN || objG == composer$Companion$Empty$1) {
                            objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(6, function1, button);
                            composerImplV.A(objG);
                        }
                        composerImplV.V(false);
                        FooterButtonKt.a(str, everydayExtrasButtonStyle, (Function0) objG, composerImplV, 0);
                        composerImplV.V(false);
                    } else {
                        if (!(everydayExtrasSubscribeFooterItem instanceof EverydayExtrasSubscribeFooterItem.SubscribeContentCta)) {
                            throw au.com.woolworths.android.onesite.a.w(680605689, composerImplV, false);
                        }
                        composerImplV.o(-375700178);
                        EverydayExtrasSubscribeFooterItem.SubscribeContentCta subscribeContentCta = (EverydayExtrasSubscribeFooterItem.SubscribeContentCta) everydayExtrasSubscribeFooterItem;
                        ContentCta contentCta = subscribeContentCta.d;
                        String label = contentCta != null ? contentCta.getLabel() : null;
                        if (label == null) {
                            label = "";
                        }
                        EverydayExtrasButtonStyle everydayExtrasButtonStyle2 = EverydayExtrasButtonStyle.d;
                        composerImplV.o(-1633490746);
                        boolean zN2 = ((i2 & 896) == 256) | composerImplV.n(everydayExtrasSubscribeFooterItem);
                        Object objG2 = composerImplV.G();
                        if (zN2 || objG2 == composer$Companion$Empty$1) {
                            objG2 = new au.com.woolworths.feature.rewards.card.overlay.ui.b(7, function1, subscribeContentCta);
                            composerImplV.A(objG2);
                        }
                        composerImplV.V(false);
                        FooterButtonKt.a(label, everydayExtrasButtonStyle2, (Function0) objG2, composerImplV, 48);
                        composerImplV.V(false);
                    }
                    i4 = -370312887;
                }
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(everydayExtrasSubscribeFooter, z, function1, i, 5);
        }
    }

    public static final void b(EverydayExtrasOnBoarding onboarding, Function1 onFooterButtonClick, Composer composer, int i) {
        Intrinsics.h(onboarding, "onboarding");
        Intrinsics.h(onFooterButtonClick, "onFooterButtonClick");
        ComposerImpl composerImplV = composer.v(-657262683);
        int i2 = (composerImplV.I(onboarding) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onFooterButtonClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
            Modifier modifierA = ColumnScopeInstance.f948a.a(SizeKt.e(companion, 1.0f), 1.0f, true);
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(onboarding);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new a(onboarding, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            int i4 = i2;
            LazyDslKt.b(modifierA, null, paddingValuesImplA, false, arrangement$Center$1, null, null, false, null, (Function1) objG, composerImplV, 24960, 490);
            EverydayExtrasSubscribeFooter everydayExtrasSubscribeFooter = onboarding.e;
            composerImplV.o(540674436);
            if (everydayExtrasSubscribeFooter != null) {
                a(everydayExtrasSubscribeFooter, false, onFooterButtonClick, composerImplV, ((i4 << 3) & 896) | 48);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            AnimatedVisibilityKt.d(true, null, null, null, null, ComposableSingletons$OnboardingScreenKt.f6116a, composerImplV, 196614, 30);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(onboarding, i, 10, onFooterButtonClick);
        }
    }

    public static final void c(EverydayExtrasOnBoarding everydayExtrasOnBoarding, Function1 onFooterButtonClick, Composer composer, int i) {
        Intrinsics.h(onFooterButtonClick, "onFooterButtonClick");
        ComposerImpl composerImplV = composer.v(-1231529700);
        int i2 = (composerImplV.I(everydayExtrasOnBoarding) ? 4 : 2) | i | (composerImplV.I(onFooterButtonClick) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
            Modifier modifierA = ColumnScopeInstance.f948a.a(SizeKt.e(companion, 1.0f), 1.0f, true);
            PaddingValuesImpl paddingValuesImplA = PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(everydayExtrasOnBoarding);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new a(everydayExtrasOnBoarding, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierA, null, paddingValuesImplA, false, null, null, null, false, null, (Function1) objG, composerImplV, KyberEngine.KyberPolyBytes, 506);
            EverydayExtrasSubscribeFooter everydayExtrasSubscribeFooter = everydayExtrasOnBoarding.e;
            composerImplV.o(-1382757990);
            if (everydayExtrasSubscribeFooter != null) {
                a(everydayExtrasSubscribeFooter, true, onFooterButtonClick, composerImplV, ((i2 << 3) & 896) | 48);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(everydayExtrasOnBoarding, i, 20, onFooterButtonClick);
        }
    }

    public static final void d(final EverydayExtraOnboardingViewModel viewModel, Function1 onOpenUrl, Function0 onCloseActivity, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onOpenUrl, "onOpenUrl");
        Intrinsics.h(onCloseActivity, "onCloseActivity");
        ComposerImpl composerImplV = composer.v(1036356647);
        int i2 = i | (composerImplV.I(viewModel) ? 4 : 2) | (composerImplV.I(onOpenUrl) ? 32 : 16) | (composerImplV.I(onCloseActivity) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Flow flow = viewModel.i;
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(viewModel) | ((i2 & 112) == 32);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new OnboardingScreenKt$OnboardingScreen$1$1(viewModel, onCloseActivity, onOpenUrl, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
            final MutableState mutableStateA = FlowExtKt.a(viewModel.k, composerImplV);
            final LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(1419090924, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        long j = ToneColors.k;
                        float fA = TopBarLiftOnScrollElevationKt.a(lazyListStateA, composer2);
                        final EverydayExtraOnboardingViewModel everydayExtraOnboardingViewModel = viewModel;
                        TopNavBarKt.b("", null, null, null, 0L, j, 0L, null, fA, null, ComposableLambdaKt.c(-1725071785, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingScreen$2.1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = CloseKt.a();
                                    String strC = StringResources_androidKt.c(composer3, R.string.content_description_close_button);
                                    composer3.o(5004770);
                                    EverydayExtraOnboardingViewModel everydayExtraOnboardingViewModel2 = everydayExtraOnboardingViewModel;
                                    boolean zI2 = composer3.I(everydayExtraOnboardingViewModel2);
                                    Object objG2 = composer3.G();
                                    if (zI2 || objG2 == Composer.Companion.f1624a) {
                                        OnboardingScreenKt$OnboardingScreen$2$1$1$1 onboardingScreenKt$OnboardingScreen$2$1$1$1 = new OnboardingScreenKt$OnboardingScreen$2$1$1$1(0, everydayExtraOnboardingViewModel2, EverydayExtraOnboardingViewModel.class, "onSignUpCloseBtnClicked", "onSignUpCloseBtnClicked()V", 0);
                                        composer3.A(onboardingScreenKt$OnboardingScreen$2$1$1$1);
                                        objG2 = onboardingScreenKt$OnboardingScreen$2$1$1$1;
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, strC, (Function0) ((KFunction) objG2), null, false, ToneColors.f5162a, composer3, 0, 24);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 6, 6, 734);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(1638657502, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingScreen$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        EverydayExtraOnboardingContract.ViewState viewState = (EverydayExtraOnboardingContract.ViewState) mutableStateA.getD();
                        composer2.o(1849434622);
                        Object objG2 = composer2.G();
                        if (objG2 == Composer.Companion.f1624a) {
                            objG2 = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(29);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        final EverydayExtraOnboardingViewModel everydayExtraOnboardingViewModel = viewModel;
                        AnimatedContentKt.b(viewState, null, null, null, "viewState", (Function1) objG2, ComposableLambdaKt.c(1645468069, new Function4<AnimatedContentScope, EverydayExtraOnboardingContract.ViewState, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt$OnboardingScreen$3.2
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj4;
                                final EverydayExtraOnboardingContract.ViewState state = (EverydayExtraOnboardingContract.ViewState) obj5;
                                Composer composer3 = (Composer) obj6;
                                ((Number) obj7).intValue();
                                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                                Intrinsics.h(state, "state");
                                if (state instanceof EverydayExtraOnboardingContract.ViewState.Loading) {
                                    composer3.o(1677613218);
                                    LoadingUiKt.a(composer3, 0);
                                    composer3.l();
                                } else if (state instanceof EverydayExtraOnboardingContract.ViewState.Error) {
                                    composer3.o(1677760778);
                                    CoreThemeKt.b(6, composer3, ComposableLambdaKt.c(816118151, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.OnboardingScreenKt.OnboardingScreen.3.2.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj8, Object obj9) {
                                            Composer composer4 = (Composer) obj8;
                                            if ((((Number) obj9).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ((EverydayExtraOnboardingContract.ViewState.Error) state).getClass();
                                                composer4.o(1849434622);
                                                Object objG3 = composer4.G();
                                                if (objG3 == Composer.Companion.f1624a) {
                                                    objG3 = new h(20);
                                                    composer4.A(objG3);
                                                }
                                                composer4.l();
                                                FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(FullPageMessage.Error.ServerError.f8916a, null, null, (Function0) objG3, composer4, 1769472, 30), null, null, composer4, 0, 6);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3));
                                    composer3.l();
                                } else {
                                    if (!(state instanceof EverydayExtraOnboardingContract.ViewState.Content)) {
                                        throw au.com.woolworths.android.onesite.a.x(composer3, 746851675);
                                    }
                                    composer3.o(1678336572);
                                    EverydayExtrasOnBoarding everydayExtrasOnBoarding = ((EverydayExtraOnboardingContract.ViewState.Content) state).f6112a;
                                    boolean zC = Intrinsics.c(everydayExtrasOnBoarding.f, Boolean.TRUE);
                                    Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                                    if (zC) {
                                        composer3.o(1678393984);
                                        composer3.o(5004770);
                                        EverydayExtraOnboardingViewModel everydayExtraOnboardingViewModel2 = everydayExtraOnboardingViewModel;
                                        boolean zI2 = composer3.I(everydayExtraOnboardingViewModel2);
                                        Object objG3 = composer3.G();
                                        if (zI2 || objG3 == composer$Companion$Empty$12) {
                                            OnboardingScreenKt$OnboardingScreen$3$2$2$1 onboardingScreenKt$OnboardingScreen$3$2$2$1 = new OnboardingScreenKt$OnboardingScreen$3$2$2$1(1, everydayExtraOnboardingViewModel2, EverydayExtraOnboardingViewModel.class, "onFooterButtonClick", "onFooterButtonClick(Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeFooterItem;)V", 0);
                                            composer3.A(onboardingScreenKt$OnboardingScreen$3$2$2$1);
                                            objG3 = onboardingScreenKt$OnboardingScreen$3$2$2$1;
                                        }
                                        composer3.l();
                                        OnboardingScreenKt.b(everydayExtrasOnBoarding, (Function1) ((KFunction) objG3), composer3, 0);
                                        composer3.l();
                                    } else {
                                        composer3.o(1678651098);
                                        composer3.o(5004770);
                                        EverydayExtraOnboardingViewModel everydayExtraOnboardingViewModel3 = everydayExtraOnboardingViewModel;
                                        boolean zI3 = composer3.I(everydayExtraOnboardingViewModel3);
                                        Object objG4 = composer3.G();
                                        if (zI3 || objG4 == composer$Companion$Empty$12) {
                                            OnboardingScreenKt$OnboardingScreen$3$2$3$1 onboardingScreenKt$OnboardingScreen$3$2$3$1 = new OnboardingScreenKt$OnboardingScreen$3$2$3$1(1, everydayExtraOnboardingViewModel3, EverydayExtraOnboardingViewModel.class, "onFooterButtonClick", "onFooterButtonClick(Lau/com/woolworths/feature/rewards/everydayextras/signup/data/onboarding/EverydayExtrasSubscribeFooterItem;)V", 0);
                                            composer3.A(onboardingScreenKt$OnboardingScreen$3$2$3$1);
                                            objG4 = onboardingScreenKt$OnboardingScreen$3$2$3$1;
                                        }
                                        composer3.l();
                                        OnboardingScreenKt.c(everydayExtrasOnBoarding, (Function1) ((KFunction) objG4), composer3, 0);
                                        composer3.l();
                                    }
                                    composer3.l();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1794048, 14);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 390, 1018);
            composerImpl = composerImplV;
            composerImpl.o(5004770);
            boolean zI2 = composerImpl.I(viewModel);
            Object objG2 = composerImpl.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new OnboardingScreenKt$OnboardingScreen$4$1(viewModel, null);
                composerImpl.A(objG2);
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, Unit.f24250a, (Function2) objG2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(viewModel, onOpenUrl, onCloseActivity, i, 5);
        }
    }
}
