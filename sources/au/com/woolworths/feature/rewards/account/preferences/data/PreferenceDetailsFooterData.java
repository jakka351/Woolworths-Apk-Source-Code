package au.com.woolworths.feature.rewards.account.preferences.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.data.RewardsWebLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/data/PreferenceDetailsFooterData;", "Lau/com/woolworths/feature/rewards/account/preferences/data/PreferenceDetailsItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceDetailsFooterData extends PreferenceDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f5748a;
    public final RewardsWebLink b;

    public PreferenceDetailsFooterData(String str, RewardsWebLink rewardsWebLink) {
        this.f5748a = str;
        this.b = rewardsWebLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceDetailsFooterData)) {
            return false;
        }
        PreferenceDetailsFooterData preferenceDetailsFooterData = (PreferenceDetailsFooterData) obj;
        return Intrinsics.c(this.f5748a, preferenceDetailsFooterData.f5748a) && Intrinsics.c(this.b, preferenceDetailsFooterData.b);
    }

    public final int hashCode() {
        String str = this.f5748a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RewardsWebLink rewardsWebLink = this.b;
        return iHashCode + (rewardsWebLink != null ? rewardsWebLink.hashCode() : 0);
    }

    public final String toString() {
        return "PreferenceDetailsFooterData(body=" + this.f5748a + ", button=" + this.b + ")";
    }
}
