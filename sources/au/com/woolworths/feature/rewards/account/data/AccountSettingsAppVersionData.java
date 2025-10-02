package au.com.woolworths.feature.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountSettingsAppVersionData;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountSettingsAppVersionData {

    /* renamed from: a, reason: collision with root package name */
    public final int f5714a;
    public final String b;
    public final String c;

    public AccountSettingsAppVersionData(int i, String str, String str2) {
        this.f5714a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSettingsAppVersionData)) {
            return false;
        }
        AccountSettingsAppVersionData accountSettingsAppVersionData = (AccountSettingsAppVersionData) obj;
        return this.f5714a == accountSettingsAppVersionData.f5714a && Intrinsics.c(this.b, accountSettingsAppVersionData.b) && Intrinsics.c(this.c, accountSettingsAppVersionData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(Integer.hashCode(this.f5714a) * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(androidx.constraintlayout.core.state.a.p("AccountSettingsAppVersionData(year=", this.f5714a, ", versionNumber=", this.b, ", buildNumber="), this.c, ")");
    }
}
