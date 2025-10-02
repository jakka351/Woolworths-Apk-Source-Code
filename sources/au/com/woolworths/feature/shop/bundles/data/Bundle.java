package au.com.woolworths.feature.shop.bundles.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/Bundle;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Bundle {

    /* renamed from: a, reason: collision with root package name */
    public final BundleDetails f6753a;
    public final List b;
    public final BundleQuantityStepper c;
    public final AnalyticsData d;
    public final AnalyticsData e;
    public final String f;

    public Bundle(BundleDetails bundleDetails, List list, BundleQuantityStepper bundleQuantityStepper, AnalyticsData analyticsData, AnalyticsData analyticsData2, String str) {
        Intrinsics.h(bundleDetails, "bundleDetails");
        this.f6753a = bundleDetails;
        this.b = list;
        this.c = bundleQuantityStepper;
        this.d = analyticsData;
        this.e = analyticsData2;
        this.f = str;
    }

    public static Bundle a(Bundle bundle, ArrayList arrayList, BundleQuantityStepper bundleQuantityStepper, int i) {
        BundleDetails bundleDetails = bundle.f6753a;
        if ((i & 4) != 0) {
            bundleQuantityStepper = bundle.c;
        }
        BundleQuantityStepper bundleCta = bundleQuantityStepper;
        AnalyticsData analyticsData = bundle.d;
        AnalyticsData analyticsData2 = bundle.e;
        String str = bundle.f;
        bundle.getClass();
        Intrinsics.h(bundleDetails, "bundleDetails");
        Intrinsics.h(bundleCta, "bundleCta");
        return new Bundle(bundleDetails, arrayList, bundleCta, analyticsData, analyticsData2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bundle)) {
            return false;
        }
        Bundle bundle = (Bundle) obj;
        return Intrinsics.c(this.f6753a, bundle.f6753a) && Intrinsics.c(this.b, bundle.b) && Intrinsics.c(this.c, bundle.c) && Intrinsics.c(this.d, bundle.d) && Intrinsics.c(this.e, bundle.e) && Intrinsics.c(this.f, bundle.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + b.d(this.f6753a.hashCode() * 31, 31, this.b)) * 31;
        AnalyticsData analyticsData = this.d;
        int iHashCode2 = (iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.e;
        int iHashCode3 = (iHashCode2 + (analyticsData2 == null ? 0 : analyticsData2.hashCode())) * 31;
        String str = this.f;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Bundle(bundleDetails=" + this.f6753a + ", bundleItems=" + this.b + ", bundleCta=" + this.c + ", bundleAnalytics=" + this.d + ", bundleImpressionAnalytics=" + this.e + ", footerText=" + this.f + ")";
    }
}
