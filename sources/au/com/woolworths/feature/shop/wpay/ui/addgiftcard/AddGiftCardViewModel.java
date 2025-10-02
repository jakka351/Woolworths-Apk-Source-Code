package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddGiftCardInteractor;
import au.com.woolworths.feature.shop.wpay.ui.addgiftcard.AddGiftCardContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardViewModel;", "Landroidx/lifecycle/ViewModel;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AddGiftCardViewModel extends ViewModel {
    public final Context e;
    public final GetAddGiftCardInteractor f;
    public final AddGiftCardAnalyticsTracker g;
    public final MutableStateFlow h;
    public final BufferedChannel i;
    public final StateFlow j;
    public final Flow k;

    public AddGiftCardViewModel(Context context, GetAddGiftCardInteractor getAddGiftCardInteractor, AddGiftCardAnalyticsTracker addGiftCardAnalyticsTracker) {
        this.e = context;
        this.f = getAddGiftCardInteractor;
        this.g = addGiftCardAnalyticsTracker;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new AddGiftCardContract.ViewState(15));
        this.h = mutableStateFlowA;
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.i = bufferedChannelA;
        this.j = mutableStateFlowA;
        this.k = FlowKt.I(bufferedChannelA);
    }

    public final void p6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.h;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, new AddGiftCardContract.ViewState(15)));
        this.i.k(AddGiftCardContract.Action.Dismiss.f8336a);
    }
}
