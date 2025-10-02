package au.com.woolworths.feature.shop.myorders.orders;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.feature.shop.myorders.orders.data.MyOrders;
import au.com.woolworths.feature.shop.myorders.orders.data.MyOrdersQueryOrdersExtKt;
import au.com.woolworths.shop.graphql.type.OrderType;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.feature.shop.myorders.MyOrdersQuery;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/myorders/orders/data/MyOrders;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.orders.OrdersRepository$fetchOrderFeed$2", f = "OrdersRepository.kt", l = {29}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class OrdersRepository$fetchOrderFeed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MyOrders>, Object> {
    public int p;
    public final /* synthetic */ OrdersRepository q;
    public final /* synthetic */ int r;
    public final /* synthetic */ OrderType s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdersRepository$fetchOrderFeed$2(OrdersRepository ordersRepository, int i, OrderType orderType, Continuation continuation) {
        super(2, continuation);
        this.q = ordersRepository;
        this.r = i;
        this.s = orderType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrdersRepository$fetchOrderFeed$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrdersRepository$fetchOrderFeed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                OrdersRepository ordersRepository = this.q;
                int i2 = this.r;
                ApolloClient apolloClient = ordersRepository.f7862a;
                OrderType orderType = OrderType.g;
                OrderType orderType2 = this.s;
                MyOrdersQuery myOrdersQuery = new MyOrdersQuery(i2, orderType2, orderType2 == orderType);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, myOrdersQuery);
                this.p = 1;
                obj = apolloCall.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return MyOrdersQueryOrdersExtKt.a(((MyOrdersQuery.Data) ExceptionExtKt.k((ApolloResponse) obj)).f20005a);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
