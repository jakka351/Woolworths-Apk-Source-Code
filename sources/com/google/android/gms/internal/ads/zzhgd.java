package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class zzhgd implements zzgqr {
    private static final byte[] zza = {0};
    private final zzhbw zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzhgd(zzgzw zzgzwVar) throws GeneralSecurityException {
        this.zzb = zzhga.zzb(zzhbu.zzb(zzhbv.zzb(zzgzwVar.zze().zzc()), zzgzwVar.zzc()));
        this.zzc = zzgzwVar.zze().zzd();
        this.zzd = zzgzwVar.zzd().zzc();
        if (zzgzwVar.zze().zzf().equals(zzhac.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgqr zza(zzgzw zzgzwVar) throws GeneralSecurityException {
        return new zzhgd(zzgzwVar);
    }

    public static zzgqr zzb(zzhai zzhaiVar) throws GeneralSecurityException {
        return new zzhgd(zzhaiVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzhfh.zza(this.zzd, this.zzb.zza(zzhfh.zza(bArr, bArr2), this.zzc)) : zzhfh.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzhgd(zzhai zzhaiVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zzhaiVar.zze().zzg());
        this.zzb = new zzhgc("HMAC".concat(strValueOf), new SecretKeySpec(zzhaiVar.zzc().zzc(zzgqc.zza()), "HMAC"));
        this.zzc = zzhaiVar.zze().zzd();
        this.zzd = zzhaiVar.zzd().zzc();
        if (zzhaiVar.zze().zzf().equals(zzhaq.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzhgd(zzhbw zzhbwVar, int i) throws GeneralSecurityException {
        this.zzb = zzhbwVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzhbwVar.zza(new byte[0], i);
    }
}
