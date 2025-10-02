package au.com.woolworths.feature.rewards.offers.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferFilterData;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsOfferFilterData {

    /* renamed from: a, reason: collision with root package name */
    public final String f6288a;
    public final String b;
    public final ArrayList c;
    public final RewardsOffersMessage d;
    public final OffersFilterAnalytics e;
    public final Object f;

    public RewardsOfferFilterData(String str, String str2, ArrayList arrayList, RewardsOffersMessage rewardsOffersMessage, OffersFilterAnalytics offersFilterAnalytics, List list) {
        this.f6288a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = rewardsOffersMessage;
        this.e = offersFilterAnalytics;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOfferFilterData)) {
            return false;
        }
        RewardsOfferFilterData rewardsOfferFilterData = (RewardsOfferFilterData) obj;
        return this.f6288a.equals(rewardsOfferFilterData.f6288a) && this.b.equals(rewardsOfferFilterData.b) && this.c.equals(rewardsOfferFilterData.c) && Intrinsics.c(this.d, rewardsOfferFilterData.d) && Intrinsics.c(this.e, rewardsOfferFilterData.e) && this.f.equals(rewardsOfferFilterData.f);
    }

    public final int hashCode() {
        int iB = a.b(b.c(this.f6288a.hashCode() * 31, 31, this.b), 31, this.c);
        RewardsOffersMessage rewardsOffersMessage = this.d;
        int iHashCode = (iB + (rewardsOffersMessage == null ? 0 : rewardsOffersMessage.hashCode())) * 31;
        OffersFilterAnalytics offersFilterAnalytics = this.e;
        return this.f.hashCode() + ((iHashCode + (offersFilterAnalytics != null ? offersFilterAnalytics.f6277a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("RewardsOfferFilterData(id=", this.f6288a, ", label=", this.b, ", offerIds=");
        sbV.append(this.c);
        sbV.append(", message=");
        sbV.append(this.d);
        sbV.append(", analytics=");
        sbV.append(this.e);
        sbV.append(", sectionConfigsFeed=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
