package au.com.woolworths.shop.digipay.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/models/PaymentInfo;", "Landroid/os/Parcelable;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentInfo> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final boolean f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentInfo> {
        @Override // android.os.Parcelable.Creator
        public final PaymentInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PaymentInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentInfo[] newArray(int i) {
            return new PaymentInfo[i];
        }
    }

    public PaymentInfo(String priceLabel, String str, boolean z) {
        Intrinsics.h(priceLabel, "priceLabel");
        this.d = priceLabel;
        this.e = str;
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
        if (!(obj instanceof PaymentInfo)) {
            return false;
        }
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        return Intrinsics.c(this.d, paymentInfo.d) && Intrinsics.c(this.e, paymentInfo.e) && this.f == paymentInfo.f;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return a.k(")", a.v("PaymentInfo(priceLabel=", this.d, ", priceCaption=", this.e, ", alwaysSaveNewCreditCard="), this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeInt(this.f ? 1 : 0);
    }
}
