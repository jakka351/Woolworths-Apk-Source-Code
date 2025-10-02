package au.com.woolworths.feature.shop.instore.navigation.map.ui.permissions;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.compose.d;
import au.com.woolworths.shared.ui.compose.FullScreenOverlayKt;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LocationPermissionsAccessRationaleScreenKt {
    public static final void a(final Function0 onGoToSettings, final Function0 onNoThanks, Function0 onShown, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(onGoToSettings, "onGoToSettings");
        Intrinsics.h(onNoThanks, "onNoThanks");
        Intrinsics.h(onShown, "onShown");
        ComposerImpl composerImplV = composer.v(2029072212);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onGoToSettings) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onNoThanks) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onShown) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            long jB = ColorKt.b(1711276032);
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(1172517219, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.permissions.LocationPermissionsAccessRationaleScreenKt$LocationPermissionsAccessRationaleScreen$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope FullScreenOverlay = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(FullScreenOverlay, "$this$FullScreenOverlay");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierE = SizeKt.e(PaddingKt.f(companion, f), 1.0f);
                        BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                        MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
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
                            b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        float f2 = 8;
                        Modifier modifierE2 = SizeKt.e(PaddingKt.f(BackgroundKt.b(companion, Color.f, RoundedCornerShapeKt.b(f2)), f), 1.0f);
                        MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierE2);
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
                        Updater.b(composer2, measurePolicyD2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        Modifier modifierE3 = SizeKt.e(companion, 1.0f);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composer2, 54);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierE3);
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
                        ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_tracking_heading, 0, composer2), null, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, f, 5), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 432, 120);
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.share_your_location_to_access), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).v, composer2, 48, 0, 65020);
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.turn_on_location_permissions), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 24, 7), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).l, composer2, 48, 0, 65020);
                        PrimaryButtonKt.a(StringResources_androidKt.c(composer2, R.string.go_to_settings), onGoToSettings, SizeKt.e(companion, 1.0f), false, false, null, null, null, null, composer2, KyberEngine.KyberPolyBytes, 1016);
                        TertiaryButtonKt.a(StringResources_androidKt.c(composer2, R.string.no_thanks), onNoThanks, SizeKt.e(companion, 1.0f), false, false, null, null, composer2, KyberEngine.KyberPolyBytes, 120);
                        composer2.f();
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            Modifier.Companion companion = Modifier.Companion.d;
            FullScreenOverlayKt.a(jB, companion, composableLambdaImplC, composerImplV, 438);
            composerImplV.o(5004770);
            boolean z = (i3 & 896) == 256;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new LocationPermissionsAccessRationaleScreenKt$LocationPermissionsAccessRationaleScreen$2$1(onShown, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(onGoToSettings, onNoThanks, (Object) onShown, modifier2, i, 19);
        }
    }
}
