package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsOffersMessage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsOffersMessage {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsEmptyStateIcon f6294a;
    public final String b;
    public final String c;

    public RewardsOffersMessage(RewardsEmptyStateIcon icon, String str, String str2) {
        Intrinsics.h(icon, "icon");
        this.f6294a = icon;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOffersMessage)) {
            return false;
        }
        RewardsOffersMessage rewardsOffersMessage = (RewardsOffersMessage) obj;
        return this.f6294a == rewardsOffersMessage.f6294a && Intrinsics.c(this.b, rewardsOffersMessage.b) && Intrinsics.c(this.c, rewardsOffersMessage.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f6294a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardsOffersMessage(icon=");
        sb.append(this.f6294a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", message=");
        return a.o(sb, this.c, ")");
    }
}
