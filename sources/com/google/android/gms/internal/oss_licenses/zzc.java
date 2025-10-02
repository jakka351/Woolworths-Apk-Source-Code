package com.google.android.gms.internal.oss_licenses;

/* loaded from: classes5.dex */
final class zzc extends zzj {
    Object zza;

    public zzc(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.oss_licenses.zzj
    public final boolean zza(Object obj) {
        return super.zza(obj);
    }

    @Override // com.google.android.gms.internal.oss_licenses.zzj
    public final boolean zzb(Throwable th) {
        return super.zzb(th);
    }

    @Override // com.google.android.gms.internal.oss_licenses.zzj
    public final void zzc() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.oss_licenses.zzj
    public final String zzd() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }
}
