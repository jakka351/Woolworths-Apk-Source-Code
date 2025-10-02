package au.com.woolworths.payment.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/payment/graphql/type/PaymentInput;", "", "schema-payment"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentInput {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9204a;
    public final Optional b;
    public final String c;

    public PaymentInput(ArrayList arrayList, Optional optional, String idempotencyKey) {
        Intrinsics.h(idempotencyKey, "idempotencyKey");
        this.f9204a = arrayList;
        this.b = optional;
        this.c = idempotencyKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInput)) {
            return false;
        }
        PaymentInput paymentInput = (PaymentInput) obj;
        return this.f9204a.equals(paymentInput.f9204a) && this.b.equals(paymentInput.b) && Intrinsics.c(this.c, paymentInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a.c(this.b, this.f9204a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentInput(payments=");
        sb.append(this.f9204a);
        sb.append(", deviceFingerprintId=");
        sb.append(this.b);
        sb.append(", idempotencyKey=");
        return YU.a.o(sb, this.c, ")");
    }
}
