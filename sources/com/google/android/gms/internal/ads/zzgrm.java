package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzgrm extends zzgrf {
    private final zzgru zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgg zzd;

    @Nullable
    private final Integer zze;

    public /* synthetic */ zzgrm(zzgru zzgruVar, zzhgh zzhghVar, zzhgh zzhghVar2, zzhgg zzhggVar, Integer num, byte[] bArr) {
        this.zza = zzgruVar;
        this.zzb = zzhghVar;
        this.zzc = zzhghVar2;
        this.zzd = zzhggVar;
        this.zze = num;
    }

    public static zzgrl zzc() {
        return new zzgrl(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrf, com.google.android.gms.internal.ads.zzgqd
    public final /* synthetic */ zzgqs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrf
    public final zzhgg zzb() {
        return this.zzd;
    }

    public final zzhgh zzd() {
        return this.zzb;
    }

    public final zzhgh zze() {
        return this.zzc;
    }

    public final zzgru zzf() {
        return this.zza;
    }

    @Nullable
    public final Integer zzg() {
        return this.zze;
    }
}
