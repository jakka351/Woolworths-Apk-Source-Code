package au.com.woolworths.feature.shop.marketplace.data.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceHorizontalList;", "Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplacePersonalisedSegment;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceHorizontalList implements HorizontalListDataInterface, MarketplacePersonalisedSegment {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;

    public MarketplaceHorizontalList(String str, String str2, String str3, String str4, List list) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceHorizontalList)) {
            return false;
        }
        MarketplaceHorizontalList marketplaceHorizontalList = (MarketplaceHorizontalList) obj;
        return Intrinsics.c(this.d, marketplaceHorizontalList.d) && Intrinsics.c(this.e, marketplaceHorizontalList.e) && Intrinsics.c(this.f, marketplaceHorizontalList.f) && Intrinsics.c(this.g, marketplaceHorizontalList.g) && Intrinsics.c(this.h, marketplaceHorizontalList.h);
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getActionTitle, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getDeepLink, reason: from getter */
    public final String getG() {
        return this.g;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getItems, reason: from getter */
    public final List getH() {
        return this.h;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getSubtitle, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getTitle, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return this.h.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("MarketplaceHorizontalList(title=", this.d, ", subtitle=", this.e, ", actionTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", deepLink=", this.g, ", items=");
        return android.support.v4.media.session.a.t(sbV, this.h, ")");
    }
}
