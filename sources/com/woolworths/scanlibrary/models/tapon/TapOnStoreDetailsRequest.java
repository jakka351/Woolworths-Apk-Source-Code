package com.woolworths.scanlibrary.models.tapon;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/woolworths/scanlibrary/models/tapon/TapOnStoreDetailsRequest;", "", "tapOnId", "", "deviceMaker", "deviceId", "osVersion", "appVersion", "skipWalletValidation", "", "deviceFingerprintId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getTapOnId", "()Ljava/lang/String;", "getDeviceMaker", "getDeviceId", "getOsVersion", "getAppVersion", "getSkipWalletValidation", "()Z", "getDeviceFingerprintId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TapOnStoreDetailsRequest {
    public static final int $stable = 0;

    @SerializedName("appversion")
    @NotNull
    private final String appVersion;

    @SerializedName("devicefingerprint")
    @Nullable
    private final String deviceFingerprintId;

    @SerializedName("deviceid")
    @NotNull
    private final String deviceId;

    @SerializedName("devicemake")
    @NotNull
    private final String deviceMaker;

    @SerializedName("os")
    @NotNull
    private final String osVersion;

    @SerializedName("skipwalletvalidation")
    private final boolean skipWalletValidation;

    @SerializedName("taponid")
    @NotNull
    private final String tapOnId;

    public TapOnStoreDetailsRequest(@NotNull String tapOnId, @NotNull String deviceMaker, @NotNull String deviceId, @NotNull String osVersion, @NotNull String appVersion, boolean z, @Nullable String str) {
        Intrinsics.h(tapOnId, "tapOnId");
        Intrinsics.h(deviceMaker, "deviceMaker");
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(osVersion, "osVersion");
        Intrinsics.h(appVersion, "appVersion");
        this.tapOnId = tapOnId;
        this.deviceMaker = deviceMaker;
        this.deviceId = deviceId;
        this.osVersion = osVersion;
        this.appVersion = appVersion;
        this.skipWalletValidation = z;
        this.deviceFingerprintId = str;
    }

    public static /* synthetic */ TapOnStoreDetailsRequest copy$default(TapOnStoreDetailsRequest tapOnStoreDetailsRequest, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapOnStoreDetailsRequest.tapOnId;
        }
        if ((i & 2) != 0) {
            str2 = tapOnStoreDetailsRequest.deviceMaker;
        }
        if ((i & 4) != 0) {
            str3 = tapOnStoreDetailsRequest.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = tapOnStoreDetailsRequest.osVersion;
        }
        if ((i & 16) != 0) {
            str5 = tapOnStoreDetailsRequest.appVersion;
        }
        if ((i & 32) != 0) {
            z = tapOnStoreDetailsRequest.skipWalletValidation;
        }
        if ((i & 64) != 0) {
            str6 = tapOnStoreDetailsRequest.deviceFingerprintId;
        }
        boolean z2 = z;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return tapOnStoreDetailsRequest.copy(str, str2, str9, str4, str8, z2, str7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTapOnId() {
        return this.tapOnId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeviceMaker() {
        return this.deviceMaker;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSkipWalletValidation() {
        return this.skipWalletValidation;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getDeviceFingerprintId() {
        return this.deviceFingerprintId;
    }

    @NotNull
    public final TapOnStoreDetailsRequest copy(@NotNull String tapOnId, @NotNull String deviceMaker, @NotNull String deviceId, @NotNull String osVersion, @NotNull String appVersion, boolean skipWalletValidation, @Nullable String deviceFingerprintId) {
        Intrinsics.h(tapOnId, "tapOnId");
        Intrinsics.h(deviceMaker, "deviceMaker");
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(osVersion, "osVersion");
        Intrinsics.h(appVersion, "appVersion");
        return new TapOnStoreDetailsRequest(tapOnId, deviceMaker, deviceId, osVersion, appVersion, skipWalletValidation, deviceFingerprintId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapOnStoreDetailsRequest)) {
            return false;
        }
        TapOnStoreDetailsRequest tapOnStoreDetailsRequest = (TapOnStoreDetailsRequest) other;
        return Intrinsics.c(this.tapOnId, tapOnStoreDetailsRequest.tapOnId) && Intrinsics.c(this.deviceMaker, tapOnStoreDetailsRequest.deviceMaker) && Intrinsics.c(this.deviceId, tapOnStoreDetailsRequest.deviceId) && Intrinsics.c(this.osVersion, tapOnStoreDetailsRequest.osVersion) && Intrinsics.c(this.appVersion, tapOnStoreDetailsRequest.appVersion) && this.skipWalletValidation == tapOnStoreDetailsRequest.skipWalletValidation && Intrinsics.c(this.deviceFingerprintId, tapOnStoreDetailsRequest.deviceFingerprintId);
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getDeviceFingerprintId() {
        return this.deviceFingerprintId;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceMaker() {
        return this.deviceMaker;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    public final boolean getSkipWalletValidation() {
        return this.skipWalletValidation;
    }

    @NotNull
    public final String getTapOnId() {
        return this.tapOnId;
    }

    public int hashCode() {
        int iE = b.e(b.c(b.c(b.c(b.c(this.tapOnId.hashCode() * 31, 31, this.deviceMaker), 31, this.deviceId), 31, this.osVersion), 31, this.appVersion), 31, this.skipWalletValidation);
        String str = this.deviceFingerprintId;
        return iE + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.tapOnId;
        String str2 = this.deviceMaker;
        String str3 = this.deviceId;
        String str4 = this.osVersion;
        String str5 = this.appVersion;
        boolean z = this.skipWalletValidation;
        String str6 = this.deviceFingerprintId;
        StringBuilder sbV = a.v("TapOnStoreDetailsRequest(tapOnId=", str, ", deviceMaker=", str2, ", deviceId=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", osVersion=", str4, ", appVersion=");
        d.A(str5, ", skipWalletValidation=", ", deviceFingerprintId=", sbV, z);
        return a.o(sbV, str6, ")");
    }

    public /* synthetic */ TapOnStoreDetailsRequest(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str6);
    }
}
