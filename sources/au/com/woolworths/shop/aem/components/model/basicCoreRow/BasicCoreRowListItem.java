package au.com.woolworths.shop.aem.components.model.basicCoreRow;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.sdui.model.action.ActionData;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/basicCoreRow/BasicCoreRowListItem;", "", "Lau/com/woolworths/shop/aem/components/model/basicCoreRow/CoreRowData;", "coreRowData", "Lau/com/woolworths/sdui/model/action/ActionData;", UrlHandler.ACTION, "Lau/com/woolworths/analytics/model/AnalyticsData;", "impressionAnalyticsData", "<init>", "(Lau/com/woolworths/shop/aem/components/model/basicCoreRow/CoreRowData;Lau/com/woolworths/sdui/model/action/ActionData;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Lau/com/woolworths/shop/aem/components/model/basicCoreRow/CoreRowData;", "b", "()Lau/com/woolworths/shop/aem/components/model/basicCoreRow/CoreRowData;", "Lau/com/woolworths/sdui/model/action/ActionData;", "a", "()Lau/com/woolworths/sdui/model/action/ActionData;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "getImpressionAnalyticsData", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BasicCoreRowListItem {

    @SerializedName(UrlHandler.ACTION)
    @MappedName
    @Nullable
    private final ActionData action;

    @SerializedName("row")
    @MappedName
    @Nullable
    private final CoreRowData coreRowData;

    @SerializedName("impressionAnalytics")
    @MappedName
    @Nullable
    private final AnalyticsData impressionAnalyticsData;

    public BasicCoreRowListItem(@Nullable CoreRowData coreRowData, @Nullable ActionData actionData, @Nullable AnalyticsData analyticsData) {
        this.coreRowData = coreRowData;
        this.action = actionData;
        this.impressionAnalyticsData = analyticsData;
    }

    /* renamed from: a, reason: from getter */
    public final ActionData getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final CoreRowData getCoreRowData() {
        return this.coreRowData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicCoreRowListItem)) {
            return false;
        }
        BasicCoreRowListItem basicCoreRowListItem = (BasicCoreRowListItem) obj;
        return Intrinsics.c(this.coreRowData, basicCoreRowListItem.coreRowData) && Intrinsics.c(this.action, basicCoreRowListItem.action) && Intrinsics.c(this.impressionAnalyticsData, basicCoreRowListItem.impressionAnalyticsData);
    }

    public final int hashCode() {
        CoreRowData coreRowData = this.coreRowData;
        int iHashCode = (coreRowData == null ? 0 : coreRowData.hashCode()) * 31;
        ActionData actionData = this.action;
        int iHashCode2 = (iHashCode + (actionData == null ? 0 : actionData.hashCode())) * 31;
        AnalyticsData analyticsData = this.impressionAnalyticsData;
        return iHashCode2 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        CoreRowData coreRowData = this.coreRowData;
        ActionData actionData = this.action;
        AnalyticsData analyticsData = this.impressionAnalyticsData;
        StringBuilder sb = new StringBuilder("BasicCoreRowListItem(coreRowData=");
        sb.append(coreRowData);
        sb.append(", action=");
        sb.append(actionData);
        sb.append(", impressionAnalyticsData=");
        return a.n(sb, analyticsData, ")");
    }
}
