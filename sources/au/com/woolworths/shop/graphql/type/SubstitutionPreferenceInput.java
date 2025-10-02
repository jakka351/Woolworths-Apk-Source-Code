package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/SubstitutionPreferenceInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubstitutionPreferenceInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11947a;
    public final double b;

    public SubstitutionPreferenceInput(String productId, double d) {
        Intrinsics.h(productId, "productId");
        this.f11947a = productId;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubstitutionPreferenceInput)) {
            return false;
        }
        SubstitutionPreferenceInput substitutionPreferenceInput = (SubstitutionPreferenceInput) obj;
        return Intrinsics.c(this.f11947a, substitutionPreferenceInput.f11947a) && Double.compare(this.b, substitutionPreferenceInput.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f11947a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbR = a.r(this.b, "SubstitutionPreferenceInput(productId=", this.f11947a, ", quantity=");
        sbR.append(")");
        return sbR.toString();
    }
}
