package com.scandit.datacapture.core.ui.animation;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class SpringForce {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;

    /* renamed from: a, reason: collision with root package name */
    double f18889a;
    double b;
    private boolean c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final t j;

    public SpringForce() {
        this.f18889a = Math.sqrt(1500.0d);
        this.b = 1.0d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new t();
    }

    public final t a(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.b;
            if (d3 > 1.0d) {
                double d4 = this.f18889a;
                this.f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.b;
                double d6 = this.f18889a;
                this.g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d3 * d3)) * this.f18889a;
            }
            this.c = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.i;
        double d9 = this.b;
        if (d9 > 1.0d) {
            double d10 = this.g;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.g;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f18889a;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f18889a) * d7) * d17;
            double d18 = -this.f18889a;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.h;
            double d20 = this.f18889a;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.h * d7) * d21) + (Math.cos(this.h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f18889a;
            double d23 = this.b;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.h;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.h;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        t tVar = this.j;
        tVar.f18893a = (float) (dSin + this.i);
        tVar.b = (float) dCos;
        return tVar;
    }

    public float getAcceleration(float f, float f2) {
        float finalPosition = f - getFinalPosition();
        double d = this.f18889a;
        return (float) (((-(d * d)) * finalPosition) - (((d * 2.0d) * this.b) * f2));
    }

    public float getDampingRatio() {
        return (float) this.b;
    }

    public float getFinalPosition() {
        return (float) this.i;
    }

    public float getStiffness() {
        double d = this.f18889a;
        return (float) (d * d);
    }

    public boolean isAtEquilibrium(float f, float f2) {
        return ((double) Math.abs(f2)) < this.e && ((double) Math.abs(f - getFinalPosition())) < this.d;
    }

    public SpringForce setDampingRatio(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = f;
        this.c = false;
        return this;
    }

    public SpringForce setFinalPosition(float f) {
        this.i = f;
        return this;
    }

    public SpringForce setStiffness(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f18889a = Math.sqrt(f);
        this.c = false;
        return this;
    }

    public SpringForce(float f) {
        this.f18889a = Math.sqrt(1500.0d);
        this.b = 1.0d;
        this.c = false;
        this.j = new t();
        this.i = f;
    }

    public final void a(double d) {
        double dAbs = Math.abs(d);
        this.d = dAbs;
        this.e = dAbs * 62.5d;
    }
}
