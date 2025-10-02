package au.com.woolworths.shop.productcard.ui.containers;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.productcard.data.ProductTile;
import au.com.woolworths.shop.productcard.data.RoundelImage;
import au.com.woolworths.shop.productcard.ui.horizontal.HorizontalProductTileContentUiKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTileListUiKt {
    public static final void a(ProductTile productTile, Modifier modifier, Function3 function3, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1814693452);
        if (((i | (composerImplV.I(productTile) ? 4 : 2) | 224256) & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            String str = productTile.b;
            String str2 = productTile.d != null ? "" : null;
            RoundelImage roundelImage = productTile.c;
            String str3 = roundelImage != null ? roundelImage.f12660a : null;
            HorizontalProductTileContentUiKt.a(920322048, 0, composerImplV, modifier, productTile.s, productTile.f, str, str2, str3, function3);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(productTile, modifier, function3, i, 1);
        }
    }
}
