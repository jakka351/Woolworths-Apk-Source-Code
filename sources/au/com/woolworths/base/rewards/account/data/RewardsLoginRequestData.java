package au.com.woolworths.base.rewards.account.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsLoginRequestData;", "", "authCode", "", "sessionToken", "deviceId", "region", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthCode", "()Ljava/lang/String;", "getSessionToken", "getDeviceId", "getRegion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RewardsLoginRequestData {
    public static final int $stable = 0;

    @SerializedName("authCode")
    @NotNull
    private final String authCode;

    @SerializedName("deviceId")
    @NotNull
    private final String deviceId;

    @SerializedName("region")
    @Nullable
    private final String region;

    @SerializedName("sessionToken")
    @NotNull
    private final String sessionToken;

    public RewardsLoginRequestData(@NotNull String authCode, @NotNull String sessionToken, @NotNull String deviceId, @Nullable String str) {
        Intrinsics.h(authCode, "authCode");
        Intrinsics.h(sessionToken, "sessionToken");
        Intrinsics.h(deviceId, "deviceId");
        this.authCode = authCode;
        this.sessionToken = sessionToken;
        this.deviceId = deviceId;
        this.region = str;
    }

    public static /* synthetic */ RewardsLoginRequestData copy$default(RewardsLoginRequestData rewardsLoginRequestData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsLoginRequestData.authCode;
        }
        if ((i & 2) != 0) {
            str2 = rewardsLoginRequestData.sessionToken;
        }
        if ((i & 4) != 0) {
            str3 = rewardsLoginRequestData.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = rewardsLoginRequestData.region;
        }
        return rewardsLoginRequestData.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final RewardsLoginRequestData copy(@NotNull String authCode, @NotNull String sessionToken, @NotNull String deviceId, @Nullable String region) {
        Intrinsics.h(authCode, "authCode");
        Intrinsics.h(sessionToken, "sessionToken");
        Intrinsics.h(deviceId, "deviceId");
        return new RewardsLoginRequestData(authCode, sessionToken, deviceId, region);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsLoginRequestData)) {
            return false;
        }
        RewardsLoginRequestData rewardsLoginRequestData = (RewardsLoginRequestData) other;
        return Intrinsics.c(this.authCode, rewardsLoginRequestData.authCode) && Intrinsics.c(this.sessionToken, rewardsLoginRequestData.sessionToken) && Intrinsics.c(this.deviceId, rewardsLoginRequestData.deviceId) && Intrinsics.c(this.region, rewardsLoginRequestData.region);
    }

    @NotNull
    public final String getAuthCode() {
        return this.authCode;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        int iC = b.c(b.c(this.authCode.hashCode() * 31, 31, this.sessionToken), 31, this.deviceId);
        String str = this.region;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.authCode;
        String str2 = this.sessionToken;
        return a.l(YU.a.v("RewardsLoginRequestData(authCode=", str, ", sessionToken=", str2, ", deviceId="), this.deviceId, ", region=", this.region, ")");
    }
}
