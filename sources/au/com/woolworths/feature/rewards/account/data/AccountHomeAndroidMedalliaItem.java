package au.com.woolworths.feature.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountHomeAndroidMedalliaItem;", "Lau/com/woolworths/feature/rewards/account/data/AccountHomeOption;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountHomeAndroidMedalliaItem implements AccountHomeOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f5699a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    public final boolean f;

    public AccountHomeAndroidMedalliaItem(String str, String str2, String str3, Boolean bool, Boolean bool2, boolean z) {
        this.f5699a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = bool2;
        this.f = z;
    }

    public static AccountHomeAndroidMedalliaItem d(AccountHomeAndroidMedalliaItem accountHomeAndroidMedalliaItem, Boolean bool, int i) {
        Boolean bool2 = Boolean.FALSE;
        String id = accountHomeAndroidMedalliaItem.f5699a;
        String title = accountHomeAndroidMedalliaItem.b;
        String formId = accountHomeAndroidMedalliaItem.c;
        if ((i & 8) != 0) {
            bool2 = accountHomeAndroidMedalliaItem.d;
        }
        Boolean bool3 = bool2;
        if ((i & 16) != 0) {
            bool = accountHomeAndroidMedalliaItem.e;
        }
        boolean z = accountHomeAndroidMedalliaItem.f;
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(formId, "formId");
        return new AccountHomeAndroidMedalliaItem(id, title, formId, bool3, bool, z);
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
        if (!(obj instanceof AccountHomeAndroidMedalliaItem)) {
            return false;
        }
        AccountHomeAndroidMedalliaItem accountHomeAndroidMedalliaItem = (AccountHomeAndroidMedalliaItem) obj;
        return Intrinsics.c(this.f5699a, accountHomeAndroidMedalliaItem.f5699a) && Intrinsics.c(this.b, accountHomeAndroidMedalliaItem.b) && Intrinsics.c(this.c, accountHomeAndroidMedalliaItem.c) && Intrinsics.c(this.d, accountHomeAndroidMedalliaItem.d) && Intrinsics.c(this.e, accountHomeAndroidMedalliaItem.e) && this.f == accountHomeAndroidMedalliaItem.f;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getId, reason: from getter */
    public final String getF5698a() {
        return this.f5699a;
    }

    @Override // au.com.woolworths.feature.rewards.account.data.AccountHomeOption
    /* renamed from: getTitle, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f5699a.hashCode() * 31, 31, this.b), 31, this.c);
        Boolean bool = this.d;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("AccountHomeAndroidMedalliaItem(id=", this.f5699a, ", title=", this.b, ", formId=");
        au.com.woolworths.android.onesite.a.A(sbV, this.c, ", shouldShowNewBadge=", this.d, ", isLoading=");
        sbV.append(this.e);
        sbV.append(", isExternalLink=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
