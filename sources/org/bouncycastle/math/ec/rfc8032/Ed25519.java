package org.bouncycastle.math.ec.rfc8032;

import java.security.SecureRandom;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.math.ec.rfc7748.X25519;
import org.bouncycastle.math.ec.rfc7748.X25519Field;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes8.dex */
public abstract class Ed25519 {
    private static final int COORD_INTS = 8;
    private static final int POINT_BYTES = 32;
    private static final int PRECOMP_BLOCKS = 8;
    private static final int PRECOMP_MASK = 7;
    private static final int PRECOMP_POINTS = 8;
    private static final int PRECOMP_RANGE = 256;
    private static final int PRECOMP_SPACING = 8;
    private static final int PRECOMP_TEETH = 4;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 32;
    private static final int SCALAR_BYTES = 32;
    private static final int SCALAR_INTS = 8;
    public static final int SECRET_KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;
    private static final int WNAF_WIDTH_128 = 4;
    private static final int WNAF_WIDTH_BASE = 6;
    private static final byte[] DOM2_PREFIX = {83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};
    private static final int[] P = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] ORDER8_y1 = {1886001095, 1339575613, 1980447930, 258412557, -95215574, -959694548, 2013120334, 2047061138};
    private static final int[] ORDER8_y2 = {-1886001114, -1339575614, -1980447931, -258412558, 95215573, 959694547, -2013120335, 100422509};
    private static final int[] B_x = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] B_y = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    private static final int[] B128_x = {12052516, 1174424, 4087752, 38672185, 20040971, 21899680, 55468344, 20105554, 66708015, 9981791};
    private static final int[] B128_y = {66430571, 45040722, 4842939, 15895846, 18981244, 46308410, 4697481, 8903007, 53646190, 12474675};
    private static final int[] C_d = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final int[] C_d2 = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] C_d4 = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static final Object PRECOMP_LOCK = new Object();
    private static PointPrecomp[] PRECOMP_BASE_WNAF = null;
    private static PointPrecomp[] PRECOMP_BASE128_WNAF = null;
    private static int[] PRECOMP_BASE_COMB = null;

    public static final class Algorithm {
        public static final int Ed25519 = 0;
        public static final int Ed25519ctx = 1;
        public static final int Ed25519ph = 2;
    }

    public static class F extends X25519Field {
        private F() {
        }
    }

    public static class PointAccum {
        int[] u;
        int[] v;
        int[] x;
        int[] y;
        int[] z;

        private PointAccum() {
            this.x = X25519Field.create();
            this.y = X25519Field.create();
            this.z = X25519Field.create();
            this.u = X25519Field.create();
            this.v = X25519Field.create();
        }
    }

    public static class PointAffine {
        int[] x;
        int[] y;

        private PointAffine() {
            this.x = X25519Field.create();
            this.y = X25519Field.create();
        }
    }

    public static class PointExtended {
        int[] t;
        int[] x;
        int[] y;
        int[] z;

        private PointExtended() {
            this.x = X25519Field.create();
            this.y = X25519Field.create();
            this.z = X25519Field.create();
            this.t = X25519Field.create();
        }
    }

    public static class PointPrecomp {
        int[] xyd;
        int[] ymx_h;
        int[] ypx_h;

        private PointPrecomp() {
            this.ymx_h = X25519Field.create();
            this.ypx_h = X25519Field.create();
            this.xyd = X25519Field.create();
        }
    }

    public static class PointPrecompZ {
        int[] xyd;
        int[] ymx_h;
        int[] ypx_h;
        int[] z;

        private PointPrecompZ() {
            this.ymx_h = X25519Field.create();
            this.ypx_h = X25519Field.create();
            this.xyd = X25519Field.create();
            this.z = X25519Field.create();
        }
    }

    public static class PointTemp {
        int[] r0;
        int[] r1;

        private PointTemp() {
            this.r0 = X25519Field.create();
            this.r1 = X25519Field.create();
        }
    }

    public static final class PublicPoint {
        final int[] data;

        public PublicPoint(int[] iArr) {
            this.data = iArr;
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        Scalar25519.decode(bArr, iArr);
        int[] iArr2 = new int[8];
        Scalar25519.decode(bArr2, iArr2);
        int[] iArr3 = new int[8];
        Scalar25519.decode(bArr3, iArr3);
        Nat256.mulAddTo(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        Codec.encode32(iArr, 0, 16, bArr4, 0);
        return Scalar25519.reduce(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr, byte b) {
        if (bArr == null && b == 0) {
            return true;
        }
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(PointAccum pointAccum) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        int[] iArrCreate3 = X25519Field.create();
        int[] iArrCreate4 = X25519Field.create();
        X25519Field.sqr(pointAccum.x, iArrCreate2);
        X25519Field.sqr(pointAccum.y, iArrCreate3);
        X25519Field.sqr(pointAccum.z, iArrCreate4);
        X25519Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X25519Field.sub(iArrCreate3, iArrCreate2, iArrCreate3);
        X25519Field.mul(iArrCreate3, iArrCreate4, iArrCreate3);
        X25519Field.sqr(iArrCreate4, iArrCreate4);
        X25519Field.mul(iArrCreate, C_d, iArrCreate);
        X25519Field.add(iArrCreate, iArrCreate4, iArrCreate);
        X25519Field.sub(iArrCreate, iArrCreate3, iArrCreate);
        X25519Field.normalize(iArrCreate);
        return X25519Field.isZero(iArrCreate);
    }

    private static boolean checkPointFullVar(byte[] bArr) {
        int iDecode32 = Codec.decode32(bArr, 28) & Integer.MAX_VALUE;
        int i = P[7] ^ iDecode32;
        int i2 = ORDER8_y1[7] ^ iDecode32;
        int i3 = ORDER8_y2[7] ^ iDecode32;
        for (int i4 = 6; i4 > 0; i4--) {
            int iDecode322 = Codec.decode32(bArr, i4 * 4);
            iDecode32 |= iDecode322;
            i |= P[i4] ^ iDecode322;
            i2 |= ORDER8_y1[i4] ^ iDecode322;
            i3 |= iDecode322 ^ ORDER8_y2[i4];
        }
        int iDecode323 = Codec.decode32(bArr, 0);
        if (iDecode32 == 0 && iDecode323 - Integer.MIN_VALUE <= -2147483647) {
            return false;
        }
        if (i == 0 && Integer.MIN_VALUE + iDecode323 >= P[0] - (-2147483647)) {
            return false;
        }
        return (((ORDER8_y1[0] ^ iDecode323) | i2) != 0) & (((iDecode323 ^ ORDER8_y2[0]) | i3) != 0);
    }

    private static boolean checkPointOrderVar(PointAffine pointAffine) {
        PointAccum pointAccum = new PointAccum();
        scalarMultOrderVar(pointAffine, pointAccum);
        return normalizeToNeutralElementVar(pointAccum);
    }

    private static boolean checkPointVar(byte[] bArr) {
        if ((Codec.decode32(bArr, 28) & Integer.MAX_VALUE) < P[7]) {
            return true;
        }
        int[] iArr = new int[8];
        Codec.decode32(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !Nat256.gte(iArr, r2);
    }

    private static byte[] copy(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    private static Digest createDigest() {
        SHA512Digest sHA512Digest = new SHA512Digest();
        if (sHA512Digest.getDigestSize() == 64) {
            return sHA512Digest;
        }
        throw new IllegalStateException();
    }

    public static Digest createPrehash() {
        return createDigest();
    }

    private static boolean decodePointVar(byte[] bArr, boolean z, PointAffine pointAffine) {
        int i = (bArr[31] & 128) >>> 7;
        X25519Field.decode(bArr, pointAffine.y);
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        X25519Field.sqr(pointAffine.y, iArrCreate);
        X25519Field.mul(C_d, iArrCreate, iArrCreate2);
        X25519Field.subOne(iArrCreate);
        X25519Field.addOne(iArrCreate2);
        if (!X25519Field.sqrtRatioVar(iArrCreate, iArrCreate2, pointAffine.x)) {
            return false;
        }
        X25519Field.normalize(pointAffine.x);
        if (i == 1 && X25519Field.isZeroVar(pointAffine.x)) {
            return false;
        }
        int[] iArr = pointAffine.x;
        if (z ^ (i != (iArr[0] & 1))) {
            X25519Field.negate(iArr, iArr);
            X25519Field.normalize(pointAffine.x);
        }
        return true;
    }

    private static void dom2(Digest digest, byte b, byte[] bArr) {
        byte[] bArr2 = DOM2_PREFIX;
        int length = bArr2.length;
        int i = length + 2;
        int length2 = bArr.length + i;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        digest.update(bArr3, 0, length2);
    }

    private static void encodePoint(PointAffine pointAffine, byte[] bArr, int i) {
        X25519Field.encode(pointAffine.y, bArr, i);
        int i2 = i + 31;
        bArr[i2] = (byte) (((pointAffine.x[0] & 1) << 7) | bArr[i2]);
    }

    public static void encodePublicPoint(PublicPoint publicPoint, byte[] bArr, int i) {
        X25519Field.encode(publicPoint.data, 10, bArr, i);
        int i2 = i + 31;
        bArr[i2] = (byte) (((publicPoint.data[0] & 1) << 7) | bArr[i2]);
    }

    private static int encodeResult(PointAccum pointAccum, byte[] bArr, int i) {
        PointAffine pointAffine = new PointAffine();
        normalizeToAffine(pointAccum, pointAffine);
        int iCheckPoint = checkPoint(pointAffine);
        encodePoint(pointAffine, bArr, i);
        return iCheckPoint;
    }

    private static PublicPoint exportPoint(PointAffine pointAffine) {
        int[] iArr = new int[20];
        X25519Field.copy(pointAffine.x, 0, iArr, 0);
        X25519Field.copy(pointAffine.y, 0, iArr, 10);
        return new PublicPoint(iArr);
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
    }

    public static PublicPoint generatePublicKey(byte[] bArr, int i) {
        Digest digestCreateDigest = createDigest();
        byte[] bArr2 = new byte[64];
        digestCreateDigest.update(bArr, i, 32);
        digestCreateDigest.doFinal(bArr2, 0);
        byte[] bArr3 = new byte[32];
        pruneScalar(bArr2, 0, bArr3);
        PointAccum pointAccum = new PointAccum();
        scalarMultBase(bArr3, pointAccum);
        PointAffine pointAffine = new PointAffine();
        normalizeToAffine(pointAccum, pointAffine);
        if (checkPoint(pointAffine) != 0) {
            return exportPoint(pointAffine);
        }
        throw new IllegalStateException();
    }

    private static int getWindow4(int[] iArr, int i) {
        return (iArr[i >>> 3] >>> ((i & 7) << 2)) & 15;
    }

    private static void groupCombBits(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Interleave.shuffle2(iArr[i]);
        }
    }

    private static void implSign(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        if (bArr4 != null) {
            dom2(digest, b, bArr4);
        }
        digest.update(bArr, 32, 32);
        digest.update(bArr5, i2, i3);
        digest.doFinal(bArr, 0);
        byte[] bArrReduce = Scalar25519.reduce(bArr);
        byte[] bArr7 = new byte[32];
        scalarMultBaseEncoded(bArrReduce, bArr7, 0);
        if (bArr4 != null) {
            dom2(digest, b, bArr4);
        }
        digest.update(bArr7, 0, 32);
        digest.update(bArr3, i, 32);
        digest.update(bArr5, i2, i3);
        digest.doFinal(bArr, 0);
        byte[] bArrCalculateS = calculateS(bArrReduce, Scalar25519.reduce(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i4, 32);
        System.arraycopy(bArrCalculateS, 0, bArr6, i4 + 32, 32);
    }

    private static boolean implVerify(byte[] bArr, int i, PublicPoint publicPoint, byte[] bArr2, byte b, byte[] bArr3, int i2, int i3) {
        if (!checkContextVar(bArr2, b)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArrCopy = copy(bArr, i, 32);
        byte[] bArrCopy2 = copy(bArr, i + 32, 32);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[8];
        if (!Scalar25519.checkVar(bArrCopy2, iArr)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArrCopy, true, pointAffine)) {
            return false;
        }
        PointAffine pointAffine2 = new PointAffine();
        X25519Field.negate(publicPoint.data, pointAffine2.x);
        X25519Field.copy(publicPoint.data, 10, pointAffine2.y, 0);
        byte[] bArr4 = new byte[32];
        encodePublicPoint(publicPoint, bArr4, 0);
        Digest digestCreateDigest = createDigest();
        byte[] bArr5 = new byte[64];
        if (bArr2 != null) {
            dom2(digestCreateDigest, b, bArr2);
        }
        digestCreateDigest.update(bArrCopy, 0, 32);
        digestCreateDigest.update(bArr4, 0, 32);
        digestCreateDigest.update(bArr3, i2, i3);
        digestCreateDigest.doFinal(bArr5, 0);
        int[] iArr2 = new int[8];
        Scalar25519.decode(Scalar25519.reduce(bArr5), iArr2);
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        Scalar25519.reduceBasisVar(iArr2, iArr3, iArr4);
        Scalar25519.multiply128Var(iArr, iArr4, iArr);
        PointAccum pointAccum = new PointAccum();
        scalarMultStraus128Var(iArr, iArr3, pointAffine2, iArr4, pointAffine, pointAccum);
        return normalizeToNeutralElementVar(pointAccum);
    }

    private static void invertDoubleZs(PointExtended[] pointExtendedArr) {
        int length = pointExtendedArr.length;
        int[] iArrCreateTable = X25519Field.createTable(length);
        int[] iArrCreate = X25519Field.create();
        X25519Field.copy(pointExtendedArr[0].z, 0, iArrCreate, 0);
        X25519Field.copy(iArrCreate, 0, iArrCreateTable, 0);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= length) {
                break;
            }
            X25519Field.mul(iArrCreate, pointExtendedArr[i2].z, iArrCreate);
            X25519Field.copy(iArrCreate, 0, iArrCreateTable, i2 * 10);
            i = i2;
        }
        X25519Field.add(iArrCreate, iArrCreate, iArrCreate);
        X25519Field.invVar(iArrCreate, iArrCreate);
        int[] iArrCreate2 = X25519Field.create();
        while (i > 0) {
            int i3 = i - 1;
            X25519Field.copy(iArrCreateTable, i3 * 10, iArrCreate2, 0);
            X25519Field.mul(iArrCreate2, iArrCreate, iArrCreate2);
            X25519Field.mul(iArrCreate, pointExtendedArr[i].z, iArrCreate);
            X25519Field.copy(iArrCreate2, 0, pointExtendedArr[i].z, 0);
            i = i3;
        }
        X25519Field.copy(iArrCreate, 0, pointExtendedArr[0].z, 0);
    }

    private static void normalizeToAffine(PointAccum pointAccum, PointAffine pointAffine) {
        X25519Field.inv(pointAccum.z, pointAffine.y);
        X25519Field.mul(pointAffine.y, pointAccum.x, pointAffine.x);
        int[] iArr = pointAffine.y;
        X25519Field.mul(iArr, pointAccum.y, iArr);
        X25519Field.normalize(pointAffine.x);
        X25519Field.normalize(pointAffine.y);
    }

    private static boolean normalizeToNeutralElementVar(PointAccum pointAccum) {
        X25519Field.normalize(pointAccum.x);
        X25519Field.normalize(pointAccum.y);
        X25519Field.normalize(pointAccum.z);
        return X25519Field.isZeroVar(pointAccum.x) && X25519Field.areEqualVar(pointAccum.y, pointAccum.z);
    }

    private static void pointAdd(PointExtended pointExtended, PointExtended pointExtended2, PointExtended pointExtended3, PointTemp pointTemp) {
        int[] iArr = pointExtended3.x;
        int[] iArr2 = pointExtended3.y;
        int[] iArr3 = pointTemp.r0;
        int[] iArr4 = pointTemp.r1;
        X25519Field.apm(pointExtended.y, pointExtended.x, iArr2, iArr);
        X25519Field.apm(pointExtended2.y, pointExtended2.x, iArr4, iArr3);
        X25519Field.mul(iArr, iArr3, iArr);
        X25519Field.mul(iArr2, iArr4, iArr2);
        X25519Field.mul(pointExtended.t, pointExtended2.t, iArr3);
        X25519Field.mul(iArr3, C_d2, iArr3);
        int[] iArr5 = pointExtended.z;
        X25519Field.add(iArr5, iArr5, iArr4);
        X25519Field.mul(iArr4, pointExtended2.z, iArr4);
        X25519Field.apm(iArr2, iArr, iArr2, iArr);
        X25519Field.apm(iArr4, iArr3, iArr4, iArr3);
        X25519Field.mul(iArr, iArr2, pointExtended3.t);
        X25519Field.mul(iArr3, iArr4, pointExtended3.z);
        X25519Field.mul(iArr, iArr3, pointExtended3.x);
        X25519Field.mul(iArr2, iArr4, pointExtended3.y);
    }

    private static void pointAddVar(boolean z, PointPrecomp pointPrecomp, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = pointAccum.x;
        int[] iArr4 = pointAccum.y;
        int[] iArr5 = pointTemp.r0;
        int[] iArr6 = pointAccum.u;
        int[] iArr7 = pointAccum.v;
        if (z) {
            iArr2 = iArr3;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        X25519Field.apm(iArr4, iArr3, iArr4, iArr3);
        X25519Field.mul(iArr, pointPrecomp.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecomp.ypx_h, iArr2);
        X25519Field.mul(pointAccum.u, pointAccum.v, iArr5);
        X25519Field.mul(iArr5, pointPrecomp.xyd, iArr5);
        X25519Field.apm(iArr4, iArr3, iArr7, iArr6);
        X25519Field.apm(pointAccum.z, iArr5, iArr2, iArr);
        X25519Field.mul(iArr3, iArr4, pointAccum.z);
        X25519Field.mul(iArr3, iArr6, pointAccum.x);
        X25519Field.mul(iArr4, iArr7, pointAccum.y);
    }

    private static void pointCopy(PointAccum pointAccum, PointExtended pointExtended) {
        X25519Field.copy(pointAccum.x, 0, pointExtended.x, 0);
        X25519Field.copy(pointAccum.y, 0, pointExtended.y, 0);
        X25519Field.copy(pointAccum.z, 0, pointExtended.z, 0);
        X25519Field.mul(pointAccum.u, pointAccum.v, pointExtended.t);
    }

    private static void pointDouble(PointAccum pointAccum) {
        int[] iArr = pointAccum.x;
        int[] iArr2 = pointAccum.y;
        int[] iArr3 = pointAccum.z;
        int[] iArr4 = pointAccum.u;
        int[] iArr5 = pointAccum.v;
        X25519Field.add(iArr, iArr2, iArr4);
        X25519Field.sqr(pointAccum.x, iArr);
        X25519Field.sqr(pointAccum.y, iArr2);
        X25519Field.sqr(pointAccum.z, iArr3);
        X25519Field.add(iArr3, iArr3, iArr3);
        X25519Field.apm(iArr, iArr2, iArr5, iArr2);
        X25519Field.sqr(iArr4, iArr4);
        X25519Field.sub(iArr5, iArr4, iArr4);
        X25519Field.add(iArr3, iArr2, iArr);
        X25519Field.carry(iArr);
        X25519Field.mul(iArr, iArr2, pointAccum.z);
        X25519Field.mul(iArr, iArr4, pointAccum.x);
        X25519Field.mul(iArr2, iArr5, pointAccum.y);
    }

    private static void pointLookup(int i, int i2, PointPrecomp pointPrecomp) {
        int i3 = i * 240;
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = ((i4 ^ i2) - 1) >> 31;
            X25519Field.cmov(i5, PRECOMP_BASE_COMB, i3, pointPrecomp.ymx_h, 0);
            X25519Field.cmov(i5, PRECOMP_BASE_COMB, i3 + 10, pointPrecomp.ypx_h, 0);
            X25519Field.cmov(i5, PRECOMP_BASE_COMB, i3 + 20, pointPrecomp.xyd, 0);
            i3 += 30;
        }
    }

    private static void pointLookupZ(int[] iArr, int i, int[] iArr2, PointPrecompZ pointPrecompZ) {
        int window4 = getWindow4(iArr, i);
        int i2 = (window4 >>> 3) ^ 1;
        int i3 = (window4 ^ (-i2)) & 7;
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            int i6 = ((i5 ^ i3) - 1) >> 31;
            X25519Field.cmov(i6, iArr2, i4, pointPrecompZ.ymx_h, 0);
            X25519Field.cmov(i6, iArr2, i4 + 10, pointPrecompZ.ypx_h, 0);
            X25519Field.cmov(i6, iArr2, i4 + 20, pointPrecompZ.xyd, 0);
            X25519Field.cmov(i6, iArr2, i4 + 30, pointPrecompZ.z, 0);
            i4 += 40;
        }
        X25519Field.cswap(i2, pointPrecompZ.ymx_h, pointPrecompZ.ypx_h);
        X25519Field.cnegate(i2, pointPrecompZ.xyd);
    }

    private static void pointPrecompute(PointAffine pointAffine, PointExtended[] pointExtendedArr, int i, int i2, PointTemp pointTemp) {
        PointExtended pointExtended = new PointExtended();
        pointExtendedArr[i] = pointExtended;
        pointCopy(pointAffine, pointExtended);
        PointExtended pointExtended2 = new PointExtended();
        PointExtended pointExtended3 = pointExtendedArr[i];
        pointAdd(pointExtended3, pointExtended3, pointExtended2, pointTemp);
        for (int i3 = 1; i3 < i2; i3++) {
            int i4 = i + i3;
            PointExtended pointExtended4 = pointExtendedArr[i4 - 1];
            PointExtended pointExtended5 = new PointExtended();
            pointExtendedArr[i4] = pointExtended5;
            pointAdd(pointExtended4, pointExtended2, pointExtended5, pointTemp);
        }
    }

    private static void pointPrecomputeZ(PointAffine pointAffine, PointPrecompZ[] pointPrecompZArr, int i, PointTemp pointTemp) {
        PointExtended pointExtended = new PointExtended();
        pointCopy(pointAffine, pointExtended);
        PointExtended pointExtended2 = new PointExtended();
        pointAdd(pointExtended, pointExtended, pointExtended2, pointTemp);
        int i2 = 0;
        while (true) {
            PointPrecompZ pointPrecompZ = new PointPrecompZ();
            pointPrecompZArr[i2] = pointPrecompZ;
            pointCopy(pointExtended, pointPrecompZ);
            i2++;
            if (i2 == i) {
                return;
            } else {
                pointAdd(pointExtended, pointExtended2, pointExtended, pointTemp);
            }
        }
    }

    private static void pointSetNeutral(PointAccum pointAccum) {
        X25519Field.zero(pointAccum.x);
        X25519Field.one(pointAccum.y);
        X25519Field.one(pointAccum.z);
        X25519Field.zero(pointAccum.u);
        X25519Field.one(pointAccum.v);
    }

    public static void precompute() {
        synchronized (PRECOMP_LOCK) {
            try {
                if (PRECOMP_BASE_COMB == null) {
                    PointExtended[] pointExtendedArr = new PointExtended[96];
                    PointTemp pointTemp = new PointTemp();
                    PointAffine pointAffine = new PointAffine();
                    int[] iArr = B_x;
                    int i = 0;
                    X25519Field.copy(iArr, 0, pointAffine.x, 0);
                    int[] iArr2 = B_y;
                    X25519Field.copy(iArr2, 0, pointAffine.y, 0);
                    pointPrecompute(pointAffine, pointExtendedArr, 0, 16, pointTemp);
                    PointAffine pointAffine2 = new PointAffine();
                    X25519Field.copy(B128_x, 0, pointAffine2.x, 0);
                    X25519Field.copy(B128_y, 0, pointAffine2.y, 0);
                    pointPrecompute(pointAffine2, pointExtendedArr, 16, 16, pointTemp);
                    PointAccum pointAccum = new PointAccum();
                    X25519Field.copy(iArr, 0, pointAccum.x, 0);
                    X25519Field.copy(iArr2, 0, pointAccum.y, 0);
                    X25519Field.one(pointAccum.z);
                    X25519Field.copy(pointAccum.x, 0, pointAccum.u, 0);
                    X25519Field.copy(pointAccum.y, 0, pointAccum.v, 0);
                    int i2 = 4;
                    PointExtended[] pointExtendedArr2 = new PointExtended[4];
                    for (int i3 = 0; i3 < 4; i3++) {
                        pointExtendedArr2[i3] = new PointExtended();
                    }
                    PointExtended pointExtended = new PointExtended();
                    int i4 = 0;
                    int i5 = 32;
                    while (i4 < 8) {
                        int i6 = i5 + 1;
                        PointExtended pointExtended2 = new PointExtended();
                        pointExtendedArr[i5] = pointExtended2;
                        int i7 = i;
                        while (i7 < i2) {
                            if (i7 == 0) {
                                pointCopy(pointAccum, pointExtended2);
                            } else {
                                pointCopy(pointAccum, pointExtended);
                                pointAdd(pointExtended2, pointExtended, pointExtended2, pointTemp);
                            }
                            pointDouble(pointAccum);
                            pointCopy(pointAccum, pointExtendedArr2[i7]);
                            if (i4 + i7 != 10) {
                                for (int i8 = 1; i8 < 8; i8++) {
                                    pointDouble(pointAccum);
                                }
                            }
                            i7++;
                            i2 = 4;
                        }
                        int[] iArr3 = pointExtended2.x;
                        X25519Field.negate(iArr3, iArr3);
                        int[] iArr4 = pointExtended2.t;
                        X25519Field.negate(iArr4, iArr4);
                        i5 = i6;
                        for (int i9 = 0; i9 < 3; i9++) {
                            int i10 = 1 << i9;
                            int i11 = 0;
                            while (i11 < i10) {
                                PointExtended pointExtended3 = new PointExtended();
                                pointExtendedArr[i5] = pointExtended3;
                                pointAdd(pointExtendedArr[i5 - i10], pointExtendedArr2[i9], pointExtended3, pointTemp);
                                i11++;
                                i5++;
                            }
                        }
                        i4++;
                        i2 = 4;
                        i = 0;
                    }
                    invertDoubleZs(pointExtendedArr);
                    PRECOMP_BASE_WNAF = new PointPrecomp[16];
                    for (int i12 = 0; i12 < 16; i12++) {
                        PointExtended pointExtended4 = pointExtendedArr[i12];
                        PointPrecomp[] pointPrecompArr = PRECOMP_BASE_WNAF;
                        PointPrecomp pointPrecomp = new PointPrecomp();
                        pointPrecompArr[i12] = pointPrecomp;
                        int[] iArr5 = pointExtended4.x;
                        X25519Field.mul(iArr5, pointExtended4.z, iArr5);
                        int[] iArr6 = pointExtended4.y;
                        X25519Field.mul(iArr6, pointExtended4.z, iArr6);
                        X25519Field.apm(pointExtended4.y, pointExtended4.x, pointPrecomp.ypx_h, pointPrecomp.ymx_h);
                        X25519Field.mul(pointExtended4.x, pointExtended4.y, pointPrecomp.xyd);
                        int[] iArr7 = pointPrecomp.xyd;
                        X25519Field.mul(iArr7, C_d4, iArr7);
                        X25519Field.normalize(pointPrecomp.ymx_h);
                        X25519Field.normalize(pointPrecomp.ypx_h);
                        X25519Field.normalize(pointPrecomp.xyd);
                    }
                    PRECOMP_BASE128_WNAF = new PointPrecomp[16];
                    for (int i13 = 0; i13 < 16; i13++) {
                        PointExtended pointExtended5 = pointExtendedArr[16 + i13];
                        PointPrecomp[] pointPrecompArr2 = PRECOMP_BASE128_WNAF;
                        PointPrecomp pointPrecomp2 = new PointPrecomp();
                        pointPrecompArr2[i13] = pointPrecomp2;
                        int[] iArr8 = pointExtended5.x;
                        X25519Field.mul(iArr8, pointExtended5.z, iArr8);
                        int[] iArr9 = pointExtended5.y;
                        X25519Field.mul(iArr9, pointExtended5.z, iArr9);
                        X25519Field.apm(pointExtended5.y, pointExtended5.x, pointPrecomp2.ypx_h, pointPrecomp2.ymx_h);
                        X25519Field.mul(pointExtended5.x, pointExtended5.y, pointPrecomp2.xyd);
                        int[] iArr10 = pointPrecomp2.xyd;
                        X25519Field.mul(iArr10, C_d4, iArr10);
                        X25519Field.normalize(pointPrecomp2.ymx_h);
                        X25519Field.normalize(pointPrecomp2.ypx_h);
                        X25519Field.normalize(pointPrecomp2.xyd);
                    }
                    PRECOMP_BASE_COMB = X25519Field.createTable(BERTags.PRIVATE);
                    PointPrecomp pointPrecomp3 = new PointPrecomp();
                    int i14 = 0;
                    for (int i15 = 32; i15 < 96; i15++) {
                        PointExtended pointExtended6 = pointExtendedArr[i15];
                        int[] iArr11 = pointExtended6.x;
                        X25519Field.mul(iArr11, pointExtended6.z, iArr11);
                        int[] iArr12 = pointExtended6.y;
                        X25519Field.mul(iArr12, pointExtended6.z, iArr12);
                        X25519Field.apm(pointExtended6.y, pointExtended6.x, pointPrecomp3.ypx_h, pointPrecomp3.ymx_h);
                        X25519Field.mul(pointExtended6.x, pointExtended6.y, pointPrecomp3.xyd);
                        int[] iArr13 = pointPrecomp3.xyd;
                        X25519Field.mul(iArr13, C_d4, iArr13);
                        X25519Field.normalize(pointPrecomp3.ymx_h);
                        X25519Field.normalize(pointPrecomp3.ypx_h);
                        X25519Field.normalize(pointPrecomp3.xyd);
                        X25519Field.copy(pointPrecomp3.ymx_h, 0, PRECOMP_BASE_COMB, i14);
                        X25519Field.copy(pointPrecomp3.ypx_h, 0, PRECOMP_BASE_COMB, i14 + 10);
                        X25519Field.copy(pointPrecomp3.xyd, 0, PRECOMP_BASE_COMB, i14 + 20);
                        i14 += 30;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b = (byte) (bArr2[31] & 127);
        bArr2[31] = b;
        bArr2[31] = (byte) (b | 64);
    }

    private static void scalarMult(byte[] bArr, PointAffine pointAffine, PointAccum pointAccum) {
        int[] iArr = new int[8];
        Scalar25519.decode(bArr, iArr);
        Scalar25519.toSignedDigits(256, iArr, iArr);
        PointPrecompZ pointPrecompZ = new PointPrecompZ();
        PointTemp pointTemp = new PointTemp();
        int[] iArrPointPrecomputeZ = pointPrecomputeZ(pointAffine, 8, pointTemp);
        pointSetNeutral(pointAccum);
        int i = 63;
        while (true) {
            pointLookupZ(iArr, i, iArrPointPrecomputeZ, pointPrecompZ);
            pointAdd(pointPrecompZ, pointAccum, pointTemp);
            i--;
            if (i < 0) {
                return;
            }
            for (int i2 = 0; i2 < 4; i2++) {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultBase(byte[] bArr, PointAccum pointAccum) {
        precompute();
        int[] iArr = new int[8];
        Scalar25519.decode(bArr, iArr);
        Scalar25519.toSignedDigits(256, iArr, iArr);
        groupCombBits(iArr);
        PointPrecomp pointPrecomp = new PointPrecomp();
        PointTemp pointTemp = new PointTemp();
        pointSetNeutral(pointAccum);
        int i = 28;
        int i2 = 0;
        while (true) {
            int i3 = 0;
            while (i3 < 8) {
                int i4 = iArr[i3] >>> i;
                int i5 = (i4 >>> 3) & 1;
                pointLookup(i3, (i4 ^ (-i5)) & 7, pointPrecomp);
                int i6 = i2 ^ i5;
                X25519Field.cnegate(i6, pointAccum.x);
                X25519Field.cnegate(i6, pointAccum.u);
                pointAdd(pointPrecomp, pointAccum, pointTemp);
                i3++;
                i2 = i5;
            }
            i -= 4;
            if (i < 0) {
                X25519Field.cnegate(i2, pointAccum.x);
                X25519Field.cnegate(i2, pointAccum.u);
                return;
            }
            pointDouble(pointAccum);
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i) {
        PointAccum pointAccum = new PointAccum();
        scalarMultBase(bArr, pointAccum);
        if (encodeResult(pointAccum, bArr2, i) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void scalarMultBaseYZ(X25519.Friend friend, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by X25519");
        }
        byte[] bArr2 = new byte[32];
        pruneScalar(bArr, i, bArr2);
        PointAccum pointAccum = new PointAccum();
        scalarMultBase(bArr2, pointAccum);
        if (checkPoint(pointAccum) == 0) {
            throw new IllegalStateException();
        }
        X25519Field.copy(pointAccum.y, 0, iArr, 0);
        X25519Field.copy(pointAccum.z, 0, iArr2, 0);
    }

    private static void scalarMultOrderVar(PointAffine pointAffine, PointAccum pointAccum) {
        byte[] bArr = new byte[253];
        Scalar25519.getOrderWnafVar(4, bArr);
        PointPrecompZ[] pointPrecompZArr = new PointPrecompZ[4];
        PointTemp pointTemp = new PointTemp();
        pointPrecomputeZ(pointAffine, pointPrecompZArr, 4, pointTemp);
        pointSetNeutral(pointAccum);
        int i = 252;
        while (true) {
            byte b = bArr[i];
            if (b != 0) {
                pointAddVar(b < 0, pointPrecompZArr[(b >> 1) ^ (b >> 31)], pointAccum, pointTemp);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultStraus128Var(int[] iArr, int[] iArr2, PointAffine pointAffine, int[] iArr3, PointAffine pointAffine2, PointAccum pointAccum) {
        precompute();
        byte[] bArr = new byte[256];
        int i = 128;
        byte[] bArr2 = new byte[128];
        byte[] bArr3 = new byte[128];
        Wnaf.getSignedVar(iArr, 6, bArr);
        Wnaf.getSignedVar(iArr2, 4, bArr2);
        Wnaf.getSignedVar(iArr3, 4, bArr3);
        PointPrecompZ[] pointPrecompZArr = new PointPrecompZ[4];
        PointPrecompZ[] pointPrecompZArr2 = new PointPrecompZ[4];
        PointTemp pointTemp = new PointTemp();
        pointPrecomputeZ(pointAffine, pointPrecompZArr, 4, pointTemp);
        pointPrecomputeZ(pointAffine2, pointPrecompZArr2, 4, pointTemp);
        pointSetNeutral(pointAccum);
        while (true) {
            int i2 = i - 1;
            if (i2 < 0) {
                pointDouble(pointAccum);
                pointDouble(pointAccum);
                return;
            }
            byte b = bArr[i2];
            if (b != 0) {
                pointAddVar(b < 0, PRECOMP_BASE_WNAF[(b >> 1) ^ (b >> 31)], pointAccum, pointTemp);
            }
            byte b2 = bArr[i + 127];
            if (b2 != 0) {
                pointAddVar(b2 < 0, PRECOMP_BASE128_WNAF[(b2 >> 1) ^ (b2 >> 31)], pointAccum, pointTemp);
            }
            byte b3 = bArr2[i2];
            if (b3 != 0) {
                pointAddVar(b3 < 0, pointPrecompZArr[(b3 >> 1) ^ (b3 >> 31)], pointAccum, pointTemp);
            }
            byte b4 = bArr3[i2];
            if (b4 != 0) {
                pointAddVar(b4 < 0, pointPrecompZArr2[(b4 >> 1) ^ (b4 >> 31)], pointAccum, pointTemp);
            }
            pointDouble(pointAccum);
            i = i2;
        }
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        implSign(bArr, i, null, (byte) 0, bArr2, i2, i3, bArr3, i4);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, Digest digest, byte[] bArr4, int i3) {
        byte[] bArr5 = new byte[64];
        if (64 != digest.doFinal(bArr5, 0)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i3);
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i) {
        byte[] bArrCopy = copy(bArr, i, 32);
        if (!checkPointFullVar(bArrCopy)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine)) {
            return checkPointOrderVar(pointAffine);
        }
        return false;
    }

    public static PublicPoint validatePublicKeyFullExport(byte[] bArr, int i) {
        byte[] bArrCopy = copy(bArr, i, 32);
        if (!checkPointFullVar(bArrCopy)) {
            return null;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine) && checkPointOrderVar(pointAffine)) {
            return exportPoint(pointAffine);
        }
        return null;
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i) {
        byte[] bArrCopy = copy(bArr, i, 32);
        if (checkPointFullVar(bArrCopy)) {
            return decodePointVar(bArrCopy, false, new PointAffine());
        }
        return false;
    }

    public static PublicPoint validatePublicKeyPartialExport(byte[] bArr, int i) {
        byte[] bArrCopy = copy(bArr, i, 32);
        if (!checkPointFullVar(bArrCopy)) {
            return null;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine)) {
            return exportPoint(pointAffine);
        }
        return null;
    }

    public static boolean verify(byte[] bArr, int i, PublicPoint publicPoint, byte[] bArr2, int i2, int i3) {
        return implVerify(bArr, i, publicPoint, null, (byte) 0, bArr2, i2, i3);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, PublicPoint publicPoint, byte[] bArr2, Digest digest) {
        byte[] bArr3 = new byte[64];
        if (64 == digest.doFinal(bArr3, 0)) {
            return implVerify(bArr, i, publicPoint, bArr2, (byte) 1, bArr3, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    private static int checkPoint(PointAffine pointAffine) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        int[] iArrCreate3 = X25519Field.create();
        X25519Field.sqr(pointAffine.x, iArrCreate2);
        X25519Field.sqr(pointAffine.y, iArrCreate3);
        X25519Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X25519Field.sub(iArrCreate3, iArrCreate2, iArrCreate3);
        X25519Field.mul(iArrCreate, C_d, iArrCreate);
        X25519Field.addOne(iArrCreate);
        X25519Field.sub(iArrCreate, iArrCreate3, iArrCreate);
        X25519Field.normalize(iArrCreate);
        return X25519Field.isZero(iArrCreate);
    }

    public static void generatePublicKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        Digest digestCreateDigest = createDigest();
        byte[] bArr3 = new byte[64];
        digestCreateDigest.update(bArr, i, 32);
        digestCreateDigest.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i2);
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, byte b, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        if (!checkContextVar(bArr2, b)) {
            throw new IllegalArgumentException("ctx");
        }
        Digest digestCreateDigest = createDigest();
        byte[] bArr5 = new byte[64];
        digestCreateDigest.update(bArr, i, 32);
        digestCreateDigest.doFinal(bArr5, 0);
        byte[] bArr6 = new byte[32];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[32];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(digestCreateDigest, bArr5, bArr6, bArr7, 0, bArr2, b, bArr3, i2, i3, bArr4, i4);
    }

    private static boolean implVerify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4) {
        if (!checkContextVar(bArr3, b)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArrCopy = copy(bArr, i, 32);
        byte[] bArrCopy2 = copy(bArr, i + 32, 32);
        byte[] bArrCopy3 = copy(bArr2, i2, 32);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[8];
        if (!Scalar25519.checkVar(bArrCopy2, iArr) || !checkPointFullVar(bArrCopy3)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArrCopy, true, pointAffine)) {
            return false;
        }
        PointAffine pointAffine2 = new PointAffine();
        if (!decodePointVar(bArrCopy3, true, pointAffine2)) {
            return false;
        }
        Digest digestCreateDigest = createDigest();
        byte[] bArr5 = new byte[64];
        if (bArr3 != null) {
            dom2(digestCreateDigest, b, bArr3);
        }
        digestCreateDigest.update(bArrCopy, 0, 32);
        digestCreateDigest.update(bArrCopy3, 0, 32);
        digestCreateDigest.update(bArr4, i3, i4);
        digestCreateDigest.doFinal(bArr5, 0);
        int[] iArr2 = new int[8];
        Scalar25519.decode(Scalar25519.reduce(bArr5), iArr2);
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        Scalar25519.reduceBasisVar(iArr2, iArr3, iArr4);
        Scalar25519.multiply128Var(iArr, iArr4, iArr);
        PointAccum pointAccum = new PointAccum();
        scalarMultStraus128Var(iArr, iArr3, pointAffine2, iArr4, pointAffine, pointAccum);
        return normalizeToNeutralElementVar(pointAccum);
    }

    private static void pointAdd(PointPrecomp pointPrecomp, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr = pointAccum.x;
        int[] iArr2 = pointAccum.y;
        int[] iArr3 = pointTemp.r0;
        int[] iArr4 = pointAccum.u;
        int[] iArr5 = pointAccum.v;
        X25519Field.apm(iArr2, iArr, iArr2, iArr);
        X25519Field.mul(iArr, pointPrecomp.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecomp.ypx_h, iArr2);
        X25519Field.mul(pointAccum.u, pointAccum.v, iArr3);
        X25519Field.mul(iArr3, pointPrecomp.xyd, iArr3);
        X25519Field.apm(iArr2, iArr, iArr5, iArr4);
        X25519Field.apm(pointAccum.z, iArr3, iArr2, iArr);
        X25519Field.mul(iArr, iArr2, pointAccum.z);
        X25519Field.mul(iArr, iArr4, pointAccum.x);
        X25519Field.mul(iArr2, iArr5, pointAccum.y);
    }

    private static void pointAddVar(boolean z, PointPrecompZ pointPrecompZ, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = pointAccum.x;
        int[] iArr4 = pointAccum.y;
        int[] iArr5 = pointTemp.r0;
        int[] iArr6 = pointAccum.z;
        int[] iArr7 = pointAccum.u;
        int[] iArr8 = pointAccum.v;
        if (z) {
            iArr2 = iArr3;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        X25519Field.apm(iArr4, iArr3, iArr4, iArr3);
        X25519Field.mul(iArr, pointPrecompZ.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecompZ.ypx_h, iArr2);
        X25519Field.mul(pointAccum.u, pointAccum.v, iArr5);
        X25519Field.mul(iArr5, pointPrecompZ.xyd, iArr5);
        X25519Field.mul(pointAccum.z, pointPrecompZ.z, iArr6);
        X25519Field.apm(iArr4, iArr3, iArr8, iArr7);
        X25519Field.apm(iArr6, iArr5, iArr2, iArr);
        X25519Field.mul(iArr3, iArr4, pointAccum.z);
        X25519Field.mul(iArr3, iArr7, pointAccum.x);
        X25519Field.mul(iArr4, iArr8, pointAccum.y);
    }

    private static void pointCopy(PointAffine pointAffine, PointExtended pointExtended) {
        X25519Field.copy(pointAffine.x, 0, pointExtended.x, 0);
        X25519Field.copy(pointAffine.y, 0, pointExtended.y, 0);
        X25519Field.one(pointExtended.z);
        X25519Field.mul(pointAffine.x, pointAffine.y, pointExtended.t);
    }

    private static int[] pointPrecomputeZ(PointAffine pointAffine, int i, PointTemp pointTemp) {
        PointExtended pointExtended = new PointExtended();
        pointCopy(pointAffine, pointExtended);
        PointExtended pointExtended2 = new PointExtended();
        pointAdd(pointExtended, pointExtended, pointExtended2, pointTemp);
        PointPrecompZ pointPrecompZ = new PointPrecompZ();
        int[] iArrCreateTable = X25519Field.createTable(i * 4);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            pointCopy(pointExtended, pointPrecompZ);
            X25519Field.copy(pointPrecompZ.ymx_h, 0, iArrCreateTable, i2);
            X25519Field.copy(pointPrecompZ.ypx_h, 0, iArrCreateTable, i2 + 10);
            X25519Field.copy(pointPrecompZ.xyd, 0, iArrCreateTable, i2 + 20);
            X25519Field.copy(pointPrecompZ.z, 0, iArrCreateTable, i2 + 30);
            i2 += 40;
            i3++;
            if (i3 == i) {
                return iArrCreateTable;
            }
            pointAdd(pointExtended, pointExtended2, pointExtended, pointTemp);
        }
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, byte[] bArr4, int i5) {
        implSign(bArr, i, bArr2, i2, null, (byte) 0, bArr3, i3, i4, bArr4, i5);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, byte[] bArr5, int i4) {
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64, bArr5, i4);
    }

    public static boolean verify(byte[] bArr, int i, PublicPoint publicPoint, byte[] bArr2, byte[] bArr3, int i2, int i3) {
        return implVerify(bArr, i, publicPoint, bArr2, (byte) 0, bArr3, i2, i3);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, PublicPoint publicPoint, byte[] bArr2, byte[] bArr3, int i2) {
        return implVerify(bArr, i, publicPoint, bArr2, (byte) 1, bArr3, i2, 64);
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (!checkContextVar(bArr3, b)) {
            throw new IllegalArgumentException("ctx");
        }
        Digest digestCreateDigest = createDigest();
        byte[] bArr6 = new byte[64];
        digestCreateDigest.update(bArr, i, 32);
        digestCreateDigest.doFinal(bArr6, 0);
        byte[] bArr7 = new byte[32];
        pruneScalar(bArr6, 0, bArr7);
        implSign(digestCreateDigest, bArr6, bArr7, bArr2, i2, bArr3, b, bArr4, i3, i4, bArr5, i5);
    }

    private static void pointAdd(PointPrecompZ pointPrecompZ, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr = pointAccum.x;
        int[] iArr2 = pointAccum.y;
        int[] iArr3 = pointTemp.r0;
        int[] iArr4 = pointAccum.z;
        int[] iArr5 = pointAccum.u;
        int[] iArr6 = pointAccum.v;
        X25519Field.apm(iArr2, iArr, iArr2, iArr);
        X25519Field.mul(iArr, pointPrecompZ.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecompZ.ypx_h, iArr2);
        X25519Field.mul(pointAccum.u, pointAccum.v, iArr3);
        X25519Field.mul(iArr3, pointPrecompZ.xyd, iArr3);
        X25519Field.mul(pointAccum.z, pointPrecompZ.z, iArr4);
        X25519Field.apm(iArr2, iArr, iArr6, iArr5);
        X25519Field.apm(iArr4, iArr3, iArr2, iArr);
        X25519Field.mul(iArr, iArr2, pointAccum.z);
        X25519Field.mul(iArr, iArr5, pointAccum.x);
        X25519Field.mul(iArr2, iArr6, pointAccum.y);
    }

    private static void pointCopy(PointExtended pointExtended, PointPrecompZ pointPrecompZ) {
        X25519Field.apm(pointExtended.y, pointExtended.x, pointPrecompZ.ypx_h, pointPrecompZ.ymx_h);
        X25519Field.mul(pointExtended.t, C_d2, pointPrecompZ.xyd);
        int[] iArr = pointExtended.z;
        X25519Field.add(iArr, iArr, pointPrecompZ.z);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4, bArr5, i5);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, Digest digest, byte[] bArr3, int i2) {
        byte[] bArr4 = new byte[64];
        if (64 != digest.doFinal(bArr4, 0)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i2);
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        return implVerify(bArr, i, bArr2, i2, null, (byte) 0, bArr3, i3, i4);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, Digest digest) {
        byte[] bArr4 = new byte[64];
        if (64 == digest.doFinal(bArr4, 0)) {
            return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        implSign(bArr, i, bArr2, (byte) 0, bArr3, i2, i3, bArr4, i4);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4, int i3) {
        implSign(bArr, i, bArr2, (byte) 1, bArr3, i2, 64, bArr4, i3);
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4) {
        return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3) {
        return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64);
    }
}
