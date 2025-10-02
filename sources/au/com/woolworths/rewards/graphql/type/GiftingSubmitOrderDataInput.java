package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/GiftingSubmitOrderDataInput;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GiftingSubmitOrderDataInput {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof GiftingSubmitOrderDataInput);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "GiftingSubmitOrderDataInput(paymentInstrumentId=null, clientId=null, firstName=null, lastName=null, deliveryEmail=null, referenceId=null, subTotalAmount=null, subTotalAmountAsText=null, totalOrderAmount=null, totalOrderAmountAsText=null, discountAmount=null, discountAmountAsText=null, items=null, billingAddress=null, challengeResponse=null, deviceFingerprint=null, ipAddress=null)";
    }
}
