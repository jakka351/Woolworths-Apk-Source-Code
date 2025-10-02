package au.com.woolworths.android.onesite.modules.checkout.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract;", "", "Action", "ViewState", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CheckoutContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action;", "", "LaunchDigipayPaymentScreen", "LaunchWPayPaymentScreen", "LaunchPaymentErrorScreen", "LaunchOrderConfirmation", "ShowLoginPrompt", "ShowInvalidWindowError", "ShowSnackBar", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$LaunchDigipayPaymentScreen;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$LaunchOrderConfirmation;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$LaunchPaymentErrorScreen;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$LaunchWPayPaymentScreen;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$ShowInvalidWindowError;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$ShowLoginPrompt;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$ShowSnackBar;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$LaunchDigipayPaymentScreen;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchDigipayPaymentScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchDigipayPaymentScreen f4305a = new LaunchDigipayPaymentScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$LaunchOrderConfirmation;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchOrderConfirmation extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final long f4306a;

            public LaunchOrderConfirmation(long j) {
                this.f4306a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchOrderConfirmation) && this.f4306a == ((LaunchOrderConfirmation) obj).f4306a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f4306a);
            }

            public final String toString() {
                return androidx.camera.core.impl.b.l(this.f4306a, "LaunchOrderConfirmation(orderId=", ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$LaunchPaymentErrorScreen;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchPaymentErrorScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchPaymentErrorScreen f4307a = new LaunchPaymentErrorScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$LaunchWPayPaymentScreen;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchWPayPaymentScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchWPayPaymentScreen f4308a = new LaunchWPayPaymentScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$ShowInvalidWindowError;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowInvalidWindowError extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final int f4309a;

            public ShowInvalidWindowError(int i) {
                this.f4309a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowInvalidWindowError) && this.f4309a == ((ShowInvalidWindowError) obj).f4309a;
            }

            public final int hashCode() {
                return Integer.hashCode(R.string.ok) + androidx.camera.core.impl.b.a(R.string.checkout_invalid_window_message, Integer.hashCode(this.f4309a) * 31, 31);
            }

            public final String toString() {
                return YU.a.e(this.f4309a, "ShowInvalidWindowError(titleRes=", ", messageRes=2132017515, positiveButtonRes=2132018435)");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$ShowLoginPrompt;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowLoginPrompt extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowLoginPrompt f4310a = new ShowLoginPrompt();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action$ShowSnackBar;", "Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBar extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final int f4311a;

            public ShowSnackBar(int i) {
                this.f4311a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackBar) && this.f4311a == ((ShowSnackBar) obj).f4311a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f4311a);
            }

            public final String toString() {
                return YU.a.e(this.f4311a, "ShowSnackBar(messageRes=", ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutContract$ViewState;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4312a;

        public ViewState(boolean z) {
            this.f4312a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.f4312a == ((ViewState) obj).f4312a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4312a);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.n("ViewState(showFullPageLoader=", ")", this.f4312a);
        }
    }
}
