package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.offers.OfferDetailsQuery;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOfferRepository$getRewardsOfferDetails$2", f = "RewardsOfferRepository.kt", l = {425}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsOfferRepository$getRewardsOfferDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RewardsOfferData>, Object> {
    public int p;
    public final /* synthetic */ RewardsOfferRepository q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOfferRepository$getRewardsOfferDetails$2(RewardsOfferRepository rewardsOfferRepository, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsOfferRepository;
        this.r = str;
        this.s = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOfferRepository$getRewardsOfferDetails$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOfferRepository$getRewardsOfferDetails$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        RewardsOfferRepository rewardsOfferRepository = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                String str = this.r;
                String str2 = this.s;
                ApolloClient apolloClient = rewardsOfferRepository.f6241a;
                OfferDetailsQuery offerDetailsQuery = new OfferDetailsQuery(Optional.Companion.a(str2), str, rewardsOfferRepository.d.a());
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, offerDetailsQuery);
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
            OfferDetailsQuery.RewardsOffer rewardsOffer = ((OfferDetailsQuery.Data) ExceptionExtKt.k(apolloResponse)).f20710a;
            RewardsOfferData rewardsOfferDataA = rewardsOffer != null ? RewardsOfferRepositoryKt.a(rewardsOffer) : null;
            if (rewardsOfferDataA == null) {
                throw ExceptionExtKt.i(apolloResponse.d);
            }
            RewardsOfferRepository.b(rewardsOfferRepository, rewardsOfferDataA);
            return rewardsOfferDataA;
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
