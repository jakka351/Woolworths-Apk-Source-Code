package org.tensorflow.lite.support.tensorbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;

/* loaded from: classes8.dex */
public abstract class TensorBuffer {

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f26929a;
    public int[] b;
    public int c = -1;
    public final boolean d = true;

    /* renamed from: org.tensorflow.lite.support.tensorbuffer.TensorBuffer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26930a;

        static {
            int[] iArr = new int[DataType.values().length];
            f26930a = iArr;
            try {
                DataType dataType = DataType.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f26930a;
                DataType dataType2 = DataType.d;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TensorBuffer(int[] iArr) {
        a(iArr);
    }

    public static int b(int[] iArr) {
        SupportPreconditions.b(iArr, "Shape cannot be null.");
        int i = 1;
        for (int i2 : iArr) {
            i *= i2;
        }
        return i;
    }

    public static TensorBuffer d(int[] iArr, DataType dataType) {
        int iOrdinal = dataType.ordinal();
        if (iOrdinal == 0) {
            return new TensorBufferFloat(iArr);
        }
        if (iOrdinal == 2) {
            return new TensorBufferUint8(iArr);
        }
        throw new AssertionError("TensorBuffer does not support data type: " + dataType);
    }

    public final void a(int[] iArr) {
        SupportPreconditions.b(iArr, "TensorBuffer shape cannot be null.");
        boolean z = true;
        if (iArr.length != 0) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] < 0) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        SupportPreconditions.a("Values in TensorBuffer shape should be non-negative.", z);
        int iB = b(iArr);
        this.b = (int[]) iArr.clone();
        if (this.c == iB) {
            return;
        }
        this.c = iB;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(j() * iB);
        this.f26929a = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
    }

    public final synchronized void c() {
        if (this.f26929a.isReadOnly()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f26929a.capacity());
            byteBufferAllocateDirect.order(this.f26929a.order());
            byteBufferAllocateDirect.put(this.f26929a);
            byteBufferAllocateDirect.rewind();
            this.f26929a = byteBufferAllocateDirect;
        }
    }

    public abstract DataType e();

    public final int f() {
        boolean z = this.f26929a.limit() == j() * b(this.b);
        String str = String.format("The size of underlying ByteBuffer (%d) and the shape (%s) do not match. The ByteBuffer may have been changed.", Integer.valueOf(this.f26929a.limit()), Arrays.toString(this.b));
        if (z) {
            return this.c;
        }
        throw new IllegalStateException(str);
    }

    public abstract float[] g();

    public abstract float h(int i);

    public abstract int[] i();

    public abstract int j();

    public abstract void k(float[] fArr, int[] iArr);

    public abstract void l(int[] iArr, int[] iArr2);

    public final void m(int[] iArr) {
        if (this.d) {
            a(iArr);
        } else {
            if (!Arrays.equals(iArr, this.b)) {
                throw new IllegalArgumentException();
            }
            this.b = (int[]) iArr.clone();
        }
    }

    public TensorBuffer() {
        a(new int[]{0});
    }
}
