package au.com.woolworths.shop.rewards;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardTypeData;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersContractLegacy;
import au.com.woolworths.feature.shop.foryou.analytics.RewardsBoostersPointsActionData;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import au.com.woolworths.rewards.base.points.RewardsPointsBalanceInteractor;
import au.com.woolworths.rewards.tooltip.Tooltip;
import au.com.woolworths.shop.rewards.ShopRewardsContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/ShopRewardsViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopRewardsViewModel extends ViewModel {
    public final ShopAppRegionInteractor e;
    public final RewardsAccountInteractor f;
    public final RewardsPointsBalanceInteractor g;
    public final FirebasePerfMonitor h;
    public final AnalyticsManager i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final SharedFlowImpl l;
    public final SharedFlowImpl m;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.rewards.ShopRewardsViewModel$1", f = "ShopRewardsViewModel.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.rewards.ShopRewardsViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.rewards.ShopRewardsViewModel$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C02791 extends FunctionReferenceImpl implements Function1<RewardsPointsBalance, Unit> {
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                RewardsPointsBalance p0 = (RewardsPointsBalance) obj;
                Intrinsics.h(p0, "p0");
                ShopRewardsViewModel shopRewardsViewModel = (ShopRewardsViewModel) this.receiver;
                FirebasePerfMonitor firebasePerfMonitor = shopRewardsViewModel.h;
                firebasePerfMonitor.d("app_cold_start_interactive_state");
                firebasePerfMonitor.d("home_page_successful_load");
                MutableStateFlow mutableStateFlow = shopRewardsViewModel.j;
                if (((ShopRewardsContract.ViewState) mutableStateFlow.getValue()).f12892a == null) {
                    shopRewardsViewModel.i.j(RewardsBoostersPointsActionData.f, TrackingMetadata.Companion.a(TrackableValue.z2, Integer.valueOf(p0.f4393a)));
                }
                mutableStateFlow.setValue(ShopRewardsContract.ViewState.a((ShopRewardsContract.ViewState) mutableStateFlow.getValue(), p0, false, 30));
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShopRewardsViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ShopRewardsViewModel shopRewardsViewModel = ShopRewardsViewModel.this;
                RewardsPointsBalanceInteractor rewardsPointsBalanceInteractor = shopRewardsViewModel.g;
                C02791 c02791 = new C02791(1, shopRewardsViewModel, ShopRewardsViewModel.class, "onBalanceChanged", "onBalanceChanged(Lau/com/woolworths/android/onesite/modules/rewards/RewardsPointsBalance;)V", 0);
                this.p = 1;
                if (rewardsPointsBalanceInteractor.a(c02791, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.rewards.ShopRewardsViewModel$2", f = "ShopRewardsViewModel.kt", l = {65}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.rewards.ShopRewardsViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ShopRewardsViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final ShopRewardsViewModel shopRewardsViewModel = ShopRewardsViewModel.this;
                StateFlow stateFlowA = shopRewardsViewModel.e.getB();
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.rewards.ShopRewardsViewModel.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object value;
                        Region region = (Region) obj2;
                        MutableStateFlow mutableStateFlow = shopRewardsViewModel.j;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value, ShopRewardsContract.ViewState.a((ShopRewardsContract.ViewState) value, null, region == Region.j, 15)));
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (stateFlowA.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public ShopRewardsViewModel(ShopAppRegionInteractor shopAppRegionInteractor, RewardsAccountInteractor rewardsAccountInteractor, RewardsPointsBalanceInteractor rewardsPointsBalanceInteractor, FirebasePerfMonitor firebasePerfMonitor, AnalyticsManager analyticsManager, SwrveEventTrackerImpl swrveEventTrackerImpl) {
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = shopAppRegionInteractor;
        this.f = rewardsAccountInteractor;
        this.g = rewardsPointsBalanceInteractor;
        this.h = firebasePerfMonitor;
        this.i = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ShopRewardsContract.ViewState(false, 31));
        this.j = mutableStateFlowA;
        this.k = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = sharedFlowImplB;
        if (rewardsAccountInteractor.getUncachedVisitorId() == null) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new ShopRewardsViewModel$fetchVisitorId$1(this, null), 3);
        }
        RewardsBoostersContractLegacy.Page page = RewardsBoostersContractLegacy.Page.d;
        analyticsManager.a(page.a());
        swrveEventTrackerImpl.b(page.b());
        RewardsCardData cardData = rewardsAccountInteractor.getCardData();
        mutableStateFlowA.setValue(new ShopRewardsContract.ViewState((cardData != null ? cardData.getCardType() : null) == RewardsCardTypeData.STAFF_CARD, 29));
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass2(null), 3);
    }

    public final void p6() {
        String str;
        this.i.c(RewardsBoostersPointsActionData.e);
        RewardsPointsBalance rewardsPointsBalance = ((ShopRewardsContract.ViewState) this.k.getValue()).f12892a;
        if (rewardsPointsBalance == null || (str = rewardsPointsBalance.c) == null) {
            return;
        }
        this.l.f(new ShopRewardsContract.Actions.ShowTooltip(new Tooltip.BalanceIndicator(str)));
    }
}
