package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferListPage;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.offers.OfferListPageQuery;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferListPage;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOfferRepository$getOfferListPage$2", f = "RewardsOfferRepository.kt", l = {408}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsOfferRepository$getOfferListPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RewardsOfferListPage>, Object> {
    public int p;
    public final /* synthetic */ RewardsOfferRepository q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOfferRepository$getOfferListPage$2(RewardsOfferRepository rewardsOfferRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsOfferRepository;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOfferRepository$getOfferListPage$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOfferRepository$getOfferListPage$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RewardsOfferRepository rewardsOfferRepository = this.q;
                String str = this.r;
                ApolloClient apolloClient = rewardsOfferRepository.f6241a;
                FeatureToggleManager featureToggleManager = rewardsOfferRepository.c;
                OfferListPageQuery offerListPageQuery = new OfferListPageQuery(str, featureToggleManager.c(RewardsBaseFeature.n), rewardsOfferRepository.l, RewardsOfferRepository.a(rewardsOfferRepository), rewardsOfferRepository.m, featureToggleManager.c(TigerNewFeature.d));
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, offerListPageQuery);
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
            OfferListPageQuery.RewardsOffersListPage rewardsOffersListPage = ((OfferListPageQuery.Data) ExceptionExtKt.k(apolloResponse)).f20729a;
            RewardsOfferListPage rewardsOfferListPageB = rewardsOffersListPage != null ? RewardsOfferRepositoryKt.b(rewardsOffersListPage) : null;
            if (rewardsOfferListPageB != null) {
                return rewardsOfferListPageB;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
