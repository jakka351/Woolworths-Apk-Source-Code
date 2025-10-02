package com.google.crypto.tink.signature;

import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class SigUtil {

    /* renamed from: com.google.crypto.tink.signature.SigUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15124a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[HashType.values().length];
            c = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EllipticCurveType.values().length];
            b = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[3] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[EcdsaSignatureEncoding.values().length];
            f15124a = iArr3;
            try {
                iArr3[2] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15124a[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static EllipticCurves.CurveType a(EllipticCurveType ellipticCurveType) throws GeneralSecurityException {
        int iOrdinal = ellipticCurveType.ordinal();
        if (iOrdinal == 1) {
            return EllipticCurves.CurveType.d;
        }
        if (iOrdinal == 2) {
            return EllipticCurves.CurveType.e;
        }
        if (iOrdinal == 3) {
            return EllipticCurves.CurveType.f;
        }
        throw new GeneralSecurityException("unknown curve type: " + ellipticCurveType);
    }

    public static EllipticCurves.EcdsaEncoding b(EcdsaSignatureEncoding ecdsaSignatureEncoding) throws GeneralSecurityException {
        int iOrdinal = ecdsaSignatureEncoding.ordinal();
        if (iOrdinal == 1) {
            return EllipticCurves.EcdsaEncoding.d;
        }
        if (iOrdinal == 2) {
            return EllipticCurves.EcdsaEncoding.e;
        }
        throw new GeneralSecurityException("unknown ECDSA encoding: " + ecdsaSignatureEncoding);
    }

    public static Enums.HashType c(HashType hashType) throws GeneralSecurityException {
        int iOrdinal = hashType.ordinal();
        if (iOrdinal == 2) {
            return Enums.HashType.f;
        }
        if (iOrdinal == 3) {
            return Enums.HashType.e;
        }
        if (iOrdinal == 4) {
            return Enums.HashType.g;
        }
        throw new GeneralSecurityException("unsupported hash type: " + hashType.name());
    }

    public static void d(EcdsaParams ecdsaParams) throws GeneralSecurityException {
        EcdsaSignatureEncoding encoding = ecdsaParams.getEncoding();
        HashType hashType = ecdsaParams.getHashType();
        EllipticCurveType curve = ecdsaParams.getCurve();
        int iOrdinal = encoding.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2) {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
        int iOrdinal2 = curve.ordinal();
        if (iOrdinal2 == 1) {
            if (hashType != HashType.SHA256) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
            return;
        }
        HashType hashType2 = HashType.SHA512;
        if (iOrdinal2 == 2) {
            if (hashType != HashType.SHA384 && hashType != hashType2) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        } else {
            if (iOrdinal2 != 3) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
            if (hashType != hashType2) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        }
    }

    public static void e(RsaSsaPkcs1Params rsaSsaPkcs1Params) throws GeneralSecurityException {
        c(rsaSsaPkcs1Params.getHashType());
    }

    public static void f(RsaSsaPssParams rsaSsaPssParams) throws GeneralSecurityException {
        c(rsaSsaPssParams.getSigHash());
        if (rsaSsaPssParams.getSigHash() != rsaSsaPssParams.getMgf1Hash()) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
    }
}
