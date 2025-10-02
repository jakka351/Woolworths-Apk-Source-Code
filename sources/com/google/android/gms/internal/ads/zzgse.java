package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzgse extends zzgrf {
    private final zzgsl zza;
    private final zzhgh zzb;
    private final zzhgg zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzgse(zzgsl zzgslVar, zzhgh zzhghVar, zzhgg zzhggVar, Integer num, byte[] bArr) {
        this.zza = zzgslVar;
        this.zzb = zzhghVar;
        this.zzc = zzhggVar;
        this.zzd = num;
    }

    public static zzgsd zzc() {
        return new zzgsd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrf, com.google.android.gms.internal.ads.zzgqd
    public final /* synthetic */ zzgqs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrf
    public final zzhgg zzb() {
        return this.zzc;
    }

    public final zzhgh zzd() {
        return this.zzb;
    }

    public final zzgsl zze() {
        return this.zza;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzd;
    }
}
