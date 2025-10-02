package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* loaded from: classes5.dex */
public abstract class zzdm extends zzaya implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zze zzeVar = (zze) zzayb.zzb(parcel, zze.CREATOR);
        zzayb.zzh(parcel);
        zze(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}
