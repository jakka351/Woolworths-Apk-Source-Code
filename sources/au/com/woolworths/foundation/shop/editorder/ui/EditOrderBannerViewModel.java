package au.com.woolworths.foundation.shop.editorder.ui;

import androidx.lifecycle.ViewModel;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerContract;
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

@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerViewModel;", "Landroidx/lifecycle/ViewModel;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditOrderBannerViewModel extends ViewModel {
    public final EditOrderInteractor e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final BufferedChannel h;
    public final Flow i;

    public EditOrderBannerViewModel(EditOrderInteractor editOrderInteractor) {
        Intrinsics.h(editOrderInteractor, "editOrderInteractor");
        this.e = editOrderInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new EditOrderBannerContract.ViewState(null));
        this.f = mutableStateFlowA;
        this.g = mutableStateFlowA;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.h = bufferedChannelA;
        this.i = FlowKt.I(bufferedChannelA);
    }
}
