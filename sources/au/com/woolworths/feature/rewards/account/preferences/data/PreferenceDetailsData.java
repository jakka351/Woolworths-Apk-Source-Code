package au.com.woolworths.feature.rewards.account.preferences.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/data/PreferenceDetailsData;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceDetailsData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5747a;
    public final Object b;
    public final String c;

    public PreferenceDetailsData(String str, List list, String str2) {
        this.f5747a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceDetailsData)) {
            return false;
        }
        PreferenceDetailsData preferenceDetailsData = (PreferenceDetailsData) obj;
        return Intrinsics.c(this.f5747a, preferenceDetailsData.f5747a) && this.b.equals(preferenceDetailsData.b) && Intrinsics.c(this.c, preferenceDetailsData.c);
    }

    public final int hashCode() {
        String str = this.f5747a;
        int iE = a.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreferenceDetailsData(title=");
        sb.append(this.f5747a);
        sb.append(", details=");
        sb.append(this.b);
        sb.append(", message=");
        return YU.a.o(sb, this.c, ")");
    }
}
