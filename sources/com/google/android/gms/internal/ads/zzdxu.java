package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdxu implements zzhpx {
    private final zzhqg zza;

    private zzdxu(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdxu zzc(zzhqg zzhqgVar) {
        return new zzdxu(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzchd) this.zza).zza().getPackageName();
        zzhqf.zzb(packageName);
        return packageName;
    }
}
