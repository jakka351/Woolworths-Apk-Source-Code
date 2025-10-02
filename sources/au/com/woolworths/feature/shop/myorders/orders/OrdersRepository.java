package au.com.woolworths.feature.shop.myorders.orders;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.shop.graphql.type.OrderType;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/OrdersRepository;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrdersRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f7862a;
    public final DispatcherProvider b;

    public OrdersRepository(DispatcherProvider dispatchers, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatchers, "dispatchers");
        this.f7862a = apolloClient;
        this.b = dispatchers;
    }

    public final Object a(int i, OrderType orderType, ContinuationImpl continuationImpl) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new OrdersRepository$fetchOrderFeed$2(this, i, orderType, null), continuationImpl);
    }
}
