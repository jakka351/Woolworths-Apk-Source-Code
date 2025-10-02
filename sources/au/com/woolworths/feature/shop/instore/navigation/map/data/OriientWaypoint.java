package au.com.woolworths.feature.shop.instore.navigation.map.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSWaypoint;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientWaypoint;", "Lme/oriient/ipssdk/api/models/IPSWaypoint;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OriientWaypoint implements IPSWaypoint {

    /* renamed from: a, reason: collision with root package name */
    public final String f7346a;
    public final OriientMetersCoordinate b;
    public final String c;
    public final int d;

    public OriientWaypoint(String id, OriientMetersCoordinate coordinate, String str, int i) {
        Intrinsics.h(id, "id");
        Intrinsics.h(coordinate, "coordinate");
        this.f7346a = id;
        this.b = coordinate;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriientWaypoint)) {
            return false;
        }
        OriientWaypoint oriientWaypoint = (OriientWaypoint) obj;
        return Intrinsics.c(this.f7346a, oriientWaypoint.f7346a) && Intrinsics.c(this.b, oriientWaypoint.b) && Intrinsics.c(this.c, oriientWaypoint.c) && this.d == oriientWaypoint.d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    /* renamed from: getBuildingId, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    /* renamed from: getFloorOrder, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSWaypoint
    /* renamed from: getId, reason: from getter */
    public final String getF7346a() {
        return this.f7346a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public final double getX() {
        return this.b.f7344a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public final double getY() {
        return this.b.b;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public final double getZ() {
        return 0.0d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.c((this.b.hashCode() + (this.f7346a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "OriientWaypoint(id=" + this.f7346a + ", coordinate=" + this.b + ", buildingId=" + this.c + ", floorOrder=" + this.d + ")";
    }
}
