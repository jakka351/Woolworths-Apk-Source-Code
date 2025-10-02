package au.com.woolworths.feature.shop.trafficdrivers.data;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.sdui.model.action.ActionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/trafficdrivers/data/TrafficDriverItem;", "", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrafficDriverItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f8212a;
    public final String b;
    public final String c;
    public final Object d;
    public final ActionData e;
    public final TagLabel f;
    public final AnalyticsData g;

    public TrafficDriverItem(String str, String str2, String str3, List list, ActionData actionData, TagLabel tagLabel, AnalyticsData analyticsData) {
        this.f8212a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = actionData;
        this.f = tagLabel;
        this.g = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficDriverItem)) {
            return false;
        }
        TrafficDriverItem trafficDriverItem = (TrafficDriverItem) obj;
        return this.f8212a.equals(trafficDriverItem.f8212a) && Intrinsics.c(this.b, trafficDriverItem.b) && this.c.equals(trafficDriverItem.c) && this.d.equals(trafficDriverItem.d) && this.e.equals(trafficDriverItem.e) && Intrinsics.c(this.f, trafficDriverItem.f) && Intrinsics.c(this.g, trafficDriverItem.g);
    }

    public final int hashCode() {
        int iHashCode = this.f8212a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.e.hashCode() + a.e(b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 961;
        TagLabel tagLabel = this.f;
        int iHashCode3 = (iHashCode2 + (tagLabel == null ? 0 : tagLabel.hashCode())) * 31;
        AnalyticsData analyticsData = this.g;
        return iHashCode3 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("TrafficDriverItem(title=", this.f8212a, ", subtitle=", this.b, ", imageUrl=");
        sbV.append(this.c);
        sbV.append(", keywords=");
        sbV.append(this.d);
        sbV.append(", action=");
        sbV.append(this.e);
        sbV.append(", analytics=null, tag=");
        sbV.append(this.f);
        sbV.append(", impressionAnalytics=");
        return au.com.woolworths.android.onesite.a.n(sbV, this.g, ")");
    }
}
