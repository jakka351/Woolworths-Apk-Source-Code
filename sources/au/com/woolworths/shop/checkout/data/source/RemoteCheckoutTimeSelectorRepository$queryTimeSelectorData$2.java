package au.com.woolworths.shop.checkout.data.source;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import au.com.woolworths.shop.checkout.data.mappers.CheckoutFulfilmentWindowsExtKt;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.shop.checkout.FulfilmentWindowsV2Query;
import java.util.List;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindows;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.data.source.RemoteCheckoutTimeSelectorRepository$queryTimeSelectorData$2", f = "RemoteCheckoutTimeSelectorRepository.kt", l = {45}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class RemoteCheckoutTimeSelectorRepository$queryTimeSelectorData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FulfilmentWindows>, Object> {
    public int p;
    public final /* synthetic */ RemoteCheckoutTimeSelectorRepository q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCheckoutTimeSelectorRepository$queryTimeSelectorData$2(RemoteCheckoutTimeSelectorRepository remoteCheckoutTimeSelectorRepository, Continuation continuation) {
        super(2, continuation);
        this.q = remoteCheckoutTimeSelectorRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteCheckoutTimeSelectorRepository$queryTimeSelectorData$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteCheckoutTimeSelectorRepository$queryTimeSelectorData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RemoteCheckoutTimeSelectorRepository remoteCheckoutTimeSelectorRepository = this.q;
                ApolloClient apolloClient = remoteCheckoutTimeSelectorRepository.f10547a;
                FeatureToggleManager featureToggleManager = remoteCheckoutTimeSelectorRepository.c;
                BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.j;
                FulfilmentWindowsV2Query fulfilmentWindowsV2Query = new FulfilmentWindowsV2Query(featureToggleManager.c(baseShopAppFeature), featureToggleManager.c(baseShopAppFeature) && featureToggleManager.c(CheckoutFeature.l));
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, fulfilmentWindowsV2Query);
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
            boolean zB = apolloResponse.b();
            List list = apolloResponse.d;
            if (zB) {
                throw ExceptionExtKt.f(list);
            }
            FulfilmentWindowsV2Query.FulfilmentWindowsV2 fulfilmentWindowsV2 = ((FulfilmentWindowsV2Query.Data) ExceptionExtKt.k(apolloResponse)).f21840a;
            FulfilmentWindows fulfilmentWindowsA = fulfilmentWindowsV2 != null ? CheckoutFulfilmentWindowsExtKt.a(fulfilmentWindowsV2.b) : null;
            if (fulfilmentWindowsA != null) {
                return fulfilmentWindowsA;
            }
            throw ExceptionExtKt.i(list);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
