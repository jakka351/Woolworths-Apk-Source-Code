package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class PayPalLineItem implements Parcelable {
    public static final Parcelable.Creator<PayPalLineItem> CREATOR = new AnonymousClass1();
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;

    /* renamed from: com.braintreepayments.api.PayPalLineItem$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PayPalLineItem> {
        @Override // android.os.Parcelable.Creator
        public final PayPalLineItem createFromParcel(Parcel parcel) {
            PayPalLineItem payPalLineItem = new PayPalLineItem();
            payPalLineItem.d = parcel.readString();
            payPalLineItem.e = parcel.readString();
            payPalLineItem.f = parcel.readString();
            payPalLineItem.g = parcel.readString();
            payPalLineItem.h = parcel.readString();
            payPalLineItem.i = parcel.readString();
            payPalLineItem.j = parcel.readString();
            payPalLineItem.k = parcel.readString();
            payPalLineItem.l = parcel.readString();
            payPalLineItem.m = parcel.readString();
            payPalLineItem.n = parcel.readString();
            return payPalLineItem;
        }

        @Override // android.os.Parcelable.Creator
        public final PayPalLineItem[] newArray(int i) {
            return new PayPalLineItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
    }
}
