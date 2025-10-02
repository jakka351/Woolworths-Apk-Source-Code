package au.com.woolworths.feature.rewards.account.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import au.com.woolworths.sdui.common.alert.model.BasicInsetAlertModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/AccountHome;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountHome {

    /* renamed from: a, reason: collision with root package name */
    public final BasicInsetAlertModel f5697a;
    public final Object b;
    public final List c;
    public final AccountHomeFooter d;
    public final UnreadChatbotMsg e;

    public AccountHome(BasicInsetAlertModel basicInsetAlertModel, Object obj, List list, AccountHomeFooter accountHomeFooter, UnreadChatbotMsg unreadChatbotMsg) {
        this.f5697a = basicInsetAlertModel;
        this.b = obj;
        this.c = list;
        this.d = accountHomeFooter;
        this.e = unreadChatbotMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHome)) {
            return false;
        }
        AccountHome accountHome = (AccountHome) obj;
        return Intrinsics.c(this.f5697a, accountHome.f5697a) && Intrinsics.c(this.b, accountHome.b) && Intrinsics.c(this.c, accountHome.c) && Intrinsics.c(this.d, accountHome.d) && Intrinsics.c(this.e, accountHome.e);
    }

    public final int hashCode() {
        BasicInsetAlertModel basicInsetAlertModel = this.f5697a;
        int iHashCode = (basicInsetAlertModel == null ? 0 : basicInsetAlertModel.hashCode()) * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AccountHomeFooter accountHomeFooter = this.d;
        int iHashCode4 = (iHashCode3 + (accountHomeFooter == null ? 0 : accountHomeFooter.hashCode())) * 31;
        UnreadChatbotMsg unreadChatbotMsg = this.e;
        return iHashCode4 + (unreadChatbotMsg != null ? Integer.hashCode(unreadChatbotMsg.f5719a) : 0);
    }

    public final String toString() {
        return "AccountHome(appUpgrade=" + this.f5697a + ", accountBanner=" + this.b + ", sections=" + this.c + ", accountHomeFooter=" + this.d + ", unreadChatbotMsg=" + this.e + ")";
    }
}
