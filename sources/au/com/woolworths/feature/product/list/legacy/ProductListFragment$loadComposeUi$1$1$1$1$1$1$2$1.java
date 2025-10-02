package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.analytics.supers.local.ProductListAnalytics;
import au.com.woolworths.analytics.supers.local.ProductListAnalytics$ProductList$Action$Companion$facetScroll$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadComposeUi$1$1$1$1$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ProductListContract.ViewState viewState;
        List list;
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        if (!productListViewModel.O && (viewState = (ProductListContract.ViewState) productListViewModel.F.e()) != null && (list = viewState.n) != null) {
            int size = list.size();
            productListViewModel.O = true;
            AnalyticsManager analyticsManager = productListViewModel.g;
            ProductListAnalytics.ProductList.Action.d.getClass();
            analyticsManager.g(new ProductListAnalytics$ProductList$Action$Companion$facetScroll$1(size));
        }
        return Unit.f24250a;
    }
}
