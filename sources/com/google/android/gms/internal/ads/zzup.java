package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzup {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzup(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzup)) {
            return false;
        }
        zzup zzupVar = (zzup) obj;
        return this.zza.equals(zzupVar.zza) && this.zzb == zzupVar.zzb && this.zzc == zzupVar.zzc && this.zzd == zzupVar.zzd && this.zze == zzupVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzup zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzup(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzup(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public zzup(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzup(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
