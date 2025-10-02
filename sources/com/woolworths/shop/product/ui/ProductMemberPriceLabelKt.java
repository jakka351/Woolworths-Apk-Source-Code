package com.woolworths.shop.product.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle;
import au.com.woolworths.product.models.MemberPriceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ProductMemberPriceLabelKt {
    public static final void a(MemberPriceInfo memberPriceInfo, Modifier modifier, ProductMemberPriceLabelStyle productMemberPriceLabelStyle, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1756208467);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(memberPriceInfo) : composerImplV.I(memberPriceInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(productMemberPriceLabelStyle) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            b(memberPriceInfo.getHeader(), memberPriceInfo.getTitle(), companion, memberPriceInfo.getSubtitle(), productMemberPriceLabelStyle, composerImplV, ((i3 << 3) & 896) | ((i3 << 6) & 57344), 0);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new com.woolworths.scanlibrary.ui.scanner.b(memberPriceInfo, modifier2, productMemberPriceLabelStyle, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r23, final java.lang.String r24, androidx.compose.ui.Modifier r25, final java.lang.String r26, au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.shop.product.ui.ProductMemberPriceLabelKt.b(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle, androidx.compose.runtime.Composer, int, int):void");
    }
}
