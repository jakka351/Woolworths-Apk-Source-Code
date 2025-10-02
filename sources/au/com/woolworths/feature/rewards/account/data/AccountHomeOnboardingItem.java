package au.com.woolworths.feature.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Deprecated
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountHomeOnboardingItem;", "Lau/com/woolworths/feature/rewards/account/data/AccountHomeOption;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountHomeOnboardingItem implements AccountHomeOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f5701a;
    public final String b;
    public final AccountHomeOptionAction c;
    public final Boolean d;
    public final Boolean e;
    public final boolean f;

    public AccountHomeOnboardingItem(String id, String title, AccountHomeOptionAction action, Boolean bool, Boolean bool2, boolean z) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(action, "action");
        this.f5701a = id;
        this.b = title;
        this.c = action;
        this.d = bool;
        this.e = bool2;
        this.f = z;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: a, reason: from getter */
    public final Boolean getD() {
        return this.d;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    public final AccountHomeOption b() {
        Boolean bool = Boolean.FALSE;
        String id = this.f5701a;
        Intrinsics.h(id, "id");
        String title = this.b;
        Intrinsics.h(title, "title");
        AccountHomeOptionAction action = this.c;
        Intrinsics.h(action, "action");
        return new AccountHomeOnboardingItem(id, title, action, bool, this.e, this.f);
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
        if (!(obj instanceof AccountHomeOnboardingItem)) {
            return false;
        }
        AccountHomeOnboardingItem accountHomeOnboardingItem = (AccountHomeOnboardingItem) obj;
        return Intrinsics.c(this.f5701a, accountHomeOnboardingItem.f5701a) && Intrinsics.c(this.b, accountHomeOnboardingItem.b) && Intrinsics.c(this.c, accountHomeOnboardingItem.c) && Intrinsics.c(this.d, accountHomeOnboardingItem.d) && Intrinsics.c(this.e, accountHomeOnboardingItem.e) && this.f == accountHomeOnboardingItem.f;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getId, reason: from getter */
    public final String getF5707a() {
        return this.f5701a;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getTitle, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + b.c(this.f5701a.hashCode() * 31, 31, this.b)) * 31;
        Boolean bool = this.d;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("AccountHomeOnboardingItem(id=", this.f5701a, ", title=", this.b, ", action=");
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

    public AccountHomeOnboardingItem(String str, String str2, AccountHomeOptionAction accountHomeOptionAction, Boolean bool) {
        this(str, str2, accountHomeOptionAction, bool, Boolean.FALSE, accountHomeOptionAction.f5702a == HomeOptionAction.d);
    }
}
