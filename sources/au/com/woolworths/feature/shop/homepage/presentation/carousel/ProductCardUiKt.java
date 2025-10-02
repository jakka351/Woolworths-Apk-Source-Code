package au.com.woolworths.feature.shop.homepage.presentation.carousel;

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
import au.com.woolworths.feature.shop.contentpage.ui.d;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.composeui.ProductCardButtonsVerticalKt;
import au.com.woolworths.product.composeui.ProductInfoGridKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductCardUiKt {

    /* renamed from: a, reason: collision with root package name */
    public static final RewardsOfferInfo f7246a = new RewardsOfferInfo("offerId123", "boosted", "Ends 24 Aug.", "Min. spend $3", RewardsOfferStatus.ACTIVATED, null, null);

    public static final void a(final ProductCard productCard, final String str, final ProductClickListener onProductClickListener, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final SharedIntrinsicHeightState sharedIntrinsicHeightState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z8;
        final boolean z9;
        boolean z10;
        boolean z11;
        int i4;
        Modifier.Companion companion;
        ComposerImpl composerImpl;
        final Modifier modifier2;
        Intrinsics.h(productCard, "productCard");
        Intrinsics.h(onProductClickListener, "onProductClickListener");
        Intrinsics.h(sharedIntrinsicHeightState, "sharedIntrinsicHeightState");
        ComposerImpl composerImplV = composer.v(-456770075);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onProductClickListener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z8 = z;
            i3 |= composerImplV.p(z8) ? 2048 : 1024;
        } else {
            z8 = z;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.p(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.p(true) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z9 = z3;
            i3 |= composerImplV.p(z9) ? 1048576 : 524288;
        } else {
            z9 = z3;
        }
        if ((12582912 & i) == 0) {
            z10 = z4;
            i3 |= composerImplV.p(z10) ? 8388608 : 4194304;
        } else {
            z10 = z4;
        }
        if ((100663296 & i) == 0) {
            z11 = z5;
            i3 |= composerImplV.p(z11) ? 67108864 : 33554432;
        } else {
            z11 = z5;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerImplV.p(z6) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.p(z7) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i4 | KyberEngine.KyberPolyBytes;
        int i6 = i3;
        if ((i3 & 306783379) == 306783378 && (i5 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierO = SizeKt.o(companion2, 160);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                companion = companion2;
                objG = new au.com.woolworths.feature.shop.editorder.review.components.c(6);
                composerImplV.A(objG);
            } else {
                companion = companion2;
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierO, false, (Function1) objG);
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(onProductClickListener) | ((i6 & 112) == 32) | ((i6 & 14) == 4 || ((i6 & 8) != 0 && composerImplV.I(productCard)));
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new d(onProductClickListener, str, productCard, 3);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            final boolean z12 = z8;
            final boolean z13 = z10;
            final boolean z14 = z11;
            composerImpl = composerImplV;
            CardKt.b((Function0) objG2, modifierB, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-594294593, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCardUiKt$ProductCardUi$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 12;
                        Modifier.Companion companion3 = Modifier.Companion.d;
                        Modifier modifierI = PaddingKt.i(companion3, f, f, f, 8);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g, Alignment.Companion.n, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierI);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
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
                        Modifier modifierA = SharedIntrinsicHeightModifierKt.a(companion3, sharedIntrinsicHeightState);
                        boolean z15 = z12;
                        boolean z16 = !z15;
                        composer2.o(-1746271574);
                        ProductClickListener productClickListener = onProductClickListener;
                        boolean zI2 = composer2.I(productClickListener);
                        String str2 = str;
                        boolean zN = zI2 | composer2.n(str2);
                        ProductCard productCard2 = productCard;
                        boolean zI3 = zN | composer2.I(productCard2);
                        Object objG3 = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zI3 || objG3 == obj3) {
                            objG3 = new d(productClickListener, str2, productCard2, 4);
                            composer2.A(objG3);
                        }
                        Function0 function02 = (Function0) objG3;
                        composer2.l();
                        composer2.o(-1746271574);
                        boolean zI4 = composer2.I(productClickListener) | composer2.n(str2) | composer2.I(productCard2);
                        Object objG4 = composer2.G();
                        if (zI4 || objG4 == obj3) {
                            objG4 = new d(productClickListener, str2, productCard2, 5);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        int i7 = ProductCard.$stable;
                        ProductInfoGridKt.a(productCard2, false, modifierA, z6, z7, function02, false, z9, z2, z13, true, z16, null, z14, (Function0) objG4, false, false, null, false, composer2, i7 | 1572912, 0, 495616);
                        ProductCardButtonsVerticalKt.b(productCard2, str2, productClickListener, ProductCardExtKt.i(productCard2, z15, false, false, 12), null, composer2, i7, 16);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 805306368, 508);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.homepage.presentation.carousel.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    ProductCardUiKt.a(productCard, str, onProductClickListener, z, z2, z3, z4, z5, z6, z7, sharedIntrinsicHeightState, modifier2, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
