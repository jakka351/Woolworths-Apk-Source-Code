package com.google.crypto.tink.subtle;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqql;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class AesCtrJceCipher implements IndCpaCipher {
    public static final ThreadLocal d = new AnonymousClass1();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f15134a;
    public final int b;
    public final int c;

    /* renamed from: com.google.crypto.tink.subtle.AesCtrJceCipher$1, reason: invalid class name */
    public class AnonymousClass1 extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return (Cipher) EngineFactory.e.a(lqlqqql.c0063cccc0063);
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public AesCtrJceCipher(byte[] bArr, int i) throws GeneralSecurityException {
        Validators.a(bArr.length);
        this.f15134a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) d.get()).getBlockSize();
        this.c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.b;
        if (length > Integer.MAX_VALUE - i) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i));
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] bArrA = Random.a(i);
        System.arraycopy(bArrA, 0, bArr2, 0, i);
        c(bArr, 0, bArr.length, bArr2, this.b, bArrA, true);
        return bArr2;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.b;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int length2 = bArr.length;
        int i2 = this.b;
        byte[] bArr3 = new byte[length2 - i2];
        c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) d.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f15134a;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
