package com.woolworths.scanlibrary.models.authentication.guest;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.device.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0005HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÂ\u0003J)\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/woolworths/scanlibrary/models/authentication/guest/GuestLoginRequest;", "", "deviceInfo", "Lcom/woolworths/scanlibrary/models/device/DeviceInfo;", "customerName", "", Scopes.EMAIL, "<init>", "(Lcom/woolworths/scanlibrary/models/device/DeviceInfo;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GuestLoginRequest {
    public static final int $stable = 0;

    @SerializedName("customername")
    @NotNull
    private final String customerName;

    @SerializedName("deviceinfo")
    @Nullable
    private final DeviceInfo deviceInfo;

    @SerializedName(Scopes.EMAIL)
    @NotNull
    private final String email;

    public GuestLoginRequest() {
        this(null, null, null, 7, null);
    }

    /* renamed from: component1, reason: from getter */
    private final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: component2, reason: from getter */
    private final String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: component3, reason: from getter */
    private final String getEmail() {
        return this.email;
    }

    public static /* synthetic */ GuestLoginRequest copy$default(GuestLoginRequest guestLoginRequest, DeviceInfo deviceInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceInfo = guestLoginRequest.deviceInfo;
        }
        if ((i & 2) != 0) {
            str = guestLoginRequest.customerName;
        }
        if ((i & 4) != 0) {
            str2 = guestLoginRequest.email;
        }
        return guestLoginRequest.copy(deviceInfo, str, str2);
    }

    @NotNull
    public final GuestLoginRequest copy(@Nullable DeviceInfo deviceInfo, @NotNull String customerName, @NotNull String email) {
        Intrinsics.h(customerName, "customerName");
        Intrinsics.h(email, "email");
        return new GuestLoginRequest(deviceInfo, customerName, email);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuestLoginRequest)) {
            return false;
        }
        GuestLoginRequest guestLoginRequest = (GuestLoginRequest) other;
        return Intrinsics.c(this.deviceInfo, guestLoginRequest.deviceInfo) && Intrinsics.c(this.customerName, guestLoginRequest.customerName) && Intrinsics.c(this.email, guestLoginRequest.email);
    }

    public int hashCode() {
        DeviceInfo deviceInfo = this.deviceInfo;
        return this.email.hashCode() + b.c((deviceInfo == null ? 0 : deviceInfo.hashCode()) * 31, 31, this.customerName);
    }

    @NotNull
    public String toString() {
        DeviceInfo deviceInfo = this.deviceInfo;
        String str = this.customerName;
        String str2 = this.email;
        StringBuilder sb = new StringBuilder("GuestLoginRequest(deviceInfo=");
        sb.append(deviceInfo);
        sb.append(", customerName=");
        sb.append(str);
        sb.append(", email=");
        return a.o(sb, str2, ")");
    }

    public GuestLoginRequest(@Nullable DeviceInfo deviceInfo, @NotNull String customerName, @NotNull String email) {
        Intrinsics.h(customerName, "customerName");
        Intrinsics.h(email, "email");
        this.deviceInfo = deviceInfo;
        this.customerName = customerName;
        this.email = email;
    }

    public /* synthetic */ GuestLoginRequest(DeviceInfo deviceInfo, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deviceInfo, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
