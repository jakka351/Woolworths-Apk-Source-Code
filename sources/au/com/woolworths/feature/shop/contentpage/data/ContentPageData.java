package au.com.woolworths.feature.shop.contentpage.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/ContentPageData;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentPageData {

    /* renamed from: a, reason: collision with root package name */
    public final ContentPageHeaderData f7020a;
    public final AnalyticsData b;
    public final AnalyticsData c;
    public final List d;
    public final boolean e;
    public final Integer f;

    public /* synthetic */ ContentPageData(ContentPageHeaderData contentPageHeaderData, AnalyticsData analyticsData, AnalyticsData analyticsData2, ArrayList arrayList, Integer num, int i) {
        this(contentPageHeaderData, analyticsData, analyticsData2, (List) arrayList, false, (i & 32) != 0 ? null : num);
    }

    public static ContentPageData a(ContentPageData contentPageData, ContentPageHeaderData contentPageHeaderData, List list, int i) {
        if ((i & 1) != 0) {
            contentPageHeaderData = contentPageData.f7020a;
        }
        ContentPageHeaderData contentPageHeaderData2 = contentPageHeaderData;
        AnalyticsData analyticsData = contentPageData.b;
        AnalyticsData analyticsData2 = contentPageData.c;
        if ((i & 8) != 0) {
            list = contentPageData.d;
        }
        List items = list;
        boolean z = (i & 16) != 0 ? contentPageData.e : true;
        Integer num = contentPageData.f;
        contentPageData.getClass();
        Intrinsics.h(items, "items");
        return new ContentPageData(contentPageHeaderData2, analyticsData, analyticsData2, items, z, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPageData)) {
            return false;
        }
        ContentPageData contentPageData = (ContentPageData) obj;
        return Intrinsics.c(this.f7020a, contentPageData.f7020a) && Intrinsics.c(this.b, contentPageData.b) && Intrinsics.c(this.c, contentPageData.c) && Intrinsics.c(this.d, contentPageData.d) && this.e == contentPageData.e && Intrinsics.c(this.f, contentPageData.f);
    }

    public final int hashCode() {
        ContentPageHeaderData contentPageHeaderData = this.f7020a;
        int iHashCode = (contentPageHeaderData == null ? 0 : contentPageHeaderData.hashCode()) * 31;
        AnalyticsData analyticsData = this.b;
        int iHashCode2 = (iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.c;
        int iE = b.e(b.d((iHashCode2 + (analyticsData2 == null ? 0 : analyticsData2.hashCode())) * 31, 31, this.d), 31, this.e);
        Integer num = this.f;
        return iE + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ContentPageData(header=" + this.f7020a + ", analytics=" + this.b + ", impressionAnalytics=" + this.c + ", items=" + this.d + ", showSnackBarErrorMessage=" + this.e + ", nextPageNumber=" + this.f + ")";
    }

    public ContentPageData(ContentPageHeaderData contentPageHeaderData, AnalyticsData analyticsData, AnalyticsData analyticsData2, List list, boolean z, Integer num) {
        this.f7020a = contentPageHeaderData;
        this.b = analyticsData;
        this.c = analyticsData2;
        this.d = list;
        this.e = z;
        this.f = num;
    }
}
