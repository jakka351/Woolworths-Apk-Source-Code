package au.com.woolworths.feature.shop.countryselector.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.shared.instore.wifi.ui.k;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorContract;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"country-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MoreCountrySelectorScreenKt {
    public static final void a(int i, int i2, ColorFilter colorFilter, Composer composer, int i3, int i4) {
        ColorFilter colorFilter2;
        int i5;
        ColorFilter colorFilter3;
        ComposerImpl composerImplV = composer.v(2033848705);
        int i6 = i3 | (composerImplV.r(i) ? 4 : 2) | (composerImplV.r(i2) ? 32 : 16);
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 = i6 | KyberEngine.KyberPolyBytes;
            colorFilter2 = colorFilter;
        } else {
            colorFilter2 = colorFilter;
            i5 = i6 | (composerImplV.n(colorFilter2) ? 256 : 128);
        }
        if ((i5 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            colorFilter3 = colorFilter2;
        } else {
            ColorFilter colorFilter4 = i7 != 0 ? null : colorFilter2;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(12), Alignment.Companion.j, composerImplV, 6);
            int i8 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                b.B(i8, composerImplV, i8, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ImageKt.a(PainterResources_androidKt.a(i, i5 & 14, composerImplV), null, SizeKt.q(companion, 32), null, null, BitmapDescriptorFactory.HUE_RED, colorFilter4, composerImplV, ((i5 << 12) & 3670016) | 432, 56);
            TextKt.a(StringResources_androidKt.c(composerImplV, i2), CoreTheme.f(composerImplV).f5120a.b.f5123a, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            composerImplV = composerImplV;
            composerImplV.V(true);
            colorFilter3 = colorFilter4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new k(i, i2, colorFilter3, i3, i4);
        }
    }

    public static final void b(final CountrySelectorContract.ViewStateBySource.MoreCountrySelectorViewState viewState, final Function1 onRegionSelected, Function0 onConfirmRegionSelected, Function0 onCancelRegionSelected, final Function0 onBack, Composer composer, int i) {
        int i2;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onRegionSelected, "onRegionSelected");
        Intrinsics.h(onConfirmRegionSelected, "onConfirmRegionSelected");
        Intrinsics.h(onCancelRegionSelected, "onCancelRegionSelected");
        Intrinsics.h(onBack, "onBack");
        ComposerImpl composerImplV = composer.v(103088483);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onRegionSelected) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onConfirmRegionSelected) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onCancelRegionSelected) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onBack) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(PaddingKt.e(SizeKt.c, WindowInsetsKt.d(WindowInsets_androidKt.b(composerImplV), composerImplV)), ComposableLambdaKt.c(152409895, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.countryselector.ui.MoreCountrySelectorScreenKt$MoreCountrySelectorScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.activity_country_selector_title);
                        Modifier modifierA = TestTagKt.a(SizeKt.e(Modifier.Companion.d, 1.0f), "CountrySelectorTitleLabel");
                        final Function0 function0 = onBack;
                        TopNavBarKt.a(strC, modifierA, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(1815189785, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.countryselector.ui.MoreCountrySelectorScreenKt$MoreCountrySelectorScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).e.b, StringResources_androidKt.c(composer3, R.string.back), function0, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663344, 764);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(446050352, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.countryselector.ui.MoreCountrySelectorScreenKt$MoreCountrySelectorScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        float f = 16;
                        Modifier modifierX0 = PaddingKt.j(PaddingKt.h(PaddingKt.e(companion, paddingValues), f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13).x0(SizeKt.c);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(24);
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(spacedAlignedG, horizontal, composer2, 6);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierX0);
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
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        CountrySelectorUiKt.b(viewState.f7036a, onRegionSelected, SizeKt.e(companion, 1.0f), composer2, KyberEngine.KyberPolyBytes, 0);
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(28);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierB = SemanticsModifierKt.b(modifierE, true, (Function1) objG);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.g(f), horizontal, composer2, 6);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierB);
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
                        Updater.b(composer2, columnMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        TextKt.a(StringResources_androidKt.c(composer2, R.string.more_country_selector_title), CoreTheme.f(composer2).d.b.f5131a, null, CoreTheme.b(composer2).f4782a.d.e.b, null, 0, 0, false, 0, null, composer2, 0, 1012);
                        MoreCountrySelectorScreenKt.a(R.drawable.wapple_grey, R.string.more_country_selector_shopper_label, ColorFilter.Companion.a(CoreTheme.b(composer2).f4782a.f4783a.b.b), composer2, 0, 0);
                        MoreCountrySelectorScreenKt.a(R.drawable.ic_rewards_card_small, R.string.more_country_selector_rewards_label, null, composer2, 0, 4);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582960, 124);
            composerImplV.o(283869030);
            if (viewState.c) {
                ConfirmDialogKt.a(viewState.f7036a, viewState.b, onConfirmRegionSelected, onCancelRegionSelected, composerImplV, i2 & 8064);
            }
            composerImplV.V(false);
            if (viewState.d) {
                LoadingScreenKt.a(composerImplV, 0);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(viewState, onRegionSelected, onConfirmRegionSelected, onCancelRegionSelected, onBack, i, 8);
        }
    }
}
