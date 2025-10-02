package au.com.woolworths.shop.productcard.ui.horizontal;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import au.com.woolworths.shop.productcard.data.MarketplaceInfo;
import au.com.woolworths.shop.productcard.data.ProductPriceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HorizontalProductTileContentUiKt$lambda$1660502496$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            HorizontalProductTileContentUiKt.a(1573302, 928, composer, null, new MarketplaceInfo("", new TextWithAltData("Marketplace partner", "Marketplace partner alternative text")), new ProductPriceInfo("Intro price", 3489, "/Kg", EmptyList.d, null, null, null), "This is the article name it can be quite long and run over a four lines like this example of article name", "", "", ComposableSingletons$HorizontalProductTileContentUiKt.f12666a);
        }
        return Unit.f24250a;
    }
}
