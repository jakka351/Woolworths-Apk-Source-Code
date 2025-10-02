package au.com.woolworths.scanandgo.data;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/scanandgo/data/ScanAndGoClientData;", "", "operatingSystem", "", "appVersion", "osVersion", "deviceId", "deviceMake", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOperatingSystem", "()Ljava/lang/String;", "getAppVersion", "getOsVersion", "getDeviceId", "getDeviceMake", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-scan-and-go_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
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

    public static /* synthetic */ ScanAndGoClientData copy$default(ScanAndGoClientData scanAndGoClientData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scanAndGoClientData.operatingSystem;
        }
        if ((i & 2) != 0) {
            str2 = scanAndGoClientData.appVersion;
        }
        if ((i & 4) != 0) {
            str3 = scanAndGoClientData.osVersion;
        }
        if ((i & 8) != 0) {
            str4 = scanAndGoClientData.deviceId;
        }
        if ((i & 16) != 0) {
            str5 = scanAndGoClientData.deviceMake;
        }
        String str6 = str5;
        String str7 = str3;
        return scanAndGoClientData.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDeviceMake() {
        return this.deviceMake;
    }

    @NotNull
    public final ScanAndGoClientData copy(@NotNull String operatingSystem, @NotNull String appVersion, @NotNull String osVersion, @NotNull String deviceId, @NotNull String deviceMake) {
        Intrinsics.h(operatingSystem, "operatingSystem");
        Intrinsics.h(appVersion, "appVersion");
        Intrinsics.h(osVersion, "osVersion");
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(deviceMake, "deviceMake");
        return new ScanAndGoClientData(operatingSystem, appVersion, osVersion, deviceId, deviceMake);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanAndGoClientData)) {
            return false;
        }
        ScanAndGoClientData scanAndGoClientData = (ScanAndGoClientData) other;
        return Intrinsics.c(this.operatingSystem, scanAndGoClientData.operatingSystem) && Intrinsics.c(this.appVersion, scanAndGoClientData.appVersion) && Intrinsics.c(this.osVersion, scanAndGoClientData.osVersion) && Intrinsics.c(this.deviceId, scanAndGoClientData.deviceId) && Intrinsics.c(this.deviceMake, scanAndGoClientData.deviceMake);
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceMake() {
        return this.deviceMake;
    }

    @NotNull
    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    public int hashCode() {
        return this.deviceMake.hashCode() + b.c(b.c(b.c(this.operatingSystem.hashCode() * 31, 31, this.appVersion), 31, this.osVersion), 31, this.deviceId);
    }

    @NotNull
    public String toString() {
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
