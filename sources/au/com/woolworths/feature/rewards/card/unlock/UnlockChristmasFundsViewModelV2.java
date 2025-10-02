package au.com.woolworths.feature.rewards.card.unlock;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.rewards.account.RedemptionStateInteractor;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsContractV2;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsViewModelV2;", "Landroidx/lifecycle/ViewModel;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class UnlockChristmasFundsViewModelV2 extends ViewModel {
    public final UnlockChristmasFundsInteractor e;
    public final RedemptionStateInteractor f;
    public final AnalyticsManager g;
    public final MutableStateFlow h;
    public final StateFlow i;

    public UnlockChristmasFundsViewModelV2(UnlockChristmasFundsInteractor interactor, RedemptionStateInteractor redemptionStateInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(interactor, "interactor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = interactor;
        this.f = redemptionStateInteractor;
        this.g = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new UnlockChristmasFundsContractV2.ViewState(null, false, false, false, false));
        this.h = mutableStateFlowA;
        this.i = FlowKt.b(mutableStateFlowA);
    }

    public final void p6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.h;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, UnlockChristmasFundsContractV2.ViewState.a((UnlockChristmasFundsContractV2.ViewState) value, null, false, false, false, false, 59)));
    }
}
