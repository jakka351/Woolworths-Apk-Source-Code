package au.com.woolworths.base.wallet.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RationaleDialogInfo;", "Landroid/os/Parcelable;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class RationaleDialogInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RationaleDialogInfo> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final boolean f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RationaleDialogInfo> {
        @Override // android.os.Parcelable.Creator
        public final RationaleDialogInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RationaleDialogInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RationaleDialogInfo[] newArray(int i) {
            return new RationaleDialogInfo[i];
        }
    }

    public RationaleDialogInfo(String str, String str2, boolean z) {
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RationaleDialogInfo)) {
            return false;
        }
        RationaleDialogInfo rationaleDialogInfo = (RationaleDialogInfo) obj;
        return Intrinsics.c(this.d, rationaleDialogInfo.d) && Intrinsics.c(this.e, rationaleDialogInfo.e) && this.f == rationaleDialogInfo.f;
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return YU.a.k(")", YU.a.v("RationaleDialogInfo(title=", this.d, ", message=", this.e, ", takeUserToSettings="), this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeInt(this.f ? 1 : 0);
    }
}
