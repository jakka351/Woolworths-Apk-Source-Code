package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzaun implements Runnable {
    final /* synthetic */ zzauo zza;

    public zzaun(zzauo zzauoVar) {
        Objects.requireNonNull(zzauoVar);
        this.zza = zzauoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzauo zzauoVar = this.zza;
        if (zzauoVar.zzb != null) {
            return;
        }
        synchronized (zzauo.zzd) {
            if (zzauoVar.zzb != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((Boolean) zzbci.zzcQ.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzauo.zza = zzfqd.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                    z = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z = zBooleanValue;
            }
            this.zza.zzb = Boolean.valueOf(z);
            zzauo.zzd.open();
        }
    }
}
