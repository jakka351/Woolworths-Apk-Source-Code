package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.shop.cart.data.model.CartRewardsInfo;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartRewardsHeaderKt {
    public static final void a(final CartRewardsInfo info, Composer composer, final int i) {
        Modifier.Companion companion;
        float f;
        Intrinsics.h(info, "info");
        ComposerImpl composerImplV = composer.v(563597903);
        if ((((composerImplV.I(info) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierB = BackgroundKt.b(SizeKt.e(companion2, 1.0f), ToneColors.k, RectangleShapeKt.f1779a);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            float f2 = 16;
            Modifier modifierG = PaddingKt.g(companion2, f2, 12);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierG);
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
            if (((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue()) {
                composerImplV.o(305270933);
                ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_rewards_card_small, 0, composerImplV), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 124);
                composerImplV.V(false);
                f = f2;
                companion = companion2;
            } else {
                composerImplV.o(305483190);
                companion = companion2;
                f = f2;
                SingletonAsyncImageKt.b(info.f8689a, null, SizeKt.g(SizeKt.u(companion2, 40), 25), PainterResources_androidKt.a(R.drawable.ic_rewards_card_small, 0, composerImplV), PainterResources_androidKt.a(R.drawable.ic_rewards_card_small, 0, composerImplV), null, null, null, null, null, null, null, composerImplV, 432, 0, 32736);
                composerImplV.V(false);
            }
            TextKt.b(info.b, RowScopeInstance.f974a.b(PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), Alignment.Companion.k), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65532);
            composerImplV = composerImplV;
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(i) { // from class: au.com.woolworths.shop.cart.ui.cart.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    CartRewardsHeaderKt.a(this.d, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
