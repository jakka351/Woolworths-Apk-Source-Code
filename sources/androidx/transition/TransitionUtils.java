package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
class TransitionUtils {

    @RequiresApi
    public static class Api28Impl {
    }

    public static class MatrixEvaluator implements TypeEvaluator<Matrix> {

        /* renamed from: a, reason: collision with root package name */
        public final float[] f3795a = new float[9];
        public final float[] b = new float[9];
        public final Matrix c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float[] fArr = this.f3795a;
            matrix.getValues(fArr);
            float[] fArr2 = this.b;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f2 = fArr2[i];
                float f3 = fArr[i];
                fArr2[i] = YU.a.a(f2, f3, f, f3);
            }
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }
}
