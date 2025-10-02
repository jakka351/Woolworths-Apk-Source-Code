package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.BezierKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {

    /* renamed from: a, reason: collision with root package name */
    public final float f752a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public CubicBezierEasing(float f, float f2, float f3, float f4) {
        int iA;
        this.f752a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            PreconditionsKt.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + JwtParser.SEPARATOR_CHAR);
        }
        float[] fArr = new float[5];
        float f5 = (f2 - BitmapDescriptorFactory.HUE_RED) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iA = d2 == d3 ? 0 : BezierKt.a((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iA2 = BezierKt.a((float) ((-(d6 + d7)) / d5), fArr, 0);
            iA = BezierKt.a((float) ((d6 - d7) / d5), fArr, iA2) + iA2;
            if (iA > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iA--;
                }
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int iA3 = BezierKt.a((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, iA) + iA;
        float fMin = Math.min(BitmapDescriptorFactory.HUE_RED, 1.0f);
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, 1.0f);
        for (int i = 0; i < iA3; i++) {
            float f11 = fArr[i];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - BitmapDescriptorFactory.HUE_RED) * f11) + (((f4 - (f2 * 2.0f)) + BitmapDescriptorFactory.HUE_RED) * 3.0f)) * f11) + f5) * f11) + BitmapDescriptorFactory.HUE_RED;
            fMin = Math.min(fMin, f12);
            fMax = Math.max(fMax, f12);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
        this.e = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
  0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
  0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.animation.core.Easing
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r27) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.CubicBezierEasing.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        return this.f752a == cubicBezierEasing.f752a && this.b == cubicBezierEasing.b && this.c == cubicBezierEasing.c && this.d == cubicBezierEasing.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + android.support.v4.media.session.a.b(this.c, android.support.v4.media.session.a.b(this.b, Float.hashCode(this.f752a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f752a);
        sb.append(", b=");
        sb.append(this.b);
        sb.append(", c=");
        sb.append(this.c);
        sb.append(", d=");
        return android.support.v4.media.session.a.r(sb, this.d, ')');
    }
}
