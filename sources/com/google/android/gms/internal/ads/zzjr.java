package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzjr implements zzkr {
    private final Object zza;
    private zzbe zzb;

    public zzjr(Object obj, zzuk zzukVar) {
        this.zza = obj;
        this.zzb = zzukVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final zzbe zzb() {
        return this.zzb;
    }

    public final void zzc(zzbe zzbeVar) {
        this.zzb = zzbeVar;
    }
}
