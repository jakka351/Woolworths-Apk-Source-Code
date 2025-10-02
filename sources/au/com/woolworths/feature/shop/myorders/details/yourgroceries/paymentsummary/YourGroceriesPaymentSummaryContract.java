package au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/paymentsummary/YourGroceriesPaymentSummaryContract;", "", "ViewState", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YourGroceriesPaymentSummaryContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/paymentsummary/YourGroceriesPaymentSummaryContract$ViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final OrderPaymentDetailsData f7823a;

        public ViewState(OrderPaymentDetailsData orderPaymentDetailsData) {
            this.f7823a = orderPaymentDetailsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f7823a, ((ViewState) obj).f7823a);
        }

        public final int hashCode() {
            OrderPaymentDetailsData orderPaymentDetailsData = this.f7823a;
            if (orderPaymentDetailsData == null) {
                return 0;
            }
            return orderPaymentDetailsData.hashCode();
        }

        public final String toString() {
            return "ViewState(orderPaymentDetails=" + this.f7823a + ")";
        }
    }
}
