package au.com.woolworths.feature.shop.homepage.presentation.carousel;

import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ProductCardsLazyRowUiKt$PreviewProductCarouselUi_alignmentWithoutMinSpend$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCardsLazyRowUiKt$PreviewProductCarouselUi_alignmentWithoutMinSpend$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/homepage/presentation/carousel/ProductCardsLazyRowUiKt$PreviewProductCarouselUi_alignmentWithoutMinSpend$1$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCardsLazyRowUiKt$PreviewProductCarouselUi_alignmentWithoutMinSpend$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01771 implements ProductClickListener {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                composer.j();
                return Unit.f24250a;
            }
            ProductCardsLazyRowUiKt.a(null, "title", LazyListStateKt.a(0, 0, 3, composer), new C01771(), new ProductCardConfig(true, false, false, false, false, false, null, 124, null), EmptyList.d, composer, 196656 | ProductCard.$stable | (ProductCardConfig.$stable << 12));
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(770648130, new AnonymousClass1(), composer), composer, 1572864, 63);
        }
        return Unit.f24250a;
    }
}
