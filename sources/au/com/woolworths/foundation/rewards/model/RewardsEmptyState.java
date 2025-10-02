package au.com.woolworths.foundation.rewards.model;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/model/RewardsEmptyState;", "", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsEmptyState {

    /* renamed from: a, reason: collision with root package name */
    public final String f8601a;
    public final String b;
    public final String c;

    public RewardsEmptyState(String str, String str2, String str3) {
        this.f8601a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsEmptyState)) {
            return false;
        }
        RewardsEmptyState rewardsEmptyState = (RewardsEmptyState) obj;
        return Intrinsics.c(this.f8601a, rewardsEmptyState.f8601a) && Intrinsics.c(this.b, rewardsEmptyState.b) && Intrinsics.c(this.c, rewardsEmptyState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f8601a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("RewardsEmptyState(title=", this.f8601a, ", message=", this.b, ", imageUrl="), this.c, ")");
    }
}
