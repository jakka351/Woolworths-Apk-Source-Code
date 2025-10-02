package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzguk extends zzgrf {
    private final zzgup zza;
    private final zzhgh zzb;
    private final zzhgg zzc;

    @Nullable
    private final Integer zzd;

    private zzguk(zzgup zzgupVar, zzhgh zzhghVar, zzhgg zzhggVar, @Nullable Integer num) {
        this.zza = zzgupVar;
        this.zzb = zzhghVar;
        this.zzc = zzhggVar;
        this.zzd = num;
    }

    public static zzguk zzc(zzgup zzgupVar, zzhgh zzhghVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhgg zzhggVarZzb;
        zzguo zzguoVarZzc = zzgupVar.zzc();
        zzguo zzguoVar = zzguo.zzb;
        if (zzguoVarZzc != zzguoVar && num == null) {
            String string = zzgupVar.zzc().toString();
            throw new GeneralSecurityException(YU.a.p(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzgupVar.zzc() == zzguoVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhghVar.zzd() != 32) {
            int iZzd = zzhghVar.zzd();
            throw new GeneralSecurityException(YU.a.n(new StringBuilder(String.valueOf(iZzd).length() + 68), "XAesGcmKey key must be constructed with key of length 32 bytes, not ", iZzd));
        }
        if (zzgupVar.zzc() == zzguoVar) {
            zzhggVarZzb = zzgyp.zza;
        } else {
            if (zzgupVar.zzc() != zzguo.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgupVar.zzc().toString()));
            }
            zzhggVarZzb = zzgyp.zzb(num.intValue());
        }
        return new zzguk(zzgupVar, zzhghVar, zzhggVarZzb, num);
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

    public final zzgup zze() {
        return this.zza;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzd;
    }
}
