package au.com.woolworths.shop.aem.components.model.gridlist;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/gridlist/GridListData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GridListData implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10159a;
    public final AnalyticsData b;
    public final AnalyticsData c;
    public final ArrayList d;

    public GridListData(Integer num, AnalyticsData analyticsData, AnalyticsData analyticsData2, ArrayList arrayList) {
        this.f10159a = num;
        this.b = analyticsData;
        this.c = analyticsData2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridListData)) {
            return false;
        }
        GridListData gridListData = (GridListData) obj;
        return Intrinsics.c(this.f10159a, gridListData.f10159a) && Intrinsics.c(this.b, gridListData.b) && Intrinsics.c(this.c, gridListData.c) && this.d.equals(gridListData.d);
    }

    public final int hashCode() {
        Integer num = this.f10159a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        AnalyticsData analyticsData = this.b;
        int iHashCode2 = (iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (analyticsData2 != null ? analyticsData2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GridListData(gridListItemCount=" + this.f10159a + ", gridListImpressionAnalytics=" + this.b + ", gridListAnalytics=" + this.c + ", gridListItems=" + this.d + ")";
    }
}
