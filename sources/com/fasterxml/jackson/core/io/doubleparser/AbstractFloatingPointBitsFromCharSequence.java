package com.fasterxml.jackson.core.io.doubleparser;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* loaded from: classes4.dex */
abstract class AbstractFloatingPointBitsFromCharSequence extends AbstractFloatValueParser {
    public static boolean a(char c) {
        return '0' <= c && c <= '9';
    }

    public static int f(CharSequence charSequence, int i, int i2) {
        while (i < i2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        return i;
    }

    public abstract long b();

    public abstract long c();

    public final long d(int i, CharSequence charSequence) {
        int iF;
        int i2;
        char cCharAt;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        int i8;
        int i9;
        boolean z2;
        long j2;
        byte[] bArr;
        char cCharAt2;
        int i10;
        int iMin;
        char c2;
        int i11;
        int i12;
        boolean z3;
        int i13;
        int i14 = i;
        CharSequence charSequence2 = charSequence;
        if (i14 > charSequence2.length() || (iF = f(charSequence2, 0, i14)) == i14) {
            return -1L;
        }
        char cCharAt3 = charSequence2.charAt(iF);
        boolean z4 = cCharAt3 == '-';
        if (z4 || cCharAt3 == '+') {
            i2 = iF + 1;
            cCharAt = i2 < i14 ? charSequence2.charAt(i2) : (char) 0;
            if (cCharAt == 0) {
                return -1L;
            }
        } else {
            cCharAt = cCharAt3;
            i2 = iF;
        }
        if (cCharAt >= 'I') {
            if (cCharAt == 'N') {
                int i15 = i2 + 2;
                if (i15 < i14 && charSequence2.charAt(i2 + 1) == 'a' && charSequence2.charAt(i15) == 'N' && f(charSequence2, i2 + 3, i14) == i14) {
                    return b();
                }
                return -1L;
            }
            int i16 = i2 + 7;
            if (i16 < i14 && charSequence2.charAt(i2) == 'I' && charSequence2.charAt(i2 + 1) == 'n' && charSequence2.charAt(i2 + 2) == 'f' && charSequence2.charAt(i2 + 3) == 'i' && charSequence2.charAt(i2 + 4) == 'n' && charSequence2.charAt(i2 + 5) == 'i' && charSequence2.charAt(i2 + 6) == 't' && charSequence2.charAt(i16) == 'y' && f(charSequence2, i2 + 8, i14) == i14) {
                return z4 ? c() : e();
            }
            return -1L;
        }
        boolean z5 = cCharAt == '0';
        if (z5) {
            c = '0';
            int i17 = i2 + 1;
            char cCharAt4 = i17 < i14 ? charSequence2.charAt(i17) : (char) 0;
            if (cCharAt4 == 'x' || cCharAt4 == 'X') {
                int i18 = i2 + 2;
                int i19 = i18;
                int i20 = -1;
                long j3 = 0;
                char c3 = 0;
                boolean z6 = false;
                while (true) {
                    bArr = AbstractFloatValueParser.f14201a;
                    if (i19 >= i14) {
                        cCharAt2 = c3;
                        break;
                    }
                    cCharAt2 = charSequence2.charAt(i19);
                    byte b = cCharAt2 > 127 ? (byte) -1 : bArr[cCharAt2];
                    if (b < 0) {
                        if (b != -4) {
                            break;
                        }
                        z6 |= i20 >= 0;
                        i20 = i19;
                    } else {
                        j3 = (j3 << 4) | b;
                    }
                    i19++;
                    c3 = cCharAt2;
                }
                if (i20 < 0) {
                    i10 = i19 - i18;
                    iMin = 0;
                    i20 = i19;
                } else {
                    i10 = (i19 - i18) - 1;
                    iMin = Math.min((i20 - i19) + 1, 1024) * 4;
                }
                boolean z7 = cCharAt2 == 'p' || cCharAt2 == 'P';
                if (z7) {
                    i12 = i19 + 1;
                    char cCharAt5 = i12 < i14 ? charSequence2.charAt(i12) : (char) 0;
                    boolean z8 = cCharAt5 == '-';
                    if (z8 || cCharAt5 == '+') {
                        i12 = i19 + 2;
                        cCharAt5 = i12 < i14 ? charSequence2.charAt(i12) : (char) 0;
                    }
                    boolean z9 = z6 | (!a(cCharAt5));
                    char cCharAt6 = cCharAt5;
                    i11 = 0;
                    do {
                        if (i11 < 1024) {
                            i11 = ((i11 * 10) + cCharAt6) - 48;
                        }
                        i12++;
                        cCharAt6 = i12 < i14 ? charSequence2.charAt(i12) : (char) 0;
                    } while (a(cCharAt6));
                    if (z8) {
                        i11 = -i11;
                    }
                    iMin += i11;
                    c2 = cCharAt6;
                    z6 = z9;
                } else {
                    c2 = cCharAt2;
                    i11 = 0;
                    i12 = i19;
                }
                int i21 = iMin;
                if (i12 < i14 && (c2 == 'd' || c2 == 'D' || c2 == 'f' || c2 == 'F')) {
                    i12++;
                }
                int iF2 = f(charSequence2, i12, i14);
                if (z6 || iF2 < i14 || i10 == 0 || !z7) {
                    return -1L;
                }
                if (i10 > 16) {
                    long j4 = 0;
                    int i22 = 0;
                    while (i18 < i19) {
                        char cCharAt7 = charSequence2.charAt(i18);
                        byte b2 = cCharAt7 > 127 ? (byte) -1 : bArr[cCharAt7];
                        if (b2 < 0) {
                            i22++;
                        } else {
                            if (Long.compareUnsigned(j4, 1000000000000000000L) >= 0) {
                                break;
                            }
                            j4 = (j4 << 4) | b2;
                        }
                        i18++;
                    }
                    j3 = j4;
                    z3 = i18 < i19;
                    i13 = i22;
                    iF2 = i18;
                } else {
                    z3 = false;
                    i13 = 0;
                }
                return h(charSequence2, i14, z4, j3, i21, z3, (i20 - iF2) + i13 + i11);
            }
            i2 = i17;
        } else {
            c = '0';
        }
        int i23 = i2;
        int i24 = -1;
        long j5 = 0;
        char cCharAt8 = 0;
        boolean z10 = false;
        while (i23 < i14) {
            cCharAt8 = charSequence2.charAt(i23);
            if (!a(cCharAt8)) {
                if (cCharAt8 != '.') {
                    break;
                }
                z10 |= i24 >= 0;
                int i25 = i23;
                while (true) {
                    if (i25 >= i14 - 8) {
                        z2 = z5;
                        j2 = j5;
                        break;
                    }
                    j2 = j5;
                    long jCharAt = (charSequence2.charAt(i25 + 2) << 16) | charSequence2.charAt(i25 + 1) | (charSequence2.charAt(i25 + 3) << 32) | (charSequence2.charAt(i25 + 4) << c);
                    z2 = z5;
                    int i26 = i25 + 8;
                    long jCharAt2 = (charSequence2.charAt(i25 + 6) << 16) | charSequence2.charAt(i25 + 5) | (charSequence2.charAt(i25 + 7) << 32) | (charSequence2.charAt(i26) << c);
                    long j6 = jCharAt - 13511005043687472L;
                    long j7 = jCharAt2 - 13511005043687472L;
                    int i27 = ((((jCharAt2 + 19703549022044230L) | j7) | ((jCharAt + 19703549022044230L) | j6)) & (-35747867511423104L)) != 0 ? -1 : (((int) ((j6 * 281475406208040961L) >>> c)) * ModuleDescriptor.MODULE_VERSION) + ((int) ((j7 * 281475406208040961L) >>> c));
                    if (i27 < 0) {
                        break;
                    }
                    i25 = i26;
                    j5 = (100000000 * j2) + i27;
                    z5 = z2;
                }
                int i28 = i25;
                i24 = i23;
                i23 = i28;
                j5 = j2;
            } else {
                j5 = ((j5 * 10) + cCharAt8) - 48;
                z2 = z5;
            }
            i23++;
            z5 = z2;
        }
        boolean z11 = z5;
        if (i24 < 0) {
            i3 = i23 - i2;
            i24 = i23;
            i4 = 0;
        } else {
            i3 = (i23 - i2) - 1;
            i4 = (i24 - i23) + 1;
        }
        if (cCharAt8 == 'e' || cCharAt8 == 'E') {
            i5 = i23 + 1;
            cCharAt8 = i5 < i14 ? charSequence2.charAt(i5) : (char) 0;
            boolean z12 = cCharAt8 == '-';
            if (z12 || cCharAt8 == '+') {
                i5 = i23 + 2;
                cCharAt8 = i5 < i14 ? charSequence2.charAt(i5) : (char) 0;
            }
            z10 |= !a(cCharAt8);
            i6 = 0;
            while (true) {
                if (i6 < 1024) {
                    i6 = ((i6 * 10) + cCharAt8) - 48;
                }
                i5++;
                cCharAt8 = i5 < i14 ? charSequence2.charAt(i5) : (char) 0;
                if (!a(cCharAt8)) {
                    break;
                }
                i14 = i;
                charSequence2 = charSequence;
            }
            if (z12) {
                i6 = -i6;
            }
            i4 += i6;
        } else {
            i5 = i23;
            i6 = 0;
        }
        if (i5 < i14 && (cCharAt8 == 'd' || cCharAt8 == 'D' || cCharAt8 == 'f' || cCharAt8 == 'F')) {
            i5++;
        }
        int iF3 = f(charSequence2, i5, i14);
        if (z10 || iF3 < i14) {
            return -1L;
        }
        if (!z11 && i3 == 0) {
            return -1L;
        }
        if (i3 > 19) {
            long j8 = 0;
            int i29 = 0;
            while (i2 < i23) {
                char cCharAt9 = charSequence2.charAt(i2);
                if (cCharAt9 != '.') {
                    if (Long.compareUnsigned(j8, 1000000000000000000L) >= 0) {
                        break;
                    }
                    i9 = i24;
                    j8 = ((j8 * 10) + cCharAt9) - 48;
                } else {
                    i29++;
                    i9 = i24;
                }
                i2++;
                i24 = i9;
            }
            int i30 = i24;
            boolean z13 = i2 < i23;
            i8 = (i30 - i2) + i29 + i6;
            j = j8;
            i7 = i4;
            z = z13;
        } else {
            i7 = i4;
            j = j5;
            z = false;
            i8 = 0;
        }
        return g(charSequence2, i14, z4, j, i7, z, i8);
    }

    public abstract long e();

    public abstract long g(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3);

    public abstract long h(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3);
}
