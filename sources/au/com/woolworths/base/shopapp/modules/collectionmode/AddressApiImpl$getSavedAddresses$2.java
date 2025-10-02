package au.com.woolworths.base.shopapp.modules.collectionmode;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import au.com.woolworths.modules.address.GetAddressesQuery;
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
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/base/shopapp/models/address/SaveAddressResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.base.shopapp.modules.collectionmode.AddressApiImpl$getSavedAddresses$2", f = "AddressApiImpl.kt", l = {33}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AddressApiImpl$getSavedAddresses$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SaveAddressResult>, Object> {
    public int p;
    public final /* synthetic */ AddressApiImpl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressApiImpl$getSavedAddresses$2(AddressApiImpl addressApiImpl, Continuation continuation) {
        super(2, continuation);
        this.q = addressApiImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressApiImpl$getSavedAddresses$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressApiImpl$getSavedAddresses$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f4622a;
            GetAddressesQuery getAddressesQuery = new GetAddressesQuery();
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, getAddressesQuery);
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
        List list = ((GetAddressesQuery.Data) ExceptionExtKt.k((ApolloResponse) obj)).f9056a;
        if (list != null) {
            ArrayList arrayListB = CollectionsKt.B(list);
            arrayList = new ArrayList(CollectionsKt.s(arrayListB, 10));
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                GetAddressesQuery.GetAddress getAddress = (GetAddressesQuery.GetAddress) it.next();
                SaveAddressResult.Address address = new SaveAddressResult.Address(getAddress.f9057a, getAddress.b);
                address.i(getAddress.c);
                address.h(getAddress.d);
                address.j(getAddress.e);
                address.k(getAddress.f);
                address.l(String.valueOf(getAddress.g));
                address.m(getAddress.h);
                arrayList.add(address);
            }
        } else {
            arrayList = null;
        }
        SaveAddressResult saveAddressResult = new SaveAddressResult();
        List list2 = arrayList;
        if (arrayList == null) {
            list2 = EmptyList.d;
        }
        saveAddressResult.b(list2);
        return saveAddressResult;
    }
}
