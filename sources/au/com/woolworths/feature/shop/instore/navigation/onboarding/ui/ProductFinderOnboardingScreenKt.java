package au.com.woolworths.feature.shop.instore.navigation.onboarding.ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.TextColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingContract;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.data.ProductFinderOnboardingItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$ViewState;", "viewState", "instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductFinderOnboardingScreenKt {
    public static final void a(ProductFinderOnboardingViewModel productFinderOnboardingViewModel, Function1 onAction, Modifier modifier, Composer composer, int i) {
        ProductFinderOnboardingViewModel productFinderOnboardingViewModel2 = productFinderOnboardingViewModel;
        Intrinsics.h(onAction, "onAction");
        ComposerImpl composerImplV = composer.v(1674524100);
        int i2 = i | (composerImplV.I(productFinderOnboardingViewModel2) ? 4 : 2) | (composerImplV.I(onAction) ? 32 : 16);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateA = SnapshotStateKt.a(FlowKt.b(productFinderOnboardingViewModel2.g), composerImplV);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(mutableStateA);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = new f(mutableStateA, 21);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            PagerState pagerStateC = PagerStateKt.c((Function0) objG, composerImplV, 0, 3);
            Lifecycle d = ((LifecycleOwner) composerImplV.x(LocalLifecycleOwnerKt.f2808a)).getD();
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(-1224400529);
            boolean zN2 = composerImplV.n(pagerStateC) | composerImplV.I(productFinderOnboardingViewModel2) | composerImplV.I(context) | composerImplV.n(mutableStateA);
            Object objG2 = composerImplV.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1 productFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1 = new ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1(pagerStateC, productFinderOnboardingViewModel2, context, mutableStateA, null);
                pagerStateC = pagerStateC;
                productFinderOnboardingViewModel2 = productFinderOnboardingViewModel2;
                composerImplV.A(productFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1);
                objG2 = productFinderOnboardingScreenKt$ProductFinderOnboardingScreen$1$1;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, pagerStateC, (Function2) objG2);
            Integer numValueOf = Integer.valueOf(((ProductFinderOnboardingContract.ViewState) mutableStateA.getD()).b);
            composerImplV.o(-1633490746);
            boolean zN3 = composerImplV.n(pagerStateC) | composerImplV.n(mutableStateA);
            Object objG3 = composerImplV.G();
            if (zN3 || objG3 == composer$Companion$Empty$1) {
                objG3 = new ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$2$1(pagerStateC, mutableStateA, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, numValueOf, (Function2) objG3);
            SharedFlow sharedFlowA = FlowKt.a(productFinderOnboardingViewModel2.h);
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(productFinderOnboardingViewModel2) | composerImplV.I(d) | ((i2 & 112) == 32);
            Object objG4 = composerImplV.G();
            if (zI || objG4 == composer$Companion$Empty$1) {
                objG4 = new ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$3$1(productFinderOnboardingViewModel2, d, onAction, null);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, sharedFlowA, (Function2) objG4);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(productFinderOnboardingViewModel2);
            Object objG5 = composerImplV.G();
            if (zI2 || objG5 == composer$Companion$Empty$1) {
                objG5 = new ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$4$1(productFinderOnboardingViewModel2, null);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG5);
            b(((ProductFinderOnboardingContract.ViewState) mutableStateA.getD()).f7420a, ((ProductFinderOnboardingContract.ViewState) mutableStateA.getD()).b, pagerStateC, productFinderOnboardingViewModel2, ((ProductFinderOnboardingContract.ViewState) mutableStateA.getD()).d, modifier, composerImplV, 465920 & (i2 << 9));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(productFinderOnboardingViewModel, onAction, modifier, i, 29);
        }
    }

    public static final void b(final List list, int i, PagerState pagerState, final ProductFinderOnboardingViewModel productFinderOnboardingViewModel, final boolean z, Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4;
        PagerState pagerState2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1103731803);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.I(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= composerImplV.r(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            pagerState2 = pagerState;
            i3 |= composerImplV.n(pagerState2) ? 256 : 128;
        } else {
            pagerState2 = pagerState;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? composerImplV.n(productFinderOnboardingViewModel) : composerImplV.I(productFinderOnboardingViewModel) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.p(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerImplV.n(modifier) ? 131072 : 65536;
        }
        if ((i3 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final int i5 = i4;
            final PagerState pagerState3 = pagerState2;
            composerImpl = composerImplV;
            ScaffoldKt.a(modifier.x0(SizeKt.c), null, ComposableLambdaKt.c(-1414870102, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$ProductFinderOnboardingScreenKt.f7425a;
                        final ProductFinderOnboardingViewModel productFinderOnboardingViewModel2 = productFinderOnboardingViewModel;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1298174114, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$6.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVectorA = ArrowBackKt.a();
                                    composer3.o(5004770);
                                    ProductFinderOnboardingViewModel productFinderOnboardingViewModel3 = productFinderOnboardingViewModel2;
                                    boolean zI = composer3.I(productFinderOnboardingViewModel3);
                                    Object objG = composer3.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new b(productFinderOnboardingViewModel3, 0);
                                        composer3.A(objG);
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVectorA, "Back", (Function0) objG, null, false, 0L, composer3, 48, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final boolean z2 = z;
                        TopNavBarKt.a(null, composableLambdaImpl, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, composableLambdaImplC, ComposableLambdaKt.c(2128228309, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$6.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TopNavBar = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    composer3.o(5004770);
                                    ProductFinderOnboardingViewModel productFinderOnboardingViewModel3 = productFinderOnboardingViewModel2;
                                    boolean zI = composer3.I(productFinderOnboardingViewModel3);
                                    Object objG = composer3.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new b(productFinderOnboardingViewModel3, 1);
                                        composer3.A(objG);
                                    }
                                    composer3.l();
                                    final boolean z3 = z2;
                                    ButtonKt.c((Function0) objG, null, false, null, null, null, null, null, ComposableLambdaKt.c(-1431685102, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt.ProductFinderOnboardingScreen.6.2.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            RowScope TextButton = (RowScope) obj6;
                                            Composer composer4 = (Composer) obj7;
                                            int iIntValue2 = ((Number) obj8).intValue();
                                            Intrinsics.h(TextButton, "$this$TextButton");
                                            if ((iIntValue2 & 17) == 16 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                String upperCase = StringResources_androidKt.c(composer4, z3 ? R.string.action_done : R.string.action_skip).toUpperCase(Locale.ROOT);
                                                Intrinsics.g(upperCase, "toUpperCase(...)");
                                                TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer4).o, composer4, 0, 0, 65534);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 805306368, 510);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 14155824, 61);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-358326244, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddings = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddings, "paddings");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddings) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        Modifier modifierE = PaddingKt.e(fillElement, paddings);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, measurePolicyD, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        final List list2 = list;
                        PagerKt.a(pagerState3, fillElement, null, null, 0, BitmapDescriptorFactory.HUE_RED, null, null, false, null, null, null, ComposableLambdaKt.c(-1653311581, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$7$1$1
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                PagerScope HorizontalPager = (PagerScope) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                ((Number) obj7).intValue();
                                Intrinsics.h(HorizontalPager, "$this$HorizontalPager");
                                ProductFinderOnboardingPageKt.a((ProductFinderOnboardingItem) list2.get(iIntValue2), SizeKt.c, (Composer) obj6, 48);
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 48, 24576, 16380);
                        float f = 16;
                        Modifier modifierF = PaddingKt.f(fillElement, f);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.d, Alignment.Companion.n, composer2, 54);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierF);
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
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        int size = list2.size();
                        Modifier.Companion companion = Modifier.Companion.d;
                        PageIndicatorKt.b(size, i5, KyberEngine.KyberPolyBytes, composer2, SizeKt.u(companion, 48));
                        SpacerKt.c(ColumnScopeInstance.f948a, f, composer2, 54);
                        String strC = StringResources_androidKt.c(composer2, z ? R.string.action_done : R.string.button_next);
                        composer2.o(-1633490746);
                        ProductFinderOnboardingViewModel productFinderOnboardingViewModel2 = productFinderOnboardingViewModel;
                        boolean zI = composer2.I(productFinderOnboardingViewModel2) | composer2.n(strC);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            objG = new n(16, productFinderOnboardingViewModel2, strC);
                            composer2.A(objG);
                        }
                        composer2.l();
                        PrimaryButtonKt.a(strC, (Function0) objG, SizeKt.e(companion, 1.0f), false, false, null, null, null, null, composer2, KyberEngine.KyberPolyBytes, 1016);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, KyberEngine.KyberPolyBytes, 1018);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.inbox.ui.component.a(list, i, pagerState, productFinderOnboardingViewModel, z, modifier, i2);
        }
    }

    public static final void c(RowScope rowScope, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(916684695);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierA = rowScope.a(SizeKt.c(Modifier.Companion.d, 1.0f), 1.0f, true);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.product_finder), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composerImplV).h, TextColors.f5159a, 0L, null, null, 0L, 0L, null, null, 0, 16777214), composerImplV, 0, 0, 65534);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.foundation.a(i, 1, rowScope);
        }
    }
}
