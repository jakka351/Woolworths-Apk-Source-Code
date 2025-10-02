package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public interface zzdhc extends zzcuy {
    @Override // com.google.android.gms.internal.ads.zzcuy
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzdhd zzh();

    zzdhc zzb(@Nullable zzezj zzezjVar);

    zzdhc zzc(@Nullable zzfaf zzfafVar);

    zzdhc zzd(zzcoh zzcohVar);

    zzdhc zze(zzdgy zzdgyVar);

    zzdhc zzf(zzcvb zzcvbVar);

    zzdhc zzg(zzdbs zzdbsVar);

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
