package au.com.woolworths.shop.aem.components.model.basicCoreRow;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/basicCoreRow/BasicCoreRowListData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "", "sectionTitle", "", "Lau/com/woolworths/shop/aem/components/model/basicCoreRow/BasicCoreRowListItem;", "coreRowListItems", "Lau/com/woolworths/analytics/model/AnalyticsData;", "basicCoreRowListAnalytics", "basicCoreRowListImpressionAnalytics", "<init>", "(Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "a", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "b", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BasicCoreRowListData implements GenericPageFeedItem {

    @SerializedName("basicCoreRowListAnalytics")
    @MappedName
    @Nullable
    private final AnalyticsData basicCoreRowListAnalytics;

    @SerializedName("basicCoreRowListImpressionAnalytics")
    @MappedName
    @Nullable
    private final AnalyticsData basicCoreRowListImpressionAnalytics;

    @SerializedName("basicCoreRowListItems")
    @MappedName
    @Nullable
    private final List<BasicCoreRowListItem> coreRowListItems;

    @SerializedName("basicCoreRowListSectionTitle")
    @MappedName
    @Nullable
    private final String sectionTitle;

    public BasicCoreRowListData(@Nullable String str, @Nullable List<BasicCoreRowListItem> list, @Nullable AnalyticsData analyticsData, @Nullable AnalyticsData analyticsData2) {
        this.sectionTitle = str;
        this.coreRowListItems = list;
        this.basicCoreRowListAnalytics = analyticsData;
        this.basicCoreRowListImpressionAnalytics = analyticsData2;
    }

    /* renamed from: a, reason: from getter */
    public final AnalyticsData getBasicCoreRowListAnalytics() {
        return this.basicCoreRowListAnalytics;
    }

    /* renamed from: b, reason: from getter */
    public final AnalyticsData getBasicCoreRowListImpressionAnalytics() {
        return this.basicCoreRowListImpressionAnalytics;
    }

    /* renamed from: c, reason: from getter */
    public final List getCoreRowListItems() {
        return this.coreRowListItems;
    }

    /* renamed from: d, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicCoreRowListData)) {
            return false;
        }
        BasicCoreRowListData basicCoreRowListData = (BasicCoreRowListData) obj;
        return Intrinsics.c(this.sectionTitle, basicCoreRowListData.sectionTitle) && Intrinsics.c(this.coreRowListItems, basicCoreRowListData.coreRowListItems) && Intrinsics.c(this.basicCoreRowListAnalytics, basicCoreRowListData.basicCoreRowListAnalytics) && Intrinsics.c(this.basicCoreRowListImpressionAnalytics, basicCoreRowListData.basicCoreRowListImpressionAnalytics);
    }

    public final int hashCode() {
        String str = this.sectionTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BasicCoreRowListItem> list = this.coreRowListItems;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AnalyticsData analyticsData = this.basicCoreRowListAnalytics;
        int iHashCode3 = (iHashCode2 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.basicCoreRowListImpressionAnalytics;
        return iHashCode3 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.sectionTitle;
        List<BasicCoreRowListItem> list = this.coreRowListItems;
        AnalyticsData analyticsData = this.basicCoreRowListAnalytics;
        AnalyticsData analyticsData2 = this.basicCoreRowListImpressionAnalytics;
        StringBuilder sbS = a.s("BasicCoreRowListData(sectionTitle=", str, ", coreRowListItems=", ", basicCoreRowListAnalytics=", list);
        sbS.append(analyticsData);
        sbS.append(", basicCoreRowListImpressionAnalytics=");
        sbS.append(analyticsData2);
        sbS.append(")");
        return sbS.toString();
    }
}
