package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class zzerz implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzerz(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar4;
    }

    public static zzerz zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzerz(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzerx zzb() {
        return new zzerx(zzfgc.zzc(), ((zzcoi) this.zza).zza(), (Context) this.zzb.zzb(), ((zzhqj) this.zzc).zzb());
    }
}
