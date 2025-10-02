package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes6.dex */
public class a implements IInterface {
    public final IBinder d;
    public final String e;

    public a(IBinder iBinder, String str) {
        this.d = iBinder;
        this.e = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    public final void h1(int i, Parcel parcel) {
        try {
            this.d.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
