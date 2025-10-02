package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzaov {
    private int zza = 2500;
    private int zzb;

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final void zzc(zzapq zzapqVar) throws zzapq {
        int i = this.zzb + 1;
        this.zzb = i;
        int i2 = this.zza;
        this.zza = i2 + i2;
        if (i > 1) {
            throw zzapqVar;
        }
    }
}
