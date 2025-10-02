package au.com.woolworths.shop.aem.components.model.herobanner;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBanner;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeroBanner {

    /* renamed from: a, reason: collision with root package name */
    public final String f10163a;
    public final HeroBannerAction b;
    public final AnalyticsData c;
    public final AnalyticsData d;
    public final String e;
    public final String f;
    public final HeroBannerText g;
    public final ImageWithAltText h;
    public final List i;
    public final List j;
    public final HeroBannerTermsAndConditions k;
    public final String l;
    public final HeroBannerTitleSize m;

    public HeroBanner(String str, HeroBannerAction heroBannerAction, AnalyticsData analyticsData, AnalyticsData analyticsData2, String str2, String str3, HeroBannerText heroBannerText, ImageWithAltText imageWithAltText, List list, List list2, HeroBannerTermsAndConditions heroBannerTermsAndConditions, String str4, HeroBannerTitleSize heroBannerTitleSize) {
        this.f10163a = str;
        this.b = heroBannerAction;
        this.c = analyticsData;
        this.d = analyticsData2;
        this.e = str2;
        this.f = str3;
        this.g = heroBannerText;
        this.h = imageWithAltText;
        this.i = list;
        this.j = list2;
        this.k = heroBannerTermsAndConditions;
        this.l = str4;
        this.m = heroBannerTitleSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroBanner)) {
            return false;
        }
        HeroBanner heroBanner = (HeroBanner) obj;
        return Intrinsics.c(this.f10163a, heroBanner.f10163a) && Intrinsics.c(this.b, heroBanner.b) && Intrinsics.c(this.c, heroBanner.c) && Intrinsics.c(this.d, heroBanner.d) && Intrinsics.c(this.e, heroBanner.e) && Intrinsics.c(this.f, heroBanner.f) && Intrinsics.c(this.g, heroBanner.g) && Intrinsics.c(this.h, heroBanner.h) && Intrinsics.c(this.i, heroBanner.i) && Intrinsics.c(this.j, heroBanner.j) && Intrinsics.c(this.k, heroBanner.k) && Intrinsics.c(this.l, heroBanner.l) && this.m == heroBanner.m;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f10163a.hashCode() * 31)) * 31)) * 31;
        AnalyticsData analyticsData = this.d;
        int iC = b.c((iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        HeroBannerText heroBannerText = this.g;
        int iHashCode3 = (iHashCode2 + (heroBannerText == null ? 0 : heroBannerText.hashCode())) * 31;
        ImageWithAltText imageWithAltText = this.h;
        int iHashCode4 = (iHashCode3 + (imageWithAltText == null ? 0 : imageWithAltText.hashCode())) * 31;
        List list = this.i;
        int iD = b.d((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.j);
        HeroBannerTermsAndConditions heroBannerTermsAndConditions = this.k;
        return this.m.hashCode() + b.c((iD + (heroBannerTermsAndConditions != null ? heroBannerTermsAndConditions.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeroBanner(id=");
        sb.append(this.f10163a);
        sb.append(", heroBannerAction=");
        sb.append(this.b);
        sb.append(", heroBannerAnalytics=");
        sb.append(this.c);
        sb.append(", heroBannerImpressionAnalytics=");
        sb.append(this.d);
        sb.append(", heroBannerBackgroundColour=");
        a.B(sb, this.e, ", heroBannerTextColour=", this.f, ", heroBannerBody=");
        sb.append(this.g);
        sb.append(", heroBannerBrandsLogo=");
        sb.append(this.h);
        sb.append(", heroBannerGraphics=");
        au.com.woolworths.android.onesite.a.C(sb, this.i, ", heroBannerImages=", this.j, ", heroBannerTermsAndConditions=");
        sb.append(this.k);
        sb.append(", heroBannerTitle=");
        sb.append(this.l);
        sb.append(", heroBannerTitleSize=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
