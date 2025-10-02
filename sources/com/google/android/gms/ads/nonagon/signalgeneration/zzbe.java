package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzddr;
import com.google.android.gms.internal.ads.zzfgc;
import com.google.android.gms.internal.ads.zzgpd;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* loaded from: classes5.dex */
public final class zzbe implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzbe(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar4;
    }

    public static zzbe zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzbe(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj = (zzw) this.zza.zzb();
        Object obj2 = (zzbl) this.zzb.zzb();
        zzgpd zzgpdVarZzc = zzfgc.zzc();
        if (((Integer) this.zzc.zzb()).intValue() == 2) {
            obj = obj2;
        }
        return new zzddr(obj, zzgpdVarZzc);
    }
}
