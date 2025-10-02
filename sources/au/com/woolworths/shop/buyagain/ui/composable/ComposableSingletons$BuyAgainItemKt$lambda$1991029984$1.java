package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductShoppingList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$BuyAgainItemKt$lambda$1991029984$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BuyAgainItemKt.a(new ProductCard("", "Helga's Bread Light Rye 680g", null, "https://www.someimage.com", 290, null, null, null, "$0.72 per 100G", true, false, "Was $3.00 27/02/2024", null, null, null, null, null, new ProductShoppingList(0.0d, 0.0d, 1.0d, 0.0d, null, 16, null), null, null, null, new PromotionInfo(ProductPromotionTypes.LOW_PRICE, "LOW PRICE"), null, null, null, null, null, null, null, null, null, false, new MultiBuyPriceInfo("10 for $13.00", null), null, null, null, null, null, null, null, -2232092, 254, null), 1.0d, true, false, false, false, PaddingKt.f(Modifier.Companion.d, 16), null, null, null, null, null, null, null, null, false, false, null, composer, ProductCard.$stable | 1797552, 0, 262016);
        }
        return Unit.f24250a;
    }
}
