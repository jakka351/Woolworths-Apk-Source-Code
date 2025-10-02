package au.com.woolworths.feature.rewards.account.authentication;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationViewModelNew;", "Landroidx/lifecycle/ViewModel;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsAuthenticationViewModelNew extends ViewModel {
    public final RewardsAccountInteractor e;
    public final FeatureToggleManager f;
    public boolean g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final SharedFlowImpl j;
    public final Flow k;

    public RewardsAuthenticationViewModelNew(FeatureToggleManager featureToggleManager, RewardsAccountInteractor rewardsAccountInteractor) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = rewardsAccountInteractor;
        this.f = featureToggleManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(RewardsAuthenticationContractNew.ViewState.Loading.f5661a);
        this.h = mutableStateFlowA;
        this.i = FlowKt.b(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(1, 1, BufferOverflow.e);
        this.j = sharedFlowImplA;
        this.k = FlowKt.a(sharedFlowImplA);
    }
}
