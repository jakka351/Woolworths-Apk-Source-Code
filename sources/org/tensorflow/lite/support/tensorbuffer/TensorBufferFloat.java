package org.tensorflow.lite.support.tensorbuffer;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;

/* loaded from: classes8.dex */
public final class TensorBufferFloat extends TensorBuffer {
    public static final DataType e = DataType.d;

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final DataType e() {
        return e;
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final float[] g() {
        this.f26929a.rewind();
        float[] fArr = new float[this.c];
        this.f26929a.asFloatBuffer().get(fArr);
        return fArr;
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final float h(int i) {
        return this.f26929a.getFloat(i << 2);
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final int[] i() {
        this.f26929a.rewind();
        float[] fArr = new float[this.c];
        this.f26929a.asFloatBuffer().get(fArr);
        int[] iArr = new int[this.c];
        for (int i = 0; i < this.c; i++) {
            iArr[i] = (int) fArr[i];
        }
        return iArr;
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final int j() {
        return e.a();
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final void k(float[] fArr, int[] iArr) {
        SupportPreconditions.b(fArr, "The array to be loaded cannot be null.");
        SupportPreconditions.a("The size of the array to be loaded does not match the specified shape.", fArr.length == TensorBuffer.b(iArr));
        c();
        m(iArr);
        this.f26929a.rewind();
        this.f26929a.asFloatBuffer().put(fArr);
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final void l(int[] iArr, int[] iArr2) {
        SupportPreconditions.b(iArr, "The array to be loaded cannot be null.");
        int i = 0;
        SupportPreconditions.a("The size of the array to be loaded does not match the specified shape.", iArr.length == TensorBuffer.b(iArr2));
        c();
        m(iArr2);
        this.f26929a.rewind();
        float[] fArr = new float[iArr.length];
        int length = iArr.length;
        int i2 = 0;
        while (i < length) {
            fArr[i2] = iArr[i];
            i++;
            i2++;
        }
        this.f26929a.asFloatBuffer().put(fArr);
    }
}
