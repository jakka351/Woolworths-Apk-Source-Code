package com.google.crypto.tink.subtle;

import YU.a;
import com.google.crypto.tink.Aead;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class AesGcmJce implements Aead {
    public static final ThreadLocal b = new AnonymousClass1();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f15138a;

    /* renamed from: com.google.crypto.tink.subtle.AesGcmJce$1, reason: invalid class name */
    public class AnonymousClass1 extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return (Cipher) EngineFactory.e.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public AesGcmJce(byte[] bArr) throws InvalidAlgorithmParameterException {
        Validators.a(bArr.length);
        this.f15138a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(int i, byte[] bArr) throws GeneralSecurityException, ClassNotFoundException {
        try {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                return new GCMParameterSpec(128, bArr, 0, i);
            } catch (ClassNotFoundException unused) {
                Class.forName("android.app.Application", false, null);
                return new IvParameterSpec(bArr, 0, i);
            }
        } catch (Exception unused2) {
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = Random.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA.length, bArrA);
        ThreadLocal threadLocal = b;
        ((Cipher) threadLocal.get()).init(1, this.f15138a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(a.e(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(12, bArr);
        ThreadLocal threadLocal = b;
        ((Cipher) threadLocal.get()).init(2, this.f15138a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
