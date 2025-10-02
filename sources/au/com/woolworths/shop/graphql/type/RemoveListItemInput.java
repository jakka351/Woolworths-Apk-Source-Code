package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/RemoveListItemInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RemoveListItemInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11879a;
    public final double b;

    public RemoveListItemInput(String str, double d) {
        this.f11879a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveListItemInput)) {
            return false;
        }
        RemoveListItemInput removeListItemInput = (RemoveListItemInput) obj;
        return Intrinsics.c(this.f11879a, removeListItemInput.f11879a) && Double.compare(this.b, removeListItemInput.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f11879a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbR = a.r(this.b, "RemoveListItemInput(id=", this.f11879a, ", timestamp=");
        sbR.append(")");
        return sbR.toString();
    }
}
