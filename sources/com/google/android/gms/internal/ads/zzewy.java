package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzewy implements zzhpx {
    private final zzewu zza;

    private zzewy(zzewu zzewuVar) {
        this.zza = zzewuVar;
    }

    public static zzewy zzc(zzewu zzewuVar) {
        return new zzewy(zzewuVar);
    }

    public static boolean zzd(zzewu zzewuVar) {
        return zzewuVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzg());
    }
}
