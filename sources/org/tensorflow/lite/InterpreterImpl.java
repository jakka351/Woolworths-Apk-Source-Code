package org.tensorflow.lite;

import java.util.Map;
import org.tensorflow.lite.InterpreterApi;

/* loaded from: classes8.dex */
class InterpreterImpl implements InterpreterApi {
    public NativeInterpreterWrapper d;

    public static class Options extends InterpreterApi.Options {
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.d;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.d = null;
        }
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void f0(Object[] objArr, Map map) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.d;
        if (nativeInterpreterWrapper == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        nativeInterpreterWrapper.c(objArr, map);
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor x2(int i) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.d;
        if (nativeInterpreterWrapper != null) {
            return nativeInterpreterWrapper.b(i);
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }
}
