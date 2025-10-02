package au.com.woolworths.feature.shop.instore.navigation.map.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/Building;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Building {

    /* renamed from: a, reason: collision with root package name */
    public final String f7331a;
    public final Floor b;
    public final ArrayList c;

    public Building(String str, Floor floor, ArrayList arrayList) {
        this.f7331a = str;
        this.b = floor;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Building)) {
            return false;
        }
        Building building = (Building) obj;
        return this.f7331a.equals(building.f7331a) && this.b.equals(building.b) && this.c.equals(building.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f7331a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Building(id=");
        sb.append(this.f7331a);
        sb.append(", primaryFloor=");
        sb.append(this.b);
        sb.append(", floors=");
        return a.q(")", sb, this.c);
    }
}
