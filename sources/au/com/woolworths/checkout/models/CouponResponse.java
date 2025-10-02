package au.com.woolworths.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes3.dex */
public class CouponResponse {
    Success success;

    public static class Discount implements Parcelable {
        public static final String COUPON = "coupon";
        public static final Parcelable.Creator<Discount> CREATOR = new Parcelable.Creator<Discount>() { // from class: au.com.woolworths.checkout.models.CouponResponse.Discount.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Discount createFromParcel(Parcel parcel) {
                return new Discount(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Discount[] newArray(int i) {
                return new Discount[i];
            }
        };
        public static final String STORE_CREDIT = "storecredit";

        @SerializedName(alternate = {"Amount"}, value = "amount")
        float amount;

        @SerializedName(alternate = {"Source"}, value = "source")
        String source;

        public Discount() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public float getAmount() {
            return this.amount;
        }

        public String getSource() {
            return this.source;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.amount);
            parcel.writeString(this.source);
        }

        public Discount(Parcel parcel) {
            this.amount = parcel.readFloat();
            this.source = parcel.readString();
        }
    }

    public static class Success implements Parcelable {
        public static final Parcelable.Creator<Success> CREATOR = new Parcelable.Creator<Success>() { // from class: au.com.woolworths.checkout.models.CouponResponse.Success.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Success createFromParcel(Parcel parcel) {
                return new Success(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Success[] newArray(int i) {
                return new Success[i];
            }
        };
        List<Discount> discounts;
        String message;

        public Success() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.discounts);
            parcel.writeString(this.message);
        }

        public Success(Parcel parcel) {
            this.discounts = parcel.createTypedArrayList(Discount.CREATOR);
            this.message = parcel.readString();
        }
    }

    public List<Discount> getDiscounts() {
        return this.success.discounts;
    }

    public String getMessage() {
        return this.success.message;
    }
}
