package au.com.woolworths.feature.product.list;

import android.content.SharedPreferences;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.analytics.ProductListActions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadComposeUi$1$1$1$1$1$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        ProductListContract.ProductListFlow productListFlow;
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        ProductListInteractor productListInteractor = productListViewModel.e;
        productListViewModel.h.j(ProductListActions.FilterClick.e, productListViewModel.r6());
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) productListViewModel.C.e();
        if (viewState != null && viewState.e) {
            androidx.constraintlayout.core.state.a.v(productListInteractor.f5251a.b, "has_dot_interaction", true);
            MutableStateFlow mutableStateFlow = productListInteractor.l;
            do {
                value = mutableStateFlow.getValue();
                productListFlow = (ProductListContract.ProductListFlow) value;
            } while (!mutableStateFlow.d(value, ProductListContract.ProductListFlow.a(productListFlow, null, null, null, null, null, 0, new ProductListContract.ProductListFilterState(productListFlow.g.f5247a, false), null, 3071)));
        }
        ProductsListRepository productsListRepository = productListInteractor.f5251a;
        if (!productListInteractor.j.isEmpty() && productsListRepository.b.getInt("filter_card_count", 0) <= 3) {
            SharedPreferences sharedPreferences = productListInteractor.f5251a.b;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt("filter_card_count", sharedPreferences.getInt("filter_card_count", 0) + 1);
            editorEdit.apply();
        }
        productListViewModel.A.f(new ProductListContract.ProductListActivityActions.LaunchProductListOptions(productListViewModel.q6()));
        return Unit.f24250a;
    }
}
