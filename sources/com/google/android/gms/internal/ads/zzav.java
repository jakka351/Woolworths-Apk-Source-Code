package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzav {
    private final zzq zza = new zzq();

    public final zzav zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzav zzb(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final zzav zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final zzav zzd(zzaw zzawVar) {
        zzr zzrVarZza = zzawVar.zza();
        for (int i = 0; i < zzrVarZza.zzb(); i++) {
            this.zza.zza(zzrVarZza.zzc(i));
        }
        return this;
    }

    public final zzaw zze() {
        return new zzaw(this.zza.zzb(), null);
    }
}
