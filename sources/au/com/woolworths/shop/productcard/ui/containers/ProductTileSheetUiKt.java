package au.com.woolworths.shop.productcard.ui.containers;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.productcard.data.ProductTile;
import au.com.woolworths.shop.productcard.data.RoundelImage;
import au.com.woolworths.shop.productcard.ui.components.b;
import au.com.woolworths.shop.productcard.ui.horizontal.HorizontalProductTileContentUiKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTileSheetUiKt {
    public static final void a(ProductTile productTile, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(972413376);
        if ((((composerImplV.I(productTile) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            String str = productTile.b;
            String str2 = productTile.d != null ? "" : null;
            RoundelImage roundelImage = productTile.c;
            String str3 = roundelImage != null ? roundelImage.f12660a : null;
            modifier2 = modifier;
            HorizontalProductTileContentUiKt.a(196608, 960, composerImplV, modifier2, productTile.s, productTile.f, str, str2, str3, null);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(productTile, i, 1, modifier2);
        }
    }
}
