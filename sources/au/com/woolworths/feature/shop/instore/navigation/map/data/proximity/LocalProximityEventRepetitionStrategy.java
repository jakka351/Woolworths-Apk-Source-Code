package au.com.woolworths.feature.shop.instore.navigation.map.data.proximity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventRepetitionStrategy;", "", "Once", "Infinite", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventRepetitionStrategy$Infinite;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventRepetitionStrategy$Once;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LocalProximityEventRepetitionStrategy {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventRepetitionStrategy$Infinite;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventRepetitionStrategy;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Infinite implements LocalProximityEventRepetitionStrategy {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Infinite) && Double.compare(0.0d, 0.0d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(0.0d);
        }

        public final String toString() {
            return "Infinite(cooldownSeconds=0.0)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventRepetitionStrategy$Once;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventRepetitionStrategy;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Once implements LocalProximityEventRepetitionStrategy {

        /* renamed from: a, reason: collision with root package name */
        public static final Once f7349a = new Once();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Once);
        }

        public final int hashCode() {
            return 869517265;
        }

        public final String toString() {
            return "Once";
        }
    }
}
