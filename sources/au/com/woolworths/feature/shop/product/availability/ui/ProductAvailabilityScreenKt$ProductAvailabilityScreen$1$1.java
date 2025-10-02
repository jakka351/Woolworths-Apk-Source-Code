package au.com.woolworths.feature.shop.product.availability.ui;

import au.com.woolworths.analytics.supers.instorecheckavailability.InstoreCheckAvailabilityAnalytics;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiAction;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiEvent;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityViewModel;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductAvailabilityScreenKt$ProductAvailabilityScreen$1$1 extends FunctionReferenceImpl implements Function1<ProductAvailabilityUiEvent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductAvailabilityUiEvent p0 = (ProductAvailabilityUiEvent) obj;
        Intrinsics.h(p0, "p0");
        ProductAvailabilityViewModel productAvailabilityViewModel = (ProductAvailabilityViewModel) this.receiver;
        productAvailabilityViewModel.getClass();
        if (p0.equals(ProductAvailabilityUiEvent.Refresh.f7987a)) {
            productAvailabilityViewModel.p6();
        } else {
            if (!(p0 instanceof ProductAvailabilityUiEvent.ShowStoreDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductCard productCard = productAvailabilityViewModel.l;
            if (productCard != null) {
                productAvailabilityViewModel.g.i(InstoreCheckAvailabilityAnalytics.CheckStockScreen.Action.e, ProductAnalyticsExtKt.h(productCard, null, null, 7));
            }
            productAvailabilityViewModel.j.f(new ProductAvailabilityUiAction.OpenStoreDetails(((ProductAvailabilityUiEvent.ShowStoreDetails) p0).f7988a));
        }
        return Unit.f24250a;
    }
}
