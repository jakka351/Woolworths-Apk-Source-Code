package au.com.woolworths.shop.cart.ui.shared;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityInfo;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import au.com.woolworths.product.models.ProductQuantityHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartProductQuantitySelectorKt {
    public static final void a(final boolean z, final CartProductQuantityInfo quantityInfo, final double d, Modifier modifier, final Function1 function1, final Function0 function0, Composer composer, final int i) {
        int i2;
        Object bVar;
        float f;
        Function2 function2;
        int i3;
        double d2;
        Modifier.Companion companion;
        boolean z2;
        final Modifier modifier2;
        Intrinsics.h(quantityInfo, "quantityInfo");
        ComposerImpl composerImplV = composer.v(-476974701);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(quantityInfo) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.t(d) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 |= composerImplV.I(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= composerImplV.I(function0) ? 131072 : 65536;
        }
        int i5 = i4;
        if ((74899 & i5) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            boolean z3 = d < quantityInfo.b;
            boolean z4 = z || d > quantityInfo.f8683a;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion2);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function25);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function24);
            }
            Updater.b(composerImplV, modifierD2, function25);
            Painter painterA = PainterResources_androidKt.a(R.drawable.cart_button_minus_white, 0, composerImplV);
            composerImplV.o(2037938291);
            long jH = z4 ? WxTheme.a(composerImplV).h() : ToneColors.h;
            composerImplV.V(false);
            BlendModeColorFilter blendModeColorFilterA = ColorFilter.Companion.a(jH);
            String strC = StringResources_androidKt.c(composerImplV, R.string.cart_quantity_minus_button_content_description);
            float f2 = 36;
            Modifier modifierK = SizeKt.k(companion2, f2);
            composerImplV.o(-1746271574);
            int i8 = i5 & 896;
            int i9 = i5 & 57344;
            boolean zI = (i8 == 256) | composerImplV.I(quantityInfo) | (i9 == 16384);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                f = f2;
                function2 = function23;
                i3 = i8;
                d2 = d;
                bVar = new b(d2, quantityInfo, function1, 0);
                composerImplV.A(bVar);
            } else {
                function2 = function23;
                f = f2;
                bVar = objG;
                i3 = i8;
                d2 = d;
            }
            composerImplV.V(false);
            ImageKt.a(painterA, strC, ClickableKt.d(modifierK, z4, null, null, (Function0) bVar, 6), null, null, BitmapDescriptorFactory.HUE_RED, blendModeColorFilterA, composerImplV, 0, 56);
            float f3 = f;
            Modifier modifierG = SizeKt.g(SizeKt.o(companion2, 68), f3);
            composerImplV.o(5004770);
            boolean z5 = (i5 & 458752) == 131072;
            Object objG2 = composerImplV.G();
            if (z5 || objG2 == composer$Companion$Empty$1) {
                objG2 = new f(13, function0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierB = BackgroundKt.b(ClickableKt.d(modifierG, false, null, null, (Function0) objG2, 7), ToneColors.j, RectangleShapeKt.f1779a);
            MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.e, false);
            int i10 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function2);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                androidx.camera.core.impl.b.B(i10, composerImplV, i10, function24);
            }
            Updater.b(composerImplV, modifierD3, function25);
            TextKt.b(ProductQuantityHelper.getQuantityLabel((float) d2, quantityInfo.e), null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 0, 0, 65022);
            composerImplV.V(true);
            Painter painterA2 = PainterResources_androidKt.a(R.drawable.cart_button_plus_white, 0, composerImplV);
            composerImplV.o(2037984371);
            long jH2 = z3 ? WxTheme.a(composerImplV).h() : ToneColors.h;
            composerImplV.V(false);
            BlendModeColorFilter blendModeColorFilterA2 = ColorFilter.Companion.a(jH2);
            String strC2 = StringResources_androidKt.c(composerImplV, R.string.cart_quantity_plus_button_content_description);
            Modifier modifierK2 = SizeKt.k(TestTagKt.a(companion2, "CartProductQuantitySelector Increment Quantity"), f3);
            composerImplV.o(-1746271574);
            boolean zI2 = composerImplV.I(quantityInfo) | (i3 == 256) | (i9 == 16384);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                companion = companion2;
                z2 = false;
                b bVar2 = new b(d2, quantityInfo, function1, 1);
                composerImplV.A(bVar2);
                objG3 = bVar2;
            } else {
                companion = companion2;
                z2 = false;
            }
            composerImplV.V(z2);
            ImageKt.a(painterA2, strC2, ClickableKt.d(modifierK2, z3, null, null, (Function0) objG3, 6), null, null, BitmapDescriptorFactory.HUE_RED, blendModeColorFilterA2, composerImplV, 0, 56);
            composerImplV = composerImplV;
            composerImplV.V(true);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.cart.ui.shared.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    CartProductQuantitySelectorKt.a(z, quantityInfo, d, modifier2, function1, function0, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
