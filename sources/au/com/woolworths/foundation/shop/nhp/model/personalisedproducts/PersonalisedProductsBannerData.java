package au.com.woolworths.foundation.shop.nhp.model.personalisedproducts;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.foundation.shop.nhp.model.ImageWithAltData;
import au.com.woolworths.sdui.model.action.ActionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/personalisedproducts/PersonalisedProductsBannerData;", "", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PersonalisedProductsBannerData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8784a;
    public final String b;
    public final String c;
    public final ImageWithAltData d;
    public final List e;
    public final ActionData f;
    public final AnalyticsData g;
    public final AnalyticsData h;

    public PersonalisedProductsBannerData(String str, String str2, String str3, ImageWithAltData imageWithAltData, List list, ActionData actionData, AnalyticsData analyticsData, AnalyticsData analyticsData2) {
        this.f8784a = str;
        this.b = str2;
        this.c = str3;
        this.d = imageWithAltData;
        this.e = list;
        this.f = actionData;
        this.g = analyticsData;
        this.h = analyticsData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalisedProductsBannerData)) {
            return false;
        }
        PersonalisedProductsBannerData personalisedProductsBannerData = (PersonalisedProductsBannerData) obj;
        return Intrinsics.c(this.f8784a, personalisedProductsBannerData.f8784a) && Intrinsics.c(this.b, personalisedProductsBannerData.b) && Intrinsics.c(this.c, personalisedProductsBannerData.c) && Intrinsics.c(this.d, personalisedProductsBannerData.d) && Intrinsics.c(this.e, personalisedProductsBannerData.e) && Intrinsics.c(this.f, personalisedProductsBannerData.f) && Intrinsics.c(this.g, personalisedProductsBannerData.g) && Intrinsics.c(this.h, personalisedProductsBannerData.h);
    }

    public final int hashCode() {
        String str = this.f8784a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageWithAltData imageWithAltData = this.d;
        int iD = b.d((iHashCode3 + (imageWithAltData == null ? 0 : imageWithAltData.hashCode())) * 31, 31, this.e);
        ActionData actionData = this.f;
        int iHashCode4 = (iD + (actionData == null ? 0 : actionData.hashCode())) * 31;
        AnalyticsData analyticsData = this.g;
        int iHashCode5 = (iHashCode4 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.h;
        return iHashCode5 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("PersonalisedProductsBannerData(bannerTitle=", this.f8784a, ", bannerForegroundColour=", this.b, ", bannerBackgroundColour=");
        sbV.append(this.c);
        sbV.append(", bannerImage=");
        sbV.append(this.d);
        sbV.append(", products=");
        sbV.append(this.e);
        sbV.append(", bannerAction=");
        sbV.append(this.f);
        sbV.append(", bannerAnalytics=");
        sbV.append(this.g);
        sbV.append(", bannerImpressionAnalytics=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }
}
