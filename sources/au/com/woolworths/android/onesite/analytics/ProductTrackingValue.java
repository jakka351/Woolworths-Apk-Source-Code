package au.com.woolworths.android.onesite.analytics;

import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/ProductTrackingValue;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductTrackingValue {

    /* renamed from: a, reason: collision with root package name */
    public final long f4062a;
    public final String b;
    public final Boolean c;
    public final Float d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final MarketplaceTrackingValue i;
    public final RewardsOfferAnalyticsData j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public ProductTrackingValue(long j, String str, Boolean bool, Float f, String str2, String str3, String str4, String str5, MarketplaceTrackingValue marketplaceTrackingValue, RewardsOfferAnalyticsData rewardsOfferAnalyticsData, String str6, String str7, String str8, String str9) {
        this.f4062a = j;
        this.b = str;
        this.c = bool;
        this.d = f;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = marketplaceTrackingValue;
        this.j = rewardsOfferAnalyticsData;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTrackingValue)) {
            return false;
        }
        ProductTrackingValue productTrackingValue = (ProductTrackingValue) obj;
        return this.f4062a == productTrackingValue.f4062a && Intrinsics.c(this.b, productTrackingValue.b) && Intrinsics.c(this.c, productTrackingValue.c) && Intrinsics.c(this.d, productTrackingValue.d) && Intrinsics.c(this.e, productTrackingValue.e) && Intrinsics.c(this.f, productTrackingValue.f) && Intrinsics.c(this.g, productTrackingValue.g) && Intrinsics.c(this.h, productTrackingValue.h) && Intrinsics.c(this.i, productTrackingValue.i) && Intrinsics.c(this.j, productTrackingValue.j) && Intrinsics.c(this.k, productTrackingValue.k) && Intrinsics.c(this.l, productTrackingValue.l) && Intrinsics.c(this.m, productTrackingValue.m) && Intrinsics.c(this.n, productTrackingValue.n);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f4062a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.d;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MarketplaceTrackingValue marketplaceTrackingValue = this.i;
        int iHashCode9 = (iHashCode8 + (marketplaceTrackingValue == null ? 0 : marketplaceTrackingValue.hashCode())) * 31;
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = this.j;
        int iHashCode10 = (iHashCode9 + (rewardsOfferAnalyticsData == null ? 0 : rewardsOfferAnalyticsData.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.l;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.m;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.n;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductTrackingValue(articleId=");
        sb.append(this.f4062a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", availability=");
        sb.append(this.c);
        sb.append(", quantity=");
        sb.append(this.d);
        a.B(sb, ", unitPrice=", this.e, ", subtotal=", this.f);
        a.B(sb, ", adId=", this.g, ", source=", this.h);
        sb.append(", marketplace=");
        sb.append(this.i);
        sb.append(", offerAnalytics=");
        sb.append(this.j);
        a.B(sb, ", memberPricingType=", this.k, ", imageUrl=", this.l);
        a.B(sb, ", originalPrice=", this.m, ", discount=", this.n);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ProductTrackingValue(long j, String str, Boolean bool, Float f, String str2, String str3, String str4, String str5, MarketplaceTrackingValue marketplaceTrackingValue, String str6, String str7, String str8, int i) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : marketplaceTrackingValue, null, null, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8);
    }
}
