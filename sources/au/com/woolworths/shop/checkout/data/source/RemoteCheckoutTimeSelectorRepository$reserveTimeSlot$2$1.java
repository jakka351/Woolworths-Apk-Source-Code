package au.com.woolworths.shop.checkout.data.source;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.shop.checkout.data.mappers.CollectionModeIdExtKt;
import au.com.woolworths.shop.checkout.domain.model.UpfrontFulfilmentWindowResult;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.shop.checkout.SetFulfilmentWindowMutation;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/checkout/domain/model/UpfrontFulfilmentWindowResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.data.source.RemoteCheckoutTimeSelectorRepository$reserveTimeSlot$2$1", f = "RemoteCheckoutTimeSelectorRepository.kt", l = {67}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class RemoteCheckoutTimeSelectorRepository$reserveTimeSlot$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UpfrontFulfilmentWindowResult>, Object> {
    public int p;
    public final /* synthetic */ RemoteCheckoutTimeSelectorRepository q;
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCheckoutTimeSelectorRepository$reserveTimeSlot$2$1(RemoteCheckoutTimeSelectorRepository remoteCheckoutTimeSelectorRepository, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.q = remoteCheckoutTimeSelectorRepository;
        this.r = i;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteCheckoutTimeSelectorRepository$reserveTimeSlot$2$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteCheckoutTimeSelectorRepository$reserveTimeSlot$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RemoteCheckoutTimeSelectorRepository remoteCheckoutTimeSelectorRepository = this.q;
                int i2 = this.r;
                String str = this.s;
                ApolloClient apolloClient = remoteCheckoutTimeSelectorRepository.f10547a;
                SetFulfilmentWindowMutation setFulfilmentWindowMutation = new SetFulfilmentWindowMutation(i2, str, Optional.Absent.f13523a);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, setFulfilmentWindowMutation);
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
                throw new MutationErrorException(list);
            }
            SetFulfilmentWindowMutation.SetFulfilmentWindow setFulfilmentWindow = ((SetFulfilmentWindowMutation.Data) ExceptionExtKt.k(apolloResponse)).f21893a;
            UpfrontFulfilmentWindowResult upfrontFulfilmentWindowResult = setFulfilmentWindow != null ? new UpfrontFulfilmentWindowResult(CollectionModeIdExtKt.a(setFulfilmentWindow.b)) : null;
            if (upfrontFulfilmentWindowResult != null) {
                return upfrontFulfilmentWindowResult;
            }
            throw ExceptionExtKt.i(list);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
