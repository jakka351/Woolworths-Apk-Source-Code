package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzml implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznl zzb;

    public zzml(zznl zznlVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            c.C(zznlVar.zzu, "Failed to send app backgrounded");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            zzgbVarZzZ.zzA(zzrVar);
            zznlVar.zzV();
        } catch (RemoteException e) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to send app backgrounded to the service", e);
        }
    }
}
