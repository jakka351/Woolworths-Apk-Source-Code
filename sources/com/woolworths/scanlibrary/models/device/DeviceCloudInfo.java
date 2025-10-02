package com.woolworths.scanlibrary.models.device;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/woolworths/scanlibrary/models/device/DeviceCloudInfo;", "", "deviceId", "", "deviceToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DeviceCloudInfo {
    public static final int $stable = 0;

    @SerializedName("deviceid")
    @NotNull
    private final String deviceId;

    @SerializedName("devicetoken")
    @NotNull
    private final String deviceToken;

    public DeviceCloudInfo(@NotNull String deviceId, @NotNull String deviceToken) {
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(deviceToken, "deviceToken");
        this.deviceId = deviceId;
        this.deviceToken = deviceToken;
    }

    /* renamed from: component1, reason: from getter */
    private final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    private final String getDeviceToken() {
        return this.deviceToken;
    }

    public static /* synthetic */ DeviceCloudInfo copy$default(DeviceCloudInfo deviceCloudInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceCloudInfo.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = deviceCloudInfo.deviceToken;
        }
        return deviceCloudInfo.copy(str, str2);
    }

    @NotNull
    public final DeviceCloudInfo copy(@NotNull String deviceId, @NotNull String deviceToken) {
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(deviceToken, "deviceToken");
        return new DeviceCloudInfo(deviceId, deviceToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceCloudInfo)) {
            return false;
        }
        DeviceCloudInfo deviceCloudInfo = (DeviceCloudInfo) other;
        return Intrinsics.c(this.deviceId, deviceCloudInfo.deviceId) && Intrinsics.c(this.deviceToken, deviceCloudInfo.deviceToken);
    }

    public int hashCode() {
        return this.deviceToken.hashCode() + (this.deviceId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.j("DeviceCloudInfo(deviceId=", this.deviceId, ", deviceToken=", this.deviceToken, ")");
    }
}
