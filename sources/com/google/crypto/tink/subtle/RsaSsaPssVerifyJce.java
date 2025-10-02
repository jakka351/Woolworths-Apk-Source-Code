package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class RsaSsaPssVerifyJce implements PublicKeyVerify {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f15164a;
    public final Enums.HashType b;
    public final Enums.HashType c;
    public final int d;

    public RsaSsaPssVerifyJce(RSAPublicKey rSAPublicKey, Enums.HashType hashType, Enums.HashType hashType2, int i) throws GeneralSecurityException {
        Validators.d(hashType);
        Validators.c(rSAPublicKey.getModulus().bitLength());
        this.f15164a = rSAPublicKey;
        this.b = hashType;
        this.c = hashType2;
        this.d = i;
    }

    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.f15164a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        int iBitLength2 = (modulus.bitLength() + 6) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        byte b = 1;
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrA = SubtleUtil.a(bigInteger.modPow(publicExponent, modulus), iBitLength2);
        int iBitLength3 = modulus.bitLength() - 1;
        Enums.HashType hashType = this.b;
        Validators.d(hashType);
        MessageDigest messageDigest = (MessageDigest) EngineFactory.h.a(SubtleUtil.c(hashType));
        byte[] bArrDigest = messageDigest.digest(bArr2);
        int digestLength = messageDigest.getDigestLength();
        int length = bArrA.length;
        int i = this.d;
        if (length < digestLength + i + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrA[bArrA.length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, i3);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, bArrCopyOf.length, bArrCopyOf.length + digestLength);
        int i4 = 0;
        while (true) {
            int i5 = i4;
            byte b2 = b;
            int i6 = length;
            long j = (length * 8) - iBitLength3;
            if (i4 < j) {
                if (((bArrCopyOf[i5 / 8] >> (7 - (i5 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i4 = i5 + 1;
                b = b2;
                length = i6;
            } else {
                byte[] bArrB = SubtleUtil.b(bArrCopyOfRange, i3, this.c);
                int length2 = bArrB.length;
                byte[] bArr3 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr3[i7] = (byte) (bArrB[i7] ^ bArrCopyOf[i7]);
                }
                for (int i8 = 0; i8 <= j; i8++) {
                    int i9 = i8 / 8;
                    bArr3[i9] = (byte) ((~(b2 << (7 - (i8 % 8)))) & bArr3[i9]);
                }
                int i10 = 0;
                while (true) {
                    int i11 = (i2 - i) - 2;
                    if (i10 >= i11) {
                        if (bArr3[i11] != b2) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, length2 - i, length2);
                        int i12 = digestLength + 8;
                        byte[] bArr4 = new byte[i + i12];
                        System.arraycopy(bArrDigest, 0, bArr4, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr4, i12, bArrCopyOfRange2.length);
                        if (!Bytes.b(messageDigest.digest(bArr4), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr3[i10] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i10++;
                }
            }
        }
    }
}
