package au.com.woolworths.rewards.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsAccountHomeFlags;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsAccountHomeFlags {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f9799a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    public RewardsAccountHomeFlags(Optional.Present present, Optional.Present present2, Optional.Present present3, Optional.Present present4) {
        Optional.Absent absent = Optional.Absent.f13523a;
        this.f9799a = absent;
        this.b = absent;
        this.c = present;
        this.d = present2;
        this.e = present3;
        this.f = present4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsAccountHomeFlags)) {
            return false;
        }
        RewardsAccountHomeFlags rewardsAccountHomeFlags = (RewardsAccountHomeFlags) obj;
        return Intrinsics.c(this.f9799a, rewardsAccountHomeFlags.f9799a) && Intrinsics.c(this.b, rewardsAccountHomeFlags.b) && Intrinsics.c(this.c, rewardsAccountHomeFlags.c) && Intrinsics.c(this.d, rewardsAccountHomeFlags.d) && Intrinsics.c(this.e, rewardsAccountHomeFlags.e) && Intrinsics.c(this.f, rewardsAccountHomeFlags.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a.c(this.e, a.c(this.d, a.c(this.c, a.c(this.b, this.f9799a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = a.p("RewardsAccountHomeFlags(shouldShowEreceipt=", this.f9799a, ", shouldShowPushNotificationPreferences=", this.b, ", shouldShowPayTabCoachmarkTour=");
        a.x(sbP, this.c, ", shouldShowEverydayRewardsShop=", this.d, ", shouldShowAutoBoostPreferences=");
        sbP.append(this.e);
        sbP.append(", shouldShowTailoredAdPreferences=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
