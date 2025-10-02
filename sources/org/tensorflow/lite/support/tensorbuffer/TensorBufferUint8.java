package org.tensorflow.lite.support.tensorbuffer;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;

/* loaded from: classes8.dex */
public final class TensorBufferUint8 extends TensorBuffer {
    public static final DataType e = DataType.f;

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final DataType e() {
        return e;
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final float[] g() {
        this.f26929a.rewind();
        this.f26929a.get(new byte[this.c]);
        float[] fArr = new float[this.c];
        for (int i = 0; i < this.c; i++) {
            fArr[i] = r0[i] & 255;
        }
        return fArr;
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final float h(int i) {
        return this.f26929a.get(i) & 255;
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final int[] i() {
        this.f26929a.rewind();
        byte[] bArr = new byte[this.c];
        this.f26929a.get(bArr);
        int[] iArr = new int[this.c];
        for (int i = 0; i < this.c; i++) {
            iArr[i] = bArr[i] & 255;
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
        int i = 0;
        SupportPreconditions.a("The size of the array to be loaded does not match the specified shape.", fArr.length == TensorBuffer.b(iArr));
        c();
        m(iArr);
        this.f26929a.rewind();
        byte[] bArr = new byte[fArr.length];
        int length = fArr.length;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = (byte) Math.max(Math.min(fArr[i], 255.0d), 0.0d);
            i++;
            i2++;
        }
        this.f26929a.put(bArr);
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public final void l(int[] iArr, int[] iArr2) {
        SupportPreconditions.b(iArr, "The array to be loaded cannot be null.");
        int i = 0;
        SupportPreconditions.a("The size of the array to be loaded does not match the specified shape.", iArr.length == TensorBuffer.b(iArr2));
        c();
        m(iArr2);
        this.f26929a.rewind();
        byte[] bArr = new byte[iArr.length];
        int length = iArr.length;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = (byte) Math.max(Math.min(iArr[i], 255.0f), BitmapDescriptorFactory.HUE_RED);
            i++;
            i2++;
        }
        this.f26929a.put(bArr);
    }
}
