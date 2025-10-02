package au.com.woolworths.feature.product.list.legacy;

import androidx.lifecycle.MediatorLiveData;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListActions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadComposeUi$1$1$1$1$1$1$4$1 extends FunctionReferenceImpl implements Function3<String, String, Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        MediatorLiveData mediatorLiveData = productListViewModel.C;
        if (mediatorLiveData.e() != null) {
            productListViewModel.g.j(new ProductListActions.ApiFilterChip(p1, zBooleanValue), productListViewModel.x6());
            if (mediatorLiveData.e() != null) {
                ProductListViewModel.t6(productListViewModel, productListViewModel.w6(), p0, null, null, null, false, null, 124);
            }
        }
        return Unit.f24250a;
    }
}
