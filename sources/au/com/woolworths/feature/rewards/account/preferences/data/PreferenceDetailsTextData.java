package au.com.woolworths.feature.rewards.account.preferences.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/data/PreferenceDetailsTextData;", "Lau/com/woolworths/feature/rewards/account/preferences/data/PreferenceDetailsItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceDetailsTextData extends PreferenceDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f5750a;
    public final String b;

    public PreferenceDetailsTextData(String str, String str2) {
        this.f5750a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceDetailsTextData)) {
            return false;
        }
        PreferenceDetailsTextData preferenceDetailsTextData = (PreferenceDetailsTextData) obj;
        return Intrinsics.c(this.f5750a, preferenceDetailsTextData.f5750a) && Intrinsics.c(this.b, preferenceDetailsTextData.b);
    }

    public final int hashCode() {
        String str = this.f5750a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.j("PreferenceDetailsTextData(body=", this.f5750a, ", altText=", this.b, ")");
    }
}
