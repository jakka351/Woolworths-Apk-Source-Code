package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzbip implements zzgoq {
    final /* synthetic */ zzcek zza;

    public zzbip(zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcek zzcekVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzcekVar.getContext(), zzcekVar.zzs().afmaVersion, str, null, zzcekVar.zzC() != null ? zzcekVar.zzC().zzax : null).zzb();
    }
}
