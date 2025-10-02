package com.google.android.material.animation;

import YU.a;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes6.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f14509a = new float[9];
    public final float[] b = new float[9];
    public final Matrix c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        float[] fArr = this.f14509a;
        matrix.getValues(fArr);
        float[] fArr2 = this.b;
        matrix2.getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = a.a(f2, f3, f, f3);
        }
        Matrix matrix3 = this.c;
        matrix3.setValues(fArr2);
        return matrix3;
    }
}
