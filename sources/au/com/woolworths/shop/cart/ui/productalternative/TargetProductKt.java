package au.com.woolworths.shop.cart.ui.productalternative;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.android.onesite.extensions.IntExtKt;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.design.wx.foundation.TextColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelKt;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.ui.productreview.BadgeApiDataExtKt$toBrandLabel$1;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TargetProductKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final void a(ProductReviewCard productReviewCard, Modifier modifier, Composer composer, int i) {
        Function2 function2;
        ProductReviewCard productReviewCard2;
        Function2 function22;
        Function2 function23;
        Function2 function24;
        ComposerImpl composerImpl;
        Modifier.Companion companion;
        Function2 function25;
        Modifier.Companion companion2;
        Function2 function26;
        Function2 function27;
        Function2 function28;
        BiasAlignment.Horizontal horizontal;
        Function2 function29;
        ?? r0;
        ProductReviewCard productReviewCard3;
        Function0 function0;
        Arrangement$Top$1 arrangement$Top$1;
        boolean z;
        ComposerImpl composerImpl2;
        Modifier.Companion companion3;
        boolean z2;
        ComposerImpl composerImpl3;
        Modifier modifier2;
        ComposerImpl composerImpl4;
        ComposerImpl composerImplV = composer.v(40878921);
        if (((i | (composerImplV.I(productReviewCard) ? 4 : 2) | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            productReviewCard3 = productReviewCard;
            modifier2 = modifier;
            composerImpl4 = composerImplV;
        } else {
            Modifier.Companion companion4 = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion4, 1.0f);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(productReviewCard);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new b(productReviewCard, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            float f = 16;
            Modifier modifierF = PaddingKt.f(SemanticsModifierKt.b(modifierE, false, (Function1) objG), f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function210 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function210);
            Function2 function211 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function211);
            Function2 function212 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function212);
            }
            Function2 function213 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function213);
            SingletonAsyncImageKt.b(productReviewCard.d, null, SizeKt.q(companion4, 72), new ColorPainter(ToneColors.j), null, null, null, null, null, null, null, null, composerImplV, 432, 0, 32752);
            Modifier modifierA = RowScopeInstance.f974a.a(PaddingKt.j(companion4, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 1.0f, true);
            Arrangement$Top$1 arrangement$Top$12 = Arrangement.c;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$12, horizontal2, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function210);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function211);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                function2 = function212;
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            } else {
                function2 = function212;
            }
            Updater.b(composerImplV, modifierD2, function213);
            BadgeApiData badgeApiData = productReviewCard.e;
            composerImplV.o(-779994741);
            if (badgeApiData == null) {
                productReviewCard2 = productReviewCard;
                function22 = function213;
                function23 = function211;
                function24 = function2;
                composerImpl = composerImplV;
                companion = companion4;
            } else {
                productReviewCard2 = productReviewCard;
                function22 = function213;
                function23 = function211;
                function24 = function2;
                composerImpl = composerImplV;
                companion = companion4;
                BrandLabelKt.a(new BadgeApiDataExtKt$toBrandLabel$1(badgeApiData), true, true, PaddingKt.j(companion4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), false, composerImpl, 3504, 16);
            }
            composerImpl.V(false);
            Function2 function214 = function24;
            Function2 function215 = function23;
            ComposerImpl composerImpl5 = composerImpl;
            Modifier.Companion companion5 = companion;
            TextKt.b(productReviewCard2.f10444a, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl).r, composerImpl5, 0, 0, 65534);
            ComposerImpl composerImpl6 = composerImpl5;
            Modifier modifierE2 = SizeKt.e(companion5, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.g(8), Alignment.Companion.k, composerImpl6, 54);
            int i4 = composerImpl6.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImpl6.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImpl6, modifierE2);
            composerImpl6.i();
            if (composerImpl6.O) {
                composerImpl6.K(function02);
            } else {
                composerImpl6.e();
            }
            Updater.b(composerImpl6, rowMeasurePolicyA2, function210);
            Updater.b(composerImpl6, persistentCompositionLocalMapQ3, function215);
            if (composerImpl6.O || !Intrinsics.c(composerImpl6.G(), Integer.valueOf(i4))) {
                function25 = function214;
                androidx.camera.core.impl.b.B(i4, composerImpl6, i4, function25);
            } else {
                function25 = function214;
            }
            Function2 function216 = function22;
            Updater.b(composerImpl6, modifierD3, function216);
            Integer num = productReviewCard.g;
            composerImpl6.o(560291534);
            if (num == null) {
                companion2 = companion5;
                function26 = function210;
                function0 = function02;
                productReviewCard3 = productReviewCard;
                function28 = function215;
                function27 = function216;
                function29 = function25;
                arrangement$Top$1 = arrangement$Top$12;
                horizontal = horizontal2;
                r0 = 0;
                z = true;
                composerImpl2 = composerImpl6;
            } else {
                int iIntValue = num.intValue();
                ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$12, horizontal2, composerImpl6, 0);
                int i5 = composerImpl6.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImpl6.Q();
                Modifier modifierD4 = ComposedModifierKt.d(composerImpl6, companion5);
                composerImpl6.i();
                if (composerImpl6.O) {
                    composerImpl6.K(function02);
                } else {
                    composerImpl6.e();
                }
                Updater.b(composerImpl6, columnMeasurePolicyA2, function210);
                Updater.b(composerImpl6, persistentCompositionLocalMapQ4, function215);
                if (composerImpl6.O || !Intrinsics.c(composerImpl6.G(), Integer.valueOf(i5))) {
                    androidx.camera.core.impl.b.B(i5, composerImpl6, i5, function25);
                }
                Updater.b(composerImpl6, modifierD4, function216);
                companion2 = companion5;
                function26 = function210;
                function27 = function216;
                function28 = function215;
                horizontal = horizontal2;
                function29 = function25;
                r0 = 0;
                productReviewCard3 = productReviewCard;
                function0 = function02;
                arrangement$Top$1 = arrangement$Top$12;
                TextKt.b(YU.a.i("$", IntExtKt.b(iIntValue), ".", IntExtKt.a(iIntValue)), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl6).i, composerImpl6, 0, 0, 65534);
                ComposerImpl composerImpl7 = composerImpl6;
                z = true;
                composerImpl7.V(true);
                composerImpl2 = composerImpl7;
            }
            composerImpl2.V(r0);
            boolean z3 = z;
            String str = productReviewCard3.j;
            composerImpl2.o(560304106);
            if (str == null) {
                companion3 = companion2;
                z2 = z3;
                composerImpl3 = composerImpl2;
            } else {
                ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, horizontal, composerImpl2, r0);
                int i6 = composerImpl2.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImpl2.Q();
                Modifier.Companion companion6 = companion2;
                Modifier modifierD5 = ComposedModifierKt.d(composerImpl2, companion6);
                composerImpl2.i();
                if (composerImpl2.O) {
                    composerImpl2.K(function0);
                } else {
                    composerImpl2.e();
                }
                Updater.b(composerImpl2, columnMeasurePolicyA3, function26);
                Updater.b(composerImpl2, persistentCompositionLocalMapQ5, function28);
                if (composerImpl2.O || !Intrinsics.c(composerImpl2.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImpl2, i6, function29);
                }
                Updater.b(composerImpl2, modifierD5, function27);
                companion3 = companion6;
                ComposerImpl composerImpl8 = composerImpl2;
                z2 = z3;
                TextKt.b(str, null, TextColors.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl2).r, composerImpl8, 0, 0, 65530);
                ComposerImpl composerImpl9 = composerImpl8;
                composerImpl9.V(z2);
                composerImpl3 = composerImpl9;
            }
            composerImpl3.V(r0);
            composerImpl3.V(z2);
            composerImpl3.V(z2);
            composerImpl3.V(z2);
            modifier2 = companion3;
            composerImpl4 = composerImpl3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl4.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(productReviewCard3, i, 17, modifier2);
        }
    }
}
