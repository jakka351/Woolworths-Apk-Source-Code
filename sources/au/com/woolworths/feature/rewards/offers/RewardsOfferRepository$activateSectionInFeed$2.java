package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.offers.OfferActivationScreen;
import au.com.woolworths.feature.rewards.offers.data.ActivationResult;
import au.com.woolworths.feature.rewards.offers.data.OffersSections;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.offers.ActivateSectionInFeedMutation;
import java.util.ArrayList;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOfferRepository$activateSectionInFeed$2", f = "RewardsOfferRepository.kt", l = {538}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsOfferRepository$activateSectionInFeed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public RewardsOfferRepository p;
    public OffersSections q;
    public OfferActivationScreen.Offers r;
    public int s;
    public final /* synthetic */ RewardsOfferRepository t;
    public final /* synthetic */ OffersSections u;
    public final /* synthetic */ String v;
    public final /* synthetic */ ArrayList w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOfferRepository$activateSectionInFeed$2(RewardsOfferRepository rewardsOfferRepository, OffersSections offersSections, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.t = rewardsOfferRepository;
        this.u = offersSections;
        this.v = str;
        this.w = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOfferRepository$activateSectionInFeed$2(this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOfferRepository$activateSectionInFeed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object objB;
        OfferActivationScreen.Offers offers;
        OffersSections offersSections;
        RewardsOfferRepository rewardsOfferRepository;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.s;
        OffersSections offersSections2 = this.u;
        ArrayList arrayList = this.w;
        String str = this.v;
        RewardsOfferRepository rewardsOfferRepository2 = this.t;
        try {
            try {
                try {
                    try {
                        if (i == 0) {
                            ResultKt.b(obj);
                            String str2 = this.v;
                            OfferActivationScreen.Offers offers2 = OfferActivationScreen.Offers.f6228a;
                            ApolloClient apolloClient = rewardsOfferRepository2.f6241a;
                            FeatureToggleManager featureToggleManager = rewardsOfferRepository2.c;
                            ApolloCall apolloCallA = apolloClient.a(new ActivateSectionInFeedMutation(str2, rewardsOfferRepository2.d.a(), featureToggleManager.c(RewardsBaseFeature.n), new Optional.Present(Boolean.valueOf(RewardsOfferRepository.a(rewardsOfferRepository2))), rewardsOfferRepository2.m, featureToggleManager.c(TigerNewFeature.d)));
                            this.p = rewardsOfferRepository2;
                            this.q = offersSections2;
                            this.r = offers2;
                            this.s = 1;
                            objB = apolloCallA.b(this);
                            if (objB == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            offers = offers2;
                            offersSections = offersSections2;
                            rewardsOfferRepository = rewardsOfferRepository2;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            offers = this.r;
                            offersSections = this.q;
                            RewardsOfferRepository rewardsOfferRepository3 = this.p;
                            ResultKt.b(obj);
                            rewardsOfferRepository = rewardsOfferRepository3;
                            objB = obj;
                        }
                        rewardsOfferRepository.j.f(RewardsOfferRepository.d(rewardsOfferRepository, (ApolloResponse) objB, offersSections, offers));
                        rewardsOfferRepository2.i.remove(str);
                        MutableStateFlow mutableStateFlow = rewardsOfferRepository2.h;
                        do {
                            value4 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value4, SetsKt.e((Set) value4, arrayList)));
                    } catch (GraphQlException e) {
                        throw ExceptionExtKt.h(e);
                    } catch (ApolloException e2) {
                        throw ExceptionExtKt.j(e2);
                    }
                } catch (ServerErrorException e3) {
                    rewardsOfferRepository2.j.f(new ActivationResult.Section.Error(offersSections2, null, e3, null, 24));
                    rewardsOfferRepository2.i.remove(str);
                    MutableStateFlow mutableStateFlow2 = rewardsOfferRepository2.h;
                    do {
                        value = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.d(value, SetsKt.e((Set) value, arrayList)));
                }
            } catch (NoConnectivityException e4) {
                rewardsOfferRepository2.j.f(new ActivationResult.Section.Error(offersSections2, null, e4, null, 24));
                rewardsOfferRepository2.i.remove(str);
                MutableStateFlow mutableStateFlow3 = rewardsOfferRepository2.h;
                do {
                    value2 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.d(value2, SetsKt.e((Set) value2, arrayList)));
            }
            return Unit.f24250a;
        } catch (Throwable th) {
            rewardsOfferRepository2.i.remove(str);
            MutableStateFlow mutableStateFlow4 = rewardsOfferRepository2.h;
            do {
                value3 = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.d(value3, SetsKt.e((Set) value3, arrayList)));
            throw th;
        }
    }
}
