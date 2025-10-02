package au.com.woolworths.shop.checkout.ui.summary.common;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.experimental.chip.c;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.DestructiveLoadingButtonKt;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.SecondaryLoadingButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DiscountItemUiKt {
    public static final void a(final String str, final String str2, final String str3, final String str4, final boolean z, final Boolean bool, final int i, final Color color, final Function0 onApplyDiscount, final Function0 onRemoveDiscount, Modifier modifier, Composer composer, int i2) {
        BorderStroke borderStrokeA;
        Modifier modifier2;
        ComposerImpl composerImpl;
        Intrinsics.h(onApplyDiscount, "onApplyDiscount");
        Intrinsics.h(onRemoveDiscount, "onRemoveDiscount");
        ComposerImpl composerImplV = composer.v(-59019201);
        int i3 = i2 | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.n(str3) ? 256 : 128) | (composerImplV.n(str4) ? 2048 : 1024) | (composerImplV.p(z) ? 16384 : 8192) | (composerImplV.n(bool) ? 131072 : 65536) | (composerImplV.r(i) ? 1048576 : 524288) | (composerImplV.n(color) ? 8388608 : 4194304);
        if ((i2 & 100663296) == 0) {
            i3 |= composerImplV.I(onApplyDiscount) ? 67108864 : 33554432;
        }
        if (((i3 | (composerImplV.I(onRemoveDiscount) ? 536870912 : 268435456)) & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            if (z) {
                composerImplV.o(-1598967512);
                borderStrokeA = BorderStrokeKt.a(CoreTheme.b(composerImplV).f4782a.b.f4789a.f4790a, 2);
                composerImplV.V(false);
            } else {
                composerImplV.o(-1598871536);
                borderStrokeA = BorderStrokeKt.a(CoreTheme.b(composerImplV).e.b.e, 1);
                composerImplV.V(false);
            }
            modifier2 = modifier;
            composerImpl = composerImplV;
            SurfaceKt.b(SizeKt.e(modifier2, 1.0f), RoundedCornerShapeKt.b(12), 0L, 0L, borderStrokeA, null, ComposableLambdaKt.c(1589038971, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.common.DiscountItemUiKt$DiscountItemUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierI = PaddingKt.i(companion, f, f, f, 14);
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierI);
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
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        composer2.o(-1780939423);
                        long j = color.f1766a;
                        composer2.l();
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final String str5 = str2;
                        final int i4 = i;
                        final String str6 = str;
                        final boolean z2 = z;
                        CardKt.a(modifierE, null, j, 0L, coreElevation, null, ComposableLambdaKt.c(-2117004686, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.common.DiscountItemUiKt$DiscountItemUi$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Composer composer3;
                                ColumnScope Card = (ColumnScope) obj3;
                                Composer composer4 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(Card, "$this$Card");
                                if ((iIntValue & 17) == 16 && composer4.c()) {
                                    composer4.j();
                                } else {
                                    Modifier.Companion companion2 = Modifier.Companion.d;
                                    Modifier modifierF = PaddingKt.f(companion2, 16);
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer4, 48);
                                    int p2 = composer4.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer4.d();
                                    Modifier modifierD2 = ComposedModifierKt.d(composer4, modifierF);
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
                                    Function2 function25 = ComposeUiNode.Companion.g;
                                    Updater.b(composer4, rowMeasurePolicyA, function25);
                                    Function2 function26 = ComposeUiNode.Companion.f;
                                    Updater.b(composer4, persistentCompositionLocalMapD2, function26);
                                    Function2 function27 = ComposeUiNode.Companion.j;
                                    if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p2))) {
                                        b.z(p2, composer4, p2, function27);
                                    }
                                    Function2 function28 = ComposeUiNode.Companion.d;
                                    Updater.b(composer4, modifierD2, function28);
                                    ImageKt.a(PainterResources_androidKt.a(i4, 0, composer4), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer4, 48, 124);
                                    String str7 = str5;
                                    int length = str7.length();
                                    String str8 = str6;
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                                    if (length == 0) {
                                        composer4.o(901752829);
                                        Modifier modifierA = rowScopeInstance.a(PaddingKt.j(companion2, 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 1.0f, true);
                                        TextStyle textStyle = CoreTheme.f(composer4).f5120a.b.c;
                                        composer3 = composer4;
                                        TextKt.a(str8, textStyle, modifierA, 0L, null, 0, 0, false, 0, null, composer3, 0, 1016);
                                        composer3.l();
                                    } else {
                                        composer4.o(902110383);
                                        Modifier modifierA2 = rowScopeInstance.a(PaddingKt.j(companion2, 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 1.0f, true);
                                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer4, 0);
                                        int p3 = composer4.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer4.d();
                                        Modifier modifierD3 = ComposedModifierKt.d(composer4, modifierA2);
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
                                        Updater.b(composer4, columnMeasurePolicyA2, function25);
                                        Updater.b(composer4, persistentCompositionLocalMapD3, function26);
                                        if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p3))) {
                                            b.z(p3, composer4, p3, function27);
                                        }
                                        Updater.b(composer4, modifierD3, function28);
                                        TextStyle textStyle2 = CoreTheme.f(composer4).f5120a.b.c;
                                        composer3 = composer4;
                                        TextKt.a(str8, textStyle2, null, 0L, null, 0, 0, false, 0, null, composer3, 0, 1020);
                                        TextKt.a(str7, CoreTheme.f(composer3).f5120a.c.f5124a, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, null, 0, 0, false, 0, null, composer3, KyberEngine.KyberPolyBytes, 1016);
                                        composer3.f();
                                        composer3.l();
                                    }
                                    composer3.o(167670627);
                                    if (z2) {
                                        IconKt.b(CoreTheme.e(composer3).i.k, null, null, CoreTheme.b(composer3).f4782a.d.d.f4801a, composer3, 48, 4);
                                    }
                                    composer3.l();
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1572870, 42);
                        Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.l, composer2, 48);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierJ);
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
                        Updater.b(composer2, rowMeasurePolicyA, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        Modifier modifierJ2 = PaddingKt.j(RowScopeInstance.f974a.a(companion, 1.0f, true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composer2, 0);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierJ2);
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
                        Updater.b(composer2, persistentCompositionLocalMapD3, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            b.z(p3, composer2, p3, function23);
                        }
                        Updater.b(composer2, modifierD3, function24);
                        TextKt.a(str3, CoreTheme.f(composer2).b.f5125a.f5126a, null, CoreTheme.b(composer2).e.d.b, null, 0, 0, false, 0, null, composer2, 0, 1012);
                        TextKt.a(str4, CoreTheme.f(composer2).b.f5125a.b, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composer2).e.d.b, null, 0, 0, false, 0, null, composer2, KyberEngine.KyberPolyBytes, 1008);
                        composer2.f();
                        boolean zC = Intrinsics.c(bool, Boolean.TRUE);
                        if (z2) {
                            composer2.o(-840697058);
                            DestructiveLoadingButtonKt.a(StringResources_androidKt.c(composer2, R.string.remove), onRemoveDiscount, zC, PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), null, null, composer2, 3072);
                            composer2.l();
                        } else {
                            composer2.o(-840370814);
                            SecondaryLoadingButtonKt.a(StringResources_androidKt.c(composer2, R.string.apply), onApplyDiscount, zC, PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), null, null, composer2, 3072);
                            composer2.l();
                        }
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 44);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(str, str2, str3, str4, z, bool, i, color, onApplyDiscount, onRemoveDiscount, modifier2, i2);
        }
    }
}
