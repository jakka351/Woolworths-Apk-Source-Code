package com.woolworths.scanlibrary.models.authentication.reward;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/woolworths/scanlibrary/models/authentication/reward/RewardSignInPreAuthResponse;", "", "rewardsUrl", "", "tempToken", "redirectPattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRewardsUrl", "()Ljava/lang/String;", "getTempToken", "getRedirectPattern", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardSignInPreAuthResponse {
    public static final int $stable = 0;

    @SerializedName("redirect_pattern")
    @NotNull
    private final String redirectPattern;

    @SerializedName("rewards_url")
    @NotNull
    private final String rewardsUrl;

    @SerializedName("temp_token")
    @NotNull
    private final String tempToken;

    public RewardSignInPreAuthResponse(@NotNull String rewardsUrl, @NotNull String tempToken, @NotNull String redirectPattern) {
        Intrinsics.h(rewardsUrl, "rewardsUrl");
        Intrinsics.h(tempToken, "tempToken");
        Intrinsics.h(redirectPattern, "redirectPattern");
        this.rewardsUrl = rewardsUrl;
        this.tempToken = tempToken;
        this.redirectPattern = redirectPattern;
    }

    public static /* synthetic */ RewardSignInPreAuthResponse copy$default(RewardSignInPreAuthResponse rewardSignInPreAuthResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardSignInPreAuthResponse.rewardsUrl;
        }
        if ((i & 2) != 0) {
            str2 = rewardSignInPreAuthResponse.tempToken;
        }
        if ((i & 4) != 0) {
            str3 = rewardSignInPreAuthResponse.redirectPattern;
        }
        return rewardSignInPreAuthResponse.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRewardsUrl() {
        return this.rewardsUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTempToken() {
        return this.tempToken;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRedirectPattern() {
        return this.redirectPattern;
    }

    @NotNull
    public final RewardSignInPreAuthResponse copy(@NotNull String rewardsUrl, @NotNull String tempToken, @NotNull String redirectPattern) {
        Intrinsics.h(rewardsUrl, "rewardsUrl");
        Intrinsics.h(tempToken, "tempToken");
        Intrinsics.h(redirectPattern, "redirectPattern");
        return new RewardSignInPreAuthResponse(rewardsUrl, tempToken, redirectPattern);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardSignInPreAuthResponse)) {
            return false;
        }
        RewardSignInPreAuthResponse rewardSignInPreAuthResponse = (RewardSignInPreAuthResponse) other;
        return Intrinsics.c(this.rewardsUrl, rewardSignInPreAuthResponse.rewardsUrl) && Intrinsics.c(this.tempToken, rewardSignInPreAuthResponse.tempToken) && Intrinsics.c(this.redirectPattern, rewardSignInPreAuthResponse.redirectPattern);
    }

    @NotNull
    public final String getRedirectPattern() {
        return this.redirectPattern;
    }

    @NotNull
    public final String getRewardsUrl() {
        return this.rewardsUrl;
    }

    @NotNull
    public final String getTempToken() {
        return this.tempToken;
    }

    public int hashCode() {
        return this.redirectPattern.hashCode() + b.c(this.rewardsUrl.hashCode() * 31, 31, this.tempToken);
    }

    @NotNull
    public String toString() {
        String str = this.rewardsUrl;
        String str2 = this.tempToken;
        return a.o(a.v("RewardSignInPreAuthResponse(rewardsUrl=", str, ", tempToken=", str2, ", redirectPattern="), this.redirectPattern, ")");
    }
}
