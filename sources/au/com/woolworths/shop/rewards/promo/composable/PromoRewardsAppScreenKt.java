package au.com.woolworths.shop.rewards.promo.composable;

import androidx.camera.core.impl.b;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.contentpage.ui.c;
import au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.CollapsingToolbarBackButtonKt;
import au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.CollapsingToolbarHeaderKt;
import au.com.woolworths.foundation.rewards.common.ui.modal.RewardsModalScreenData;
import au.com.woolworths.foundation.rewards.common.ui.modal.RewardsModalScreenKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.wx.CollapsingToolbarScaffoldKt;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import au.com.woolworths.shop.checkout.ui.compose.k;
import au.com.woolworths.shop.rewards.promo.PromoAppViewModel;
import au.com.woolworths.shop.rewards.promo.PromoRewardsAppContract;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/promo/PromoRewardsAppContract$ViewState;", "viewState", "shop-rewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PromoRewardsAppScreenKt {
    public static final void a(RewardsAppModalData rewardsAppModalData, float f, NestedScrollConnection nestedScrollConnection, Function1 function1, Modifier modifier, Composer composer, int i) {
        boolean z;
        ComposerImpl composerImplV = composer.v(1728427068);
        int i2 = i | (composerImplV.I(rewardsAppModalData) ? 4 : 2) | (composerImplV.q(f) ? 32 : 16) | (composerImplV.I(nestedScrollConnection) ? 256 : 128) | (composerImplV.I(function1) ? 2048 : 1024) | (composerImplV.n(modifier) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierB = ScrollKt.b(NestedScrollModifierKt.a(PaddingKt.j(ColumnScopeInstance.f948a.a(Modifier.Companion.d, 1.0f, true), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), nestedScrollConnection, null), ScrollKt.a(composerImplV), true);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            RewardsModalScreenKt.b(new RewardsModalScreenData(rewardsAppModalData.d, rewardsAppModalData.e, rewardsAppModalData.getSummary(), rewardsAppModalData.getInfoItems(), rewardsAppModalData.g), null, null, composerImplV, 8);
            composerImplV.V(true);
            FeatureInfoFooter featureInfoFooter = rewardsAppModalData.g;
            composerImplV.o(12065249);
            if (featureInfoFooter == null) {
                z = false;
            } else {
                float f2 = 16;
                composerImplV.o(5004770);
                int i5 = i2 & 7168;
                boolean z2 = i5 == 2048;
                Object objG = composerImplV.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (z2 || objG == composer$Companion$Empty$1) {
                    objG = new c(29, function1);
                    composerImplV.A(objG);
                }
                Function1 function12 = (Function1) objG;
                composerImplV.V(false);
                composerImplV.o(5004770);
                boolean z3 = i5 == 2048;
                Object objG2 = composerImplV.G();
                if (z3 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new a(0, function1);
                    composerImplV.A(objG2);
                }
                z = false;
                composerImplV.V(false);
                RewardsModalScreenKt.a(featureInfoFooter, f2, null, function12, (Function1) objG2, composerImplV, 440);
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.offers.detail.composable.c(rewardsAppModalData, f, nestedScrollConnection, function1, modifier, i);
        }
    }

    public static final void b(PromoAppViewModel promoAppViewModel, Function1 onClickUrl, Function0 onBackClick, Composer composer, int i) {
        Intrinsics.h(onClickUrl, "onClickUrl");
        Intrinsics.h(onBackClick, "onBackClick");
        ComposerImpl composerImplV = composer.v(415233682);
        int i2 = (composerImplV.I(promoAppViewModel) ? 4 : 2) | i | (composerImplV.I(onClickUrl) ? 32 : 16) | (composerImplV.I(onBackClick) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            PromoRewardsAppContract.ViewState viewState = (PromoRewardsAppContract.ViewState) FlowExtKt.a(promoAppViewModel.g, composerImplV).getD();
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(promoAppViewModel);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c(promoAppViewModel, 6);
                composerImplV.A(objG);
            }
            Function0 function0 = (Function0) objG;
            composerImplV.V(false);
            RewardsAppModalData.Companion companion = RewardsAppModalData.INSTANCE;
            c(viewState, onClickUrl, onBackClick, function0, composerImplV, (i2 & 112) | 8 | (i2 & 896));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.product.details.ui.linkdedicatedviews.a(promoAppViewModel, onClickUrl, onBackClick, i, 3);
        }
    }

    public static final void c(final PromoRewardsAppContract.ViewState viewState, final Function1 function1, final Function0 function0, final Function0 function02, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-309991636);
        if (((i | (composerImplV.I(viewState) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128) | (composerImplV.I(function02) ? 2048 : 1024)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            CollapsingToolbarScaffoldKt.a(ComposableLambdaKt.c(536954154, new Function3<Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.promo.composable.PromoRewardsAppScreenKt$PromoRewardsAppScreen$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float fFloatValue = ((Number) obj).floatValue();
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.q(fFloatValue) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        CollapsingToolbarBackButtonKt.a(0, composer2, null, function0, fFloatValue > 0.7f);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1614528981, new Function3<Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.promo.composable.PromoRewardsAppScreenKt$PromoRewardsAppScreen$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float fFloatValue = ((Number) obj).floatValue();
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.q(fFloatValue) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        RewardsAppModalData rewardsAppModalData = viewState.c;
                        CollapsingToolbarHeaderKt.a(rewardsAppModalData != null ? rewardsAppModalData.d : null, 1.0f - fFloatValue, modifierE, composer2, KyberEngine.KyberPolyBytes);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), SizeKt.c, null, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, null, null, ComposableLambdaKt.c(-1455683245, new Function5<PaddingValues, NestedScrollConnection, Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.promo.composable.PromoRewardsAppScreenKt$PromoRewardsAppScreen$5
                @Override // kotlin.jvm.functions.Function5
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    final PaddingValues paddingValues = (PaddingValues) obj;
                    final NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) obj2;
                    ((Number) obj3).floatValue();
                    Composer composer2 = (Composer) obj4;
                    ((Number) obj5).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    Intrinsics.h(nestedScrollConnection, "nestedScrollConnection");
                    FillElement fillElement = SizeKt.c;
                    PromoRewardsAppContract.ViewState viewState2 = viewState;
                    Pair pair = new Pair(Boolean.valueOf(viewState2.f12913a), viewState2.b);
                    au.com.woolworths.feature.shop.recipes.recipes.list.b bVar = new au.com.woolworths.feature.shop.recipes.recipes.list.b(23);
                    final Function1 function12 = function1;
                    final Function0 function03 = function02;
                    final PromoRewardsAppContract.ViewState viewState3 = viewState;
                    AnimatedContentKt.b(pair, fillElement, bVar, Alignment.Companion.e, "loadingAnimation", null, ComposableLambdaKt.c(-51891520, new Function4<AnimatedContentScope, Pair<? extends Boolean, ? extends FullPageMessage.Error>, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.promo.composable.PromoRewardsAppScreenKt$PromoRewardsAppScreen$5.1
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                            AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj6;
                            Pair destruct$ = (Pair) obj7;
                            Composer composer3 = (Composer) obj8;
                            ((Number) obj9).intValue();
                            Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                            Intrinsics.h(destruct$, "$destruct$");
                            boolean zBooleanValue = ((Boolean) destruct$.d).booleanValue();
                            final FullPageMessage.Error error = (FullPageMessage.Error) destruct$.e;
                            Modifier.Companion companion = Modifier.Companion.d;
                            if (zBooleanValue) {
                                composer3.o(288043088);
                                FillElement fillElement2 = SizeKt.c;
                                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                int p = composer3.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                Modifier modifierD = ComposedModifierKt.d(composer3, fillElement2);
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
                                    b.z(p, composer3, p, function2);
                                }
                                Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 28, WxTheme.a(composer3).h(), 0L, composer3, BoxScopeInstance.f944a.g(companion, Alignment.Companion.e));
                                composer3.f();
                                composer3.l();
                            } else if (error != null) {
                                composer3.o(288391156);
                                final Function0 function05 = function03;
                                CoreThemeKt.b(6, composer3, ComposableLambdaKt.c(-665562974, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.promo.composable.PromoRewardsAppScreenKt.PromoRewardsAppScreen.5.1.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj10, Object obj11) {
                                        Composer composer4 = (Composer) obj10;
                                        if ((((Number) obj11).intValue() & 3) == 2 && composer4.c()) {
                                            composer4.j();
                                        } else {
                                            FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(error, null, null, function05, composer4, 1572864, 30), null, null, composer4, 0, 6);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer3));
                                composer3.l();
                            } else {
                                PromoRewardsAppContract.ViewState viewState4 = viewState3;
                                if (viewState4.c != null) {
                                    composer3.o(288807796);
                                    Modifier modifierA = WindowInsetsPadding_androidKt.a(SizeKt.e(companion, 1.0f));
                                    RewardsAppModalData rewardsAppModalData = viewState4.c;
                                    float b = paddingValues.getB();
                                    RewardsAppModalData.Companion companion2 = RewardsAppModalData.INSTANCE;
                                    PromoRewardsAppScreenKt.a(rewardsAppModalData, b, nestedScrollConnection, function12, modifierA, composer3, 8);
                                    composer3.l();
                                } else {
                                    composer3.o(289265666);
                                    composer3.l();
                                }
                            }
                            return Unit.f24250a;
                        }
                    }, composer2), composer2, 1600560, 32);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 438, 48, 2040);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k((Object) viewState, (Object) function1, function0, function02, i, 6);
        }
    }
}
