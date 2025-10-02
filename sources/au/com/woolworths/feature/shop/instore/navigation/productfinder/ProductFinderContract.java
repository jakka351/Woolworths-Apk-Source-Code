package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract;", "", "Action", "ViewState", "LocationServicesUnavailableState", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductFinderContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action;", "", "Back", "LaunchSearch", "LaunchSearchResult", "GoToSettings", "ShowPermissionsDialog", "TurnOnDeviceLocation", "LaunchStoreDetails", "LaunchOlive", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$Back;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$GoToSettings;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$LaunchOlive;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$LaunchSearch;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$LaunchSearchResult;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$LaunchStoreDetails;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$ShowPermissionsDialog;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$TurnOnDeviceLocation;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$Back;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Back extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final Back f7428a = new Back();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public final int hashCode() {
                return 1640529930;
            }

            public final String toString() {
                return "Back";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$GoToSettings;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GoToSettings extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final GoToSettings f7429a = new GoToSettings();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GoToSettings);
            }

            public final int hashCode() {
                return -1055911191;
            }

            public final String toString() {
                return "GoToSettings";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$LaunchOlive;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchOlive extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchOlive f7430a = new LaunchOlive();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchOlive);
            }

            public final int hashCode() {
                return -756912795;
            }

            public final String toString() {
                return "LaunchOlive";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$LaunchSearch;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSearch extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSearch f7431a = new LaunchSearch();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSearch);
            }

            public final int hashCode() {
                return -1881650338;
            }

            public final String toString() {
                return "LaunchSearch";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$LaunchSearchResult;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSearchResult extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f7432a;

            public LaunchSearchResult(String searchTerm) {
                Intrinsics.h(searchTerm, "searchTerm");
                this.f7432a = searchTerm;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchSearchResult) && Intrinsics.c(this.f7432a, ((LaunchSearchResult) obj).f7432a);
            }

            public final int hashCode() {
                return this.f7432a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchSearchResult(searchTerm=", this.f7432a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$LaunchStoreDetails;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchStoreDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f7433a;

            public LaunchStoreDetails(String str) {
                this.f7433a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchStoreDetails) && Intrinsics.c(this.f7433a, ((LaunchStoreDetails) obj).f7433a);
            }

            public final int hashCode() {
                return this.f7433a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchStoreDetails(storeNumber=", this.f7433a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$ShowPermissionsDialog;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowPermissionsDialog extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowPermissionsDialog f7434a = new ShowPermissionsDialog();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowPermissionsDialog);
            }

            public final int hashCode() {
                return -160933716;
            }

            public final String toString() {
                return "ShowPermissionsDialog";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action$TurnOnDeviceLocation;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$Action;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class TurnOnDeviceLocation extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final TurnOnDeviceLocation f7435a = new TurnOnDeviceLocation();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof TurnOnDeviceLocation);
            }

            public final int hashCode() {
                return 332141482;
            }

            public final String toString() {
                return "TurnOnDeviceLocation";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$LocationServicesUnavailableState;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderContract$ViewState;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f7436a;
        public final List b;
        public final List c;
        public final LocationServicesUnavailableState d;

        public ViewState(String storeName, List list, List list2, LocationServicesUnavailableState locationServicesUnavailableState) {
            Intrinsics.h(storeName, "storeName");
            this.f7436a = storeName;
            this.b = list;
            this.c = list2;
            this.d = locationServicesUnavailableState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
        public static ViewState a(ViewState viewState, String storeName, ArrayList arrayList, LocationServicesUnavailableState locationServicesUnavailableState, int i) {
            viewState.getClass();
            viewState.getClass();
            if ((i & 4) != 0) {
                storeName = viewState.f7436a;
            }
            ArrayList arrayList2 = arrayList;
            if ((i & 8) != 0) {
                arrayList2 = viewState.b;
            }
            List list = viewState.c;
            if ((i & 32) != 0) {
                locationServicesUnavailableState = viewState.d;
            }
            viewState.getClass();
            Intrinsics.h(storeName, "storeName");
            return new ViewState(storeName, arrayList2, list, locationServicesUnavailableState);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f7436a, viewState.f7436a) && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d;
        }

        public final int hashCode() {
            int iC = androidx.camera.core.impl.b.c(Boolean.hashCode(false) * 961, 31, this.f7436a);
            List list = this.b;
            int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.c;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            LocationServicesUnavailableState locationServicesUnavailableState = this.d;
            return iHashCode2 + (locationServicesUnavailableState != null ? locationServicesUnavailableState.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("ViewState(isLoading=false, fullPageError=null, storeName=", this.f7436a, ", recentSearches=", ", popularSearches=", this.b);
            sbS.append(this.c);
            sbS.append(", locationServicesUnavailableState=");
            sbS.append(this.d);
            sbS.append(")");
            return sbS.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ViewState(List list, List list2, int i) {
            String str;
            LocationServicesUnavailableState locationServicesUnavailableState = LocationServicesUnavailableState.e;
            if ((i & 4) != 0) {
                str = "";
            } else {
                str = "Wagga Wagga Hill Bay Metro very long store name";
            }
            this(str, (i & 8) != 0 ? null : list, (i & 16) != 0 ? CollectionsKt.R("Milk", "Bread", "Cheese", "Butter", "Toilet paper", "Gluten free", "Yoghurt", "Chicken", "Vegan", "Chocolate") : list2, (i & 32) != 0 ? null : locationServicesUnavailableState);
        }
    }
}
