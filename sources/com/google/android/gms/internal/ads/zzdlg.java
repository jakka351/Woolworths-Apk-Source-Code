package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzdlg implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdlg(zzdky zzdkyVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdlg zza(zzdky zzdkyVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdlg(zzdkyVar, zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddr(((zzdoi) this.zza).zzb(), (Executor) this.zzb.zzb());
    }
}
