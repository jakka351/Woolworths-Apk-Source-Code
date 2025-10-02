package au.com.woolworths.feature.rewards.card.unlock;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.LiveDataExtKt;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsContract;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsClickListener;", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnlockChristmasFundsViewModel extends ViewModel implements UnlockChristmasFundsClickListener {
    public final UnlockChristmasFundsInteractor e;
    public final AnalyticsManager f;
    public final MutableLiveData g;
    public final SharedFlowImpl h;
    public final MutableLiveData i;
    public final Flow j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsViewModel$Companion;", "", "", "MINIMUM_UNLOCK_DURATION", "J", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public UnlockChristmasFundsViewModel(UnlockChristmasFundsInteractor interactor, AnalyticsManager analyticsManager) {
        Intrinsics.h(interactor, "interactor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = interactor;
        this.f = analyticsManager;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.g = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.h = sharedFlowImplB;
        this.i = mutableLiveData;
        this.j = FlowKt.a(sharedFlowImplB);
    }

    public static void q6(UnlockChristmasFundsViewModel unlockChristmasFundsViewModel, MutableLiveData mutableLiveData, UnlockChristmasFundsContract.UnlockState unlockState, RewardsRedemptionUnlockConfirmation data, int i) {
        UnlockChristmasFundsContract.UnlockType unlockType = ((UnlockChristmasFundsContract.ViewState) LiveDataExtKt.a(mutableLiveData)).b;
        if ((i & 4) != 0) {
            data = ((UnlockChristmasFundsContract.ViewState) LiveDataExtKt.a(mutableLiveData)).c;
        }
        Intrinsics.h(mutableLiveData, "<this>");
        Intrinsics.h(data, "data");
        mutableLiveData.m(new UnlockChristmasFundsContract.ViewState(unlockState, unlockType, data));
    }

    public final void p6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new UnlockChristmasFundsViewModel$unlockFunds$1(this, null), 3);
    }
}
