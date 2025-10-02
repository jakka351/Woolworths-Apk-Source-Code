package au.com.woolworths.feature.shop.homepage.presentation.order;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.component.stable.button.internal.a;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.feature.shop.myorders.orders.data.OrderStatus;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderCardUIKt {
    public static final void a(FulfilmentStatusBannerData fulfilmentStatusBannerData, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(437112892);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(fulfilmentStatusBannerData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            long jE = WxTheme.a(composerImplV).e();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(BackgroundKt.b(companion, jE, rectangleShapeKt$RectangleShape$1), 12, 8);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
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
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextStyle textStyle = WxTheme.b(composerImplV).n;
            String str = fulfilmentStatusBannerData.f7186a;
            long jE2 = WxTheme.a(composerImplV).e();
            modifier2 = companion;
            TextKt.b(str, null, jE2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, 0, 0, 65530);
            composerImpl = composerImplV;
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(fulfilmentStatusBannerData, i, 5, modifier2);
        }
    }

    public static final void b(FulfilmentStatusBannerData fulfilmentStatusBannerData, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        FulfilmentStatusBannerData fulfilmentStatusBannerData2 = fulfilmentStatusBannerData;
        ComposerImpl composerImplV = composer.v(799789316);
        int i2 = i | (composerImplV.n(fulfilmentStatusBannerData2) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 8;
            Modifier modifierA = ClipKt.a(SizeKt.e(companion, 1.0f), RoundedCornerShapeKt.b(f));
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(6, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierG = PaddingKt.g(BackgroundKt.b(ClickableKt.d(modifierA, false, null, null, (Function0) objG, 7), WxTheme.a(composerImplV).i(), RectangleShapeKt.f1779a), 12, f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            IconKt.a(PainterResources_androidKt.a(R.drawable.ic_changes, 0, composerImplV), null, null, WxTheme.a(composerImplV).e(), composerImplV, 48, 4);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            SpacerKt.d(rowScopeInstance, f, composerImplV, 54);
            TextKt.b(fulfilmentStatusBannerData2.f7186a, rowScopeInstance.a(companion, 1.0f, true), WxTheme.a(composerImplV).e(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65528);
            SpacerKt.d(rowScopeInstance, 16, composerImplV, 54);
            fulfilmentStatusBannerData2 = fulfilmentStatusBannerData;
            TextKt.b(fulfilmentStatusBannerData2.b, null, AccentColors.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).q, composerImplV, 0, KyberEngine.KyberPolyBytes, 61434);
            composerImplV = composerImplV;
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(fulfilmentStatusBannerData2, function0, modifier2, i, 20);
        }
    }

    public static final void c(final OrderCardData orderCardData, Function0 onOrderCardClick, Function0 onOrderCardImpression, final Function0 onFulfilmentStatusBannerClick, Modifier modifier, FulfilmentStatusBannerData fulfilmentStatusBannerData, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        ComposerImpl composerImpl;
        Modifier modifier3;
        Intrinsics.h(orderCardData, "orderCardData");
        Intrinsics.h(onOrderCardClick, "onOrderCardClick");
        Intrinsics.h(onOrderCardImpression, "onOrderCardImpression");
        Intrinsics.h(onFulfilmentStatusBannerClick, "onFulfilmentStatusBannerClick");
        ComposerImpl composerImplV = composer.v(-358793344);
        int i4 = (composerImplV.I(orderCardData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= composerImplV.I(onOrderCardClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onOrderCardImpression) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.I(onFulfilmentStatusBannerClick) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 16384 : 8192);
        }
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            if (i5 != 0) {
                modifier2 = companion;
            }
            composerImplV.o(5004770);
            boolean z = (i3 & 896) == 256;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new OrderCardUIKt$OrderCard$1$1(onOrderCardImpression, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
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
                b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifier4 = modifier2;
            CardKt.a(ClickableKt.d(modifier4, false, null, null, onOrderCardClick, 7), null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-2125603495, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.order.OrderCardUIKt$OrderCard$2$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function2 function22;
                    Function0 function02;
                    Function2 function23;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 8;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierF = PaddingKt.f(companion2, f);
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierF);
                        ComposeUiNode.e3.getClass();
                        Function0 function03 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Function2 function24 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA2, function24);
                        Function2 function25 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function25);
                        Function2 function26 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function26);
                        }
                        Function2 function27 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD2, function27);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        BiasAlignment.Vertical vertical = Alignment.Companion.j;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composer2, 0);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, companion2);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA, function24);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function25);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function26);
                        }
                        Updater.b(composer2, modifierD3, function27);
                        float f2 = 4;
                        Modifier modifierQ = SizeKt.q(PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 24);
                        OrderCardData orderCardData2 = orderCardData;
                        OrderStatus orderStatus = orderCardData2.c;
                        FulfilmentStatusBannerData fulfilmentStatusBannerData2 = orderCardData2.j;
                        ImageKt.a(PainterResources_androidKt.a(orderStatus.h, 0, composer2), null, modifierQ, null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 432, 120);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                        SpacerKt.d(rowScopeInstance, f2, composer2, 54);
                        ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD4 = ComposedModifierKt.d(composer2, companion2);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA3, function24);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function25);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            function22 = function26;
                            b.z(p3, composer2, p3, function22);
                        } else {
                            function22 = function26;
                        }
                        Updater.b(composer2, modifierD4, function27);
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composer2, 0);
                        int p4 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer2.d();
                        Modifier modifierD5 = ComposedModifierKt.d(composer2, companion2);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function03);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA2, function24);
                        Updater.b(composer2, persistentCompositionLocalMapD4, function25);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p4))) {
                            b.z(p4, composer2, p4, function22);
                        }
                        Updater.b(composer2, modifierD5, function27);
                        Function2 function28 = function22;
                        TextKt.b(orderCardData2.f7204a, PaddingKt.j(rowScopeInstance.a(companion2, 1.0f, true), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).m, composer2, 0, 0, 65532);
                        Modifier modifierF2 = PaddingKt.f(BackgroundKt.b(companion2, ToneColors.j, RoundedCornerShapeKt.b(f2)), f2);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p5 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD5 = composer2.d();
                        Modifier modifierD6 = ComposedModifierKt.d(composer2, modifierF2);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            function02 = function03;
                            composer2.K(function02);
                        } else {
                            function02 = function03;
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, function24);
                        Updater.b(composer2, persistentCompositionLocalMapD5, function25);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p5))) {
                            function23 = function28;
                            b.z(p5, composer2, p5, function23);
                        } else {
                            function23 = function28;
                        }
                        Updater.b(composer2, modifierD6, function27);
                        Function2 function29 = function23;
                        Function0 function04 = function02;
                        TextKt.b(orderCardData2.e, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).r, composer2, 0, 0, 65534);
                        composer2.f();
                        composer2.f();
                        TextKt.b(orderCardData2.b, null, Color.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).r, composer2, KyberEngine.KyberPolyBytes, 0, 65530);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
                        SpacerKt.c(columnScopeInstance, f, composer2, 54);
                        RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(arrangement$Start$1, vertical, composer2, 0);
                        int p6 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD6 = composer2.d();
                        Modifier modifierD7 = ComposedModifierKt.d(composer2, companion2);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function04);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA3, function24);
                        Updater.b(composer2, persistentCompositionLocalMapD6, function25);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p6))) {
                            b.z(p6, composer2, p6, function29);
                        }
                        Updater.b(composer2, modifierD7, function27);
                        TextKt.b(orderCardData2.f, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).n, composer2, 0, 0, 65534);
                        SpacerKt.d(rowScopeInstance, f2, composer2, 54);
                        TextKt.b(orderCardData2.g, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).o, composer2, 0, 0, 65534);
                        composer2.f();
                        TextKt.b(orderCardData2.h, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).n, composer2, 0, 0, 65534);
                        composer2.f();
                        composer2.f();
                        composer2.o(1817864309);
                        if (fulfilmentStatusBannerData2 != null) {
                            SpacerKt.c(columnScopeInstance, f, composer2, 54);
                            OrderCardUIKt.b(fulfilmentStatusBannerData2, onFulfilmentStatusBannerClick, null, composer2, 0);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 62);
            composerImpl = composerImplV;
            composerImpl.o(591278249);
            if (fulfilmentStatusBannerData != null && orderCardData.j == null) {
                SpacerKt.c(ColumnScopeInstance.f948a, 8, composerImpl, 54);
                a(fulfilmentStatusBannerData, null, composerImpl, 6);
            }
            composerImpl.V(false);
            composerImpl.V(true);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.a(orderCardData, onOrderCardClick, onOrderCardImpression, onFulfilmentStatusBannerClick, modifier3, fulfilmentStatusBannerData, i, i2);
        }
    }
}
