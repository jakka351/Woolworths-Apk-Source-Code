package org.tensorflow.lite;

import YU.a;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class TensorImpl implements Tensor {

    /* renamed from: a, reason: collision with root package name */
    public long f26919a;
    public final DataType b;
    public int[] c;

    public TensorImpl(long j) {
        DataType dataType;
        this.f26919a = j;
        int iDtype = dtype(j);
        switch (iDtype) {
            case 1:
                dataType = DataType.d;
                break;
            case 2:
                dataType = DataType.e;
                break;
            case 3:
                dataType = DataType.f;
                break;
            case 4:
                dataType = DataType.g;
                break;
            case 5:
                dataType = DataType.h;
                break;
            case 6:
                dataType = DataType.i;
                break;
            case 7:
                dataType = DataType.j;
                break;
            case 8:
            default:
                throw new IllegalArgumentException(a.e(iDtype, "DataType error: DataType ", " is not recognized in Java."));
            case 9:
                dataType = DataType.k;
                break;
        }
        this.b = dataType;
        this.c = shape(j);
        shapeSignature(j);
        quantizationScale(j);
        quantizationZeroPoint(j);
    }

    private static native ByteBuffer buffer(long j);

    public static int c(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return c(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native long create(long j, int i, int i2);

    private static native long createSignatureInputTensor(long j, String str);

    private static native long createSignatureOutputTensor(long j, String str);

    private static native void delete(long j);

    private static native int dtype(long j);

    public static void f(Object obj, int i, int[] iArr) {
        if (i == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i2 = iArr[i];
        if (i2 == 0) {
            iArr[i] = length;
        } else if (i2 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)));
        }
        int i3 = i + 1;
        if (i3 == iArr.length) {
            return;
        }
        for (int i4 = 0; i4 < length; i4++) {
            f(Array.get(obj, i4), i3, iArr);
        }
    }

    public static TensorImpl g(int i, long j) {
        return new TensorImpl(create(j, i, 0));
    }

    private static native boolean hasDelegateBufferHandle(long j);

    private static native int index(long j);

    private static native String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    private static native void writeDirectBuffer(long j, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j, Object obj);

    private static native void writeScalar(long j, Object obj);

    public final ByteBuffer a() {
        return buffer(this.f26919a).order(ByteOrder.nativeOrder());
    }

    public final void b() {
        delete(this.f26919a);
        this.f26919a = 0L;
    }

    public final int[] d(Object obj) {
        int iC = c(obj);
        if (this.b == DataType.h) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iC--;
                }
            }
        }
        int[] iArr = new int[iC];
        f(obj, 0, iArr);
        return iArr;
    }

    public final void e(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.f26919a)) {
                throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        j(obj);
        boolean z = obj instanceof Buffer;
        if (z) {
            int iNumBytes = numBytes(this.f26919a);
            boolean z2 = obj instanceof ByteBuffer;
            int iCapacity = ((Buffer) obj).capacity();
            if (!z2) {
                iCapacity *= this.b.a();
            }
            if (iNumBytes > iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(this.f26919a), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
        } else {
            int[] iArrD = d(obj);
            if (!Arrays.equals(iArrD, this.c)) {
                throw new IllegalArgumentException(a.o(a.v("Cannot copy from a TensorFlowLite tensor (", name(this.f26919a), ") with shape ", Arrays.toString(this.c), " to a Java object with shape "), Arrays.toString(iArrD), "."));
            }
        }
        if (!z) {
            readMultiDimensionalArray(this.f26919a, obj);
            return;
        }
        Buffer buffer = (Buffer) obj;
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(a());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(a().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(a().asLongBuffer());
            return;
        }
        if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(a().asIntBuffer());
        } else if (buffer instanceof ShortBuffer) {
            ((ShortBuffer) buffer).put(a().asShortBuffer());
        } else {
            throw new IllegalArgumentException("Unexpected output buffer type: " + buffer);
        }
    }

    public final void h() {
        this.c = shape(this.f26919a);
    }

    public final void i(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.f26919a)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        j(obj);
        boolean z = obj instanceof Buffer;
        DataType dataType = this.b;
        if (z) {
            int iNumBytes = numBytes(this.f26919a);
            boolean z2 = obj instanceof ByteBuffer;
            int iCapacity = ((Buffer) obj).capacity();
            if (!z2) {
                iCapacity *= dataType.a();
            }
            if (iNumBytes != iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(this.f26919a), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
        } else {
            int[] iArrD = d(obj);
            if (!Arrays.equals(iArrD, this.c)) {
                throw new IllegalArgumentException(a.o(a.v("Cannot copy to a TensorFlowLite tensor (", name(this.f26919a), ") with shape ", Arrays.toString(this.c), " from a Java object with shape "), Arrays.toString(iArrD), "."));
            }
        }
        if (!z) {
            if (dataType == DataType.h && this.c.length == 0) {
                writeScalar(this.f26919a, obj);
                return;
            } else if (obj.getClass().isArray()) {
                writeMultiDimensionalArray(this.f26919a, obj);
                return;
            } else {
                writeScalar(this.f26919a, obj);
                return;
            }
        }
        Buffer buffer = (Buffer) obj;
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f26919a, buffer);
                return;
            } else {
                a().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f26919a, buffer);
                return;
            } else {
                a().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f26919a, buffer);
                return;
            } else {
                a().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f26919a, buffer);
                return;
            } else {
                a().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (!(buffer instanceof ShortBuffer)) {
            throw new IllegalArgumentException("Unexpected input buffer type: " + buffer);
        }
        ShortBuffer shortBuffer = (ShortBuffer) buffer;
        if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.f26919a, buffer);
        } else {
            a().asShortBuffer().put(shortBuffer);
        }
    }

    public final void j(Object obj) {
        DataType dataType;
        if (obj instanceof ByteBuffer) {
            return;
        }
        Class<?> componentType = obj.getClass();
        boolean zIsArray = componentType.isArray();
        DataType dataType2 = this.b;
        if (!zIsArray) {
            if (Float.class.equals(componentType) || (obj instanceof FloatBuffer)) {
                dataType = DataType.d;
            } else if (Integer.class.equals(componentType) || (obj instanceof IntBuffer)) {
                dataType = DataType.e;
            } else if (Short.class.equals(componentType) || (obj instanceof ShortBuffer)) {
                dataType = DataType.j;
            } else if (Byte.class.equals(componentType)) {
                dataType = DataType.f;
            } else if (Long.class.equals(componentType) || (obj instanceof LongBuffer)) {
                dataType = DataType.g;
            } else {
                if (!Boolean.class.equals(componentType)) {
                    if (String.class.equals(componentType)) {
                        dataType = DataType.h;
                    }
                    throw new IllegalArgumentException(androidx.constraintlayout.core.state.a.g(obj, "DataType error: cannot resolve DataType of "));
                }
                dataType = DataType.i;
            }
            if (dataType != dataType2) {
                return;
            } else {
                return;
            }
        }
        while (componentType.isArray()) {
            componentType = componentType.getComponentType();
        }
        if (Float.TYPE.equals(componentType)) {
            dataType = DataType.d;
        } else if (Integer.TYPE.equals(componentType)) {
            dataType = DataType.e;
        } else if (Short.TYPE.equals(componentType)) {
            dataType = DataType.j;
        } else if (Byte.TYPE.equals(componentType)) {
            dataType = DataType.h;
            if (dataType2 != dataType) {
                dataType = DataType.f;
            }
        } else if (Long.TYPE.equals(componentType)) {
            dataType = DataType.g;
        } else {
            if (!Boolean.TYPE.equals(componentType)) {
                if (String.class.equals(componentType)) {
                    dataType = DataType.h;
                }
                throw new IllegalArgumentException(androidx.constraintlayout.core.state.a.g(obj, "DataType error: cannot resolve DataType of "));
            }
            dataType = DataType.i;
        }
        if (dataType != dataType2 || DataTypeUtils.a(dataType).equals(DataTypeUtils.a(dataType2))) {
            return;
        }
        throw new IllegalArgumentException("Cannot convert between a TensorFlowLite tensor with type " + dataType2 + " and a Java object of type " + obj.getClass().getName() + " (which is compatible with the TensorFlowLite type " + dataType + ").");
    }

    @Override // org.tensorflow.lite.Tensor
    public final int[] shape() {
        return this.c;
    }
}
