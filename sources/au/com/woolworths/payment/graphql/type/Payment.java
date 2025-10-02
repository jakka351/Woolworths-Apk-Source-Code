package au.com.woolworths.payment.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/payment/graphql/type/Payment;", "", "schema-payment"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Payment {

    /* renamed from: a, reason: collision with root package name */
    public final int f9201a;
    public final PaymentType b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    public Payment(int i, PaymentType paymentType, Optional optional, Optional optional2, Optional optional3, Optional optional4, int i2) {
        int i3 = i2 & 4;
        Optional.Absent absent = Optional.Absent.f13523a;
        optional = i3 != 0 ? absent : optional;
        optional2 = (i2 & 8) != 0 ? absent : optional2;
        optional3 = (i2 & 16) != 0 ? absent : optional3;
        optional4 = (i2 & 32) != 0 ? absent : optional4;
        this.f9201a = i;
        this.b = paymentType;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = optional4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Payment)) {
            return false;
        }
        Payment payment = (Payment) obj;
        return this.f9201a == payment.f9201a && this.b == payment.b && Intrinsics.c(this.c, payment.c) && Intrinsics.c(this.d, payment.d) && Intrinsics.c(this.e, payment.e) && Intrinsics.c(this.f, payment.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a.c(this.e, a.c(this.d, a.c(this.c, (this.b.hashCode() + (Integer.hashCode(this.f9201a) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payment(amount=");
        sb.append(this.f9201a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", id=");
        a.x(sb, this.c, ", number=", this.d, ", pin=");
        sb.append(this.e);
        sb.append(", tokenData=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
