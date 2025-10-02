package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsCtaCardViewItem;", "Lau/com/woolworths/feature/rewards/offers/SectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsCtaCardViewItem extends SectionViewItem {
    public final String b;
    public final String c;
    public final String d;

    public RewardsCtaCardViewItem(String str, String str2, String str3) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = str3;
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
        if (!(obj instanceof RewardsCtaCardViewItem)) {
            return false;
        }
        RewardsCtaCardViewItem rewardsCtaCardViewItem = (RewardsCtaCardViewItem) obj;
        return this.b.equals(rewardsCtaCardViewItem.b) && this.c.equals(rewardsCtaCardViewItem.c) && this.d.equals(rewardsCtaCardViewItem.d);
    }

    public final int hashCode() {
        return androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return YU.a.o(YU.a.v("RewardsCtaCardViewItem(sectionId=", this.b, ", title=", this.c, ", actionUrl="), this.d, ", analytics=null)");
    }
}
