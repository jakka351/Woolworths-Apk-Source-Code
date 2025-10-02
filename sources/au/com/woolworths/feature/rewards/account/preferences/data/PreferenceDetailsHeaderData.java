package au.com.woolworths.feature.rewards.account.preferences.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/data/PreferenceDetailsHeaderData;", "Lau/com/woolworths/feature/rewards/account/preferences/data/PreferenceDetailsItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceDetailsHeaderData extends PreferenceDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f5749a;
    public final String b;
    public final String c;
    public final String d;

    public PreferenceDetailsHeaderData(String str, String str2, String str3, String str4) {
        this.f5749a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceDetailsHeaderData)) {
            return false;
        }
        PreferenceDetailsHeaderData preferenceDetailsHeaderData = (PreferenceDetailsHeaderData) obj;
        return Intrinsics.c(this.f5749a, preferenceDetailsHeaderData.f5749a) && Intrinsics.c(this.b, preferenceDetailsHeaderData.b) && Intrinsics.c(this.c, preferenceDetailsHeaderData.c) && Intrinsics.c(this.d, preferenceDetailsHeaderData.d);
    }

    public final int hashCode() {
        String str = this.f5749a;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return a.l(YU.a.v("PreferenceDetailsHeaderData(imageUrl=", this.f5749a, ", title=", this.b, ", subtitle="), this.c, ", body=", this.d, ")");
    }
}
