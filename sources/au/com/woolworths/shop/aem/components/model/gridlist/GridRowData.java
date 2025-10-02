package au.com.woolworths.shop.aem.components.model.gridlist;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/gridlist/GridRowData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GridRowData implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsData f10160a;
    public final AnalyticsData b;
    public final List c;

    public GridRowData(AnalyticsData analyticsData, AnalyticsData analyticsData2, List gridRowItems) {
        Intrinsics.h(gridRowItems, "gridRowItems");
        this.f10160a = analyticsData;
        this.b = analyticsData2;
        this.c = gridRowItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridRowData)) {
            return false;
        }
        GridRowData gridRowData = (GridRowData) obj;
        return Intrinsics.c(this.f10160a, gridRowData.f10160a) && Intrinsics.c(this.b, gridRowData.b) && Intrinsics.c(this.c, gridRowData.c);
    }

    public final int hashCode() {
        AnalyticsData analyticsData = this.f10160a;
        int iHashCode = (analyticsData == null ? 0 : analyticsData.hashCode()) * 31;
        AnalyticsData analyticsData2 = this.b;
        return this.c.hashCode() + ((iHashCode + (analyticsData2 != null ? analyticsData2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridRowData(gridListImpressionAnalytics=");
        sb.append(this.f10160a);
        sb.append(", gridListAnalytics=");
        sb.append(this.b);
        sb.append(", gridRowItems=");
        return a.t(sb, this.c, ")");
    }
}
