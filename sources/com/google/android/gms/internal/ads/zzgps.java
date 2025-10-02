package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes5.dex */
final class zzgps extends zzgok implements RunnableFuture {
    private volatile zzgpa zza;

    public zzgps(zzgoa zzgoaVar) {
        this.zza = new zzgpq(this, zzgoaVar);
    }

    public static zzgps zze(Runnable runnable, Object obj) {
        return new zzgps(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgpa zzgpaVar = this.zza;
        if (zzgpaVar != null) {
            zzgpaVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzc() {
        zzgpa zzgpaVar;
        if (zzj() && (zzgpaVar = this.zza) != null) {
            zzgpaVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        zzgpa zzgpaVar = this.zza;
        if (zzgpaVar == null) {
            return super.zzd();
        }
        String string = zzgpaVar.toString();
        return YU.a.p(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    public zzgps(Callable callable) {
        this.zza = new zzgpr(this, callable);
    }
}
