package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes.dex */
public class SubtleUtil {

    /* renamed from: com.google.crypto.tink.subtle.SubtleUtil$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15165a;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            f15165a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15165a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15165a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15165a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(BigInteger bigInteger, int i) throws GeneralSecurityException {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (byteArray.length > i2) {
            throw new GeneralSecurityException("integer too large");
        }
        if (byteArray.length == i2) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, byteArray.length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
        return bArr;
    }

    public static byte[] b(byte[] bArr, int i, Enums.HashType hashType) {
        MessageDigest messageDigest = (MessageDigest) EngineFactory.h.a(c(hashType));
        int digestLength = messageDigest.getDigestLength();
        byte[] bArr2 = new byte[i];
        int length = 0;
        for (int i2 = 0; i2 <= (i - 1) / digestLength; i2++) {
            messageDigest.reset();
            messageDigest.update(bArr);
            messageDigest.update(a(BigInteger.valueOf(i2), 4));
            byte[] bArrDigest = messageDigest.digest();
            System.arraycopy(bArrDigest, 0, bArr2, length, Math.min(bArrDigest.length, i - length));
            length += bArrDigest.length;
        }
        return bArr2;
    }

    public static String c(Enums.HashType hashType) throws GeneralSecurityException {
        int iOrdinal = hashType.ordinal();
        if (iOrdinal == 0) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }
        if (iOrdinal == 1) {
            return "SHA-256";
        }
        if (iOrdinal == 2) {
            return McElieceCCA2KeyGenParameterSpec.SHA384;
        }
        if (iOrdinal == 3) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash " + hashType);
    }
}
