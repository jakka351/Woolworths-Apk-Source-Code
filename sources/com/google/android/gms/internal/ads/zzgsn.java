package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzgsn extends zzgrf {
    private final zzgsu zza;
    private final zzhgh zzb;
    private final zzhgg zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzgsn(zzgsu zzgsuVar, zzhgh zzhghVar, zzhgg zzhggVar, Integer num, byte[] bArr) {
        this.zza = zzgsuVar;
        this.zzb = zzhghVar;
        this.zzc = zzhggVar;
        this.zzd = num;
    }

    public static zzgsm zzc() {
        return new zzgsm(null);
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

    public final zzgsu zze() {
        return this.zza;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzd;
    }
}
