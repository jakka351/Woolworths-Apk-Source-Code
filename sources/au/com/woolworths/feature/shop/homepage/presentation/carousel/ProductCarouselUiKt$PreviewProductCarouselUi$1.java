package au.com.woolworths.feature.shop.homepage.presentation.carousel;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ProductCarouselUiKt$PreviewProductCarouselUi$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCarouselUiKt$PreviewProductCarouselUi$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/homepage/presentation/carousel/ProductCarouselUiKt$PreviewProductCarouselUi$1$1$1", "Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionClickListener;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCarouselUiKt$PreviewProductCarouselUi$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01781 implements HorizontalListActionClickListener {
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/homepage/presentation/carousel/ProductCarouselUiKt$PreviewProductCarouselUi$1$1$2", "Lau/com/woolworths/product/tile/ProductClickListener;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCarouselUiKt$PreviewProductCarouselUi$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 implements ProductClickListener {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                composer.j();
                return Unit.f24250a;
            }
            Modifier modifierJ = PaddingKt.j(PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 24, 7);
            ProductCarouselUiKt.a(null, LazyListStateKt.a(0, 0, 3, composer), HorizontalListActionState.d, new C01781(), new AnonymousClass2(), new ProductCardConfig(true, true, false, false, false, false, null, 124, null), true, EmptyList.d, modifierJ, composer, (ProductCardConfig.$stable << 15) | 114819456);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-1220412433, new AnonymousClass1(), composer), composer, 1572864, 63);
        }
        return Unit.f24250a;
    }
}
