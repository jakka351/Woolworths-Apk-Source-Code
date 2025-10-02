package au.com.woolworths.feature.shop.instore.navigation.map.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/MapFocus;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MapFocus {

    /* renamed from: a, reason: collision with root package name */
    public final OriientMetersCoordinate f7337a;
    public final double b;

    public MapFocus(OriientMetersCoordinate oriientMetersCoordinate, double d) {
        this.f7337a = oriientMetersCoordinate;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapFocus)) {
            return false;
        }
        MapFocus mapFocus = (MapFocus) obj;
        return this.f7337a.equals(mapFocus.f7337a) && Double.compare(this.b, mapFocus.b) == 0 && Double.compare(1.5d, 1.5d) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a.a(1.5d, a.a(this.b, this.f7337a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MapFocus(coordinate=" + this.f7337a + ", rotation=" + this.b + ", zoom=1.5, applyOffset=true)";
    }
}
