package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzbgz extends zzaya implements zzbha {
    public zzbgz() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbha zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof zzbha ? (zzbha) iInterfaceQueryLocalInterface : new zzbgy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbgq zzbgoVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbgoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbgoVar = iInterfaceQueryLocalInterface instanceof zzbgq ? (zzbgq) iInterfaceQueryLocalInterface : new zzbgo(strongBinder);
        }
        String string = parcel.readString();
        zzayb.zzh(parcel);
        zze(zzbgoVar, string);
        parcel2.writeNoException();
        return true;
    }
}
