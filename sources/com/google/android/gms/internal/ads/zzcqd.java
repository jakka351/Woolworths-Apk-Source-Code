package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzcqd implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcqd(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcqd zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcqd(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcqc zzb() {
        return new zzcqc(((zzcpi) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
