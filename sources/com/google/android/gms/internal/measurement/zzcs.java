package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzcs extends zzbl implements zzcu {
    public zzcs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, bundle);
        zzc(1, parcelZza);
    }
}
