package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzaca implements zzadv {
    private final zzacd zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaca(zzacd zzacdVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.zza = zzacdVar;
        this.zzb = j;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        zzadw zzadwVar = new zzadw(j, zzacc.zza(this.zza.zza(j), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzadt(zzadwVar, zzadwVar);
    }

    public final long zzd(long j) {
        return this.zza.zza(j);
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zze;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }
}
