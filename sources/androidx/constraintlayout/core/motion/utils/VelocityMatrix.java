package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class VelocityMatrix {

    /* renamed from: a, reason: collision with root package name */
    public float f2293a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    public final void a(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f2 - 0.5f) * 2.0f;
        float f6 = f3 + this.c;
        float f7 = f4 + this.d;
        float f8 = (this.f2293a * (f - 0.5f) * 2.0f) + f6;
        float f9 = (this.b * f5) + f7;
        float radians = (float) Math.toRadians(this.f);
        float radians2 = (float) Math.toRadians(this.e);
        double d = radians;
        double d2 = i2 * f5;
        float fSin = (((float) ((Math.sin(d) * ((-i) * r7)) - (Math.cos(d) * d2))) * radians2) + f8;
        float fCos = (radians2 * ((float) ((Math.cos(d) * (i * r7)) - (Math.sin(d) * d2)))) + f9;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }
}
