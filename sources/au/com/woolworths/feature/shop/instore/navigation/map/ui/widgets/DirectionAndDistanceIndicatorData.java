package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/widgets/DirectionAndDistanceIndicatorData;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DirectionAndDistanceIndicatorData {

    /* renamed from: a, reason: collision with root package name */
    public final float f7407a;
    public final float b;

    public DirectionAndDistanceIndicatorData(float f, float f2) {
        this.f7407a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectionAndDistanceIndicatorData)) {
            return false;
        }
        DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData = (DirectionAndDistanceIndicatorData) obj;
        return Float.compare(this.f7407a, directionAndDistanceIndicatorData.f7407a) == 0 && Float.compare(this.b, directionAndDistanceIndicatorData.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f7407a) * 31);
    }

    public final String toString() {
        return "DirectionAndDistanceIndicatorData(directionAngleDegrees=" + this.f7407a + ", distanceMeters=" + this.b + ")";
    }
}
