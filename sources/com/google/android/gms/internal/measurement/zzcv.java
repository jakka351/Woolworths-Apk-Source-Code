package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzcv extends zzbl implements zzcx {
    public zzcv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzcx
    public final void zze() throws RemoteException {
        zzd(2, zza());
    }
}
