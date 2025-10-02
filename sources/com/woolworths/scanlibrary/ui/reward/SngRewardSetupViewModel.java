package com.woolworths.scanlibrary.ui.reward;

import androidx.camera.lifecycle.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import com.woolworths.scanlibrary.analytics.tracking.ScanAndGoEntryActions;
import com.woolworths.scanlibrary.base.mvvm.BaseViewModel;
import com.woolworths.scanlibrary.domain.launch.FetchScanAndGoInteractor;
import com.woolworths.scanlibrary.domain.login.c;
import com.woolworths.scanlibrary.ui.entry.launcher.SngFullPageErrorStateHandler;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import com.woolworths.scanlibrary.ui.reward.SngRewardSetupContract;
import io.reactivex.Single;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleDoOnSubscribe;
import io.reactivex.rxkotlin.DisposableKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/reward/SngRewardSetupViewModel;", "Lcom/woolworths/scanlibrary/base/mvvm/BaseViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lcom/woolworths/scanlibrary/ui/entry/launcher/SngFullPageErrorStateHandler;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SngRewardSetupViewModel extends BaseViewModel implements FullPageErrorStateClickHandler, SngFullPageErrorStateHandler {
    public final RewardsAccountInteractor h;
    public final FetchScanAndGoInteractor i;
    public final SchedulersProvider j;
    public final NetworkExceptions k;
    public final FeatureToggleManager l;
    public final AnalyticsManager m;
    public final MutableLiveData n;
    public final SharedFlowImpl o;
    public final Flow p;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21319a;

        static {
            int[] iArr = new int[FetchSngErrorState.values().length];
            try {
                FetchSngErrorState fetchSngErrorState = FetchSngErrorState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FetchSngErrorState fetchSngErrorState2 = FetchSngErrorState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21319a = iArr;
        }
    }

    public SngRewardSetupViewModel(RewardsAccountInteractor rewardsAccountInteractor, FetchScanAndGoInteractor fetchScanAndGoInteractor, SchedulersProvider schedulersProvider, NetworkExceptions networkExceptions, FeatureToggleManager featureToggleManager, AnalyticsManager analyticsManager) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.h = rewardsAccountInteractor;
        this.i = fetchScanAndGoInteractor;
        this.j = schedulersProvider;
        this.k = networkExceptions;
        this.l = featureToggleManager;
        this.m = analyticsManager;
        this.n = new MutableLiveData();
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.o = sharedFlowImplB;
        this.p = FlowKt.a(sharedFlowImplB);
    }

    @Override // com.woolworths.scanlibrary.ui.entry.launcher.SngFullPageErrorStateHandler
    public final void cancel() {
        this.n.j(new SngRewardSetupContract.ViewState(false, null));
    }

    @Override // com.woolworths.scanlibrary.ui.entry.launcher.SngFullPageErrorStateHandler
    public final void g() {
        r6();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        FetchSngErrorState fetchSngErrorState;
        MutableLiveData mutableLiveData = this.n;
        SngRewardSetupContract.ViewState viewState = (SngRewardSetupContract.ViewState) mutableLiveData.e();
        FetchSngErrorState fetchSngErrorState2 = viewState != null ? viewState.b : null;
        int i = fetchSngErrorState2 == null ? -1 : WhenMappings.f21319a[fetchSngErrorState2.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("No error should mean no button, so can't click it.");
        }
        AnalyticsManager analyticsManager = this.m;
        if (i == 1) {
            analyticsManager.c(ScanAndGoEntryActions.h);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            analyticsManager.c(ScanAndGoEntryActions.f);
        }
        SngRewardSetupContract.ViewState viewState2 = (SngRewardSetupContract.ViewState) mutableLiveData.e();
        if (viewState2 == null || (fetchSngErrorState = viewState2.b) == null) {
            return;
        }
        fetchSngErrorState.a(this);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        FetchSngErrorState fetchSngErrorState;
        SngRewardSetupContract.ViewState viewState = (SngRewardSetupContract.ViewState) this.n.e();
        if (viewState == null || (fetchSngErrorState = viewState.b) == null) {
            return;
        }
        fetchSngErrorState.b(this);
    }

    public final void r6() {
        RewardsCardData cardData = this.h.getCardData();
        Single singleA = this.i.a(cardData != null ? cardData.getNumber() : null);
        SchedulersProvider schedulersProvider = this.j;
        SingleDoOnSubscribe singleDoOnSubscribe = new SingleDoOnSubscribe(singleA.h(schedulersProvider.d()).f(schedulersProvider.b()), new c(new a(this, 0), 28));
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new c(new a(this, 1), 29), new b(10, new SngRewardSetupViewModel$fetchScanAndGoData$3(1, this, SngRewardSetupViewModel.class, "handleFailedScanAndGoTokenExchange", "handleFailedScanAndGoTokenExchange(Ljava/lang/Throwable;)V", 0)));
        singleDoOnSubscribe.a(consumerSingleObserver);
        DisposableKt.a(this.e, consumerSingleObserver);
    }
}
