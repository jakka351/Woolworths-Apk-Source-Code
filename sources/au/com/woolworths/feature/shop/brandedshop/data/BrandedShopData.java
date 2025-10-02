package au.com.woolworths.feature.shop.brandedshop.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/BrandedShopData;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BrandedShopData {

    /* renamed from: a, reason: collision with root package name */
    public final BrandedShopHeaderData f6677a;
    public final List b;
    public final List c;
    public final AnalyticsData d;
    public final AnalyticsData e;

    public BrandedShopData(BrandedShopHeaderData brandedShopHeaderData, List list, List list2, AnalyticsData analyticsData, AnalyticsData analyticsData2) {
        this.f6677a = brandedShopHeaderData;
        this.b = list;
        this.c = list2;
        this.d = analyticsData;
        this.e = analyticsData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandedShopData)) {
            return false;
        }
        BrandedShopData brandedShopData = (BrandedShopData) obj;
        return Intrinsics.c(this.f6677a, brandedShopData.f6677a) && Intrinsics.c(this.b, brandedShopData.b) && Intrinsics.c(this.c, brandedShopData.c) && Intrinsics.c(this.d, brandedShopData.d) && Intrinsics.c(this.e, brandedShopData.e);
    }

    public final int hashCode() {
        BrandedShopHeaderData brandedShopHeaderData = this.f6677a;
        int iHashCode = (brandedShopHeaderData == null ? 0 : brandedShopHeaderData.hashCode()) * 31;
        List list = this.b;
        int iD = b.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.c);
        AnalyticsData analyticsData = this.d;
        int iHashCode2 = (iD + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.e;
        return iHashCode2 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrandedShopData(header=");
        sb.append(this.f6677a);
        sb.append(", bottomSheets=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", analytics=");
        sb.append(this.d);
        sb.append(", impressionAnalytics=");
        return a.n(sb, this.e, ")");
    }
}
