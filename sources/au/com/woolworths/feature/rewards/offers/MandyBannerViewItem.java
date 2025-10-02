package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/MandyBannerViewItem;", "Lau/com/woolworths/feature/rewards/offers/SectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MandyBannerViewItem extends SectionViewItem {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public MandyBannerViewItem(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // au.com.woolworths.feature.rewards.offers.SectionViewItem
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MandyBannerViewItem)) {
            return false;
        }
        MandyBannerViewItem mandyBannerViewItem = (MandyBannerViewItem) obj;
        return Intrinsics.c(this.b, mandyBannerViewItem.b) && Intrinsics.c(this.c, mandyBannerViewItem.c) && Intrinsics.c(this.d, mandyBannerViewItem.d) && Intrinsics.c(this.e, mandyBannerViewItem.e) && Intrinsics.c(this.f, mandyBannerViewItem.f) && Intrinsics.c(this.g, mandyBannerViewItem.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("MandyBannerViewItem(sectionId=", this.b, ", mandyImageUrl=", this.c, ", mandyBannerTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.d, ", mandyBannerDescription=", this.e, ", mandyBannerAction=");
        return androidx.constraintlayout.core.state.a.l(sbV, this.f, ", mandyBannerActionUrl=", this.g, ")");
    }
}
