package com.caverock.androidsvg;

/* loaded from: classes4.dex */
class IntegerParser {

    /* renamed from: a, reason: collision with root package name */
    public final int f14006a;
    public final long b;

    public IntegerParser(long j, int i) {
        this.b = j;
        this.f14006a = i;
    }

    public static IntegerParser a(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + (cCharAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new IntegerParser(j, i3);
    }
}
