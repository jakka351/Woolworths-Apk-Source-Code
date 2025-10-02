package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline;", "", "FlingResult", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidFlingSpline {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f707a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FlingResult {

        /* renamed from: a, reason: collision with root package name */
        public final float f708a;
        public final float b;

        public FlingResult(float f, float f2) {
            this.f708a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) obj;
            return Float.compare(this.f708a, flingResult.f708a) == 0 && Float.compare(this.b, flingResult.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.f708a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.f708a);
            sb.append(", velocityCoefficient=");
            return android.support.v4.media.session.a.r(sb, this.b, ')');
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float[] fArr = new float[101];
        f707a = fArr;
        float[] fArr2 = new float[101];
        float f10 = BitmapDescriptorFactory.HUE_RED;
        int i = 0;
        float f11 = 0.0f;
        while (true) {
            float f12 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f13 = i / 100;
            float f14 = 1.0f;
            while (true) {
                f = ((f14 - f10) / 2.0f) + f10;
                f2 = f12 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f15 = (((f * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f5 = f12;
                if (Math.abs(f15 - f13) < 1.0E-5d) {
                    break;
                }
                if (f15 > f13) {
                    f14 = f;
                } else {
                    f10 = f;
                }
                f12 = f5;
            }
            float f16 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f17 = f5;
            while (true) {
                f6 = ((f17 - f11) / 2.0f) + f11;
                f7 = f5 - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f18 = (((f7 * f16) + f6) * f8) + f9;
                float f19 = f17;
                if (Math.abs(f18 - f13) >= 1.0E-5d) {
                    if (f18 > f13) {
                        f17 = f6;
                    } else {
                        f11 = f6;
                        f17 = f19;
                    }
                    f16 = 0.5f;
                }
            }
            fArr2[i] = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
            i++;
        }
    }

    public static double a(float f, float f2) {
        return Math.log((Math.abs(f) * 0.35f) / f2);
    }

    public static FlingResult b(float f) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f3 = 1.0f;
        float fB = RangesKt.b(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float f4 = 100;
        int i = (int) (f4 * fB);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = f707a;
            float f7 = fArr[i];
            float f8 = (fArr[i2] - f7) / (f6 - f5);
            float fA = YU.a.a(fB, f5, f8, f7);
            f2 = f8;
            f3 = fA;
        }
        return new FlingResult(f3, f2);
    }
}
