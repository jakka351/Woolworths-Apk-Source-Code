package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.offers.data.ActivationResult;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import au.com.woolworths.foundation.rewards.offers.event.routing.RewardsOffersEvent;
import au.com.woolworths.foundation.rewards.offers.event.routing.RewardsOffersEventRouter;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.offers.ActivateOfferInFeedMutation;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOfferRepository$activateOfferInFeed$2", f = "RewardsOfferRepository.kt", l = {487, 491}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsOfferRepository$activateOfferInFeed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object p;
    public RewardsOfferData q;
    public OfferActivationScreen r;
    public int s;
    public final /* synthetic */ RewardsOfferRepository t;
    public final /* synthetic */ RewardsOfferData u;
    public final /* synthetic */ OfferActivationScreen v;
    public final /* synthetic */ String w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOfferRepository$activateOfferInFeed$2(RewardsOfferRepository rewardsOfferRepository, RewardsOfferData rewardsOfferData, OfferActivationScreen offerActivationScreen, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.t = rewardsOfferRepository;
        this.u = rewardsOfferData;
        this.v = offerActivationScreen;
        this.w = str;
        this.x = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOfferRepository$activateOfferInFeed$2(this.t, this.u, this.v, this.w, this.x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOfferRepository$activateOfferInFeed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object objB;
        RewardsOfferData rewardsOfferData;
        OfferActivationScreen offerActivationScreen;
        RewardsOfferRepository rewardsOfferRepository;
        Boolean bool;
        MutableStateFlow mutableStateFlow;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        Unit unit = Unit.f24250a;
        OfferActivationScreen offerActivationScreen2 = this.v;
        String str = this.w;
        RewardsOfferRepository rewardsOfferRepository2 = this.t;
        try {
            try {
                try {
                } catch (GraphQlException e) {
                    throw ExceptionExtKt.h(e);
                } catch (ApolloException e2) {
                    throw ExceptionExtKt.j(e2);
                }
            } catch (NoConnectivityException e3) {
                rewardsOfferRepository2.j.f(new ActivationResult.Offer.Error(this.u, null, e3, null, offerActivationScreen2, 40));
                MutableStateFlow mutableStateFlow2 = rewardsOfferRepository2.h;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.d(value2, SetsKt.d((Set) value2, str)));
            } catch (ServerErrorException e4) {
                rewardsOfferRepository2.j.f(new ActivationResult.Offer.Error(this.u, null, e4, null, offerActivationScreen2, 40));
                MutableStateFlow mutableStateFlow3 = rewardsOfferRepository2.h;
                do {
                    value = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.d(value, SetsKt.d((Set) value, str)));
            }
            if (i == 0) {
                ResultKt.b(obj);
                String str2 = this.w;
                boolean z = this.x;
                RewardsOfferData rewardsOfferData2 = this.u;
                ApolloClient apolloClient = rewardsOfferRepository2.f6241a;
                FeatureToggleManager featureToggleManager = rewardsOfferRepository2.c;
                ApolloCall apolloCallA = apolloClient.a(new ActivateOfferInFeedMutation(str2, rewardsOfferRepository2.d.a(), featureToggleManager.c(RewardsBaseFeature.n), z, new Optional.Present(Boolean.valueOf(rewardsOfferRepository2.l)), new Optional.Present(Boolean.valueOf(RewardsOfferRepository.a(rewardsOfferRepository2))), rewardsOfferRepository2.m, featureToggleManager.c(TigerNewFeature.d)));
                this.p = rewardsOfferRepository2;
                this.q = rewardsOfferData2;
                this.r = offerActivationScreen2;
                this.s = 1;
                objB = apolloCallA.b(this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rewardsOfferData = rewardsOfferData2;
                offerActivationScreen = offerActivationScreen2;
                rewardsOfferRepository = rewardsOfferRepository2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bool = (Boolean) this.p;
                    ResultKt.b(obj);
                    bool.getClass();
                    mutableStateFlow = rewardsOfferRepository2.h;
                    do {
                        value4 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value4, SetsKt.d((Set) value4, str)));
                    return unit;
                }
                OfferActivationScreen offerActivationScreen3 = this.r;
                rewardsOfferData = this.q;
                rewardsOfferRepository = (RewardsOfferRepository) this.p;
                ResultKt.b(obj);
                offerActivationScreen = offerActivationScreen3;
                objB = obj;
            }
            Boolean boolValueOf = Boolean.valueOf(rewardsOfferRepository.j.f(RewardsOfferRepository.c(rewardsOfferRepository, (ApolloResponse) objB, rewardsOfferData, offerActivationScreen)));
            RewardsOffersEventRouter rewardsOffersEventRouter = rewardsOfferRepository2.e;
            RewardsOffersEvent.Boosted boosted = new RewardsOffersEvent.Boosted(str);
            this.p = boolValueOf;
            this.q = null;
            this.r = null;
            this.s = 2;
            Object objEmit = rewardsOffersEventRouter.f8603a.emit(boosted, this);
            if (objEmit != coroutineSingletons) {
                objEmit = unit;
            }
            if (objEmit != coroutineSingletons) {
                bool = boolValueOf;
                bool.getClass();
                mutableStateFlow = rewardsOfferRepository2.h;
                do {
                    value4 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value4, SetsKt.d((Set) value4, str)));
                return unit;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            MutableStateFlow mutableStateFlow4 = rewardsOfferRepository2.h;
            do {
                value3 = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.d(value3, SetsKt.d((Set) value3, str)));
            throw th;
        }
    }
}
