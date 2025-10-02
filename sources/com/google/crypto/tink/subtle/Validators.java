package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.Enums;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Validators {

    /* renamed from: com.google.crypto.tink.subtle.Validators$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15166a;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            f15166a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15166a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15166a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
        Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
    }

    public static void a(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static String b(String str) {
        if (str.toLowerCase().startsWith("android-keystore://")) {
            return str.substring(19);
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    public static void c(int i) throws GeneralSecurityException {
        if (i < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i)));
        }
    }

    public static void d(Enums.HashType hashType) throws GeneralSecurityException {
        int iOrdinal = hashType.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return;
        }
        throw new GeneralSecurityException("Unsupported hash: " + hashType.name());
    }

    public static void e(int i) throws GeneralSecurityException {
        if (i < 0 || i > 0) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(i), 0));
        }
    }
}
