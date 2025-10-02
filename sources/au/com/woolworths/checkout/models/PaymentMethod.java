package au.com.woolworths.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class PaymentMethod implements Parcelable {
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Parcelable.Creator<PaymentMethod>() { // from class: au.com.woolworths.checkout.models.PaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentMethod createFromParcel(Parcel parcel) {
            return new PaymentMethod(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentMethod[] newArray(int i) {
            return new PaymentMethod[i];
        }
    };

    @SerializedName("pan")
    private String pan;

    @SerializedName(TextBundle.TEXT_ENTRY)
    private String text;

    public PaymentMethod(String str, String str2) {
        this.pan = str2;
        this.text = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPan() {
        return this.pan;
    }

    public String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.pan);
    }

    public PaymentMethod(Parcel parcel) {
        this.text = parcel.readString();
        this.pan = parcel.readString();
    }
}
