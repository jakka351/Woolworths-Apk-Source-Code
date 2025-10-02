package au.com.woolworths.shop.cart.ui.productalternative;

import androidx.compose.runtime.Composer;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ProductReviewAlternativeScreenKt$PreviewProductReviewAlternative$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeScreenKt$PreviewProductReviewAlternative$1$1", "Lau/com/woolworths/shop/cart/ui/productalternative/ProductsReviewAlternativeCallbacks;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeScreenKt$PreviewProductReviewAlternative$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductsReviewAlternativeCallbacks {
        @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
        public final void I3(AnalyticsData analyticsData) {
        }

        @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
        public final void K2() {
        }

        @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
        public final void U0(AnalyticsData analyticsData) {
        }

        @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
        public final void i1() {
        }

        @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
        public final void j1(ProductReviewCard productReviewCard, ProductCard productToReplaceWith) {
            Intrinsics.h(productToReplaceWith, "productToReplaceWith");
        }

        @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
        public final void q(ProductCard productCard) {
        }

        @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
        public final void q5(AnalyticsData analyticsData) {
        }

        @Override // au.com.woolworths.shop.cart.ui.productalternative.ProductsReviewAlternativeCallbacks
        public final void z() {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        ProductReviewAlternativeScreenKt.b(false, false, null, new AnonymousClass1(), composer, 54);
        throw null;
    }
}
