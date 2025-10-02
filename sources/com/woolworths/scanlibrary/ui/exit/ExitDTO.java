package com.woolworths.scanlibrary.ui.exit;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import com.woolworths.scanlibrary.models.profile.KioskFlags;
import com.woolworths.scanlibrary.models.store.StoreCheckoutInstruction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/exit/ExitDTO;", "Landroid/os/Parcelable;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ExitDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExitDTO> CREATOR = new Creator();
    public final String d;
    public final boolean e;
    public final CartStatus f;
    public final KioskFlags g;
    public final StoreCheckoutInstruction h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExitDTO> {
        @Override // android.os.Parcelable.Creator
        public final ExitDTO createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ExitDTO(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : CartStatus.valueOf(parcel.readString()), parcel.readInt() != 0 ? KioskFlags.CREATOR.createFromParcel(parcel) : null, StoreCheckoutInstruction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ExitDTO[] newArray(int i) {
            return new ExitDTO[i];
        }
    }

    public ExitDTO(String barcode, boolean z, CartStatus cartStatus, KioskFlags kioskFlags, StoreCheckoutInstruction storeCheckoutInstruction) {
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(storeCheckoutInstruction, "storeCheckoutInstruction");
        this.d = barcode;
        this.e = z;
        this.f = cartStatus;
        this.g = kioskFlags;
        this.h = storeCheckoutInstruction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitDTO)) {
            return false;
        }
        ExitDTO exitDTO = (ExitDTO) obj;
        return Intrinsics.c(this.d, exitDTO.d) && this.e == exitDTO.e && this.f == exitDTO.f && Intrinsics.c(this.g, exitDTO.g) && Intrinsics.c(this.h, exitDTO.h);
    }

    public final int hashCode() {
        int iE = androidx.camera.core.impl.b.e(this.d.hashCode() * 31, 31, this.e);
        CartStatus cartStatus = this.f;
        int iHashCode = (iE + (cartStatus == null ? 0 : cartStatus.hashCode())) * 31;
        KioskFlags kioskFlags = this.g;
        return this.h.hashCode() + ((iHashCode + (kioskFlags != null ? kioskFlags.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("ExitDTO(barcode=", this.d, ", transferToPos=", ", cartStatus=", this.e);
        sbQ.append(this.f);
        sbQ.append(", kioskFlags=");
        sbQ.append(this.g);
        sbQ.append(", storeCheckoutInstruction=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        CartStatus cartStatus = this.f;
        if (cartStatus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cartStatus.name());
        }
        KioskFlags kioskFlags = this.g;
        if (kioskFlags == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kioskFlags.writeToParcel(dest, i);
        }
        this.h.writeToParcel(dest, i);
    }

    public /* synthetic */ ExitDTO(String str, boolean z, CartStatus cartStatus, KioskFlags kioskFlags, StoreCheckoutInstruction storeCheckoutInstruction, int i) {
        this(str, z, cartStatus, (i & 8) != 0 ? null : kioskFlags, (i & 16) != 0 ? new StoreCheckoutInstruction(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : storeCheckoutInstruction);
    }
}
