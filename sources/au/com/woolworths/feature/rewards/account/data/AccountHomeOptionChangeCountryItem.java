package au.com.woolworths.feature.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountHomeOptionChangeCountryItem;", "Lau/com/woolworths/feature/rewards/account/data/AccountHomeOption;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountHomeOptionChangeCountryItem implements AccountHomeOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f5704a;
    public final String b;
    public final Boolean c;
    public final Boolean d;
    public final boolean e;

    public AccountHomeOptionChangeCountryItem(String str, String str2, Boolean bool, Boolean bool2, boolean z) {
        this.f5704a = str;
        this.b = str2;
        this.c = bool;
        this.d = bool2;
        this.e = z;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: a, reason: from getter */
    public final Boolean getD() {
        return this.c;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    public final AccountHomeOption b() {
        Boolean bool = Boolean.FALSE;
        String id = this.f5704a;
        Intrinsics.h(id, "id");
        String title = this.b;
        Intrinsics.h(title, "title");
        return new AccountHomeOptionChangeCountryItem(id, title, bool, this.d, this.e);
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: c, reason: from getter */
    public final boolean getF() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHomeOptionChangeCountryItem)) {
            return false;
        }
        AccountHomeOptionChangeCountryItem accountHomeOptionChangeCountryItem = (AccountHomeOptionChangeCountryItem) obj;
        return Intrinsics.c(this.f5704a, accountHomeOptionChangeCountryItem.f5704a) && Intrinsics.c(this.b, accountHomeOptionChangeCountryItem.b) && Intrinsics.c(this.c, accountHomeOptionChangeCountryItem.c) && Intrinsics.c(this.d, accountHomeOptionChangeCountryItem.d) && this.e == accountHomeOptionChangeCountryItem.e;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getId, reason: from getter */
    public final String getF5701a() {
        return this.f5704a;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getTitle, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iC = b.c(this.f5704a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("AccountHomeOptionChangeCountryItem(id=", this.f5704a, ", title=", this.b, ", shouldShowNewBadge=");
        sbV.append(this.c);
        sbV.append(", isLoading=");
        sbV.append(this.d);
        sbV.append(", isExternalLink=");
        return a.k(")", sbV, this.e);
    }
}
