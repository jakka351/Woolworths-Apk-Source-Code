package com.woolworths.scanlibrary.models.tapon;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J{\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\u0013\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001b¨\u0006."}, d2 = {"Lcom/woolworths/scanlibrary/models/tapon/StoreInfo;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "id", "tillid", "", "address", "division", "phone", "storeType", "isMetro", "", "notify_wifi", "validateEntryQRCode", "isScanGoEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "getName", "()Ljava/lang/String;", "getId", "getTillid", "()I", "getAddress", "getDivision", "getPhone", "getStoreType", "()Z", "getNotify_wifi", "getValidateEntryQRCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StoreInfo {
    public static final int $stable = 0;

    @SerializedName("address")
    @NotNull
    private final String address;

    @SerializedName("division")
    @Nullable
    private final String division;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("isMetro")
    private final boolean isMetro;

    @SerializedName("isscangoenabled")
    private final boolean isScanGoEnabled;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("notify_wifi")
    private final boolean notify_wifi;

    @SerializedName("phone")
    @Nullable
    private final String phone;

    @SerializedName("storeType")
    @NotNull
    private final String storeType;

    @SerializedName("tillid")
    private final int tillid;

    @SerializedName("validateEntryQRCode")
    private final boolean validateEntryQRCode;

    public StoreInfo(@NotNull String name, @NotNull String id, int i, @NotNull String address, @Nullable String str, @Nullable String str2, @NotNull String storeType, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.h(name, "name");
        Intrinsics.h(id, "id");
        Intrinsics.h(address, "address");
        Intrinsics.h(storeType, "storeType");
        this.name = name;
        this.id = id;
        this.tillid = i;
        this.address = address;
        this.division = str;
        this.phone = str2;
        this.storeType = storeType;
        this.isMetro = z;
        this.notify_wifi = z2;
        this.validateEntryQRCode = z3;
        this.isScanGoEnabled = z4;
    }

    public static /* synthetic */ StoreInfo copy$default(StoreInfo storeInfo, String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = storeInfo.name;
        }
        if ((i2 & 2) != 0) {
            str2 = storeInfo.id;
        }
        if ((i2 & 4) != 0) {
            i = storeInfo.tillid;
        }
        if ((i2 & 8) != 0) {
            str3 = storeInfo.address;
        }
        if ((i2 & 16) != 0) {
            str4 = storeInfo.division;
        }
        if ((i2 & 32) != 0) {
            str5 = storeInfo.phone;
        }
        if ((i2 & 64) != 0) {
            str6 = storeInfo.storeType;
        }
        if ((i2 & 128) != 0) {
            z = storeInfo.isMetro;
        }
        if ((i2 & 256) != 0) {
            z2 = storeInfo.notify_wifi;
        }
        if ((i2 & 512) != 0) {
            z3 = storeInfo.validateEntryQRCode;
        }
        if ((i2 & 1024) != 0) {
            z4 = storeInfo.isScanGoEnabled;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z;
        boolean z8 = z2;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        int i3 = i;
        return storeInfo.copy(str, str2, i3, str3, str9, str7, str8, z7, z8, z5, z6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getValidateEntryQRCode() {
        return this.validateEntryQRCode;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsScanGoEnabled() {
        return this.isScanGoEnabled;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTillid() {
        return this.tillid;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDivision() {
        return this.division;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getStoreType() {
        return this.storeType;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsMetro() {
        return this.isMetro;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getNotify_wifi() {
        return this.notify_wifi;
    }

    @NotNull
    public final StoreInfo copy(@NotNull String name, @NotNull String id, int tillid, @NotNull String address, @Nullable String division, @Nullable String phone, @NotNull String storeType, boolean isMetro, boolean notify_wifi, boolean validateEntryQRCode, boolean isScanGoEnabled) {
        Intrinsics.h(name, "name");
        Intrinsics.h(id, "id");
        Intrinsics.h(address, "address");
        Intrinsics.h(storeType, "storeType");
        return new StoreInfo(name, id, tillid, address, division, phone, storeType, isMetro, notify_wifi, validateEntryQRCode, isScanGoEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreInfo)) {
            return false;
        }
        StoreInfo storeInfo = (StoreInfo) other;
        return Intrinsics.c(this.name, storeInfo.name) && Intrinsics.c(this.id, storeInfo.id) && this.tillid == storeInfo.tillid && Intrinsics.c(this.address, storeInfo.address) && Intrinsics.c(this.division, storeInfo.division) && Intrinsics.c(this.phone, storeInfo.phone) && Intrinsics.c(this.storeType, storeInfo.storeType) && this.isMetro == storeInfo.isMetro && this.notify_wifi == storeInfo.notify_wifi && this.validateEntryQRCode == storeInfo.validateEntryQRCode && this.isScanGoEnabled == storeInfo.isScanGoEnabled;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getDivision() {
        return this.division;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getNotify_wifi() {
        return this.notify_wifi;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getStoreType() {
        return this.storeType;
    }

    public final int getTillid() {
        return this.tillid;
    }

    public final boolean getValidateEntryQRCode() {
        return this.validateEntryQRCode;
    }

    public int hashCode() {
        int iC = b.c(b.a(this.tillid, b.c(this.name.hashCode() * 31, 31, this.id), 31), 31, this.address);
        String str = this.division;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        return Boolean.hashCode(this.isScanGoEnabled) + b.e(b.e(b.e(b.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.storeType), 31, this.isMetro), 31, this.notify_wifi), 31, this.validateEntryQRCode);
    }

    public final boolean isMetro() {
        return this.isMetro;
    }

    public final boolean isScanGoEnabled() {
        return this.isScanGoEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.id;
        int i = this.tillid;
        String str3 = this.address;
        String str4 = this.division;
        String str5 = this.phone;
        String str6 = this.storeType;
        boolean z = this.isMetro;
        boolean z2 = this.notify_wifi;
        boolean z3 = this.validateEntryQRCode;
        boolean z4 = this.isScanGoEnabled;
        StringBuilder sbV = a.v("StoreInfo(name=", str, ", id=", str2, ", tillid=");
        androidx.compose.ui.input.pointer.a.u(i, ", address=", str3, ", division=", sbV);
        androidx.constraintlayout.core.state.a.B(sbV, str4, ", phone=", str5, ", storeType=");
        d.A(str6, ", isMetro=", ", notify_wifi=", sbV, z);
        au.com.woolworths.android.onesite.a.D(sbV, z2, ", validateEntryQRCode=", z3, ", isScanGoEnabled=");
        return a.k(")", sbV, z4);
    }

    public /* synthetic */ StoreInfo(String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i, str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, str6, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? false : z3, (i2 & 1024) != 0 ? false : z4);
    }
}
