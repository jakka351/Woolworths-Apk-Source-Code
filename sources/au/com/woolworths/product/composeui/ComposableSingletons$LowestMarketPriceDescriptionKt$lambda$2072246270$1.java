package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$LowestMarketPriceDescriptionKt$lambda$2072246270$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$LowestMarketPriceDescriptionKt$lambda$2072246270$1 d = new ComposableSingletons$LowestMarketPriceDescriptionKt$lambda$2072246270$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            LowestMarketPriceDescriptionKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, new ProductListMarketplace("http://text", "Sold & Shipped by Market Partner", "Some Seller", "Acme", "Was price is the previous lowest price in the last 14 days"), null, null, null, null, null, -138416129, 3), Modifier.Companion.d, composer, 48);
        }
        return Unit.f24250a;
    }
}
