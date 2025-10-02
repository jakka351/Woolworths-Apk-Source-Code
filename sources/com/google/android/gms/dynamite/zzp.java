package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes5.dex */
public final class zzp extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        return a.i(zzB(2, parcelZza));
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    public final IObjectWrapper zzg(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        return a.i(zzB(4, parcelZza));
    }

    public final int zzh(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    public final int zzi() throws RemoteException {
        Parcel parcelZzB = zzB(6, zza());
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, boolean z, long j) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeLong(j);
        return a.i(zzB(7, parcelZza));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        return a.i(zzB(8, parcelZza));
    }
}
