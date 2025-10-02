package me.oriient.positioningengine.ondevice;

/* renamed from: me.oriient.positioningengine.ondevice.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC1812a {
    public static final void a(double[] dArr, int i, int i2, double... dArr2) {
        int length = dArr2.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            dArr[(i4 * i) + i2] = dArr2[i3];
            i3++;
            i4++;
        }
    }
}
