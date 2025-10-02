package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzffp {
    private final long zza;
    private long zzc;
    private final zzffo zzb = new zzffo();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzffp() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zza = jCurrentTimeMillis;
        this.zzc = jCurrentTimeMillis;
    }

    public final void zza() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
        this.zzb.zza = true;
    }

    public final void zzc() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final long zzd() {
        return this.zza;
    }

    public final long zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final zzffo zzg() {
        zzffo zzffoVar = this.zzb;
        zzffo zzffoVarClone = zzffoVar.clone();
        zzffoVar.zza = false;
        zzffoVar.zzb = 0;
        return zzffoVarClone;
    }

    public final String zzh() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }
}
