package com.woolworths.shop.product.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ProductMultiBuyLabelKt {
    public static final void a(ProductCard productCard, Modifier modifier, ProductMultiBuyLabel productMultiBuyLabel, Composer composer, int i, int i2) {
        int i3;
        String multiBuyPrice;
        String multiBuyUnitPrice;
        Modifier modifier2;
        Intrinsics.h(productCard, "productCard");
        ComposerImpl composerImplV = composer.v(358749716);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i5 = i3 | KyberEngine.KyberPolyBytes;
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 = i3 | 3456;
        } else if ((i & 3072) == 0) {
            i5 |= composerImplV.r(productMultiBuyLabel == null ? -1 : productMultiBuyLabel.ordinal()) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            Modifier modifier3 = modifier;
            if (i6 != 0) {
                productMultiBuyLabel = ProductMultiBuyLabel.e;
            }
            MultiBuyPriceInfo multiBuyPriceInfo = productCard.getMultiBuyPriceInfo();
            if (multiBuyPriceInfo == null || (multiBuyPrice = multiBuyPriceInfo.getPrice()) == null) {
                multiBuyPrice = productCard.getMultiBuyPrice();
            }
            String str = multiBuyPrice;
            MultiBuyPriceInfo multiBuyPriceInfo2 = productCard.getMultiBuyPriceInfo();
            if (multiBuyPriceInfo2 == null || (multiBuyUnitPrice = multiBuyPriceInfo2.getUnitPrice()) == null) {
                multiBuyUnitPrice = productCard.getMultiBuyUnitPrice();
            }
            b(str, multiBuyUnitPrice, ProductCardExtKt.x(productCard, productMultiBuyLabel), ProductCardExtKt.w(productCard, productMultiBuyLabel), modifier3, composerImplV, (i5 << 9) & 516096);
            modifier2 = modifier3;
        }
        ProductMultiBuyLabel productMultiBuyLabel2 = productMultiBuyLabel;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.checkout.ui.timeselector.compose.a(productCard, modifier2, productMultiBuyLabel2, i, i2, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r28, java.lang.String r29, boolean r30, boolean r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.shop.product.ui.ProductMultiBuyLabelKt.b(java.lang.String, java.lang.String, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
