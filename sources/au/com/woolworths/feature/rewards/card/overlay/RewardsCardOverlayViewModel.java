package au.com.woolworths.feature.rewards.card.overlay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.feature.rewards.card.RewardsCardInteractor;
import au.com.woolworths.feature.rewards.card.analytics.RewardsCardActionData;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/overlay/RewardsCardOverlayViewModel;", "Landroidx/lifecycle/ViewModel;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsCardOverlayViewModel extends ViewModel {
    public final RewardsAccountInteractor e;
    public final RewardsCardInteractor f;
    public final AnalyticsManager g;
    public final FeatureToggleManager h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final BufferedChannel k;
    public final Flow l;
    public final boolean m;

    public RewardsCardOverlayViewModel(RewardsAccountInteractor rewardsAccountInteractor, RewardsCardInteractor rewardsCardInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, AppIdentifier appIdentifier) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(appIdentifier, "appIdentifier");
        this.e = rewardsAccountInteractor;
        this.f = rewardsCardInteractor;
        this.g = analyticsManager;
        this.h = featureToggleManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(RewardsCardOverlayContract.ViewState.d);
        this.i = mutableStateFlowA;
        this.j = FlowKt.b(mutableStateFlowA);
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.k = bufferedChannelA;
        this.l = FlowKt.I(bufferedChannelA);
        this.m = appIdentifier == AppIdentifier.d;
    }

    public final void p6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        this.g.c(RewardsCardActionData.e);
        do {
            mutableStateFlow = this.i;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, RewardsCardOverlayContract.ViewState.a((RewardsCardOverlayContract.ViewState) value, null, true, false, 5)));
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsCardOverlayViewModel$onSaveToGoogleWalletClick$2(this, null), 3);
    }
}
