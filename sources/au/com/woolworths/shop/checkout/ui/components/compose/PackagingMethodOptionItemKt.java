package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import au.com.woolworths.design.wx.component.FilterChipKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PackagingMethodOptionItemKt {
    public static final void a(final PackagingMethodOption data, Function1 onClick, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Intrinsics.h(data, "data");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(758039653);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierG = PaddingKt.g(Modifier.Companion.d, 4, 8);
            boolean z = data.b;
            composerImplV.o(-1633490746);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.sdui.common.alert.a(27, onClick, data);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            FilterChipKt.a(true, z, (Function0) objG, modifierG, null, 0L, 0L, null, ComposableLambdaKt.c(761772236, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.components.compose.PackagingMethodOptionItemKt$PackagingMethodOptionItem$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 12;
                        SingletonAsyncImageKt.a(data.f, null, BackgroundKt.b(SizeKt.q(PaddingKt.j(Modifier.Companion.d, 8, f, BitmapDescriptorFactory.HUE_RED, f, 4), 48), ToneColors.k, RectangleShapeKt.f1779a), null, null, composer2, 48, 2040);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(2129599012, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.components.compose.PackagingMethodOptionItemKt$PackagingMethodOptionItem$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2;
                    RowScope FilterChip = (RowScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(FilterChip, "$this$FilterChip");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer3.n(FilterChip) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer3.c()) {
                        composer3.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierB = FilterChip.b(PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, 12, 1), Alignment.Companion.k);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                        int p = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                        Modifier modifierD = ComposedModifierKt.d(composer3, modifierB);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function0);
                        } else {
                            composer3.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer3, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer3, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer3, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer3, modifierD, function24);
                        PackagingMethodOption packagingMethodOption = data;
                        String str = packagingMethodOption.c;
                        TextStyle textStyle = WxTheme.b(composer3).n;
                        FontWeight fontWeight = FontWeight.k;
                        TextKt.b(str, null, 0L, 0L, fontWeight, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer3, 196608, 0, 65502);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer3, 0);
                        int p2 = composer3.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer3, companion);
                        if (composer3.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer3.i();
                        if (composer3.getO()) {
                            composer3.K(function0);
                        } else {
                            composer3.e();
                        }
                        Updater.b(composer3, rowMeasurePolicyA, function2);
                        Updater.b(composer3, persistentCompositionLocalMapD2, function22);
                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer3, p2, function23);
                        }
                        Updater.b(composer3, modifierD2, function24);
                        TextKt.b(packagingMethodOption.d, null, 0L, 0L, fontWeight, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).r, composer3, 196608, 0, 65502);
                        String str2 = packagingMethodOption.e;
                        composer3.o(-657549500);
                        if (str2 == null) {
                            composer2 = composer3;
                        } else {
                            composer2 = composer3;
                            TextKt.b(str2, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).r, composer2, 0, 0, 65534);
                        }
                        composer2.l();
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 100666374, 48, 1776);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(data, i, 28, onClick);
        }
    }
}
