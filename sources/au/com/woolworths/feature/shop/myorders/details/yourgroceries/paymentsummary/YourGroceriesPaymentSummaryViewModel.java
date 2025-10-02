package au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/paymentsummary/YourGroceriesPaymentSummaryViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YourGroceriesPaymentSummaryViewModel extends ViewModel {
    public final MutableStateFlow e;
    public final StateFlow f;

    @Inject
    public YourGroceriesPaymentSummaryViewModel() {
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new YourGroceriesPaymentSummaryContract.ViewState(null));
        this.e = mutableStateFlowA;
        this.f = mutableStateFlowA;
    }
}
