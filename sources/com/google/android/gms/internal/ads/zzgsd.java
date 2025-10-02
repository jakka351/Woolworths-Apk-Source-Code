package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzgsd {

    @Nullable
    private zzgsl zza = null;

    @Nullable
    private zzhgh zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgsd() {
    }

    public final zzgsd zza(zzgsl zzgslVar) {
        this.zza = zzgslVar;
        return this;
    }

    public final zzgsd zzb(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
        return this;
    }

    public final zzgsd zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgse zzd() throws GeneralSecurityException {
        zzhgh zzhghVar;
        zzhgg zzhggVarZzb;
        zzgsl zzgslVar = this.zza;
        if (zzgslVar == null || (zzhghVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgslVar.zzc() != zzhghVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgslVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgsk.zzc) {
            zzhggVarZzb = zzgyp.zza;
        } else if (this.zza.zzd() == zzgsk.zzb) {
            zzhggVarZzb = zzgyp.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgsk.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzhggVarZzb = zzgyp.zzb(this.zzc.intValue());
        }
        return new zzgse(this.zza, this.zzb, zzhggVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzgsd(byte[] bArr) {
    }
}
