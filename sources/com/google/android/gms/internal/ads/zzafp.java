package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzafp implements zzacx {
    private final long zzb;
    private final zzacx zzc;

    public zzafp(long j, zzacx zzacxVar) {
        this.zzb = j;
        this.zzc = zzacxVar;
    }

    public final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final zzaeb zzu(int i, int i2) {
        return this.zzc.zzu(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzw(zzadv zzadvVar) {
        this.zzc.zzw(new zzafo(this, zzadvVar, zzadvVar));
    }
}
