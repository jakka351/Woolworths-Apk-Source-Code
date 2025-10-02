package com.google.zxing.qrcode.decoder;

/* loaded from: classes6.dex */
public enum Mode {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    public final int[] d;
    public final int e;

    Mode(int[] iArr, int i) {
        this.d = iArr;
        this.e = i;
    }

    public final int a(Version version) {
        int i = version.f16227a;
        return this.d[i <= 9 ? (char) 0 : i <= 26 ? (char) 1 : (char) 2];
    }
}
