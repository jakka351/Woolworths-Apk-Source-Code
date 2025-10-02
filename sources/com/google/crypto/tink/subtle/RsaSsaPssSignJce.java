package com.google.crypto.tink.subtle;

import YU.a;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: classes6.dex */
public final class RsaSsaPssSignJce implements PublicKeySign {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f15163a;
    public final RSAPublicKey b;
    public final Enums.HashType c;
    public final Enums.HashType d;
    public final int e;

    public RsaSsaPssSignJce(RSAPrivateCrtKey rSAPrivateCrtKey, Enums.HashType hashType, Enums.HashType hashType2, int i) throws GeneralSecurityException {
        Validators.d(hashType);
        Validators.c(rSAPrivateCrtKey.getModulus().bitLength());
        this.f15163a = rSAPrivateCrtKey;
        this.b = (RSAPublicKey) ((KeyFactory) EngineFactory.j.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.c = hashType;
        this.d = hashType2;
        this.e = i;
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int i;
        RSAPublicKey rSAPublicKey = this.b;
        int iBitLength = rSAPublicKey.getModulus().bitLength();
        int i2 = iBitLength - 1;
        Enums.HashType hashType = this.c;
        Validators.d(hashType);
        MessageDigest messageDigest = (MessageDigest) EngineFactory.h.a(SubtleUtil.c(hashType));
        byte[] bArrDigest = messageDigest.digest(bArr);
        int digestLength = messageDigest.getDigestLength();
        int i3 = 1;
        int iD = a.D(iBitLength, 2, 8, 1);
        int i4 = this.e;
        if (iD < digestLength + i4 + 2) {
            throw new GeneralSecurityException("encoding error");
        }
        byte[] bArrA = Random.a(i4);
        int i5 = digestLength + 8;
        byte[] bArr2 = new byte[i5 + i4];
        System.arraycopy(bArrDigest, 0, bArr2, 8, digestLength);
        System.arraycopy(bArrA, 0, bArr2, i5, bArrA.length);
        byte[] bArrDigest2 = messageDigest.digest(bArr2);
        int i6 = (iD - digestLength) - 1;
        byte[] bArr3 = new byte[i6];
        int i7 = (iD - i4) - digestLength;
        bArr3[i7 - 2] = 1;
        System.arraycopy(bArrA, 0, bArr3, i7 - 1, bArrA.length);
        byte[] bArrB = SubtleUtil.b(bArrDigest2, i6, this.d);
        byte[] bArr4 = new byte[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            bArr4[i8] = (byte) (bArr3[i8] ^ bArrB[i8]);
        }
        int i9 = 0;
        while (true) {
            i = i3;
            int i10 = i9;
            if (i9 >= (iD * 8) - i2) {
                break;
            }
            int i11 = i10 / 8;
            bArr4[i11] = (byte) ((~(i << (7 - (i10 % 8)))) & bArr4[i11]);
            i9 = i10 + 1;
            i3 = i;
        }
        int i12 = digestLength + i6;
        byte[] bArr5 = new byte[i12 + 1];
        System.arraycopy(bArr4, 0, bArr5, 0, i6);
        System.arraycopy(bArrDigest2, 0, bArr5, i6, bArrDigest2.length);
        bArr5[i12] = PSSSigner.TRAILER_IMPLICIT;
        EngineFactory engineFactory = EngineFactory.e;
        Cipher cipher = (Cipher) engineFactory.a("RSA/ECB/NOPADDING");
        cipher.init(2, this.f15163a);
        byte[] bArrDoFinal = cipher.doFinal(bArr5);
        Cipher cipher2 = (Cipher) engineFactory.a("RSA/ECB/NOPADDING");
        cipher2.init(i, rSAPublicKey);
        if (new BigInteger(i, bArr5).equals(new BigInteger(i, cipher2.doFinal(bArrDoFinal)))) {
            return bArrDoFinal;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }
}
