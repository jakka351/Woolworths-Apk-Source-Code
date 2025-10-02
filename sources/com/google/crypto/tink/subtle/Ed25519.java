package com.google.crypto.tink.subtle;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class Ed25519 {

    /* renamed from: a, reason: collision with root package name */
    public static final CachedXYT f15146a = new CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final PartialXYZT b = new PartialXYZT(new XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    public static class CachedXYZT extends CachedXYT {
    }

    public static class XYZ {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f15149a;
        public final long[] b;
        public final long[] c;

        public XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        public static void a(PartialXYZT partialXYZT, XYZ xyz) {
            long[] jArr = xyz.f15149a;
            XYZ xyz2 = partialXYZT.f15148a;
            long[] jArr2 = xyz2.f15149a;
            long[] jArr3 = partialXYZT.b;
            Field25519.c(jArr, jArr2, jArr3);
            long[] jArr4 = xyz.b;
            long[] jArr5 = xyz2.b;
            long[] jArr6 = xyz2.c;
            Field25519.c(jArr4, jArr5, jArr6);
            Field25519.c(xyz.c, jArr6, jArr3);
        }

        public XYZ(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f15149a = jArr;
            this.b = jArr2;
            this.c = jArr3;
        }

        public XYZ(XYZ xyz) {
            this.f15149a = Arrays.copyOf(xyz.f15149a, 10);
            this.b = Arrays.copyOf(xyz.b, 10);
            this.c = Arrays.copyOf(xyz.c, 10);
        }
    }

    public static class XYZT {

        /* renamed from: a, reason: collision with root package name */
        public final XYZ f15150a = new XYZ();
        public final long[] b = new long[10];

        public static void a(XYZT xyzt, PartialXYZT partialXYZT) {
            XYZ xyz = xyzt.f15150a;
            long[] jArr = xyz.f15149a;
            XYZ xyz2 = partialXYZT.f15148a;
            long[] jArr2 = xyz2.f15149a;
            long[] jArr3 = partialXYZT.b;
            Field25519.c(jArr, jArr2, jArr3);
            long[] jArr4 = xyz.b;
            long[] jArr5 = xyz2.b;
            long[] jArr6 = xyz2.c;
            Field25519.c(jArr4, jArr5, jArr6);
            Field25519.c(xyz.c, jArr6, jArr3);
            Field25519.c(xyzt.b, xyz2.f15149a, xyz2.b);
        }
    }

    public static void a(PartialXYZT partialXYZT, XYZT xyzt, CachedXYT cachedXYT) {
        long[] jArr = new long[10];
        XYZ xyz = partialXYZT.f15148a;
        long[] jArr2 = xyz.f15149a;
        XYZ xyz2 = xyzt.f15150a;
        Field25519.g(jArr2, xyz2.b, xyz2.f15149a);
        Field25519.f(xyz.b, xyz2.b, xyz2.f15149a);
        long[] jArr3 = xyz.b;
        Field25519.c(jArr3, jArr3, cachedXYT.b);
        long[] jArr4 = xyz.c;
        long[] jArr5 = xyz.f15149a;
        Field25519.c(jArr4, jArr5, cachedXYT.f15147a);
        long[] jArr6 = partialXYZT.b;
        Field25519.c(jArr6, xyzt.b, cachedXYT.c);
        System.arraycopy(xyz2.c, 0, jArr5, 0, 10);
        Field25519.g(jArr, jArr5, jArr5);
        Field25519.f(jArr5, jArr4, jArr3);
        Field25519.g(jArr3, jArr4, jArr3);
        Field25519.g(jArr4, jArr, jArr6);
        Field25519.f(jArr6, jArr, jArr6);
    }

    public static void b(PartialXYZT partialXYZT, XYZ xyz) {
        long[] jArr = new long[10];
        XYZ xyz2 = partialXYZT.f15148a;
        long[] jArr2 = xyz2.f15149a;
        long[] jArr3 = xyz.f15149a;
        Field25519.e(jArr2, jArr3);
        long[] jArr4 = xyz2.c;
        long[] jArr5 = xyz.b;
        Field25519.e(jArr4, jArr5);
        long[] jArr6 = partialXYZT.b;
        Field25519.e(jArr6, xyz.c);
        Field25519.g(jArr6, jArr6, jArr6);
        long[] jArr7 = xyz2.b;
        Field25519.g(jArr7, jArr3, jArr5);
        Field25519.e(jArr, jArr7);
        long[] jArr8 = xyz2.c;
        long[] jArr9 = xyz2.f15149a;
        Field25519.g(jArr7, jArr8, jArr9);
        Field25519.f(jArr8, jArr8, jArr9);
        Field25519.f(jArr9, jArr, jArr7);
        Field25519.f(jArr6, jArr6, jArr8);
    }

    public static int c(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return ((i5 & (i5 << 1)) >> 7) & 1;
    }

    public static byte[] d(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) EngineFactory.h.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b2 = (byte) (bArrDigest[31] & 127);
        bArrDigest[31] = b2;
        bArrDigest[31] = (byte) (b2 | 64);
        return bArrDigest;
    }

    public static byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[64];
        for (int i = 0; i < 32; i++) {
            int i2 = i * 2;
            bArr2[i2] = (byte) (bArr[i] & 15);
            bArr2[i2 + 1] = (byte) (((bArr[i] & 255) >> 4) & 15);
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < 63) {
            byte b2 = (byte) (bArr2[i3] + i4);
            bArr2[i3] = b2;
            int i5 = (b2 + 8) >> 4;
            bArr2[i3] = (byte) (b2 - (i5 << 4));
            i3++;
            i4 = i5;
        }
        bArr2[63] = (byte) (bArr2[63] + i4);
        PartialXYZT partialXYZT = new PartialXYZT();
        XYZT xyzt = new XYZT();
        for (int i6 = 1; i6 < 64; i6 += 2) {
            CachedXYT cachedXYT = new CachedXYT();
            f(cachedXYT, i6 / 2, bArr2[i6]);
            XYZT.a(xyzt, partialXYZT);
            a(partialXYZT, xyzt, cachedXYT);
        }
        XYZ xyz = new XYZ();
        XYZ.a(partialXYZT, xyz);
        b(partialXYZT, xyz);
        XYZ.a(partialXYZT, xyz);
        b(partialXYZT, xyz);
        XYZ.a(partialXYZT, xyz);
        b(partialXYZT, xyz);
        XYZ.a(partialXYZT, xyz);
        b(partialXYZT, xyz);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            CachedXYT cachedXYT2 = new CachedXYT();
            f(cachedXYT2, i7 / 2, bArr2[i7]);
            XYZT.a(xyzt, partialXYZT);
            a(partialXYZT, xyzt, cachedXYT2);
        }
        XYZ xyz2 = new XYZ();
        XYZ.a(partialXYZT, xyz2);
        long[] jArr = new long[10];
        long[] jArr2 = xyz2.f15149a;
        Field25519.e(jArr, jArr2);
        long[] jArr3 = new long[10];
        long[] jArr4 = xyz2.b;
        Field25519.e(jArr3, jArr4);
        long[] jArr5 = new long[10];
        long[] jArr6 = xyz2.c;
        Field25519.e(jArr5, jArr6);
        long[] jArr7 = new long[10];
        Field25519.e(jArr7, jArr5);
        long[] jArr8 = new long[10];
        Field25519.f(jArr8, jArr3, jArr);
        Field25519.c(jArr8, jArr8, jArr5);
        long[] jArr9 = new long[10];
        Field25519.c(jArr9, jArr, jArr3);
        Field25519.c(jArr9, jArr9, Ed25519Constants.f15151a);
        Field25519.g(jArr9, jArr9, jArr7);
        Field25519.d(jArr9, jArr9);
        if (!Bytes.b(Field25519.a(jArr8), Field25519.a(jArr9))) {
            throw new IllegalStateException("arithmetic error in scalar multiplication");
        }
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = new long[10];
        long[] jArr15 = new long[10];
        long[] jArr16 = new long[10];
        long[] jArr17 = new long[10];
        long[] jArr18 = new long[10];
        long[] jArr19 = new long[10];
        long[] jArr20 = new long[10];
        long[] jArr21 = new long[10];
        long[] jArr22 = new long[10];
        Field25519.e(jArr13, jArr6);
        Field25519.e(jArr22, jArr13);
        Field25519.e(jArr21, jArr22);
        Field25519.c(jArr14, jArr21, jArr6);
        Field25519.c(jArr15, jArr14, jArr13);
        Field25519.e(jArr21, jArr15);
        Field25519.c(jArr16, jArr21, jArr14);
        Field25519.e(jArr21, jArr16);
        Field25519.e(jArr22, jArr21);
        Field25519.e(jArr21, jArr22);
        Field25519.e(jArr22, jArr21);
        Field25519.e(jArr21, jArr22);
        Field25519.c(jArr17, jArr21, jArr16);
        Field25519.e(jArr21, jArr17);
        Field25519.e(jArr22, jArr21);
        for (int i8 = 2; i8 < 10; i8 += 2) {
            Field25519.e(jArr21, jArr22);
            Field25519.e(jArr22, jArr21);
        }
        Field25519.c(jArr18, jArr22, jArr17);
        Field25519.e(jArr21, jArr18);
        Field25519.e(jArr22, jArr21);
        for (int i9 = 2; i9 < 20; i9 += 2) {
            Field25519.e(jArr21, jArr22);
            Field25519.e(jArr22, jArr21);
        }
        Field25519.c(jArr21, jArr22, jArr18);
        Field25519.e(jArr22, jArr21);
        Field25519.e(jArr21, jArr22);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            Field25519.e(jArr22, jArr21);
            Field25519.e(jArr21, jArr22);
        }
        Field25519.c(jArr19, jArr21, jArr17);
        Field25519.e(jArr21, jArr19);
        Field25519.e(jArr22, jArr21);
        for (int i11 = 2; i11 < 50; i11 += 2) {
            Field25519.e(jArr21, jArr22);
            Field25519.e(jArr22, jArr21);
        }
        Field25519.c(jArr20, jArr22, jArr19);
        Field25519.e(jArr22, jArr20);
        Field25519.e(jArr21, jArr22);
        for (int i12 = 2; i12 < 100; i12 += 2) {
            Field25519.e(jArr22, jArr21);
            Field25519.e(jArr21, jArr22);
        }
        Field25519.c(jArr22, jArr21, jArr20);
        Field25519.e(jArr21, jArr22);
        Field25519.e(jArr22, jArr21);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            Field25519.e(jArr21, jArr22);
            Field25519.e(jArr22, jArr21);
        }
        Field25519.c(jArr21, jArr22, jArr19);
        Field25519.e(jArr22, jArr21);
        Field25519.e(jArr21, jArr22);
        Field25519.e(jArr22, jArr21);
        Field25519.e(jArr21, jArr22);
        Field25519.e(jArr22, jArr21);
        Field25519.c(jArr10, jArr22, jArr15);
        Field25519.c(jArr11, jArr2, jArr10);
        Field25519.c(jArr12, jArr4, jArr10);
        byte[] bArrA = Field25519.a(jArr12);
        bArrA[31] = (byte) (bArrA[31] ^ ((Field25519.a(jArr11)[0] & 1) << 7));
        return bArrA;
    }

    public static void f(CachedXYT cachedXYT, int i, byte b2) {
        int i2 = (b2 & 255) >> 7;
        int i3 = b2 - (((-i2) & b2) << 1);
        CachedXYT[][] cachedXYTArr = Ed25519Constants.b;
        cachedXYT.a(cachedXYTArr[i][0], c(i3, 1));
        cachedXYT.a(cachedXYTArr[i][1], c(i3, 2));
        cachedXYT.a(cachedXYTArr[i][2], c(i3, 3));
        cachedXYT.a(cachedXYTArr[i][3], c(i3, 4));
        cachedXYT.a(cachedXYTArr[i][4], c(i3, 5));
        cachedXYT.a(cachedXYTArr[i][5], c(i3, 6));
        cachedXYT.a(cachedXYTArr[i][6], c(i3, 7));
        cachedXYT.a(cachedXYTArr[i][7], c(i3, 8));
        long[] jArrCopyOf = Arrays.copyOf(cachedXYT.b, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(cachedXYT.f15147a, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(cachedXYT.c, 10);
        for (int i4 = 0; i4 < jArrCopyOf3.length; i4++) {
            jArrCopyOf3[i4] = -jArrCopyOf3[i4];
        }
        cachedXYT.a(new CachedXYT(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i2);
    }

    public static class PartialXYZT {

        /* renamed from: a, reason: collision with root package name */
        public final XYZ f15148a;
        public final long[] b;

        public PartialXYZT(XYZ xyz, long[] jArr) {
            this.f15148a = xyz;
            this.b = jArr;
        }

        public PartialXYZT() {
            PartialXYZT partialXYZT = Ed25519.b;
            this.f15148a = new XYZ(partialXYZT.f15148a);
            this.b = Arrays.copyOf(partialXYZT.b, 10);
        }
    }

    public static class CachedXYT {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f15147a;
        public final long[] b;
        public final long[] c;

        public CachedXYT(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f15147a = jArr;
            this.b = jArr2;
            this.c = jArr3;
        }

        public final void a(CachedXYT cachedXYT, int i) {
            Curve25519.a(this.f15147a, cachedXYT.f15147a, i);
            Curve25519.a(this.b, cachedXYT.b, i);
            Curve25519.a(this.c, cachedXYT.c, i);
        }

        public CachedXYT() {
            CachedXYT cachedXYT = Ed25519.f15146a;
            this.f15147a = Arrays.copyOf(cachedXYT.f15147a, 10);
            this.b = Arrays.copyOf(cachedXYT.b, 10);
            this.c = Arrays.copyOf(cachedXYT.c, 10);
        }
    }
}
