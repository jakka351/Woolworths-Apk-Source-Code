package au.com.woolworths.product.deliveryaddressprompt;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/product/deliveryaddressprompt/AddDeliveryAddressBottomSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddDeliveryAddressBottomSheetViewModel extends ViewModel {
    public final SharedFlowImpl e;
    public final Flow f;

    @Inject
    public AddDeliveryAddressBottomSheetViewModel() {
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.e = sharedFlowImplB;
        this.f = FlowKt.a(sharedFlowImplB);
    }
}
