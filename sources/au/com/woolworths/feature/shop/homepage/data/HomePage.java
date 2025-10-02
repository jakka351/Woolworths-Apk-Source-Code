package au.com.woolworths.feature.shop.homepage.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomePage;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HomePage {

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsData f7196a;
    public final AnalyticsData b;
    public final ArrayList c;

    public HomePage(AnalyticsData analyticsData, AnalyticsData analyticsData2, ArrayList arrayList) {
        this.f7196a = analyticsData;
        this.b = analyticsData2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomePage)) {
            return false;
        }
        HomePage homePage = (HomePage) obj;
        return Intrinsics.c(this.f7196a, homePage.f7196a) && Intrinsics.c(this.b, homePage.b) && this.c.equals(homePage.c);
    }

    public final int hashCode() {
        AnalyticsData analyticsData = this.f7196a;
        int iHashCode = (analyticsData == null ? 0 : analyticsData.hashCode()) * 31;
        AnalyticsData analyticsData2 = this.b;
        return this.c.hashCode() + ((iHashCode + (analyticsData2 != null ? analyticsData2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomePage(analytics=");
        sb.append(this.f7196a);
        sb.append(", impressionAnalytics=");
        sb.append(this.b);
        sb.append(", items=");
        return a.q(")", sb, this.c);
    }
}
