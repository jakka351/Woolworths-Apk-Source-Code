package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzbqy extends zzaya implements zzbqz {
    public zzbqy() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            zzayb.zzh(parcel);
            zze(string);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzayb.zzh(parcel);
            zzf(string2);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzayb.zzh(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
