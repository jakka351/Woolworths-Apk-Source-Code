package au.com.woolworths.feature.shop.contentpage.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.video.VideoData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/ContentPageHeaderData;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentPageHeaderData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7021a;
    public final String b;
    public final GenericPageHeroImageType c;
    public final VideoData d;

    public ContentPageHeaderData(String pageTitle, String str, GenericPageHeroImageType genericPageHeroImageType, VideoData videoData) {
        Intrinsics.h(pageTitle, "pageTitle");
        this.f7021a = pageTitle;
        this.b = str;
        this.c = genericPageHeroImageType;
        this.d = videoData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPageHeaderData)) {
            return false;
        }
        ContentPageHeaderData contentPageHeaderData = (ContentPageHeaderData) obj;
        return Intrinsics.c(this.f7021a, contentPageHeaderData.f7021a) && Intrinsics.c(this.b, contentPageHeaderData.b) && this.c == contentPageHeaderData.c && Intrinsics.c(this.d, contentPageHeaderData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f7021a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        GenericPageHeroImageType genericPageHeroImageType = this.c;
        int iHashCode3 = (iHashCode2 + (genericPageHeroImageType == null ? 0 : genericPageHeroImageType.hashCode())) * 31;
        VideoData videoData = this.d;
        return iHashCode3 + (videoData != null ? videoData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ContentPageHeaderData(pageTitle=", this.f7021a, ", heroImage=", this.b, ", heroImageType=");
        sbV.append(this.c);
        sbV.append(", video=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
