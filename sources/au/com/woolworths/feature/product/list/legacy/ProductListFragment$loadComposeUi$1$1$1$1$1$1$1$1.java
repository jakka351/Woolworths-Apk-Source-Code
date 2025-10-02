package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.analytics.supers.local.ProductListAnalytics;
import au.com.woolworths.analytics.supers.local.ProductListAnalytics$ProductList$Action$Companion$facetClick$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.product.list.legacy.data.ProductListChip;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadComposeUi$1$1$1$1$1$1$1$1 extends FunctionReferenceImpl implements Function1<ProductListChip, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductListChip p0 = (ProductListChip) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        if (!p0.b) {
            productListViewModel.N = true;
            AnalyticsManager analyticsManager = productListViewModel.g;
            ProductListAnalytics.ProductList.Action.Companion companion = ProductListAnalytics.ProductList.Action.d;
            String facetDisplayName = p0.c.f5353a;
            companion.getClass();
            Intrinsics.h(facetDisplayName, "facetDisplayName");
            analyticsManager.g(new ProductListAnalytics$ProductList$Action$Companion$facetClick$1(facetDisplayName));
            ProductListViewModel.t6(productListViewModel, productListViewModel.w6(), null, null, null, p0.f5364a, false, null, 110);
        }
        return Unit.f24250a;
    }
}
