package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public interface zzdgg extends zzcuy {
    @Override // com.google.android.gms.internal.ads.zzcuy
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzdgh zzh();

    zzdgg zzb(@Nullable zzezj zzezjVar);

    zzdgg zzc(@Nullable zzfaf zzfafVar);

    zzdgg zzd(zzejp zzejpVar);

    zzdgg zze(zzcvb zzcvbVar);

    zzdgg zzf(zzdbs zzdbsVar);

    @Override // com.google.android.gms.internal.ads.zzcuy
    /* bridge */ /* synthetic */ default zzcuy zzi(@Nullable zzezj zzezjVar) {
        zzb(zzezjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    /* bridge */ /* synthetic */ default zzcuy zzj(@Nullable zzfaf zzfafVar) {
        zzc(zzfafVar);
        return this;
    }
}
