package com.woolworths.scanlibrary.models.device;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.storage.db.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/woolworths/scanlibrary/models/device/DeviceInfo;", "", "deviceId", "", k.a.b, "deviceMakeModel", "osVersion", "appVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DeviceInfo {
    public static final int $stable = 0;

    @SerializedName("appversion")
    @NotNull
    private final String appVersion;

    @SerializedName("deviceid")
    @NotNull
    private final String deviceId;

    @SerializedName("devicemake")
    @NotNull
    private final String deviceMakeModel;

    @SerializedName("osversion")
    @NotNull
    private final String osVersion;

    @SerializedName("os")
    @NotNull
    private final String platform;

    public DeviceInfo(@NotNull String deviceId, @NotNull String platform, @NotNull String deviceMakeModel, @NotNull String osVersion, @NotNull String appVersion) {
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(platform, "platform");
        Intrinsics.h(deviceMakeModel, "deviceMakeModel");
        Intrinsics.h(osVersion, "osVersion");
        Intrinsics.h(appVersion, "appVersion");
        this.deviceId = deviceId;
        this.platform = platform;
        this.deviceMakeModel = deviceMakeModel;
        this.osVersion = osVersion;
        this.appVersion = appVersion;
    }

    /* renamed from: component1, reason: from getter */
    private final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    private final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component3, reason: from getter */
    private final String getDeviceMakeModel() {
        return this.deviceMakeModel;
    }

    /* renamed from: component4, reason: from getter */
    private final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component5, reason: from getter */
    private final String getAppVersion() {
        return this.appVersion;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfo.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfo.platform;
        }
        if ((i & 4) != 0) {
            str3 = deviceInfo.deviceMakeModel;
        }
        if ((i & 8) != 0) {
            str4 = deviceInfo.osVersion;
        }
        if ((i & 16) != 0) {
            str5 = deviceInfo.appVersion;
        }
        String str6 = str5;
        String str7 = str3;
        return deviceInfo.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String deviceId, @NotNull String platform, @NotNull String deviceMakeModel, @NotNull String osVersion, @NotNull String appVersion) {
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(platform, "platform");
        Intrinsics.h(deviceMakeModel, "deviceMakeModel");
        Intrinsics.h(osVersion, "osVersion");
        Intrinsics.h(appVersion, "appVersion");
        return new DeviceInfo(deviceId, platform, deviceMakeModel, osVersion, appVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.c(this.deviceId, deviceInfo.deviceId) && Intrinsics.c(this.platform, deviceInfo.platform) && Intrinsics.c(this.deviceMakeModel, deviceInfo.deviceMakeModel) && Intrinsics.c(this.osVersion, deviceInfo.osVersion) && Intrinsics.c(this.appVersion, deviceInfo.appVersion);
    }

    public int hashCode() {
        return this.appVersion.hashCode() + b.c(b.c(b.c(this.deviceId.hashCode() * 31, 31, this.platform), 31, this.deviceMakeModel), 31, this.osVersion);
    }

    @NotNull
    public String toString() {
        String str = this.deviceId;
        String str2 = this.platform;
        String str3 = this.deviceMakeModel;
        String str4 = this.osVersion;
        String str5 = this.appVersion;
        StringBuilder sbV = a.v("DeviceInfo(deviceId=", str, ", platform=", str2, ", deviceMakeModel=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", osVersion=", str4, ", appVersion=");
        return a.o(sbV, str5, ")");
    }
}
