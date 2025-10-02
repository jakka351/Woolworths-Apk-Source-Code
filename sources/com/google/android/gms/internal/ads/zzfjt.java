package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfjt implements zzgoq {
    final /* synthetic */ zzfhr zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzcyh zzc;
    final /* synthetic */ zzfjv zzd;

    public zzfjt(zzfjv zzfjvVar, zzfhr zzfhrVar, zzfib zzfibVar, zzcyh zzcyhVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfibVar;
        this.zzc = zzcyhVar;
        Objects.requireNonNull(zzfjvVar);
        this.zzd = zzfjvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(@NonNull Throwable th) {
        zzfhr zzfhrVar = this.zza;
        if (zzfhrVar == null) {
            return;
        }
        zzfhrVar.zzd(false);
        zzfib zzfibVar = this.zzb;
        if (zzfibVar != null) {
            zzfibVar.zza(zzfhrVar);
            zzfibVar.zzh();
        } else {
            zzfjv zzfjvVar = this.zzd;
            zzfjvVar.zze().zzb(zzfhrVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    @Override // com.google.android.gms.internal.ads.zzgoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjt.zzb(java.lang.Object):void");
    }
}
