package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferFeed;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsOfferFeed {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsOffersHeader f6286a;
    public final RewardsErrorDialog b;
    public final RewardsOffersMessage c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f;
    public final Boolean g;
    public final boolean h;

    public RewardsOfferFeed(RewardsOffersHeader rewardsOffersHeader, RewardsErrorDialog rewardsErrorDialog, RewardsOffersMessage rewardsOffersMessage, ArrayList arrayList, ArrayList arrayList2, String str, Boolean bool, boolean z) {
        this.f6286a = rewardsOffersHeader;
        this.b = rewardsErrorDialog;
        this.c = rewardsOffersMessage;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = str;
        this.g = bool;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOfferFeed)) {
            return false;
        }
        RewardsOfferFeed rewardsOfferFeed = (RewardsOfferFeed) obj;
        return Intrinsics.c(this.f6286a, rewardsOfferFeed.f6286a) && Intrinsics.c(this.b, rewardsOfferFeed.b) && Intrinsics.c(this.c, rewardsOfferFeed.c) && this.d.equals(rewardsOfferFeed.d) && this.e.equals(rewardsOfferFeed.e) && Intrinsics.c(this.f, rewardsOfferFeed.f) && Intrinsics.c(this.g, rewardsOfferFeed.g) && this.h == rewardsOfferFeed.h;
    }

    public final int hashCode() {
        RewardsOffersHeader rewardsOffersHeader = this.f6286a;
        int iHashCode = (rewardsOffersHeader == null ? 0 : rewardsOffersHeader.hashCode()) * 31;
        RewardsErrorDialog rewardsErrorDialog = this.b;
        int iHashCode2 = (iHashCode + (rewardsErrorDialog == null ? 0 : rewardsErrorDialog.hashCode())) * 31;
        RewardsOffersMessage rewardsOffersMessage = this.c;
        int iB = a.b(a.b((iHashCode2 + (rewardsOffersMessage == null ? 0 : rewardsOffersMessage.hashCode())) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode3 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RewardsOfferFeed(header=" + this.f6286a + ", errorMessage=" + this.b + ", message=" + this.c + ", filters=" + this.d + ", sections=" + this.e + ", onLoadDeepLinkUrl=" + this.f + ", eligibleForOnboardingBanner=" + this.g + ", isAutoBoostEnabled=" + this.h + ")";
    }
}
