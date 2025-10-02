package au.com.woolworths.android.onesite.modules.checkout.payserviceserror;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/payserviceserror/PayServicesErrorContract;", "", "ViewState", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PayServicesErrorContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/payserviceserror/PayServicesErrorContract$ViewState;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final PaymentServicesStatus f4302a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[PaymentServicesStatus.values().length];
                try {
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    PaymentServicesStatus paymentServicesStatus = PaymentServicesStatus.d;
                    iArr[3] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public ViewState(PaymentServicesStatus paymentServicesStatus) {
            Intrinsics.h(paymentServicesStatus, "paymentServicesStatus");
            this.f4302a = paymentServicesStatus;
        }

        public final PaymentServicesFullPageErrorState a() {
            int iOrdinal = this.f4302a.ordinal();
            if (iOrdinal == 2) {
                return PaymentServicesFullPageErrorState.d;
            }
            if (iOrdinal != 3) {
                return null;
            }
            return PaymentServicesFullPageErrorState.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.f4302a == ((ViewState) obj).f4302a;
        }

        public final int hashCode() {
            return this.f4302a.hashCode();
        }

        public final String toString() {
            return "ViewState(paymentServicesStatus=" + this.f4302a + ")";
        }
    }
}
