package au.com.woolworths.feature.rewards.account.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountHomeOptionAction;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountHomeOptionAction {

    /* renamed from: a, reason: collision with root package name */
    public final HomeOptionAction f5702a;
    public final String b;

    public AccountHomeOptionAction(HomeOptionAction homeOptionAction, String url) {
        Intrinsics.h(url, "url");
        this.f5702a = homeOptionAction;
        this.b = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHomeOptionAction)) {
            return false;
        }
        AccountHomeOptionAction accountHomeOptionAction = (AccountHomeOptionAction) obj;
        return this.f5702a == accountHomeOptionAction.f5702a && Intrinsics.c(this.b, accountHomeOptionAction.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5702a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountHomeOptionAction(action=" + this.f5702a + ", url=" + this.b + ")";
    }
}
