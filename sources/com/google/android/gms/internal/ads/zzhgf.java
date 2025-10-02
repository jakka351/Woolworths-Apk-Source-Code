package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzhgf implements zzgpx {
    private final zzgwi zza;
    private final byte[] zzb;

    private zzhgf(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zza = new zzgwi(bArr);
        this.zzb = bArr2;
    }

    public static zzgpx zzb(zzguq zzguqVar) throws GeneralSecurityException {
        return new zzhgf(zzguqVar.zzd().zzc(zzgqc.zza()), zzguqVar.zzb().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.zza.zzb(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzgzu.zzc(bArr3, bArr)) {
            return zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
