package androidx.constraintlayout.core.motion.utils;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class SpringStopEngine implements StopEngine {
    public double b;
    public double c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    /* renamed from: a, reason: collision with root package name */
    public double f2288a = 0.5d;
    public int i = 0;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final boolean b() {
        double d = this.e - this.c;
        double d2 = this.b;
        double d3 = this.f;
        return Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.g))) / d2) <= ((double) this.h);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float getInterpolation(float f) {
        double d = f - this.d;
        if (d > 0.0d) {
            double d2 = this.b;
            double d3 = this.f2288a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / this.g) * d) * 4.0d)) + 1.0d);
            double d4 = d / iSqrt;
            int i = 0;
            while (i < iSqrt) {
                float f2 = this.e;
                double d5 = f2;
                double d6 = this.c;
                double d7 = d4;
                float f3 = this.f;
                double d8 = f3;
                double d9 = ((-d2) * (d5 - d6)) - (d3 * d8);
                double d10 = this.g;
                double d11 = (((d9 / d10) * d7) / 2.0d) + d8;
                double d12 = ((((-((((d7 * d11) / 2.0d) + d5) - d6)) * d2) - (d11 * d3)) / d10) * d7;
                float f4 = f3 + ((float) d12);
                this.f = f4;
                float f5 = f2 + ((float) (((d12 / 2.0d) + d8) * d7));
                this.e = f5;
                int i2 = this.i;
                if (i2 > 0) {
                    if (f5 < BitmapDescriptorFactory.HUE_RED && (i2 & 1) == 1) {
                        this.e = -f5;
                        this.f = -f4;
                    }
                    float f6 = this.e;
                    if (f6 > 1.0f && (i2 & 2) == 2) {
                        this.e = 2.0f - f6;
                        this.f = -this.f;
                    }
                }
                i++;
                d4 = d7;
            }
        }
        this.d = f;
        if (b()) {
            this.e = (float) this.c;
        }
        return this.e;
    }
}
