package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzcvg implements zzhpx {
    private final zzhqg zza;

    private zzcvg(zzcvb zzcvbVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcvg zzc(zzcvb zzcvbVar, zzhqg zzhqgVar) {
        return new zzcvg(zzcvbVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String strZzp = ((zzcsi) this.zza.zzb()).zzp();
        zzhqf.zzb(strZzp);
        return strZzp;
    }
}
