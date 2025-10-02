package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzaof implements zzacu {
    private final zzef zza = new zzef(4);
    private final zzadx zzb = new zzadx(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzef zzefVar = this.zza;
        zzefVar.zza(4);
        zzacl zzaclVar = (zzacl) zzacvVar;
        zzaclVar.zzh(zzefVar.zzi(), 0, 4, false);
        if (zzefVar.zzz() == 1380533830) {
            zzaclVar.zzj(4, false);
            zzefVar.zza(4);
            zzaclVar.zzh(zzefVar.zzi(), 0, 4, false);
            if (zzefVar.zzz() == 1464156752) {
                return true;
            }
        }
        return false;
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
