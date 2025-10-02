package au.com.woolworths.payment.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/payment/graphql/type/PaymentsInput;", "", "schema-payment"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentsInput {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9209a;
    public final Optional b;
    public final Optional c;

    public PaymentsInput(ArrayList arrayList, Optional optional, Optional optional2) {
        this.f9209a = arrayList;
        this.b = optional;
        this.c = optional2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentsInput)) {
            return false;
        }
        PaymentsInput paymentsInput = (PaymentsInput) obj;
        return this.f9209a.equals(paymentsInput.f9209a) && this.b.equals(paymentsInput.b) && this.c.equals(paymentsInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a.c(this.b, this.f9209a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentsInput(paymentInstruments=");
        sb.append(this.f9209a);
        sb.append(", deviceData=");
        sb.append(this.b);
        sb.append(", deviceFingerprintId=");
        return a.o(sb, this.c, ")");
    }
}
