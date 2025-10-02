package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Q {
    private static final int[] i = {-1, -2, -1, 0, 0, 0, 1, 2, 1};
    private static final int[] j = {-1, 0, 1, -2, 0, 2, -1, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private int f18360a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;

    private final boolean a() {
        int i2 = this.b;
        boolean z = i2 > 3;
        int i3 = this.f;
        if (i3 > 0) {
            if (i2 < i3 + 12) {
                return false;
            }
            this.f = 0;
        }
        return z;
    }

    private final boolean a(int i2) {
        int i3 = (int) ((((this.d * 3) + i2) / 4) + 0.5d);
        this.d = i3;
        int iAbs = Math.abs(i3 - i2);
        int iAbs2 = Math.abs(i2 - this.e);
        float f = iAbs2 > 0 ? iAbs / iAbs2 : BitmapDescriptorFactory.HUE_RED;
        boolean z = false;
        if (a()) {
            int i4 = this.e;
            if (i2 < i4 && this.c == this.b - 1) {
                int i5 = this.g;
                if (i5 == 0 && f > 0.6f) {
                    i5++;
                }
                this.g = i5 + 1;
            } else {
                this.g = 0;
            }
            if ((this.g > 2 || this.h) && i2 < 50) {
                this.g = 0;
                if (!this.h) {
                    this.h = true;
                } else if (i2 < 70 && i4 > 40) {
                    this.h = false;
                    this.f = this.b;
                    z = true;
                }
            }
        }
        this.c = this.b;
        this.e = i2;
        return z;
    }

    public final boolean a(byte[] yBuffer) {
        Intrinsics.h(yBuffer, "yBuffer");
        int iSqrt = 0;
        for (int i2 = 1; i2 < 321; i2++) {
            int i3 = 1;
            while (i3 < 179) {
                int i4 = i2 - 1;
                int i5 = i3 + 1;
                int i6 = i2 + 1;
                int i7 = (i3 - 1) * 322;
                int i8 = (yBuffer[i7 + i4] + 128) & 255;
                int i9 = (yBuffer[i7 + i2] + 128) & 255;
                int i10 = (yBuffer[i7 + i6] + 128) & 255;
                int i11 = i3 * 322;
                int i12 = (yBuffer[i11 + i4] + 128) & 255;
                int i13 = (yBuffer[i11 + i2] + 128) & 255;
                int i14 = (yBuffer[i11 + i6] + 128) & 255;
                int i15 = 322 * i5;
                int i16 = (yBuffer[i4 + i15] + 128) & 255;
                int i17 = (yBuffer[i15 + i2] + 128) & 255;
                int i18 = (yBuffer[i15 + i6] + 128) & 255;
                int[] iArr = i;
                int i19 = (iArr[8] * i18) + (iArr[7] * i17) + (iArr[6] * i16) + (iArr[5] * i14) + (iArr[4] * i13) + (iArr[3] * i12) + (iArr[2] * i10) + (iArr[1] * i9) + (iArr[0] * i8);
                int[] iArr2 = j;
                int i20 = (iArr2[8] * i18) + (iArr2[7] * i17) + (iArr2[6] * i16) + (iArr2[5] * i14) + (iArr2[4] * i13) + (iArr2[3] * i12) + (iArr2[2] * i10) + (iArr2[1] * i9) + (iArr2[0] * i8);
                iSqrt += (int) (((float) Math.sqrt((i20 * i20) + (i19 * i19))) + 0.5f);
                i3 = i5;
            }
        }
        this.f18360a = (int) ((((this.f18360a * 9) + r1) / 10) + 0.5d);
        boolean zA = a((int) ((iSqrt / 57459) + 0.5d));
        this.b++;
        return zA;
    }
}
