package au.com.woolworths.base.shopapp.modules.collectionmode;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.base.shopapp.models.address.AddressInput;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/AddressApiImpl;", "Lau/com/woolworths/base/shopapp/modules/collectionmode/AddressApi;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddressApiImpl implements AddressApi {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f4622a;
    public final DispatcherProvider b;

    public AddressApiImpl(DispatcherProvider dispatchersProvider, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatchersProvider, "dispatchersProvider");
        this.f4622a = apolloClient;
        this.b = dispatchersProvider;
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.AddressApi
    public final Object a(AddressInput addressInput, Continuation continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new AddressApiImpl$saveAddress$2(this, addressInput, null), continuation);
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.AddressApi
    public final Object b(int i, Continuation continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new AddressApiImpl$deleteAddress$2(this, i, null), continuation);
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.AddressApi
    public final Object c(Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new AddressApiImpl$getSavedAddresses$2(this, null), continuation);
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.AddressApi
    public final Object d(String str, Continuation continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new AddressApiImpl$searchSuburbs$2(this, str, null), continuation);
    }

    @Override // au.com.woolworths.base.shopapp.modules.collectionmode.AddressApi
    public final Object e(String str, Continuation continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new AddressApiImpl$searchAddresses$2(this, str, null), continuation);
    }
}
