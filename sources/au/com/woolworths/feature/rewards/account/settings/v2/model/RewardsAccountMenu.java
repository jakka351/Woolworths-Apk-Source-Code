package au.com.woolworths.feature.rewards.account.settings.v2.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/model/RewardsAccountMenu;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsAccountMenu {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5793a;
    public final List b;
    public final AccountHomeFooter c;

    public RewardsAccountMenu(Object obj, List list, AccountHomeFooter accountHomeFooter) {
        this.f5793a = obj;
        this.b = list;
        this.c = accountHomeFooter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static RewardsAccountMenu a(RewardsAccountMenu rewardsAccountMenu, ArrayList arrayList, int i) {
        Object obj = (i & 1) != 0 ? rewardsAccountMenu.f5793a : null;
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = rewardsAccountMenu.b;
        }
        return new RewardsAccountMenu(obj, arrayList2, rewardsAccountMenu.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsAccountMenu)) {
            return false;
        }
        RewardsAccountMenu rewardsAccountMenu = (RewardsAccountMenu) obj;
        return Intrinsics.c(this.f5793a, rewardsAccountMenu.f5793a) && Intrinsics.c(this.b, rewardsAccountMenu.b) && Intrinsics.c(this.c, rewardsAccountMenu.c);
    }

    public final int hashCode() {
        Object obj = this.f5793a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AccountHomeFooter accountHomeFooter = this.c;
        return iHashCode2 + (accountHomeFooter != null ? accountHomeFooter.hashCode() : 0);
    }

    public final String toString() {
        return "RewardsAccountMenu(accountBanner=" + this.f5793a + ", sections=" + this.b + ", accountHomeFooter=" + this.c + ")";
    }
}
