package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzaiy implements zzajf {
    private final zzaje zza;
    private final long zzb;
    private final long zzc;
    private final zzajj zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaiy(zzajj zzajjVar, long j, long j2, long j3, long j4, boolean z) {
        zzghc.zza(j >= 0 && j2 > j);
        this.zzd = zzajjVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzaje();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzajf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zza(com.google.android.gms.internal.ads.zzacv r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiy.zza(com.google.android.gms.internal.ads.zzacv):long");
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zzb(long j) {
        long j2 = this.zzf - 1;
        String str = zzeo.zza;
        this.zzh = Math.max(0L, Math.min(j, j2));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    @Nullable
    public final /* bridge */ /* synthetic */ zzadv zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzaix(this, bArr);
        }
        return null;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzajj zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzf;
    }
}
