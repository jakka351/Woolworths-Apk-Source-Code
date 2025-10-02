package au.com.woolworths.feature.rewards.offers.detail;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.offers.data.OfferDetailsParams;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract;
import au.com.woolworths.feature.rewards.offers.domain.OfferDetailsInteractorImpl;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsMutationResponse;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
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
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel$activateOffer$1", f = "OfferDetailsViewModel.kt", l = {187}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class OfferDetailsViewModel$activateOffer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OfferDetailsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferDetailsViewModel$activateOffer$1(OfferDetailsViewModel offerDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = offerDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfferDetailsViewModel$activateOffer$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfferDetailsViewModel$activateOffer$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OfferDetailsContract.ViewState.Content contentB;
        OfferDetailsMutationResponse offerDetailsMutationResponse;
        OfferDetailsViewModel offerDetailsViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = offerDetailsViewModel.l;
        StateFlow stateFlow = offerDetailsViewModel.o;
        MutableStateFlow mutableStateFlow = offerDetailsViewModel.n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        OfferDetailsContract.Action.ShowBoostFailureSnackbar showBoostFailureSnackbar = OfferDetailsContract.Action.ShowBoostFailureSnackbar.f6304a;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    OfferDetailsContract.ViewState.Content contentB2 = ((OfferDetailsContract.ViewState) stateFlow.getValue()).b();
                    if (contentB2 != null) {
                        mutableStateFlow.setValue(OfferDetailsContract.ViewState.Content.c(contentB2, true, null, false, 13));
                    }
                    OfferDetailsInteractorImpl offerDetailsInteractorImpl = offerDetailsViewModel.h;
                    OfferDetailsParams offerDetailsParams = offerDetailsViewModel.e;
                    String str = offerDetailsParams.f6274a;
                    String str2 = offerDetailsParams.b;
                    this.p = 1;
                    obj = offerDetailsInteractorImpl.a(str, str2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                offerDetailsMutationResponse = (OfferDetailsMutationResponse) obj;
            } catch (NoConnectivityException unused) {
                sharedFlowImpl.f(showBoostFailureSnackbar);
                OfferDetailsViewModel.q6(offerDetailsViewModel);
                contentB = ((OfferDetailsContract.ViewState) stateFlow.getValue()).b();
                if (contentB != null) {
                }
            } catch (ServerErrorException unused2) {
                sharedFlowImpl.f(showBoostFailureSnackbar);
                OfferDetailsViewModel.q6(offerDetailsViewModel);
                contentB = ((OfferDetailsContract.ViewState) stateFlow.getValue()).b();
                if (contentB != null) {
                }
            }
            if (!(offerDetailsMutationResponse instanceof OfferDetailsMutationResponse.OfferDetailsMutationResult)) {
                throw new NoWhenBranchMatchedException();
            }
            OfferDetailsContract.ViewState viewState = (OfferDetailsContract.ViewState) mutableStateFlow.getValue();
            mutableStateFlow.setValue(viewState instanceof OfferDetailsContract.ViewState.Content ? OfferDetailsContract.ViewState.Content.c((OfferDetailsContract.ViewState.Content) viewState, false, ((OfferDetailsMutationResponse.OfferDetailsMutationResult) offerDetailsMutationResponse).b, false, 10) : new OfferDetailsContract.ViewState.Content(false, false, ((OfferDetailsMutationResponse.OfferDetailsMutationResult) offerDetailsMutationResponse).b, offerDetailsViewModel.k.c(TigerNewFeature.d)));
            RewardsOfferData rewardsOfferData = ((OfferDetailsMutationResponse.OfferDetailsMutationResult) offerDetailsMutationResponse).f6336a;
            if (rewardsOfferData != null) {
                OfferDetailsViewModel.r6(offerDetailsViewModel, rewardsOfferData);
            }
            return Unit.f24250a;
        } finally {
            OfferDetailsContract.ViewState.Content contentB3 = ((OfferDetailsContract.ViewState) stateFlow.getValue()).b();
            if (contentB3 != null) {
                mutableStateFlow.setValue(OfferDetailsContract.ViewState.Content.c(contentB3, false, null, false, 13));
            }
        }
    }
}
