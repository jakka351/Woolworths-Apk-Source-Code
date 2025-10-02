package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsHomeBridgeViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsHomeBridgeViewModel extends ViewModel {
    public final MutableStateFlow e;
    public final StateFlow f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final SharedFlowImpl i;
    public final SharedFlow j;

    @Inject
    public RewardsHomeBridgeViewModel() {
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(Boolean.FALSE);
        this.e = mutableStateFlowA;
        this.f = FlowKt.b(mutableStateFlowA);
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(0);
        this.g = mutableStateFlowA2;
        this.h = FlowKt.b(mutableStateFlowA2);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(1, 0, null, 6);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
    }
}
