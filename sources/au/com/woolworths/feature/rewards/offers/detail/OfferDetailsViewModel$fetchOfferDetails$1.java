package au.com.woolworths.feature.rewards.offers.detail;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.data.OfferDetailsParams;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract;
import au.com.woolworths.feature.rewards.offers.domain.OfferDetailsInteractorImpl;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel$fetchOfferDetails$1", f = "OfferDetailsViewModel.kt", l = {88}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class OfferDetailsViewModel$fetchOfferDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OfferDetailsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferDetailsViewModel$fetchOfferDetails$1(OfferDetailsViewModel offerDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = offerDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfferDetailsViewModel$fetchOfferDetails$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfferDetailsViewModel$fetchOfferDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        OfferDetailsViewModel offerDetailsViewModel = this.q;
        RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = offerDetailsViewModel.i;
        MutableStateFlow mutableStateFlow = offerDetailsViewModel.n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                mutableStateFlow.setValue(OfferDetailsContract.ViewState.Loading.f6308a);
                OfferDetailsInteractorImpl offerDetailsInteractorImpl = offerDetailsViewModel.h;
                OfferDetailsParams offerDetailsParams = offerDetailsViewModel.e;
                String str = offerDetailsParams.f6274a;
                String str2 = offerDetailsParams.b;
                this.p = 1;
                obj = offerDetailsInteractorImpl.f6335a.b(str, str2, offerDetailsInteractorImpl.b.a(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            OfferDetailsPageResponse offerDetailsPageResponse = (OfferDetailsPageResponse) obj;
            if (offerDetailsPageResponse instanceof OfferDetailsPageResponse.OfferDetailsPage) {
                OfferDetailsContract.ViewState viewState = (OfferDetailsContract.ViewState) mutableStateFlow.getValue();
                mutableStateFlow.setValue(viewState instanceof OfferDetailsContract.ViewState.Content ? OfferDetailsContract.ViewState.Content.c((OfferDetailsContract.ViewState.Content) viewState, false, (OfferDetailsPageResponse.OfferDetailsPage) offerDetailsPageResponse, false, 10) : new OfferDetailsContract.ViewState.Content(false, false, (OfferDetailsPageResponse.OfferDetailsPage) offerDetailsPageResponse, offerDetailsViewModel.k.c(TigerNewFeature.d)));
                OfferDetailsViewModel.s6(offerDetailsViewModel, (OfferDetailsPageResponse.OfferDetailsPage) offerDetailsPageResponse);
                OfferDetailsViewModel.p6(offerDetailsViewModel);
            } else {
                if (!(offerDetailsPageResponse instanceof OfferDetailsPageResponse.RewardsErrorEmptyState)) {
                    throw new NoWhenBranchMatchedException();
                }
                mutableStateFlow.setValue(new OfferDetailsContract.ViewState.EmptyState((OfferDetailsPageResponse.RewardsErrorEmptyState) offerDetailsPageResponse));
                OfferDetailsViewModel.t6(offerDetailsViewModel, (OfferDetailsPageResponse.RewardsErrorEmptyState) offerDetailsPageResponse);
            }
        } catch (NoConnectivityException unused) {
            mutableStateFlow.setValue(new OfferDetailsContract.ViewState.Error(FullPageError.ConnectionError.f8581a));
            rewardsOfferAnalyticsManager.getClass();
            rewardsOfferAnalyticsManager.b.g((Event) new OfferDetailsAnalytics.OfferDetailsError().f.b.getD());
        } catch (ServerErrorException unused2) {
            mutableStateFlow.setValue(new OfferDetailsContract.ViewState.Error(FullPageError.ServerError.f8582a));
            rewardsOfferAnalyticsManager.getClass();
            rewardsOfferAnalyticsManager.b.g((Event) new OfferDetailsAnalytics.OfferDetailsError().f.d.getD());
        }
        return Unit.f24250a;
    }
}
