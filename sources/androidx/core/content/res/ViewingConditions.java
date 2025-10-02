package androidx.core.content.res;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class ViewingConditions {
    public static final ViewingConditions k;

    /* renamed from: a, reason: collision with root package name */
    public final float f2427a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float fC = (float) ((CamUtils.c() * 63.66197723675813d) / 100.0d);
        float[] fArr = CamUtils.c;
        float f = fArr[0];
        float[][] fArr2 = CamUtils.f2416a;
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fC) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = BitmapDescriptorFactory.HUE_RED;
        }
        float f10 = 1.0f / ((5.0f * fC) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float fCbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(fC * 5.0d))) + (f11 * fC);
        float fC2 = CamUtils.c() / fArr[1];
        double d2 = fC2;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * fCbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * fCbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * fCbrt) * f8) / 100.0d, 0.42d)};
        float f13 = fArr6[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr6[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr6[2];
        float[] fArr7 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        k = new ViewingConditions(fC2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * fPow, fPow, fPow, f9, 1.0f, new float[]{(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public ViewingConditions(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f = f;
        this.f2427a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.g = fArr;
        this.h = f7;
        this.i = f8;
        this.j = f9;
    }
}
