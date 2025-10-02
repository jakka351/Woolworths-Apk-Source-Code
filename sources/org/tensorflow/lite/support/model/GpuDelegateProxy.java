package org.tensorflow.lite.support.model;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import org.tensorflow.lite.Delegate;

/* loaded from: classes8.dex */
class GpuDelegateProxy implements Delegate, Closeable {
    public final Delegate d;
    public final Closeable e;

    public GpuDelegateProxy(Object obj) {
        this.e = (Closeable) obj;
        this.d = (Delegate) obj;
    }

    @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.e.close();
        } catch (IOException e) {
            Log.e("GpuDelegateProxy", "Failed to close the GpuDelegate.", e);
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public final long w0() {
        return this.d.w0();
    }
}
