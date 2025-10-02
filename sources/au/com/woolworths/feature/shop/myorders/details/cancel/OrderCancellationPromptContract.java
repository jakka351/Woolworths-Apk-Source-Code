package au.com.woolworths.feature.shop.myorders.details.cancel;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCancelWarning;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract;", "", "ViewState", "Actions", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OrderCancellationPromptContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions;", "", "CancelSuccess", "OrderOutOfWindow", "ShowSnackbarMessage", "Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions$CancelSuccess;", "Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions$OrderOutOfWindow;", "Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions$ShowSnackbarMessage;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions$CancelSuccess;", "Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CancelSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CancelSuccess f7693a = new CancelSuccess();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions$OrderOutOfWindow;", "Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OrderOutOfWindow extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OrderOutOfWindow f7694a = new OrderOutOfWindow();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions$ShowSnackbarMessage;", "Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbarMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f7695a;

            public ShowSnackbarMessage(int i) {
                this.f7695a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbarMessage) && this.f7695a == ((ShowSnackbarMessage) obj).f7695a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f7695a);
            }

            public final String toString() {
                return a.e(this.f7695a, "ShowSnackbarMessage(errorMessage=", ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/cancel/OrderCancellationPromptContract$ViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7696a;
        public final OrderCancelWarning b;
        public final FullPageErrorCause c;

        public ViewState(boolean z, OrderCancelWarning cancelWarning, FullPageErrorCause fullPageErrorCause) {
            Intrinsics.h(cancelWarning, "cancelWarning");
            this.f7696a = z;
            this.b = cancelWarning;
            this.c = fullPageErrorCause;
        }

        public static ViewState a(ViewState viewState, boolean z) {
            OrderCancelWarning cancelWarning = viewState.b;
            FullPageErrorCause fullPageErrorCause = viewState.c;
            Intrinsics.h(cancelWarning, "cancelWarning");
            return new ViewState(z, cancelWarning, fullPageErrorCause);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7696a == viewState.f7696a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.f7696a) * 31)) * 31;
            FullPageErrorCause fullPageErrorCause = this.c;
            return iHashCode + (fullPageErrorCause == null ? 0 : fullPageErrorCause.hashCode());
        }

        public final String toString() {
            return "ViewState(isCancelling=" + this.f7696a + ", cancelWarning=" + this.b + ", errorState=" + this.c + ")";
        }
    }
}
