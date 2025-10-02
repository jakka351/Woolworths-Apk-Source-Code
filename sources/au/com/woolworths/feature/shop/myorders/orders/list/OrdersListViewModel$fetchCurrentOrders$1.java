package au.com.woolworths.feature.shop.myorders.orders.list;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel", f = "OrdersListViewModel.kt", l = {152}, m = "fetchCurrentOrders")
/* loaded from: classes3.dex */
final class OrdersListViewModel$fetchCurrentOrders$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ OrdersListViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdersListViewModel$fetchCurrentOrders$1(OrdersListViewModel ordersListViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = ordersListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return OrdersListViewModel.p6(this.q, this);
    }
}
