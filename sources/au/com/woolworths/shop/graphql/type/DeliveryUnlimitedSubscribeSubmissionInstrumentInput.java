package au.com.woolworths.shop.graphql.type;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeliveryUnlimitedSubscribeSubmissionInstrumentInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscribeSubmissionInstrumentInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11336a;
    public final String b;
    public final Optional c;

    public DeliveryUnlimitedSubscribeSubmissionInstrumentInput(Optional optional, Optional optional2, String instrumentId) {
        Intrinsics.h(instrumentId, "instrumentId");
        this.f11336a = optional;
        this.b = instrumentId;
        this.c = optional2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSubscribeSubmissionInstrumentInput)) {
            return false;
        }
        DeliveryUnlimitedSubscribeSubmissionInstrumentInput deliveryUnlimitedSubscribeSubmissionInstrumentInput = (DeliveryUnlimitedSubscribeSubmissionInstrumentInput) obj;
        return Intrinsics.c(this.f11336a, deliveryUnlimitedSubscribeSubmissionInstrumentInput.f11336a) && Intrinsics.c(this.b, deliveryUnlimitedSubscribeSubmissionInstrumentInput.b) && Intrinsics.c(this.c, deliveryUnlimitedSubscribeSubmissionInstrumentInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f11336a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryUnlimitedSubscribeSubmissionInstrumentInput(amount=");
        sb.append(this.f11336a);
        sb.append(", instrumentId=");
        sb.append(this.b);
        sb.append(", instrumentStepUpToken=");
        return a.o(sb, this.c, ")");
    }
}
