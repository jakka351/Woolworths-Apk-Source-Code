package au.com.woolworths.feature.shop.foryou;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardTypeData;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersContractLegacy;
import au.com.woolworths.feature.shop.foryou.analytics.RewardsBoostersPointsActionData;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import au.com.woolworths.rewards.base.points.RewardsPointsBalanceInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.subjects.PublishSubject;
import kotlin.Deprecated;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/RewardsBoostersViewModelLegacy;", "Landroidx/lifecycle/ViewModel;", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsBoostersViewModelLegacy extends ViewModel {
    public final RewardsPointsBalanceInteractor e;
    public final FirebasePerfMonitor f;
    public final AnalyticsManager g;
    public final SwrveEventTrackerImpl h;
    public final PublishSubject i;
    public final MutableLiveData j;
    public final PublishSubject k;
    public final MutableLiveData l;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.foryou.RewardsBoostersViewModelLegacy$1", f = "RewardsBoostersViewModelLegacy.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.foryou.RewardsBoostersViewModelLegacy$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.foryou.RewardsBoostersViewModelLegacy$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01651 extends FunctionReferenceImpl implements Function1<RewardsPointsBalance, Unit> {
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                RewardsPointsBalance p0 = (RewardsPointsBalance) obj;
                Intrinsics.h(p0, "p0");
                RewardsBoostersViewModelLegacy rewardsBoostersViewModelLegacy = (RewardsBoostersViewModelLegacy) this.receiver;
                FirebasePerfMonitor firebasePerfMonitor = rewardsBoostersViewModelLegacy.f;
                firebasePerfMonitor.d("app_cold_start_interactive_state");
                firebasePerfMonitor.d("home_page_successful_load");
                MutableLiveData mutableLiveData = rewardsBoostersViewModelLegacy.j;
                Object objE = mutableLiveData.e();
                Intrinsics.e(objE);
                if (((RewardsBoostersContractLegacy.ViewState) objE).f7134a == null) {
                    rewardsBoostersViewModelLegacy.g.j(RewardsBoostersPointsActionData.f, TrackingMetadata.Companion.a(TrackableValue.z2, Integer.valueOf(p0.f4393a)));
                }
                Object objE2 = mutableLiveData.e();
                Intrinsics.e(objE2);
                RewardsBoostersContractLegacy.ViewState viewState = (RewardsBoostersContractLegacy.ViewState) objE2;
                mutableLiveData.m(new RewardsBoostersContractLegacy.ViewState(p0, viewState.b, viewState.c));
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsBoostersViewModelLegacy.this.new AnonymousClass1(continuation);
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
                RewardsBoostersViewModelLegacy rewardsBoostersViewModelLegacy = RewardsBoostersViewModelLegacy.this;
                RewardsPointsBalanceInteractor rewardsPointsBalanceInteractor = rewardsBoostersViewModelLegacy.e;
                C01651 c01651 = new C01651(1, rewardsBoostersViewModelLegacy, RewardsBoostersViewModelLegacy.class, "onBalanceChanged", "onBalanceChanged(Lau/com/woolworths/android/onesite/modules/rewards/RewardsPointsBalance;)V", 0);
                this.p = 1;
                if (rewardsPointsBalanceInteractor.a(c01651, this) == coroutineSingletons) {
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

    public RewardsBoostersViewModelLegacy(RewardsPointsBalanceInteractor rewardsPointsBalanceInteractor, RewardsAccountInteractor rewardsAccountInteractor, FirebasePerfMonitor firebasePerfMonitor, AnalyticsManager analyticsManager, SwrveEventTrackerImpl swrveEventTrackerImpl) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = rewardsPointsBalanceInteractor;
        this.f = firebasePerfMonitor;
        this.g = analyticsManager;
        this.h = swrveEventTrackerImpl;
        PublishSubject publishSubject = new PublishSubject();
        this.i = publishSubject;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.j = mutableLiveData;
        this.k = publishSubject;
        this.l = mutableLiveData;
        RewardsCardData cardData = rewardsAccountInteractor.getCardData();
        mutableLiveData.m(new RewardsBoostersContractLegacy.ViewState(null, (cardData != null ? cardData.getCardType() : null) == RewardsCardTypeData.STAFF_CARD, null));
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }
}
