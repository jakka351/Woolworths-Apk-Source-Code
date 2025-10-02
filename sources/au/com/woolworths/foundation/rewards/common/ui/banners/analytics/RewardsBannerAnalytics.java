package au.com.woolworths.foundation.rewards.common.ui.banners.analytics;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/banners/analytics/RewardsBannerAnalytics;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsBannerAnalytics {

    /* renamed from: a, reason: collision with root package name */
    public final String f8573a;
    public final String b;

    public RewardsBannerAnalytics(String str, String str2) {
        this.f8573a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsBannerAnalytics)) {
            return false;
        }
        RewardsBannerAnalytics rewardsBannerAnalytics = (RewardsBannerAnalytics) obj;
        return Intrinsics.c(this.f8573a, rewardsBannerAnalytics.f8573a) && Intrinsics.c(this.b, rewardsBannerAnalytics.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8573a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("RewardsBannerAnalytics(eventCategory=", this.f8573a, ", eventDescription=", this.b, ")");
    }
}
