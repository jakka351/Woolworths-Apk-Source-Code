package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LowestMarketPriceDescriptionKt {
    public static final void a(ProductCard productCard, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(productCard, "productCard");
        ComposerImpl composerImplV = composer.v(1108109658);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            b(productCard, ProductCardExtKt.v(productCard), modifier, composerImplV, ((i2 << 3) & 896) | (i2 & 14));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(productCard, modifier, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.product.models.ProductCard r28, boolean r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, int r32) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.composeui.LowestMarketPriceDescriptionKt.b(au.com.woolworths.product.models.ProductCard, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
