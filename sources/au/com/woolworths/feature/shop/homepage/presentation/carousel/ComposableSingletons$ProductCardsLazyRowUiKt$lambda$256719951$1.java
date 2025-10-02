package au.com.woolworths.feature.shop.homepage.presentation.carousel;

import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductCardsLazyRowUiKt$lambda$256719951$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductCardsLazyRowUiKt$lambda$256719951$1 d = new ComposableSingletons$ProductCardsLazyRowUiKt$lambda$256719951$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/homepage/presentation/carousel/ComposableSingletons$ProductCardsLazyRowUiKt$lambda$256719951$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.carousel.ComposableSingletons$ProductCardsLazyRowUiKt$lambda$256719951$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RewardsOfferInfo rewardsOfferInfo = ProductCardUiKt.f7246a;
            ProductCardsLazyRowUiKt.a(CollectionsKt.R(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, rewardsOfferInfo, null, null, null, null, -142610433, 3), ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, new PromotionInfo(ProductPromotionTypes.SPECIAL, "20% off"), null, rewardsOfferInfo, null, null, null, null, -147980305, 3)), "title", LazyListStateKt.a(0, 0, 3, composer), new AnonymousClass1(), new ProductCardConfig(true, false, false, false, false, false, null, 124, null), EmptyList.d, composer, 196656 | ProductCard.$stable | (ProductCardConfig.$stable << 12));
        }
        return Unit.f24250a;
    }
}
