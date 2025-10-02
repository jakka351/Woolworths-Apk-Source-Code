package au.com.woolworths.checkout.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.utils.Objects;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public class GiftCardPayment implements Parcelable {
    public static final Parcelable.Creator<GiftCardPayment> CREATOR = new Parcelable.Creator<GiftCardPayment>() { // from class: au.com.woolworths.checkout.models.GiftCardPayment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GiftCardPayment createFromParcel(Parcel parcel) {
            return new GiftCardPayment(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GiftCardPayment[] newArray(int i) {
            return new GiftCardPayment[i];
        }
    };

    @SerializedName("Amount")
    private float mAmount;

    @SerializedName("GiftCardNumber")
    private String mGiftCardNumber;

    public /* synthetic */ GiftCardPayment(Parcel parcel, int i) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getAmount() {
        return this.mAmount;
    }

    public String getGiftCardNumber() {
        return this.mGiftCardNumber;
    }

    public long getId() {
        return Objects.a(this.mGiftCardNumber) + hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GiftCardPayment{Amount=");
        sb.append(this.mAmount);
        sb.append(", GiftCardNumber='");
        return a.o(sb, this.mGiftCardNumber, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mAmount);
        parcel.writeString(this.mGiftCardNumber);
    }

    public GiftCardPayment() {
    }

    private GiftCardPayment(Parcel parcel) {
        this.mAmount = parcel.readFloat();
        this.mGiftCardNumber = parcel.readString();
    }
}
