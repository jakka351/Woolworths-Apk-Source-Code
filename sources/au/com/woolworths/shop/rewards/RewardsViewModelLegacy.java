package au.com.woolworths.shop.rewards;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.shop.rewards.RewardsContractLegacy;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/RewardsViewModelLegacy;", "Landroidx/lifecycle/ViewModel;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public final class RewardsViewModelLegacy extends ViewModel {
    public final RewardsAccountInteractor e;
    public final MutableLiveData f;
    public final SharedFlowImpl g;
    public final MutableLiveData h;
    public final Flow i;
    public boolean j;

    public RewardsViewModelLegacy(RewardsAccountInteractor rewardsAccountInteractor) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        this.e = rewardsAccountInteractor;
        MutableLiveData mutableLiveData = new MutableLiveData(new RewardsContractLegacy.ViewState(false));
        this.f = mutableLiveData;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.g = sharedFlowImplB;
        this.h = mutableLiveData;
        this.i = FlowKt.a(sharedFlowImplB);
    }
}
