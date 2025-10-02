package au.com.woolworths.feature.shop.product.availability;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.feature.shop.product.availability.domain.GeoData;
import au.com.woolworths.feature.shop.product.availability.domain.StoreProductAvailabilityData;
import au.com.woolworths.feature.shop.product.availability.domain.StoreProductAvailabilityListData;
import au.com.woolworths.shop.graphql.type.StoresForProductInput;
import au.com.woolworths.shop.product.availability.CheckNearbyStoresForProductQuery;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/product/availability/domain/StoreProductAvailabilityListData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.product.availability.ProductAvailabilityRepository$fetchAvailability$2$1", f = "ProductAvailabilityRepository.kt", l = {36}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ProductAvailabilityRepository$fetchAvailability$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super StoreProductAvailabilityListData>, Object> {
    public int p;
    public final /* synthetic */ ProductAvailabilityRepository q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductAvailabilityRepository$fetchAvailability$2$1(ProductAvailabilityRepository productAvailabilityRepository, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = productAvailabilityRepository;
        this.r = str;
        this.s = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductAvailabilityRepository$fetchAvailability$2$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductAvailabilityRepository$fetchAvailability$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StoreProductAvailabilityListData storeProductAvailabilityListData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f7985a;
            CheckNearbyStoresForProductQuery checkNearbyStoresForProductQuery = new CheckNearbyStoresForProductQuery(new StoresForProductInput(Optional.Companion.a(this.r), this.s));
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, checkNearbyStoresForProductQuery);
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
        ApolloResponse apolloResponse = (ApolloResponse) obj;
        CheckNearbyStoresForProductQuery.CheckNearbyStoresForProduct checkNearbyStoresForProduct = ((CheckNearbyStoresForProductQuery.Data) ExceptionExtKt.k(apolloResponse)).f12540a;
        if (checkNearbyStoresForProduct != null) {
            ArrayList<CheckNearbyStoresForProductQuery.Store> arrayList = checkNearbyStoresForProduct.f12539a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            for (CheckNearbyStoresForProductQuery.Store store : arrayList) {
                Intrinsics.h(store, "<this>");
                arrayList2.add(new StoreProductAvailabilityData(store.f12542a, store.b, store.c.f12538a, new GeoData(store.d.f12541a), store.e));
            }
            storeProductAvailabilityListData = new StoreProductAvailabilityListData(arrayList2);
        } else {
            storeProductAvailabilityListData = null;
        }
        if (storeProductAvailabilityListData != null) {
            return storeProductAvailabilityListData;
        }
        throw ExceptionExtKt.i(apolloResponse.d);
    }
}
