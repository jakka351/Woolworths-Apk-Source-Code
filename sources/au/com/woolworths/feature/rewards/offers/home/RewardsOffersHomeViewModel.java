package au.com.woolworths.feature.rewards.offers.home;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleMonitor;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardDataKt;
import au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseViewModel;
import au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt;
import au.com.woolworths.feature.rewards.offers.ViewItemMapper;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.banner.RewardsBannerInteractor;
import au.com.woolworths.feature.rewards.offers.data.RewardsHomeOfferFeed;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFeed;
import au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeContract;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationAnimationData;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import au.com.woolworths.rewards.base.DeepLinkInteractor;
import au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor;
import au.com.woolworths.rewards.base.homepage.HomeRefreshInteractor;
import au.com.woolworths.rewards.base.homepage.HomeRefreshInteractor.ContentRefreshNotifier;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeViewModel;", "Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseViewModel;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOffersHomeViewModel extends RewardsOfferBaseViewModel {
    public final ViewItemMapper A;
    public final RewardsAccountInteractor m;
    public final RewardsHomeOfferFeedInteractor n;
    public final RewardsOfferActivationInteractor o;
    public final AnalyticsManager p;
    public final SwrveEventTrackerImpl q;
    public final DeepLinkInteractor r;
    public final HomeRefreshInteractor s;
    public final FeatureToggleManager t;
    public final RewardsOfferAnalyticsManager u;
    public final MutableStateFlow v;
    public boolean w;
    public boolean x;
    public final StateFlow y;
    public String z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel$1", f = "RewardsOffersHomeViewModel.kt", l = {115}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsOffersHomeViewModel.this.new AnonymousClass1(continuation);
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
            RewardsOffersHomeViewModel rewardsOffersHomeViewModel = RewardsOffersHomeViewModel.this;
            RewardsOfferActivationInteractor rewardsOfferActivationInteractor = rewardsOffersHomeViewModel.o;
            b bVar = new b(rewardsOffersHomeViewModel, 0);
            this.p = 1;
            rewardsOfferActivationInteractor.d(bVar, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeViewModel$Companion;", "", "", "OFFER_ACTIVATION_MESSAGE_DELAY", "J", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6350a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RewardsOfferListFullPageErrorState.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = RewardsOfferListFullPageErrorState.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState2 = RewardsOfferListFullPageErrorState.d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState3 = RewardsOfferListFullPageErrorState.d;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Region.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Region.Companion companion = Region.h;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f6350a = iArr2;
            int[] iArr3 = new int[OfferActivationAnimationData.values().length];
            try {
                iArr3[OfferActivationAnimationData.CONFETTI.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOffersHomeViewModel(RewardsAccountInteractor rewardsAccountInteractor, RewardsHomeOfferFeedInteractor rewardsHomeOfferFeedInteractor, RewardsOfferActivationInteractor rewardsOfferActivationInteractor, AnalyticsManager analyticsManager, SwrveEventTrackerImpl swrveEventTrackerImpl, RewardsBannerInteractor rewardsBannerInteractor, HomepageCoachMarkInteractor homepageCoachMarkInteractor, DeepLinkInteractor deepLinkInteractor, HomeRefreshInteractor homeRefreshInteractor, FeatureToggleManager featureToggleManager, RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager) {
        super(analyticsManager, rewardsBannerInteractor);
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(deepLinkInteractor, "deepLinkInteractor");
        Intrinsics.h(homeRefreshInteractor, "homeRefreshInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.m = rewardsAccountInteractor;
        this.n = rewardsHomeOfferFeedInteractor;
        this.o = rewardsOfferActivationInteractor;
        this.p = analyticsManager;
        this.q = swrveEventTrackerImpl;
        this.r = deepLinkInteractor;
        this.s = homeRefreshInteractor;
        this.t = featureToggleManager;
        this.u = rewardsOfferAnalyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new RewardsOffersHomeContract.ViewState(true, null, null, null, null, null, false, RewardsCardDataKt.a(rewardsAccountInteractor.getCardData()), EmptyList.d, true, false));
        this.v = mutableStateFlowA;
        new HashSet();
        this.y = mutableStateFlowA;
        this.A = new ViewItemMapper(rewardsOfferActivationInteractor);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        this.i = new b(this, 1);
        FeatureToggleMonitor featureToggleMonitor = new FeatureToggleMonitor(this, featureToggleManager);
        featureToggleMonitor.a(RewardsHomeOffersFeatureKt.f6341a, new FlowCollector() { // from class: au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel$3$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MutableStateFlow mutableStateFlow = this.d.v;
                mutableStateFlow.setValue(RewardsOffersHomeContract.ViewState.a((RewardsOffersHomeContract.ViewState) mutableStateFlow.getValue(), false, null, null, null, null, null, false, null, null, zBooleanValue, false, 3071));
                return Unit.f24250a;
            }
        });
        featureToggleMonitor.a(TigerNewFeature.d, new FlowCollector() { // from class: au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel$3$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MutableStateFlow mutableStateFlow = this.d.v;
                mutableStateFlow.setValue(RewardsOffersHomeContract.ViewState.a((RewardsOffersHomeContract.ViewState) mutableStateFlow.getValue(), false, null, null, null, null, null, false, null, null, false, zBooleanValue, 2047));
                return Unit.f24250a;
            }
        });
    }

    public final void r6(String str) {
        if (str == null) {
            return;
        }
        Uri.parse(str);
        this.r.getClass();
        this.g.f(new RewardsOfferBaseContract.Actions.OpenUrl(str));
    }

    public final void s6() {
        MutableStateFlow mutableStateFlow = this.v;
        mutableStateFlow.setValue(RewardsOffersHomeContract.ViewState.a((RewardsOffersHomeContract.ViewState) mutableStateFlow.getValue(), false, null, null, null, null, null, false, null, null, false, false, 4087));
    }

    public final RewardsOffersHomeContract.ViewState t6(RewardsHomeOfferFeed rewardsHomeOfferFeed) {
        RewardsOffersHomeContract.ViewState viewStateA = RewardsOffersHomeContract.ViewState.a((RewardsOffersHomeContract.ViewState) this.y.getValue(), false, null, rewardsHomeOfferFeed.b, ViewItemMapper.b(this.A, rewardsHomeOfferFeed.d), rewardsHomeOfferFeed.c, rewardsHomeOfferFeed.f6283a, false, null, null, false, false, 3975);
        List list = viewStateA.d;
        List listD = list != null ? SectionViewItemExtKt.d(SectionViewItemExtKt.b(list)) : null;
        if (listD != null && !listD.isEmpty()) {
            return viewStateA;
        }
        this.p.c(RewardsPointsActionData.n);
        return viewStateA;
    }

    public final RewardsOffersHomeContract.ViewState u6(RewardsOfferFeed rewardsOfferFeed) {
        return t6(new RewardsHomeOfferFeed(rewardsOfferFeed.f6286a, rewardsOfferFeed.b, rewardsOfferFeed.c, rewardsOfferFeed.e, rewardsOfferFeed.f, rewardsOfferFeed.g, rewardsOfferFeed.h));
    }

    public final void v6() {
        HomeRefreshInteractor.ContentRefreshNotifier contentRefreshNotifier;
        RewardsCardData cardData = this.m.getCardData();
        String number = cardData != null ? cardData.getNumber() : null;
        if (number == null || StringsKt.D(number)) {
            this.g.f(RewardsOffersHomeContract.Actions.CloseScreen.f6342a);
            return;
        }
        this.w = false;
        this.x = false;
        MutableStateFlow mutableStateFlow = this.v;
        mutableStateFlow.setValue(RewardsOffersHomeContract.ViewState.a((RewardsOffersHomeContract.ViewState) mutableStateFlow.getValue(), true, null, null, null, null, null, false, null, null, false, false, 4090));
        if (((RewardsOffersHomeContract.ViewState) mutableStateFlow.getValue()).d != null) {
            HomeRefreshInteractor homeRefreshInteractor = this.s;
            MutableStateFlow mutableStateFlow2 = homeRefreshInteractor.b;
            mutableStateFlow2.setValue(Integer.valueOf(((Number) mutableStateFlow2.getValue()).intValue() + 1));
            contentRefreshNotifier = homeRefreshInteractor.new ContentRefreshNotifier();
        } else {
            contentRefreshNotifier = null;
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsOffersHomeViewModel$refreshFeed$2(this, contentRefreshNotifier, null), 3);
    }
}
