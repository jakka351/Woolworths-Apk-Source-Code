package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzdlk implements zzgoq {
    final /* synthetic */ zzdru zza;
    final /* synthetic */ zzdln zzb;

    public zzdlk(zzdln zzdlnVar, zzdru zzdruVar) {
        this.zza = zzdruVar;
        Objects.requireNonNull(zzdlnVar);
        this.zzb = zzdlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(this.zzb.zzd().zze(), this.zza.zza());
    }
}
