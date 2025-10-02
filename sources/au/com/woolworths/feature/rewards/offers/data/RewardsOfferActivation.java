package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferActivation;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsOfferActivation {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsOfferFeed f6285a;
    public final ArrayList b;
    public final ActivationDetails c;

    public RewardsOfferActivation(RewardsOfferFeed rewardsOfferFeed, ArrayList arrayList, ActivationDetailsError activationDetailsError) {
        this.f6285a = rewardsOfferFeed;
        this.b = arrayList;
        this.c = activationDetailsError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOfferActivation)) {
            return false;
        }
        RewardsOfferActivation rewardsOfferActivation = (RewardsOfferActivation) obj;
        return this.f6285a.equals(rewardsOfferActivation.f6285a) && this.b.equals(rewardsOfferActivation.b) && Intrinsics.c(this.c, rewardsOfferActivation.c);
    }

    public final int hashCode() {
        int iB = a.b(this.f6285a.hashCode() * 31, 31, this.b);
        ActivationDetails activationDetails = this.c;
        return iB + (activationDetails == null ? 0 : activationDetails.hashCode());
    }

    public final String toString() {
        return "RewardsOfferActivation(offerFeed=" + this.f6285a + ", activatedOfferIds=" + this.b + ", activationDetails=" + this.c + ")";
    }
}
