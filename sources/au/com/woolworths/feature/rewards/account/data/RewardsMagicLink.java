package au.com.woolworths.feature.rewards.account.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/RewardsMagicLink;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsMagicLink {

    /* renamed from: a, reason: collision with root package name */
    public final String f5718a;
    public final Map b;
    public final String c;

    public RewardsMagicLink(String str, Map headers, String str2) {
        Intrinsics.h(headers, "headers");
        this.f5718a = str;
        this.b = headers;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsMagicLink)) {
            return false;
        }
        RewardsMagicLink rewardsMagicLink = (RewardsMagicLink) obj;
        return Intrinsics.c(this.f5718a, rewardsMagicLink.f5718a) && Intrinsics.c(this.b, rewardsMagicLink.b) && Intrinsics.c(this.c, rewardsMagicLink.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + d.d(this.b, this.f5718a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardsMagicLink(url=");
        sb.append(this.f5718a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", label=");
        return a.o(sb, this.c, ")");
    }
}
