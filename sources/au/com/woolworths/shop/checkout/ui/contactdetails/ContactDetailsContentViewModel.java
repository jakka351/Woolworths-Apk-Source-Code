package au.com.woolworths.shop.checkout.ui.contactdetails;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/contactdetails/ContactDetailsContentViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContactDetailsContentViewModel extends ViewModel {
    public final MutableStateFlow e;
    public final StateFlow f;
    public final BufferedChannel g;
    public final Flow h;

    @Inject
    public ContactDetailsContentViewModel() {
        String str = null;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ContactDetailsContract.ViewState(str, str, 7));
        this.e = mutableStateFlowA;
        this.f = FlowKt.b(mutableStateFlowA);
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.g = bufferedChannelA;
        this.h = FlowKt.I(bufferedChannelA);
    }
}
