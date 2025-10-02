package au.com.woolworths.feature.shop.instore.navigation.map.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientFloorTransition;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OriientFloorTransition {

    /* renamed from: a, reason: collision with root package name */
    public final String f7339a;
    public final OriientMetersCoordinate b;
    public final FloorTransitionType c;
    public final int d;
    public final int e;

    public OriientFloorTransition(String str, OriientMetersCoordinate oriientMetersCoordinate, FloorTransitionType floorTransitionType, int i, int i2) {
        this.f7339a = str;
        this.b = oriientMetersCoordinate;
        this.c = floorTransitionType;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriientFloorTransition)) {
            return false;
        }
        OriientFloorTransition oriientFloorTransition = (OriientFloorTransition) obj;
        return Intrinsics.c(this.f7339a, oriientFloorTransition.f7339a) && Intrinsics.c(this.b, oriientFloorTransition.b) && this.c == oriientFloorTransition.c && this.d == oriientFloorTransition.d && this.e == oriientFloorTransition.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + b.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f7339a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriientFloorTransition(id=");
        sb.append(this.f7339a);
        sb.append(", coordinate=");
        sb.append(this.b);
        sb.append(", floorTransitionType=");
        sb.append(this.c);
        sb.append(", floorOrder=");
        sb.append(this.d);
        sb.append(", destinationFloorOrder=");
        return a.m(sb, this.e, ")");
    }
}
