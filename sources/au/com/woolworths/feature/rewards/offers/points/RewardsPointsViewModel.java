package au.com.woolworths.feature.rewards.offers.points;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardDataKt;
import au.com.woolworths.feature.rewards.offers.OfferSectionViewItem;
import au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseViewModel;
import au.com.woolworths.feature.rewards.offers.RewardsOfferFeedInteractor;
import au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt;
import au.com.woolworths.feature.rewards.offers.ViewItemMapper;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.banner.RewardsBannerInteractor;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFeed;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.h;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.personalisedoffers.OfferSwapEligibility;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationAnimationData;
import au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import au.com.woolworths.rewards.base.DeepLinkInteractor;
import au.com.woolworths.rewards.base.RewardsPageScrollHandler;
import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor;
import au.com.woolworths.rewards.base.homepage.HomeRefreshInteractor;
import au.com.woolworths.rewards.base.homepage.HomeRefreshInteractor.ContentRefreshNotifier;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsViewModel;", "Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseViewModel;", "Lau/com/woolworths/rewards/base/RewardsPageScrollHandler;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsPointsViewModel extends RewardsOfferBaseViewModel implements RewardsPageScrollHandler {
    public final StateFlow A;
    public boolean B;
    public String C;
    public final ViewItemMapper D;
    public final RewardsAccountInteractor m;
    public final RewardsOfferFeedInteractor n;
    public final RewardsOfferActivationInteractor o;
    public final AnalyticsManager p;
    public final SwrveEventTrackerImpl q;
    public final DeepLinkInteractor r;
    public final HomeRefreshInteractor s;
    public final FeatureToggleManager t;
    public final RewardsOfferAnalyticsManager u;
    public final RewardsPageScrollManager v;
    public final MutableStateFlow w;
    public final HashSet x;
    public boolean y;
    public boolean z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel$1", f = "RewardsPointsViewModel.kt", l = {120}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsPointsViewModel.this.new AnonymousClass1(continuation);
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
            RewardsPointsViewModel rewardsPointsViewModel = RewardsPointsViewModel.this;
            RewardsOfferActivationInteractor rewardsOfferActivationInteractor = rewardsPointsViewModel.o;
            b bVar = new b(rewardsPointsViewModel, 0);
            this.p = 1;
            rewardsOfferActivationInteractor.d(bVar, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/points/RewardsPointsViewModel$Companion;", "", "", "OFFER_ACTIVATION_MESSAGE_DELAY", "J", "", "SPIN_SURPRISE_DEEPLINK", "Ljava/lang/String;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6375a;
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
            f6375a = iArr2;
            int[] iArr3 = new int[OfferActivationAnimationData.values().length];
            try {
                iArr3[OfferActivationAnimationData.CONFETTI.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPointsViewModel(RewardsAccountInteractor rewardsAccountInteractor, RewardsOfferFeedInteractor rewardsOfferFeedInteractor, RewardsOfferActivationInteractor rewardsOfferActivationInteractor, AnalyticsManager analyticsManager, SwrveEventTrackerImpl swrveEventTrackerImpl, RewardsBannerInteractor rewardsBannerInteractor, HomepageCoachMarkInteractor homepageCoachMarkInteractor, DeepLinkInteractor deepLinkInteractor, HomeRefreshInteractor homeRefreshInteractor, FeatureToggleManager featureToggleManager, RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager, RewardsPageScrollManager rewardsPageScrollManager) {
        super(analyticsManager, rewardsBannerInteractor);
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(deepLinkInteractor, "deepLinkInteractor");
        Intrinsics.h(homeRefreshInteractor, "homeRefreshInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(rewardsPageScrollManager, "rewardsPageScrollManager");
        this.m = rewardsAccountInteractor;
        this.n = rewardsOfferFeedInteractor;
        this.o = rewardsOfferActivationInteractor;
        this.p = analyticsManager;
        this.q = swrveEventTrackerImpl;
        this.r = deepLinkInteractor;
        this.s = homeRefreshInteractor;
        this.t = featureToggleManager;
        this.u = rewardsOfferAnalyticsManager;
        this.v = rewardsPageScrollManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new RewardsPointsContract.ViewState(null, null, null, null, null, null, null, RewardsCardDataKt.a(rewardsAccountInteractor.getCardData()), 3070));
        this.w = mutableStateFlowA;
        this.x = new HashSet();
        this.A = mutableStateFlowA;
        this.D = new ViewItemMapper(rewardsOfferActivationInteractor);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        this.i = new b(this, 1);
    }

    public static final void r6(RewardsPointsViewModel rewardsPointsViewModel, OfferSwapEligibility offerSwapEligibility) {
        SwrveEventTrackerImpl swrveEventTrackerImpl = rewardsPointsViewModel.q;
        if (Intrinsics.c(offerSwapEligibility, OfferSwapEligibility.Available.Swappable.f6364a)) {
            swrveEventTrackerImpl.c(RewardsOffersSwrveEvent.h, MapsKt.i(new Pair("swappable", "true")));
            return;
        }
        if (Intrinsics.c(offerSwapEligibility, OfferSwapEligibility.Available.Unswappable.f6365a)) {
            swrveEventTrackerImpl.c(RewardsOffersSwrveEvent.h, MapsKt.i(new Pair("swappable", "false")));
        } else if (Intrinsics.c(offerSwapEligibility, OfferSwapEligibility.Unavailable.f6366a)) {
            swrveEventTrackerImpl.b(RewardsOffersSwrveEvent.i);
        } else if (offerSwapEligibility != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // au.com.woolworths.rewards.base.RewardsPageScrollHandler
    /* renamed from: n3, reason: from getter */
    public final RewardsPageScrollManager getV() {
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s6(java.lang.String r12) {
        /*
            r11 = this;
            kotlinx.coroutines.flow.MutableStateFlow r0 = r11.w
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract$ViewState r2 = (au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract.ViewState) r2
            java.util.Set r1 = r2.h
            r10 = 0
            if (r1 == 0) goto L18
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = kotlin.collections.CollectionsKt.E(r1)
            au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData r1 = (au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData) r1
            r5 = r1
            goto L19
        L18:
            r5 = r10
        L19:
            r8 = 0
            r9 = 3839(0xeff, float:5.38E-42)
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract$ViewState r1 = au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract.ViewState.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.setValue(r1)
            kotlinx.coroutines.flow.StateFlow r0 = r11.A
            java.lang.Object r0 = r0.getValue()
            au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract$ViewState r0 = (au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract.ViewState) r0
            java.util.List r0 = r0.e
            if (r0 == 0) goto Lc2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof au.com.woolworths.feature.rewards.offers.OfferSectionViewItem
            if (r3 == 0) goto L3e
            r1.add(r2)
            goto L3e
        L50:
            java.util.Iterator r0 = r1.iterator()
        L54:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            r2 = r1
            au.com.woolworths.feature.rewards.offers.OfferSectionViewItem r2 = (au.com.woolworths.feature.rewards.offers.OfferSectionViewItem) r2
            java.lang.String r2 = r2.getB()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r2, r12)
            if (r2 == 0) goto L54
            r10 = r1
        L6c:
            au.com.woolworths.feature.rewards.offers.OfferSectionViewItem r10 = (au.com.woolworths.feature.rewards.offers.OfferSectionViewItem) r10
            if (r10 == 0) goto Lc2
            au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor r0 = r11.o
            au.com.woolworths.feature.rewards.offers.data.OffersSections r1 = au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt.a(r10)
            r0.b(r1)
            au.com.woolworths.android.onesite.data.ContentCta r0 = r10.getH()
            if (r0 == 0) goto L85
            java.lang.String r0 = r0.getLabel()
            if (r0 != 0) goto L87
        L85:
            java.lang.String r0 = ""
        L87:
            au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData$Companion r1 = au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData.e
            r1.getClass()
            au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData$Companion$rewardsProductOffersCtaButtonClick$1 r1 = new au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData$Companion$rewardsProductOffersCtaButtonClick$1
            r1.<init>(r0)
            java.util.List r0 = au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt.c(r10)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.s(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        La6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lb8
            java.lang.Object r3 = r0.next()
            au.com.woolworths.foundation.rewards.offers.model.OfferViewItem r3 = (au.com.woolworths.foundation.rewards.offers.model.OfferViewItem) r3
            au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData r3 = r3.b
            r2.add(r3)
            goto La6
        Lb8:
            au.com.woolworths.analytics.model.TrackingMetadata r0 = au.com.woolworths.foundation.rewards.offers.model.analytics.BasicRewardsOfferStatusDataExtKt.f(r2)
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r2 = r11.p
            r2.j(r1, r0)
            goto Le2
        Lc2:
            au.com.woolworths.foundation.bark.Bark$Companion r0 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r1 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.d
            au.com.woolworths.foundation.bark.common.ReportOwner r2 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r2.<init>(r1)
            java.lang.String r1 = "Unable to boost from deep link: sectionId "
            java.lang.String r1 = YU.a.A(r1, r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "sectionId -> "
            r3.<init>(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r0.f(r2, r1, r3)
        Le2:
            r0 = 1
            r11.t6(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel.s6(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [au.com.woolworths.feature.rewards.offers.OfferSectionViewItem] */
    /* JADX WARN: Type inference failed for: r2v6, types: [au.com.woolworths.feature.rewards.offers.SectionViewItem] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [au.com.woolworths.feature.rewards.offers.OfferSectionViewItem] */
    public final void t6(String str, boolean z) {
        MutableStateFlow mutableStateFlow = this.w;
        List list = ((RewardsPointsContract.ViewState) mutableStateFlow.getValue()).e;
        if (list == null) {
            return;
        }
        List<??> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (?? G : list2) {
            if (G instanceof OfferSectionViewItem) {
                G = (OfferSectionViewItem) G;
                if (Intrinsics.c(G.getB(), str)) {
                    G = SectionViewItemExtKt.g(SectionViewItemExtKt.e(G, z), new h(z, 1));
                }
            }
            arrayList.add(G);
        }
        mutableStateFlow.setValue(RewardsPointsContract.ViewState.a((RewardsPointsContract.ViewState) mutableStateFlow.getValue(), false, arrayList, null, false, null, null, 4079));
    }

    public final void u6(String str) {
        if (str == null) {
            return;
        }
        Uri.parse(str);
        this.r.getClass();
        this.g.f(new RewardsOfferBaseContract.Actions.OpenUrl(str));
    }

    public final void v6() {
        MutableStateFlow mutableStateFlow = this.w;
        mutableStateFlow.setValue(RewardsPointsContract.ViewState.a((RewardsPointsContract.ViewState) mutableStateFlow.getValue(), false, null, null, false, null, null, 4087));
    }

    public final void w6(int i) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsPointsViewModel$onSelectedFilterChanged$1(this, i, null), 3);
    }

    public final RewardsPointsContract.ViewState x6(RewardsOfferFeed rewardsOfferFeed) {
        Object next;
        Set setL0 = CollectionsKt.L0(rewardsOfferFeed.d);
        RewardsOfferFilterData rewardsOfferFilterData = ((RewardsPointsContract.ViewState) this.A.getValue()).i;
        Set set = setL0;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((RewardsOfferFilterData) next).f6288a.equals(rewardsOfferFilterData != null ? rewardsOfferFilterData.f6288a : null)) {
                break;
            }
        }
        RewardsOfferFilterData rewardsOfferFilterData2 = (RewardsOfferFilterData) next;
        if (rewardsOfferFilterData2 == null) {
            Iterator it2 = set.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rewardsOfferFilterData2 = (RewardsOfferFilterData) CollectionsKt.E(set);
                    break;
                }
                RewardsOfferFilterData rewardsOfferFilterData3 = (RewardsOfferFilterData) it2.next();
                if (!rewardsOfferFilterData3.c.isEmpty()) {
                    rewardsOfferFilterData2 = rewardsOfferFilterData3;
                    break;
                }
            }
        }
        RewardsPointsContract.ViewState viewState = new RewardsPointsContract.ViewState(null, rewardsOfferFeed.b, ViewItemMapper.b(this.D, rewardsOfferFeed.e), rewardsOfferFeed.c, rewardsOfferFeed.f6286a, setL0, rewardsOfferFilterData2, RewardsCardDataKt.a(this.m.getCardData()), 2567);
        List list = viewState.e;
        List listD = list != null ? SectionViewItemExtKt.d(SectionViewItemExtKt.b(list)) : null;
        if (listD != null && !listD.isEmpty()) {
            return viewState;
        }
        this.p.c(RewardsPointsActionData.n);
        return viewState;
    }

    public final void y6() {
        HomeRefreshInteractor.ContentRefreshNotifier contentRefreshNotifier;
        this.B = true;
        RewardsCardData cardData = this.m.getCardData();
        String number = cardData != null ? cardData.getNumber() : null;
        if (number == null || StringsKt.D(number)) {
            this.g.f(RewardsPointsContract.Actions.CloseScreen.f6367a);
            return;
        }
        this.y = false;
        this.z = false;
        MutableStateFlow mutableStateFlow = this.w;
        mutableStateFlow.setValue(RewardsPointsContract.ViewState.a((RewardsPointsContract.ViewState) mutableStateFlow.getValue(), true, null, null, false, null, null, 4090));
        if (((RewardsPointsContract.ViewState) mutableStateFlow.getValue()).e != null) {
            HomeRefreshInteractor homeRefreshInteractor = this.s;
            MutableStateFlow mutableStateFlow2 = homeRefreshInteractor.b;
            mutableStateFlow2.setValue(Integer.valueOf(((Number) mutableStateFlow2.getValue()).intValue() + 1));
            contentRefreshNotifier = homeRefreshInteractor.new ContentRefreshNotifier();
        } else {
            contentRefreshNotifier = null;
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsPointsViewModel$refreshFeed$2(this, contentRefreshNotifier, null), 3);
    }
}
