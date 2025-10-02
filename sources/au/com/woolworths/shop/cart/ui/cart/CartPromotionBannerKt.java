package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartPromotionBannerKt {
    public static final void a(PromotionBanner promotionBanner, Function0 onBannerActionClick, Composer composer, int i) {
        Intrinsics.h(onBannerActionClick, "onBannerActionClick");
        ComposerImpl composerImplV = composer.v(1562549354);
        int i2 = (composerImplV.I(promotionBanner) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onBannerActionClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierG = PaddingKt.g(BackgroundKt.b(Modifier.Companion.d, WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a), 16, 8);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            InsetBannerData insetBannerData = promotionBanner.f9341a;
            composerImplV.o(5004770);
            boolean z = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new j(onBannerActionClick, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            InsetBannerUiKt.b(insetBannerData, null, false, (Function1) objG, composerImplV, 0, 14);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h(promotionBanner, i, 27, onBannerActionClick);
        }
    }
}
