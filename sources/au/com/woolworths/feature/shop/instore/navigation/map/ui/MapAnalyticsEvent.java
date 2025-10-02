package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent;", "", "MapLoadServerError", "CloseMapClick", "OnLocationRationaleShown", "GoToSettingsClickFromLocationRationale", "NoThanksClickFromLocationRationale", "DeviceNotSupportedDialogImpression", "InStoreNavigationErrorDialogImpression", "NotInStoreBuildingErrorDialogImpression", "ShowFeedback", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$CloseMapClick;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$DeviceNotSupportedDialogImpression;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$GoToSettingsClickFromLocationRationale;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$InStoreNavigationErrorDialogImpression;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$MapLoadServerError;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$NoThanksClickFromLocationRationale;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$NotInStoreBuildingErrorDialogImpression;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$OnLocationRationaleShown;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$ShowFeedback;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MapAnalyticsEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$CloseMapClick;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CloseMapClick implements MapAnalyticsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final CloseMapClick f7390a = new CloseMapClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseMapClick);
        }

        public final int hashCode() {
            return -349934189;
        }

        public final String toString() {
            return "CloseMapClick";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$DeviceNotSupportedDialogImpression;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeviceNotSupportedDialogImpression implements MapAnalyticsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final DeviceNotSupportedDialogImpression f7391a = new DeviceNotSupportedDialogImpression();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceNotSupportedDialogImpression);
        }

        public final int hashCode() {
            return 386940307;
        }

        public final String toString() {
            return "DeviceNotSupportedDialogImpression";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$GoToSettingsClickFromLocationRationale;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GoToSettingsClickFromLocationRationale implements MapAnalyticsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final GoToSettingsClickFromLocationRationale f7392a = new GoToSettingsClickFromLocationRationale();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoToSettingsClickFromLocationRationale);
        }

        public final int hashCode() {
            return 1262151143;
        }

        public final String toString() {
            return "GoToSettingsClickFromLocationRationale";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$InStoreNavigationErrorDialogImpression;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InStoreNavigationErrorDialogImpression implements MapAnalyticsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final InStoreNavigationErrorDialogImpression f7393a = new InStoreNavigationErrorDialogImpression();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InStoreNavigationErrorDialogImpression);
        }

        public final int hashCode() {
            return -2016999302;
        }

        public final String toString() {
            return "InStoreNavigationErrorDialogImpression";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$MapLoadServerError;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MapLoadServerError implements MapAnalyticsEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f7394a;
        public final String b;

        public MapLoadServerError(String str, String errorDescription) {
            Intrinsics.h(errorDescription, "errorDescription");
            this.f7394a = str;
            this.b = errorDescription;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MapLoadServerError)) {
                return false;
            }
            MapLoadServerError mapLoadServerError = (MapLoadServerError) obj;
            return Intrinsics.c(this.f7394a, mapLoadServerError.f7394a) && Intrinsics.c(this.b, mapLoadServerError.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7394a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("MapLoadServerError(errorLabel=", this.f7394a, ", errorDescription=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$NoThanksClickFromLocationRationale;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoThanksClickFromLocationRationale implements MapAnalyticsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final NoThanksClickFromLocationRationale f7395a = new NoThanksClickFromLocationRationale();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoThanksClickFromLocationRationale);
        }

        public final int hashCode() {
            return 2022969995;
        }

        public final String toString() {
            return "NoThanksClickFromLocationRationale";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$NotInStoreBuildingErrorDialogImpression;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotInStoreBuildingErrorDialogImpression implements MapAnalyticsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final NotInStoreBuildingErrorDialogImpression f7396a = new NotInStoreBuildingErrorDialogImpression();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotInStoreBuildingErrorDialogImpression);
        }

        public final int hashCode() {
            return -1353692533;
        }

        public final String toString() {
            return "NotInStoreBuildingErrorDialogImpression";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$OnLocationRationaleShown;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLocationRationaleShown implements MapAnalyticsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnLocationRationaleShown f7397a = new OnLocationRationaleShown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnLocationRationaleShown);
        }

        public final int hashCode() {
            return -1636017953;
        }

        public final String toString() {
            return "OnLocationRationaleShown";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent$ShowFeedback;", "Lau/com/woolworths/feature/shop/instore/navigation/map/ui/MapAnalyticsEvent;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowFeedback implements MapAnalyticsEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final ShowFeedback f7398a = new ShowFeedback();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowFeedback);
        }

        public final int hashCode() {
            return -1515722285;
        }

        public final String toString() {
            return "ShowFeedback";
        }
    }
}
