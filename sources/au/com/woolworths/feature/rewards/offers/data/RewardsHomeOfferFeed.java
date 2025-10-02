package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsHomeOfferFeed;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsHomeOfferFeed {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsOffersHeader f6283a;
    public final RewardsErrorDialog b;
    public final RewardsOffersMessage c;
    public final ArrayList d;
    public final String e;
    public final Boolean f;
    public final boolean g;

    public RewardsHomeOfferFeed(RewardsOffersHeader rewardsOffersHeader, RewardsErrorDialog rewardsErrorDialog, RewardsOffersMessage rewardsOffersMessage, ArrayList arrayList, String str, Boolean bool, boolean z) {
        this.f6283a = rewardsOffersHeader;
        this.b = rewardsErrorDialog;
        this.c = rewardsOffersMessage;
        this.d = arrayList;
        this.e = str;
        this.f = bool;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsHomeOfferFeed)) {
            return false;
        }
        RewardsHomeOfferFeed rewardsHomeOfferFeed = (RewardsHomeOfferFeed) obj;
        return Intrinsics.c(this.f6283a, rewardsHomeOfferFeed.f6283a) && Intrinsics.c(this.b, rewardsHomeOfferFeed.b) && Intrinsics.c(this.c, rewardsHomeOfferFeed.c) && this.d.equals(rewardsHomeOfferFeed.d) && Intrinsics.c(this.e, rewardsHomeOfferFeed.e) && Intrinsics.c(this.f, rewardsHomeOfferFeed.f) && this.g == rewardsHomeOfferFeed.g;
    }

    public final int hashCode() {
        RewardsOffersHeader rewardsOffersHeader = this.f6283a;
        int iHashCode = (rewardsOffersHeader == null ? 0 : rewardsOffersHeader.hashCode()) * 31;
        RewardsErrorDialog rewardsErrorDialog = this.b;
        int iHashCode2 = (iHashCode + (rewardsErrorDialog == null ? 0 : rewardsErrorDialog.hashCode())) * 31;
        RewardsOffersMessage rewardsOffersMessage = this.c;
        int iB = a.b((iHashCode2 + (rewardsOffersMessage == null ? 0 : rewardsOffersMessage.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode3 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardsHomeOfferFeed(header=");
        sb.append(this.f6283a);
        sb.append(", errorMessage=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append(this.c);
        sb.append(", sections=");
        sb.append(this.d);
        sb.append(", onLoadDeepLinkUrl=");
        au.com.woolworths.android.onesite.a.A(sb, this.e, ", eligibleForOnboardingBanner=", this.f, ", isAutoBoostEnabled=");
        return YU.a.k(")", sb, this.g);
    }
}
