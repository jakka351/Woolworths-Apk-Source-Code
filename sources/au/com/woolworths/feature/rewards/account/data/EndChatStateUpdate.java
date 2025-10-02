package au.com.woolworths.feature.rewards.account.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/EndChatStateUpdate;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EndChatStateUpdate {

    /* renamed from: a, reason: collision with root package name */
    public final EndChatAction f5717a;
    public final boolean b;

    public EndChatStateUpdate(EndChatAction action, boolean z) {
        Intrinsics.h(action, "action");
        this.f5717a = action;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndChatStateUpdate)) {
            return false;
        }
        EndChatStateUpdate endChatStateUpdate = (EndChatStateUpdate) obj;
        return this.f5717a == endChatStateUpdate.f5717a && this.b == endChatStateUpdate.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f5717a.hashCode() * 31);
    }

    public final String toString() {
        return "EndChatStateUpdate(action=" + this.f5717a + ", enabled=" + this.b + ")";
    }
}
