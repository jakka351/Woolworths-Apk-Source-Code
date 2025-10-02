package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/data/RewardsSecurePreference;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsSecurePreference {

    /* renamed from: a, reason: collision with root package name */
    public final String f6465a;
    public final String b;
    public final ArrayList c;
    public final PreferenceToggleData d;
    public final RewardsSecurePreferenceLoadingState e;

    public RewardsSecurePreference(String str, String str2, ArrayList arrayList, PreferenceToggleData preferenceToggleData, RewardsSecurePreferenceLoadingState rewardsSecurePreferenceLoadingState) {
        this.f6465a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = preferenceToggleData;
        this.e = rewardsSecurePreferenceLoadingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsSecurePreference)) {
            return false;
        }
        RewardsSecurePreference rewardsSecurePreference = (RewardsSecurePreference) obj;
        return this.f6465a.equals(rewardsSecurePreference.f6465a) && this.b.equals(rewardsSecurePreference.b) && this.c.equals(rewardsSecurePreference.c) && this.d.equals(rewardsSecurePreference.d) && this.e.equals(rewardsSecurePreference.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + a.b(b.c(this.f6465a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("RewardsSecurePreference(title=", this.f6465a, ", summary=", this.b, ", infoItems=");
        sbV.append(this.c);
        sbV.append(", securePreference=");
        sbV.append(this.d);
        sbV.append(", loadingState=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}
