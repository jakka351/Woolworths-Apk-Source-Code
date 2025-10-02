package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzezr implements zzfab {

    @Nullable
    private zzcuz zza;

    @Override // com.google.android.gms.internal.ads.zzfab
    @Nullable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zza;
    }

    public final synchronized ListenableFuture zzb(zzfac zzfacVar, zzfaa zzfaaVar, @Nullable zzcuz zzcuzVar) {
        zzcrw zzcrwVarZza;
        try {
            if (zzcuzVar != null) {
                this.zza = zzcuzVar;
            } else {
                this.zza = (zzcuz) zzfaaVar.zza(zzfacVar.zzb).zzh();
            }
            zzcrwVarZza = this.zza.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zzcrwVarZza.zzc(zzcrwVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfac zzfacVar, zzfaa zzfaaVar, @Nullable Object obj) {
        return zzb(zzfacVar, zzfaaVar, null);
    }
}
