package au.com.woolworths.feature.shop.instore.navigation.featurehighlight;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.text.InlineBadgeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MapFeatureHighlightKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Function0 function02 = function0;
        ComposerImpl composerImplV = composer.v(-510268900);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function02) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierF = PaddingKt.f(BackgroundKt.b(modifier, Color.f, RectangleShapeKt.f1779a), 24);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.title_feature_highlight), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).g, composerImplV, 0, 0, 65534);
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.description_feature_highlight), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composerImplV).j, FeatureHighlightColor.f, 0L, null, null, 0L, TextUnitKt.c(22), null, null, 0, 16646142), composerImplV, 0, 0, 65534);
            composerImplV = composerImplV;
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            function02 = function0;
            PrimaryButtonKt.b(function02, SizeKt.e(companion, 1.0f), false, null, ComposableSingletons$MapFeatureHighlightKt.b, composerImplV, (i2 & 14) | 24624, 12);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(function02, modifier, i, 1);
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, Function0 onClose, Function0 onAccept) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(onClose, "onClose");
        Intrinsics.h(onAccept, "onAccept");
        ComposerImpl composerImplV = composer.v(1208616432);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.I(onClose) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onAccept) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            float f = 24;
            Modifier modifierA = BackgroundKt.a(ClipKt.a(PaddingKt.g(SizeKt.c, 16, f), RoundedCornerShapeKt.b(f)), Brush.Companion.a(CollectionsKt.R(new Color(FeatureHighlightColor.f7324a), new Color(FeatureHighlightColor.b)), 0L, 0L, 14));
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i4 = composerImplV.P;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierE);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            d((i3 & 14) | 48, composerImplV, SizeKt.e(companion, 1.0f), onClose);
            c(ColumnScopeInstance.f948a.a(SizeKt.e(companion, 1.0f), 1.0f, true), composerImplV, 0);
            a(((i3 >> 3) & 14) | 48, composerImplV, SizeKt.e(companion, 1.0f), onAccept);
            composerImplV.V(true);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(onClose, onAccept, modifier2, i, 0);
        }
    }

    public static final void c(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1064620398);
        if ((((composerImplV.n(modifier) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierH = PaddingKt.h(modifier, 36, BitmapDescriptorFactory.HUE_RED, 2);
            BiasAlignment biasAlignment = Alignment.Companion.h;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue()) {
                composerImplV.o(-522403494);
                ImageKt.a(new ColorPainter(Color.c), null, SizeKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 500), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
                composerImplV.V(false);
            } else {
                composerImplV.o(-522143187);
                LottieAnimationKt.a(RememberLottieCompositionKt.c(new LottieCompositionSpec.RawRes(R.raw.aisletappable), composerImplV, 0).getD(), SizeKt.c, null, Integer.MAX_VALUE, null, biasAlignment, null, false, composerImplV, 1572912, 24576, 2080700);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.compose.utils.layout.a(i, 18, modifier);
        }
    }

    public static final void d(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        ComposerImpl composerImplV = composer.v(-799912918);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.I(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
            float f = 24;
            Modifier modifierI = PaddingKt.i(modifier, f, f, f, 16);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$SpaceBetween$1, Alignment.Companion.k, composerImplV, 54);
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            InlineBadgeKt.a("NEW", FeatureHighlightColor.c, null, Color.f, false, 0L, null, null, null, composerImplV, 3126, 500);
            composerImplV = composerImplV;
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            Modifier modifierQ = SizeKt.q(Modifier.Companion.d, f);
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(11, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            SurfaceKt.a(ClickableKt.d(modifierQ, false, null, null, (Function0) objG, 7), roundedCornerShape, FeatureHighlightColor.e, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableSingletons$MapFeatureHighlightKt.f7323a, composerImplV, 1573248, 56);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.b(function0, modifier, i, 2);
        }
    }
}
