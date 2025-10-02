package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes5.dex */
abstract class zzhu {
    int[] zza;
    private final int zzb;

    public zzhu(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhp.zza(bArr);
        this.zzb = i;
    }

    public abstract int zza();

    public final ByteBuffer zza(byte[] bArr, int i) {
        int[] iArrZza = zza(zzhp.zza(bArr), i);
        int[] iArr = (int[]) iArrZza.clone();
        zzhp.zza(iArr);
        for (int i2 = 0; i2 < iArrZza.length; i2++) {
            iArrZza[i2] = iArrZza[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] zza(int[] iArr, int i);

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == zza()) {
            int iRemaining = byteBuffer2.remaining();
            int i = iRemaining / 64;
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                ByteBuffer byteBufferZza = zza(bArr, this.zzb + i3);
                if (i3 == i) {
                    zzyz.zza(byteBuffer, byteBuffer2, byteBufferZza, iRemaining % 64);
                } else {
                    zzyz.zza(byteBuffer, byteBuffer2, byteBufferZza, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException(a.d(zza(), "The nonce length (in bytes) must be "));
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
