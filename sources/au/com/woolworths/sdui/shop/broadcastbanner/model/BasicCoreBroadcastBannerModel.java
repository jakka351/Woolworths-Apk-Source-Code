package au.com.woolworths.sdui.shop.broadcastbanner.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/broadcastbanner/model/BasicCoreBroadcastBannerModel;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BasicCoreBroadcastBannerModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f10030a;
    public final CoreBroadcastBannerModel b;
    public final String c;
    public final ActionData d;
    public final AnalyticsData e;
    public final AnalyticsData f;
    public final boolean g;

    public BasicCoreBroadcastBannerModel(String str, CoreBroadcastBannerModel coreBroadcastBannerModel, String str2, ActionData actionData, AnalyticsData analyticsData, AnalyticsData analyticsData2, boolean z) {
        this.f10030a = str;
        this.b = coreBroadcastBannerModel;
        this.c = str2;
        this.d = actionData;
        this.e = analyticsData;
        this.f = analyticsData2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicCoreBroadcastBannerModel)) {
            return false;
        }
        BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = (BasicCoreBroadcastBannerModel) obj;
        return Intrinsics.c(this.f10030a, basicCoreBroadcastBannerModel.f10030a) && Intrinsics.c(this.b, basicCoreBroadcastBannerModel.b) && Intrinsics.c(this.c, basicCoreBroadcastBannerModel.c) && Intrinsics.c(this.d, basicCoreBroadcastBannerModel.d) && Intrinsics.c(this.e, basicCoreBroadcastBannerModel.e) && Intrinsics.c(this.f, basicCoreBroadcastBannerModel.f) && this.g == basicCoreBroadcastBannerModel.g;
    }

    public final int hashCode() {
        String str = this.f10030a;
        int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ActionData actionData = this.d;
        int iHashCode3 = (iHashCode2 + (actionData == null ? 0 : actionData.hashCode())) * 31;
        AnalyticsData analyticsData = this.e;
        int iHashCode4 = (iHashCode3 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode4 + (analyticsData2 != null ? analyticsData2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BasicCoreBroadcastBannerModel(bannerId=");
        sb.append(this.f10030a);
        sb.append(", broadcastBannerUI=");
        sb.append(this.b);
        sb.append(", actionLabel=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", impressionAnalytics=");
        sb.append(this.e);
        sb.append(", dismissAnalytics=");
        sb.append(this.f);
        sb.append(", dismissible=");
        return a.k(")", sb, this.g);
    }
}
