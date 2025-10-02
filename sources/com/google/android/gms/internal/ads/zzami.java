package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzami implements zzamd {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    @Nullable
    private final zzanv zzb;
    private zzamh zzg;
    private long zzh;
    private String zzi;
    private zzaeb zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzamg zze = new zzamg(128);
    private long zzl = -9223372036854775807L;

    @Nullable
    private final zzamu zzf = new zzamu(178, 128);

    @Nullable
    private final zzef zzc = new zzef();

    public zzami(@Nullable zzanv zzanvVar, String str) {
        this.zzb = zzanvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        zzfl.zzi(this.zzd);
        this.zze.zza();
        zzamh zzamhVar = this.zzg;
        if (zzamhVar != null) {
            zzamhVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzi = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzj = zzaebVarZzu;
        this.zzg = new zzamh(zzaebVarZzu);
        this.zzb.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0185  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzef r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzami.zzd(com.google.android.gms.internal.ads.zzef):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
        zzamh zzamhVar = this.zzg;
        zzamhVar.getClass();
        if (z) {
            zzamhVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
