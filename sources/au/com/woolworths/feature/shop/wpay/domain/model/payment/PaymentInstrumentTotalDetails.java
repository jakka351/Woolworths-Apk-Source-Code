package au.com.woolworths.feature.shop.wpay.domain.model.payment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentInstrumentTotalDetails;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentInstrumentTotalDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f8301a;
    public final String b;
    public final PlaceOrderButton c;
    public final String d;

    public /* synthetic */ PaymentInstrumentTotalDetails(String str, PlaceOrderButton placeOrderButton) {
        this("Total (Incl. GST)", str, placeOrderButton, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInstrumentTotalDetails)) {
            return false;
        }
        PaymentInstrumentTotalDetails paymentInstrumentTotalDetails = (PaymentInstrumentTotalDetails) obj;
        return Intrinsics.c(this.f8301a, paymentInstrumentTotalDetails.f8301a) && Intrinsics.c(this.b, paymentInstrumentTotalDetails.b) && Intrinsics.c(this.c, paymentInstrumentTotalDetails.c) && Intrinsics.c(this.d, paymentInstrumentTotalDetails.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + b.c(this.f8301a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = a.v("PaymentInstrumentTotalDetails(title=", this.f8301a, ", subtitle=", this.b, ", button=");
        sbV.append(this.c);
        sbV.append(", panelMarkdown=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }

    public PaymentInstrumentTotalDetails(String str, String str2, PlaceOrderButton placeOrderButton, String str3) {
        this.f8301a = str;
        this.b = str2;
        this.c = placeOrderButton;
        this.d = str3;
    }
}
