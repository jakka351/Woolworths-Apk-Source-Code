package org.tensorflow.lite;

import YU.a;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.lite.annotations.UsedByReflection;

/* loaded from: classes8.dex */
class NativeInterpreterWrapper implements AutoCloseable {
    public long d;
    public long e;
    public long f;
    public MappedByteBuffer h;
    public final TensorImpl[] i;
    public final TensorImpl[] j;
    public boolean k;
    public final ArrayList l;
    public final ArrayList m;
    public long g = 0;

    @UsedByReflection
    private long inferenceDurationNanoseconds = -1;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        r12 = (org.tensorflow.lite.Delegate) r13.getConstructor(null).newInstance(null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NativeInterpreterWrapper(java.nio.MappedByteBuffer r19, org.tensorflow.lite.InterpreterImpl.Options r20) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.NativeInterpreterWrapper.<init>(java.nio.MappedByteBuffer, org.tensorflow.lite.InterpreterImpl$Options):void");
    }

    private static native long allocateTensors(long j, long j2);

    private static native void allowBufferHandleOutput(long j, boolean z);

    private static native void allowFp16PrecisionForFp32(long j, boolean z);

    private static native long createCancellationFlag(long j);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i, boolean z, List<Long> list);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native long deleteCancellationFlag(long j);

    private static native int getExecutionPlanLength(long j);

    private static native int getInputCount(long j);

    private static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native String[] getOutputNames(long j);

    private static native int getOutputTensorIndex(long j, int i);

    private static native String[] getSignatureKeys(long j);

    private static native boolean hasUnresolvedFlexOp(long j);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    private static native void run(long j, long j2);

    private static native void setCancelled(long j, long j2, boolean z);

    public final TensorImpl a(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.i;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.e;
                TensorImpl tensorImplG = TensorImpl.g(getInputTensorIndex(j, i), j);
                tensorImplArr[i] = tensorImplG;
                return tensorImplG;
            }
        }
        throw new IllegalArgumentException(a.d(i, "Invalid input Tensor index: "));
    }

    public final TensorImpl b(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.j;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.e;
                TensorImpl tensorImplG = TensorImpl.g(getOutputTensorIndex(j, i), j);
                tensorImplArr[i] = tensorImplG;
                return tensorImplG;
            }
        }
        throw new IllegalArgumentException(a.d(i, "Invalid output Tensor index: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object[] r9, java.util.Map r10) {
        /*
            r8 = this;
            r0 = -1
            r8.inferenceDurationNanoseconds = r0
            int r0 = r9.length
            if (r0 == 0) goto Lcc
            r0 = 0
            r5 = r0
        L9:
            int r1 = r9.length
            if (r5 >= r1) goto L48
            org.tensorflow.lite.TensorImpl r1 = r8.a(r5)
            r2 = r9[r5]
            r3 = 0
            if (r2 != 0) goto L17
        L15:
            r6 = r3
            goto L2d
        L17:
            boolean r4 = r2 instanceof java.nio.Buffer
            if (r4 == 0) goto L1c
            goto L15
        L1c:
            r1.j(r2)
            int[] r2 = r1.d(r2)
            int[] r1 = r1.c
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L2c
            goto L15
        L2c:
            r6 = r2
        L2d:
            if (r6 == 0) goto L45
            long r1 = r8.e
            long r3 = r8.d
            r7 = 0
            boolean r1 = resizeInput(r1, r3, r5, r6, r7)
            if (r1 == 0) goto L45
            r8.k = r0
            org.tensorflow.lite.TensorImpl[] r1 = r8.i
            r1 = r1[r5]
            if (r1 == 0) goto L45
            r1.h()
        L45:
            int r5 = r5 + 1
            goto L9
        L48:
            boolean r1 = r8.k
            if (r1 == 0) goto L4e
            r1 = r0
            goto L68
        L4e:
            r1 = 1
            r8.k = r1
            long r2 = r8.e
            long r4 = r8.d
            allocateTensors(r2, r4)
            org.tensorflow.lite.TensorImpl[] r2 = r8.j
            int r3 = r2.length
            r4 = r0
        L5c:
            if (r4 >= r3) goto L68
            r5 = r2[r4]
            if (r5 == 0) goto L65
            r5.h()
        L65:
            int r4 = r4 + 1
            goto L5c
        L68:
            r2 = r0
        L69:
            int r3 = r9.length
            if (r2 >= r3) goto L78
            org.tensorflow.lite.TensorImpl r3 = r8.a(r2)
            r4 = r9[r2]
            r3.i(r4)
            int r2 = r2 + 1
            goto L69
        L78:
            long r2 = java.lang.System.nanoTime()
            long r4 = r8.e
            long r6 = r8.d
            run(r4, r6)
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 - r2
            if (r1 == 0) goto L99
            org.tensorflow.lite.TensorImpl[] r9 = r8.j
            int r1 = r9.length
        L8d:
            if (r0 >= r1) goto L99
            r2 = r9[r0]
            if (r2 == 0) goto L96
            r2.h()
        L96:
            int r0 = r0 + 1
            goto L8d
        L99:
            java.util.Set r9 = r10.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La1:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lc9
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r10.getValue()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r10.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            org.tensorflow.lite.TensorImpl r0 = r8.b(r0)
            java.lang.Object r10 = r10.getValue()
            r0.e(r10)
            goto La1
        Lc9:
            r8.inferenceDurationNanoseconds = r4
            return
        Lcc:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Input error: Inputs should not be null or empty."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.NativeInterpreterWrapper.c(java.lang.Object[], java.util.Map):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.i;
            if (i >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i];
            if (tensorImpl != null) {
                tensorImpl.b();
                this.i[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.j;
            if (i2 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i2];
            if (tensorImpl2 != null) {
                tensorImpl2.b();
                this.j[i2] = null;
            }
            i2++;
        }
        delete(this.d, this.f, this.e);
        deleteCancellationFlag(this.g);
        this.d = 0L;
        this.f = 0L;
        this.e = 0L;
        this.g = 0L;
        this.h = null;
        this.k = false;
        this.l.clear();
        ArrayList arrayList = this.m;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Delegate) it.next()).close();
        }
        arrayList.clear();
    }
}
