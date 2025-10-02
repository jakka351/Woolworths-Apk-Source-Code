package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class j extends b implements k {
    @Override // com.google.android.play.integrity.internal.b
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) c.a(parcel);
            c.b(parcel);
            e(bundle);
            return true;
        }
        if (i == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) c.a(parcel);
            c.b(parcel);
            c(bundle2);
            return true;
        }
        if (i == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) c.a(parcel);
            c.b(parcel);
            d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) c.a(parcel);
        c.b(parcel);
        b(bundle4);
        return true;
    }
}
