package androidx.constraintlayout.core.motion.utils;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class StopLogicEngine implements StopEngine {

    /* renamed from: a, reason: collision with root package name */
    public float f2289a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public boolean k = false;
    public float l;
    public float m;
    public float n;

    public static class Decelerate implements StopEngine {

        /* renamed from: a, reason: collision with root package name */
        public float f2290a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public boolean g;

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public final float a() {
            return this.d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public final boolean b() {
            return this.g;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public final float getInterpolation(float f) {
            float f2 = this.e;
            if (f > f2) {
                this.g = true;
                return this.f2290a;
            }
            if (f <= f2) {
                this.d = (this.c * f) + this.b;
            }
            return ((((this.c * f) / 2.0f) + this.b) * f) + this.f;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float a() {
        return this.k ? -c(this.n) : c(this.n);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final boolean b() {
        return a() < 1.0E-5f && Math.abs(this.i - this.m) < 1.0E-5f;
    }

    public final float c(float f) {
        float f2;
        float f3;
        float f4 = this.d;
        if (f <= f4) {
            f2 = this.f2289a;
            f3 = this.b;
        } else {
            int i = this.j;
            if (i == 1) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            f -= f4;
            f4 = this.e;
            if (f >= f4) {
                if (i == 2) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                float f5 = f - f4;
                float f6 = this.f;
                if (f5 >= f6) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                float f7 = this.c;
                return f7 - ((f5 * f7) / f6);
            }
            f2 = this.b;
            f3 = this.c;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    public final void d(float f, float f2, float f3, float f4, float f5) {
        this.i = f2;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = 1.0E-4f;
        }
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.j = 2;
                this.f2289a = f;
                this.b = fSqrt;
                this.c = BitmapDescriptorFactory.HUE_RED;
                float f8 = (fSqrt - f) / f3;
                this.d = f8;
                this.e = fSqrt / f3;
                this.g = ((f + fSqrt) * f8) / 2.0f;
                this.h = f2;
                this.i = f2;
                return;
            }
            this.j = 3;
            this.f2289a = f;
            this.b = f4;
            this.c = f4;
            float f9 = (f4 - f) / f3;
            this.d = f9;
            float f10 = f4 / f3;
            this.f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.e = ((f2 - f11) - f12) / f4;
            this.g = f11;
            this.h = f2 - f12;
            this.i = f2;
            return;
        }
        if (f7 >= f2) {
            this.j = 1;
            this.f2289a = f;
            this.b = BitmapDescriptorFactory.HUE_RED;
            this.g = f2;
            this.d = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.j = 2;
            this.f2289a = f;
            this.b = f;
            this.c = BitmapDescriptorFactory.HUE_RED;
            this.g = f13;
            this.h = f2;
            this.d = f14;
            this.e = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (fSqrt2 - f) / f3;
        this.d = f15;
        float f16 = fSqrt2 / f3;
        this.e = f16;
        if (fSqrt2 < f4) {
            this.j = 2;
            this.f2289a = f;
            this.b = fSqrt2;
            this.c = BitmapDescriptorFactory.HUE_RED;
            this.d = f15;
            this.e = f16;
            this.g = ((f + fSqrt2) * f15) / 2.0f;
            this.h = f2;
            return;
        }
        this.j = 3;
        this.f2289a = f;
        this.b = f4;
        this.c = f4;
        float f17 = (f4 - f) / f3;
        this.d = f17;
        float f18 = f4 / f3;
        this.f = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.e = ((f2 - f19) - f20) / f4;
        this.g = f19;
        this.h = f2 - f20;
        this.i = f2;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.d;
        if (f <= f3) {
            float f4 = this.f2289a;
            f2 = ((((this.b - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.j;
            if (i == 1) {
                f2 = this.g;
            } else {
                float f5 = f - f3;
                float f6 = this.e;
                if (f5 < f6) {
                    float f7 = this.g;
                    float f8 = this.b;
                    f2 = ((((this.c - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.h;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f;
                    if (f9 <= f10) {
                        float f11 = this.h;
                        float f12 = this.c * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.i;
                    }
                }
            }
        }
        this.m = f2;
        this.n = f;
        return this.k ? this.l - f2 : this.l + f2;
    }
}
