package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.data.RewardsBalanceData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsHomePage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsHomePage {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsBalanceData f6284a;

    public RewardsHomePage(RewardsBalanceData rewardsBalanceData) {
        this.f6284a = rewardsBalanceData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsHomePage) && Intrinsics.c(this.f6284a, ((RewardsHomePage) obj).f6284a);
    }

    public final int hashCode() {
        RewardsBalanceData rewardsBalanceData = this.f6284a;
        if (rewardsBalanceData == null) {
            return 0;
        }
        return rewardsBalanceData.hashCode();
    }

    public final String toString() {
        return "RewardsHomePage(balance=" + this.f6284a + ")";
    }
}
