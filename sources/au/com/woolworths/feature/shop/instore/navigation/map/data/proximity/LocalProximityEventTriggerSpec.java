package au.com.woolworths.feature.shop.instore.navigation.map.data.proximity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventTriggerSpec;", "", "Enter", "Exit", "Dwell", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventTriggerSpec$Dwell;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventTriggerSpec$Enter;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventTriggerSpec$Exit;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LocalProximityEventTriggerSpec {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventTriggerSpec$Dwell;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventTriggerSpec;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Dwell implements LocalProximityEventTriggerSpec {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dwell) && Double.compare(0.0d, 0.0d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(0.0d);
        }

        public final String toString() {
            return "Dwell(seconds=0.0)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventTriggerSpec$Enter;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventTriggerSpec;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Enter implements LocalProximityEventTriggerSpec {

        /* renamed from: a, reason: collision with root package name */
        public static final Enter f7351a = new Enter();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Enter);
        }

        public final int hashCode() {
            return -1864312925;
        }

        public final String toString() {
            return "Enter";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventTriggerSpec$Exit;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/LocalProximityEventTriggerSpec;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Exit implements LocalProximityEventTriggerSpec {

        /* renamed from: a, reason: collision with root package name */
        public static final Exit f7352a = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 1325343475;
        }

        public final String toString() {
            return "Exit";
        }
    }
}
