package au.com.woolworths.feature.shop.instore.navigation.map.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientCoordinateInBuilding;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OriientCoordinateInBuilding {

    /* renamed from: a, reason: collision with root package name */
    public final OriientMetersCoordinate f7338a;
    public final int b;

    public OriientCoordinateInBuilding(int i, OriientMetersCoordinate oriientMetersCoordinate) {
        this.f7338a = oriientMetersCoordinate;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriientCoordinateInBuilding)) {
            return false;
        }
        OriientCoordinateInBuilding oriientCoordinateInBuilding = (OriientCoordinateInBuilding) obj;
        return Intrinsics.c(this.f7338a, oriientCoordinateInBuilding.f7338a) && this.b == oriientCoordinateInBuilding.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f7338a.hashCode() * 31);
    }

    public final String toString() {
        return "OriientCoordinateInBuilding(coordinate=" + this.f7338a + ", floorOrder=" + this.b + ")";
    }
}
