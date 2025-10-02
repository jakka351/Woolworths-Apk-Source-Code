package com.fasterxml.jackson.core.io;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.math.BigDecimal;

/* loaded from: classes4.dex */
public final class BigDecimalParser {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.math.BigDecimal a(java.lang.String r5) {
        /*
            char[] r5 = r5.toCharArray()
            int r0 = r5.length
            r1 = 500(0x1f4, float:7.0E-43)
            r2 = 0
            if (r0 >= r1) goto L14
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L10 java.lang.ArithmeticException -> L12
            r1.<init>(r5, r2, r0)     // Catch: java.lang.NumberFormatException -> L10 java.lang.ArithmeticException -> L12
            return r1
        L10:
            r1 = move-exception
            goto L1b
        L12:
            r1 = move-exception
            goto L1b
        L14:
            int r1 = r0 / 10
            java.math.BigDecimal r5 = b(r5, r0, r1)     // Catch: java.lang.NumberFormatException -> L10 java.lang.ArithmeticException -> L12
            return r5
        L1b:
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L23
            java.lang.String r1 = "Not a valid number representation"
        L23:
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r0 > r3) goto L2d
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5, r2, r0)
            goto L4a
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = new java.lang.String
            char[] r2 = java.util.Arrays.copyOfRange(r5, r2, r3)
            r4.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = "(truncated, full length is "
            r0.append(r2)
            int r5 = r5.length
            java.lang.String r2 = " chars)"
            java.lang.String r3 = YU.a.m(r0, r5, r2)
        L4a:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.String r0 = "Value \""
            java.lang.String r2 = "\" can not be represented as `java.math.BigDecimal`, reason: "
            java.lang.String r0 = YU.a.i(r0, r3, r2, r1)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.BigDecimalParser.a(java.lang.String):java.math.BigDecimal");
    }

    public static BigDecimal b(char[] cArr, int i, int i2) throws NumberFormatException {
        int i3;
        BigDecimal bigDecimalC;
        int i4 = i;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        boolean z = false;
        boolean z2 = false;
        int i8 = 0;
        boolean z3 = false;
        for (int i9 = 0; i9 < i4; i9++) {
            char c = cArr[i9];
            if (c != '+') {
                if (c == 'E' || c == 'e') {
                    if (i5 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    i5 = i9;
                } else if (c != '-') {
                    if (c == '.') {
                        if (i6 >= 0) {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                        i6 = i9;
                    } else if (i6 >= 0 && i5 == -1) {
                        i7++;
                    }
                } else if (i5 >= 0) {
                    if (z2) {
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    z2 = true;
                } else {
                    if (z) {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                    i8 = i9 + 1;
                    z = true;
                    z3 = true;
                }
            } else if (i5 >= 0) {
                if (z2) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z2 = true;
            } else {
                if (z) {
                    throw new NumberFormatException("Multiple signs in number");
                }
                i8 = i9 + 1;
                z = true;
            }
        }
        if (i5 >= 0) {
            i3 = Integer.parseInt(new String(cArr, i5 + 1, (i4 - i5) - 1));
            long j = i3;
            long j2 = i7 - j;
            if (j2 > 2147483647L || j2 < -2147483648L) {
                StringBuilder sb = new StringBuilder("Scale out of range: ");
                sb.append(j2);
                sb.append(" while adjusting scale ");
                sb.append(i7);
                throw new NumberFormatException(c.m(j, " to exponent ", sb));
            }
            i7 = (int) j2;
            i4 = i5;
        } else {
            i3 = 0;
        }
        if (i6 >= 0) {
            int i10 = (i4 - i6) - 1;
            bigDecimalC = c(cArr, i8, i6 - i8, i3, i2).add(c(cArr, i6 + 1, i10, i3 - i10, i2));
        } else {
            bigDecimalC = c(cArr, i8, i4 - i8, i3, i2);
        }
        if (i7 != 0) {
            bigDecimalC = bigDecimalC.setScale(i7);
        }
        return z3 ? bigDecimalC.negate() : bigDecimalC;
    }

    public static BigDecimal c(char[] cArr, int i, int i2, int i3, int i4) {
        if (i2 <= i4) {
            return i2 == 0 ? BigDecimal.ZERO : new BigDecimal(cArr, i, i2).movePointRight(i3);
        }
        int i5 = i2 / 2;
        return c(cArr, i, i5, (i3 + i2) - i5, i4).add(c(cArr, i + i5, i2 - i5, i3, i4));
    }
}
