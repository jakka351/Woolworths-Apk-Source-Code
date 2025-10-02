package au.com.woolworths.feature.shop.instore.navigation.onboarding.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.data.ProductFinderOnboardingItem;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductFinderOnboardingPageKt {
    public static final void a(ProductFinderOnboardingItem productFinderOnboardingItem, Modifier modifier, Composer composer, int i) {
        ProductFinderOnboardingItem onboardingItem = productFinderOnboardingItem;
        Intrinsics.h(onboardingItem, "onboardingItem");
        ComposerImpl composerImplV = composer.v(500575186);
        if (((i | (composerImplV.n(onboardingItem) ? 4 : 2)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            List listR = CollectionsKt.R(new Color(Color.f), new Color(ToneColors.j));
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 48);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = PaddingKt.g(BackgroundKt.a(SizeKt.e(companion, 1.0f), Brush.Companion.b(listR)), 48, 32);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierG);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            ImageKt.a(PainterResources_androidKt.a(onboardingItem.c, 0, composerImplV), null, SizeKt.e(companion, 1.0f), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
            composerImplV.V(true);
            float f = 16;
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            Modifier modifierH = PaddingKt.h(SizeKt.c, f, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierH);
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
            onboardingItem = productFinderOnboardingItem;
            String strC = StringResources_androidKt.c(composerImplV, onboardingItem.f7423a);
            TextStyle textStyleA = TextStyle.a(WxTheme.b(composerImplV).f, 0L, 0L, null, null, 0L, TextUnitKt.c(28), null, null, 0, 16646143);
            long j = RewardsColors.c;
            composerImplV = composerImplV;
            TextKt.a(strC, textStyleA, null, j, null, 3, 0, false, 0, null, composerImplV, 0, 980);
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            TextKt.a(StringResources_androidKt.c(composerImplV, onboardingItem.b), TextStyle.a(WxTheme.b(composerImplV).l, 0L, 0L, null, null, 0L, TextUnitKt.c(22), null, null, 0, 16646143), null, j, null, 3, 0, false, 0, null, composerImplV, 0, 980);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(onboardingItem, i, 14, modifier);
        }
    }
}
