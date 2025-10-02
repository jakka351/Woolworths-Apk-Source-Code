package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/StandardSectionViewItem;", "Lau/com/woolworths/feature/rewards/offers/OfferSectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StandardSectionViewItem extends OfferSectionViewItem {
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;

    public StandardSectionViewItem(List list, boolean z, String str, String str2) {
        super(str);
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = list;
    }

    public static StandardSectionViewItem c(StandardSectionViewItem standardSectionViewItem, boolean z, List offers, int i) {
        String str = standardSectionViewItem.c;
        String str2 = standardSectionViewItem.d;
        if ((i & 4) != 0) {
            z = standardSectionViewItem.e;
        }
        if ((i & 8) != 0) {
            offers = standardSectionViewItem.f;
        }
        Intrinsics.h(offers, "offers");
        return new StandardSectionViewItem(offers, z, str, str2);
    }

    @Override // au.com.woolworths.feature.rewards.offers.OfferSectionViewItem, au.com.woolworths.feature.rewards.offers.SectionViewItem
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardSectionViewItem)) {
            return false;
        }
        StandardSectionViewItem standardSectionViewItem = (StandardSectionViewItem) obj;
        return Intrinsics.c(this.c, standardSectionViewItem.c) && Intrinsics.c(this.d, standardSectionViewItem.d) && this.e == standardSectionViewItem.e && Intrinsics.c(this.f, standardSectionViewItem.f);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return this.f.hashCode() + androidx.camera.core.impl.b.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("StandardSectionViewItem(sectionId=", this.c, ", sectionTitle=", this.d, ", isActivating=");
        sbV.append(this.e);
        sbV.append(", offers=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
