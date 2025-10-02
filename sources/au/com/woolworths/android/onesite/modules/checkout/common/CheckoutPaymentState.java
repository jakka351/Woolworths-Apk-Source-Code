package au.com.woolworths.android.onesite.modules.checkout.common;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.checkout.models.PaymentState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/CheckoutPaymentState;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutPaymentState {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentState f4275a;
    public final Throwable b;

    public CheckoutPaymentState(PaymentState paymentState, Throwable th, int i) {
        paymentState = (i & 1) != 0 ? null : paymentState;
        th = (i & 2) != 0 ? null : th;
        this.f4275a = paymentState;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutPaymentState)) {
            return false;
        }
        CheckoutPaymentState checkoutPaymentState = (CheckoutPaymentState) obj;
        return Intrinsics.c(this.f4275a, checkoutPaymentState.f4275a) && Intrinsics.c(this.b, checkoutPaymentState.b);
    }

    public final int hashCode() {
        PaymentState paymentState = this.f4275a;
        int iHashCode = (paymentState == null ? 0 : paymentState.hashCode()) * 31;
        Throwable th = this.b;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutPaymentState(paymentState=" + this.f4275a + ", error=" + this.b + ")";
    }
}
