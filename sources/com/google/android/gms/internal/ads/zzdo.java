package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzdo {
    public final Object zza;
    private zzq zzb = new zzq();
    private boolean zzc;
    private boolean zzd;

    public zzdo(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdo.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdo) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(zzdn zzdnVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdnVar.zza(this.zza, this.zzb.zzb());
        }
    }

    public final void zzb(int i, zzdm zzdmVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzdmVar.zza(this.zza);
    }

    public final void zzc(zzdn zzdnVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzr zzrVarZzb = this.zzb.zzb();
        this.zzb = new zzq();
        this.zzc = false;
        zzdnVar.zza(this.zza, zzrVarZzb);
    }
}
