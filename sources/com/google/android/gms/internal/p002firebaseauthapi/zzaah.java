package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzaah {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b = (byte) (bArrCopyOf[31] & 127);
        bArrCopyOf[31] = b;
        bArrCopyOf[31] = (byte) (b | 64);
        zzng.zza(jArr, bArrCopyOf, bArr2);
        return zznm.zzc(jArr);
    }

    public static byte[] zza() {
        byte[] bArrZza = zzqd.zza(32);
        bArrZza[0] = (byte) (bArrZza[0] | 7);
        byte b = (byte) (bArrZza[31] & 63);
        bArrZza[31] = b;
        bArrZza[31] = (byte) (b | 128);
        return bArrZza;
    }

    public static byte[] zza(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
