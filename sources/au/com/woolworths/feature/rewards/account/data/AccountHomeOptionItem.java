package au.com.woolworths.feature.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountHomeOptionItem;", "Lau/com/woolworths/feature/rewards/account/data/AccountHomeOption;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountHomeOptionItem implements AccountHomeOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f5707a;
    public final String b;
    public final AccountHomeOptionAction c;
    public final Boolean d;
    public final Boolean e;
    public final boolean f;

    public AccountHomeOptionItem(String str, String str2, AccountHomeOptionAction accountHomeOptionAction, Boolean bool, Boolean bool2, boolean z) {
        this.f5707a = str;
        this.b = str2;
        this.c = accountHomeOptionAction;
        this.d = bool;
        this.e = bool2;
        this.f = z;
    }

    public static AccountHomeOptionItem d(AccountHomeOptionItem accountHomeOptionItem, Boolean bool, int i) {
        Boolean bool2 = Boolean.FALSE;
        String id = accountHomeOptionItem.f5707a;
        String title = accountHomeOptionItem.b;
        AccountHomeOptionAction action = accountHomeOptionItem.c;
        if ((i & 8) != 0) {
            bool2 = accountHomeOptionItem.d;
        }
        Boolean bool3 = bool2;
        if ((i & 16) != 0) {
            bool = accountHomeOptionItem.e;
        }
        boolean z = accountHomeOptionItem.f;
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(action, "action");
        return new AccountHomeOptionItem(id, title, action, bool3, bool, z);
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: a, reason: from getter */
    public final Boolean getD() {
        return this.d;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    public final AccountHomeOption b() {
        return d(this, null, 55);
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: c, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHomeOptionItem)) {
            return false;
        }
        AccountHomeOptionItem accountHomeOptionItem = (AccountHomeOptionItem) obj;
        return Intrinsics.c(this.f5707a, accountHomeOptionItem.f5707a) && Intrinsics.c(this.b, accountHomeOptionItem.b) && Intrinsics.c(this.c, accountHomeOptionItem.c) && Intrinsics.c(this.d, accountHomeOptionItem.d) && Intrinsics.c(this.e, accountHomeOptionItem.e) && this.f == accountHomeOptionItem.f;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getId, reason: from getter */
    public final String getF5707a() {
        return this.f5707a;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getTitle, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + b.c(this.f5707a.hashCode() * 31, 31, this.b)) * 31;
        Boolean bool = this.d;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("AccountHomeOptionItem(id=", this.f5707a, ", title=", this.b, ", action=");
        sbV.append(this.c);
        sbV.append(", shouldShowNewBadge=");
        sbV.append(this.d);
        sbV.append(", isLoading=");
        sbV.append(this.e);
        sbV.append(", isExternalLink=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }

    public AccountHomeOptionItem(String str, String str2, AccountHomeOptionAction accountHomeOptionAction, Boolean bool, boolean z, int i) {
        this(str, str2, accountHomeOptionAction, bool, Boolean.FALSE, (i & 32) != 0 ? accountHomeOptionAction.f5702a == HomeOptionAction.d : z);
    }
}
