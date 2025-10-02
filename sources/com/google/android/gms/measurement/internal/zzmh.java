package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzmh implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznl zzb;

    public zzmh(zznl zznlVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            c.w(zznlVar.zzu, "Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            zzgbVarZzZ.zzt(zzrVar);
        } catch (RemoteException e) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to reset data on the service: remote exception", e);
        }
        this.zzb.zzV();
    }
}
