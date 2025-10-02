package au.com.woolworths.android.onesite.analytics;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/MarketplaceTrackingValue;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceTrackingValue {

    /* renamed from: a, reason: collision with root package name */
    public final String f4061a;
    public final String b;
    public final String c;

    public MarketplaceTrackingValue(String str, String str2, String str3) {
        this.f4061a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceTrackingValue)) {
            return false;
        }
        MarketplaceTrackingValue marketplaceTrackingValue = (MarketplaceTrackingValue) obj;
        return Intrinsics.c(this.f4061a, marketplaceTrackingValue.f4061a) && Intrinsics.c(this.b, marketplaceTrackingValue.b) && Intrinsics.c(this.c, marketplaceTrackingValue.c);
    }

    public final int hashCode() {
        String str = this.f4061a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return a.o(a.v("MarketplaceTrackingValue(brandName=", this.f4061a, ", sellerName=", this.b, ", dispatchNote="), this.c, ")");
    }
}
