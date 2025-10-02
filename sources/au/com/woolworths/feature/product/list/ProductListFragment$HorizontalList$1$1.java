package au.com.woolworths.feature.product.list;

import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$HorizontalList$1$1 extends FunctionReferenceImpl implements Function1<ActionData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ActionData p0 = (ActionData) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        if (ProductListViewModel.WhenMappings.b[p0.getType().ordinal()] == 1) {
            productListViewModel.y.f(new ProductListContract.Actions.LaunchDeeplink(p0.getAction(), null));
        }
        return Unit.f24250a;
    }
}
