package au.com.woolworths.product.composeui;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCardInfoUiKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean, int] */
    public static final void a(final ProductCard productCard, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final boolean z8, Function2 function2, final Integer num, final Integer num2, final boolean z9, final Function0 function0, final Function0 function02, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final Function0 function03;
        ProductCard productCard2;
        ComposerImpl composerImpl;
        BiasAlignment.Horizontal horizontal;
        float f;
        float f2;
        float f3;
        BiasAlignment biasAlignment;
        ComposerImpl composerImpl2;
        Modifier.Companion companion;
        boolean z10;
        ?? r8;
        RewardsOfferInfo rewardsOfferInfo;
        RewardsOfferInfo rewardsOfferInfo2;
        ProductCard productCard3;
        Modifier.Companion companion2;
        float f4;
        Modifier.Companion companion3;
        boolean z11;
        ComposerImpl composerImpl3;
        Function2 function22 = function2;
        ComposerImpl composerImplV = composer.v(1182373828);
        if ((i & 6) == 0) {
            i3 = i | (composerImplV.I(productCard) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.p(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.p(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.p(z4) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= composerImplV.p(z5) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerImplV.p(true) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerImplV.p(z6) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerImplV.p(z7) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerImplV.p(z8) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.I(function22) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.n(num) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.n(num2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerImplV.p(z9) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerImplV.I(function0) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            function03 = function02;
            i4 |= composerImplV.I(function03) ? 131072 : 65536;
        } else {
            function03 = function02;
        }
        int i5 = i4;
        if ((i3 & 306783379) == 306783378 && (i5 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl3 = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.foundation.shop.olive.voice.ui.search.a(18);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion4 = Modifier.Companion.d;
            Modifier modifierB = SemanticsModifierKt.b(companion4, true, (Function1) objG);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal2, composerImplV, 48);
            int p = composerImplV.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function04 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Function2 function23 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function23);
            Function2 function24 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function24);
            Function2 function25 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.B(p, composerImplV, p, function25);
            }
            Function2 function26 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function26);
            composerImplV.o(-1730693654);
            if (z6) {
                CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1323209455, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.product.composeui.ProductCardInfoUiKt$ProductCardInfo$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierJ = PaddingKt.j(ColumnScopeInstance.f948a.b(Modifier.Companion.d, Alignment.Companion.m), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, 7);
                            Function0 function05 = null;
                            if (z9) {
                                InStoreLocationData inStoreLocation = productCard.getInStoreLocation();
                                if ((inStoreLocation != null ? inStoreLocation.getDetails() : null) != null) {
                                    function05 = function0;
                                }
                            }
                            ProductLocationInfoKt.a(productCard, modifierJ, true, function05, function03, composer2, KyberEngine.KyberPolyBytes, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV));
            }
            composerImplV.V(false);
            int i6 = i3 & 14;
            CrossfadeKt.b(productCard, null, AnimationSpecKt.e(100, 0, null, 6), null, ComposableLambdaKt.c(-1547763944, new Function3<ProductCard, Composer, Integer, Unit>() { // from class: au.com.woolworths.product.composeui.ProductCardInfoUiKt$ProductCardInfo$3$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ProductCard it = (ProductCard) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if (ProductCardExtKt.s(it)) {
                        ProductPromotionLabelKt.a(it, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), false, z3, false, composer2, (iIntValue & 14) | 48, 20);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, i6 | 24960, 10);
            float f5 = z4 ? 48 : 0;
            float f6 = 8;
            ProductNameKt.b(productCard, z, PaddingKt.j(companion4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, f6, 3), 5, num, composerImplV, (i3 & 126) | ((i5 << 9) & 57344), 0);
            ComposerImpl composerImpl4 = composerImplV;
            composerImpl4.o(-1730644618);
            if (z8) {
                ProductUnavailableLabelKt.a(productCard, PaddingKt.j(companion4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f6, 7), true, (productCard.isAvailable() && productCard.getTagLabel() == null) ? false : true, composerImpl4, i6 | 3120, 4);
                productCard2 = productCard;
                composerImpl = composerImpl4;
            } else {
                productCard2 = productCard;
                composerImpl = composerImpl4;
            }
            composerImpl.V(false);
            Modifier.Companion companion5 = companion4;
            ProductDisclaimerKt.a(productCard2.getDisclaimer(), PaddingKt.j(companion4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, f6, 3), 5, composerImpl, 0, 0);
            Modifier modifierE = SizeKt.e(companion5, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f6), Alignment.Companion.l, composerImpl, 54);
            int p2 = composerImpl.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImpl.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImpl, modifierE);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function04);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, rowMeasurePolicyA, function23);
            Updater.b(composerImpl, persistentCompositionLocalMapQ2, function24);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(p2))) {
                androidx.camera.core.impl.b.B(p2, composerImpl, p2, function25);
            }
            Updater.b(composerImpl, modifierD2, function26);
            composerImpl.o(556368606);
            if (productCard2.getPrice() != null) {
                horizontal = horizontal2;
                ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImpl, 0);
                int p3 = composerImpl.getP();
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImpl.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImpl, companion5);
                composerImpl.i();
                f = f6;
                if (composerImpl.O) {
                    composerImpl.K(function04);
                } else {
                    composerImpl.e();
                }
                Updater.b(composerImpl, columnMeasurePolicyA2, function23);
                Updater.b(composerImpl, persistentCompositionLocalMapQ3, function24);
                if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(p3))) {
                    androidx.camera.core.impl.b.B(p3, composerImpl, p3, function25);
                }
                Updater.b(composerImpl, modifierD3, function26);
                ProductPriceKt.a(productCard2.getPrice(), productCard2.getTagLabel(), null, productCard2.getUnitOfMeasureLabel(), 0L, false, composerImpl, 0, 52);
                composerImpl.V(true);
            } else {
                horizontal = horizontal2;
                f = f6;
            }
            composerImpl.V(false);
            ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, horizontal, composerImpl, 0);
            int p4 = composerImpl.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImpl.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImpl, companion5);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function04);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, columnMeasurePolicyA3, function23);
            Updater.b(composerImpl, persistentCompositionLocalMapQ4, function24);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(p4))) {
                androidx.camera.core.impl.b.B(p4, composerImpl, p4, function25);
            }
            Updater.b(composerImpl, modifierD4, function26);
            if (productCard2.getPrice() == null) {
                composerImpl.o(2127579136);
                if (z7) {
                    f4 = f;
                    companion3 = companion5;
                    z11 = false;
                } else {
                    f4 = f;
                    companion3 = companion5;
                    z11 = false;
                    ProductUnavailablePriceLabelKt.a(PaddingKt.j(companion3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, 7), false, composerImpl, 6, 2);
                }
                composerImpl.V(z11);
                companion5 = companion3;
                f2 = f4;
            } else {
                float f7 = f;
                composerImpl.o(2127889105);
                f2 = f7;
                ProductUnitPriceLabelKt.a(productCard2.getUnitPriceDescription(), productCard2.getTagLabel(), PaddingKt.j(companion5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f7, 7), 0L, num2 != null ? num2.intValue() : 1, 0, 5, false, composerImpl, KyberEngine.KyberPolyBytes, 168);
                composerImpl.V(false);
            }
            composerImpl.V(true);
            composerImpl.V(true);
            ProductMultiBuyLabel productMultiBuyLabel = ProductMultiBuyLabel.i;
            boolean z12 = ProductCardExtKt.z(productCard2, productMultiBuyLabel);
            boolean z13 = z12 || ProductCardExtKt.w(productCard2, productMultiBuyLabel);
            composerImpl.o(-1730567665);
            BiasAlignment biasAlignment2 = Alignment.Companion.f1719a;
            if (z13) {
                MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment2, false);
                int p5 = composerImpl.getP();
                PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImpl.Q();
                Modifier modifierD5 = ComposedModifierKt.d(composerImpl, companion5);
                composerImpl.i();
                if (composerImpl.O) {
                    composerImpl.K(function04);
                } else {
                    composerImpl.e();
                }
                Updater.b(composerImpl, measurePolicyD, function23);
                Updater.b(composerImpl, persistentCompositionLocalMapQ5, function24);
                if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(p5))) {
                    androidx.camera.core.impl.b.B(p5, composerImpl, p5, function25);
                }
                Updater.b(composerImpl, modifierD5, function26);
                composerImpl.o(-784440559);
                if (z12) {
                    f3 = f2;
                    companion2 = companion5;
                    productCard3 = productCard2;
                    biasAlignment = biasAlignment2;
                    ProductWasPriceLabelKt.a(productCard3, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), true, composerImpl, i6 | 432, 0);
                    if (ProductCardExtKt.v(productCard3)) {
                        LowestMarketPriceDescriptionKt.a(productCard3, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), composerImpl, i6 | 48);
                    }
                } else {
                    productCard3 = productCard2;
                    f3 = f2;
                    companion2 = companion5;
                    biasAlignment = biasAlignment2;
                }
                composerImpl.V(false);
                companion5 = companion2;
                ComposerImpl composerImpl5 = composerImpl;
                ProductMultiBuyLabelKt.a(productCard3, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), true, productMultiBuyLabel, composerImpl5, i6 | 3504, 0);
                ComposerImpl composerImpl6 = composerImpl5;
                composerImpl6.V(true);
                composerImpl2 = composerImpl6;
            } else {
                f3 = f2;
                biasAlignment = biasAlignment2;
                composerImpl2 = composerImpl;
            }
            boolean z14 = false;
            composerImpl2.V(false);
            MemberPriceInfo memberPriceInfo = productCard.getMemberPriceInfo();
            composerImpl2.o(-1730531373);
            if (memberPriceInfo == null) {
                companion = companion5;
            } else {
                MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                int p6 = composerImpl2.getP();
                PersistentCompositionLocalMap persistentCompositionLocalMapQ6 = composerImpl2.Q();
                Modifier modifierD6 = ComposedModifierKt.d(composerImpl2, companion5);
                composerImpl2.i();
                if (composerImpl2.O) {
                    composerImpl2.K(function04);
                } else {
                    composerImpl2.e();
                }
                Updater.b(composerImpl2, measurePolicyD2, function23);
                Updater.b(composerImpl2, persistentCompositionLocalMapQ6, function24);
                if (composerImpl2.O || !Intrinsics.c(composerImpl2.G(), Integer.valueOf(p6))) {
                    androidx.camera.core.impl.b.B(p6, composerImpl2, p6, function25);
                }
                Updater.b(composerImpl2, modifierD6, function26);
                companion = companion5;
                ProductMemberPriceLabelKt.a(memberPriceInfo, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), ProductMemberPriceLabelStyling.d, composerImpl2, 432, 0);
                composerImpl2.V(true);
                z14 = false;
            }
            composerImpl2.V(z14);
            composerImpl2.o(-1730521673);
            if (!z5 || (rewardsOfferInfo2 = productCard.getRewardsOfferInfo()) == null) {
                z10 = false;
            } else {
                z10 = false;
                ProductOfferExpiryKt.a(rewardsOfferInfo2, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), composerImpl2, 48, 0);
            }
            composerImpl2.V(z10);
            composerImpl2.o(-1730511833);
            if (!z2 || (rewardsOfferInfo = productCard.getRewardsOfferInfo()) == null) {
                r8 = 0;
            } else {
                r8 = 0;
                ProductOfferStatusBadgeKt.a(rewardsOfferInfo, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), composerImpl2, 48, 0);
            }
            composerImpl2.V(r8);
            ProductListMarketplace marketplace = productCard.getMarketplace();
            composerImpl2.o(-1730500805);
            if (marketplace != null) {
                ProductMarketplaceDetailsKt.a(marketplace, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, 7), composerImpl2, 48, r8);
            }
            composerImpl2.V(r8);
            function22 = function2;
            android.support.v4.media.session.a.z(i5 & 14, function22, composerImpl2, true);
            composerImpl3 = composerImpl2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl3.X();
        if (recomposeScopeImplX != null) {
            final Function2 function27 = function22;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.product.composeui.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    ProductCardInfoUiKt.a(productCard, z, z2, z3, z4, z5, z6, z7, z8, function27, num, num2, z9, function0, function02, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.product.models.ProductCard r42, final boolean r43, final boolean r44, androidx.compose.ui.Modifier r45, boolean r46, boolean r47, boolean r48, kotlin.jvm.functions.Function0 r49, final boolean r50, boolean r51, final boolean r52, boolean r53, boolean r54, kotlin.jvm.functions.Function0 r55, kotlin.jvm.functions.Function0 r56, kotlin.jvm.functions.Function2 r57, java.lang.Integer r58, java.lang.Integer r59, androidx.compose.runtime.Composer r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.composeui.ProductCardInfoUiKt.b(au.com.woolworths.product.models.ProductCard, boolean, boolean, androidx.compose.ui.Modifier, boolean, boolean, boolean, kotlin.jvm.functions.Function0, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, java.lang.Integer, java.lang.Integer, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
