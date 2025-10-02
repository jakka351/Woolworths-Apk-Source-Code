package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/data/RewardsSecurePreferenceLoadingState;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsSecurePreferenceLoadingState {

    /* renamed from: a, reason: collision with root package name */
    public final String f6466a;
    public final String b;

    public RewardsSecurePreferenceLoadingState(String str, String str2) {
        this.f6466a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsSecurePreferenceLoadingState)) {
            return false;
        }
        RewardsSecurePreferenceLoadingState rewardsSecurePreferenceLoadingState = (RewardsSecurePreferenceLoadingState) obj;
        return Intrinsics.c(this.f6466a, rewardsSecurePreferenceLoadingState.f6466a) && Intrinsics.c(this.b, rewardsSecurePreferenceLoadingState.b);
    }

    public final int hashCode() {
        String str = this.f6466a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.j("RewardsSecurePreferenceLoadingState(title=", this.f6466a, ", label=", this.b, ")");
    }
}
