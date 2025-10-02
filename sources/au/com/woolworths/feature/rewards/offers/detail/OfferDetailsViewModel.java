package au.com.woolworths.feature.rewards.offers.detail;

import androidx.compose.runtime.Stable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleMonitor;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.data.OfferDetailsParams;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract;
import au.com.woolworths.feature.rewards.offers.domain.OfferDetailsInteractorImpl;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsFooter;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.analytics.BasicRewardsOfferStatusDataExtKt;
import au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent;
import au.com.woolworths.marketing.SwrveInteractor;
import au.com.woolworths.sdui.rewards.model.ActionType;
import com.swrve.sdk.SwrveSDKBase;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailsViewModel extends ViewModel {
    public final OfferDetailsParams e;
    public final boolean f;
    public final List g;
    public final OfferDetailsInteractorImpl h;
    public final RewardsOfferAnalyticsManager i;
    public final SwrveInteractor j;
    public final FeatureToggleManager k;
    public final SharedFlowImpl l;
    public final Flow m;
    public final MutableStateFlow n;
    public final StateFlow o;
    public OfferDetailsAnalytics.OfferDetails p;

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsViewModel$Factory;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        OfferDetailsViewModel a(OfferDetailsParams offerDetailsParams, boolean z, List list);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionType actionType = ActionType.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public OfferDetailsViewModel(OfferDetailsParams offerDetailsParams, boolean z, List list, OfferDetailsInteractorImpl offerDetailsInteractorImpl, RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager, SwrveInteractor swrveInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(swrveInteractor, "swrveInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = offerDetailsParams;
        this.f = z;
        this.g = list;
        this.h = offerDetailsInteractorImpl;
        this.i = rewardsOfferAnalyticsManager;
        this.j = swrveInteractor;
        this.k = featureToggleManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(OfferDetailsContract.ViewState.Loading.f6308a);
        this.n = mutableStateFlowA;
        this.o = FlowKt.b(mutableStateFlowA);
        new FeatureToggleMonitor(this, featureToggleManager).a(TigerNewFeature.d, new FlowCollector() { // from class: au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel$1$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MutableStateFlow mutableStateFlow = this.d.n;
                OfferDetailsContract.ViewState viewState = (OfferDetailsContract.ViewState) mutableStateFlow.getValue();
                if (viewState instanceof OfferDetailsContract.ViewState.Content) {
                    mutableStateFlow.setValue(OfferDetailsContract.ViewState.Content.c((OfferDetailsContract.ViewState.Content) viewState, false, null, zBooleanValue, 7));
                }
                return Unit.f24250a;
            }
        });
    }

    public static final void p6(OfferDetailsViewModel offerDetailsViewModel) {
        OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage;
        OfferDetailsFooter offerDetailsFooter;
        if (offerDetailsViewModel.f) {
            OfferDetailsContract.ViewState.Content contentB = ((OfferDetailsContract.ViewState) offerDetailsViewModel.o.getValue()).b();
            if (((contentB == null || (offerDetailsPage = contentB.c) == null || (offerDetailsFooter = offerDetailsPage.c) == null) ? null : offerDetailsFooter.b) != null) {
                offerDetailsViewModel.u6();
            }
        }
    }

    public static final void q6(OfferDetailsViewModel offerDetailsViewModel) {
        OfferDetailsAnalytics.OfferDetails offerDetails = offerDetailsViewModel.p;
        OfferDetailsContract.ViewState.Content contentB = ((OfferDetailsContract.ViewState) offerDetailsViewModel.n.getValue()).b();
        OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage = contentB != null ? contentB.c : null;
        if (offerDetails == null || offerDetailsPage == null) {
            return;
        }
        RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = offerDetailsViewModel.i;
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = offerDetailsPage.d;
        rewardsOfferAnalyticsManager.getClass();
        rewardsOfferAnalyticsManager.f(CollectionsKt.Q(rewardsOfferAnalyticsData), RewardsOfferAnalyticsManager.b(offerDetails), null, null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public static final void r6(OfferDetailsViewModel offerDetailsViewModel, RewardsOfferData offer) {
        OfferDetailsAnalytics.OfferDetails offerDetails = offerDetailsViewModel.p;
        if (offerDetails != null) {
            RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = offerDetailsViewModel.i;
            List list = offerDetailsViewModel.g;
            rewardsOfferAnalyticsManager.getClass();
            Intrinsics.h(offer, "offer");
            List listQ = CollectionsKt.Q(offer);
            ArrayList arrayList = new ArrayList(CollectionsKt.s(listQ, 10));
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                arrayList.add(((RewardsOfferData) it.next()).r);
            }
            rewardsOfferAnalyticsManager.h(arrayList, RewardsOfferAnalyticsManager.b(offerDetails), null, list);
            SwrveInteractor swrveInteractor = offerDetailsViewModel.j;
            RewardsOffersSwrveEvent rewardsOffersSwrveEvent = RewardsOffersSwrveEvent.e;
            Map mapD = BasicRewardsOfferStatusDataExtKt.d(offer, "Offer Details");
            swrveInteractor.getClass();
            if (SwrveSDKBase.f19075a == null || ((Boolean) swrveInteractor.c.f8895a.invoke()).booleanValue()) {
                return;
            }
            String d = rewardsOffersSwrveEvent.getD();
            SwrveSDKBase.a();
            SwrveSDKBase.f19075a.E(d, mapD);
        }
    }

    public static final void s6(OfferDetailsViewModel offerDetailsViewModel, OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage) {
        RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = offerDetailsViewModel.i;
        RewardsOfferAnalyticsData offerAnalytics = offerDetailsPage.d;
        rewardsOfferAnalyticsManager.getClass();
        Intrinsics.h(offerAnalytics, "offerAnalytics");
        OfferDetailsAnalytics.OfferDetails offerDetailsB = BasicRewardsOfferStatusDataExtKt.b(offerAnalytics);
        rewardsOfferAnalyticsManager.b.g(offerDetailsB);
        offerDetailsViewModel.p = offerDetailsB;
    }

    public static final void t6(OfferDetailsViewModel offerDetailsViewModel, OfferDetailsPageResponse.RewardsErrorEmptyState rewardsErrorEmptyState) {
        RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = offerDetailsViewModel.i;
        final String str = rewardsErrorEmptyState.c;
        if (str == null) {
            str = "";
        }
        rewardsOfferAnalyticsManager.getClass();
        final OfferDetailsAnalytics.OfferDetailsError.Action action = new OfferDetailsAnalytics.OfferDetailsError().f;
        action.getClass();
        rewardsOfferAnalyticsManager.b.g(new Event(action, str) { // from class: au.com.woolworths.analytics.rewards.offer.OfferDetailsAnalytics$OfferDetailsError$Action$offerError$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                spreadBuilder.b(action.f4023a.e);
                androidx.constraintlayout.core.state.a.z("event.Action", "impression", spreadBuilder, "event.Label", str);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "error_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    public final void u6() {
        String label;
        OfferDetailsFooter offerDetailsFooter;
        ContentCta contentCta = null;
        BuildersKt.c(ViewModelKt.a(this), null, null, new OfferDetailsViewModel$activateOffer$1(this, null), 3);
        OfferDetailsAnalytics.OfferDetails offerDetails = this.p;
        OfferDetailsContract.ViewState.Content contentB = ((OfferDetailsContract.ViewState) this.n.getValue()).b();
        OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage = contentB != null ? contentB.c : null;
        if (offerDetailsPage != null && (offerDetailsFooter = offerDetailsPage.c) != null) {
            contentCta = offerDetailsFooter.b;
        }
        if (offerDetails == null || offerDetailsPage == null || contentCta == null) {
            return;
        }
        RewardsOfferAnalyticsData offerAnalytics = offerDetailsPage.d;
        AnalyticsData onCtaClickAnalytics = contentCta.getOnCtaClickAnalytics();
        if (onCtaClickAnalytics == null || (label = onCtaClickAnalytics.getEventLabel()) == null) {
            label = contentCta.getLabel();
        }
        String eventLabel = label;
        RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager = this.i;
        rewardsOfferAnalyticsManager.getClass();
        Intrinsics.h(offerAnalytics, "offerAnalytics");
        Intrinsics.h(eventLabel, "eventLabel");
        rewardsOfferAnalyticsManager.k(offerAnalytics, RewardsOfferAnalyticsManager.b(offerDetails), eventLabel, null, this.g);
    }

    public final void v6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new OfferDetailsViewModel$fetchOfferDetails$1(this, null), 3);
    }
}
