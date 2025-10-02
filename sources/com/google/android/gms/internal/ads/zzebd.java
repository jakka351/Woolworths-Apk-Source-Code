package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzebd implements zzhpx {
    private final zzhqg zza;

    private zzebd(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzebd zzc(zzhqg zzhqgVar) {
        return new zzebd(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzebc zzb() {
        return new zzebc(((zzchd) this.zza).zza());
    }
}
