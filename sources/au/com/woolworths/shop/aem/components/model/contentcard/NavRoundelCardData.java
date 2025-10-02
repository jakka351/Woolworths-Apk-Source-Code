package au.com.woolworths.shop.aem.components.model.contentcard;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/contentcard/NavRoundelCardData;", "Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NavRoundelCardData implements HorizontalListItem {
    public final String d;
    public final String e;
    public final String f;
    public final ActionData g;

    public NavRoundelCardData(String str, String str2, String str3, ActionData actionData) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavRoundelCardData)) {
            return false;
        }
        NavRoundelCardData navRoundelCardData = (NavRoundelCardData) obj;
        return Intrinsics.c(this.d, navRoundelCardData.d) && Intrinsics.c(this.e, navRoundelCardData.e) && Intrinsics.c(this.f, navRoundelCardData.f) && Intrinsics.c(this.g, navRoundelCardData.g);
    }

    @Override // au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
    /* renamed from: getImpressionAnalyticsData */
    public final AnalyticsData getM() {
        return null;
    }

    public final int hashCode() {
        String str = this.d;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.e);
        String str2 = this.f;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        ActionData actionData = this.g;
        return iHashCode + (actionData != null ? actionData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("NavRoundelCardData(id=", this.d, ", imageUrl=", this.e, ", title=");
        sbV.append(this.f);
        sbV.append(", action=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }
}
