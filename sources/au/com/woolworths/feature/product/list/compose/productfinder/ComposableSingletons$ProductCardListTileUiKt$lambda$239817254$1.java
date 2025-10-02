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
public final class ComposableSingletons$ProductCardListTileUiKt$lambda$239817254$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/product/list/compose/productfinder/ComposableSingletons$ProductCardListTileUiKt$lambda$239817254$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.compose.productfinder.ComposableSingletons$ProductCardListTileUiKt$lambda$239817254$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCardListTileUiKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, ProductCardPreviewDataKt.a(), 2122317823, 3), new AnonymousClass1(), true, null, true, true, false, null, null, composer, ProductCard.$stable | 221568, 456);
        }
        return Unit.f24250a;
    }
}
