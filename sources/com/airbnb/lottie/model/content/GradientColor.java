package com.airbnb.lottie.model.content;

import com.airbnb.lottie.utils.GammaEvaluator;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class GradientColor {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f13406a;
    public final int[] b;

    public GradientColor(float[] fArr, int[] iArr) {
        this.f13406a = fArr;
        this.b = iArr;
    }

    public final void a(GradientColor gradientColor) {
        int i = 0;
        while (true) {
            int[] iArr = gradientColor.b;
            if (i >= iArr.length) {
                return;
            }
            this.f13406a[i] = gradientColor.f13406a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final GradientColor b(float[] fArr) {
        int iC;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.f13406a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iC = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iC = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iC = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iC = GammaEvaluator.c((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iC;
        }
        return new GradientColor(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GradientColor gradientColor = (GradientColor) obj;
            if (Arrays.equals(this.f13406a, gradientColor.f13406a) && Arrays.equals(this.b, gradientColor.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.f13406a) * 31);
    }
}
