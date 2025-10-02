package au.com.woolworths.shop.cart.ui.productreview;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.domain.model.ProductReviewFeed;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ProductReviewScreenKt$PreviewProductReview$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/cart/ui/productreview/ProductReviewScreenKt$PreviewProductReview$1$1", "Lau/com/woolworths/shop/cart/ui/productreview/ProductsReviewCallbacks;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$PreviewProductReview$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements ProductsReviewCallbacks {
        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
        public final void U2(ProductReviewCard productReviewCard) {
            Intrinsics.h(productReviewCard, "productReviewCard");
        }

        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
        public final void V4(ProductReviewFeed.ProductReviewGroup productReviewGroup) {
        }

        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
        public final void Z3(ProductReviewCard productReviewCard) {
            Intrinsics.h(productReviewCard, "productReviewCard");
        }

        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
        public final void d3(List list) {
        }

        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
        public final void f0(String str) {
        }

        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
        public final void j5(ProductReviewCard productReviewCard, double d) {
            Intrinsics.h(productReviewCard, "productReviewCard");
        }

        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
        public final void q(ProductCard productCard) {
        }

        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
        public final void r1(List list, AnalyticsData analyticsData) {
        }

        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
        public final void y5() {
        }

        @Override // au.com.woolworths.shop.cart.ui.productreview.ProductsReviewCallbacks
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        composer.o(1849434622);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new au.com.woolworths.android.onesite.deeplink.h(20);
            composer.A(objG);
        }
        Function0 function0 = (Function0) objG;
        Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE == composer$Companion$Empty$1) {
            objE = new au.com.woolworths.android.onesite.deeplink.h(20);
            composer.A(objE);
        }
        composer.l();
        ProductReviewScreenKt.c(false, null, anonymousClass1, function0, (Function0) objE, composer, 27654);
        throw null;
    }
}
