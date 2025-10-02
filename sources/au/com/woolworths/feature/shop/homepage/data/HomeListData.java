package au.com.woolworths.feature.shop.homepage.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomeListData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HomeListData {

    /* renamed from: a, reason: collision with root package name */
    public final List f7192a;
    public final DeliveryNow b;
    public final List c;
    public final List d;
    public final UnreadChatbotMsg e;
    public final AnalyticsData f;

    public HomeListData(List list, DeliveryNow deliveryNow, List list2, List list3, UnreadChatbotMsg unreadChatbotMsg, AnalyticsData analyticsData) {
        this.f7192a = list;
        this.b = deliveryNow;
        this.c = list2;
        this.d = list3;
        this.e = unreadChatbotMsg;
        this.f = analyticsData;
    }

    public static HomeListData a(HomeListData homeListData, List list) {
        List list2 = homeListData.f7192a;
        DeliveryNow deliveryNow = homeListData.b;
        List list3 = homeListData.d;
        UnreadChatbotMsg unreadChatbotMsg = homeListData.e;
        AnalyticsData analyticsData = homeListData.f;
        homeListData.getClass();
        return new HomeListData(list2, deliveryNow, list, list3, unreadChatbotMsg, analyticsData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeListData)) {
            return false;
        }
        HomeListData homeListData = (HomeListData) obj;
        return Intrinsics.c(this.f7192a, homeListData.f7192a) && Intrinsics.c(this.b, homeListData.b) && Intrinsics.c(this.c, homeListData.c) && Intrinsics.c(this.d, homeListData.d) && Intrinsics.c(this.e, homeListData.e) && Intrinsics.c(this.f, homeListData.f);
    }

    public final int hashCode() {
        List list = this.f7192a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        DeliveryNow deliveryNow = this.b;
        int iD = b.d((iHashCode + (deliveryNow == null ? 0 : deliveryNow.hashCode())) * 31, 31, this.c);
        List list2 = this.d;
        int iHashCode2 = (iD + (list2 == null ? 0 : list2.hashCode())) * 31;
        UnreadChatbotMsg unreadChatbotMsg = this.e;
        int iHashCode3 = (iHashCode2 + (unreadChatbotMsg == null ? 0 : unreadChatbotMsg.hashCode())) * 31;
        AnalyticsData analyticsData = this.f;
        return iHashCode3 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeListData(analytics=");
        sb.append(this.f7192a);
        sb.append(", deliveryNow=");
        sb.append(this.b);
        sb.append(", items=");
        a.C(sb, this.c, ", headerItems=", this.d, ", unreadChatbotMsg=");
        sb.append(this.e);
        sb.append(", impressionAnalytics=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
