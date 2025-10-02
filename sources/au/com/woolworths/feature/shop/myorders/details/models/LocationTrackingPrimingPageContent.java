package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/LocationTrackingPrimingPageContent;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocationTrackingPrimingPageContent {

    /* renamed from: a, reason: collision with root package name */
    public final String f7760a;
    public final List b;
    public final List c;
    public final String d;

    public LocationTrackingPrimingPageContent(String str, String str2, List list, List list2) {
        this.f7760a = str;
        this.b = list;
        this.c = list2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationTrackingPrimingPageContent)) {
            return false;
        }
        LocationTrackingPrimingPageContent locationTrackingPrimingPageContent = (LocationTrackingPrimingPageContent) obj;
        return Intrinsics.c(this.f7760a, locationTrackingPrimingPageContent.f7760a) && Intrinsics.c(this.b, locationTrackingPrimingPageContent.b) && Intrinsics.c(this.c, locationTrackingPrimingPageContent.c) && Intrinsics.c(this.d, locationTrackingPrimingPageContent.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.d(b.d(this.f7760a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbS = a.s("LocationTrackingPrimingPageContent(header=", this.f7760a, ", rationales=", ", locationPermissionButtons=", this.b);
        sbS.append(this.c);
        sbS.append(", footer=");
        sbS.append(this.d);
        sbS.append(")");
        return sbS.toString();
    }
}
