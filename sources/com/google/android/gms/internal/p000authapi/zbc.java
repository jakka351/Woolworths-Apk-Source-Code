package com.google.android.gms.internal.p000authapi;

import YU.a;
import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class zbc {
    static {
        zbc.class.getClassLoader();
    }

    private zbc() {
    }

    public static Parcelable zba(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void zbb(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zbc(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    public static void zbd(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(a.n(new StringBuilder(String.valueOf(iDataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }
}
