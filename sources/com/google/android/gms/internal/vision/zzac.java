package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes5.dex */
public final class zzac extends zzb implements zzad {
    public zzac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    @Override // com.google.android.gms.internal.vision.zzad
    public final zzah[] zza(IObjectWrapper iObjectWrapper, zzs zzsVar, zzaj zzajVar) throws RemoteException {
        Parcel parcelA_ = a_();
        zzd.zza(parcelA_, iObjectWrapper);
        zzd.zza(parcelA_, zzsVar);
        zzd.zza(parcelA_, zzajVar);
        Parcel parcelZza = zza(3, parcelA_);
        zzah[] zzahVarArr = (zzah[]) parcelZza.createTypedArray(zzah.CREATOR);
        parcelZza.recycle();
        return zzahVarArr;
    }

    @Override // com.google.android.gms.internal.vision.zzad
    public final void zzb() throws RemoteException {
        zzb(2, a_());
    }
}
