package au.com.woolworths.android.onesite.modules.checkout.common;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/PaymentBreakdownState;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentBreakdownState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4278a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public PaymentBreakdownState(int i, int i2, String orderTotal, String str, boolean z) {
        Intrinsics.h(orderTotal, "orderTotal");
        this.f4278a = z;
        this.b = i;
        this.c = i2;
        this.d = orderTotal;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentBreakdownState)) {
            return false;
        }
        PaymentBreakdownState paymentBreakdownState = (PaymentBreakdownState) obj;
        return this.f4278a == paymentBreakdownState.f4278a && this.b == paymentBreakdownState.b && this.c == paymentBreakdownState.c && Intrinsics.c(this.d, paymentBreakdownState.d) && Intrinsics.c(this.e, paymentBreakdownState.e);
    }

    public final int hashCode() {
        int iE = androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.a(this.b, Boolean.hashCode(this.f4278a) * 31, 31), 31), 31, this.d), 31, true);
        String str = this.e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentBreakdownState(canPlaceOrder=");
        sb.append(this.f4278a);
        sb.append(", paymentRemainingLabelTextRes=");
        sb.append(this.b);
        sb.append(", buttonTextRes=");
        androidx.compose.ui.input.pointer.a.u(this.c, ", orderTotal=", this.d, ", isVisible=true, outstandingBalance=", sb);
        return YU.a.o(sb, this.e, ")");
    }
}
