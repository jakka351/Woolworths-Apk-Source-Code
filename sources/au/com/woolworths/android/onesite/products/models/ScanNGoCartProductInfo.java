package au.com.woolworths.android.onesite.products.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/products/models/ScanNGoCartProductInfo;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScanNGoCartProductInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScanNGoCartProductInfo> CREATOR = new Creator();
    public final int d;
    public final String e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScanNGoCartProductInfo> {
        @Override // android.os.Parcelable.Creator
        public final ScanNGoCartProductInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ScanNGoCartProductInfo(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ScanNGoCartProductInfo[] newArray(int i) {
            return new ScanNGoCartProductInfo[i];
        }
    }

    public ScanNGoCartProductInfo(int i, String productId) {
        Intrinsics.h(productId, "productId");
        this.d = i;
        this.e = productId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanNGoCartProductInfo)) {
            return false;
        }
        ScanNGoCartProductInfo scanNGoCartProductInfo = (ScanNGoCartProductInfo) obj;
        return this.d == scanNGoCartProductInfo.d && Intrinsics.c(this.e, scanNGoCartProductInfo.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (Integer.hashCode(this.d) * 31);
    }

    public final String toString() {
        return "ScanNGoCartProductInfo(quantity=" + this.d + ", productId=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(this.d);
        dest.writeString(this.e);
    }
}
