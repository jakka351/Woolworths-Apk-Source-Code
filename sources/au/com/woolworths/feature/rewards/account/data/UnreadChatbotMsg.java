package au.com.woolworths.feature.rewards.account.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/UnreadChatbotMsg;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UnreadChatbotMsg {

    /* renamed from: a, reason: collision with root package name */
    public final int f5719a;

    public UnreadChatbotMsg(int i) {
        this.f5719a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnreadChatbotMsg) && this.f5719a == ((UnreadChatbotMsg) obj).f5719a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5719a);
    }

    public final String toString() {
        return a.e(this.f5719a, "UnreadChatbotMsg(count=", ")");
    }
}
