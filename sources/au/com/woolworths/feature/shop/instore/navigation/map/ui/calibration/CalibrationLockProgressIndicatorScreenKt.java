package au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration;

import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.wx.component.button.ButtonDefaults;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import au.com.woolworths.shared.ui.compose.FullScreenOverlayKt;
import au.com.woolworths.shared.ui.compose.GradientHorizontalProgressIndicatorKt;
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

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "progress", "instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CalibrationLockProgressIndicatorScreenKt {
    public static final void a(final float f, final Function0 onCancelCalibration, final Function1 onTrackOriientAppEvent, Modifier modifier, final boolean z, Composer composer, final int i) {
        Intrinsics.h(onCancelCalibration, "onCancelCalibration");
        Intrinsics.h(onTrackOriientAppEvent, "onTrackOriientAppEvent");
        ComposerImpl composerImplV = composer.v(1587797431);
        int i2 = (composerImplV.q(f) ? 4 : 2) | i | (composerImplV.I(onCancelCalibration) ? 32 : 16) | (composerImplV.I(onTrackOriientAppEvent) ? 256 : 128) | 3072;
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean z2 = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.contentpage.ui.c(17, onTrackOriientAppEvent);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.c(Unit.f24250a, (Function1) objG, composerImplV);
            long jD = ColorKt.d(z ? 4278190080L : 3841982464L);
            final Modifier.Companion companion = Modifier.Companion.d;
            FullScreenOverlayKt.a(jD, PaddingKt.g(companion, 48, 24), ComposableLambdaKt.c(731242438, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration.CalibrationLockProgressIndicatorScreenKt$CalibrationLockProgressIndicatorScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope FullScreenOverlay = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(FullScreenOverlay, "$this$FullScreenOverlay");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        Arrangement$SpaceEvenly$1 arrangement$SpaceEvenly$1 = Arrangement.f;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$SpaceEvenly$1, horizontal, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, fillElement);
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
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierA = columnScopeInstance.a(companion2, 3.0f, true);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.e, horizontal, composer2, 54);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierA);
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
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        Modifier modifierL = SizeKt.l(companion2, 315, 250);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p3 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierL);
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
                        Updater.b(composer2, measurePolicyD, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD3, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                            androidx.camera.core.impl.b.z(p3, composer2, p3, function23);
                        }
                        Updater.b(composer2, modifierD3, function24);
                        composer2.o(2085787292);
                        boolean z3 = z && !((Boolean) composer2.x(InspectionModeKt.f1972a)).booleanValue();
                        composer2.l();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (z3) {
                            composer2.o(234944354);
                            CalibrationProgressVideoPlayerKt.a(Uri.parse("asset:///hand_rotation.mp4"), fillElement, composer2, 48);
                            composer2.l();
                        } else {
                            composer2.o(235186185);
                            composer2.o(1849434622);
                            Object objG2 = composer2.G();
                            if (objG2 == composer$Companion$Empty$1) {
                                objG2 = new h(20);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            CalibrationProgressLottieKt.a(438, composer2, fillElement, (Function0) objG2);
                            composer2.l();
                        }
                        composer2.f();
                        composer2.o(1849434622);
                        Object objG3 = composer2.G();
                        if (objG3 == composer$Companion$Empty$1) {
                            objG3 = new d(19);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        Modifier modifierA2 = SemanticsModifierKt.a(companion2, (Function1) objG3);
                        String strC = StringResources_androidKt.c(composer2, R.string.calibrate_your_device);
                        TextStyle textStyle = WxTheme.b(composer2).v;
                        long j = ToneColors.k;
                        TextKt.b(strC, modifierA2, j, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 65016);
                        composer2.o(1849434622);
                        Object objG4 = composer2.G();
                        if (objG4 == composer$Companion$Empty$1) {
                            objG4 = new d(20);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.wave_your_device), SemanticsModifierKt.a(companion2, (Function1) objG4), j, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).l, composer2, 0, 0, 65016);
                        GradientHorizontalProgressIndicatorKt.a(f, SizeKt.g(SizeKt.u(PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 128), 8), null, null, 0, composer2, 48);
                        composer2.f();
                        Modifier modifierA3 = columnScopeInstance.a(companion2, 0.4f, true);
                        MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.d, false);
                        int p4 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer2.d();
                        Modifier modifierD4 = ComposedModifierKt.d(composer2, modifierA3);
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
                        Updater.b(composer2, persistentCompositionLocalMapD4, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p4))) {
                            androidx.camera.core.impl.b.z(p4, composer2, p4, function23);
                        }
                        Updater.b(composer2, modifierD4, function24);
                        long j2 = Color.j;
                        RoundedCornerShape roundedCornerShape = ButtonDefaults.b;
                        ButtonKt.c(onCancelCalibration, ClipKt.a(companion, roundedCornerShape), true, null, roundedCornerShape, null, androidx.compose.material.ButtonDefaults.d(j2, j, 0L, composer2, 4), ButtonDefaults.f5142a, ComposableSingletons$CalibrationLockProgressIndicatorScreenKt.f7403a, composer2, 805306752, 88);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, KyberEngine.KyberPolyBytes);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Modifier modifier2 = modifier;
            recomposeScopeImplX.d = new Function2(f, onCancelCalibration, onTrackOriientAppEvent, modifier2, z, i) { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration.a
                public final /* synthetic */ float d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Modifier g;
                public final /* synthetic */ boolean h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(24577);
                    CalibrationLockProgressIndicatorScreenKt.a(this.d, this.e, this.f, this.g, this.h, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
