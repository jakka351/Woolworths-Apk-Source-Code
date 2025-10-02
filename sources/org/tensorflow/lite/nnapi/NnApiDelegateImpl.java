package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* loaded from: classes8.dex */
public class NnApiDelegateImpl implements NnApiDelegate.PrivateInterface, Delegate, AutoCloseable {
    public long d;

    public NnApiDelegateImpl(NnApiDelegate.Options options) {
        TensorFlowLite.a();
        options.getClass();
        this.d = createDelegate(-1, null, null, null, -1, false, true, false, 0L);
    }

    private static native long createDelegate(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, boolean z3, long j);

    private static native void deleteDelegate(long j);

    private static native int getNnapiErrno(long j);

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface, org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.d;
        if (j != 0) {
            deleteDelegate(j);
            this.d = 0L;
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public final long w0() {
        return this.d;
    }
}
