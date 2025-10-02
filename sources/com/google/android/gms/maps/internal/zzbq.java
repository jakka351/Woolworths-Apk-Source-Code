package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* loaded from: classes5.dex */
public abstract class zzbq extends com.google.android.gms.internal.maps.zzb implements zzbr {
    public zzbq() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) com.google.android.gms.internal.maps.zzc.zza(parcel, StreetViewPanoramaOrientation.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(streetViewPanoramaOrientation);
        parcel2.writeNoException();
        return true;
    }
}
