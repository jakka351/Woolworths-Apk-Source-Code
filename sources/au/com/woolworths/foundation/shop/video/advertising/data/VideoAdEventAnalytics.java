package au.com.woolworths.foundation.shop.video.advertising.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdEventAnalytics;", "", "video-advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VideoAdEventAnalytics {

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsData f8888a;
    public final AnalyticsData b;
    public final AnalyticsData c;
    public final AnalyticsData d;

    public VideoAdEventAnalytics(AnalyticsData analyticsData, AnalyticsData analyticsData2, AnalyticsData analyticsData3, AnalyticsData analyticsData4) {
        this.f8888a = analyticsData;
        this.b = analyticsData2;
        this.c = analyticsData3;
        this.d = analyticsData4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdEventAnalytics)) {
            return false;
        }
        VideoAdEventAnalytics videoAdEventAnalytics = (VideoAdEventAnalytics) obj;
        return Intrinsics.c(this.f8888a, videoAdEventAnalytics.f8888a) && Intrinsics.c(this.b, videoAdEventAnalytics.b) && Intrinsics.c(this.c, videoAdEventAnalytics.c) && Intrinsics.c(this.d, videoAdEventAnalytics.d);
    }

    public final int hashCode() {
        AnalyticsData analyticsData = this.f8888a;
        int iHashCode = (analyticsData == null ? 0 : analyticsData.hashCode()) * 31;
        AnalyticsData analyticsData2 = this.b;
        int iHashCode2 = (iHashCode + (analyticsData2 == null ? 0 : analyticsData2.hashCode())) * 31;
        AnalyticsData analyticsData3 = this.c;
        int iHashCode3 = (iHashCode2 + (analyticsData3 == null ? 0 : analyticsData3.hashCode())) * 31;
        AnalyticsData analyticsData4 = this.d;
        return iHashCode3 + (analyticsData4 != null ? analyticsData4.hashCode() : 0);
    }

    public final String toString() {
        return "VideoAdEventAnalytics(impression=" + this.f8888a + ", videoPlay=" + this.b + ", videoPause=" + this.c + ", videoErrorImpression=" + this.d + ")";
    }
}
