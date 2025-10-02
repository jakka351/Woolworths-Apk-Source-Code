package au.com.woolworths.foundation.rewards.common.ui.banners.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.foundation.rewards.common.ui.banners.analytics.RewardsBannerAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/banners/data/RewardsNotificationBannerData;", "", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsNotificationBannerData {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f8575a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final Boolean g;
    public final Boolean h;
    public final RewardsBannerAnalytics i;

    public RewardsNotificationBannerData(Integer num, long j, String str, String message, long j2, String str2, Boolean bool, Boolean bool2, RewardsBannerAnalytics rewardsBannerAnalytics) {
        Intrinsics.h(message, "message");
        this.f8575a = num;
        this.b = j;
        this.c = str;
        this.d = message;
        this.e = j2;
        this.f = str2;
        this.g = bool;
        this.h = bool2;
        this.i = rewardsBannerAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsNotificationBannerData)) {
            return false;
        }
        RewardsNotificationBannerData rewardsNotificationBannerData = (RewardsNotificationBannerData) obj;
        return Intrinsics.c(this.f8575a, rewardsNotificationBannerData.f8575a) && Color.c(this.b, rewardsNotificationBannerData.b) && Intrinsics.c(this.c, rewardsNotificationBannerData.c) && Intrinsics.c(this.d, rewardsNotificationBannerData.d) && Color.c(this.e, rewardsNotificationBannerData.e) && Intrinsics.c(this.f, rewardsNotificationBannerData.f) && Intrinsics.c(this.g, rewardsNotificationBannerData.g) && Intrinsics.c(this.h, rewardsNotificationBannerData.h) && Intrinsics.c(this.i, rewardsNotificationBannerData.i);
    }

    public final int hashCode() {
        Integer num = this.f8575a;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i = Color.l;
        int iB = b.b(iHashCode * 31, 31, this.b);
        String str = this.c;
        int iB2 = b.b(b.c((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int iHashCode2 = (iB2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        RewardsBannerAnalytics rewardsBannerAnalytics = this.i;
        return iHashCode4 + (rewardsBannerAnalytics != null ? rewardsBannerAnalytics.hashCode() : 0);
    }

    public final String toString() {
        String strI = Color.i(this.b);
        String strI2 = Color.i(this.e);
        StringBuilder sb = new StringBuilder("RewardsNotificationBannerData(iconDrawableResId=");
        sb.append(this.f8575a);
        sb.append(", backgroundTintColor=");
        sb.append(strI);
        sb.append(", title=");
        a.B(sb, this.c, ", message=", this.d, ", actionBtnTextColor=");
        a.B(sb, strI2, ", actionBtnText=", this.f, ", isCancelable=");
        sb.append(this.g);
        sb.append(", shouldShowNewBadge=");
        sb.append(this.h);
        sb.append(", analytics=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
