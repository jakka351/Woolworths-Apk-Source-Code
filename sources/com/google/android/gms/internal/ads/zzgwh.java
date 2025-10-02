package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes5.dex */
public final class zzgwh extends zzgwe {
    public zzgwh(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int[] zza(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzgwc.zza(iArr2, zzgwc.zze(this.zza, iArr));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzb() {
        return 24;
    }
}
