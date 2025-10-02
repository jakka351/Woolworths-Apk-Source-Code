package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzafj implements zzacu {
    private final zzacu zza;

    public zzafj() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return this.zza.zzd(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza.zzf(zzacxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        return this.zza.zzg(zzacvVar, zzadsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zza.zzh(j, j2);
    }

    public zzafj(int i) {
        this.zza = new zzafk();
    }
}
