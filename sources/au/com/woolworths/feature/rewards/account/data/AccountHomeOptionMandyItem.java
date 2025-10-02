package au.com.woolworths.feature.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountHomeOptionMandyItem;", "Lau/com/woolworths/feature/rewards/account/data/AccountHomeOption;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountHomeOptionMandyItem implements AccountHomeOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f5711a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    public final boolean f;

    public AccountHomeOptionMandyItem(String str, String str2, String str3, Boolean bool, Boolean bool2, boolean z) {
        this.f5711a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = bool2;
        this.f = z;
    }

    public static AccountHomeOptionMandyItem d(AccountHomeOptionMandyItem accountHomeOptionMandyItem, Boolean bool, boolean z, int i) {
        Boolean bool2 = Boolean.FALSE;
        String id = accountHomeOptionMandyItem.f5711a;
        String title = accountHomeOptionMandyItem.b;
        String page = accountHomeOptionMandyItem.c;
        if ((i & 8) != 0) {
            bool2 = accountHomeOptionMandyItem.d;
        }
        Boolean bool3 = bool2;
        if ((i & 16) != 0) {
            bool = accountHomeOptionMandyItem.e;
        }
        Boolean bool4 = bool;
        accountHomeOptionMandyItem.getClass();
        if ((i & 64) != 0) {
            z = accountHomeOptionMandyItem.f;
        }
        accountHomeOptionMandyItem.getClass();
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(page, "page");
        return new AccountHomeOptionMandyItem(id, title, page, bool3, bool4, z);
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: a, reason: from getter */
    public final Boolean getD() {
        return this.d;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    public final AccountHomeOption b() {
        return d(this, null, false, 119);
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: c */
    public final boolean getF() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHomeOptionMandyItem)) {
            return false;
        }
        AccountHomeOptionMandyItem accountHomeOptionMandyItem = (AccountHomeOptionMandyItem) obj;
        return Intrinsics.c(this.f5711a, accountHomeOptionMandyItem.f5711a) && Intrinsics.c(this.b, accountHomeOptionMandyItem.b) && Intrinsics.c(this.c, accountHomeOptionMandyItem.c) && Intrinsics.c(this.d, accountHomeOptionMandyItem.d) && Intrinsics.c(this.e, accountHomeOptionMandyItem.e) && this.f == accountHomeOptionMandyItem.f;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getId, reason: from getter */
    public final String getF5711a() {
        return this.f5711a;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getTitle, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f5711a.hashCode() * 31, 31, this.b), 31, this.c);
        Boolean bool = this.d;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        return Boolean.hashCode(this.f) + b.e((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sbV = a.v("AccountHomeOptionMandyItem(id=", this.f5711a, ", title=", this.b, ", page=");
        au.com.woolworths.android.onesite.a.A(sbV, this.c, ", shouldShowNewBadge=", this.d, ", isLoading=");
        sbV.append(this.e);
        sbV.append(", isExternalLink=false, shouldShowNotificationDot=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
