package au.com.woolworths.android.onesite.modules.rewards.data;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.network.Component;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenData;", "", "", "refreshToken", "", "refreshTokenExpiresIn", "accessToken", "accessTokenExpiresIn", "Lau/com/woolworths/android/onesite/network/Component;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardUpdate;", "rewardsCardUpdate", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLau/com/woolworths/android/onesite/network/Component;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/lang/Long;", "getRefreshTokenExpiresIn", "()Ljava/lang/Long;", "a", "J", "b", "()J", "Lau/com/woolworths/android/onesite/network/Component;", "d", "()Lau/com/woolworths/android/onesite/network/Component;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RewardsTokenData {

    @SerializedName("accessToken")
    @NotNull
    private final String accessToken;

    @SerializedName("accessTokenExpiresIn")
    private final long accessTokenExpiresIn;

    @SerializedName("refreshToken")
    @Nullable
    private final String refreshToken;

    @SerializedName("refreshTokenExpiresIn")
    @Nullable
    private final Long refreshTokenExpiresIn;

    @SerializedName("rewardsCardUpdate")
    @Nullable
    private final Component<RewardsCardUpdate> rewardsCardUpdate;

    public RewardsTokenData(@Nullable String str, @Nullable Long l, @NotNull String accessToken, long j, @Nullable Component<RewardsCardUpdate> component) {
        Intrinsics.h(accessToken, "accessToken");
        this.refreshToken = str;
        this.refreshTokenExpiresIn = l;
        this.accessToken = accessToken;
        this.accessTokenExpiresIn = j;
        this.rewardsCardUpdate = component;
    }

    /* renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: b, reason: from getter */
    public final long getAccessTokenExpiresIn() {
        return this.accessTokenExpiresIn;
    }

    /* renamed from: c, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: d, reason: from getter */
    public final Component getRewardsCardUpdate() {
        return this.rewardsCardUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsTokenData)) {
            return false;
        }
        RewardsTokenData rewardsTokenData = (RewardsTokenData) obj;
        return Intrinsics.c(this.refreshToken, rewardsTokenData.refreshToken) && Intrinsics.c(this.refreshTokenExpiresIn, rewardsTokenData.refreshTokenExpiresIn) && Intrinsics.c(this.accessToken, rewardsTokenData.accessToken) && this.accessTokenExpiresIn == rewardsTokenData.accessTokenExpiresIn && Intrinsics.c(this.rewardsCardUpdate, rewardsTokenData.rewardsCardUpdate);
    }

    public final int hashCode() {
        String str = this.refreshToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.refreshTokenExpiresIn;
        int iB = b.b(b.c((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.accessToken), 31, this.accessTokenExpiresIn);
        Component<RewardsCardUpdate> component = this.rewardsCardUpdate;
        return iB + (component != null ? component.hashCode() : 0);
    }

    public final String toString() {
        return "RewardsTokenData(refreshToken=" + this.refreshToken + ", refreshTokenExpiresIn=" + this.refreshTokenExpiresIn + ", accessToken=" + this.accessToken + ", accessTokenExpiresIn=" + this.accessTokenExpiresIn + ", rewardsCardUpdate=" + this.rewardsCardUpdate + ")";
    }
}
