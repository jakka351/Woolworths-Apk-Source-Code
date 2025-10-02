package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesViewModel;", "Landroidx/lifecycle/ViewModel;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SecurityPreferencesViewModel extends ViewModel {
    public final SecurityPreferencesInteractor e;
    public final AnalyticsManager f;
    public final MutableStateFlow g;
    public final StateFlow h;

    public SecurityPreferencesViewModel(SecurityPreferencesInteractor securityPreferencesInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = securityPreferencesInteractor;
        this.f = analyticsManager;
        SecurityPreferencesViewModel$_viewState$1 securityPreferencesViewModel$_viewState$1 = new SecurityPreferencesViewModel$_viewState$1(1, this, SecurityPreferencesViewModel.class, "executeAction", "executeAction(Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$Action;)V", 0);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new SecurityPreferencesContract.ViewState(SecurityPreferencesContract.Content.Loading.f6452a, null, new SecurityPreferencesViewModel$_viewState$2(1, this, SecurityPreferencesViewModel.class, "completeAction", "completeAction(Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecurityPreferencesContract$ViewAction;)V", 0), securityPreferencesViewModel$_viewState$1));
        this.g = mutableStateFlowA;
        this.h = FlowKt.b(mutableStateFlowA);
        BuildersKt.c(ViewModelKt.a(this), null, null, new SecurityPreferencesViewModel$fetchSecurePreference$1(this, null), 3);
    }

    public static final void p6(SecurityPreferencesViewModel securityPreferencesViewModel, SecurityPreferencesContract.Content content) {
        MutableStateFlow mutableStateFlow = securityPreferencesViewModel.g;
        mutableStateFlow.setValue(SecurityPreferencesContract.ViewState.a((SecurityPreferencesContract.ViewState) mutableStateFlow.getValue(), content, null, 14));
    }
}
