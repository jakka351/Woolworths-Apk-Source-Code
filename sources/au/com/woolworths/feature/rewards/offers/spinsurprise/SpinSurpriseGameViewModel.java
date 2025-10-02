package au.com.woolworths.feature.rewards.offers.spinsurprise;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.rewards.offers.spinsurprise.SpinSurpriseGameContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/spinsurprise/SpinSurpriseGameViewModel;", "Landroidx/lifecycle/ViewModel;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpinSurpriseGameViewModel extends ViewModel {
    public final SpinSurpriseGameInteractor e;
    public final AnalyticsManager f;
    public final MutableLiveData g;
    public final BufferedChannel h;
    public final MutableLiveData i;
    public final Flow j;
    public String k;

    public SpinSurpriseGameViewModel(SpinSurpriseGameInteractor spinSurpriseGameInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = spinSurpriseGameInteractor;
        this.f = analyticsManager;
        MutableLiveData mutableLiveData = new MutableLiveData(SpinSurpriseGameContract.ViewState.b);
        this.g = mutableLiveData;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.h = bufferedChannelA;
        this.i = mutableLiveData;
        this.j = FlowKt.I(bufferedChannelA);
        BuildersKt.c(ViewModelKt.a(this), null, null, new SpinSurpriseGameViewModel$fetchGameUrl$1(this, null), 3);
    }

    public final void p6(int i, Event event) {
        this.f.g(event);
        BuildersKt.c(ViewModelKt.a(this), null, null, new SpinSurpriseGameViewModel$closeScreenWithErrorMessage$1(this, new ResText(i), null), 3);
    }
}
