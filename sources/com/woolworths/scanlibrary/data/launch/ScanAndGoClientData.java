package com.woolworths.scanlibrary.data.launch;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/woolworths/scanlibrary/data/launch/ScanAndGoClientData;", "", "", "operatingSystem", "appVersion", "osVersion", "deviceId", "deviceMake", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getOperatingSystem", "()Ljava/lang/String;", "getAppVersion", "getOsVersion", "getDeviceId", "getDeviceMake", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ScanAndGoClientData {

    @SerializedName("appversion")
    @NotNull
    private final String appVersion;

    @SerializedName("deviceid")
    @NotNull
    private final String deviceId;

    @SerializedName("devicemake")
    @NotNull
    private final String deviceMake;

    @SerializedName("os")
    @NotNull
    private final String operatingSystem;

    @SerializedName("osversion")
    @NotNull
    private final String osVersion;

    public ScanAndGoClientData(@NotNull String operatingSystem, @NotNull String appVersion, @NotNull String osVersion, @NotNull String deviceId, @NotNull String deviceMake) {
        Intrinsics.h(operatingSystem, "operatingSystem");
        Intrinsics.h(appVersion, "appVersion");
        Intrinsics.h(osVersion, "osVersion");
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(deviceMake, "deviceMake");
        this.operatingSystem = operatingSystem;
        this.appVersion = appVersion;
        this.osVersion = osVersion;
        this.deviceId = deviceId;
        this.deviceMake = deviceMake;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoClientData)) {
            return false;
        }
        ScanAndGoClientData scanAndGoClientData = (ScanAndGoClientData) obj;
        return Intrinsics.c(this.operatingSystem, scanAndGoClientData.operatingSystem) && Intrinsics.c(this.appVersion, scanAndGoClientData.appVersion) && Intrinsics.c(this.osVersion, scanAndGoClientData.osVersion) && Intrinsics.c(this.deviceId, scanAndGoClientData.deviceId) && Intrinsics.c(this.deviceMake, scanAndGoClientData.deviceMake);
    }

    public final int hashCode() {
        return this.deviceMake.hashCode() + b.c(b.c(b.c(this.operatingSystem.hashCode() * 31, 31, this.appVersion), 31, this.osVersion), 31, this.deviceId);
    }

    public final String toString() {
        String str = this.operatingSystem;
        String str2 = this.appVersion;
        String str3 = this.osVersion;
        String str4 = this.deviceId;
        String str5 = this.deviceMake;
        StringBuilder sbV = a.v("ScanAndGoClientData(operatingSystem=", str, ", appVersion=", str2, ", osVersion=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", deviceId=", str4, ", deviceMake=");
        return a.o(sbV, str5, ")");
    }
}
