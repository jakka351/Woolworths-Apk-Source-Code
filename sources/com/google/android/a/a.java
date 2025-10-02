package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public class a implements IInterface {
    public final IBinder d;

    public a(IBinder iBinder) {
        this.d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }
}
