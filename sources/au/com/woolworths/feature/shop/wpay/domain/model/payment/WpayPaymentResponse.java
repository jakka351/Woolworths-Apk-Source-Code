package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/WpayPaymentResponse;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WpayPaymentResponse {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentResponse f8321a;

    public WpayPaymentResponse(PaymentResponse paymentResponse) {
        this.f8321a = paymentResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WpayPaymentResponse) && Intrinsics.c(this.f8321a, ((WpayPaymentResponse) obj).f8321a);
    }

    public final int hashCode() {
        return this.f8321a.hashCode();
    }

    public final String toString() {
        return "WpayPaymentResponse(onWpayPaymentResponse=" + this.f8321a + ")";
    }
}
