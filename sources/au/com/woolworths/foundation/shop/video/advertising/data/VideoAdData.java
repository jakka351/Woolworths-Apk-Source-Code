package au.com.woolworths.foundation.shop.video.advertising.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdData;", "", "video-advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VideoAdData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8887a;
    public final int b;
    public final ImageWithAltText c;
    public final VideoAdBottomSheet d;
    public final VideoAdBottomSheet e;
    public final AnalyticsData f;
    public final VideoAdEventAnalytics g;
    public final long h;

    public VideoAdData(String url, int i, ImageWithAltText imageWithAltText, VideoAdBottomSheet videoAdBottomSheet, VideoAdBottomSheet videoAdBottomSheet2, AnalyticsData analyticsData, VideoAdEventAnalytics videoAdEventAnalytics) {
        Intrinsics.h(url, "url");
        this.f8887a = url;
        this.b = i;
        this.c = imageWithAltText;
        this.d = videoAdBottomSheet;
        this.e = videoAdBottomSheet2;
        this.f = analyticsData;
        this.g = videoAdEventAnalytics;
        this.h = i * 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdData)) {
            return false;
        }
        VideoAdData videoAdData = (VideoAdData) obj;
        return Intrinsics.c(this.f8887a, videoAdData.f8887a) && this.b == videoAdData.b && Intrinsics.c(this.c, videoAdData.c) && Intrinsics.c(this.d, videoAdData.d) && Intrinsics.c(this.e, videoAdData.e) && Intrinsics.c(this.f, videoAdData.f) && Intrinsics.c(this.g, videoAdData.g);
    }

    public final int hashCode() {
        int iA = b.a(this.b, this.f8887a.hashCode() * 31, 961);
        ImageWithAltText imageWithAltText = this.c;
        int iHashCode = (iA + (imageWithAltText == null ? 0 : imageWithAltText.hashCode())) * 31;
        VideoAdBottomSheet videoAdBottomSheet = this.d;
        int iHashCode2 = (iHashCode + (videoAdBottomSheet == null ? 0 : videoAdBottomSheet.hashCode())) * 31;
        VideoAdBottomSheet videoAdBottomSheet2 = this.e;
        int iHashCode3 = (iHashCode2 + (videoAdBottomSheet2 == null ? 0 : videoAdBottomSheet2.hashCode())) * 31;
        AnalyticsData analyticsData = this.f;
        int iHashCode4 = (iHashCode3 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        VideoAdEventAnalytics videoAdEventAnalytics = this.g;
        return iHashCode4 + (videoAdEventAnalytics != null ? videoAdEventAnalytics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbU = b.u("VideoAdData(url=", this.b, this.f8887a, ", duration=", ", thumbnail=null, fallbackImage=");
        sbU.append(this.c);
        sbU.append(", transcript=");
        sbU.append(this.d);
        sbU.append(", termsAndConditions=");
        sbU.append(this.e);
        sbU.append(", analytics=");
        sbU.append(this.f);
        sbU.append(", eventAnalytics=");
        sbU.append(this.g);
        sbU.append(")");
        return sbU.toString();
    }
}
