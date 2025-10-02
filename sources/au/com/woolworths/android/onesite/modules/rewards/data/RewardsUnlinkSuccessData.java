package au.com.woolworths.android.onesite.modules.rewards.data;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsUnlinkSuccessData;", "", "", "status", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RewardsUnlinkSuccessData {

    @SerializedName("status")
    @Nullable
    private final String status;

    public RewardsUnlinkSuccessData(@Nullable String str) {
        this.status = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsUnlinkSuccessData) && Intrinsics.c(this.status, ((RewardsUnlinkSuccessData) obj).status);
    }

    public final int hashCode() {
        String str = this.status;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.h("RewardsUnlinkSuccessData(status=", this.status, ")");
    }
}
