package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcgt {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgt(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcgt zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new zzcgt(3, 0, 0) : zzrVar.zzi ? new zzcgt(2, 0, 0) : zzrVar.zzh ? new zzcgt(0, 0, 0) : new zzcgt(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzcgt zzb() {
        return new zzcgt(0, 0, 0);
    }

    public static zzcgt zzc(int i, int i2) {
        return new zzcgt(1, i, i2);
    }

    public static zzcgt zzd() {
        return new zzcgt(4, 0, 0);
    }

    public static zzcgt zze() {
        return new zzcgt(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
