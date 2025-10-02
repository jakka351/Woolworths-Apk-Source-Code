package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzamf implements zzamd {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzaeb zzb;

    @Nullable
    private final zzanv zzd;
    private final String zze;

    @Nullable
    private final zzef zzf;

    @Nullable
    private final zzamu zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzame zzi = new zzame(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    public zzamf(@Nullable zzanv zzanvVar, String str) {
        zzef zzefVar;
        this.zzd = zzanvVar;
        this.zze = str;
        if (zzanvVar != null) {
            this.zzg = new zzamu(178, 128);
            zzefVar = new zzef();
        } else {
            zzefVar = null;
            this.zzg = null;
        }
        this.zzf = zzefVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        zzfl.zzi(this.zzh);
        this.zzi.zza();
        zzamu zzamuVar = this.zzg;
        if (zzamuVar != null) {
            zzamuVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zza = zzanrVar.zzc();
        this.zzb = zzacxVar.zzu(zzanrVar.zzb(), 2);
        zzanv zzanvVar = this.zzd;
        if (zzanvVar != null) {
            zzanvVar.zza(zzacxVar, zzanrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzef r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamf.zzd(com.google.android.gms.internal.ads.zzef):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
        zzaeb zzaebVar = this.zzb;
        zzaebVar.getClass();
        if (z) {
            boolean z2 = this.zzq;
            long j = this.zzj - this.zzo;
            zzaebVar.zzx(this.zzp, z2 ? 1 : 0, (int) j, 0, null);
        }
    }
}
