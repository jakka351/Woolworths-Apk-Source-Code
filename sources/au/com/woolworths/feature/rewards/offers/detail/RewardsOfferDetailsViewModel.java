package au.com.woolworths.feature.rewards.offers.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.rewards.offers.OfferActivationScreen;
import au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor;
import au.com.woolworths.feature.rewards.offers.RewardsOfferRepository;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsFullPageErrorStateLegacy;
import au.com.woolworths.feature.rewards.offers.detail.analytics.HomeOfferDetailsActionDataLegacy;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationAnimationData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferScreenData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferUnknown;
import au.com.woolworths.foundation.rewards.offers.model.analytics.BasicRewardsOfferStatusDataExtKt;
import au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import com.woolworths.R;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOfferDetailsViewModel extends ViewModel {
    public final RewardsOfferDetailInteractorLegacy e;
    public final RewardsOfferDetailScreenInteractorLegacy f;
    public final RewardsOfferActivationInteractor g;
    public final AnalyticsManager h;
    public final RewardsOfferAnalyticsManager i;
    public final SwrveEventTrackerImpl j;
    public final FeatureToggleManager k;
    public final OfferDetailsParamsLegacy l;
    public final boolean m;
    public final List n;
    public final MutableStateFlow o;
    public final SharedFlowImpl p;
    public final Flow q;
    public final StateFlow r;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel$1", f = "RewardsOfferDetailsViewModelLegacy.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsOfferDetailsViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f24250a;
            }
            ResultKt.b(obj);
            RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel = RewardsOfferDetailsViewModel.this;
            RewardsOfferActivationInteractor rewardsOfferActivationInteractor = rewardsOfferDetailsViewModel.g;
            l lVar = new l(rewardsOfferDetailsViewModel, 5);
            this.p = 1;
            rewardsOfferActivationInteractor.d(lVar, this);
            return coroutineSingletons;
        }
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsViewModel$Factory;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        RewardsOfferDetailsViewModel a(OfferDetailsParamsLegacy offerDetailsParamsLegacy, boolean z, List list);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6329a;

        static {
            int[] iArr = new int[OfferActivationAnimationData.values().length];
            try {
                iArr[OfferActivationAnimationData.CONFETTI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6329a = iArr;
        }
    }

    public RewardsOfferDetailsViewModel(RewardsOfferDetailInteractorLegacy rewardsOfferDetailInteractorLegacy, RewardsOfferDetailScreenInteractorLegacy rewardsOfferDetailScreenInteractorLegacy, RewardsOfferActivationInteractor rewardsOfferActivationInteractor, AnalyticsManager analyticsManager, RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager, SwrveEventTrackerImpl swrveEventTrackerImpl, FeatureToggleManager featureToggleManager, OfferDetailsParamsLegacy offerDetailsParamsLegacy, boolean z, List list) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = rewardsOfferDetailInteractorLegacy;
        this.f = rewardsOfferDetailScreenInteractorLegacy;
        this.g = rewardsOfferActivationInteractor;
        this.h = analyticsManager;
        this.i = rewardsOfferAnalyticsManager;
        this.j = swrveEventTrackerImpl;
        this.k = featureToggleManager;
        this.l = offerDetailsParamsLegacy;
        this.m = z;
        this.n = list;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new RewardsOfferDetailsContractLegacy.ViewState(null, 0 == true ? 1 : 0, 30));
        this.o = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.p = sharedFlowImplB;
        this.q = FlowKt.a(sharedFlowImplB);
        this.r = mutableStateFlowA;
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    public final void p6() {
        RewardsOfferData rewardsOfferData = ((RewardsOfferDetailsContractLegacy.ViewState) this.r.getValue()).f;
        if (rewardsOfferData == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = this.o;
        mutableStateFlow.setValue(RewardsOfferDetailsContractLegacy.ViewState.a((RewardsOfferDetailsContractLegacy.ViewState) mutableStateFlow.getValue(), false, true, null, null, false, 29));
        this.g.a(rewardsOfferData, OfferActivationScreen.Details.f6227a);
        this.i.l(rewardsOfferData, RewardsOfferScreen.d, HomeOfferDetailsActionDataLegacy.f, this.n);
    }

    public final void q6() {
        MutableStateFlow mutableStateFlow = this.o;
        mutableStateFlow.setValue(RewardsOfferDetailsContractLegacy.ViewState.a((RewardsOfferDetailsContractLegacy.ViewState) mutableStateFlow.getValue(), true, false, null, null, false, 16));
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsOfferDetailsViewModel$fetchOfferDetails$1(this, null), 3);
    }

    public final void r6(RewardsOfferData rewardsOfferData, String str, OfferActivationScreen offerActivationScreen) {
        OfferActivationScreen.Details details = OfferActivationScreen.Details.f6227a;
        if (Intrinsics.c(offerActivationScreen, details)) {
            RewardsOfferScreen rewardsOfferScreen = RewardsOfferScreen.d;
            HomeOfferDetailsActionDataLegacy legacyAction = HomeOfferDetailsActionDataLegacy.g;
            RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = this.i;
            rewardsOfferAnalyticsManager.getClass();
            Intrinsics.h(legacyAction, "legacyAction");
            rewardsOfferAnalyticsManager.i(CollectionsKt.Q(rewardsOfferData), rewardsOfferScreen, legacyAction, this.n);
            this.j.c(RewardsOffersSwrveEvent.e, BasicRewardsOfferStatusDataExtKt.d(rewardsOfferData, RewardsOfferScreen.g.getD()));
        }
        MutableStateFlow mutableStateFlow = this.o;
        mutableStateFlow.setValue(RewardsOfferDetailsContractLegacy.ViewState.a((RewardsOfferDetailsContractLegacy.ViewState) mutableStateFlow.getValue(), false, false, rewardsOfferData, null, false, 16));
        OfferActivationAnimationData offerActivationAnimationData = rewardsOfferData.s;
        if ((offerActivationAnimationData == null ? -1 : WhenMappings.f6329a[offerActivationAnimationData.ordinal()]) == 1) {
            mutableStateFlow.setValue(RewardsOfferDetailsContractLegacy.ViewState.a((RewardsOfferDetailsContractLegacy.ViewState) mutableStateFlow.getValue(), false, false, null, null, true, 15));
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsOfferDetailsViewModel$showOfferActivationMessage$1(rewardsOfferData, this, null), 3);
        RewardsOfferDetailsContractLegacy.Actions.PerformHapticFeedbackForActivationSuccess performHapticFeedbackForActivationSuccess = RewardsOfferDetailsContractLegacy.Actions.PerformHapticFeedbackForActivationSuccess.f6325a;
        SharedFlowImpl sharedFlowImpl = this.p;
        sharedFlowImpl.f(performHapticFeedbackForActivationSuccess);
        if (!Intrinsics.c(offerActivationScreen, details) || str == null) {
            return;
        }
        sharedFlowImpl.f(new RewardsOfferDetailsContractLegacy.Actions.OpenUrl(str));
    }

    public final void s6(RewardsOfferScreenData rewardsOfferScreenData) {
        boolean z = rewardsOfferScreenData instanceof RewardsOfferData;
        MutableStateFlow mutableStateFlow = this.o;
        if (!z) {
            if (!(rewardsOfferScreenData instanceof RewardsOfferUnknown)) {
                throw new NoWhenBranchMatchedException();
            }
            RewardsOfferDetailsContractLegacy.ViewState viewState = (RewardsOfferDetailsContractLegacy.ViewState) mutableStateFlow.getValue();
            mutableStateFlow.setValue(RewardsOfferDetailsContractLegacy.ViewState.a(viewState, false, viewState.b, rewardsOfferScreenData, null, false, 16));
            return;
        }
        RewardsOfferData rewardsOfferData = (RewardsOfferData) rewardsOfferScreenData;
        String offerId = rewardsOfferData.d;
        RewardsOfferActivationInteractor rewardsOfferActivationInteractor = this.g;
        rewardsOfferActivationInteractor.getClass();
        Intrinsics.h(offerId, "offerId");
        RewardsOfferRepository rewardsOfferRepository = rewardsOfferActivationInteractor.f6236a;
        rewardsOfferRepository.getClass();
        mutableStateFlow.setValue(RewardsOfferDetailsContractLegacy.ViewState.a((RewardsOfferDetailsContractLegacy.ViewState) mutableStateFlow.getValue(), false, ((Set) rewardsOfferRepository.h.getValue()).contains(offerId), rewardsOfferScreenData, null, false, 16));
        HomeOfferDetailsActionDataLegacy legacyAction = HomeOfferDetailsActionDataLegacy.o;
        RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = this.i;
        rewardsOfferAnalyticsManager.getClass();
        Intrinsics.h(legacyAction, "legacyAction");
        rewardsOfferAnalyticsManager.b.j(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(legacyAction), BasicRewardsOfferStatusDataExtKt.e(rewardsOfferData));
        InsetBannerApiData insetBannerApiData = rewardsOfferData.B;
        if (insetBannerApiData != null) {
            this.h.j(HomeOfferDetailsActionDataLegacy.p, TrackingMetadata.Companion.a(TrackableValue.n, insetBannerApiData.getMessage()));
        }
        this.j.c(RewardsOffersSwrveEvent.g, BasicRewardsOfferStatusDataExtKt.d((BasicRewardsOfferStatusData) rewardsOfferScreenData, RewardsOfferScreen.g.getD()));
    }

    public final void t6() {
        MutableStateFlow mutableStateFlow = this.o;
        mutableStateFlow.setValue(RewardsOfferDetailsContractLegacy.ViewState.a((RewardsOfferDetailsContractLegacy.ViewState) mutableStateFlow.getValue(), false, false, null, new RewardsOfferDetailsFullPageErrorStateLegacy.CustomErrorWithBackButtonLegacy(new ResText(R.string.rewards_offer_server_error_message)), false, 20));
    }

    public final void u6(Text text) {
        this.p.f(new RewardsOfferDetailsContractLegacy.Actions.ShowOfferActivationError(text));
        MutableStateFlow mutableStateFlow = this.o;
        mutableStateFlow.setValue(RewardsOfferDetailsContractLegacy.ViewState.a((RewardsOfferDetailsContractLegacy.ViewState) mutableStateFlow.getValue(), false, false, null, null, false, 28));
    }

    public final void v6(RewardsOfferDetailsFullPageErrorStateLegacy rewardsOfferDetailsFullPageErrorStateLegacy) {
        boolean zC = Intrinsics.c(rewardsOfferDetailsFullPageErrorStateLegacy, RewardsOfferDetailsFullPageErrorStateLegacy.NoConnectivity.h);
        RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = this.i;
        if (zC) {
            HomeOfferDetailsActionDataLegacy action = HomeOfferDetailsActionDataLegacy.k;
            rewardsOfferAnalyticsManager.getClass();
            Intrinsics.h(action, "action");
            rewardsOfferAnalyticsManager.b.c(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(action));
            return;
        }
        if (Intrinsics.c(rewardsOfferDetailsFullPageErrorStateLegacy, RewardsOfferDetailsFullPageErrorStateLegacy.ServerErrorLegacy.h)) {
            HomeOfferDetailsActionDataLegacy action2 = HomeOfferDetailsActionDataLegacy.l;
            rewardsOfferAnalyticsManager.getClass();
            Intrinsics.h(action2, "action");
            rewardsOfferAnalyticsManager.b.c(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(action2));
            return;
        }
        if (!(rewardsOfferDetailsFullPageErrorStateLegacy instanceof RewardsOfferDetailsFullPageErrorStateLegacy.CustomErrorWithBackButtonLegacy)) {
            throw new NoWhenBranchMatchedException();
        }
        HomeOfferDetailsActionDataLegacy action3 = HomeOfferDetailsActionDataLegacy.l;
        rewardsOfferAnalyticsManager.getClass();
        Intrinsics.h(action3, "action");
        rewardsOfferAnalyticsManager.b.c(new RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(action3));
    }
}
