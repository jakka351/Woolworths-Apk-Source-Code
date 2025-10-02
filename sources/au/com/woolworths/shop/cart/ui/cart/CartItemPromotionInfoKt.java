package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionInfo;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartItemPromotionInfoKt {
    public static final void a(CartPromotionInfo info, Function0 promotionInfoClicked, Function0 promotionInfoTooltipClicked, Composer composer, int i) {
        long j;
        int i2;
        Modifier.Companion companion;
        ComposerImpl composerImpl;
        Intrinsics.h(info, "info");
        boolean z = info.f8686a;
        Intrinsics.h(promotionInfoClicked, "promotionInfoClicked");
        Intrinsics.h(promotionInfoTooltipClicked, "promotionInfoTooltipClicked");
        ComposerImpl composerImplV = composer.v(-1525048834);
        int i3 = (composerImplV.I(info) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(promotionInfoClicked) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(promotionInfoTooltipClicked) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierD = ClickableKt.d(companion2, !z, null, null, promotionInfoClicked, 6);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD2, function24);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
            Modifier modifierB = BackgroundKt.b(SizeKt.e(companion2, 1.0f), z ? RewardsColors.b : Color.f, RectangleShapeKt.f1779a);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            long j2 = z ? Color.f : RewardsColors.b;
            float f = 16;
            float f2 = (float) 7.5d;
            Modifier modifierK = SizeKt.k(PaddingKt.j(companion2, f, f2, BitmapDescriptorFactory.HUE_RED, f2, 4), 32);
            if (((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue()) {
                j = j2;
                i2 = i4;
                companion = companion2;
                composerImplV.o(1714938884);
                ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable, 0, composerImplV), null, modifierK, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else {
                composerImplV.o(1714577300);
                companion = companion2;
                j = j2;
                i2 = i4;
                SingletonAsyncImageKt.b(info.b, null, modifierK, null, PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable, 0, composerImplV), null, null, null, null, null, null, ColorFilter.Companion.a(j2), composerImplV, 432, 0, 28648);
                composerImpl = composerImplV;
                composerImpl.V(false);
            }
            String str = info.c;
            float f3 = 12;
            float f4 = 8;
            Modifier modifierI = PaddingKt.i(companion, f, f3, f4, f3);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            ComposerImpl composerImpl2 = composerImpl;
            long j3 = j;
            Modifier.Companion companion3 = companion;
            TextKt.b(str, rowScopeInstance.a(modifierI, 1.0f, true), j3, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(WxTheme.b(composerImpl).s, 0L, 0L, null, null, TextUnitKt.b(0.4d), 0L, null, null, 0, 16777087), composerImpl2, 0, 0, 65528);
            composerImplV = composerImpl2;
            Painter painterA = PainterResources_androidKt.a(R.drawable.ic_tool_tip, 0, composerImplV);
            String strC = StringResources_androidKt.c(composerImplV, R.string.cart_promotion_tooltip_content_description);
            composerImplV.o(5004770);
            boolean z2 = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new e(promotionInfoTooltipClicked, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            IconKt.a(painterA, strC, PaddingKt.f(ClickableKt.d(companion3, false, null, null, (Function0) objG, 7), f4), j3, composerImplV, 0, 0);
            SpacerKt.d(rowScopeInstance, f3, composerImplV, 54);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(i, 17, info, promotionInfoClicked, promotionInfoTooltipClicked, false);
        }
    }
}
