package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.AlertDialogUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.FooterButtonKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.LoadingUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFooter;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasAlertDialog;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.foundation.rewards.common.ui.errors.FullPageErrorContentKt;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState;", "viewState", "", "openAlertDialog", "everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LandingScreenKt {
    public static final void a(final EverydayExtrasLandingFooter everydayExtrasLandingFooter, final Function1 function1, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1282995714);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(everydayExtrasLandingFooter) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierB = BackgroundKt.b(PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, WindowInsetsKt.d(WindowInsets_androidKt.a(composerImplV), composerImplV).getD(), 7), ToneColors.k, RectangleShapeKt.f1779a);
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
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
            composerImplV.o(1338148650);
            Iterator it = everydayExtrasLandingFooter.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EverydayExtrasLandingFooterItem.Button button = (EverydayExtrasLandingFooterItem.Button) it.next();
                String str = button.d;
                EverydayExtrasButtonStyle everydayExtrasButtonStyle = button.g;
                composerImplV.o(-1633490746);
                boolean zN = ((i2 & 112) == 32) | composerImplV.n(button);
                Object objG = composerImplV.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(5, function1, button);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                FooterButtonKt.a(str, everydayExtrasButtonStyle, (Function0) objG, composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    LandingScreenKt.a(everydayExtrasLandingFooter, function1, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(boolean z, EverydayExtrasLandingFeed everydayExtrasLandingFeed, RewardsServiceMessage rewardsServiceMessage, Function1 onTabClick, final Function0 onNavigateUp, Function1 onFaqUiItemClick, Function1 onFooterButtonClick, Function2 onCloseAlertDialogClick, Function1 onAlertDialogShown, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        EverydayExtrasLandingFeed landingFeed = everydayExtrasLandingFeed;
        Intrinsics.h(landingFeed, "landingFeed");
        EverydayExtrasAlertDialog everydayExtrasAlertDialog = landingFeed.f;
        Intrinsics.h(onTabClick, "onTabClick");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onFaqUiItemClick, "onFaqUiItemClick");
        Intrinsics.h(onFooterButtonClick, "onFooterButtonClick");
        Intrinsics.h(onCloseAlertDialogClick, "onCloseAlertDialogClick");
        Intrinsics.h(onAlertDialogShown, "onAlertDialogShown");
        ComposerImpl composerImplV = composer.v(-1365389112);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | (composerImplV.I(landingFeed) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= (i & 512) == 0 ? composerImplV.n(rewardsServiceMessage) : composerImplV.I(rewardsServiceMessage) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= composerImplV.I(onTabClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= composerImplV.I(onNavigateUp) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= composerImplV.I(onFaqUiItemClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= composerImplV.I(onFooterButtonClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= composerImplV.I(onCloseAlertDialogClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= composerImplV.I(onAlertDialogShown) ? 67108864 : 33554432;
        }
        if ((38347923 & i5) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierA = TestTagKt.a(SizeKt.c, "NavigationTitle");
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier.Companion companion = Modifier.Companion.d;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            if (z) {
                i3 = i5;
                composerImplV.o(-576349838);
                Modifier modifierA2 = columnScopeInstance.a(companion, 1.0f, true);
                int i7 = i3 >> 3;
                RewardsServiceMessage.Companion companion2 = RewardsServiceMessage.INSTANCE;
                i4 = 8388608;
                landingFeed = everydayExtrasLandingFeed;
                InnerContentAccessibilityKt.a(landingFeed, rewardsServiceMessage, onNavigateUp, onTabClick, onFaqUiItemClick, modifierA2, composerImplV, (i7 & 14) | 64 | (i7 & 112) | ((i3 >> 6) & 896) | (i3 & 7168) | (i7 & 57344));
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else {
                composerImplV.o(-577197905);
                TopNavBarKt.b(landingFeed.f6160a, null, null, null, 0L, ToneColors.k, WxTheme.a(composerImplV).c(), null, 0, ComposableLambdaKt.c(424302182, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.LandingScreenKt$LandingContent$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            ImageVector imageVectorA = ArrowBackKt.a();
                            String strC = StringResources_androidKt.c(composer2, R.string.content_description_back_button);
                            composer2.o(5004770);
                            Function0 function02 = onNavigateUp;
                            boolean zN = composer2.n(function02);
                            Object objG = composer2.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(16, function02);
                                composer2.A(objG);
                            }
                            composer2.l();
                            IconButtonKt.c(imageVectorA, strC, (Function0) objG, null, false, 0L, composer2, 0, 56);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), null, composerImplV, 905969664, 0, 1182);
                Modifier modifierA3 = columnScopeInstance.a(companion, 1.0f, true);
                int i8 = i5 >> 3;
                RewardsServiceMessage.Companion companion3 = RewardsServiceMessage.INSTANCE;
                i3 = i5;
                InnerContentNormalKt.a(landingFeed, rewardsServiceMessage, onTabClick, onFaqUiItemClick, modifierA3, composerImplV, (i8 & 896) | (i8 & 14) | 64 | (i8 & 112) | ((i5 >> 6) & 7168));
                composerImplV.V(false);
                landingFeed = everydayExtrasLandingFeed;
                i4 = 8388608;
            }
            EverydayExtrasLandingFooter everydayExtrasLandingFooter = landingFeed.e;
            composerImplV.o(-1819695294);
            if (everydayExtrasLandingFooter != null) {
                a(everydayExtrasLandingFooter, onFooterButtonClick, composerImplV, (i3 >> 15) & 112);
            }
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objD == composer$Companion$Empty$1) {
                objD = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objD);
            }
            MutableState mutableState = (MutableState) objD;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(landingFeed);
            Object objG = composerImplV.G();
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new LandingScreenKt$LandingContent$1$3$1(landingFeed, mutableState, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, everydayExtrasAlertDialog, (Function2) objG);
            composerImplV.o(-1819683844);
            if (!((Boolean) mutableState.getD()).booleanValue() || everydayExtrasAlertDialog == null) {
                z2 = false;
            } else {
                onAlertDialogShown.invoke(everydayExtrasAlertDialog);
                String str = everydayExtrasAlertDialog.f6164a;
                String str2 = everydayExtrasAlertDialog.b;
                ContentCta contentCta = everydayExtrasAlertDialog.c;
                ContentCta contentCta2 = everydayExtrasAlertDialog.d;
                composerImplV.o(-1746271574);
                boolean zI2 = ((29360128 & i3) == i4) | composerImplV.I(everydayExtrasAlertDialog);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new androidx.lifecycle.compose.b(8, onCloseAlertDialogClick, everydayExtrasAlertDialog, mutableState);
                    composerImplV.A(objG2);
                }
                z2 = false;
                composerImplV.V(false);
                AlertDialogUiKt.a(str, str2, contentCta, contentCta2, (Function1) objG2, composerImplV, 0);
            }
            composerImplV.V(z2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new j(z, landingFeed, rewardsServiceMessage, onTabClick, onNavigateUp, onFaqUiItemClick, onFooterButtonClick, onCloseAlertDialogClick, onAlertDialogShown, i);
        }
    }

    public static final void c(final EverydayExtraLandingViewModel everydayExtraLandingViewModel, final boolean z, final Function0 onNavigateUp, Composer composer, int i) {
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-2138657780);
        if ((((composerImplV.I(everydayExtraLandingViewModel) ? 4 : 2) | i | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(onNavigateUp) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateA = FlowExtKt.a(everydayExtraLandingViewModel.j, composerImplV);
            Modifier modifierB = BackgroundKt.b(Modifier.Companion.d, ToneColors.k, RectangleShapeKt.f1779a);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            EverydayExtraLandingContract.ViewState viewState = (EverydayExtraLandingContract.ViewState) mutableStateA.getD();
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(18);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            AnimatedContentKt.b(viewState, null, null, null, "viewState", (Function1) objG, ComposableLambdaKt.c(-877980583, new Function4<AnimatedContentScope, EverydayExtraLandingContract.ViewState, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.LandingScreenKt$LandingScreen$1$2
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Object landingScreenKt$LandingScreen$1$2$5$1;
                    EverydayExtraLandingViewModel everydayExtraLandingViewModel2;
                    AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                    EverydayExtraLandingContract.ViewState state = (EverydayExtraLandingContract.ViewState) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.h(state, "state");
                    boolean zEquals = state.equals(EverydayExtraLandingContract.ViewState.Loading.f6095a);
                    Unit unit = Unit.f24250a;
                    if (zEquals) {
                        composer2.o(431389238);
                        LoadingUiKt.a(composer2, 0);
                        composer2.l();
                        return unit;
                    }
                    boolean z2 = state instanceof EverydayExtraLandingContract.ViewState.Error;
                    EverydayExtraLandingViewModel everydayExtraLandingViewModel3 = everydayExtraLandingViewModel;
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (z2) {
                        composer2.o(431512742);
                        FullPageError fullPageError = ((EverydayExtraLandingContract.ViewState.Error) state).f6094a;
                        composer2.o(5004770);
                        boolean zI = composer2.I(everydayExtraLandingViewModel3);
                        Object objG2 = composer2.G();
                        if (zI || objG2 == composer$Companion$Empty$1) {
                            objG2 = new LandingScreenKt$LandingScreen$1$2$1$1(0, everydayExtraLandingViewModel3, EverydayExtraLandingViewModel.class, "retry", "retry()V", 0);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        FullPageErrorContentKt.a(fullPageError, null, (Function0) ((KFunction) objG2), composer2, 0);
                        composer2.l();
                        return unit;
                    }
                    if (!(state instanceof EverydayExtraLandingContract.ViewState.Content)) {
                        if (!(state instanceof EverydayExtraLandingContract.ViewState.ServiceMessage)) {
                            throw au.com.woolworths.android.onesite.a.x(composer2, -1925747924);
                        }
                        composer2.o(432684170);
                        RewardsServiceMessage rewardsServiceMessage = ((EverydayExtraLandingContract.ViewState.ServiceMessage) state).f6096a;
                        composer2.o(5004770);
                        boolean zI2 = composer2.I(everydayExtraLandingViewModel3);
                        Object objG3 = composer2.G();
                        if (zI2 || objG3 == composer$Companion$Empty$1) {
                            LandingScreenKt$LandingScreen$1$2$8$1 landingScreenKt$LandingScreen$1$2$8$1 = new LandingScreenKt$LandingScreen$1$2$8$1(0, everydayExtraLandingViewModel3, EverydayExtraLandingViewModel.class, "retry", "retry()V", 0);
                            composer2.A(landingScreenKt$LandingScreen$1$2$8$1);
                            objG3 = landingScreenKt$LandingScreen$1$2$8$1;
                        }
                        composer2.l();
                        RewardsServiceMessage.Companion companion = RewardsServiceMessage.INSTANCE;
                        ServiceMessageUiKt.a(rewardsServiceMessage, null, (Function0) ((KFunction) objG3), composer2, 8, 2);
                        composer2.l();
                        return unit;
                    }
                    composer2.o(431796516);
                    EverydayExtraLandingContract.ViewState.Content content = (EverydayExtraLandingContract.ViewState.Content) state;
                    EverydayExtrasLandingFeed everydayExtrasLandingFeed = content.f6093a;
                    RewardsServiceMessage rewardsServiceMessage2 = content.b;
                    composer2.o(5004770);
                    boolean zI3 = composer2.I(everydayExtraLandingViewModel3);
                    Object objG4 = composer2.G();
                    if (zI3 || objG4 == composer$Companion$Empty$1) {
                        LandingScreenKt$LandingScreen$1$2$2$1 landingScreenKt$LandingScreen$1$2$2$1 = new LandingScreenKt$LandingScreen$1$2$2$1(1, everydayExtraLandingViewModel3, EverydayExtraLandingViewModel.class, "onTabClick", "onTabClick$everyday_extras_sign_up_release(Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasTab;)V", 0);
                        composer2.A(landingScreenKt$LandingScreen$1$2$2$1);
                        objG4 = landingScreenKt$LandingScreen$1$2$2$1;
                    }
                    composer2.l();
                    Function1 function1 = (Function1) ((KFunction) objG4);
                    composer2.o(5004770);
                    boolean zI4 = composer2.I(everydayExtraLandingViewModel3);
                    Object objG5 = composer2.G();
                    if (zI4 || objG5 == composer$Companion$Empty$1) {
                        LandingScreenKt$LandingScreen$1$2$3$1 landingScreenKt$LandingScreen$1$2$3$1 = new LandingScreenKt$LandingScreen$1$2$3$1(1, everydayExtraLandingViewModel3, EverydayExtraLandingViewModel.class, "onFaqUiItemClicked", "onFaqUiItemClicked$everyday_extras_sign_up_release(Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsSectionItem$FaqsFaqUiItem;)V", 0);
                        composer2.A(landingScreenKt$LandingScreen$1$2$3$1);
                        objG5 = landingScreenKt$LandingScreen$1$2$3$1;
                    }
                    composer2.l();
                    Function1 function12 = (Function1) ((KFunction) objG5);
                    composer2.o(5004770);
                    boolean zI5 = composer2.I(everydayExtraLandingViewModel3);
                    Object objG6 = composer2.G();
                    if (zI5 || objG6 == composer$Companion$Empty$1) {
                        LandingScreenKt$LandingScreen$1$2$4$1 landingScreenKt$LandingScreen$1$2$4$1 = new LandingScreenKt$LandingScreen$1$2$4$1(1, everydayExtraLandingViewModel3, EverydayExtraLandingViewModel.class, "onPrimaryActionClicked", "onPrimaryActionClicked$everyday_extras_sign_up_release(Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasLandingFooterItem$Button;)V", 0);
                        composer2.A(landingScreenKt$LandingScreen$1$2$4$1);
                        objG6 = landingScreenKt$LandingScreen$1$2$4$1;
                    }
                    composer2.l();
                    Function1 function13 = (Function1) ((KFunction) objG6);
                    composer2.o(5004770);
                    boolean zI6 = composer2.I(everydayExtraLandingViewModel3);
                    Object objG7 = composer2.G();
                    if (zI6 || objG7 == composer$Companion$Empty$1) {
                        landingScreenKt$LandingScreen$1$2$5$1 = new LandingScreenKt$LandingScreen$1$2$5$1(2, everydayExtraLandingViewModel3, EverydayExtraLandingViewModel.class, "onCloseAlertDialogClick", "onCloseAlertDialogClick$everyday_extras_sign_up_release(Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/AlertDialogAnalytics;)V", 0);
                        everydayExtraLandingViewModel2 = everydayExtraLandingViewModel3;
                        composer2.A(landingScreenKt$LandingScreen$1$2$5$1);
                    } else {
                        landingScreenKt$LandingScreen$1$2$5$1 = objG7;
                        everydayExtraLandingViewModel2 = everydayExtraLandingViewModel3;
                    }
                    composer2.l();
                    Function2 function22 = (Function2) ((KFunction) landingScreenKt$LandingScreen$1$2$5$1);
                    composer2.o(5004770);
                    boolean zI7 = composer2.I(everydayExtraLandingViewModel2);
                    Object objG8 = composer2.G();
                    if (zI7 || objG8 == composer$Companion$Empty$1) {
                        objG8 = new l(everydayExtraLandingViewModel2, 0);
                        composer2.A(objG8);
                    }
                    composer2.l();
                    RewardsServiceMessage.Companion companion2 = RewardsServiceMessage.INSTANCE;
                    EverydayExtraLandingViewModel everydayExtraLandingViewModel4 = everydayExtraLandingViewModel2;
                    LandingScreenKt.b(z, everydayExtrasLandingFeed, rewardsServiceMessage2, function1, onNavigateUp, function12, function13, function22, (Function1) objG8, composer2, 512);
                    composer2.o(5004770);
                    boolean zI8 = composer2.I(everydayExtraLandingViewModel4);
                    Object objG9 = composer2.G();
                    if (zI8 || objG9 == composer$Companion$Empty$1) {
                        objG9 = new LandingScreenKt$LandingScreen$1$2$7$1(everydayExtraLandingViewModel4, null);
                        composer2.A(objG9);
                    }
                    composer2.l();
                    EffectsKt.e(composer2, unit, (Function2) objG9);
                    composer2.l();
                    return unit;
                }
            }, composerImplV), composerImplV, 1794048, 14);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.a(everydayExtraLandingViewModel, z, onNavigateUp, i, 2);
        }
    }
}
