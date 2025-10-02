package androidx.compose.foundation.layout;

import YU.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "FlingResult", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AndroidFlingSpline {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f932a = new float[101];
    public static final float[] b = new float[101];

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension
    public static final class FlingResult {
        public final boolean equals(Object obj) {
            return obj instanceof FlingResult;
        }

        public final int hashCode() {
            return Long.hashCode(0L);
        }

        public final String toString() {
            return "FlingResult(packedValue=0)";
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
        float f10;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        int i = 0;
        float f12 = 0.0f;
        while (true) {
            float f13 = 1.0f;
            if (i >= 100) {
                b[100] = 1.0f;
                f932a[100] = 1.0f;
                return;
            }
            float f14 = i / 100;
            float f15 = 1.0f;
            while (true) {
                f = ((f15 - f11) / 2.0f) + f11;
                f2 = f13 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f16 = (((f * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f5 = f13;
                f6 = f14;
                if (Math.abs(f16 - f14) < 1.0E-5d) {
                    break;
                }
                if (f16 > f6) {
                    f15 = f;
                } else {
                    f11 = f;
                }
                f13 = f5;
                f14 = f6;
            }
            f932a[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f17 = f5;
            while (true) {
                f7 = ((f17 - f12) / 2.0f) + f12;
                f8 = f5 - f7;
                f9 = f7 * 3.0f * f8;
                f10 = f7 * f7 * f7;
                float f18 = (((f8 * 0.5f) + f7) * f9) + f10;
                if (Math.abs(f18 - f6) >= 1.0E-5d) {
                    if (f18 > f6) {
                        f17 = f7;
                    } else {
                        f12 = f7;
                    }
                }
            }
            b[i] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
            i++;
        }
    }

    public static long a(float f) {
        float fA;
        float f2;
        float f3 = 100;
        int i = (int) (f3 * f);
        if (i < 100) {
            float f4 = i / f3;
            int i2 = i + 1;
            float f5 = i2 / f3;
            float[] fArr = f932a;
            float f6 = fArr[i];
            f2 = (fArr[i2] - f6) / (f5 - f4);
            fA = a.a(f, f4, f2, f6);
        } else {
            fA = 1.0f;
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32);
    }
}
