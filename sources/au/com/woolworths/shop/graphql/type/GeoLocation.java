package au.com.woolworths.shop.graphql.type;

import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/GeoLocation;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GeoLocation {

    /* renamed from: a, reason: collision with root package name */
    public final double f11430a;
    public final double b;

    public GeoLocation(double d, double d2) {
        this.f11430a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoLocation)) {
            return false;
        }
        GeoLocation geoLocation = (GeoLocation) obj;
        return Double.compare(this.f11430a, geoLocation.f11430a) == 0 && Double.compare(this.b, geoLocation.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.f11430a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = a.n(this.f11430a, "GeoLocation(latitude=", ", longitude=");
        sbN.append(this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
