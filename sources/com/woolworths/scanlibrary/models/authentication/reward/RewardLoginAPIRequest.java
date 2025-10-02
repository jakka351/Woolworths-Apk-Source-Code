package com.woolworths.scanlibrary.models.authentication.reward;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.device.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/woolworths/scanlibrary/models/authentication/reward/RewardLoginAPIRequest;", "", "deviceInfo", "Lcom/woolworths/scanlibrary/models/device/DeviceInfo;", "<init>", "(Lcom/woolworths/scanlibrary/models/device/DeviceInfo;)V", "getDeviceInfo", "()Lcom/woolworths/scanlibrary/models/device/DeviceInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardLoginAPIRequest {
    public static final int $stable = 0;

    @SerializedName("deviceinfo")
    @NotNull
    private final DeviceInfo deviceInfo;

    public RewardLoginAPIRequest(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.h(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
    }

    public static /* synthetic */ RewardLoginAPIRequest copy$default(RewardLoginAPIRequest rewardLoginAPIRequest, DeviceInfo deviceInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceInfo = rewardLoginAPIRequest.deviceInfo;
        }
        return rewardLoginAPIRequest.copy(deviceInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final RewardLoginAPIRequest copy(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.h(deviceInfo, "deviceInfo");
        return new RewardLoginAPIRequest(deviceInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RewardLoginAPIRequest) && Intrinsics.c(this.deviceInfo, ((RewardLoginAPIRequest) other).deviceInfo);
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public int hashCode() {
        return this.deviceInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "RewardLoginAPIRequest(deviceInfo=" + this.deviceInfo + ")";
    }
}
