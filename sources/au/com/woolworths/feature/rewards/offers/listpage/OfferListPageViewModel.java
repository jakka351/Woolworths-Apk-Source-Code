package au.com.woolworths.feature.rewards.offers.listpage;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleMonitor;
import au.com.woolworths.feature.rewards.offers.ProductSectionViewItem;
import au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseViewModel;
import au.com.woolworths.feature.rewards.offers.StandardSectionViewItem;
import au.com.woolworths.feature.rewards.offers.ViewItemMapper;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferAnalyticsManager;
import au.com.woolworths.feature.rewards.offers.banner.RewardsBannerInteractor;
import au.com.woolworths.feature.rewards.offers.listpage.OffersListPageContract;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewFeature;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OfferListPageViewModel;", "Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseViewModel;", "Factory", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferListPageViewModel extends RewardsOfferBaseViewModel {
    public final String m;
    public final String n;
    public final OfferListPageInteractor o;
    public final RewardsOfferActivationInteractor p;
    public final AnalyticsManager q;
    public final RewardsOfferAnalyticsManager r;
    public final FeatureToggleManager s;
    public final SwrveEventTrackerImpl t;
    public final OfferListPageViewModelKt$createAnalyticsScreen$1 u;
    public final HashSet v;
    public final MutableStateFlow w;
    public final StateFlow x;
    public final ViewItemMapper y;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel$1", f = "OfferListPageViewModel.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OfferListPageViewModel.this.new AnonymousClass1(continuation);
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
            OfferListPageViewModel offerListPageViewModel = OfferListPageViewModel.this;
            RewardsOfferActivationInteractor rewardsOfferActivationInteractor = offerListPageViewModel.p;
            c cVar = new c(offerListPageViewModel, 1);
            this.p = 1;
            rewardsOfferActivationInteractor.d(cVar, this);
            return coroutineSingletons;
        }
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OfferListPageViewModel$Factory;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        OfferListPageViewModel a(String str, String str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferListPageViewModel(String pageName, String pageTitle, OfferListPageInteractor offerListPageInteractor, RewardsBannerInteractor rewardsBannerInteractor, RewardsOfferActivationInteractor rewardsOfferActivationInteractor, AnalyticsManager analyticsManager, RewardsOfferAnalyticsManager rewardsOfferAnalyticsManager, FeatureToggleManager featureToggleManager, SwrveEventTrackerImpl swrveEventTrackerImpl) {
        Object next;
        super(analyticsManager, rewardsBannerInteractor);
        Intrinsics.h(pageName, "pageName");
        Intrinsics.h(pageTitle, "pageTitle");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.m = pageName;
        this.n = pageTitle;
        this.o = offerListPageInteractor;
        this.p = rewardsOfferActivationInteractor;
        this.q = analyticsManager;
        this.r = rewardsOfferAnalyticsManager;
        this.s = featureToggleManager;
        this.t = swrveEventTrackerImpl;
        Iterator it = ((AbstractList) OfferListPageType.g).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((OfferListPageType) next).d.equals(this.m)) {
                    break;
                }
            }
        }
        OfferListPageType offerListPageType = (OfferListPageType) next;
        OfferListPageType offerListPageType2 = offerListPageType == null ? OfferListPageType.e : offerListPageType;
        OfferListPageViewModelKt$createAnalyticsScreen$1 offerListPageViewModelKt$createAnalyticsScreen$1 = new OfferListPageViewModelKt$createAnalyticsScreen$1(offerListPageType2, this.m);
        this.u = offerListPageViewModelKt$createAnalyticsScreen$1;
        this.v = new HashSet();
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new OffersListPageContract.ViewState(this.m, offerListPageType2, null, null, this.n, null, null, false, null, null, EmptyList.d, false));
        this.w = mutableStateFlowA;
        this.x = FlowKt.b(mutableStateFlowA);
        this.y = new ViewItemMapper(this.p);
        s6();
        this.q.a(offerListPageViewModelKt$createAnalyticsScreen$1);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        this.i = new c(this, 0);
        FeatureToggleManager featureToggleManager2 = this.s;
        Intrinsics.h(featureToggleManager2, "featureToggleManager");
        new FeatureToggleMonitor(this, featureToggleManager2).a(TigerNewFeature.d, new FlowCollector() { // from class: au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel$3$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Object value;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MutableStateFlow mutableStateFlow = this.d.w;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, OffersListPageContract.ViewState.a((OffersListPageContract.ViewState) value, null, null, null, null, null, false, null, null, null, zBooleanValue, 2047)));
                return Unit.f24250a;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r6(au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel.r6(au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static ArrayList t6(List list, Function1 function1) {
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (Object objC : list2) {
            if (objC instanceof ProductSectionViewItem) {
                ProductSectionViewItem productSectionViewItem = (ProductSectionViewItem) objC;
                List list3 = productSectionViewItem.i;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(function1.invoke(it.next()));
                }
                objC = ProductSectionViewItem.c(productSectionViewItem, false, arrayList2, 191);
            } else if (objC instanceof StandardSectionViewItem) {
                StandardSectionViewItem standardSectionViewItem = (StandardSectionViewItem) objC;
                List list4 = standardSectionViewItem.f;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(function1.invoke(it2.next()));
                }
                objC = StandardSectionViewItem.c(standardSectionViewItem, false, arrayList3, 7);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public final void s6() {
        if (((OffersListPageContract.ViewState) this.x.getValue()).h) {
            return;
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new OfferListPageViewModel$fetchContent$1(this, null), 3);
    }
}
