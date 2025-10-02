package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PaymentError;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentError {

    /* renamed from: a, reason: collision with root package name */
    public final String f10625a;
    public final String b;
    public final String c;
    public final PaymentErrorStepUp d;

    public PaymentError(String str, String str2, String str3, PaymentErrorStepUp paymentErrorStepUp) {
        this.f10625a = str;
        this.b = str2;
        this.c = str3;
        this.d = paymentErrorStepUp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentError)) {
            return false;
        }
        PaymentError paymentError = (PaymentError) obj;
        return Intrinsics.c(this.f10625a, paymentError.f10625a) && Intrinsics.c(this.b, paymentError.b) && Intrinsics.c(this.c, paymentError.c) && Intrinsics.c(this.d, paymentError.d);
    }

    public final int hashCode() {
        String str = this.f10625a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PaymentErrorStepUp paymentErrorStepUp = this.d;
        return iHashCode3 + (paymentErrorStepUp != null ? paymentErrorStepUp.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("PaymentError(paymentInstrumentId=", this.f10625a, ", errorCode=", this.b, ", errorMessage=");
        sbV.append(this.c);
        sbV.append(", stepUp=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
