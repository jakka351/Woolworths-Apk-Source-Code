package au.com.woolworths.base.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsSignupCallbackResult;", "", "signupFormUrl", "", "callbackUrlPattern", "callbackUrlRegexPattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSignupFormUrl", "()Ljava/lang/String;", "getCallbackUrlPattern", "getCallbackUrlRegexPattern", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RewardsSignupCallbackResult {
    public static final int $stable = 0;

    @SerializedName("callbackURLPattern")
    @NotNull
    private final String callbackUrlPattern;

    @SerializedName("callbackURLRegexPattern")
    @Nullable
    private final String callbackUrlRegexPattern;

    @SerializedName("signupFormURL")
    @NotNull
    private final String signupFormUrl;

    public RewardsSignupCallbackResult(@NotNull String signupFormUrl, @NotNull String callbackUrlPattern, @Nullable String str) {
        Intrinsics.h(signupFormUrl, "signupFormUrl");
        Intrinsics.h(callbackUrlPattern, "callbackUrlPattern");
        this.signupFormUrl = signupFormUrl;
        this.callbackUrlPattern = callbackUrlPattern;
        this.callbackUrlRegexPattern = str;
    }

    public static /* synthetic */ RewardsSignupCallbackResult copy$default(RewardsSignupCallbackResult rewardsSignupCallbackResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsSignupCallbackResult.signupFormUrl;
        }
        if ((i & 2) != 0) {
            str2 = rewardsSignupCallbackResult.callbackUrlPattern;
        }
        if ((i & 4) != 0) {
            str3 = rewardsSignupCallbackResult.callbackUrlRegexPattern;
        }
        return rewardsSignupCallbackResult.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSignupFormUrl() {
        return this.signupFormUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCallbackUrlPattern() {
        return this.callbackUrlPattern;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCallbackUrlRegexPattern() {
        return this.callbackUrlRegexPattern;
    }

    @NotNull
    public final RewardsSignupCallbackResult copy(@NotNull String signupFormUrl, @NotNull String callbackUrlPattern, @Nullable String callbackUrlRegexPattern) {
        Intrinsics.h(signupFormUrl, "signupFormUrl");
        Intrinsics.h(callbackUrlPattern, "callbackUrlPattern");
        return new RewardsSignupCallbackResult(signupFormUrl, callbackUrlPattern, callbackUrlRegexPattern);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsSignupCallbackResult)) {
            return false;
        }
        RewardsSignupCallbackResult rewardsSignupCallbackResult = (RewardsSignupCallbackResult) other;
        return Intrinsics.c(this.signupFormUrl, rewardsSignupCallbackResult.signupFormUrl) && Intrinsics.c(this.callbackUrlPattern, rewardsSignupCallbackResult.callbackUrlPattern) && Intrinsics.c(this.callbackUrlRegexPattern, rewardsSignupCallbackResult.callbackUrlRegexPattern);
    }

    @NotNull
    public final String getCallbackUrlPattern() {
        return this.callbackUrlPattern;
    }

    @Nullable
    public final String getCallbackUrlRegexPattern() {
        return this.callbackUrlRegexPattern;
    }

    @NotNull
    public final String getSignupFormUrl() {
        return this.signupFormUrl;
    }

    public int hashCode() {
        int iC = b.c(this.signupFormUrl.hashCode() * 31, 31, this.callbackUrlPattern);
        String str = this.callbackUrlRegexPattern;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.signupFormUrl;
        String str2 = this.callbackUrlPattern;
        return a.o(a.v("RewardsSignupCallbackResult(signupFormUrl=", str, ", callbackUrlPattern=", str2, ", callbackUrlRegexPattern="), this.callbackUrlRegexPattern, ")");
    }

    public /* synthetic */ RewardsSignupCallbackResult(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
