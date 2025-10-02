package com.google.android.material.carousel;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
final class Arrangement {

    /* renamed from: a, reason: collision with root package name */
    public final int f14531a;
    public final float b;
    public int c;
    public int d;
    public final float e;
    public final float f;
    public final int g;
    public final float h;

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Arrangement(int r4, float r5, float r6, float r7, int r8, float r9, int r10, float r11, int r12, float r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.Arrangement.<init>(int, float, float, float, int, float, int, float, int, float):void");
    }

    public static Arrangement a(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        Arrangement arrangement = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length;
                    int i7 = i3;
                    int i8 = i;
                    int i9 = length2;
                    int i10 = i5;
                    Arrangement arrangement2 = new Arrangement(i8, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    float f7 = arrangement2.h;
                    if (arrangement == null || f7 < arrangement.h) {
                        if (f7 == BitmapDescriptorFactory.HUE_RED) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i11 = i8 + 1;
                    i5 = i10 + 1;
                    i3 = i7;
                    i = i11;
                    length = i6;
                    length2 = i9;
                }
                i3++;
                i = i;
                length = length;
            }
        }
        return arrangement;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Arrangement [priority=");
        sb.append(this.f14531a);
        sb.append(", smallCount=");
        sb.append(this.c);
        sb.append(", smallSize=");
        sb.append(this.b);
        sb.append(", mediumCount=");
        sb.append(this.d);
        sb.append(", mediumSize=");
        sb.append(this.e);
        sb.append(", largeCount=");
        sb.append(this.g);
        sb.append(", largeSize=");
        sb.append(this.f);
        sb.append(", cost=");
        return android.support.v4.media.session.a.j(this.h, "]", sb);
    }
}
