package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzzu {
    final /* synthetic */ zzzv zza;
    private zzu zzb;

    public /* synthetic */ zzzu(zzzv zzzvVar, byte[] bArr) {
        Objects.requireNonNull(zzzvVar);
        this.zza = zzzvVar;
    }

    public final void zza(final zzbu zzbuVar) {
        zzs zzsVar = new zzs();
        zzsVar.zzt(zzbuVar.zzb);
        zzsVar.zzu(zzbuVar.zzc);
        zzsVar.zzm("video/raw");
        this.zzb = zzsVar.zzM();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbuVar);
            }
        });
    }

    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            zzzv zzzvVar = this.zza;
            if (zzzvVar.zzA() != null) {
                zzzvVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzu zzuVarZzM = this.zzb;
        if (zzuVarZzM == null) {
            zzuVarZzM = new zzs().zzM();
        }
        zzu zzuVar = zzuVarZzM;
        zzzv zzzvVar2 = this.zza;
        zzzvVar2.zzD().zzcS(j2, j, zzuVar, null);
        ((zzabp) zzzvVar2.zzz().remove()).zza(j);
    }
}
