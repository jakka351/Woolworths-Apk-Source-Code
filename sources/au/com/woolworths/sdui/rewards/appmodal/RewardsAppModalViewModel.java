package au.com.woolworths.sdui.rewards.appmodal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor;
import au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalViewModel;", "Landroidx/lifecycle/ViewModel;", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsAppModalViewModel extends ViewModel {
    public final RewardsAppModalInteractor e;
    public final PushNotificationPermissionInteractor f;
    public final AnalyticsManager g;
    public final BufferedChannel h;
    public final Flow i;
    public final MutableStateFlow j;
    public final StateFlow k;

    public RewardsAppModalViewModel(RewardsAppModalInteractor rewardsAppModalInteractor, PushNotificationPermissionInteractor pushNotificationPermissionInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(pushNotificationPermissionInteractor, "pushNotificationPermissionInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = rewardsAppModalInteractor;
        this.f = pushNotificationPermissionInteractor;
        this.g = analyticsManager;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.h = bufferedChannelA;
        this.i = FlowKt.I(bufferedChannelA);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(RewardsAppModalContract.ViewState.b);
        this.j = mutableStateFlowA;
        this.k = FlowKt.b(mutableStateFlowA);
    }
}
