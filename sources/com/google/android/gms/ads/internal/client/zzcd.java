package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* loaded from: classes5.dex */
public abstract class zzcd extends zzaya implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzft zzftVar = (zzft) zzayb.zzb(parcel, zzft.CREATOR);
            zzayb.zzh(parcel);
            zze(zzftVar);
        } else {
            if (i != 2) {
                return false;
            }
            zzft zzftVar2 = (zzft) zzayb.zzb(parcel, zzft.CREATOR);
            zzayb.zzh(parcel);
            zzf(zzftVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
