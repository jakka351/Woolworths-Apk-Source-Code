package au.com.woolworths.feature.shop.shippingcalculator.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopSearchBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.feature.shop.shippingcalculator.ScreenState;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shipping-calculator_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShippingCalculatorScreenKt {
    public static final void a(String str, String str2, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-884441439);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.a(str, CoreTheme.f(composerImplV).d.c.b, null, CoreTheme.b(composerImplV).e.d.d, null, 3, 0, false, 0, null, composerImplV, i2 & 14, 980);
            TextKt.a(str2, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composerImplV).e.d.d, null, 3, 0, false, 0, null, composerImplV, ((i2 >> 3) & 14) | KyberEngine.KyberPolyBytes, 976);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, str2, modifier, i, 0);
        }
    }

    public static final void b(final ShippingCalculatorContract.ViewState state, final Function0 onNavigateUp, final Function1 onSearchTextChanged, final Function2 onSuburbSelected, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(state, "state");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onSearchTextChanged, "onSearchTextChanged");
        Intrinsics.h(onSuburbSelected, "onSuburbSelected");
        ComposerImpl composerImplV = composer.v(1607894121);
        int i2 = (composerImplV.n(state) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onNavigateUp) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onSearchTextChanged) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onSuburbSelected) ? 2048 : 1024;
        }
        if (((i2 | 24576) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1304428347, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.shippingcalculator.ui.ShippingCalculatorScreenKt$ShippingCalculatorScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function1 function1 = onSearchTextChanged;
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(1878468489, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.shippingcalculator.ui.ShippingCalculatorScreenKt$ShippingCalculatorScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10, BitmapDescriptorFactory.HUE_RED, 11);
                                    String strC = StringResources_androidKt.c(composer3, R.string.shipping_calculator_search_placeholder);
                                    final Function0 function02 = function0;
                                    TopSearchBarKt.a(strC, modifierJ, false, "", 0L, 0L, null, null, ComposableLambdaKt.c(1880576916, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.shippingcalculator.ui.ShippingCalculatorScreenKt.ShippingCalculatorScreen.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                ImageVector imageVector = CoreTheme.e(composer4).e.b;
                                                String strC2 = StringResources_androidKt.c(composer4, R.string.content_description_back_button);
                                                composer4.o(5004770);
                                                Function0 function03 = function02;
                                                boolean zN = composer4.n(function03);
                                                Object objG = composer4.G();
                                                if (zN || objG == Composer.Companion.f1624a) {
                                                    objG = new k(6, function03);
                                                    composer4.A(objG);
                                                }
                                                composer4.l();
                                                IconButtonKt.c(imageVector, strC2, (Function0) objG, null, false, null, 0L, composer4, 0, 120);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), function1, composer3, 100666416, 244);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final ShippingCalculatorContract.ViewState viewState = state;
                        final Function2 function2 = onSuburbSelected;
                        ScaffoldKt.a(null, composableLambdaImplC, null, null, 0L, null, ComposableLambdaKt.c(-1118500142, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.shippingcalculator.ui.ShippingCalculatorScreenKt$ShippingCalculatorScreen$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Composer composer3;
                                PaddingValues paddingVals = (PaddingValues) obj3;
                                Composer composer4 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(paddingVals, "paddingVals");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer4.n(paddingVals) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer4.c()) {
                                    composer4.j();
                                } else {
                                    Function1 function1A = InspectableValueKt.a();
                                    WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1 windowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1 = new WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1(3);
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierE = PaddingKt.e(ComposedModifierKt.a(companion, function1A, windowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1), paddingVals);
                                    float f = 16;
                                    Modifier modifierH = PaddingKt.h(modifierE, f, BitmapDescriptorFactory.HUE_RED, 2);
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer4, 0);
                                    int p = composer4.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer4.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer4, modifierH);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function02 = ComposeUiNode.Companion.b;
                                    if (composer4.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer4.i();
                                    if (composer4.getO()) {
                                        composer4.K(function02);
                                    } else {
                                        composer4.e();
                                    }
                                    Function2 function22 = ComposeUiNode.Companion.g;
                                    Updater.b(composer4, columnMeasurePolicyA, function22);
                                    Function2 function23 = ComposeUiNode.Companion.f;
                                    Updater.b(composer4, persistentCompositionLocalMapD, function23);
                                    Function2 function24 = ComposeUiNode.Companion.j;
                                    if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                        b.z(p, composer4, p, function24);
                                    }
                                    Function2 function25 = ComposeUiNode.Companion.d;
                                    Updater.b(composer4, modifierD, function25);
                                    ShippingCalculatorContract.ViewState viewState2 = viewState;
                                    ScreenState screenState = viewState2.f8098a;
                                    if (Intrinsics.c(screenState, ScreenState.Init.f8094a)) {
                                        composer4.o(53281354);
                                        composer3 = composer4;
                                        TextKt.a(StringResources_androidKt.c(composer4, R.string.shipping_calculator_empty_screen), CoreTheme.f(composer4).f5120a.f5121a.f5122a, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composer4).e.d.d, null, 3, 0, false, 0, null, composer3, KyberEngine.KyberPolyBytes, 976);
                                        composer3.l();
                                    } else {
                                        composer3 = composer4;
                                        if (Intrinsics.c(screenState, ScreenState.Empty.f8092a)) {
                                            composer3.o(53704256);
                                            ShippingCalculatorScreenKt.a(StringResources_androidKt.c(composer3, R.string.shipping_calculator_no_results_title), StringResources_androidKt.c(composer3, R.string.shipping_calculator_no_results_description), PaddingKt.g(SizeKt.e(companion, 1.0f), f, 32), composer3, KyberEngine.KyberPolyBytes);
                                            composer3.l();
                                        } else if (screenState instanceof ScreenState.Error) {
                                            composer3.o(54230512);
                                            ScreenState.Error error = (ScreenState.Error) screenState;
                                            ShippingCalculatorScreenKt.a(StringResources_androidKt.c(composer3, error.f8093a), StringResources_androidKt.c(composer3, error.b), PaddingKt.g(SizeKt.e(companion, 1.0f), f, 32), composer3, KyberEngine.KyberPolyBytes);
                                            composer3.l();
                                        } else if (Intrinsics.c(screenState, ScreenState.Loading.f8095a)) {
                                            composer3.o(54706331);
                                            FillElement fillElement = SizeKt.c;
                                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                            int p2 = composer3.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                            Modifier modifierD2 = ComposedModifierKt.d(composer3, fillElement);
                                            if (composer3.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer3.i();
                                            if (composer3.getO()) {
                                                composer3.K(function02);
                                            } else {
                                                composer3.e();
                                            }
                                            Updater.b(composer3, measurePolicyD, function22);
                                            Updater.b(composer3, persistentCompositionLocalMapD2, function23);
                                            if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                                b.z(p2, composer3, p2, function24);
                                            }
                                            Updater.b(composer3, modifierD2, function25);
                                            CircularProgressIndicatorKt.b(BoxScopeInstance.f944a.g(companion, Alignment.Companion.e), 0L, BitmapDescriptorFactory.HUE_RED, 0, composer3, 0, 14);
                                            composer3.f();
                                            composer3.l();
                                        } else {
                                            if (!(screenState instanceof ScreenState.Success)) {
                                                throw au.com.woolworths.android.onesite.a.x(composer3, -1383754005);
                                            }
                                            composer3.o(55108773);
                                            FillElement fillElement2 = SizeKt.c;
                                            composer3.o(-1633490746);
                                            boolean zN = composer3.n(viewState2);
                                            Function2 function26 = function2;
                                            boolean zN2 = zN | composer3.n(function26);
                                            Object objG = composer3.G();
                                            if (zN2 || objG == Composer.Companion.f1624a) {
                                                objG = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(16, viewState2, function26);
                                                composer3.A(objG);
                                            }
                                            composer3.l();
                                            LazyDslKt.b(fillElement2, null, null, false, null, null, null, false, null, (Function1) objG, composer3, 6, 510);
                                            composer3 = composer3;
                                            composer3.l();
                                        }
                                    }
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 12582960, 125);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(state, onNavigateUp, onSearchTextChanged, onSuburbSelected, modifier2, i, 14);
        }
    }
}
