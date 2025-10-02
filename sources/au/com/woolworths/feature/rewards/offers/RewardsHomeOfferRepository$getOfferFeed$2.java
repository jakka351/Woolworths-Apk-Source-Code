package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.feature.rewards.offers.data.RewardsHomeOfferFeed;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.offers.HomeOfferFeedQuery;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/rewards/offers/data/RewardsHomeOfferFeed;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsHomeOfferRepository$getOfferFeed$2", f = "RewardsHomeOfferRepository.kt", l = {83}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsHomeOfferRepository$getOfferFeed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RewardsHomeOfferFeed>, Object> {
    public int p;
    public final /* synthetic */ RewardsHomeOfferRepository q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsHomeOfferRepository$getOfferFeed$2(RewardsHomeOfferRepository rewardsHomeOfferRepository, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsHomeOfferRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsHomeOfferRepository$getOfferFeed$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsHomeOfferRepository$getOfferFeed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RewardsHomeOfferRepository rewardsHomeOfferRepository = this.q;
                ApolloClient apolloClient = rewardsHomeOfferRepository.f6234a;
                HomeOfferFeedQuery homeOfferFeedQuery = new HomeOfferFeedQuery(rewardsHomeOfferRepository.d.a(), RewardsHomeOfferRepository.a(rewardsHomeOfferRepository), rewardsHomeOfferRepository.f, rewardsHomeOfferRepository.c.c(TigerNewFeature.d));
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, homeOfferFeedQuery);
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
            HomeOfferFeedQuery.RewardsOfferFeed rewardsOfferFeed = ((HomeOfferFeedQuery.Data) ExceptionExtKt.k(apolloResponse)).f20707a;
            RewardsHomeOfferFeed rewardsHomeOfferFeedA = rewardsOfferFeed != null ? RewardsHomeOfferFeedFieldsExtKt.a(rewardsOfferFeed.b) : null;
            if (rewardsHomeOfferFeedA != null) {
                return rewardsHomeOfferFeedA;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
