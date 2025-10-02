package androidx.transition;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
class FloatArrayEvaluator implements TypeEvaluator<float[]> {

    /* renamed from: a, reason: collision with root package name */
    public float[] f3783a;

    @Override // android.animation.TypeEvaluator
    public final float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f3783a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i = 0; i < fArr5.length; i++) {
            float f2 = fArr3[i];
            fArr5[i] = YU.a.a(fArr4[i], f2, f, f2);
        }
        return fArr5;
    }
}
