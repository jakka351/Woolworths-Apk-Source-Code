package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;

/* loaded from: classes6.dex */
public final class RsaSsaPkcs1VerifyJce implements PublicKeyVerify {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f15161a;
    public final Enums.HashType b;

    /* renamed from: com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15162a;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            f15162a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15162a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RsaSsaPkcs1VerifyJce(RSAPublicKey rSAPublicKey, Enums.HashType hashType) throws GeneralSecurityException {
        Validators.d(hashType);
        Validators.c(rSAPublicKey.getModulus().bitLength());
        this.f15161a = rSAPublicKey;
        this.b = hashType;
    }

    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA;
        RSAPublicKey rSAPublicKey = this.f15161a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrA2 = SubtleUtil.a(bigInteger.modPow(publicExponent, modulus), iBitLength);
        Enums.HashType hashType = this.b;
        Validators.d(hashType);
        MessageDigest messageDigest = (MessageDigest) EngineFactory.h.a(SubtleUtil.c(hashType));
        messageDigest.update(bArr2);
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = hashType.ordinal();
        if (iOrdinal == 1) {
            bArrA = Hex.a("3031300d060960864801650304020105000420");
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException("Unsupported hash " + hashType);
            }
            bArrA = Hex.a("3051300d060960864801650304020305000440");
        }
        int length = bArrA.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr3 = new byte[iBitLength];
        bArr3[0] = 0;
        bArr3[1] = 1;
        int i = 2;
        int i2 = 0;
        while (i2 < (iBitLength - length) - 3) {
            bArr3[i] = -1;
            i2++;
            i++;
        }
        int i3 = i + 1;
        bArr3[i] = 0;
        System.arraycopy(bArrA, 0, bArr3, i3, bArrA.length);
        System.arraycopy(bArrDigest, 0, bArr3, i3 + bArrA.length, bArrDigest.length);
        if (!Bytes.b(bArrA2, bArr3)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }
}
