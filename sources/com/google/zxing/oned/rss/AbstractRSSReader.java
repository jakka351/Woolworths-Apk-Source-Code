package com.google.zxing.oned.rss;

import com.google.zxing.oned.OneDReader;

/* loaded from: classes6.dex */
public abstract class AbstractRSSReader extends OneDReader {
    public final int[] b;
    public final int[] e;
    public final int[] f;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16185a = new int[4];
    public final float[] c = new float[4];
    public final float[] d = new float[4];

    public AbstractRSSReader() {
        int[] iArr = new int[8];
        this.b = iArr;
        this.e = new int[iArr.length / 2];
        this.f = new int[iArr.length / 2];
    }

    public static void g(float[] fArr, int[] iArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    public static void h(float[] fArr, int[] iArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    public static boolean i(int[] iArr) {
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            for (int i3 : iArr) {
                if (i3 > i2) {
                    i2 = i3;
                }
                if (i3 < i) {
                    i = i3;
                }
            }
            if (i2 < i * 10) {
                return true;
            }
        }
        return false;
    }
}
