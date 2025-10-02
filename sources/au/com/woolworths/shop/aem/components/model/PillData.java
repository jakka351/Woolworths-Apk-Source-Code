package au.com.woolworths.shop.aem.components.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/PillData;", "Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PillData implements HorizontalListItem {
    public final String d;
    public final ActionData e;

    public PillData(String str, ActionData actionData) {
        this.d = str;
        this.e = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PillData)) {
            return false;
        }
        PillData pillData = (PillData) obj;
        return Intrinsics.c(this.d, pillData.d) && Intrinsics.c(this.e, pillData.e);
    }

    @Override // au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
    public final AnalyticsData getImpressionAnalyticsData() {
        return null;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "PillData(pillText=" + this.d + ", pillAction=" + this.e + ")";
    }
}
