package com.fasterxml.jackson.core.io.doubleparser;

import com.fasterxml.jackson.core.io.doubleparser.FastDoubleMath;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;

/* loaded from: classes4.dex */
class FastFloatMath {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f14205a = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    public static float a(long j, int i, boolean z) {
        float f;
        long j2;
        if (-10 <= i && i <= 10 && Long.compareUnsigned(j, 16777215L) <= 0) {
            float f2 = j;
            float[] fArr = f14205a;
            float f3 = i < 0 ? f2 / fArr[-i] : f2 * fArr[i];
            return z ? -f3 : f3;
        }
        int i2 = i + 325;
        long j3 = FastDoubleMath.f14202a[i2];
        long j4 = ((i * 217706) >> 16) + 191;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        long j5 = j << iNumberOfLeadingZeros;
        FastDoubleMath.UInt128 uInt128A = FastDoubleMath.a(j5, j3);
        long j6 = uInt128A.b;
        long j7 = uInt128A.f14203a;
        if ((j7 & 274877906943L) != 274877906943L || Long.compareUnsigned(j6 + j5, j6) >= 0) {
            f = Float.NaN;
            j2 = 0;
        } else {
            FastDoubleMath.UInt128 uInt128A2 = FastDoubleMath.a(j5, FastDoubleMath.b[i2]);
            long j8 = uInt128A2.b;
            f = Float.NaN;
            j2 = 0;
            long j9 = uInt128A2.f14203a + j6;
            if (Long.compareUnsigned(j9, j6) < 0) {
                j7++;
            }
            if (j9 + 1 == 0 && (j7 & 549755813887L) == 549755813887L && j8 + Long.compareUnsigned(j5, j8) < 0) {
                return Float.NaN;
            }
        }
        long j10 = j7 >>> 63;
        long j11 = j7 >>> ((int) (38 + j10));
        int i3 = iNumberOfLeadingZeros + ((int) (j10 ^ 1));
        long j12 = j7 & 274877906943L;
        if (j12 != 274877906943L && (j12 != j2 || (3 & j11) != 1)) {
            long j13 = (j11 + 1) >>> 1;
            if (j13 >= llqqqql.c0063cc006300630063) {
                i3--;
                j13 = llqqqql.cccc006300630063;
            }
            long j14 = j13 & (-8388609);
            long j15 = j4 - i3;
            if (j15 >= 1 && j15 <= 254) {
                return Float.intBitsToFloat((int) (j14 | (j15 << 23) | (z ? llqqqql.aa0061aaaa : j2)));
            }
        }
        return f;
    }

    public static float b(long j, int i, boolean z) {
        if (j == 0 || i < -180) {
            if (z) {
                return -0.0f;
            }
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (i > 127) {
            return z ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
        if (Long.compareUnsigned(j, 9007199254740991L) > 0) {
            return Float.NaN;
        }
        float fScalb = Math.scalb(1.0f, i) * j;
        return z ? -fScalb : fScalb;
    }
}
