package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.Ed25519;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes6.dex */
final class Ed25519Constants {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f15151a;
    public static final Ed25519.CachedXYT[][] b;
    public static final Ed25519.CachedXYT[] c;
    public static final BigInteger d;
    public static final BigInteger e;
    public static final BigInteger f;

    public static class Point {

        /* renamed from: a, reason: collision with root package name */
        public BigInteger f15152a;
        public BigInteger b;
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        d = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        e = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        Point point = new Point();
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        point.b = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        point.f15152a = bigIntegerModPow2;
        f15151a = Field25519.b(c(bigIntegerMod));
        Field25519.b(c(bigIntegerMod2));
        Field25519.b(c(bigIntegerModPow));
        b = (Ed25519.CachedXYT[][]) Array.newInstance((Class<?>) Ed25519.CachedXYT.class, 32, 8);
        Point pointA = point;
        for (int i = 0; i < 32; i++) {
            Point pointA2 = pointA;
            for (int i2 = 0; i2 < 8; i2++) {
                b[i][i2] = b(pointA2);
                pointA2 = a(pointA2, pointA);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                pointA = a(pointA, pointA);
            }
        }
        Point pointA3 = a(point, point);
        c = new Ed25519.CachedXYT[8];
        for (int i4 = 0; i4 < 8; i4++) {
            c[i4] = b(point);
            point = a(point, pointA3);
        }
    }

    public static Point a(Point point, Point point2) {
        Point point3 = new Point();
        BigInteger bigIntegerMultiply = e.multiply(point.f15152a.multiply(point2.f15152a).multiply(point.b).multiply(point2.b));
        BigInteger bigInteger = d;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = point.f15152a.multiply(point2.b).add(point2.f15152a.multiply(point.b));
        BigInteger bigInteger2 = BigInteger.ONE;
        point3.f15152a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        point3.b = point.b.multiply(point2.b).add(point.f15152a.multiply(point2.f15152a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return point3;
    }

    public static Ed25519.CachedXYT b(Point point) {
        BigInteger bigIntegerAdd = point.b.add(point.f15152a);
        BigInteger bigInteger = d;
        return new Ed25519.CachedXYT(Field25519.b(c(bigIntegerAdd.mod(bigInteger))), Field25519.b(c(point.b.subtract(point.f15152a).mod(bigInteger))), Field25519.b(c(f.multiply(point.f15152a).multiply(point.b).mod(bigInteger))));
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }
}
