package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PaymentErrorStepUp;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentErrorStepUp {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10626a;
    public final String b;

    public PaymentErrorStepUp(boolean z, String str) {
        this.f10626a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentErrorStepUp)) {
            return false;
        }
        PaymentErrorStepUp paymentErrorStepUp = (PaymentErrorStepUp) obj;
        return this.f10626a == paymentErrorStepUp.f10626a && Intrinsics.c(this.b, paymentErrorStepUp.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f10626a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.m("PaymentErrorStepUp(mandatory=", this.f10626a, ", url=", this.b, ")");
    }
}
