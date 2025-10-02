package au.com.woolworths.feature.shop.instore.navigation.map.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.Meters;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientMetersCoordinate;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OriientMetersCoordinate {

    /* renamed from: a, reason: collision with root package name */
    public final double f7344a;
    public final double b;

    public OriientMetersCoordinate(double d, double d2) {
        this.f7344a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriientMetersCoordinate)) {
            return false;
        }
        OriientMetersCoordinate oriientMetersCoordinate = (OriientMetersCoordinate) obj;
        return Double.compare(this.f7344a, oriientMetersCoordinate.f7344a) == 0 && Double.compare(this.b, oriientMetersCoordinate.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.f7344a) * 31);
    }

    public final String toString() {
        return a.j("OriientMetersCoordinate(x=", Meters.a(this.f7344a), ", y=", Meters.a(this.b), ")");
    }
}
