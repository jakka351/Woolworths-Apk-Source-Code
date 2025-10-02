package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PayPalCreditFinancing implements Parcelable {
    public static final Parcelable.Creator<PayPalCreditFinancing> CREATOR = new AnonymousClass1();
    public boolean d;
    public PayPalCreditFinancingAmount e;
    public boolean f;
    public int g;
    public PayPalCreditFinancingAmount h;
    public PayPalCreditFinancingAmount i;

    /* renamed from: com.braintreepayments.api.PayPalCreditFinancing$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PayPalCreditFinancing> {
        @Override // android.os.Parcelable.Creator
        public final PayPalCreditFinancing createFromParcel(Parcel parcel) {
            PayPalCreditFinancing payPalCreditFinancing = new PayPalCreditFinancing();
            payPalCreditFinancing.d = parcel.readByte() != 0;
            payPalCreditFinancing.e = (PayPalCreditFinancingAmount) parcel.readParcelable(PayPalCreditFinancingAmount.class.getClassLoader());
            payPalCreditFinancing.f = parcel.readByte() != 0;
            payPalCreditFinancing.g = parcel.readInt();
            payPalCreditFinancing.h = (PayPalCreditFinancingAmount) parcel.readParcelable(PayPalCreditFinancingAmount.class.getClassLoader());
            payPalCreditFinancing.i = (PayPalCreditFinancingAmount) parcel.readParcelable(PayPalCreditFinancingAmount.class.getClassLoader());
            return payPalCreditFinancing;
        }

        @Override // android.os.Parcelable.Creator
        public final PayPalCreditFinancing[] newArray(int i) {
            return new PayPalCreditFinancing[i];
        }
    }

    public static PayPalCreditFinancing a(JSONObject jSONObject) {
        PayPalCreditFinancing payPalCreditFinancing = new PayPalCreditFinancing();
        if (jSONObject == null) {
            return payPalCreditFinancing;
        }
        payPalCreditFinancing.d = jSONObject.optBoolean("cardAmountImmutable", false);
        payPalCreditFinancing.e = PayPalCreditFinancingAmount.a(jSONObject.optJSONObject("monthlyPayment"));
        payPalCreditFinancing.f = jSONObject.optBoolean("payerAcceptance", false);
        payPalCreditFinancing.g = jSONObject.optInt("term", 0);
        payPalCreditFinancing.h = PayPalCreditFinancingAmount.a(jSONObject.optJSONObject("totalCost"));
        payPalCreditFinancing.i = PayPalCreditFinancingAmount.a(jSONObject.optJSONObject("totalInterest"));
        return payPalCreditFinancing;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.e, i);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
    }
}
