package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzaoa implements zzacu {
    private zzacx zza;
    private zzaeb zzb;
    private zzanx zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return zzaod.zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza = zzacxVar;
        this.zzb = zzacxVar.zzu(0, 1);
        zzacxVar.zzv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzg(com.google.android.gms.internal.ads.zzacv r19, com.google.android.gms.internal.ads.zzads r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoa.zzg(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzads):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzanx zzanxVar = this.zze;
        if (zzanxVar != null) {
            zzanxVar.zza(j2);
        }
    }
}
