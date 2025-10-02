package au.com.woolworths.feature.shop.instore.navigation.map.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientMapRoute;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OriientMapRoute {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7343a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final double f;

    public OriientMapRoute(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, double d) {
        this.f7343a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = arrayList5;
        this.f = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriientMapRoute)) {
            return false;
        }
        OriientMapRoute oriientMapRoute = (OriientMapRoute) obj;
        return this.f7343a.equals(oriientMapRoute.f7343a) && this.b.equals(oriientMapRoute.b) && this.c.equals(oriientMapRoute.c) && this.d.equals(oriientMapRoute.d) && this.e.equals(oriientMapRoute.e) && Double.compare(this.f, oriientMapRoute.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + a.b(a.b(a.b(a.b(this.f7343a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "OriientMapRoute(coordinatesToFirstWaypoint=" + this.f7343a + ", floorTransitionsToFirstWaypoint=" + this.b + ", coordinatesFromFirstWaypoint=" + this.c + ", floorTransitionsFromFirstWaypoint=" + this.d + ", waypoints=" + this.e + ", distanceFromStartToFirstWaypoint=" + this.f + ")";
    }
}
