package au.com.woolworths.android.onesite.modules.rewards;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/RewardsPointsBalance;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsPointsBalance {

    /* renamed from: a, reason: collision with root package name */
    public final int f4393a;
    public final double b;
    public final String c;
    public final boolean d;
    public final String e;
    public final Integer f;

    public RewardsPointsBalance(int i, double d, String str, boolean z, String str2, Integer num) {
        this.f4393a = i;
        this.b = d;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsPointsBalance)) {
            return false;
        }
        RewardsPointsBalance rewardsPointsBalance = (RewardsPointsBalance) obj;
        return this.f4393a == rewardsPointsBalance.f4393a && Double.compare(this.b, rewardsPointsBalance.b) == 0 && Intrinsics.c(this.c, rewardsPointsBalance.c) && this.d == rewardsPointsBalance.d && Intrinsics.c(this.e, rewardsPointsBalance.e) && Intrinsics.c(this.f, rewardsPointsBalance.f);
    }

    public final int hashCode() {
        int iA = a.a(this.b, Integer.hashCode(this.f4393a) * 31, 31);
        String str = this.c;
        int iE = b.e((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "RewardsPointsBalance(points=" + this.f4393a + ", redemptionPercentage=" + this.b + ", tooltipMessage=" + this.c + ", showStatusMark=" + this.d + ", statusMarkIconUrl=" + this.e + ", credits=" + this.f + ")";
    }
}
