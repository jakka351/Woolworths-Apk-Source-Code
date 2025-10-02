package au.com.woolworths.shop.lists.ui.lists.banner;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
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
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.TextColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shared.ui.compose.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListsBannerKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 function0) {
        Function0 function02;
        ComposerImpl composerImplV = composer.v(-686628564);
        int i2 = (composerImplV.I(function0) ? 32 : 16) | i;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function02 = function0;
        } else {
            String strC = StringResources_androidKt.c(composerImplV, R.string.shop_lists_banner_close_button_action_description);
            final String strC2 = StringResources_androidKt.c(composerImplV, R.string.shop_lists_banner_close_button_description);
            Modifier modifierQ = SizeKt.q(modifier, 14);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(strC);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new a(strC, 12);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            function02 = function0;
            IconButtonKt.a(function02, SemanticsModifierKt.b(modifierQ, false, (Function1) objG), false, ComposableLambdaKt.c(-107648655, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.banner.ListsBannerKt$DismissIcon$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        IconKt.a(PainterResources_androidKt.a(R.drawable.ic_shop_lists_cross, 0, composer2), strC2, SizeKt.q(Modifier.Companion.d, 14), ToneColors.e, composer2, KyberEngine.KyberPolyBytes, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 14) | 3072, 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.offers.ui.a(modifier, function02, i, 6);
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, final Function0 onDismissClick) {
        int i2;
        Intrinsics.h(onDismissClick, "onDismissClick");
        ComposerImpl composerImplV = composer.v(-1429321962);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onDismissClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CardKt.a(modifier, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1771865811, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.banner.ListsBannerKt$ListsBanner$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function2 function2;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 12;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierG = PaddingKt.g(companion, 16, f);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierG);
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
                        Function2 function22 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, rowMeasurePolicyA, function22);
                        Function2 function23 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function23);
                        Function2 function24 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function24);
                        }
                        Function2 function25 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function25);
                        Modifier modifierB = IntrinsicKt.b(companion, IntrinsicSize.e);
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 48);
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
                        Updater.b(composer2, columnMeasurePolicyA, function22);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function23);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function24);
                        }
                        Updater.b(composer2, modifierD2, function25);
                        ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_shop_lists_banner, 0, composer2), null, SizeKt.q(companion, 44), null, ContentScale.Companion.f1880a, BitmapDescriptorFactory.HUE_RED, null, composer2, 25008, 104);
                        float f2 = 4;
                        Modifier modifierC = OffsetKt.c(companion, BitmapDescriptorFactory.HUE_RED, 0 - f2, 1);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 48);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierC);
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
                        Updater.b(composer2, columnMeasurePolicyA2, function22);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function23);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            function2 = function24;
                            b.z(p3, composer2, p3, function2);
                        } else {
                            function2 = function24;
                        }
                        Updater.b(composer2, modifierD3, function25);
                        BoxKt.a(BackgroundKt.b(SizeKt.g(SizeKt.e(companion, 1.0f), 2), Color.f, RectangleShapeKt.f1779a), composer2, 6);
                        Function2 function26 = function2;
                        SurfaceKt.a(PaddingKt.h(companion, 8, BitmapDescriptorFactory.HUE_RED, 2), RoundedCornerShapeKt.b(f2), AccentColors.c, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$ListsBannerKt.f12325a, composer2, 1572870, 56);
                        composer2.f();
                        composer2.f();
                        Modifier modifierJ = PaddingKt.j(RowScopeInstance.f974a.a(companion, 1.0f, true), f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                        ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, Alignment.Companion.m, composer2, 0);
                        int p4 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer2.d();
                        Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierJ);
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
                        Updater.b(composer2, columnMeasurePolicyA3, function22);
                        Updater.b(composer2, persistentCompositionLocalMapD4, function23);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p4))) {
                            b.z(p4, composer2, p4, function26);
                        }
                        Updater.b(composer2, modifierD4, function25);
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.shop_lists_banner_title), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composer2).n, 0L, TextUnitKt.c(16), FontWeight.k, null, 0L, 0L, null, null, 0, 16777209), composer2, 0, 0, 65534);
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.shop_lists_banner_subtitle), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), TextColors.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).r, composer2, 48, 0, 65528);
                        composer2.f();
                        ListsBannerKt.a(6, composer2, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), onDismissClick);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572870, 62);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(onDismissClick, modifier, i, 12);
        }
    }
}
