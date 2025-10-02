package au.com.woolworths.base.wallet.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/ScanResult;", "Landroid/os/Parcelable;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScanResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScanResult> CREATOR = new Creator();
    public final String d;
    public final Integer e;
    public final Integer f;
    public final String g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScanResult> {
        @Override // android.os.Parcelable.Creator
        public final ScanResult createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ScanResult(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ScanResult[] newArray(int i) {
            return new ScanResult[i];
        }
    }

    public ScanResult(String cardNumber, Integer num, Integer num2, String str) {
        Intrinsics.h(cardNumber, "cardNumber");
        this.d = cardNumber;
        this.e = num;
        this.f = num2;
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanResult)) {
            return false;
        }
        ScanResult scanResult = (ScanResult) obj;
        return Intrinsics.c(this.d, scanResult.d) && Intrinsics.c(this.e, scanResult.e) && Intrinsics.c(this.f, scanResult.f) && Intrinsics.c(this.g, scanResult.g);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.g;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ScanResult(cardNumber=" + this.d + ", expiryMonth=" + this.e + ", expiryYear=" + this.f + ", cvv=" + this.g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.f;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.g);
    }
}
