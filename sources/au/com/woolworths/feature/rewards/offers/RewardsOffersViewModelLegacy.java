package au.com.woolworths.feature.rewards.offers;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.feature.rewards.offers.OfferActivationScreen;
import au.com.woolworths.feature.rewards.offers.RewardsOffersContractLegacy;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import au.com.woolworths.feature.rewards.offers.banner.RewardsBannerInteractor;
import au.com.woolworths.feature.rewards.offers.data.OffersFilterAnalytics;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.data.RewardsOffersMessage;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsFilterActionData;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsOffersListActionData$Companion$rewardsProductOffersCtaButtonClick$1;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationAnimationData;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.analytics.BasicRewardsOfferStatusDataExtKt;
import au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import au.com.woolworths.rewards.base.DeepLinkInteractor;
import au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import timber.log.Timber;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersViewModelLegacy;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/foundation/rewards/offers/ui/RewardsOfferActionListener;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsOffersViewModelLegacy extends ViewModel implements RewardsOfferActionListener, RewardsOffersClickListener, FullPageErrorStateClickHandler {
    public final RewardsAccountInteractor e;
    public final RewardsOfferFeedInteractor f;
    public final RewardsOfferActivationInteractor g;
    public final AnalyticsManager h;
    public final RewardsOfferAnalyticsManager i;
    public final SwrveEventTrackerImpl j;
    public final DeepLinkInteractor k;
    public final SharedFlowImpl l;
    public final MutableLiveData m;
    public final HashSet n;
    public final HashSet o;
    public String p;
    public boolean q;
    public boolean r;
    public final SharedFlow s;
    public final MutableLiveData t;
    public boolean u;
    public String v;
    public final ViewItemMapper w;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy$1", f = "RewardsOffersViewModelLegacy.kt", l = {109}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsOffersViewModelLegacy.this.new AnonymousClass1(continuation);
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
            RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = RewardsOffersViewModelLegacy.this;
            RewardsOfferActivationInteractor rewardsOfferActivationInteractor = rewardsOffersViewModelLegacy.g;
            i iVar = new i(rewardsOffersViewModelLegacy, 0);
            this.p = 1;
            rewardsOfferActivationInteractor.d(iVar, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersViewModelLegacy$Companion;", "", "", "OFFER_ACTIVATION_MESSAGE_DELAY", "J", "", "SPIN_SURPRISE_DEEPLINK", "Ljava/lang/String;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6254a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[RewardsOfferListFullPageErrorState.values().length];
            try {
                RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = RewardsOfferListFullPageErrorState.d;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState2 = RewardsOfferListFullPageErrorState.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState3 = RewardsOfferListFullPageErrorState.d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState4 = RewardsOfferListFullPageErrorState.d;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6254a = iArr;
            int[] iArr2 = new int[Region.values().length];
            try {
                Region.Companion companion = Region.h;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[OfferActivationAnimationData.values().length];
            try {
                iArr3[OfferActivationAnimationData.CONFETTI.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            c = iArr3;
        }
    }

    public RewardsOffersViewModelLegacy(RewardsAccountInteractor rewardsAccountInteractor, RewardsOfferFeedInteractor rewardsOfferFeedInteractor, RewardsOfferActivationInteractor rewardsOfferActivationInteractor, AnalyticsManager analyticsManager, RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager, SwrveEventTrackerImpl swrveEventTrackerImpl, RewardsBannerInteractor rewardsBannerInteractor, HomepageCoachMarkInteractor homepageCoachMarkInteractor, DeepLinkInteractor deepLinkInteractor) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(deepLinkInteractor, "deepLinkInteractor");
        this.e = rewardsAccountInteractor;
        this.f = rewardsOfferFeedInteractor;
        this.g = rewardsOfferActivationInteractor;
        this.h = analyticsManager;
        this.i = rewardsOfferAnalyticsManager;
        this.j = swrveEventTrackerImpl;
        this.k = deepLinkInteractor;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.m = mutableLiveData;
        this.n = new HashSet();
        this.o = new HashSet();
        this.s = FlowKt.a(sharedFlowImplB);
        this.t = mutableLiveData;
        this.w = new ViewItemMapper(rewardsOfferActivationInteractor);
        mutableLiveData.m(new RewardsOffersContractLegacy.ViewState((RewardsOfferListFullPageErrorState) null, (ArrayList) null, (RewardsOffersMessage) null, (Set) null, (RewardsOfferFilterData) null, 62));
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    public static ArrayList u6(String str, boolean z, List list) {
        List<OfferViewItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (OfferViewItem offerViewItemA : list2) {
            if (Intrinsics.c(offerViewItemA.b.d, str)) {
                offerViewItemA = OfferViewItem.a(offerViewItemA, z);
            }
            arrayList.add(offerViewItemA);
        }
        return arrayList;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener
    public final void L4(RewardsOfferData rewardsOfferData) {
        this.i.o(rewardsOfferData, RewardsOfferScreen.f, RewardsOffersListActionData.i);
        this.l.f(new RewardsOffersContractLegacy.Actions.ShowOfferDetailsScreen(rewardsOfferData.d));
    }

    @Override // au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener
    public final void Z(RewardsOfferData rewardsOfferData) {
        List list;
        String str = rewardsOfferData.d;
        MutableLiveData mutableLiveData = this.m;
        RewardsOffersContractLegacy.ViewState viewState = (RewardsOffersContractLegacy.ViewState) mutableLiveData.e();
        if (viewState != null && (list = viewState.c) != null) {
            List<Object> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (Object objG : list2) {
                if (objG instanceof OfferSectionViewItem) {
                    objG = SectionViewItemExtKt.g((OfferSectionViewItem) objG, new i(this, str, 3));
                }
                arrayList.add(objG);
            }
            RewardsOffersContractLegacy.ViewState viewState2 = (RewardsOffersContractLegacy.ViewState) mutableLiveData.e();
            mutableLiveData.m(viewState2 != null ? RewardsOffersContractLegacy.ViewState.a(viewState2, false, arrayList, null, 59) : null);
        }
        this.g.a(rewardsOfferData, OfferActivationScreen.Offers.f6228a);
        this.h.j(RewardsOffersListActionData.o, BasicRewardsOfferStatusDataExtKt.e(rewardsOfferData));
    }

    @Override // au.com.woolworths.feature.rewards.offers.RewardsOffersClickListener
    public final void o5(RewardsOfferFilterData selectedFilter) {
        Intrinsics.h(selectedFilter, "selectedFilter");
        OffersFilterAnalytics offersFilterAnalytics = selectedFilter.e;
        if (offersFilterAnalytics != null) {
            this.h.c(new RewardsFilterActionData(offersFilterAnalytics.f6277a));
        }
        RewardsOffersContractLegacy.ViewState viewState = (RewardsOffersContractLegacy.ViewState) this.t.e();
        this.m.m(viewState != null ? RewardsOffersContractLegacy.ViewState.a(viewState, false, null, selectedFilter, 31) : null);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        RewardsOffersContractLegacy.ViewState viewState = (RewardsOffersContractLegacy.ViewState) this.t.e();
        RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = viewState != null ? viewState.b : null;
        int i = rewardsOfferListFullPageErrorState == null ? -1 : WhenMappings.f6254a[rewardsOfferListFullPageErrorState.ordinal()];
        if (i != -1) {
            AnalyticsManager analyticsManager = this.h;
            if (i == 1 || i == 2) {
                analyticsManager.c(RewardsOffersListActionData.t);
                t6();
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                analyticsManager.c(RewardsOffersListActionData.u);
                t6();
            }
        }
    }

    @Override // au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener
    public final void p2(RewardsOfferData offer, ContentCta cta) {
        Intrinsics.h(offer, "offer");
        Intrinsics.h(cta, "cta");
        String url = cta.getUrl();
        if (url != null) {
            this.l.f(new RewardsOffersContractLegacy.Actions.OpenUrl(url));
            RewardsOfferScreen rewardsOfferScreen = RewardsOfferScreen.e;
            RewardsPointsActionData.Companion companion = RewardsPointsActionData.e;
            String label = cta.getLabel();
            companion.getClass();
            Intrinsics.h(label, "label");
            this.i.p(offer, rewardsOfferScreen, url, new RewardsPointsActionData$Companion$rewardsCategoryOfferCtaButtonClick$1(label));
        }
    }

    public final void p6(String str) {
        RewardsOffersContractLegacy.ViewState viewStateA;
        List list;
        MutableLiveData mutableLiveData = this.t;
        RewardsOffersContractLegacy.ViewState viewState = (RewardsOffersContractLegacy.ViewState) mutableLiveData.e();
        Object obj = null;
        if (viewState != null) {
            Set set = viewState.e;
            viewStateA = RewardsOffersContractLegacy.ViewState.a(viewState, false, null, set != null ? (RewardsOfferFilterData) CollectionsKt.E(set) : null, 31);
        } else {
            viewStateA = null;
        }
        this.m.m(viewStateA);
        RewardsOffersContractLegacy.ViewState viewState2 = (RewardsOffersContractLegacy.ViewState) mutableLiveData.e();
        if (viewState2 != null && (list = viewState2.c) != null) {
            Iterator it = CollectionsKt.A(list, OfferSectionViewItem.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.c(((OfferSectionViewItem) next).getB(), str)) {
                    obj = next;
                    break;
                }
            }
            OfferSectionViewItem offerSectionViewItem = (OfferSectionViewItem) obj;
            if (offerSectionViewItem != null) {
                u2(offerSectionViewItem);
                return;
            }
        }
        Timber.f27013a.b(YU.a.A("Unable to boost from deep link: sectionId ", str), new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [au.com.woolworths.feature.rewards.offers.SectionViewItem] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [au.com.woolworths.feature.rewards.offers.OfferSectionViewItem] */
    /* JADX WARN: Type inference failed for: r3v9, types: [au.com.woolworths.feature.rewards.offers.OfferSectionViewItem] */
    public final void q6(String str, boolean z) {
        List list;
        MutableLiveData mutableLiveData = this.m;
        RewardsOffersContractLegacy.ViewState viewState = (RewardsOffersContractLegacy.ViewState) mutableLiveData.e();
        if (viewState == null || (list = viewState.c) == null) {
            return;
        }
        List<??> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (?? G : list2) {
            if (G instanceof OfferSectionViewItem) {
                G = (OfferSectionViewItem) G;
                if (Intrinsics.c(G.getB(), str)) {
                    G = SectionViewItemExtKt.g(SectionViewItemExtKt.e(G, z), new h(z, 0));
                }
            }
            arrayList.add(G);
        }
        RewardsOffersContractLegacy.ViewState viewState2 = (RewardsOffersContractLegacy.ViewState) mutableLiveData.e();
        mutableLiveData.m(viewState2 != null ? RewardsOffersContractLegacy.ViewState.a(viewState2, false, arrayList, null, 59) : null);
    }

    public final void r6(String str) {
        if (str == null) {
            return;
        }
        Uri.parse(str);
        this.k.getClass();
        this.l.f(new RewardsOffersContractLegacy.Actions.OpenUrl(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final au.com.woolworths.feature.rewards.offers.RewardsOffersContractLegacy.ViewState s6(au.com.woolworths.feature.rewards.offers.data.RewardsOfferFeed r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy.s6(au.com.woolworths.feature.rewards.offers.data.RewardsOfferFeed):au.com.woolworths.feature.rewards.offers.RewardsOffersContractLegacy$ViewState");
    }

    public final void t6() {
        this.u = false;
        RewardsCardData cardData = this.e.getCardData();
        String number = cardData != null ? cardData.getNumber() : null;
        if (number == null || StringsKt.D(number)) {
            this.l.f(RewardsOffersContractLegacy.Actions.CloseScreen.f6243a);
            return;
        }
        this.q = false;
        this.r = false;
        MutableLiveData mutableLiveData = this.m;
        RewardsOffersContractLegacy.ViewState viewState = (RewardsOffersContractLegacy.ViewState) mutableLiveData.e();
        mutableLiveData.m(viewState != null ? RewardsOffersContractLegacy.ViewState.a(viewState, true, null, null, 60) : new RewardsOffersContractLegacy.ViewState((RewardsOfferListFullPageErrorState) null, (ArrayList) null, (RewardsOffersMessage) null, (Set) null, (RewardsOfferFilterData) null, 62));
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsOffersViewModelLegacy$refreshDetails$1(this, null), 3);
    }

    @Override // au.com.woolworths.feature.rewards.offers.RewardsOffersClickListener
    public final void u2(OfferSectionViewItem section) {
        Intrinsics.h(section, "section");
        q6(section.getB(), true);
        ContentCta h = section.getH();
        if (h != null) {
            RewardsOffersListActionData.Companion companion = RewardsOffersListActionData.e;
            String label = h.getLabel();
            companion.getClass();
            Intrinsics.h(label, "label");
            RewardsOffersListActionData$Companion$rewardsProductOffersCtaButtonClick$1 rewardsOffersListActionData$Companion$rewardsProductOffersCtaButtonClick$1 = new RewardsOffersListActionData$Companion$rewardsProductOffersCtaButtonClick$1(label);
            List listC = SectionViewItemExtKt.c(section);
            ArrayList arrayList = new ArrayList(CollectionsKt.s(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(((OfferViewItem) it.next()).b);
            }
            this.h.j(rewardsOffersListActionData$Companion$rewardsProductOffersCtaButtonClick$1, BasicRewardsOfferStatusDataExtKt.f(arrayList));
        }
        this.g.b(SectionViewItemExtKt.a(section));
    }

    public final void v6(String str) {
        Object next;
        MutableLiveData mutableLiveData = this.m;
        Object objE = mutableLiveData.e();
        Intrinsics.e(objE);
        if (((RewardsOffersContractLegacy.ViewState) objE).f6252a) {
            this.p = str;
            return;
        }
        Object objE2 = mutableLiveData.e();
        Intrinsics.e(objE2);
        Set set = ((RewardsOffersContractLegacy.ViewState) objE2).e;
        if (set != null) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((RewardsOfferFilterData) next).f6288a.equalsIgnoreCase(str)) {
                        break;
                    }
                }
            }
            RewardsOfferFilterData rewardsOfferFilterData = (RewardsOfferFilterData) next;
            if (rewardsOfferFilterData != null) {
                o5(rewardsOfferFilterData);
            }
        }
    }

    public final void w6(RewardsOfferData rewardsOfferData) {
        String str = rewardsOfferData.d;
        HashSet hashSet = this.n;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        RewardsOfferScreen rewardsOfferScreen = RewardsOfferScreen.f;
        this.i.q(rewardsOfferData, rewardsOfferScreen, RewardsOffersListActionData.h);
        this.j.c(RewardsOffersSwrveEvent.g, BasicRewardsOfferStatusDataExtKt.d(rewardsOfferData, rewardsOfferScreen.getD()));
    }
}
