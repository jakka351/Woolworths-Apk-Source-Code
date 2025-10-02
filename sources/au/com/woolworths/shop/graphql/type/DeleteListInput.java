package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeleteListInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeleteListInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11310a;
    public final double b;

    public DeleteListInput(String str, double d) {
        this.f11310a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteListInput)) {
            return false;
        }
        DeleteListInput deleteListInput = (DeleteListInput) obj;
        return Intrinsics.c(this.f11310a, deleteListInput.f11310a) && Double.compare(this.b, deleteListInput.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f11310a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbR = a.r(this.b, "DeleteListInput(id=", this.f11310a, ", timestamp=");
        sbR.append(")");
        return sbR.toString();
    }
}
