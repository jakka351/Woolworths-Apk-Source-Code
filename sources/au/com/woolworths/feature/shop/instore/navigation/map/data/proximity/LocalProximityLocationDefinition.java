package au.com.woolworths.feature.shop.instore.navigation.map.data.proximity;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.data.WowCoordinate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityLocationDefinition;", "", "Circle", "Rectangle", "CloseWalkingDistance", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityLocationDefinition$Circle;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityLocationDefinition$CloseWalkingDistance;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityLocationDefinition$Rectangle;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LocalProximityLocationDefinition {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityLocationDefinition$Circle;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityLocationDefinition;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Circle implements LocalProximityLocationDefinition {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Circle) && Double.compare(0.0d, 0.0d) == 0;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Circle(coordinate=null, radiusMeters=0.0)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityLocationDefinition$CloseWalkingDistance;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityLocationDefinition;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CloseWalkingDistance implements LocalProximityLocationDefinition {

        /* renamed from: a, reason: collision with root package name */
        public final WowCoordinate f7353a;

        public CloseWalkingDistance(WowCoordinate wowCoordinate) {
            this.f7353a = wowCoordinate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseWalkingDistance) && Intrinsics.c(this.f7353a, ((CloseWalkingDistance) obj).f7353a);
        }

        public final int hashCode() {
            return this.f7353a.hashCode();
        }

        public final String toString() {
            return "CloseWalkingDistance(coordinate=" + this.f7353a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityLocationDefinition$Rectangle;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityLocationDefinition;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Rectangle implements LocalProximityLocationDefinition {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Rectangle);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Rectangle(topRight=null, bottomLeft=null)";
        }
    }
}
