package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzdif implements zzgoq {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdip zzb;

    public zzdif(zzdip zzdipVar, String str, boolean z) {
        Objects.requireNonNull(zzdipVar);
        this.zzb = zzdipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfR)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdip zzdipVar = this.zzb;
        zzdipVar.zzZ().zzo((zzcek) obj);
        String str = this.zza;
        zzbzm zzbzmVarZzY = zzdipVar.zzZ().zzY();
        zzedu zzeduVarZzL = zzdipVar.zzL(str, true);
        if (zzeduVarZzL != null && zzbzmVarZzY != null) {
            zzbzmVarZzY.zzc(zzeduVarZzL);
        } else if (zzbzmVarZzY != null) {
            zzbzmVarZzY.cancel(false);
        }
    }
}
