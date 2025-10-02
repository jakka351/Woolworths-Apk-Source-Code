package com.woolworths.scanlibrary.models.receipt;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/Voucher;", "Landroid/os/Parcelable;", "barcode", "", lqlqqlq.mmm006Dm006Dm, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBarcode", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Voucher implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Voucher> CREATOR = new Creator();

    @SerializedName("barcode")
    @NotNull
    private final String barcode;

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Voucher> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Voucher createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new Voucher(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Voucher[] newArray(int i) {
            return new Voucher[i];
        }
    }

    public Voucher() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Voucher copy$default(Voucher voucher, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voucher.barcode;
        }
        if ((i & 2) != 0) {
            str2 = voucher.description;
        }
        return voucher.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBarcode() {
        return this.barcode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Voucher copy(@NotNull String barcode, @NotNull String description) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(description, "description");
        return new Voucher(barcode, description);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Voucher)) {
            return false;
        }
        Voucher voucher = (Voucher) other;
        return Intrinsics.c(this.barcode, voucher.barcode) && Intrinsics.c(this.description, voucher.description);
    }

    @NotNull
    public final String getBarcode() {
        return this.barcode;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.barcode.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.j("Voucher(barcode=", this.barcode, ", description=", this.description, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.barcode);
        dest.writeString(this.description);
    }

    public Voucher(@NotNull String barcode, @NotNull String description) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(description, "description");
        this.barcode = barcode;
        this.description = description;
    }

    public /* synthetic */ Voucher(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
