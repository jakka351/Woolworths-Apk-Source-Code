package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzw extends com.google.android.gms.internal.maps.zzb implements zzx {
    public zzw() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzn zznVarZzb = com.google.android.gms.internal.maps.zzm.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zznVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
