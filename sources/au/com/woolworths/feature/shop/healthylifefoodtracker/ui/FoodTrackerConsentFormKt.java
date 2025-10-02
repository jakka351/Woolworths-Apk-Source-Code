package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerConsent;
import au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"healthy-life-food-tracker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FoodTrackerConsentFormKt {
    public static final void a(FoodTrackerConsent foodTrackerConsent, StatefulButtonState primaryActionState, Function0 onPrimaryActionClick, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Function0 onSecondaryActionClick = function0;
        Intrinsics.h(primaryActionState, "primaryActionState");
        Intrinsics.h(onPrimaryActionClick, "onPrimaryActionClick");
        Intrinsics.h(onSecondaryActionClick, "onSecondaryActionClick");
        ComposerImpl composerImplV = composer.v(1900011730);
        int i2 = i | (composerImplV.I(foodTrackerConsent) ? 4 : 2) | (composerImplV.r(primaryActionState.ordinal()) ? 32 : 16) | (composerImplV.I(onPrimaryActionClick) ? 256 : 128) | (composerImplV.I(onSecondaryActionClick) ? 2048 : 1024) | 24576;
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            float f = 24;
            float f2 = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierI = PaddingKt.i(companion, f2, f, f2, 8);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierI);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
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
            DownloadableAssetUiKt.b(foodTrackerConsent.f7164a, PaddingKt.j(ColumnScopeInstance.f948a.b(companion, horizontal), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7), false, false, false, null, null, composerImplV, 0, 124);
            TextKt.b(foodTrackerConsent.b, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, 7), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).f, composerImplV, 48, 0, 65020);
            composerImplV = composerImplV;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(foodTrackerConsent);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new l(foodTrackerConsent, 23);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            AndroidView_androidKt.a((Function1) objG, modifierJ, null, composerImplV, 48, 4);
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            String str = foodTrackerConsent.e;
            composerImplV.o(5004770);
            boolean z = (i2 & 896) == 256;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(25, onPrimaryActionClick);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            StatefulButtonKt.b(str, str, modifierE, primaryActionState, 0L, (Function0) objG2, composerImplV, ((i2 << 6) & 7168) | KyberEngine.KyberPolyBytes, 16);
            Modifier modifierE2 = SizeKt.e(companion, 1.0f);
            String str2 = foodTrackerConsent.f;
            composerImplV.o(5004770);
            boolean z2 = (i2 & 7168) == 2048;
            Object objG3 = composerImplV.G();
            if (z2 || objG3 == composer$Companion$Empty$1) {
                onSecondaryActionClick = function0;
                objG3 = new au.com.woolworths.design.core.ui.component.experimental.dialog.a(26, onSecondaryActionClick);
                composerImplV.A(objG3);
            } else {
                onSecondaryActionClick = function0;
            }
            composerImplV.V(false);
            TertiaryButtonKt.a(str2, (Function0) objG3, modifierE2, false, false, null, null, composerImplV, KyberEngine.KyberPolyBytes, 120);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.productfinder.g(foodTrackerConsent, primaryActionState, onPrimaryActionClick, onSecondaryActionClick, modifier2, i, 6);
        }
    }
}
