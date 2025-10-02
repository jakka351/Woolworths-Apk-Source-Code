package com.woolworths.scanlibrary.models.receipt;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/Vouchers;", "Landroid/os/Parcelable;", "parking", "Lcom/woolworths/scanlibrary/models/receipt/Voucher;", "<init>", "(Lcom/woolworths/scanlibrary/models/receipt/Voucher;)V", "getParking", "()Lcom/woolworths/scanlibrary/models/receipt/Voucher;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Vouchers implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Vouchers> CREATOR = new Creator();

    @SerializedName("parking")
    @Nullable
    private final Voucher parking;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Vouchers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Vouchers createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new Vouchers(parcel.readInt() == 0 ? null : Voucher.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Vouchers[] newArray(int i) {
            return new Vouchers[i];
        }
    }

    public Vouchers(@Nullable Voucher voucher) {
        this.parking = voucher;
    }

    public static /* synthetic */ Vouchers copy$default(Vouchers vouchers, Voucher voucher, int i, Object obj) {
        if ((i & 1) != 0) {
            voucher = vouchers.parking;
        }
        return vouchers.copy(voucher);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Voucher getParking() {
        return this.parking;
    }

    @NotNull
    public final Vouchers copy(@Nullable Voucher parking) {
        return new Vouchers(parking);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Vouchers) && Intrinsics.c(this.parking, ((Vouchers) other).parking);
    }

    @Nullable
    public final Voucher getParking() {
        return this.parking;
    }

    public int hashCode() {
        Voucher voucher = this.parking;
        if (voucher == null) {
            return 0;
        }
        return voucher.hashCode();
    }

    @NotNull
    public String toString() {
        return "Vouchers(parking=" + this.parking + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        Voucher voucher = this.parking;
        if (voucher == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            voucher.writeToParcel(dest, flags);
        }
    }
}
