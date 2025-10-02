package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Building;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.data.ImageMapData;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.DirectionAndDistanceIndicatorData;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import ovh.plrapps.mapcompose.ui.state.MapState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract;", "", "Action", "ViewState", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InstoreMapContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action;", "", "TurnOnDeviceLocation", "ShowNavigationFeedback", "PerformHaptic", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action$PerformHaptic;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action$ShowNavigationFeedback;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action$TurnOnDeviceLocation;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action$PerformHaptic;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformHaptic extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHaptic f7379a = new PerformHaptic();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformHaptic);
            }

            public final int hashCode() {
                return 1806019913;
            }

            public final String toString() {
                return "PerformHaptic";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action$ShowNavigationFeedback;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowNavigationFeedback extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowNavigationFeedback f7380a = new ShowNavigationFeedback();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowNavigationFeedback);
            }

            public final int hashCode() {
                return 390562501;
            }

            public final String toString() {
                return "ShowNavigationFeedback";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action$TurnOnDeviceLocation;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class TurnOnDeviceLocation extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final TurnOnDeviceLocation f7381a = new TurnOnDeviceLocation();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof TurnOnDeviceLocation);
            }

            public final int hashCode() {
                return 1994262902;
            }

            public final String toString() {
                return "TurnOnDeviceLocation";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState;", "", "Content", "MapData", "Error", "NavigationState", "LocationServicesUnavailableState", "DebugInfo", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState$Content;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState$Error;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState$DebugInfo;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DebugInfo {

            /* renamed from: a, reason: collision with root package name */
            public final String f7383a;
            public final Store b;
            public final ProductCard c;
            public final OriientMetersCoordinate d;
            public final Building e;
            public final Floor f;
            public final OriientMap g;

            public DebugInfo(String str, Store store, ProductCard productCard, OriientMetersCoordinate oriientMetersCoordinate, Building building, Floor floor, OriientMap oriientMap) {
                this.f7383a = str;
                this.b = store;
                this.c = productCard;
                this.d = oriientMetersCoordinate;
                this.e = building;
                this.f = floor;
                this.g = oriientMap;
            }

            public static DebugInfo a(DebugInfo debugInfo, String str, Store store, ProductCard productCard, OriientMetersCoordinate oriientMetersCoordinate, Building building, Floor floor, OriientMap oriientMap, int i) {
                if ((i & 1) != 0) {
                    str = debugInfo.f7383a;
                }
                String str2 = str;
                if ((i & 2) != 0) {
                    store = debugInfo.b;
                }
                Store store2 = store;
                if ((i & 4) != 0) {
                    productCard = debugInfo.c;
                }
                ProductCard productCard2 = productCard;
                if ((i & 8) != 0) {
                    oriientMetersCoordinate = debugInfo.d;
                }
                OriientMetersCoordinate oriientMetersCoordinate2 = oriientMetersCoordinate;
                if ((i & 16) != 0) {
                    building = debugInfo.e;
                }
                Building building2 = building;
                if ((i & 32) != 0) {
                    floor = debugInfo.f;
                }
                Floor floor2 = floor;
                if ((i & 64) != 0) {
                    oriientMap = debugInfo.g;
                }
                debugInfo.getClass();
                return new DebugInfo(str2, store2, productCard2, oriientMetersCoordinate2, building2, floor2, oriientMap);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DebugInfo)) {
                    return false;
                }
                DebugInfo debugInfo = (DebugInfo) obj;
                return Intrinsics.c(this.f7383a, debugInfo.f7383a) && Intrinsics.c(this.b, debugInfo.b) && Intrinsics.c(this.c, debugInfo.c) && Intrinsics.c(this.d, debugInfo.d) && Intrinsics.c(this.e, debugInfo.e) && Intrinsics.c(this.f, debugInfo.f) && Intrinsics.c(this.g, debugInfo.g);
            }

            public final int hashCode() {
                String str = this.f7383a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Store store = this.b;
                int iHashCode2 = (iHashCode + (store == null ? 0 : store.hashCode())) * 31;
                ProductCard productCard = this.c;
                int iHashCode3 = (iHashCode2 + (productCard == null ? 0 : productCard.hashCode())) * 31;
                OriientMetersCoordinate oriientMetersCoordinate = this.d;
                int iHashCode4 = (iHashCode3 + (oriientMetersCoordinate == null ? 0 : oriientMetersCoordinate.hashCode())) * 31;
                Building building = this.e;
                int iHashCode5 = (iHashCode4 + (building == null ? 0 : building.hashCode())) * 31;
                Floor floor = this.f;
                int iHashCode6 = (iHashCode5 + (floor == null ? 0 : floor.hashCode())) * 31;
                OriientMap oriientMap = this.g;
                return iHashCode6 + (oriientMap != null ? oriientMap.hashCode() : 0);
            }

            public final String toString() {
                return "DebugInfo(storeId=" + this.f7383a + ", store=" + this.b + ", productCard=" + this.c + ", oriientMetersCoordinate=" + this.d + ", building=" + this.e + ", floor=" + this.f + ", oriientMap=" + this.g + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {
            public Error() {
                InstoreMapErrorState instoreMapErrorState = InstoreMapErrorState.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                InstoreMapErrorState instoreMapErrorState = InstoreMapErrorState.d;
                return true;
            }

            public final int hashCode() {
                return InstoreMapErrorState.d.hashCode();
            }

            public final String toString() {
                return "Error(error=" + InstoreMapErrorState.d + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState$LocationServicesUnavailableState;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LocationServicesUnavailableState {
            public static final LocationServicesUnavailableState d;
            public static final LocationServicesUnavailableState e;
            public static final LocationServicesUnavailableState f;
            public static final /* synthetic */ LocationServicesUnavailableState[] g;
            public static final /* synthetic */ EnumEntries h;

            static {
                LocationServicesUnavailableState locationServicesUnavailableState = new LocationServicesUnavailableState("NO_LOCATION_PERMISSION", 0);
                d = locationServicesUnavailableState;
                LocationServicesUnavailableState locationServicesUnavailableState2 = new LocationServicesUnavailableState("NO_LOCATION_PERMISSION_PERMANENT", 1);
                e = locationServicesUnavailableState2;
                LocationServicesUnavailableState locationServicesUnavailableState3 = new LocationServicesUnavailableState("DEVICE_LOCATION_DISABLED", 2);
                f = locationServicesUnavailableState3;
                LocationServicesUnavailableState[] locationServicesUnavailableStateArr = {locationServicesUnavailableState, locationServicesUnavailableState2, locationServicesUnavailableState3};
                g = locationServicesUnavailableStateArr;
                h = EnumEntriesKt.a(locationServicesUnavailableStateArr);
            }

            public static LocationServicesUnavailableState valueOf(String str) {
                return (LocationServicesUnavailableState) Enum.valueOf(LocationServicesUnavailableState.class, str);
            }

            public static LocationServicesUnavailableState[] values() {
                return (LocationServicesUnavailableState[]) g.clone();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState$MapData;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MapData {

            /* renamed from: a, reason: collision with root package name */
            public final MapState f7384a;
            public final ImageMapData b;

            public MapData(MapState mapState, ImageMapData imageMapData) {
                this.f7384a = mapState;
                this.b = imageMapData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MapData)) {
                    return false;
                }
                MapData mapData = (MapData) obj;
                return Intrinsics.c(this.f7384a, mapData.f7384a) && Intrinsics.c(this.b, mapData.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7384a.hashCode() * 31);
            }

            public final String toString() {
                return "MapData(mapState=" + this.f7384a + ", imageData=" + this.b + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState$NavigationState;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NavigationState {
            public static final NavigationState d;
            public static final NavigationState e;
            public static final /* synthetic */ NavigationState[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                NavigationState navigationState = new NavigationState("PASSIVE", 0);
                d = navigationState;
                NavigationState navigationState2 = new NavigationState("ACTIVE", 1);
                e = navigationState2;
                NavigationState[] navigationStateArr = {navigationState, navigationState2};
                f = navigationStateArr;
                g = EnumEntriesKt.a(navigationStateArr);
            }

            public static NavigationState valueOf(String str) {
                return (NavigationState) Enum.valueOf(NavigationState.class, str);
            }

            public static NavigationState[] values() {
                return (NavigationState[]) f.clone();
            }
        }

        default String a() {
            return getClass().getSimpleName();
        }

        default Content b() {
            if (this instanceof Content) {
                return (Content) this;
            }
            return null;
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState$Content;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final String f7382a;
            public final MapData b;
            public final List c;
            public final ProductCard d;
            public final Double e;
            public final boolean f;
            public final Double g;
            public final OriientError h;
            public final NavigationState i;
            public final LocationServicesUnavailableState j;
            public final boolean k;
            public final boolean l;
            public final boolean m;
            public final boolean n;
            public final DebugInfo o;
            public final boolean p;
            public final boolean q;
            public final List r;
            public final Floor s;
            public final DirectionAndDistanceIndicatorData t;

            public Content(String str, MapData mapData, List list, ProductCard productCard, Double d, boolean z, Double d2, OriientError oriientError, NavigationState navigationState, LocationServicesUnavailableState locationServicesUnavailableState, boolean z2, boolean z3, boolean z4, boolean z5, DebugInfo debugInfo, boolean z6, boolean z7, List floors, Floor floor, DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData) {
                Intrinsics.h(navigationState, "navigationState");
                Intrinsics.h(floors, "floors");
                this.f7382a = str;
                this.b = mapData;
                this.c = list;
                this.d = productCard;
                this.e = d;
                this.f = z;
                this.g = d2;
                this.h = oriientError;
                this.i = navigationState;
                this.j = locationServicesUnavailableState;
                this.k = z2;
                this.l = z3;
                this.m = z4;
                this.n = z5;
                this.o = debugInfo;
                this.p = z6;
                this.q = z7;
                this.r = floors;
                this.s = floor;
                this.t = directionAndDistanceIndicatorData;
            }

            public static Content c(Content content, String str, MapData mapData, List list, ProductCard productCard, Double d, boolean z, Double d2, OriientError oriientError, NavigationState navigationState, LocationServicesUnavailableState locationServicesUnavailableState, boolean z2, boolean z3, boolean z4, DebugInfo debugInfo, boolean z5, boolean z6, List list2, Floor floor, DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData, int i) {
                MapData mapData2;
                Floor floor2;
                String str2 = (i & 1) != 0 ? content.f7382a : str;
                MapData mapData3 = (i & 2) != 0 ? content.b : mapData;
                List list3 = (i & 4) != 0 ? content.c : list;
                ProductCard productCard2 = (i & 8) != 0 ? content.d : productCard;
                Double d3 = (i & 16) != 0 ? content.e : d;
                boolean z7 = (i & 32) != 0 ? content.f : z;
                Double d4 = (i & 64) != 0 ? content.g : d2;
                OriientError oriientError2 = (i & 128) != 0 ? content.h : oriientError;
                NavigationState navigationState2 = (i & 256) != 0 ? content.i : navigationState;
                LocationServicesUnavailableState locationServicesUnavailableState2 = (i & 512) != 0 ? content.j : locationServicesUnavailableState;
                boolean z8 = (i & 1024) != 0 ? content.k : z2;
                boolean z9 = (i & 2048) != 0 ? content.l : true;
                boolean z10 = (i & 4096) != 0 ? content.m : z3;
                boolean z11 = (i & 8192) != 0 ? content.n : z4;
                String str3 = str2;
                DebugInfo debugInfo2 = (i & 16384) != 0 ? content.o : debugInfo;
                boolean z12 = (i & 32768) != 0 ? content.p : z5;
                boolean z13 = (i & 65536) != 0 ? content.q : z6;
                List floors = (i & 131072) != 0 ? content.r : list2;
                if ((i & 262144) != 0) {
                    mapData2 = mapData3;
                    floor2 = content.s;
                } else {
                    mapData2 = mapData3;
                    floor2 = floor;
                }
                DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData2 = (i & 524288) != 0 ? content.t : directionAndDistanceIndicatorData;
                Intrinsics.h(navigationState2, "navigationState");
                Intrinsics.h(debugInfo2, "debugInfo");
                Intrinsics.h(floors, "floors");
                return new Content(str3, mapData2, list3, productCard2, d3, z7, d4, oriientError2, navigationState2, locationServicesUnavailableState2, z8, z9, z10, z11, debugInfo2, z12, z13, floors, floor2, directionAndDistanceIndicatorData2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.c(this.f7382a, content.f7382a) && Intrinsics.c(this.b, content.b) && Intrinsics.c(this.c, content.c) && Intrinsics.c(this.d, content.d) && Intrinsics.c(this.e, content.e) && this.f == content.f && Intrinsics.c(this.g, content.g) && Intrinsics.c(this.h, content.h) && this.i == content.i && this.j == content.j && this.k == content.k && this.l == content.l && this.m == content.m && this.n == content.n && Intrinsics.c(this.o, content.o) && this.p == content.p && this.q == content.q && Intrinsics.c(this.r, content.r) && Intrinsics.c(this.s, content.s) && Intrinsics.c(this.t, content.t);
            }

            public final int hashCode() {
                String str = this.f7382a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                MapData mapData = this.b;
                int iHashCode2 = (iHashCode + (mapData == null ? 0 : mapData.hashCode())) * 31;
                List list = this.c;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                ProductCard productCard = this.d;
                int iHashCode4 = (iHashCode3 + (productCard == null ? 0 : productCard.hashCode())) * 31;
                Double d = this.e;
                int iE = androidx.camera.core.impl.b.e((iHashCode4 + (d == null ? 0 : d.hashCode())) * 31, 31, this.f);
                Double d2 = this.g;
                int iHashCode5 = (iE + (d2 == null ? 0 : d2.hashCode())) * 31;
                OriientError oriientError = this.h;
                int iHashCode6 = (this.i.hashCode() + ((iHashCode5 + (oriientError == null ? 0 : oriientError.hashCode())) * 31)) * 31;
                LocationServicesUnavailableState locationServicesUnavailableState = this.j;
                int iD = androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((this.o.hashCode() + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((iHashCode6 + (locationServicesUnavailableState == null ? 0 : locationServicesUnavailableState.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31, 31, this.p), 31, this.q), 31, this.r);
                Floor floor = this.s;
                int iHashCode7 = (iD + (floor == null ? 0 : floor.hashCode())) * 31;
                DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData = this.t;
                return iHashCode7 + (directionAndDistanceIndicatorData != null ? directionAndDistanceIndicatorData.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(title=");
                sb.append(this.f7382a);
                sb.append(", mapData=");
                sb.append(this.b);
                sb.append(", productCards=");
                sb.append(this.c);
                sb.append(", selectedProductCard=");
                sb.append(this.d);
                sb.append(", positionLockProgress=");
                sb.append(this.e);
                sb.append(", isCalibrationNeeded=");
                sb.append(this.f);
                sb.append(", calibrationProgress=");
                sb.append(this.g);
                sb.append(", error=");
                sb.append(this.h);
                sb.append(", navigationState=");
                sb.append(this.i);
                sb.append(", locationServicesUnavailableState=");
                sb.append(this.j);
                sb.append(", isShowLocationPermissionsAccessRationale=");
                au.com.woolworths.android.onesite.a.D(sb, this.k, ", isShowLocationPermissionsDialogue=", this.l, ", isShowPositionLockSuccess=");
                au.com.woolworths.android.onesite.a.D(sb, this.m, ", isShowDebugInfo=", this.n, ", debugInfo=");
                sb.append(this.o);
                sb.append(", showNavigationEndState=");
                sb.append(this.p);
                sb.append(", mapLoading=");
                sb.append(this.q);
                sb.append(", floors=");
                sb.append(this.r);
                sb.append(", selectedFloor=");
                sb.append(this.s);
                sb.append(", selectedProductDirectionAndDistance=");
                sb.append(this.t);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ Content(String str, MapData mapData, List list, ProductCard productCard, Double d, boolean z, OriientError oriientError, NavigationState navigationState, List list2, int i) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : mapData, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : productCard, (i & 16) != 0 ? null : d, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : Double.valueOf(75.0d), (i & 128) != 0 ? null : oriientError, (i & 256) != 0 ? NavigationState.d : navigationState, null, false, false, (i & 4096) == 0, false, new DebugInfo(null, null, null, null, null, null, null), false, false, (i & 131072) != 0 ? EmptyList.d : list2, null, null);
            }
        }
    }
}
