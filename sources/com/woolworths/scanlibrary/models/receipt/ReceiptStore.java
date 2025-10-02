package com.woolworths.scanlibrary.models.receipt;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/ReceiptStore;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "id", "address", "division", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getId", "getAddress", "getDivision", "getPhone", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReceiptStore {
    public static final int $stable = 0;

    @SerializedName("address")
    @NotNull
    private final String address;

    @SerializedName("division")
    @NotNull
    private final String division;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("phone")
    @NotNull
    private final String phone;

    public ReceiptStore(@NotNull String name, @NotNull String id, @NotNull String address, @NotNull String division, @NotNull String phone) {
        Intrinsics.h(name, "name");
        Intrinsics.h(id, "id");
        Intrinsics.h(address, "address");
        Intrinsics.h(division, "division");
        Intrinsics.h(phone, "phone");
        this.name = name;
        this.id = id;
        this.address = address;
        this.division = division;
        this.phone = phone;
    }

    public static /* synthetic */ ReceiptStore copy$default(ReceiptStore receiptStore, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receiptStore.name;
        }
        if ((i & 2) != 0) {
            str2 = receiptStore.id;
        }
        if ((i & 4) != 0) {
            str3 = receiptStore.address;
        }
        if ((i & 8) != 0) {
            str4 = receiptStore.division;
        }
        if ((i & 16) != 0) {
            str5 = receiptStore.phone;
        }
        String str6 = str5;
        String str7 = str3;
        return receiptStore.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDivision() {
        return this.division;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final ReceiptStore copy(@NotNull String name, @NotNull String id, @NotNull String address, @NotNull String division, @NotNull String phone) {
        Intrinsics.h(name, "name");
        Intrinsics.h(id, "id");
        Intrinsics.h(address, "address");
        Intrinsics.h(division, "division");
        Intrinsics.h(phone, "phone");
        return new ReceiptStore(name, id, address, division, phone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiptStore)) {
            return false;
        }
        ReceiptStore receiptStore = (ReceiptStore) other;
        return Intrinsics.c(this.name, receiptStore.name) && Intrinsics.c(this.id, receiptStore.id) && Intrinsics.c(this.address, receiptStore.address) && Intrinsics.c(this.division, receiptStore.division) && Intrinsics.c(this.phone, receiptStore.phone);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
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

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return this.phone.hashCode() + b.c(b.c(b.c(this.name.hashCode() * 31, 31, this.id), 31, this.address), 31, this.division);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.id;
        String str3 = this.address;
        String str4 = this.division;
        String str5 = this.phone;
        StringBuilder sbV = a.v("ReceiptStore(name=", str, ", id=", str2, ", address=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", division=", str4, ", phone=");
        return a.o(sbV, str5, ")");
    }

    public /* synthetic */ ReceiptStore(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
