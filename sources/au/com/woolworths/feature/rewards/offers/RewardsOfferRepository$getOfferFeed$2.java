package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.base.rewards.account.data.RewardsBalanceData;
import au.com.woolworths.feature.rewards.offers.data.OfferSectionExtKt;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFeed;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFeedData;
import au.com.woolworths.feature.rewards.offers.personalisedoffers.OfferSwapEligibility;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.offers.OfferFeedQuery;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferFeedData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOfferRepository$getOfferFeed$2", f = "RewardsOfferRepository.kt", l = {366}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsOfferRepository$getOfferFeed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RewardsOfferFeedData>, Object> {
    public RewardsOfferRepository p;
    public int q;
    public final /* synthetic */ RewardsOfferRepository r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOfferRepository$getOfferFeed$2(RewardsOfferRepository rewardsOfferRepository, Continuation continuation) {
        super(2, continuation);
        this.r = rewardsOfferRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOfferRepository$getOfferFeed$2(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOfferRepository$getOfferFeed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        RewardsOfferRepository rewardsOfferRepository;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        RewardsOfferRepository rewardsOfferRepository2 = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ApolloClient apolloClient = rewardsOfferRepository2.f6241a;
                FeatureToggleManager featureToggleManager = rewardsOfferRepository2.c;
                OfferFeedQuery offerFeedQuery = new OfferFeedQuery(rewardsOfferRepository2.d.a(), featureToggleManager.c(RewardsBaseFeature.n), rewardsOfferRepository2.l, RewardsOfferRepository.a(rewardsOfferRepository2), rewardsOfferRepository2.m, featureToggleManager.c(TigerNewFeature.d));
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, offerFeedQuery);
                this.p = rewardsOfferRepository2;
                this.q = 1;
                obj = apolloCall.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rewardsOfferRepository = rewardsOfferRepository2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rewardsOfferRepository = this.p;
                ResultKt.b(obj);
            }
            ApolloResponse apolloResponse = (ApolloResponse) obj;
            Operation.Data dataK = ExceptionExtKt.k(apolloResponse);
            List list = apolloResponse.d;
            OfferFeedQuery.RewardsHomePage rewardsHomePage = ((OfferFeedQuery.Data) dataK).f20721a;
            OfferSwapEligibility offerSwapEligibility = null;
            RewardsBalanceData rewardsBalanceData = rewardsHomePage != null ? OfferFeedQueryRewardsHomePageExtKt.a(rewardsHomePage).f6284a : null;
            if (rewardsBalanceData == null) {
                throw ExceptionExtKt.i(list);
            }
            OfferFeedQuery.RewardsOfferFeed rewardsOfferFeed = ((OfferFeedQuery.Data) ExceptionExtKt.k(apolloResponse)).b;
            RewardsOfferFeed rewardsOfferFeedA = rewardsOfferFeed != null ? RewardsOfferFeedFieldsExtKt.a(rewardsOfferFeed.b) : null;
            if (rewardsOfferFeedA == null) {
                throw ExceptionExtKt.i(list);
            }
            OfferFeedQuery.OnAvailablePersonalisedOffers onAvailablePersonalisedOffers = ((OfferFeedQuery.Data) ExceptionExtKt.k(apolloResponse)).c.b;
            if (onAvailablePersonalisedOffers != null) {
                if (!rewardsOfferRepository.c.c(RewardsBaseFeature.n)) {
                    onAvailablePersonalisedOffers = null;
                }
                if (onAvailablePersonalisedOffers != null) {
                    if (!onAvailablePersonalisedOffers.f20722a.isEmpty()) {
                        offerSwapEligibility = onAvailablePersonalisedOffers.c ? OfferSwapEligibility.Available.Swappable.f6364a : OfferSwapEligibility.Available.Unswappable.f6365a;
                    } else if (onAvailablePersonalisedOffers.b) {
                        offerSwapEligibility = OfferSwapEligibility.Unavailable.f6366a;
                    }
                }
            }
            RewardsOfferFeedData rewardsOfferFeedData = new RewardsOfferFeedData(rewardsBalanceData, rewardsOfferFeedA, offerSwapEligibility);
            List<RewardsOfferData> listB = OfferSectionExtKt.b(rewardsOfferFeedA.e);
            rewardsOfferRepository2.getClass();
            for (RewardsOfferData rewardsOfferData : listB) {
                if (rewardsOfferData.n == RewardsOfferStatus.ACTIVATED) {
                    MutableStateFlow mutableStateFlow = rewardsOfferRepository2.h;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value, SetsKt.d((Set) value, rewardsOfferData.d)));
                }
            }
            return rewardsOfferFeedData;
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
