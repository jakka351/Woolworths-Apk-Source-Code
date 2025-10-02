package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class PayPalRequest implements Parcelable {
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final PostalAddress h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final ArrayList m;
    public final boolean n;
    public final boolean o;

    public PayPalRequest() {
        this.g = false;
        this.f = false;
        this.m = new ArrayList();
        this.n = false;
    }

    public abstract String a(Configuration configuration, Authorization authorization, String str, String str2);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeTypedList(this.m);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
    }

    public PayPalRequest(Parcel parcel) {
        this.g = false;
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readByte() != 0;
        this.g = parcel.readByte() != 0;
        this.h = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.createTypedArrayList(PayPalLineItem.CREATOR);
        this.n = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
    }
}
