package org.tensorflow.lite;

import java.nio.MappedByteBuffer;
import org.tensorflow.lite.InterpreterApi;

/* loaded from: classes8.dex */
public interface InterpreterFactoryApi {
    InterpreterApi t(MappedByteBuffer mappedByteBuffer, InterpreterApi.Options options);
}
