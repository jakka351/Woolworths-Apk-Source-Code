package au.com.woolworths.shop.specials.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.product.composeui.ProductCardButtonsVerticalKt;
import au.com.woolworths.product.composeui.ProductInfoGridKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"specials_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCardKt {
    public static final void a(final ProductCard productCard, final String str, final ProductClickListener productClickListener, final boolean z, final boolean z2, final SharedIntrinsicHeightState sharedIntrinsicHeightState, final boolean z3, final boolean z4, final boolean z5, Modifier modifier, final boolean z6, final Function0 function0, Composer composer, final int i) {
        int i2;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        ComposerImpl composerImpl;
        final Modifier modifier2;
        Intrinsics.h(productCard, "productCard");
        Intrinsics.h(productClickListener, "productClickListener");
        Intrinsics.h(sharedIntrinsicHeightState, "sharedIntrinsicHeightState");
        ComposerImpl composerImplV = composer.v(-906066217);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z7 = z;
            i2 |= composerImplV.p(z7) ? 2048 : 1024;
        } else {
            z7 = z;
        }
        if ((i & 24576) == 0) {
            z8 = z2;
            i2 |= composerImplV.p(z8) ? 16384 : 8192;
        } else {
            z8 = z2;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(sharedIntrinsicHeightState) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z9 = z3;
            i2 |= composerImplV.p(z9) ? 1048576 : 524288;
        } else {
            z9 = z3;
        }
        if ((12582912 & i) == 0) {
            z10 = z4;
            i2 |= composerImplV.p(z10) ? 8388608 : 4194304;
        } else {
            z10 = z4;
        }
        if ((100663296 & i) == 0) {
            z11 = z5;
            i2 |= composerImplV.p(z11) ? 67108864 : 33554432;
        } else {
            z11 = z5;
        }
        int i3 = i2 | 805306368;
        int i4 = (composerImplV.p(z6) ? (char) 4 : (char) 2) | (composerImplV.I(function0) ? ' ' : (char) 16);
        if ((i3 & 306783379) == 306783378 && (i4 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierO = SizeKt.o(companion, 160);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(4);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierO, false, (Function1) objG);
            composerImplV.o(-1746271574);
            boolean z12 = true;
            boolean zI = composerImplV.I(productClickListener) | ((i3 & 112) == 32);
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !composerImplV.I(productCard))) {
                z12 = false;
            }
            boolean z13 = zI | z12;
            Object objG2 = composerImplV.G();
            if (z13 || objG2 == composer$Companion$Empty$1) {
                objG2 = new b(productClickListener, str, productCard, 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            final boolean z14 = z7;
            final boolean z15 = z8;
            final boolean z16 = z9;
            final boolean z17 = z10;
            final boolean z18 = z11;
            composerImpl = composerImplV;
            CardKt.b((Function0) objG2, modifierB, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-882560067, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.ui.ProductCardKt$ProductCard$4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 12;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierI = PaddingKt.i(companion2, f, f, f, 8);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierI);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        Modifier modifierA = SharedIntrinsicHeightModifierKt.a(companion2, sharedIntrinsicHeightState);
                        ProductCard productCard2 = productCard;
                        boolean z19 = (productCard2.getWasPrice() == null && productCard2.getMultiBuyPrice() == null && productCard2.getMultiBuyPriceInfo() == null) ? false : true;
                        composer2.o(-1746271574);
                        ProductClickListener productClickListener2 = productClickListener;
                        boolean zI2 = composer2.I(productClickListener2);
                        String str2 = str;
                        boolean zN = zI2 | composer2.n(str2) | composer2.I(productCard2);
                        Object objG3 = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zN || objG3 == obj3) {
                            objG3 = new b(productClickListener2, str2, productCard2, 1);
                            composer2.A(objG3);
                        }
                        Function0 function03 = (Function0) objG3;
                        composer2.l();
                        composer2.o(-1746271574);
                        boolean zI3 = composer2.I(productClickListener2) | composer2.n(str2) | composer2.I(productCard2);
                        Object objG4 = composer2.G();
                        if (zI3 || objG4 == obj3) {
                            objG4 = new b(productClickListener2, str2, productCard2, 2);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        int i5 = ProductCard.$stable;
                        boolean z20 = z14;
                        boolean z21 = z15;
                        boolean z22 = z16;
                        boolean z23 = z17;
                        ProductInfoGridKt.a(productCard2, true, modifierA, z20, z21, function03, false, false, z19, true, false, false, null, z22, (Function0) objG4, z23, z6, function0, z18, composer2, i5 | 805306416, 0, 7360);
                        ProductCardButtonsVerticalKt.b(productCard2, str2, productClickListener2, ProductCardExtKt.i(productCard2, z23, false, false, 14), null, composer2, i5, 16);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 805306368, 508);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.specials.ui.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProductCardKt.a(productCard, str, productClickListener, z, z2, sharedIntrinsicHeightState, z3, z4, z5, modifier2, z6, function0, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
