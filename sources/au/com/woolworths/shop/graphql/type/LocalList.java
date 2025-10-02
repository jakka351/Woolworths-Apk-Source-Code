package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/LocalList;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LocalList {

    /* renamed from: a, reason: collision with root package name */
    public final String f11538a;
    public final double b;

    public LocalList(String str, double d) {
        this.f11538a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalList)) {
            return false;
        }
        LocalList localList = (LocalList) obj;
        return Intrinsics.c(this.f11538a, localList.f11538a) && Double.compare(this.b, localList.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f11538a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbR = a.r(this.b, "LocalList(id=", this.f11538a, ", timestamp=");
        sbR.append(")");
        return sbR.toString();
    }
}
