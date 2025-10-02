package au.com.woolworths.feature.rewards.account.preferences.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/data/PreferenceDetailsToggleGroupData;", "Lau/com/woolworths/feature/rewards/account/preferences/data/PreferenceDetailsItem;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceDetailsToggleGroupData extends PreferenceDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f5751a;
    public final String b;
    public final Object c;

    public PreferenceDetailsToggleGroupData(String str, String str2, List list) {
        this.f5751a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceDetailsToggleGroupData)) {
            return false;
        }
        PreferenceDetailsToggleGroupData preferenceDetailsToggleGroupData = (PreferenceDetailsToggleGroupData) obj;
        return Intrinsics.c(this.f5751a, preferenceDetailsToggleGroupData.f5751a) && Intrinsics.c(this.b, preferenceDetailsToggleGroupData.b) && this.c.equals(preferenceDetailsToggleGroupData.c);
    }

    public final int hashCode() {
        String str = this.f5751a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return a.o(this.c, ")", YU.a.v("PreferenceDetailsToggleGroupData(groupTitle=", this.f5751a, ", description=", this.b, ", toggles="));
    }
}
