package au.com.woolworths.feature.product.list.compose.productfinder;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductCardGridTileUiKt$lambda$723004442$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/product/list/compose/productfinder/ComposableSingletons$ProductCardGridTileUiKt$lambda$723004442$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.compose.productfinder.ComposableSingletons$ProductCardGridTileUiKt$lambda$723004442$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCardGridTileUiKt.a(ProductCardPreviewDataKt.b(null, "Woolworths NZ Chicken 0.8-1.3kg 2-3pcs", 1050, "10.50 per 1kg\n$4.40 / tray (approx)", false, null, null, null, null, null, null, null, null, null, null, null, null, -25172243, 3), new AnonymousClass1(), true, false, false, false, false, null, null, 2, null, composer, ProductCard.$stable | 805306752, 1528);
        }
        return Unit.f24250a;
    }
}
