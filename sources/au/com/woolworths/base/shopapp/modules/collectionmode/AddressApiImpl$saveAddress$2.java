package au.com.woolworths.base.shopapp.modules.collectionmode;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.base.shopapp.models.address.AddressInput;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import au.com.woolworths.modules.address.SaveAddressMutation;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/base/shopapp/models/address/SaveAddressResult$Address;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.base.shopapp.modules.collectionmode.AddressApiImpl$saveAddress$2", f = "AddressApiImpl.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AddressApiImpl$saveAddress$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SaveAddressResult.Address>, Object> {
    public int p;
    public final /* synthetic */ AddressApiImpl q;
    public final /* synthetic */ AddressInput r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressApiImpl$saveAddress$2(AddressApiImpl addressApiImpl, AddressInput addressInput, Continuation continuation) {
        super(2, continuation);
        this.q = addressApiImpl;
        this.r = addressInput;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressApiImpl$saveAddress$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressApiImpl$saveAddress$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f4622a;
            AddressInput addressInput = this.r;
            SaveAddressMutation saveAddressMutation = new SaveAddressMutation(new au.com.woolworths.shop.graphql.type.AddressInput(Optional.Absent.f13523a, Optional.Companion.a(addressInput.f4619a), Optional.Companion.a(addressInput.b), Optional.Companion.a(addressInput.c), Optional.Companion.a(addressInput.d), Optional.Companion.a(addressInput.e), Optional.Companion.a(addressInput.f), Optional.Companion.a(addressInput.g)));
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, saveAddressMutation);
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
        SaveAddressMutation.SaveAddress saveAddress = ((SaveAddressMutation.Data) ExceptionExtKt.k((ApolloResponse) obj)).f9059a;
        if (saveAddress == null) {
            return null;
        }
        SaveAddressResult.Address address = new SaveAddressResult.Address(saveAddress.f9060a, saveAddress.b);
        address.i(saveAddress.c);
        address.h(saveAddress.d);
        address.j(saveAddress.e);
        address.k(saveAddress.f);
        address.l(String.valueOf(saveAddress.g));
        address.m(saveAddress.h);
        return address;
    }
}
