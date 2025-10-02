package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzewx implements zzhpx {
    private final zzewu zza;

    private zzewx(zzewu zzewuVar) {
        this.zza = zzewuVar;
    }

    public static zzewx zzc(zzewu zzewuVar) {
        return new zzewx(zzewuVar);
    }

    public static boolean zzd(zzewu zzewuVar) {
        return zzewuVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzh());
    }
}
