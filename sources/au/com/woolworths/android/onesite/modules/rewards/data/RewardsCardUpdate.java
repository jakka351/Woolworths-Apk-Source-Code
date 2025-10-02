package au.com.woolworths.android.onesite.modules.rewards.data;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardUpdate;", "", "", "number", "displayCardNumber", "displayName", "ccv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "c", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsCardUpdate {

    @SerializedName("ccv")
    @Nullable
    private final String ccv;

    @SerializedName("displayCardNumber")
    @NotNull
    private final String displayCardNumber;

    @SerializedName("displayName")
    @NotNull
    private final String displayName;

    @SerializedName("cardNumber")
    @NotNull
    private final String number;

    public RewardsCardUpdate(@NotNull String number, @NotNull String displayCardNumber, @NotNull String displayName, @Nullable String str) {
        Intrinsics.h(number, "number");
        Intrinsics.h(displayCardNumber, "displayCardNumber");
        Intrinsics.h(displayName, "displayName");
        this.number = number;
        this.displayCardNumber = displayCardNumber;
        this.displayName = displayName;
        this.ccv = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getCcv() {
        return this.ccv;
    }

    /* renamed from: b, reason: from getter */
    public final String getDisplayCardNumber() {
        return this.displayCardNumber;
    }

    /* renamed from: c, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: d, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCardUpdate)) {
            return false;
        }
        RewardsCardUpdate rewardsCardUpdate = (RewardsCardUpdate) obj;
        return Intrinsics.c(this.number, rewardsCardUpdate.number) && Intrinsics.c(this.displayCardNumber, rewardsCardUpdate.displayCardNumber) && Intrinsics.c(this.displayName, rewardsCardUpdate.displayName) && Intrinsics.c(this.ccv, rewardsCardUpdate.ccv);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.number.hashCode() * 31, 31, this.displayCardNumber), 31, this.displayName);
        String str = this.ccv;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.number;
        String str2 = this.displayCardNumber;
        return a.l(YU.a.v("RewardsCardUpdate(number=", str, ", displayCardNumber=", str2, ", displayName="), this.displayName, ", ccv=", this.ccv, ")");
    }
}
