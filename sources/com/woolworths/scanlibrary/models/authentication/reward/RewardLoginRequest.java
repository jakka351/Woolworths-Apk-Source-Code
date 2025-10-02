package com.woolworths.scanlibrary.models.authentication.reward;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.device.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/woolworths/scanlibrary/models/authentication/reward/RewardLoginRequest;", "", "authcode", "", "tempToken", "deviceInfo", "Lcom/woolworths/scanlibrary/models/device/DeviceInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/device/DeviceInfo;)V", "getAuthcode", "()Ljava/lang/String;", "setAuthcode", "(Ljava/lang/String;)V", "getTempToken", "setTempToken", "getDeviceInfo", "()Lcom/woolworths/scanlibrary/models/device/DeviceInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardLoginRequest {
    public static final int $stable = 8;

    @NotNull
    private String authcode;

    @NotNull
    private final DeviceInfo deviceInfo;

    @NotNull
    private String tempToken;

    public RewardLoginRequest(@NotNull String authcode, @NotNull String tempToken, @NotNull DeviceInfo deviceInfo) {
        Intrinsics.h(authcode, "authcode");
        Intrinsics.h(tempToken, "tempToken");
        Intrinsics.h(deviceInfo, "deviceInfo");
        this.authcode = authcode;
        this.tempToken = tempToken;
        this.deviceInfo = deviceInfo;
    }

    public static /* synthetic */ RewardLoginRequest copy$default(RewardLoginRequest rewardLoginRequest, String str, String str2, DeviceInfo deviceInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardLoginRequest.authcode;
        }
        if ((i & 2) != 0) {
            str2 = rewardLoginRequest.tempToken;
        }
        if ((i & 4) != 0) {
            deviceInfo = rewardLoginRequest.deviceInfo;
        }
        return rewardLoginRequest.copy(str, str2, deviceInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAuthcode() {
        return this.authcode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTempToken() {
        return this.tempToken;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final RewardLoginRequest copy(@NotNull String authcode, @NotNull String tempToken, @NotNull DeviceInfo deviceInfo) {
        Intrinsics.h(authcode, "authcode");
        Intrinsics.h(tempToken, "tempToken");
        Intrinsics.h(deviceInfo, "deviceInfo");
        return new RewardLoginRequest(authcode, tempToken, deviceInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardLoginRequest)) {
            return false;
        }
        RewardLoginRequest rewardLoginRequest = (RewardLoginRequest) other;
        return Intrinsics.c(this.authcode, rewardLoginRequest.authcode) && Intrinsics.c(this.tempToken, rewardLoginRequest.tempToken) && Intrinsics.c(this.deviceInfo, rewardLoginRequest.deviceInfo);
    }

    @NotNull
    public final String getAuthcode() {
        return this.authcode;
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final String getTempToken() {
        return this.tempToken;
    }

    public int hashCode() {
        return this.deviceInfo.hashCode() + b.c(this.authcode.hashCode() * 31, 31, this.tempToken);
    }

    public final void setAuthcode(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.authcode = str;
    }

    public final void setTempToken(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.tempToken = str;
    }

    @NotNull
    public String toString() {
        String str = this.authcode;
        String str2 = this.tempToken;
        DeviceInfo deviceInfo = this.deviceInfo;
        StringBuilder sbV = a.v("RewardLoginRequest(authcode=", str, ", tempToken=", str2, ", deviceInfo=");
        sbV.append(deviceInfo);
        sbV.append(")");
        return sbV.toString();
    }
}
