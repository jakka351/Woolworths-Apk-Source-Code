package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/widgets/UserPositionMarkerData;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UserPositionMarkerData {

    /* renamed from: a, reason: collision with root package name */
    public final OriientPosition f7408a;
    public final float b;

    public UserPositionMarkerData(OriientPosition userPosition, float f) {
        Intrinsics.h(userPosition, "userPosition");
        this.f7408a = userPosition;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPositionMarkerData)) {
            return false;
        }
        UserPositionMarkerData userPositionMarkerData = (UserPositionMarkerData) obj;
        return Intrinsics.c(this.f7408a, userPositionMarkerData.f7408a) && Float.compare(this.b, userPositionMarkerData.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.f7408a.hashCode() * 31);
    }

    public final String toString() {
        return "UserPositionMarkerData(userPosition=" + this.f7408a + ", mapRotation=" + this.b + ")";
    }
}
