package au.com.woolworths.android.onesite.modules.rewards.data;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLinkCallbackResultData;", "", "", "loginFormUrl", "sessionToken", "callbackUrlPattern", "callbackUrlRegexPattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "a", "b", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RewardsLinkCallbackResultData {

    @SerializedName("callbackURLPattern")
    @NotNull
    private final String callbackUrlPattern;

    @SerializedName("callbackURLRegexPattern")
    @Nullable
    private final String callbackUrlRegexPattern;

    @SerializedName("loginFormURL")
    @NotNull
    private final String loginFormUrl;

    @SerializedName("sessionToken")
    @NotNull
    private final String sessionToken;

    public RewardsLinkCallbackResultData(@NotNull String loginFormUrl, @NotNull String sessionToken, @NotNull String callbackUrlPattern, @Nullable String str) {
        Intrinsics.h(loginFormUrl, "loginFormUrl");
        Intrinsics.h(sessionToken, "sessionToken");
        Intrinsics.h(callbackUrlPattern, "callbackUrlPattern");
        this.loginFormUrl = loginFormUrl;
        this.sessionToken = sessionToken;
        this.callbackUrlPattern = callbackUrlPattern;
        this.callbackUrlRegexPattern = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getCallbackUrlPattern() {
        return this.callbackUrlPattern;
    }

    /* renamed from: b, reason: from getter */
    public final String getCallbackUrlRegexPattern() {
        return this.callbackUrlRegexPattern;
    }

    /* renamed from: c, reason: from getter */
    public final String getLoginFormUrl() {
        return this.loginFormUrl;
    }

    /* renamed from: d, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsLinkCallbackResultData)) {
            return false;
        }
        RewardsLinkCallbackResultData rewardsLinkCallbackResultData = (RewardsLinkCallbackResultData) obj;
        return Intrinsics.c(this.loginFormUrl, rewardsLinkCallbackResultData.loginFormUrl) && Intrinsics.c(this.sessionToken, rewardsLinkCallbackResultData.sessionToken) && Intrinsics.c(this.callbackUrlPattern, rewardsLinkCallbackResultData.callbackUrlPattern) && Intrinsics.c(this.callbackUrlRegexPattern, rewardsLinkCallbackResultData.callbackUrlRegexPattern);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.loginFormUrl.hashCode() * 31, 31, this.sessionToken), 31, this.callbackUrlPattern);
        String str = this.callbackUrlRegexPattern;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.loginFormUrl;
        String str2 = this.sessionToken;
        return a.l(YU.a.v("RewardsLinkCallbackResultData(loginFormUrl=", str, ", sessionToken=", str2, ", callbackUrlPattern="), this.callbackUrlPattern, ", callbackUrlRegexPattern=", this.callbackUrlRegexPattern, ")");
    }

    public /* synthetic */ RewardsLinkCallbackResultData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
