package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public interface zzcnx extends zzcuy {
    @Override // com.google.android.gms.internal.ads.zzcuy
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzcny zzh();

    zzcnx zzb(@Nullable zzezj zzezjVar);

    zzcnx zzc(@Nullable zzfaf zzfafVar);

    zzcnx zzd(zzcvb zzcvbVar);

    zzcnx zze(zzdbs zzdbsVar);

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
