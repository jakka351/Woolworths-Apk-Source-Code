package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzchl implements zzhpx {
    private final zzhqg zza;

    private zzchl(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzchl zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzchl(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbQ)).booleanValue() ? Collections.singleton(new zzddr((zzduz) this.zza.zzb(), zzfgc.zzc())) : Collections.EMPTY_SET;
        zzhqf.zzb(setSingleton);
        return setSingleton;
    }
}
