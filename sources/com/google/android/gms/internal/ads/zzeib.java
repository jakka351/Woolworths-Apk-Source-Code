package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class zzeib implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeib(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeib zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeib(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeia zzb() {
        return new zzeia((Context) this.zza.zzb(), (zzdor) this.zzb.zzb());
    }
}
