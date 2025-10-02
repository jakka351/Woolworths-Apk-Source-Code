package com.google.android.gms.oss.licenses;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzb extends com.google.android.gms.internal.oss_licenses.zza implements IInterface {
    public zzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.oss.licenses.IOSSLicenseService");
    }

    public final String zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(2, parcelZza);
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    public final String zzd(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(4, parcelZza);
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    public final List zze(List list) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeList(list);
        Parcel parcelZzb = zzb(5, parcelZza);
        ArrayList arrayListZza = com.google.android.gms.internal.oss_licenses.zzb.zza(parcelZzb);
        parcelZzb.recycle();
        return arrayListZza;
    }
}
