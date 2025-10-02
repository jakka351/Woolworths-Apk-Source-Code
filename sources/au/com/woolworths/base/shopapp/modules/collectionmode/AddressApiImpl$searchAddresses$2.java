package au.com.woolworths.base.shopapp.modules.collectionmode;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.base.shopapp.models.address.AddressResult;
import au.com.woolworths.modules.address.SearchAddressesQuery;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/base/shopapp/models/address/AddressResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.base.shopapp.modules.collectionmode.AddressApiImpl$searchAddresses$2", f = "AddressApiImpl.kt", l = {89}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AddressApiImpl$searchAddresses$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AddressResult>, Object> {
    public int p;
    public final /* synthetic */ AddressApiImpl q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressApiImpl$searchAddresses$2(AddressApiImpl addressApiImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.q = addressApiImpl;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressApiImpl$searchAddresses$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressApiImpl$searchAddresses$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f4622a;
            SearchAddressesQuery searchAddressesQuery = new SearchAddressesQuery(this.r);
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, searchAddressesQuery);
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
        List list = ((SearchAddressesQuery.Data) ExceptionExtKt.k((ApolloResponse) obj)).f9062a;
        if (list != null) {
            ArrayList arrayListB = CollectionsKt.B(list);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str = ((SearchAddressesQuery.SearchAddress) next).f9063a;
                if (str != null && str.length() != 0) {
                    arrayList2.add(next);
                }
            }
            arrayList = new ArrayList(CollectionsKt.s(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                SearchAddressesQuery.SearchAddress searchAddress = (SearchAddressesQuery.SearchAddress) it2.next();
                arrayList.add(new AddressResult.Address(searchAddress.f9063a, searchAddress.b));
            }
        } else {
            arrayList = null;
        }
        AddressResult addressResult = new AddressResult();
        addressResult.b(arrayList);
        return addressResult;
    }
}
