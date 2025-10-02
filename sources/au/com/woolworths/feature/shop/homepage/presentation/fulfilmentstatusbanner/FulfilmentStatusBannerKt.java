package au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
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
public final class FulfilmentStatusBannerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7249a = 16;
    public static final float b = 8;
    public static final float c = 12;

    public static final void a(final FulfilmentStatusBannerData fulfilmentStatusBannerData, Function0 clickListener, Composer composer, int i) {
        Intrinsics.h(clickListener, "clickListener");
        ComposerImpl composerImplV = composer.v(496130929);
        int i2 = i | (composerImplV.n(fulfilmentStatusBannerData) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(clickListener) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SurfaceKt.b(clickListener, SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), false, RoundedCornerShapeKt.b(b), WxTheme.a(composerImplV).i(), WxTheme.a(composerImplV).e(), null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-1453162230, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner.FulfilmentStatusBannerKt$FulfilmentStatusBanner$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierH = PaddingKt.h(SizeKt.x(companion, Alignment.Companion.k, false), FulfilmentStatusBannerKt.c, BitmapDescriptorFactory.HUE_RED, 2);
                        float f = FulfilmentStatusBannerKt.b;
                        Modifier modifierH2 = PaddingKt.h(modifierH, BitmapDescriptorFactory.HUE_RED, f, 1);
                        Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$SpaceBetween$1, vertical, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierH2);
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
                        Updater.b(composer2, rowMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        IconKt.a(PainterResources_androidKt.a(R.drawable.ic_changes, 0, composer2), null, null, 0L, composer2, 48, 12);
                        Modifier modifierE = SizeKt.e(PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 1.0f);
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.f934a, vertical, composer2, 48);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierE);
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
                        Updater.b(composer2, rowMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                        Modifier modifierA = rowScopeInstance.a(companion, 2.75f, true);
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, Alignment.Companion.m, composer2, 0);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierA);
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
                        Updater.b(composer2, persistentCompositionLocalMapD3, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            b.z(p3, composer2, p3, function23);
                        }
                        Updater.b(composer2, modifierD3, function24);
                        Modifier modifierA2 = SizeKt.A(companion, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false);
                        FulfilmentStatusBannerData fulfilmentStatusBannerData2 = fulfilmentStatusBannerData;
                        TextKt.b(fulfilmentStatusBannerData2.f7186a, modifierA2, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).n, composer2, 48, 0, 65532);
                        composer2.f();
                        Modifier modifierJ = PaddingKt.j(rowScopeInstance.a(companion, 1.25f, true), FulfilmentStatusBannerKt.f7249a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, Alignment.Companion.o, composer2, 48);
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
                        Updater.b(composer2, columnMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD4, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p4))) {
                            b.z(p4, composer2, p4, function23);
                        }
                        Updater.b(composer2, modifierD4, function24);
                        TextKt.b(fulfilmentStatusBannerData2.b, null, AccentColors.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).q, composer2, 0, KyberEngine.KyberPolyBytes, 61434);
                        composer2.f();
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i2 >> 3) & 14) | 805306416, 452);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(fulfilmentStatusBannerData, i, 2, clickListener);
        }
    }
}
