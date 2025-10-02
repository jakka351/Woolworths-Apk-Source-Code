package com.google.zxing.aztec.decoder;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.FormatException;
import com.google.zxing.ReaderException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.medallia.digital.mobilesdk.q2;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Decoder {
    public static final String[] b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", lllqqql.c0063ccc0063c, "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    public static final String[] e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", q2.c, ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    public static final String[] f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a, reason: collision with root package name */
    public AztecDetectorResult f16133a;

    /* renamed from: com.google.zxing.aztec.decoder.Decoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16134a;

        static {
            int[] iArr = new int[Table.values().length];
            f16134a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16134a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16134a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16134a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16134a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Table {
        public static final Table d;
        public static final Table e;
        public static final Table f;
        public static final Table g;
        public static final Table h;
        public static final Table i;
        public static final /* synthetic */ Table[] j;

        static {
            Table table = new Table("UPPER", 0);
            d = table;
            Table table2 = new Table("LOWER", 1);
            e = table2;
            Table table3 = new Table("MIXED", 2);
            f = table3;
            Table table4 = new Table("DIGIT", 3);
            g = table4;
            Table table5 = new Table("PUNCT", 4);
            h = table5;
            Table table6 = new Table("BINARY", 5);
            i = table6;
            j = new Table[]{table, table2, table3, table4, table5, table6};
        }

        public static Table valueOf(String str) {
            return (Table) Enum.valueOf(Table.class, str);
        }

        public static Table[] values() {
            return (Table[]) j.clone();
        }
    }

    public static int b(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    public final DecoderResult a(AztecDetectorResult aztecDetectorResult) throws FormatException {
        int i;
        GenericGF genericGF;
        String str;
        Table table;
        this.f16133a = aztecDetectorResult;
        BitMatrix bitMatrix = aztecDetectorResult.f16144a;
        boolean z = aztecDetectorResult.c;
        int i2 = aztecDetectorResult.e;
        int i3 = (z ? 11 : 14) + (i2 << 2);
        int[] iArr = new int[i3];
        int i4 = ((z ? 88 : 112) + (i2 << 4)) * i2;
        boolean[] zArr = new boolean[i4];
        int i5 = 2;
        int i6 = 1;
        if (z) {
            for (int i7 = 0; i7 < i3; i7++) {
                iArr[i7] = i7;
            }
        } else {
            int i8 = i3 / 2;
            int i9 = ((((i8 - 1) / 15) * 2) + (i3 + 1)) / 2;
            for (int i10 = 0; i10 < i8; i10++) {
                iArr[(i8 - i10) - 1] = (i9 - r15) - 1;
                iArr[i8 + i10] = (i10 / 15) + i10 + i9 + 1;
            }
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i2) {
                break;
            }
            int i13 = ((i2 - i11) << i5) + (z ? 9 : 12);
            int i14 = i11 << 1;
            int i15 = (i3 - 1) - i14;
            int i16 = 0;
            while (i16 < i13) {
                int i17 = i16 << 1;
                int i18 = 0;
                while (i18 < i5) {
                    int i19 = i14 + i18;
                    int i20 = i6;
                    int i21 = i14 + i16;
                    zArr[i12 + i17 + i18] = bitMatrix.b(iArr[i19], iArr[i21]);
                    int i22 = i15 - i18;
                    zArr[(i13 * 2) + i12 + i17 + i18] = bitMatrix.b(iArr[i21], iArr[i22]);
                    int i23 = i15 - i16;
                    zArr[(i13 * 4) + i12 + i17 + i18] = bitMatrix.b(iArr[i22], iArr[i23]);
                    zArr[(i13 * 6) + i12 + i17 + i18] = bitMatrix.b(iArr[i23], iArr[i19]);
                    i18++;
                    i6 = i20;
                    i2 = i2;
                    i5 = 2;
                }
                i16++;
                i5 = 2;
            }
            i12 += i13 << 3;
            i11++;
            i2 = i2;
            i5 = 2;
        }
        int i24 = i6;
        AztecDetectorResult aztecDetectorResult2 = this.f16133a;
        int i25 = aztecDetectorResult2.e;
        int i26 = 8;
        if (i25 <= 2) {
            genericGF = GenericGF.j;
            i = 6;
        } else if (i25 <= 8) {
            genericGF = GenericGF.n;
            i = 8;
        } else if (i25 <= 22) {
            genericGF = GenericGF.i;
            i = 10;
        } else {
            genericGF = GenericGF.h;
        }
        int i27 = aztecDetectorResult2.d;
        int i28 = i4 / i;
        if (i28 < i27) {
            throw FormatException.a();
        }
        int i29 = i4 % i;
        int[] iArr2 = new int[i28];
        int i30 = 0;
        while (i30 < i28) {
            iArr2[i30] = b(zArr, i29, i);
            i30++;
            i29 += i;
        }
        try {
            new ReedSolomonDecoder(genericGF).a(i28 - i27, iArr2);
            int i31 = i24 << i;
            int i32 = i31 - 1;
            int i33 = 0;
            int i34 = 0;
            while (i33 < i27) {
                int i35 = iArr2[i33];
                if (i35 == 0 || i35 == i32) {
                    throw FormatException.a();
                }
                if (i35 == i24 || i35 == i31 - 2) {
                    i34++;
                }
                i33++;
                i24 = 1;
            }
            int i36 = (i27 * i) - i34;
            boolean[] zArr2 = new boolean[i36];
            int i37 = 0;
            for (int i38 = 0; i38 < i27; i38++) {
                int i39 = iArr2[i38];
                int i40 = 1;
                if (i39 == 1 || i39 == i31 - 2) {
                    Arrays.fill(zArr2, i37, (i37 + i) - 1, i39 > 1);
                    i37 = (i - 1) + i37;
                } else {
                    int i41 = i - 1;
                    while (i41 >= 0) {
                        int i42 = i37 + 1;
                        zArr2[i37] = (i39 & (i40 << i41)) != 0;
                        i41--;
                        i37 = i42;
                        i40 = 1;
                    }
                }
            }
            int i43 = (i36 + 7) / 8;
            byte[] bArr = new byte[i43];
            for (int i44 = 0; i44 < i43; i44++) {
                int i45 = i44 << 3;
                int i46 = i36 - i45;
                bArr[i44] = (byte) (i46 >= 8 ? b(zArr2, i45, 8) : b(zArr2, i45, i46) << (8 - i46));
            }
            StringBuilder sb = new StringBuilder(20);
            Table table2 = Table.d;
            Table table3 = table2;
            Table table4 = table3;
            int i47 = 0;
            while (i47 < i36) {
                Table table5 = Table.i;
                if (table3 != table5) {
                    Table table6 = Table.g;
                    int i48 = table3 == table6 ? 4 : 5;
                    if (i36 - i47 < i48) {
                        break;
                    }
                    int iB = b(zArr2, i47, i48);
                    i47 += i48;
                    int iOrdinal = table3.ordinal();
                    if (iOrdinal == 0) {
                        str = b[iB];
                    } else if (iOrdinal == 1) {
                        str = c[iB];
                    } else if (iOrdinal == 2) {
                        str = d[iB];
                    } else if (iOrdinal == 3) {
                        str = f[iB];
                    } else {
                        if (iOrdinal != 4) {
                            throw new IllegalStateException("Bad table");
                        }
                        str = e[iB];
                    }
                    if (str.startsWith("CTRL_")) {
                        char cCharAt = str.charAt(5);
                        if (cCharAt == 'B') {
                            table4 = table5;
                        } else if (cCharAt != 'D') {
                            if (cCharAt == 'P') {
                                table = Table.h;
                            } else if (cCharAt == 'L') {
                                table = Table.e;
                            } else if (cCharAt != 'M') {
                                table4 = table2;
                            } else {
                                table = Table.f;
                            }
                            table4 = table;
                        } else {
                            table4 = table6;
                        }
                        if (str.charAt(6) != 'L') {
                            Table table7 = table4;
                            table4 = table3;
                            table3 = table7;
                        }
                        i26 = 8;
                    } else {
                        sb.append(str);
                    }
                    table3 = table4;
                    i26 = 8;
                } else {
                    if (i36 - i47 < 5) {
                        break;
                    }
                    int iB2 = b(zArr2, i47, 5);
                    int i49 = i47 + 5;
                    if (iB2 == 0) {
                        if (i36 - i49 < 11) {
                            break;
                        }
                        iB2 = b(zArr2, i49, 11) + 31;
                        i49 = i47 + 16;
                    }
                    int i50 = 0;
                    while (true) {
                        if (i50 >= iB2) {
                            i47 = i49;
                            break;
                        }
                        if (i36 - i49 < i26) {
                            i47 = i36;
                            break;
                        }
                        sb.append((char) b(zArr2, i49, i26));
                        i49 += 8;
                        i50++;
                    }
                    table3 = table4;
                }
            }
            return new DecoderResult(bArr, sb.toString(), null, null);
        } catch (ReedSolomonException e2) {
            FormatException formatException = FormatException.f;
            if (ReaderException.d) {
                throw new FormatException(e2);
            }
            throw FormatException.f;
        }
    }
}
