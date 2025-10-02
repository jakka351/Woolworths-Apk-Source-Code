package au.com.woolworths.feature.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountHomeOptionCanCloseAccountItem;", "Lau/com/woolworths/feature/rewards/account/data/AccountHomeOption;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountHomeOptionCanCloseAccountItem implements AccountHomeOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f5703a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final boolean g;

    public AccountHomeOptionCanCloseAccountItem(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, boolean z) {
        this.f5703a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
        this.f = bool2;
        this.g = z;
    }

    public static AccountHomeOptionCanCloseAccountItem d(AccountHomeOptionCanCloseAccountItem accountHomeOptionCanCloseAccountItem, Boolean bool, int i) {
        Boolean bool2 = Boolean.FALSE;
        String id = accountHomeOptionCanCloseAccountItem.f5703a;
        String title = accountHomeOptionCanCloseAccountItem.b;
        String page = accountHomeOptionCanCloseAccountItem.c;
        String callbackUrl = accountHomeOptionCanCloseAccountItem.d;
        if ((i & 16) != 0) {
            bool2 = accountHomeOptionCanCloseAccountItem.e;
        }
        Boolean bool3 = bool2;
        if ((i & 32) != 0) {
            bool = accountHomeOptionCanCloseAccountItem.f;
        }
        boolean z = accountHomeOptionCanCloseAccountItem.g;
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(page, "page");
        Intrinsics.h(callbackUrl, "callbackUrl");
        return new AccountHomeOptionCanCloseAccountItem(id, title, page, callbackUrl, bool3, bool, z);
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: a, reason: from getter */
    public final Boolean getE() {
        return this.e;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    public final AccountHomeOption b() {
        return d(this, null, 111);
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: c, reason: from getter */
    public final boolean getG() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHomeOptionCanCloseAccountItem)) {
            return false;
        }
        AccountHomeOptionCanCloseAccountItem accountHomeOptionCanCloseAccountItem = (AccountHomeOptionCanCloseAccountItem) obj;
        return Intrinsics.c(this.f5703a, accountHomeOptionCanCloseAccountItem.f5703a) && Intrinsics.c(this.b, accountHomeOptionCanCloseAccountItem.b) && Intrinsics.c(this.c, accountHomeOptionCanCloseAccountItem.c) && Intrinsics.c(this.d, accountHomeOptionCanCloseAccountItem.d) && Intrinsics.c(this.e, accountHomeOptionCanCloseAccountItem.e) && Intrinsics.c(this.f, accountHomeOptionCanCloseAccountItem.f) && this.g == accountHomeOptionCanCloseAccountItem.g;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getId, reason: from getter */
    public final String getF5703a() {
        return this.f5703a;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getTitle, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(this.f5703a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Boolean bool = this.e;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("AccountHomeOptionCanCloseAccountItem(id=", this.f5703a, ", title=", this.b, ", page=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", callbackUrl=", this.d, ", shouldShowNewBadge=");
        sbV.append(this.e);
        sbV.append(", isLoading=");
        sbV.append(this.f);
        sbV.append(", isExternalLink=");
        return a.k(")", sbV, this.g);
    }
}
