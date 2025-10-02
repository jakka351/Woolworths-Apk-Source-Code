package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.EcPointFormat;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.subtle.EllipticCurves;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes6.dex */
class HybridUtil {

    /* renamed from: com.google.crypto.tink.hybrid.HybridUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14998a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[EcPointFormat.values().length];
            c = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[2] = 3;
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
            int[] iArr3 = new int[HashType.values().length];
            f14998a = iArr3;
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14998a[3] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14998a[4] = 3;
            } catch (NoSuchFieldError unused9) {
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

    public static String b(HashType hashType) throws NoSuchAlgorithmException {
        int iOrdinal = hashType.ordinal();
        if (iOrdinal == 1) {
            return "HmacSha1";
        }
        if (iOrdinal == 3) {
            return "HmacSha256";
        }
        if (iOrdinal == 4) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + hashType);
    }

    public static EllipticCurves.PointFormatType c(EcPointFormat ecPointFormat) throws GeneralSecurityException {
        int iOrdinal = ecPointFormat.ordinal();
        if (iOrdinal == 1) {
            return EllipticCurves.PointFormatType.d;
        }
        if (iOrdinal == 2) {
            return EllipticCurves.PointFormatType.e;
        }
        if (iOrdinal == 3) {
            return EllipticCurves.PointFormatType.f;
        }
        throw new GeneralSecurityException("unknown point format: " + ecPointFormat);
    }

    public static void d(EciesAeadHkdfParams eciesAeadHkdfParams) throws GeneralSecurityException {
        EllipticCurves.b(a(eciesAeadHkdfParams.getKemParams().getCurveType()));
        b(eciesAeadHkdfParams.getKemParams().getHkdfHashType());
        if (eciesAeadHkdfParams.getEcPointFormat() == EcPointFormat.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        Registry.e(eciesAeadHkdfParams.getDemParams().getAeadDem());
    }
}
