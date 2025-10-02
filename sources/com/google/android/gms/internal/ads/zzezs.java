package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzezs implements zzfab {
    private final zzfab zza;

    @Nullable
    private zzcuz zzb;

    public zzezs(zzfab zzfabVar) {
        this.zza = zzfabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    @Nullable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zzb;
    }

    public final synchronized ListenableFuture zzb(zzfac zzfacVar, zzfaa zzfaaVar, @Nullable zzcuz zzcuzVar) {
        zzbuv zzbuvVar;
        this.zzb = zzcuzVar;
        if (zzcuzVar == null || (zzbuvVar = zzfacVar.zza) == null) {
            return ((zzezr) this.zza).zzb(zzfacVar, zzfaaVar, zzcuzVar);
        }
        zzcrw zzcrwVarZza = zzcuzVar.zza();
        return zzcrwVarZza.zzc(zzcrwVarZza.zza(zzgot.zza(zzbuvVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfac zzfacVar, zzfaa zzfaaVar, @Nullable Object obj) {
        return zzb(zzfacVar, zzfaaVar, null);
    }
}
