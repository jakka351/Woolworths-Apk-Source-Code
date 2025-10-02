package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzafi implements zzacu {
    private final zzef zza = new zzef(4);
    private final zzadx zzb = new zzadx(-1, -1, "image/heif");

    private final boolean zza(zzacv zzacvVar, int i) throws IOException {
        zzef zzefVar = this.zza;
        zzefVar.zza(4);
        ((zzacl) zzacvVar).zzh(zzefVar.zzi(), 0, 4, false);
        return zzefVar.zzz() == ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        ((zzacl) zzacvVar).zzj(4, false);
        return zza(zzacvVar, 1718909296) && zza(zzacvVar, 1751476579);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzb.zzf(zzacxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        return this.zzb.zzg(zzacvVar, zzadsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzb.zzh(j, j2);
    }
}
