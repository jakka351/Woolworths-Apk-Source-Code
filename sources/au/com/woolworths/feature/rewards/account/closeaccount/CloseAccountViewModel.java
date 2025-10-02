package au.com.woolworths.feature.rewards.account.closeaccount;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CloseAccountViewModel extends ViewModel {
    public final CloseAccountInteractor e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final BufferedChannel h;
    public final Flow i;

    public CloseAccountViewModel(CloseAccountInteractor closeAccountInteractor) {
        this.e = closeAccountInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(CloseAccountContract.ViewState.Loading.b);
        this.f = mutableStateFlowA;
        this.g = FlowKt.b(mutableStateFlowA);
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.h = bufferedChannelA;
        this.i = FlowKt.I(bufferedChannelA);
        p6();
    }

    public final void p6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.f;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, CloseAccountContract.ViewState.Loading.b));
        BuildersKt.c(ViewModelKt.a(this), null, null, new CloseAccountViewModel$fetchConsentPage$2(this, null), 3);
    }

    public final void q6() {
        CloseAccountInteractor closeAccountInteractor = this.e;
        BuildersKt.c(closeAccountInteractor.c, null, null, new CloseAccountInteractor$logoutSilently$1(closeAccountInteractor, null), 3);
        this.h.k(CloseAccountContract.Action.CloseAndGoToWelcomeScreen.f5683a);
    }
}
