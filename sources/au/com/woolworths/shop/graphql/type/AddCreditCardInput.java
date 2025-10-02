package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/AddCreditCardInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddCreditCardInput {

    /* renamed from: a, reason: collision with root package name */
    public final FlowType f11003a;

    public AddCreditCardInput(FlowType flowType) {
        this.f11003a = flowType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddCreditCardInput) && this.f11003a == ((AddCreditCardInput) obj).f11003a;
    }

    public final int hashCode() {
        return this.f11003a.hashCode();
    }

    public final String toString() {
        return "AddCreditCardInput(flowType=" + this.f11003a + ")";
    }
}
