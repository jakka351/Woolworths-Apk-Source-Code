package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes5.dex */
public final class zzeqz implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzeqz(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzeqz zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzeqz(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeup zzeupVarZzb = ((zzete) this.zza).zzb();
        zzeup zzeupVar = (zzepd) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains("29")) {
            zzeupVarZzb = zzeupVar;
        }
        zzhqf.zzb(zzeupVarZzb);
        return zzeupVarZzb;
    }
}
