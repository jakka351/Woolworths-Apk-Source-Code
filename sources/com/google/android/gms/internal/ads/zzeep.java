package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class zzeep implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeep(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeep zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzeep(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeeo((Context) this.zza.zzb(), (zzcny) this.zzb.zzb(), zzfgc.zzc());
    }
}
