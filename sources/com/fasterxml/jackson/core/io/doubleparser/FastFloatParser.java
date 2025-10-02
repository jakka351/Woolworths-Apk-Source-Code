package com.fasterxml.jackson.core.io.doubleparser;

/* loaded from: classes4.dex */
public class FastFloatParser {

    /* renamed from: a, reason: collision with root package name */
    public static final FloatBitsFromCharSequence f14206a = new FloatBitsFromCharSequence();

    public static float a(String str) {
        long jD = f14206a.d(str.length(), str);
        if (jD != -1) {
            return Float.intBitsToFloat((int) jD);
        }
        throw new NumberFormatException("Illegal input");
    }
}
