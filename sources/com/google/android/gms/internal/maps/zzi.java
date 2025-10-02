package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.PinConfig;

/* loaded from: classes5.dex */
public final class zzi extends zza implements zzk {
    public zzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzd() throws RemoteException {
        return a.i(zzJ(4, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zze(float f) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        return a.i(zzJ(5, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return a.i(zzJ(2, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzg(Bitmap bitmap) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bitmap);
        return a.i(zzJ(6, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return a.i(zzJ(3, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return a.i(zzJ(7, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzj(PinConfig pinConfig) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, pinConfig);
        return a.i(zzJ(8, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzk(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        return a.i(zzJ(1, parcelZza));
    }
}
