package au.com.woolworths.payment.graphql.type;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/payment/graphql/type/PaymentInstrument;", "", "schema-payment"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentInstrument {

    /* renamed from: a, reason: collision with root package name */
    public final String f9205a;
    public final String b;
    public final Optional c;

    public PaymentInstrument(String str, String str2, Optional optional) {
        this.f9205a = str;
        this.b = str2;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInstrument)) {
            return false;
        }
        PaymentInstrument paymentInstrument = (PaymentInstrument) obj;
        return Intrinsics.c(this.f9205a, paymentInstrument.f9205a) && Intrinsics.c(this.b, paymentInstrument.b) && Intrinsics.c(this.c, paymentInstrument.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f9205a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(YU.a.v("PaymentInstrument(amount=", this.f9205a, ", paymentInstrumentId=", this.b, ", stepUpToken="), this.c, ")");
    }
}
