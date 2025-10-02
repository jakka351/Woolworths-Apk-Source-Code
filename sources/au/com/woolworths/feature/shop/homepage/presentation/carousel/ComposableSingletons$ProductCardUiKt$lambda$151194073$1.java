package au.com.woolworths.feature.shop.homepage.presentation.carousel;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyDataKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductCardUiKt$lambda$151194073$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductCardUiKt$lambda$151194073$1 d = new ComposableSingletons$ProductCardUiKt$lambda$151194073$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/shop/homepage/presentation/carousel/ComposableSingletons$ProductCardUiKt$lambda$151194073$1$1", "Lau/com/woolworths/product/tile/ProductClickListener;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.carousel.ComposableSingletons$ProductCardUiKt$lambda$151194073$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductClickListener {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RewardsOfferInfo rewardsOfferInfo = ProductCardUiKt.f7246a;
            ProductCard productCardB = ProductCardPreviewDataKt.b(null, null, null, null, false, null, ProductTrolleyDataKt.defaultProductTrolleyData(), null, null, null, new PromotionInfo(ProductPromotionTypes.SPECIAL, "20% off"), null, rewardsOfferInfo, null, null, null, null, -148013057, 3);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new SharedIntrinsicHeightState();
                composer.A(objG);
            }
            composer.l();
            ProductCardUiKt.a(productCardB, "some carousel", anonymousClass1, false, true, false, false, false, false, false, (SharedIntrinsicHeightState) objG, null, composer, ProductCard.$stable | 920349744, 54);
        }
        return Unit.f24250a;
    }
}
