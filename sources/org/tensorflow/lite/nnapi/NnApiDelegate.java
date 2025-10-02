package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.Delegate;

/* loaded from: classes8.dex */
public class NnApiDelegate implements Delegate, AutoCloseable {
    public Options d;
    public PrivateInterface e;
    public boolean f;

    public static final class Options {
    }

    public interface PrivateInterface extends Delegate, AutoCloseable {
        @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PrivateInterface privateInterface = this.e;
        if (privateInterface != null) {
            privateInterface.close();
            this.e = null;
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public final long w0() {
        PrivateInterface privateInterface = this.e;
        if (privateInterface == null) {
            throw new IllegalStateException(this.f ? "Should not access delegate after delegate has been closed." : "Should not access delegate before interpreter has been constructed.");
        }
        return privateInterface.w0();
    }
}
