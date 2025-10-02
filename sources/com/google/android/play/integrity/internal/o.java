package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class o extends b implements p {
    @Override // com.google.android.play.integrity.internal.b
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) c.a(parcel);
        c.b(parcel);
        b(bundle);
        return true;
    }
}
