package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zbb();
        } else {
            if (i != 2) {
                return false;
            }
            zbc();
        }
        return true;
    }
}
