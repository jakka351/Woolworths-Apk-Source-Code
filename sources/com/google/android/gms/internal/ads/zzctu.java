package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzctu implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzctu(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzctu zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzctu(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddr((zzdaj) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
