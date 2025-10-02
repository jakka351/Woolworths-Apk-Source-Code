package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class DoubleMath {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14931a = 0;

    /* renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14932a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f14932a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14932a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14932a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14932a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14932a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14932a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14932a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14932a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (DoubleUtils.b(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.a(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && DoubleUtils.b(d)) {
            long jA = DoubleUtils.a(d);
            if ((jA & (jA - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(double r6) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L12
            boolean r1 = com.google.common.math.DoubleUtils.b(r6)
            if (r1 == 0) goto L12
            r1 = r3
            goto L13
        L12:
            r1 = r2
        L13:
            java.lang.String r4 = "x must be positive and finite"
            com.google.common.base.Preconditions.f(r4, r1)
            int r1 = java.lang.Math.getExponent(r6)
            int r4 = java.lang.Math.getExponent(r6)
            r5 = -1022(0xfffffffffffffc02, float:NaN)
            if (r4 < r5) goto L73
            int[] r4 = com.google.common.math.DoubleMath.AnonymousClass1.f14932a
            int r0 = r0.ordinal()
            r0 = r4[r0]
            switch(r0) {
                case 1: goto L68;
                case 2: goto L6f;
                case 3: goto L61;
                case 4: goto L59;
                case 5: goto L4f;
                case 6: goto L35;
                case 7: goto L35;
                case 8: goto L35;
                default: goto L2f;
            }
        L2f:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L35:
            long r6 = java.lang.Double.doubleToRawLongBits(r6)
            r4 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r6 = r6 & r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r6 = r6 | r4
            double r6 = java.lang.Double.longBitsToDouble(r6)
            double r6 = r6 * r6
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L6f
            r2 = r3
            goto L6f
        L4f:
            if (r1 < 0) goto L52
            r2 = r3
        L52:
            boolean r6 = b(r6)
        L56:
            r6 = r6 ^ r3
            r2 = r2 & r6
            goto L6f
        L59:
            if (r1 >= 0) goto L5c
            r2 = r3
        L5c:
            boolean r6 = b(r6)
            goto L56
        L61:
            boolean r6 = b(r6)
            r2 = r6 ^ 1
            goto L6f
        L68:
            boolean r6 = b(r6)
            com.google.common.math.MathPreconditions.c(r6)
        L6f:
            if (r2 == 0) goto L72
            int r1 = r1 + r3
        L72:
            return r1
        L73:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r6 = r6 * r0
            int r6 = c(r6)
            int r6 = r6 + (-52)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.DoubleMath.c(double):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long d(double r8, java.math.RoundingMode r10) {
        /*
            boolean r0 = com.google.common.math.DoubleUtils.b(r8)
            if (r0 == 0) goto Lb6
            int[] r0 = com.google.common.math.DoubleMath.AnonymousClass1.f14932a
            int r1 = r10.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 1
            r4 = 0
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            switch(r0) {
                case 1: goto L78;
                case 2: goto L68;
                case 3: goto L59;
                case 4: goto L76;
                case 5: goto L46;
                case 6: goto L41;
                case 7: goto L2d;
                case 8: goto L1e;
                default: goto L18;
            }
        L18:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L1e:
            double r2 = java.lang.Math.rint(r8)
            double r4 = r8 - r2
            double r4 = java.lang.Math.abs(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L80
            goto L76
        L2d:
            double r2 = java.lang.Math.rint(r8)
            double r4 = r8 - r2
            double r4 = java.lang.Math.abs(r4)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L80
            double r2 = java.lang.Math.copySign(r6, r8)
            double r2 = r2 + r8
            goto L80
        L41:
            double r2 = java.lang.Math.rint(r8)
            goto L80
        L46:
            boolean r0 = a(r8)
            if (r0 == 0) goto L4d
            goto L76
        L4d:
            long r2 = (long) r8
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L54
            r0 = r1
            goto L55
        L54:
            r0 = -1
        L55:
            long r4 = (long) r0
            long r2 = r2 + r4
            double r2 = (double) r2
            goto L80
        L59:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L76
            boolean r0 = a(r8)
            if (r0 == 0) goto L64
            goto L76
        L64:
            long r4 = (long) r8
            long r4 = r4 + r2
        L66:
            double r2 = (double) r4
            goto L80
        L68:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L76
            boolean r0 = a(r8)
            if (r0 == 0) goto L73
            goto L76
        L73:
            long r4 = (long) r8
            long r4 = r4 - r2
            goto L66
        L76:
            r2 = r8
            goto L80
        L78:
            boolean r0 = a(r8)
            com.google.common.math.MathPreconditions.c(r0)
            goto L76
        L80:
            r4 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            double r4 = r4 - r2
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 0
            if (r0 >= 0) goto L8c
            r0 = r1
            goto L8d
        L8c:
            r0 = r4
        L8d:
            r5 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L94
            goto L95
        L94:
            r1 = r4
        L95:
            r0 = r0 & r1
            if (r0 == 0) goto L9a
            long r8 = (long) r2
            return r8
        L9a:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "rounded value is out of range for input "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " and rounding mode "
            r1.append(r8)
            r1.append(r10)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lb6:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "input is infinite or NaN"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.DoubleMath.d(double, java.math.RoundingMode):long");
    }
}
