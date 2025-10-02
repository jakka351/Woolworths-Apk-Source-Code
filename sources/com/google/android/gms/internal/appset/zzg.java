package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzg extends zza implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(com.google.android.gms.appset.zza zzaVar, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, zzaVar);
        zzc.zzc(parcelZza, zzfVar);
        zzb(1, parcelZza);
    }
}
