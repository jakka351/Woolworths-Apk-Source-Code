package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzfts extends zzgnm {
    Object zza;

    public zzfts(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final boolean zza(Object obj) {
        return super.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final boolean zzb(Throwable th) {
        return super.zzb(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzc() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }
}
