package au.com.woolworths.feature.rewards.account.settings.v2.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/model/AccountMenuSection;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountMenuSection {

    /* renamed from: a, reason: collision with root package name */
    public final String f5792a;
    public final List b;

    public AccountMenuSection(String str, List items) {
        Intrinsics.h(items, "items");
        this.f5792a = str;
        this.b = items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountMenuSection)) {
            return false;
        }
        AccountMenuSection accountMenuSection = (AccountMenuSection) obj;
        return Intrinsics.c(this.f5792a, accountMenuSection.f5792a) && Intrinsics.c(this.b, accountMenuSection.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5792a.hashCode() * 31);
    }

    public final String toString() {
        return a.i("AccountMenuSection(title=", this.f5792a, ", items=", ")", this.b);
    }
}
