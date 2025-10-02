package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductWasPriceLabelKt {
    public static final void a(ProductCard productCard, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z2;
        Intrinsics.h(productCard, "productCard");
        ComposerImpl composerImplV = composer.v(1969871214);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(productCard) ? 4 : 2) | i;
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
            i3 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            z2 = z;
        } else {
            modifier2 = i4 != 0 ? Modifier.Companion.d : modifier;
            boolean z3 = i5 != 0 ? false : z;
            b(productCard.getWasPrice(), modifier2, z3, ProductCardExtKt.z(productCard, ProductMultiBuyLabel.e), composerImplV, i3 & 1008);
            z2 = z3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(productCard, modifier2, z2, i, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r29, androidx.compose.ui.Modifier r30, boolean r31, boolean r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.composeui.ProductWasPriceLabelKt.b(java.lang.String, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int):void");
    }
}
