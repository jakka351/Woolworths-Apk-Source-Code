package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes5.dex */
public final class zzdev extends zzdbq {
    private boolean zzb;

    public zzdev(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdeu.zza);
    }

    public final void zzb() {
        zzs(zzdeq.zza);
    }

    public final synchronized void zzc() {
        zzs(zzder.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        try {
            if (!this.zzb) {
                zzs(zzdet.zza);
                this.zzb = true;
            }
            zzs(zzdes.zza);
        } catch (Throwable th) {
            throw th;
        }
    }
}
