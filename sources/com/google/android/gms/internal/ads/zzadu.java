package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public class zzadu implements zzadv {
    private final long zza;
    private final zzadt zzb;

    public zzadu(long j, long j2) {
        this.zza = j;
        zzadw zzadwVar = j2 == 0 ? zzadw.zza : new zzadw(0L, j2);
        this.zzb = new zzadt(zzadwVar, zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        return this.zzb;
    }
}
