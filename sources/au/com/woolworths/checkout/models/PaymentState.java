package au.com.woolworths.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.foundation.shop.model.checkout.CheckoutError;
import au.com.woolworths.foundation.shop.model.checkout.CheckoutErrorKt;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class PaymentState implements Parcelable {
    public static final Parcelable.Creator<PaymentState> CREATOR = new Parcelable.Creator<PaymentState>() { // from class: au.com.woolworths.checkout.models.PaymentState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentState createFromParcel(Parcel parcel) {
            return new PaymentState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentState[] newArray(int i) {
            return new PaymentState[i];
        }
    };

    @SerializedName("canProceedToPayment")
    private boolean canProceedToPayment;

    @SerializedName("errors")
    private List<CheckoutError> errors;

    @SerializedName("total")
    private float total;

    @SerializedName("totalRemaining")
    private float totalRemaining;

    public PaymentState() {
    }

    public static boolean doesPaymentStateHaveInvalidWindowError(PaymentState paymentState) {
        return CheckoutErrorKt.a(paymentState.errors);
    }

    public static boolean isPaymentStateValid(PaymentState paymentState) {
        List<CheckoutError> list = paymentState.errors;
        return (list == null || list.size() == 0) && paymentState.canProceedToPayment;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<CheckoutError> getErrors() {
        return this.errors;
    }

    public float getTotal() {
        return this.total;
    }

    public float getTotalRemaining() {
        return this.totalRemaining;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.canProceedToPayment ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.total);
        parcel.writeFloat(this.totalRemaining);
        parcel.writeList(this.errors);
    }

    public PaymentState(Parcel parcel) {
        this.canProceedToPayment = parcel.readByte() != 0;
        this.total = parcel.readFloat();
        this.totalRemaining = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.errors = arrayList;
        parcel.readList(arrayList, CheckoutError.class.getClassLoader());
    }
}
