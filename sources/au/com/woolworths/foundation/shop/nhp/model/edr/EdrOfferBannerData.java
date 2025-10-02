package au.com.woolworths.foundation.shop.nhp.model.edr;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.foundation.shop.nhp.model.TextWithAltData;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBannerData;", "", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EdrOfferBannerData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8779a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ActionData g;
    public final TextWithAltData h;
    public final ActionData i;
    public final AnalyticsData j;
    public final AnalyticsData k;
    public final AnalyticsData l;

    public EdrOfferBannerData(String offerId, String str, String linkedEdrHashCrn, String str2, String str3, String str4, ActionData actionData, TextWithAltData textWithAltData, ActionData actionData2, AnalyticsData analyticsData, AnalyticsData analyticsData2, AnalyticsData analyticsData3) {
        Intrinsics.h(offerId, "offerId");
        Intrinsics.h(linkedEdrHashCrn, "linkedEdrHashCrn");
        this.f8779a = offerId;
        this.b = str;
        this.c = linkedEdrHashCrn;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = actionData;
        this.h = textWithAltData;
        this.i = actionData2;
        this.j = analyticsData;
        this.k = analyticsData2;
        this.l = analyticsData3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EdrOfferBannerData)) {
            return false;
        }
        EdrOfferBannerData edrOfferBannerData = (EdrOfferBannerData) obj;
        return Intrinsics.c(this.f8779a, edrOfferBannerData.f8779a) && Intrinsics.c(this.b, edrOfferBannerData.b) && Intrinsics.c(this.c, edrOfferBannerData.c) && Intrinsics.c(this.d, edrOfferBannerData.d) && Intrinsics.c(this.e, edrOfferBannerData.e) && Intrinsics.c(this.f, edrOfferBannerData.f) && Intrinsics.c(this.g, edrOfferBannerData.g) && Intrinsics.c(this.h, edrOfferBannerData.h) && Intrinsics.c(this.i, edrOfferBannerData.i) && Intrinsics.c(this.j, edrOfferBannerData.j) && Intrinsics.c(this.k, edrOfferBannerData.k) && Intrinsics.c(this.l, edrOfferBannerData.l);
    }

    public final int hashCode() {
        int iHashCode = this.f8779a.hashCode() * 31;
        String str = this.b;
        int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ActionData actionData = this.g;
        int iHashCode5 = (iHashCode4 + (actionData == null ? 0 : actionData.hashCode())) * 31;
        TextWithAltData textWithAltData = this.h;
        int iHashCode6 = (iHashCode5 + (textWithAltData == null ? 0 : textWithAltData.hashCode())) * 31;
        ActionData actionData2 = this.i;
        int iHashCode7 = (iHashCode6 + (actionData2 == null ? 0 : actionData2.hashCode())) * 31;
        AnalyticsData analyticsData = this.j;
        int iHashCode8 = (iHashCode7 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.k;
        int iHashCode9 = (iHashCode8 + (analyticsData2 == null ? 0 : analyticsData2.hashCode())) * 31;
        AnalyticsData analyticsData3 = this.l;
        return iHashCode9 + (analyticsData3 != null ? analyticsData3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("EdrOfferBannerData(offerId=", this.f8779a, ", offerIdV1=", this.b, ", linkedEdrHashCrn=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", bannerTitle=", this.d, ", bannerDescription=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", bannerIconUrl=", this.f, ", bannerButtonAction=");
        sbV.append(this.g);
        sbV.append(", bannerButtonLabel=");
        sbV.append(this.h);
        sbV.append(", bannerAction=");
        sbV.append(this.i);
        sbV.append(", bannerAnalytics=");
        sbV.append(this.j);
        sbV.append(", commonAnalytics=");
        sbV.append(this.k);
        sbV.append(", bannerImpressionAnalytics=");
        sbV.append(this.l);
        sbV.append(")");
        return sbV.toString();
    }
}
