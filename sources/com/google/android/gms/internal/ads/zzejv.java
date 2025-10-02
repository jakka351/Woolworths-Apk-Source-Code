package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzejv implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdfb zza;

    public zzejv(zzejw zzejwVar, zzdfb zzdfbVar) {
        this.zza = zzdfbVar;
        Objects.requireNonNull(zzejwVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdfb zzdfbVar = this.zza;
        zzdfbVar.zzd().zza();
        zzdfbVar.zze().zza();
    }
}
