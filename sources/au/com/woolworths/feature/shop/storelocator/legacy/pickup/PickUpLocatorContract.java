package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract;", "", "Actions", "ViewState", "PageState", "SectionType", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PickUpLocatorContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions;", "", "LaunchLocationResult", "OpenStoreDetails", "SetFocusOnSearchView", "GoToSettings", "TurnOnDeviceLocation", "ShowPermissionsDialog", "HideKeyboard", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$GoToSettings;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$HideKeyboard;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$LaunchLocationResult;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$OpenStoreDetails;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$SetFocusOnSearchView;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$ShowPermissionsDialog;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$TurnOnDeviceLocation;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$GoToSettings;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GoToSettings extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final GoToSettings f8177a = new GoToSettings();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$HideKeyboard;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class HideKeyboard extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final HideKeyboard f8178a = new HideKeyboard();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$LaunchLocationResult;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLocationResult extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PickUpSuburb f8179a;

            public LaunchLocationResult(PickUpSuburb suburb) {
                Intrinsics.h(suburb, "suburb");
                this.f8179a = suburb;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchLocationResult) && Intrinsics.c(this.f8179a, ((LaunchLocationResult) obj).f8179a);
            }

            public final int hashCode() {
                return this.f8179a.hashCode();
            }

            public final String toString() {
                return "LaunchLocationResult(suburb=" + this.f8179a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$OpenStoreDetails;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenStoreDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PickUpLocationItem f8180a;

            public OpenStoreDetails(PickUpLocationItem pickUpLocationItem) {
                Intrinsics.h(pickUpLocationItem, "pickUpLocationItem");
                this.f8180a = pickUpLocationItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenStoreDetails) && Intrinsics.c(this.f8180a, ((OpenStoreDetails) obj).f8180a);
            }

            public final int hashCode() {
                return this.f8180a.hashCode();
            }

            public final String toString() {
                return "OpenStoreDetails(pickUpLocationItem=" + this.f8180a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$SetFocusOnSearchView;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SetFocusOnSearchView extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final SetFocusOnSearchView f8181a = new SetFocusOnSearchView();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$ShowPermissionsDialog;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowPermissionsDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowPermissionsDialog f8182a = new ShowPermissionsDialog();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions$TurnOnDeviceLocation;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$Actions;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TurnOnDeviceLocation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final TurnOnDeviceLocation f8183a = new TurnOnDeviceLocation();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$PageState;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageState {
        public static final PageState d;
        public static final PageState e;
        public static final PageState f;
        public static final PageState g;
        public static final /* synthetic */ PageState[] h;
        public static final /* synthetic */ EnumEntries i;

        static {
            PageState pageState = new PageState("LOADING", 0);
            d = pageState;
            PageState pageState2 = new PageState("NEARBY_LOCATION_LIST", 1);
            e = pageState2;
            PageState pageState3 = new PageState("SUBURB_LIST", 2);
            f = pageState3;
            PageState pageState4 = new PageState("ERROR", 3);
            g = pageState4;
            PageState[] pageStateArr = {pageState, pageState2, pageState3, pageState4};
            h = pageStateArr;
            i = EnumEntriesKt.a(pageStateArr);
        }

        public static PageState valueOf(String str) {
            return (PageState) Enum.valueOf(PageState.class, str);
        }

        public static PageState[] values() {
            return (PageState[]) h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$SectionType;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SectionType {
        public static final SectionType e;
        public static final SectionType f;
        public static final /* synthetic */ SectionType[] g;
        public static final /* synthetic */ EnumEntries h;
        public final int d;

        static {
            SectionType sectionType = new SectionType("NEARBY_LOCATIONS", 0, R.string.label_group_pick_up_locator_nearby_locations);
            e = sectionType;
            SectionType sectionType2 = new SectionType("SUBURB_MATCHES", 1, R.string.label_group_search_result);
            f = sectionType2;
            SectionType[] sectionTypeArr = {sectionType, sectionType2};
            g = sectionTypeArr;
            h = EnumEntriesKt.a(sectionTypeArr);
        }

        public SectionType(String str, int i, int i2) {
            this.d = i2;
        }

        public static SectionType valueOf(String str) {
            return (SectionType) Enum.valueOf(SectionType.class, str);
        }

        public static SectionType[] values() {
            return (SectionType[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorContract$ViewState;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final PageState f8184a;
        public final PickUpLocatorPageErrorState b;
        public final List c;
        public final List d;

        public ViewState(PageState pageState, PickUpLocatorPageErrorState pickUpLocatorPageErrorState, List list, List list2) {
            this.f8184a = pageState;
            this.b = pickUpLocatorPageErrorState;
            this.c = list;
            this.d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8184a == viewState.f8184a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d);
        }

        public final int hashCode() {
            int iHashCode = this.f8184a.hashCode() * 31;
            PickUpLocatorPageErrorState pickUpLocatorPageErrorState = this.b;
            return this.d.hashCode() + androidx.camera.core.impl.b.d((iHashCode + (pickUpLocatorPageErrorState == null ? 0 : pickUpLocatorPageErrorState.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return "ViewState(pageState=" + this.f8184a + ", errorState=" + this.b + ", nearbyStoreList=" + this.c + ", suburbList=" + this.d + ")";
        }
    }
}
