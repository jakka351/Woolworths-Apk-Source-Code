package au.com.woolworths.feature.rewards.account.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/rewards/account/data/EndChatState;", "", "", UrlHandler.ACTION, "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EndChatState {

    @SerializedName(UrlHandler.ACTION)
    @Nullable
    private final String action;

    @SerializedName("enabled")
    @Nullable
    private final String enabled;

    public EndChatState(@Nullable String str, @Nullable String str2) {
        this.action = str;
        this.enabled = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final String getEnabled() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndChatState)) {
            return false;
        }
        EndChatState endChatState = (EndChatState) obj;
        return Intrinsics.c(this.action, endChatState.action) && Intrinsics.c(this.enabled, endChatState.enabled);
    }

    public final int hashCode() {
        String str = this.action;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enabled;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.j("EndChatState(action=", this.action, ", enabled=", this.enabled, ")");
    }
}
