package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.models.MemberPriceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductMemberPriceLabelKt {
    public static final void a(MemberPriceInfo memberPriceInfo, Modifier modifier, ProductMemberPriceLabelStyle productMemberPriceLabelStyle, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        ProductMemberPriceLabelStyle productMemberPriceLabelStyle2;
        Intrinsics.h(memberPriceInfo, "memberPriceInfo");
        ComposerImpl composerImplV = composer.v(846423579);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(memberPriceInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= (i & 512) == 0 ? composerImplV.n(productMemberPriceLabelStyle) : composerImplV.I(productMemberPriceLabelStyle) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            productMemberPriceLabelStyle2 = productMemberPriceLabelStyle;
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            Modifier modifier3 = modifier;
            if (i5 != 0) {
                productMemberPriceLabelStyle = ProductMemberPriceLabelStyling.e;
            }
            ProductMemberPriceLabelStyle productMemberPriceLabelStyle3 = productMemberPriceLabelStyle;
            b(memberPriceInfo.getHeader(), memberPriceInfo.getTitle(), modifier3, memberPriceInfo.getSubtitle(), productMemberPriceLabelStyle3, composerImplV, ((i3 << 3) & 896) | (57344 & (i3 << 6)), 0);
            modifier2 = modifier3;
            productMemberPriceLabelStyle2 = productMemberPriceLabelStyle3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a(memberPriceInfo, modifier2, productMemberPriceLabelStyle2, i, i2, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r24, java.lang.String r25, androidx.compose.ui.Modifier r26, java.lang.String r27, au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.composeui.ProductMemberPriceLabelKt.b(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle, androidx.compose.runtime.Composer, int, int):void");
    }
}
