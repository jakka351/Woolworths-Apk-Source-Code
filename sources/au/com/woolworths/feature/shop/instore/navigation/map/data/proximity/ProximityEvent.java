package au.com.woolworths.feature.shop.instore.navigation.map.data.proximity;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/ProximityEvent;", "", "EnterRegion", "ExitRegion", "DwellRegion", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/ProximityEvent$DwellRegion;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/ProximityEvent$EnterRegion;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/ProximityEvent$ExitRegion;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProximityEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/ProximityEvent$DwellRegion;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/ProximityEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DwellRegion implements ProximityEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f7356a;

        public DwellRegion(String str) {
            this.f7356a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DwellRegion) && Intrinsics.c(this.f7356a, ((DwellRegion) obj).f7356a);
        }

        public final int hashCode() {
            String str = this.f7356a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("DwellRegion(groupId=", this.f7356a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/ProximityEvent$EnterRegion;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/ProximityEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EnterRegion implements ProximityEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f7357a;

        public EnterRegion(String str) {
            this.f7357a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EnterRegion) && Intrinsics.c(this.f7357a, ((EnterRegion) obj).f7357a);
        }

        public final int hashCode() {
            String str = this.f7357a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("EnterRegion(groupId=", this.f7357a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/ProximityEvent$ExitRegion;", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/proximity/ProximityEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExitRegion implements ProximityEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f7358a;

        public ExitRegion(String str) {
            this.f7358a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExitRegion) && Intrinsics.c(this.f7358a, ((ExitRegion) obj).f7358a);
        }

        public final int hashCode() {
            String str = this.f7358a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("ExitRegion(groupId=", this.f7358a, ")");
        }
    }
}
