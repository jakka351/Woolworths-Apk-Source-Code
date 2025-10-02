package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Mac;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class AesCmac implements Mac {

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f15131a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public AesCmac(byte[] bArr, int i) throws InvalidKeyException, InvalidAlgorithmParameterException {
        Validators.a(bArr.length);
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        }
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f15131a = secretKeySpec;
        this.b = i;
        Cipher cipher = (Cipher) EngineFactory.e.a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrA = AesUtil.a(cipher.doFinal(new byte[16]));
        this.c = bArrA;
        this.d = AesUtil.a(bArrA);
    }

    @Override // com.google.crypto.tink.Mac
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!Bytes.b(bArr, b(bArr2))) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.crypto.tink.Mac
    public final byte[] b(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
        byte[] bArrE;
        Cipher cipher = (Cipher) EngineFactory.e.a("AES/ECB/NoPadding");
        cipher.init(1, this.f15131a);
        int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrE = Bytes.d((iMax - 1) * 16, 0, 16, bArr, this.c);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrE = Bytes.e(bArrCopyOf, this.d);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i = 0; i < iMax - 1; i++) {
            bArrDoFinal = cipher.doFinal(Bytes.d(0, i * 16, 16, bArrDoFinal, bArr));
        }
        byte[] bArrE2 = Bytes.e(bArrE, bArrDoFinal);
        int i2 = this.b;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(cipher.doFinal(bArrE2), 0, bArr2, 0, i2);
        return bArr2;
    }
}
