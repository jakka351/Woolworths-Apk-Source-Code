package au.com.woolworths.feature.product.list;

import androidx.lifecycle.MediatorLiveData;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.analytics.ProductListActions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadComposeUi$1$1$1$1$1$1$4$1 extends FunctionReferenceImpl implements Function3<String, String, Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list;
        String p0 = (String) obj;
        String p1 = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        SharedFlow sharedFlow = productListViewModel.I;
        if (!sharedFlow.a().isEmpty()) {
            productListViewModel.h.j(new ProductListActions.ApiFilterChip(p1, zBooleanValue), productListViewModel.r6());
            MediatorLiveData mediatorLiveData = productListViewModel.C;
            if (!sharedFlow.a().isEmpty()) {
                ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
                ProductListViewModel.H6(productListViewModel, mediatorLiveData, 0, null, null, null, null, p0, null, null, null, null, null, null, null, null, CollectionsKt.G0(CollectionsKt.d0(p0, (viewState == null || (list = viewState.y) == null) ? new ArrayList() : CollectionsKt.J0(list))), null, 58716159);
                ProductListPagingSource productListPagingSource = productListViewModel.G;
                if (productListPagingSource != null) {
                    productListPagingSource.c();
                }
            }
        }
        return Unit.f24250a;
    }
}
