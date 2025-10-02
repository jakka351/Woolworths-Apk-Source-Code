package com.fasterxml.jackson.core.io;

/* loaded from: classes4.dex */
public final class NumberOutput {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14200a = String.valueOf(Integer.MIN_VALUE);
    public static final String b = String.valueOf(Long.MIN_VALUE);
    public static final int[] c = new int[1000];
    public static final String[] d;
    public static final String[] e;

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = 0;
                while (i4 < 10) {
                    c[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                }
            }
        }
        d = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        e = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    public static int a(int i, int i2, byte[] bArr) {
        int i3 = c[i];
        bArr[i2] = (byte) (i3 >> 16);
        int i4 = i2 + 2;
        bArr[i2 + 1] = (byte) (i3 >> 8);
        int i5 = i2 + 3;
        bArr[i4] = (byte) i3;
        return i5;
    }

    public static int b(char[] cArr, int i, int i2) {
        int i3 = c[i];
        cArr[i2] = (char) (i3 >> 16);
        int i4 = i2 + 2;
        cArr[i2 + 1] = (char) ((i3 >> 8) & 127);
        int i5 = i2 + 3;
        cArr[i4] = (char) (i3 & 127);
        return i5;
    }

    public static int c(int i, int i2, byte[] bArr) {
        int i3 = c[i];
        if (i > 9) {
            if (i > 99) {
                bArr[i2] = (byte) (i3 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i3 >> 8);
            i2++;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) i3;
        return i4;
    }

    public static int d(char[] cArr, int i, int i2) {
        int i3 = c[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & 127);
            i2++;
        }
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 & 127);
        return i4;
    }

    public static int e(int i, int i2, byte[] bArr) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int i6 = i3 - (i5 * 1000);
        int[] iArr = c;
        int i7 = iArr[i5];
        bArr[i2] = (byte) (i7 >> 16);
        bArr[i2 + 1] = (byte) (i7 >> 8);
        bArr[i2 + 2] = (byte) i7;
        int i8 = iArr[i6];
        bArr[i2 + 3] = (byte) (i8 >> 16);
        bArr[i2 + 4] = (byte) (i8 >> 8);
        bArr[i2 + 5] = (byte) i8;
        int i9 = iArr[i4];
        bArr[i2 + 6] = (byte) (i9 >> 16);
        int i10 = i2 + 8;
        bArr[i2 + 7] = (byte) (i9 >> 8);
        int i11 = i2 + 9;
        bArr[i10] = (byte) i9;
        return i11;
    }

    public static int f(char[] cArr, int i, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int[] iArr = c;
        int i6 = iArr[i5];
        cArr[i2] = (char) (i6 >> 16);
        cArr[i2 + 1] = (char) ((i6 >> 8) & 127);
        cArr[i2 + 2] = (char) (i6 & 127);
        int i7 = iArr[i3 - (i5 * 1000)];
        cArr[i2 + 3] = (char) (i7 >> 16);
        cArr[i2 + 4] = (char) ((i7 >> 8) & 127);
        cArr[i2 + 5] = (char) (i7 & 127);
        int i8 = iArr[i4];
        cArr[i2 + 6] = (char) (i8 >> 16);
        int i9 = i2 + 8;
        cArr[i2 + 7] = (char) ((i8 >> 8) & 127);
        int i10 = i2 + 9;
        cArr[i9] = (char) (i8 & 127);
        return i10;
    }

    public static int g(int i, int i2, byte[] bArr) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = f14200a;
                int length = str.length();
                int i4 = 0;
                while (i4 < length) {
                    bArr[i2] = (byte) str.charAt(i4);
                    i4++;
                    i2++;
                }
                return i2;
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i5 = i / 1000;
                return a(i - (i5 * 1000), c(i5, i2, bArr), bArr);
            }
            if (i >= 10) {
                return c(i, i2, bArr);
            }
            int i6 = i2 + 1;
            bArr[i2] = (byte) (i + 48);
            return i6;
        }
        if (i < 1000000000) {
            int i7 = i / 1000;
            int i8 = i7 / 1000;
            return a(i - (i7 * 1000), a(i7 - (i8 * 1000), c(i8, i2, bArr), bArr), bArr);
        }
        int i9 = i - 1000000000;
        if (i9 >= 1000000000) {
            i9 = i - 2000000000;
            i3 = i2 + 1;
            bArr[i2] = 50;
        } else {
            i3 = i2 + 1;
            bArr[i2] = 49;
        }
        return e(i9, i3, bArr);
    }

    public static int h(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = f14200a;
                int length = str.length();
                str.getChars(0, length, cArr, i2);
                return length + i2;
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return b(cArr, i - (i4 * 1000), d(cArr, i4, i2));
            }
            if (i >= 10) {
                return d(cArr, i, i2);
            }
            cArr[i2] = (char) (i + 48);
            return i2 + 1;
        }
        if (i < 1000000000) {
            int i5 = i / 1000;
            int i6 = i5 / 1000;
            return b(cArr, i - (i5 * 1000), b(cArr, i5 - (i6 * 1000), d(cArr, i6, i2)));
        }
        int i7 = i - 1000000000;
        if (i7 >= 1000000000) {
            i7 = i - 2000000000;
            i3 = i2 + 1;
            cArr[i2] = '2';
        } else {
            i3 = i2 + 1;
            cArr[i2] = '1';
        }
        return f(cArr, i7, i3);
    }

    public static int i(int i, long j, byte[] bArr) {
        int iE;
        if (j < 0) {
            if (j > -2147483648L) {
                return g((int) j, i, bArr);
            }
            if (j == Long.MIN_VALUE) {
                String str = b;
                int length = str.length();
                int i2 = 0;
                while (i2 < length) {
                    bArr[i] = (byte) str.charAt(i2);
                    i2++;
                    i++;
                }
                return i;
            }
            bArr[i] = 45;
            j = -j;
            i++;
        } else if (j <= 2147483647L) {
            return g((int) j, i, bArr);
        }
        long j2 = j / 1000000000;
        long j3 = j - (j2 * 1000000000);
        if (j2 < 1000000000) {
            int i3 = (int) j2;
            int[] iArr = c;
            if (i3 >= 1000000) {
                int i4 = i3 / 1000;
                int i5 = i3 - (i4 * 1000);
                int i6 = i4 / 1000;
                int iC = c(i6, i, bArr);
                int i7 = iArr[i4 - (i6 * 1000)];
                bArr[iC] = (byte) (i7 >> 16);
                bArr[iC + 1] = (byte) (i7 >> 8);
                bArr[iC + 2] = (byte) i7;
                int i8 = iArr[i5];
                bArr[iC + 3] = (byte) (i8 >> 16);
                int i9 = iC + 5;
                bArr[iC + 4] = (byte) (i8 >> 8);
                iE = iC + 6;
                bArr[i9] = (byte) i8;
            } else if (i3 < 1000) {
                iE = c(i3, i, bArr);
            } else {
                int i10 = i3 / 1000;
                int i11 = i3 - (i10 * 1000);
                int i12 = iArr[i10];
                if (i10 > 9) {
                    if (i10 > 99) {
                        bArr[i] = (byte) (i12 >> 16);
                        i++;
                    }
                    bArr[i] = (byte) (i12 >> 8);
                    i++;
                }
                bArr[i] = (byte) i12;
                int i13 = iArr[i11];
                bArr[i + 1] = (byte) (i13 >> 16);
                int i14 = i + 3;
                bArr[i + 2] = (byte) (i13 >> 8);
                iE = i + 4;
                bArr[i14] = (byte) i13;
            }
        } else {
            long j4 = j2 / 1000000000;
            int iC2 = c((int) j4, i, bArr);
            iE = e((int) (j2 - (1000000000 * j4)), iC2, bArr);
        }
        return e((int) j3, iE, bArr);
    }

    public static int j(long j, char[] cArr, int i) {
        int iF;
        if (j < 0) {
            if (j > -2147483648L) {
                return h(cArr, (int) j, i);
            }
            if (j == Long.MIN_VALUE) {
                String str = b;
                int length = str.length();
                str.getChars(0, length, cArr, i);
                return length + i;
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= 2147483647L) {
            return h(cArr, (int) j, i);
        }
        long j2 = j / 1000000000;
        long j3 = j - (j2 * 1000000000);
        if (j2 < 1000000000) {
            int i2 = (int) j2;
            int[] iArr = c;
            if (i2 >= 1000000) {
                int i3 = i2 / 1000;
                int i4 = i2 - (i3 * 1000);
                int i5 = i3 / 1000;
                int iD = d(cArr, i5, i);
                int i6 = iArr[i3 - (i5 * 1000)];
                cArr[iD] = (char) (i6 >> 16);
                cArr[iD + 1] = (char) ((i6 >> 8) & 127);
                cArr[iD + 2] = (char) (i6 & 127);
                int i7 = iArr[i4];
                cArr[iD + 3] = (char) (i7 >> 16);
                int i8 = iD + 5;
                cArr[iD + 4] = (char) ((i7 >> 8) & 127);
                iF = iD + 6;
                cArr[i8] = (char) (i7 & 127);
            } else if (i2 < 1000) {
                iF = d(cArr, i2, i);
            } else {
                int i9 = i2 / 1000;
                int i10 = i2 - (i9 * 1000);
                int i11 = iArr[i9];
                if (i9 > 9) {
                    if (i9 > 99) {
                        cArr[i] = (char) (i11 >> 16);
                        i++;
                    }
                    cArr[i] = (char) ((i11 >> 8) & 127);
                    i++;
                }
                cArr[i] = (char) (i11 & 127);
                int i12 = iArr[i10];
                cArr[i + 1] = (char) (i12 >> 16);
                int i13 = i + 3;
                cArr[i + 2] = (char) ((i12 >> 8) & 127);
                iF = i + 4;
                cArr[i13] = (char) (i12 & 127);
            }
        } else {
            long j4 = j2 / 1000000000;
            int iD2 = d(cArr, (int) j4, i);
            iF = f(cArr, (int) (j2 - (1000000000 * j4)), iD2);
        }
        return f(cArr, (int) j3, iF);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String k(double r7, boolean r9) {
        /*
            if (r9 == 0) goto L8c
            com.fasterxml.jackson.core.io.schubfach.DoubleToDecimal r9 = new com.fasterxml.jackson.core.io.schubfach.DoubleToDecimal
            r9.<init>()
            long r7 = java.lang.Double.doubleToRawLongBits(r7)
            r0 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r0 = r0 & r7
            r2 = 52
            long r2 = r7 >>> r2
            int r2 = (int) r2
            r3 = 2047(0x7ff, float:2.868E-42)
            r2 = r2 & r3
            r4 = 0
            if (r2 >= r3) goto L7b
            r3 = -1
            r9.b = r3
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 >= 0) goto L29
            r8 = 45
            r9.a(r8)
        L29:
            r8 = 1
            r6 = 0
            if (r2 == 0) goto L52
            int r7 = 1075 - r2
            r2 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r0 = r0 | r2
            if (r7 <= 0) goto L36
            r2 = r8
            goto L37
        L36:
            r2 = r6
        L37:
            r3 = 53
            if (r7 >= r3) goto L3d
            r3 = r8
            goto L3e
        L3d:
            r3 = r6
        L3e:
            r2 = r2 & r3
            if (r2 == 0) goto L4d
            long r2 = r0 >> r7
            long r4 = r2 << r7
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L4d
            r9.f(r6, r2)
            goto L68
        L4d:
            int r7 = -r7
            r9.g(r7, r6, r0)
            goto L68
        L52:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L73
            r4 = 3
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r2 = -1074(0xfffffffffffffbce, float:NaN)
            if (r7 >= 0) goto L65
            r4 = 10
            long r0 = r0 * r4
            r9.g(r2, r3, r0)
            goto L68
        L65:
            r9.g(r2, r6, r0)
        L68:
            java.lang.String r7 = new java.lang.String
            int r0 = r9.b
            int r0 = r0 + r8
            byte[] r8 = r9.f14207a
            r7.<init>(r8, r6, r6, r0)
            return r7
        L73:
            if (r7 != 0) goto L78
            java.lang.String r7 = "0.0"
            return r7
        L78:
            java.lang.String r7 = "-0.0"
            return r7
        L7b:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 == 0) goto L82
            java.lang.String r7 = "NaN"
            return r7
        L82:
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto L89
            java.lang.String r7 = "Infinity"
            return r7
        L89:
            java.lang.String r7 = "-Infinity"
            return r7
        L8c:
            java.lang.String r7 = java.lang.Double.toString(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberOutput.k(double, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String l(float r5, boolean r6) {
        /*
            if (r6 == 0) goto L78
            com.fasterxml.jackson.core.io.schubfach.FloatToDecimal r6 = new com.fasterxml.jackson.core.io.schubfach.FloatToDecimal
            r6.<init>()
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            r0 = 8388607(0x7fffff, float:1.1754942E-38)
            r0 = r0 & r5
            int r1 = r5 >>> 23
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            if (r1 >= r2) goto L6b
            r2 = -1
            r6.b = r2
            if (r5 >= 0) goto L20
            r3 = 45
            r6.a(r3)
        L20:
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L47
            int r5 = 150 - r1
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 | r1
            if (r5 <= 0) goto L2d
            r1 = r3
            goto L2e
        L2d:
            r1 = r4
        L2e:
            r2 = 24
            if (r5 >= r2) goto L34
            r2 = r3
            goto L35
        L34:
            r2 = r4
        L35:
            r1 = r1 & r2
            if (r1 == 0) goto L42
            int r1 = r0 >> r5
            int r2 = r1 << r5
            if (r2 != r0) goto L42
            r6.f(r1, r4)
            goto L58
        L42:
            int r5 = -r5
            r6.g(r5, r0, r4)
            goto L58
        L47:
            if (r0 == 0) goto L63
            r5 = 8
            r1 = -149(0xffffffffffffff6b, float:NaN)
            if (r0 >= r5) goto L55
            int r0 = r0 * 10
            r6.g(r1, r0, r2)
            goto L58
        L55:
            r6.g(r1, r0, r4)
        L58:
            java.lang.String r5 = new java.lang.String
            int r0 = r6.b
            int r0 = r0 + r3
            byte[] r6 = r6.f14208a
            r5.<init>(r6, r4, r4, r0)
            return r5
        L63:
            if (r5 != 0) goto L68
            java.lang.String r5 = "0.0"
            return r5
        L68:
            java.lang.String r5 = "-0.0"
            return r5
        L6b:
            if (r0 == 0) goto L70
            java.lang.String r5 = "NaN"
            return r5
        L70:
            if (r5 <= 0) goto L75
            java.lang.String r5 = "Infinity"
            return r5
        L75:
            java.lang.String r5 = "-Infinity"
            return r5
        L78:
            java.lang.String r5 = java.lang.Float.toString(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberOutput.l(float, boolean):java.lang.String");
    }

    public static String m(int i) {
        String[] strArr = d;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            String[] strArr2 = e;
            if (i2 < strArr2.length) {
                return strArr2[i2];
            }
        }
        return Integer.toString(i);
    }
}
