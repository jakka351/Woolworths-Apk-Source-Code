package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzhai extends zzhat {
    private final zzhar zza;
    private final zzhgh zzb;
    private final zzhgg zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhai(zzhar zzharVar, zzhgh zzhghVar, zzhgg zzhggVar, Integer num, byte[] bArr) {
        this.zza = zzharVar;
        this.zzb = zzhghVar;
        this.zzc = zzhggVar;
        this.zzd = num;
    }

    public static zzhah zzb() {
        return new zzhah(null);
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

    public final zzhar zze() {
        return this.zza;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzd;
    }
}
