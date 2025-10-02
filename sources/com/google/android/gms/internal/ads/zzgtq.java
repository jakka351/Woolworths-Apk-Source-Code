package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzgtq extends zzgrf {
    private final zzgtu zza;
    private final zzhgg zzb;

    @Nullable
    private final Integer zzc;

    private zzgtq(zzgtu zzgtuVar, zzhgg zzhggVar, @Nullable Integer num) {
        this.zza = zzgtuVar;
        this.zzb = zzhggVar;
        this.zzc = num;
    }

    public static zzgtq zzc(zzgtu zzgtuVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhgg zzhggVarZzb;
        if (zzgtuVar.zzc() == zzgtt.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzhggVarZzb = zzgyp.zza;
        } else {
            if (zzgtuVar.zzc() != zzgtt.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzgtuVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzhggVarZzb = zzgyp.zzb(num.intValue());
        }
        return new zzgtq(zzgtuVar, zzhggVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgrf, com.google.android.gms.internal.ads.zzgqd
    public final /* synthetic */ zzgqs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrf
    public final zzhgg zzb() {
        return this.zzb;
    }

    public final zzgtu zzd() {
        return this.zza;
    }

    public final Integer zze() {
        return this.zzc;
    }
}
