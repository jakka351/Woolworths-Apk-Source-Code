package au.com.woolworths.foundation.rewards.cart.update.data;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/CartQuantitiesRepository;", "", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CartQuantitiesRepository {

    /* renamed from: a, reason: collision with root package name */
    public final DispatcherProvider f8556a;
    public final ApolloClient b;

    public CartQuantitiesRepository(DispatcherProvider dispatcherProvider, ApolloClient apolloClient) {
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(apolloClient, "apolloClient");
        this.f8556a = dispatcherProvider;
        this.b = apolloClient;
    }
}
