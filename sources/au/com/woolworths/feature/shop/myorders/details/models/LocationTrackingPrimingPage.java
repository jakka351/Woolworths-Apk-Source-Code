package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/LocationTrackingPrimingPage;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocationTrackingPrimingPage {

    /* renamed from: a, reason: collision with root package name */
    public final LocationTrackingPrimingPageContent f7759a;
    public final LocationTrackingPrimingPageContent b;

    public LocationTrackingPrimingPage(LocationTrackingPrimingPageContent locationTrackingPrimingPageContent, LocationTrackingPrimingPageContent locationTrackingPrimingPageContent2) {
        this.f7759a = locationTrackingPrimingPageContent;
        this.b = locationTrackingPrimingPageContent2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationTrackingPrimingPage)) {
            return false;
        }
        LocationTrackingPrimingPage locationTrackingPrimingPage = (LocationTrackingPrimingPage) obj;
        return Intrinsics.c(this.f7759a, locationTrackingPrimingPage.f7759a) && Intrinsics.c(this.b, locationTrackingPrimingPage.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7759a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationTrackingPrimingPage(locationPermissionsWereNotSet=" + this.f7759a + ", doNotAllowWasSetEarlier=" + this.b + ")";
    }
}
