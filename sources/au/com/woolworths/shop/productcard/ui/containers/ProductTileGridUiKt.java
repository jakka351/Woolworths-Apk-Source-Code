package au.com.woolworths.shop.productcard.ui.containers;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.productcard.data.ProductTile;
import au.com.woolworths.shop.productcard.data.RoundelImage;
import au.com.woolworths.shop.productcard.ui.vertical.VerticalProductTileContentUiKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductTileGridUiKt {
    public static final void a(ProductTile productTile, Modifier modifier, Function3 function3, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1627252612);
        if (((i | (composerImplV.I(productTile) ? 4 : 2) | 27648) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            long j = CoreTheme.b(composerImplV).e.b.e;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier modifierB = BackgroundKt.b(BorderKt.a(modifier, 1, j, rectangleShapeKt$RectangleShape$1), CoreTheme.b(composerImplV).e.f4848a.c, rectangleShapeKt$RectangleShape$1);
            String str = productTile.b;
            String str2 = productTile.d != null ? "" : null;
            RoundelImage roundelImage = productTile.c;
            VerticalProductTileContentUiKt.a(114819072, 0, composerImplV, modifierB, productTile.s, productTile.f, str, str2, roundelImage != null ? roundelImage.f12660a : null, function3);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(productTile, modifier, function3, i, 0);
        }
    }
}
