package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzcaa implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcah zzc;

    public zzcaa(zzcah zzcahVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzcahVar);
        this.zzc = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcah zzcahVar = this.zzc;
        if (zzcahVar.zzt() != null) {
            zzcahVar.zzt().zzf(this.zza, this.zzb);
        }
    }
}
