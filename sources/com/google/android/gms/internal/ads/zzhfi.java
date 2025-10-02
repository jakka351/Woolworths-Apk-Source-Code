package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzhfi implements zzgpx {
    private final zzgwf zza;
    private final byte[] zzb;

    private zzhfi(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zza = new zzgwf(bArr);
        this.zzb = bArr2;
    }

    public static zzgpx zzb(zzgsv zzgsvVar) throws GeneralSecurityException {
        return new zzhfi(zzgsvVar.zzd().zzc(zzgqc.zza()), zzgsvVar.zzb().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.zza.zzb(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
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
