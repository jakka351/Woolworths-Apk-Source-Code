package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.i1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1027i1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Character[] f18532a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final String a(int i) {
        char[] cArr = new char[9];
        for (int i2 = 8; i2 > 0; i2--) {
            cArr[i2] = f18532a[i & 15].charValue();
            i >>>= 4;
        }
        cArr[0] = '#';
        return new String(cArr);
    }
}
