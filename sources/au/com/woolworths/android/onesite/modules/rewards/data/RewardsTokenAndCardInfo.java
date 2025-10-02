package au.com.woolworths.android.onesite.modules.rewards.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenAndCardInfo;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsTokenAndCardInfo {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsTokenInfo f4399a;
    public final RewardsCardUpdate b;

    public RewardsTokenAndCardInfo(RewardsTokenInfo rewardsTokenInfo, RewardsCardUpdate rewardsCardUpdate) {
        this.f4399a = rewardsTokenInfo;
        this.b = rewardsCardUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsTokenAndCardInfo)) {
            return false;
        }
        RewardsTokenAndCardInfo rewardsTokenAndCardInfo = (RewardsTokenAndCardInfo) obj;
        return Intrinsics.c(this.f4399a, rewardsTokenAndCardInfo.f4399a) && Intrinsics.c(this.b, rewardsTokenAndCardInfo.b);
    }

    public final int hashCode() {
        int iHashCode = this.f4399a.hashCode() * 31;
        RewardsCardUpdate rewardsCardUpdate = this.b;
        return iHashCode + (rewardsCardUpdate == null ? 0 : rewardsCardUpdate.hashCode());
    }

    public final String toString() {
        return "RewardsTokenAndCardInfo(tokenInfo=" + this.f4399a + ", card=" + this.b + ")";
    }
}
