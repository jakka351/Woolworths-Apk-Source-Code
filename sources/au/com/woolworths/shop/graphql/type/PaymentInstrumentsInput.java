package au.com.woolworths.shop.graphql.type;

import androidx.compose.ui.input.pointer.a;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/PaymentInstrumentsInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentInstrumentsInput {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f11689a;
    public final Optional b;
    public final ArrayList c;
    public final ArrayList d;

    public PaymentInstrumentsInput(java.util.List checkoutSessions, Optional optional, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.h(checkoutSessions, "checkoutSessions");
        this.f11689a = checkoutSessions;
        this.b = optional;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInstrumentsInput)) {
            return false;
        }
        PaymentInstrumentsInput paymentInstrumentsInput = (PaymentInstrumentsInput) obj;
        return Intrinsics.c(this.f11689a, paymentInstrumentsInput.f11689a) && this.b.equals(paymentInstrumentsInput.b) && this.c.equals(paymentInstrumentsInput.c) && this.d.equals(paymentInstrumentsInput.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.b(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f11689a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "PaymentInstrumentsInput(checkoutSessions=" + this.f11689a + ", selectedId=" + this.b + ", unlinkedGiftcards=" + this.c + ", linkedGiftcards=" + this.d + ")";
    }
}
