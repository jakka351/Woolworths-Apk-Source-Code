package com.google.zxing.datamatrix.decoder;

import io.jsonwebtoken.JwtParser;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes6.dex */
final class DecodedBitStreamParser {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f16156a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO};
    public static final char[] b;
    public static final char[] c;
    public static final char[] d;
    public static final char[] e;

    /* renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16157a;

        static {
            int[] iArr = new int[Mode.values().length];
            f16157a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16157a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16157a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16157a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16157a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        public static final Mode d;
        public static final Mode e;
        public static final Mode f;
        public static final Mode g;
        public static final Mode h;
        public static final Mode i;
        public static final Mode j;
        public static final /* synthetic */ Mode[] k;

        static {
            Mode mode = new Mode("PAD_ENCODE", 0);
            d = mode;
            Mode mode2 = new Mode("ASCII_ENCODE", 1);
            e = mode2;
            Mode mode3 = new Mode("C40_ENCODE", 2);
            f = mode3;
            Mode mode4 = new Mode("TEXT_ENCODE", 3);
            g = mode4;
            Mode mode5 = new Mode("ANSIX12_ENCODE", 4);
            h = mode5;
            Mode mode6 = new Mode("EDIFACT_ENCODE", 5);
            i = mode6;
            Mode mode7 = new Mode("BASE256_ENCODE", 6);
            j = mode7;
            k = new Mode[]{mode, mode2, mode3, mode4, mode5, mode6, mode7};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) k.clone();
        }
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', JwtParser.SEPARATOR_CHAR, '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        b = cArr;
        c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        d = cArr;
        e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, '{', '|', '}', '~', 127};
    }

    public static void a(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    public static int b(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
