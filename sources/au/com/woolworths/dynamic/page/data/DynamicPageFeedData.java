package au.com.woolworths.dynamic.page.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/DynamicPageFeedData;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DynamicPageFeedData {

    /* renamed from: a, reason: collision with root package name */
    public final DynamicPageHeaderData f5185a;
    public final List b;
    public final DynamicPageFooterData c;
    public final List d;
    public final AnalyticsData e;

    public DynamicPageFeedData(DynamicPageHeaderData dynamicPageHeaderData, List list, DynamicPageFooterData dynamicPageFooterData, List list2, AnalyticsData analyticsData) {
        this.f5185a = dynamicPageHeaderData;
        this.b = list;
        this.c = dynamicPageFooterData;
        this.d = list2;
        this.e = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicPageFeedData)) {
            return false;
        }
        DynamicPageFeedData dynamicPageFeedData = (DynamicPageFeedData) obj;
        return Intrinsics.c(this.f5185a, dynamicPageFeedData.f5185a) && Intrinsics.c(this.b, dynamicPageFeedData.b) && Intrinsics.c(this.c, dynamicPageFeedData.c) && Intrinsics.c(this.d, dynamicPageFeedData.d) && Intrinsics.c(this.e, dynamicPageFeedData.e);
    }

    public final int hashCode() {
        int iD = b.d(this.f5185a.hashCode() * 31, 31, this.b);
        DynamicPageFooterData dynamicPageFooterData = this.c;
        return this.e.hashCode() + b.d((iD + (dynamicPageFooterData == null ? 0 : dynamicPageFooterData.f5186a.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicPageFeedData(headerSection=");
        sb.append(this.f5185a);
        sb.append(", feedItems=");
        sb.append(this.b);
        sb.append(", footerSection=");
        sb.append(this.c);
        sb.append(", bottomSheets=");
        sb.append(this.d);
        sb.append(", analytics=");
        return a.n(sb, this.e, ")");
    }
}
