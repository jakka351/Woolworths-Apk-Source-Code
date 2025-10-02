package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzbvi extends zzaxz implements IInterface {
    public zzbvi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvh zzbvhVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbvhVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdf(2, parcelZza);
    }
}
