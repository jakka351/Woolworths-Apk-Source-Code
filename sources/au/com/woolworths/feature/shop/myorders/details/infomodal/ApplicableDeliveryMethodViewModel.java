package au.com.woolworths.feature.shop.myorders.details.infomodal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.feature.shop.myorders.details.infomodal.ApplicableDeliveryMethodActivity;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodsTooltip;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/infomodal/ApplicableDeliveryMethodViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplicableDeliveryMethodViewModel extends ViewModel {
    public final MutableStateFlow e;
    public final StateFlow f;

    @Inject
    public ApplicableDeliveryMethodViewModel(@NotNull SavedStateHandle savedStateHandle) {
        DeliveryMethodsTooltip deliveryMethodsTooltip;
        Intrinsics.h(savedStateHandle, "savedStateHandle");
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new DeliveryMethodsTooltip("", "", EmptyList.d));
        this.e = mutableStateFlowA;
        this.f = mutableStateFlowA;
        ApplicableDeliveryMethodActivity.Companion.Extras extras = (ApplicableDeliveryMethodActivity.Companion.Extras) savedStateHandle.a("EXTRAS_APPLICABLE_DELIVERY_METHOD_DATA");
        if (extras == null || (deliveryMethodsTooltip = extras.d) == null) {
            return;
        }
        mutableStateFlowA.setValue(deliveryMethodsTooltip);
    }
}
