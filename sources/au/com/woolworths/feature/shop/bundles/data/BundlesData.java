package au.com.woolworths.feature.shop.bundles.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundlesData;", "", "BundlesLandingErrorPage", "BundlesLandingPage", "Lau/com/woolworths/feature/shop/bundles/data/BundlesData$BundlesLandingErrorPage;", "Lau/com/woolworths/feature/shop/bundles/data/BundlesData$BundlesLandingPage;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BundlesData {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundlesData$BundlesLandingErrorPage;", "Lau/com/woolworths/feature/shop/bundles/data/BundlesData;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundlesLandingErrorPage implements BundlesData {

        /* renamed from: a, reason: collision with root package name */
        public final String f6762a;
        public final String b;
        public final String c;
        public final LinkData d;
        public final AnalyticsData e;
        public final AnalyticsData f;

        public BundlesLandingErrorPage(String str, String str2, String str3, LinkData linkData, AnalyticsData analyticsData, AnalyticsData analyticsData2) {
            this.f6762a = str;
            this.b = str2;
            this.c = str3;
            this.d = linkData;
            this.e = analyticsData;
            this.f = analyticsData2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundlesLandingErrorPage)) {
                return false;
            }
            BundlesLandingErrorPage bundlesLandingErrorPage = (BundlesLandingErrorPage) obj;
            return Intrinsics.c(this.f6762a, bundlesLandingErrorPage.f6762a) && Intrinsics.c(this.b, bundlesLandingErrorPage.b) && Intrinsics.c(this.c, bundlesLandingErrorPage.c) && Intrinsics.c(this.d, bundlesLandingErrorPage.d) && Intrinsics.c(this.e, bundlesLandingErrorPage.e) && Intrinsics.c(this.f, bundlesLandingErrorPage.f);
        }

        public final int hashCode() {
            String str = this.f6762a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            LinkData linkData = this.d;
            int iHashCode4 = (iHashCode3 + (linkData == null ? 0 : linkData.hashCode())) * 31;
            AnalyticsData analyticsData = this.e;
            int iHashCode5 = (iHashCode4 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
            AnalyticsData analyticsData2 = this.f;
            return iHashCode5 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BundlesLandingErrorPage(image=", this.f6762a, ", title=", this.b, ", description=");
            sbV.append(this.c);
            sbV.append(", cta=");
            sbV.append(this.d);
            sbV.append(", analytics=");
            sbV.append(this.e);
            sbV.append(", impressionAnalytics=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundlesData$BundlesLandingPage;", "Lau/com/woolworths/feature/shop/bundles/data/BundlesData;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundlesLandingPage implements BundlesData {

        /* renamed from: a, reason: collision with root package name */
        public final BundlesHeader f6763a;
        public final List b;
        public final AnalyticsData c;
        public final AnalyticsData d;
        public final Integer e;

        public BundlesLandingPage(BundlesHeader bundlesHeader, List list, AnalyticsData analyticsData, AnalyticsData analyticsData2, Integer num) {
            this.f6763a = bundlesHeader;
            this.b = list;
            this.c = analyticsData;
            this.d = analyticsData2;
            this.e = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundlesLandingPage)) {
                return false;
            }
            BundlesLandingPage bundlesLandingPage = (BundlesLandingPage) obj;
            return Intrinsics.c(this.f6763a, bundlesLandingPage.f6763a) && Intrinsics.c(this.b, bundlesLandingPage.b) && Intrinsics.c(this.c, bundlesLandingPage.c) && Intrinsics.c(this.d, bundlesLandingPage.d) && Intrinsics.c(this.e, bundlesLandingPage.e);
        }

        public final int hashCode() {
            int iD = b.d(this.f6763a.hashCode() * 31, 31, this.b);
            AnalyticsData analyticsData = this.c;
            int iHashCode = (iD + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
            AnalyticsData analyticsData2 = this.d;
            int iHashCode2 = (iHashCode + (analyticsData2 == null ? 0 : analyticsData2.hashCode())) * 31;
            Integer num = this.e;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BundlesLandingPage(header=");
            sb.append(this.f6763a);
            sb.append(", items=");
            sb.append(this.b);
            sb.append(", analytics=");
            sb.append(this.c);
            sb.append(", impressionAnalytics=");
            sb.append(this.d);
            sb.append(", nextPageNumber=");
            return au.com.woolworths.android.onesite.a.p(sb, this.e, ")");
        }
    }
}
