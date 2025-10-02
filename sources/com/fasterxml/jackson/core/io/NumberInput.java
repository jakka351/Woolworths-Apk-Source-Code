package com.fasterxml.jackson.core.io;

import android.support.v4.media.session.a;
import com.fasterxml.jackson.core.io.doubleparser.FastDoubleParser;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class NumberInput {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14199a = String.valueOf(Long.MIN_VALUE).substring(1);
    public static final String b = String.valueOf(Long.MAX_VALUE);

    public static long a(String str) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return 0L;
        }
        int i = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i = 1;
        }
        while (i < length) {
            char cCharAt2 = strTrim.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (long) FastDoubleParser.a(strTrim);
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            i++;
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused2) {
            return 0L;
        }
    }

    public static BigInteger b(String str) {
        return str.length() > 1250 ? BigDecimalParser.a(str).toBigInteger() : new BigInteger(str);
    }

    public static double c(String str, boolean z) {
        return z ? FastDoubleParser.a(str) : Double.parseDouble(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0072, code lost:
    
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(java.lang.String r10) {
        /*
            r0 = 0
            char r1 = r10.charAt(r0)
            int r2 = r10.length()
            r3 = 45
            r4 = 1
            if (r1 != r3) goto Lf
            r0 = r4
        Lf:
            r3 = 2
            r5 = 10
            if (r0 == 0) goto L24
            if (r2 == r4) goto L1f
            if (r2 <= r5) goto L19
            goto L1f
        L19:
            char r1 = r10.charAt(r4)
            r4 = r3
            goto L2d
        L1f:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L24:
            r6 = 9
            if (r2 <= r6) goto L2d
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L2d:
            r6 = 57
            if (r1 > r6) goto L82
            r7 = 48
            if (r1 >= r7) goto L36
            goto L82
        L36:
            int r1 = r1 - r7
            if (r4 >= r2) goto L7d
            int r8 = r4 + 1
            char r9 = r10.charAt(r4)
            if (r9 > r6) goto L78
            if (r9 >= r7) goto L44
            goto L78
        L44:
            int r1 = r1 * 10
            int r9 = r9 - r7
            int r1 = r1 + r9
            if (r8 >= r2) goto L7d
            int r4 = r4 + r3
            char r3 = r10.charAt(r8)
            if (r3 > r6) goto L73
            if (r3 >= r7) goto L54
            goto L73
        L54:
            int r1 = r1 * 10
            int r3 = r3 - r7
            int r1 = r1 + r3
            if (r4 >= r2) goto L7d
        L5a:
            int r3 = r4 + 1
            char r4 = r10.charAt(r4)
            if (r4 > r6) goto L6e
            if (r4 >= r7) goto L65
            goto L6e
        L65:
            int r1 = r1 * r5
            int r4 = r4 + (-48)
            int r1 = r1 + r4
            if (r3 < r2) goto L6c
            goto L7d
        L6c:
            r4 = r3
            goto L5a
        L6e:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L73:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L78:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L7d:
            if (r0 == 0) goto L81
            int r10 = -r1
            return r10
        L81:
            return r1
        L82:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.d(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int e(char[] cArr, int i, int i2) {
        if (i2 > 0 && cArr[i] == '+') {
            i++;
            i2--;
        }
        int iC = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 2:
                return a.c(cArr[i], 48, 10, iC);
            case 3:
                iC = a.c(cArr[i], 48, 100, iC);
                i++;
                return a.c(cArr[i], 48, 10, iC);
            case 4:
                iC = a.c(cArr[i], 48, 1000, iC);
                i++;
                iC = a.c(cArr[i], 48, 100, iC);
                i++;
                return a.c(cArr[i], 48, 10, iC);
            case 5:
                iC = a.c(cArr[i], 48, ModuleDescriptor.MODULE_VERSION, iC);
                i++;
                iC = a.c(cArr[i], 48, 1000, iC);
                i++;
                iC = a.c(cArr[i], 48, 100, iC);
                i++;
                return a.c(cArr[i], 48, 10, iC);
            case 6:
                iC = a.c(cArr[i], 48, 100000, iC);
                i++;
                iC = a.c(cArr[i], 48, ModuleDescriptor.MODULE_VERSION, iC);
                i++;
                iC = a.c(cArr[i], 48, 1000, iC);
                i++;
                iC = a.c(cArr[i], 48, 100, iC);
                i++;
                return a.c(cArr[i], 48, 10, iC);
            case 7:
                iC = a.c(cArr[i], 48, 1000000, iC);
                i++;
                iC = a.c(cArr[i], 48, 100000, iC);
                i++;
                iC = a.c(cArr[i], 48, ModuleDescriptor.MODULE_VERSION, iC);
                i++;
                iC = a.c(cArr[i], 48, 1000, iC);
                i++;
                iC = a.c(cArr[i], 48, 100, iC);
                i++;
                return a.c(cArr[i], 48, 10, iC);
            case 8:
                iC = a.c(cArr[i], 48, 10000000, iC);
                i++;
                iC = a.c(cArr[i], 48, 1000000, iC);
                i++;
                iC = a.c(cArr[i], 48, 100000, iC);
                i++;
                iC = a.c(cArr[i], 48, ModuleDescriptor.MODULE_VERSION, iC);
                i++;
                iC = a.c(cArr[i], 48, 1000, iC);
                i++;
                iC = a.c(cArr[i], 48, 100, iC);
                i++;
                return a.c(cArr[i], 48, 10, iC);
            case 9:
                iC = a.c(cArr[i], 48, 100000000, iC);
                i++;
                iC = a.c(cArr[i], 48, 10000000, iC);
                i++;
                iC = a.c(cArr[i], 48, 1000000, iC);
                i++;
                iC = a.c(cArr[i], 48, 100000, iC);
                i++;
                iC = a.c(cArr[i], 48, ModuleDescriptor.MODULE_VERSION, iC);
                i++;
                iC = a.c(cArr[i], 48, 1000, iC);
                i++;
                iC = a.c(cArr[i], 48, 100, iC);
                i++;
                return a.c(cArr[i], 48, 10, iC);
            default:
                return iC;
        }
    }

    public static long f(String str) {
        return str.length() <= 9 ? d(str) : Long.parseLong(str);
    }

    public static long g(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (e(cArr, i, i3) * 1000000000) + e(cArr, i + i3, 9);
    }
}
