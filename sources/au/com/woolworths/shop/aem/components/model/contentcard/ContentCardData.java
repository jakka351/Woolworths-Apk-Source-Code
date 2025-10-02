package au.com.woolworths.shop.aem.components.model.contentcard;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/contentcard/ContentCardData;", "Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ContentCardData implements HorizontalListItem {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ActionData h;
    public final ImageWithAltText i;
    public final ContentCardFooter j;
    public final Boolean k;
    public final ContentCardSize l;
    public final String m;
    public final AnalyticsData n;
    public final AnalyticsData o;

    public ContentCardData(String str, String imageUrl, String str2, String str3, ActionData actionData, ImageWithAltText imageWithAltText, ContentCardFooter contentCardFooter, Boolean bool, ContentCardSize contentCardSize, String str4, AnalyticsData analyticsData) {
        Intrinsics.h(imageUrl, "imageUrl");
        this.d = str;
        this.e = imageUrl;
        this.f = str2;
        this.g = str3;
        this.h = actionData;
        this.i = imageWithAltText;
        this.j = contentCardFooter;
        this.k = bool;
        this.l = contentCardSize;
        this.m = str4;
        this.n = analyticsData;
        this.o = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCardData)) {
            return false;
        }
        ContentCardData contentCardData = (ContentCardData) obj;
        return Intrinsics.c(this.d, contentCardData.d) && Intrinsics.c(this.e, contentCardData.e) && Intrinsics.c(this.f, contentCardData.f) && Intrinsics.c(this.g, contentCardData.g) && Intrinsics.c(this.h, contentCardData.h) && Intrinsics.c(this.i, contentCardData.i) && Intrinsics.c(this.j, contentCardData.j) && Intrinsics.c(this.k, contentCardData.k) && this.l == contentCardData.l && Intrinsics.c(this.m, contentCardData.m) && Intrinsics.c(this.n, contentCardData.n);
    }

    @Override // au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
    /* renamed from: getImpressionAnalyticsData, reason: from getter */
    public final AnalyticsData getO() {
        return this.o;
    }

    public final int hashCode() {
        String str = this.d;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.e);
        String str2 = this.f;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        ActionData actionData = this.h;
        int iHashCode3 = (iHashCode2 + (actionData == null ? 0 : actionData.hashCode())) * 31;
        ImageWithAltText imageWithAltText = this.i;
        int iHashCode4 = (iHashCode3 + (imageWithAltText == null ? 0 : imageWithAltText.hashCode())) * 31;
        ContentCardFooter contentCardFooter = this.j;
        int iHashCode5 = (iHashCode4 + (contentCardFooter == null ? 0 : contentCardFooter.hashCode())) * 31;
        Boolean bool = this.k;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        ContentCardSize contentCardSize = this.l;
        int iHashCode7 = (iHashCode6 + (contentCardSize == null ? 0 : contentCardSize.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AnalyticsData analyticsData = this.n;
        return iHashCode8 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ContentCardData(id=", this.d, ", imageUrl=", this.e, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", description=", this.g, ", action=");
        sbV.append(this.h);
        sbV.append(", brandImage=");
        sbV.append(this.i);
        sbV.append(", footer=");
        sbV.append(this.j);
        sbV.append(", isVideoAvailable=");
        sbV.append(this.k);
        sbV.append(", size=");
        sbV.append(this.l);
        sbV.append(", contentCardSponsoredText=");
        sbV.append(this.m);
        sbV.append(", contentCardAnalytics=");
        return au.com.woolworths.android.onesite.a.n(sbV, this.n, ")");
    }
}
