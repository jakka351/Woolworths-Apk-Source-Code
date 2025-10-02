package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcgy implements zzhpx {
    private final zzhqg zza;

    private zzcgy(zzcgx zzcgxVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcgy zzc(zzcgx zzcgxVar, zzhqg zzhqgVar) {
        return new zzcgy(zzcgxVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.zzg zzb() {
        return ((zzbyv) this.zza.zzb()).zzo();
    }
}
