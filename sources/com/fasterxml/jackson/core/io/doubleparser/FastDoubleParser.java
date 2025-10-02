package com.fasterxml.jackson.core.io.doubleparser;

/* loaded from: classes4.dex */
public class FastDoubleParser {

    /* renamed from: a, reason: collision with root package name */
    public static final DoubleBitsFromCharSequence f14204a = new DoubleBitsFromCharSequence();

    public static double a(String str) {
        long jD = f14204a.d(str.length(), str);
        if (jD != -1) {
            return Double.longBitsToDouble(jD);
        }
        throw new NumberFormatException("Illegal input");
    }
}
