package au.com.woolworths.shop.product.details.ui.productscarousel;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ProductsCarouselKt$Preview_ProductsCarouselV2$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.product.details.ui.productscarousel.ProductsCarouselKt$Preview_ProductsCarouselV2$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/product/details/ui/productscarousel/ProductsCarouselKt$Preview_ProductsCarouselV2$1$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.product.details.ui.productscarousel.ProductsCarouselKt$Preview_ProductsCarouselV2$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02711 implements ProductClickListener {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                composer.j();
                return Unit.f24250a;
            }
            ProductsCarouselKt.a(null, null, false, new C02711(), false, false, EmptyList.d, false, false, composer, 14377392, 256);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.b(null, null, 0L, 0L, null, null, ComposableLambdaKt.c(1177233947, new AnonymousClass1(), composer), composer, 63);
        }
        return Unit.f24250a;
    }
}
