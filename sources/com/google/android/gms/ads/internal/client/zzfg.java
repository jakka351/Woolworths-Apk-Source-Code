package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzfg implements Runnable {
    final /* synthetic */ zzfh zza;

    public zzfg(zzfh zzfhVar) {
        Objects.requireNonNull(zzfhVar);
        this.zza = zzfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfi zzfiVar = this.zza.zza;
        if (zzfiVar.zzc() != null) {
            try {
                zzfiVar.zzc().zzc(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
