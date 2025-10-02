package com.google.crypto.tink.subtle;

import YU.a;
import com.google.crypto.tink.DeterministicAead;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqql;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class AesSiv implements DeterministicAead {
    public static final List c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public final AesCmac f15139a;
    public final byte[] b;

    public AesSiv(byte[] bArr) throws InvalidKeyException {
        if (!c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(a.m(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f15139a = new AesCmac(bArrCopyOfRange, 16);
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) EngineFactory.e.a(lqlqqql.c0063cccc0063);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null) {
            try {
                Class.forName("android.app.Application", false, null);
                bArrDoFinal = new byte[0];
            } catch (Exception unused) {
            }
        }
        if (Bytes.b(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) EngineFactory.e.a(lqlqqql.c0063cccc0063);
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        return Bytes.a(bArrC, cipher.doFinal(bArr));
    }

    public final byte[] c(byte[]... bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
        byte[] bArrE;
        int length = bArr.length;
        AesCmac aesCmac = this.f15139a;
        if (length == 0) {
            return aesCmac.b(e);
        }
        byte[] bArrB = aesCmac.b(d);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrB = Bytes.e(AesUtil.a(bArrB), aesCmac.b(bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            bArrE = Bytes.f(bArr3, bArrB);
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrE = Bytes.e(bArrCopyOf, AesUtil.a(bArrB));
        }
        return aesCmac.b(bArrE);
    }
}
