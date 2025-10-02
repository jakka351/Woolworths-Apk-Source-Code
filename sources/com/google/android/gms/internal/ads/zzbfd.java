package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzbfd extends zzaxz implements IInterface {
    public zzbfd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbtzVar);
        zzdf(1, parcelZza);
    }
}
