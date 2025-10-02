package au.com.woolworths.feature.rewards.account.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountHomeSection;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountHomeSection {

    /* renamed from: a, reason: collision with root package name */
    public final String f5712a;
    public final List b;

    public AccountHomeSection(String str, List list) {
        this.f5712a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHomeSection)) {
            return false;
        }
        AccountHomeSection accountHomeSection = (AccountHomeSection) obj;
        return Intrinsics.c(this.f5712a, accountHomeSection.f5712a) && Intrinsics.c(this.b, accountHomeSection.b);
    }

    public final int hashCode() {
        int iHashCode = this.f5712a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return a.i("AccountHomeSection(title=", this.f5712a, ", options=", ")", this.b);
    }
}
