package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzfle extends zzbwg {
    final /* synthetic */ zzgpm zza;
    final /* synthetic */ zzbwa zzb;
    final /* synthetic */ zzflf zzc;

    public zzfle(zzflf zzflfVar, zzgpm zzgpmVar, zzbwa zzbwaVar) {
        this.zza = zzgpmVar;
        this.zzb = zzbwaVar;
        Objects.requireNonNull(zzflfVar);
        this.zzc = zzflfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze() {
        Objects.requireNonNull(this.zzc);
        zzfjy.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzflf zzflfVar = this.zzc;
        String str = zzflfVar.zze.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        zzflfVar.zzv(zzeVar);
    }
}
