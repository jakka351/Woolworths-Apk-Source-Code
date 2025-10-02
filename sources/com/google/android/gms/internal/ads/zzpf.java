package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzpf {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpf zza(boolean z) {
        this.zza = true;
        return this;
    }

    public final zzpf zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzpf zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzpg zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpg(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final /* synthetic */ boolean zze() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
