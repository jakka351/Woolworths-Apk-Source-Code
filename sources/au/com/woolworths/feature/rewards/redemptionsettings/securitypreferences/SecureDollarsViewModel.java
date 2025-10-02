package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.SecureDollarsConfig;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.SecureDollarsText;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsViewModel;", "Landroidx/lifecycle/ViewModel;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SecureDollarsViewModel extends ViewModel {
    public final SecureDollarsInteractor e;
    public final AnalyticsManager f;
    public final MutableStateFlow g;
    public final StateFlow h;

    public SecureDollarsViewModel(SecureDollarsInteractor secureDollarsInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = secureDollarsInteractor;
        this.f = analyticsManager;
        SecureDollarsViewModel$_viewState$1 secureDollarsViewModel$_viewState$1 = new SecureDollarsViewModel$_viewState$1(1, this, SecureDollarsViewModel.class, "executeAction", "executeAction(Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$Action;)V", 0);
        SecureDollarsViewModel$_viewState$2 secureDollarsViewModel$_viewState$2 = new SecureDollarsViewModel$_viewState$2(1, this, SecureDollarsViewModel.class, "completeAction", "completeAction(Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewAction;)V", 0);
        Intrinsics.h(SecureDollarsConfig.INSTANCE, "<this>");
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new SecureDollarsContract.ViewState(new SecureDollarsConfig(new SecureDollarsText("Locking your rewards", "There was an issue locking your Rewards dollars", "Your Rewards dollars have been locked. Tap again to access your rewards."), new SecureDollarsText("Unlocking your rewards", "There was an issue unlocking your Rewards dollars", "Your Rewards dollars have been unlocked.\nYou can lock your savings again manually, or they will auto-relock in six hours.")), "", "", SecureDollarsContract.Content.Loading.f6443a, null, secureDollarsViewModel$_viewState$2, secureDollarsViewModel$_viewState$1));
        this.g = mutableStateFlowA;
        this.h = FlowKt.b(mutableStateFlowA);
    }

    public static final void p6(SecureDollarsViewModel secureDollarsViewModel, SecureDollarsContract.Content content) {
        MutableStateFlow mutableStateFlow = secureDollarsViewModel.g;
        mutableStateFlow.setValue(SecureDollarsContract.ViewState.a((SecureDollarsContract.ViewState) mutableStateFlow.getValue(), null, null, content, null, 119));
    }

    public final void q6(SecureDollarsContract.ViewAction action) {
        Intrinsics.h(action, "action");
        MutableStateFlow mutableStateFlow = this.g;
        mutableStateFlow.setValue(SecureDollarsContract.ViewState.a((SecureDollarsContract.ViewState) mutableStateFlow.getValue(), null, null, null, null, 111));
    }
}
