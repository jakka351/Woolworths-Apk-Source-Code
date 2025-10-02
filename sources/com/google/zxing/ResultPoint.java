package com.google.zxing;

import android.support.v4.media.session.a;
import com.google.zxing.common.detector.MathUtils;

/* loaded from: classes6.dex */
public class ResultPoint {

    /* renamed from: a, reason: collision with root package name */
    public final float f16132a;
    public final float b;

    public ResultPoint(float f, float f2) {
        this.f16132a = f;
        this.b = f2;
    }

    public static float a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.a(resultPoint.f16132a, resultPoint.b, resultPoint2.f16132a, resultPoint2.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f16132a == resultPoint.f16132a && this.b == resultPoint.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.f16132a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f16132a);
        sb.append(',');
        return a.r(sb, this.b, ')');
    }
}
