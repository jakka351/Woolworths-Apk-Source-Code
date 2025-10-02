package org.tensorflow.lite;

import java.nio.MappedByteBuffer;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.InterpreterImpl;
import org.tensorflow.lite.annotations.UsedByReflection;

@UsedByReflection
/* loaded from: classes8.dex */
class InterpreterFactoryImpl implements InterpreterFactoryApi {
    private static native String nativeRuntimeVersion();

    private static native String nativeSchemaVersion();

    @Override // org.tensorflow.lite.InterpreterFactoryApi
    public final InterpreterApi t(MappedByteBuffer mappedByteBuffer, InterpreterApi.Options options) {
        InterpreterImpl.Options options2 = new InterpreterImpl.Options(options);
        InterpreterImpl interpreterImpl = new InterpreterImpl();
        interpreterImpl.d = new NativeInterpreterWrapper(mappedByteBuffer, options2);
        return interpreterImpl;
    }
}
