package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzgsm {

    @Nullable
    private zzgsu zza = null;

    @Nullable
    private zzhgh zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgsm() {
    }

    public final zzgsm zza(zzgsu zzgsuVar) {
        this.zza = zzgsuVar;
        return this;
    }

    public final zzgsm zzb(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
        return this;
    }

    public final zzgsm zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgsn zzd() throws GeneralSecurityException {
        zzhgh zzhghVar;
        zzhgg zzhggVarZzb;
        zzgsu zzgsuVar = this.zza;
        if (zzgsuVar == null || (zzhghVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgsuVar.zzc() != zzhghVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgsuVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgst.zzc) {
            zzhggVarZzb = zzgyp.zza;
        } else if (this.zza.zzd() == zzgst.zzb) {
            zzhggVarZzb = zzgyp.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgst.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzhggVarZzb = zzgyp.zzb(this.zzc.intValue());
        }
        return new zzgsn(this.zza, this.zzb, zzhggVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzgsm(byte[] bArr) {
    }
}
