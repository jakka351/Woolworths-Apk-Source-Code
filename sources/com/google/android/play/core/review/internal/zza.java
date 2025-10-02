package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public class zza implements IInterface {
    public final IBinder d;

    public zza(IBinder iBinder) {
        this.d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }
}
