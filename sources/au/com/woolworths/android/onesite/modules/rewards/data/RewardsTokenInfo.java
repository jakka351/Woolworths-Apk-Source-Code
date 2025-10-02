package au.com.woolworths.android.onesite.modules.rewards.data;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenInfo;", "", "", "refreshToken", "accessToken", "", "accessTokenExpiryTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "J", "getAccessTokenExpiryTime", "()J", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsTokenInfo {

    @SerializedName("access_token")
    @NotNull
    private final String accessToken;

    @SerializedName("access_token_expiry_time")
    private final long accessTokenExpiryTime;

    @SerializedName("refresh_token")
    @Nullable
    private final String refreshToken;

    public RewardsTokenInfo(@Nullable String str, @NotNull String accessToken, long j) {
        Intrinsics.h(accessToken, "accessToken");
        this.refreshToken = str;
        this.accessToken = accessToken;
        this.accessTokenExpiryTime = j;
    }

    /* renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: b, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsTokenInfo)) {
            return false;
        }
        RewardsTokenInfo rewardsTokenInfo = (RewardsTokenInfo) obj;
        return Intrinsics.c(this.refreshToken, rewardsTokenInfo.refreshToken) && Intrinsics.c(this.accessToken, rewardsTokenInfo.accessToken) && this.accessTokenExpiryTime == rewardsTokenInfo.accessTokenExpiryTime;
    }

    public final int hashCode() {
        String str = this.refreshToken;
        return Long.hashCode(this.accessTokenExpiryTime) + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.accessToken);
    }

    public final String toString() {
        return a.l(this.accessTokenExpiryTime, ")", YU.a.v("RewardsTokenInfo(refreshToken=", this.refreshToken, ", accessToken=", this.accessToken, ", accessTokenExpiryTime="));
    }
}
