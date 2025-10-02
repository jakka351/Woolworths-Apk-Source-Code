package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PayPalCreditFinancingAmount implements Parcelable {
    public static final Parcelable.Creator<PayPalCreditFinancingAmount> CREATOR = new AnonymousClass1();
    public String d;
    public String e;

    /* renamed from: com.braintreepayments.api.PayPalCreditFinancingAmount$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PayPalCreditFinancingAmount> {
        @Override // android.os.Parcelable.Creator
        public final PayPalCreditFinancingAmount createFromParcel(Parcel parcel) {
            PayPalCreditFinancingAmount payPalCreditFinancingAmount = new PayPalCreditFinancingAmount();
            payPalCreditFinancingAmount.d = parcel.readString();
            payPalCreditFinancingAmount.e = parcel.readString();
            return payPalCreditFinancingAmount;
        }

        @Override // android.os.Parcelable.Creator
        public final PayPalCreditFinancingAmount[] newArray(int i) {
            return new PayPalCreditFinancingAmount[i];
        }
    }

    public static PayPalCreditFinancingAmount a(JSONObject jSONObject) {
        PayPalCreditFinancingAmount payPalCreditFinancingAmount = new PayPalCreditFinancingAmount();
        if (jSONObject == null) {
            return payPalCreditFinancingAmount;
        }
        payPalCreditFinancingAmount.d = Json.a(jSONObject, "currency", null);
        payPalCreditFinancingAmount.e = Json.a(jSONObject, "value", null);
        return payPalCreditFinancingAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return androidx.camera.core.impl.b.o(this.e, " ", this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
