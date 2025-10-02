package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgzw extends zzhat {
    private final zzhad zza;
    private final zzhgh zzb;
    private final zzhgg zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzgzw(zzhad zzhadVar, zzhgh zzhghVar, zzhgg zzhggVar, Integer num, byte[] bArr) {
        this.zza = zzhadVar;
        this.zzb = zzhghVar;
        this.zzc = zzhggVar;
        this.zzd = num;
    }

    public static zzgzv zzb() {
        return new zzgzv(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhat, com.google.android.gms.internal.ads.zzgqd
    public final /* synthetic */ zzgqs zza() {
        return this.zza;
    }

    public final zzhgh zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final zzhgg zzd() {
        return this.zzc;
    }

    public final zzhad zze() {
        return this.zza;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzd;
    }
}
