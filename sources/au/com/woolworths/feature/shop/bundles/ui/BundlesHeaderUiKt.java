package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.bundles.data.BundleDetails;
import au.com.woolworths.feature.shop.bundles.data.BundlePricingData;
import au.com.woolworths.feature.shop.bundles.data.TitleTagData;
import au.com.woolworths.sdui.common.corecolortheme.CoreColorThemeKt;
import au.com.woolworths.sdui.common.coretag.TagKt;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"bundles_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesHeaderUiKt {
    public static final void a(BundleDetails bundleDetails, Composer composer, int i) {
        Modifier.Companion companion;
        float f;
        boolean z;
        Intrinsics.h(bundleDetails, "bundleDetails");
        ComposerImpl composerImplV = composer.v(-466673236);
        if (((i | (composerImplV.n(bundleDetails) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            float f2 = 16;
            Modifier modifierI = PaddingKt.i(SizeKt.e(companion2, 1.0f), f2, 32, f2, 24);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierI);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shared.instore.wifi.ui.c(19);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA = RowScopeInstance.f974a.a(SemanticsModifierKt.b(companion2, false, (Function1) objG), 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            TitleTagData titleTagData = bundleDetails.f6755a;
            composerImplV.o(-1399387368);
            if (titleTagData == null) {
                companion = companion2;
                z = false;
                f = f2;
            } else {
                companion = companion2;
                f = f2;
                z = false;
                TextKt.a(titleTagData.f6769a, CoreTheme.f(composerImplV).f5120a.c.b, null, CoreColorThemeKt.a(titleTagData.b.f9997a), null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            }
            composerImplV.V(z);
            Modifier.Companion companion3 = companion;
            TextKt.a(bundleDetails.b, CoreTheme.f(composerImplV).d.c.d, PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 1008);
            composerImplV.V(true);
            SpacerKt.a(composerImplV, SizeKt.u(companion3, f));
            BundlePricingData bundlePricingData = bundleDetails.d;
            composerImplV.o(947139550);
            if (!(bundlePricingData instanceof BundlePricingData.BundleComparisonPricingData)) {
                if (!(bundlePricingData instanceof BundlePricingData.BundleStandardPricingData)) {
                    throw new NoWhenBranchMatchedException();
                }
                b((BundlePricingData.BundleStandardPricingData) bundlePricingData, composerImplV, 8);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            String str = bundleDetails.c;
            composerImplV.o(1722034521);
            if (str != null) {
                TextKt.a(str, CoreTheme.f(composerImplV).f5120a.c.f5124a, PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composerImplV).e.d.b, null, 0, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 1008);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.e(i, 17, bundleDetails);
        }
    }

    public static final void b(BundlePricingData.BundleStandardPricingData bundleStandardPricingData, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(148668964);
        int i2 = (composerImplV.I(bundleStandardPricingData) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4 || composerImplV.I(bundleStandardPricingData);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l(bundleStandardPricingData, 11);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = SemanticsModifierKt.a(companion, (Function1) objG);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.o, composerImplV, 48);
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CoreTagModel coreTagModel = bundleStandardPricingData.c;
            composerImplV.o(2064681721);
            if (coreTagModel != null) {
                TagKt.a(coreTagModel, null, null, composerImplV, 8, 6);
            }
            composerImplV.V(false);
            TextKt.a(bundleStandardPricingData.f6757a, CoreTheme.f(composerImplV).f5120a.b.b, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composerImplV).e.d.b, null, 0, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 1008);
            TextKt.a(bundleStandardPricingData.b, CoreTheme.f(composerImplV).c.f5127a.f5128a, companion, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 1008);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.e(i, 18, bundleStandardPricingData);
        }
    }
}
