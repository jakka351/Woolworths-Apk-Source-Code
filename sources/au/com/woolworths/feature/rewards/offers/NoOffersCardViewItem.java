package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/NoOffersCardViewItem;", "Lau/com/woolworths/feature/rewards/offers/SectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NoOffersCardViewItem extends SectionViewItem {
    public final String b;
    public final IconAsset c;
    public final String d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoOffersCardViewItem(String sectionId, IconAsset iconAsset, String str, String str2) {
        super(sectionId);
        Intrinsics.h(sectionId, "sectionId");
        this.b = sectionId;
        this.c = iconAsset;
        this.d = str;
        this.e = str2;
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
        if (!(obj instanceof NoOffersCardViewItem)) {
            return false;
        }
        NoOffersCardViewItem noOffersCardViewItem = (NoOffersCardViewItem) obj;
        return Intrinsics.c(this.b, noOffersCardViewItem.b) && Intrinsics.c(this.c, noOffersCardViewItem.c) && Intrinsics.c(this.d, noOffersCardViewItem.d) && Intrinsics.c(this.e, noOffersCardViewItem.e);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        IconAsset iconAsset = this.c;
        int iHashCode2 = (iHashCode + (iconAsset == null ? 0 : iconAsset.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoOffersCardViewItem(sectionId=");
        sb.append(this.b);
        sb.append(", emptyStateIconAsset=");
        sb.append(this.c);
        sb.append(", emptyStateTitle=");
        return androidx.constraintlayout.core.state.a.l(sb, this.d, ", emptyStateMessage=", this.e, ")");
    }
}
