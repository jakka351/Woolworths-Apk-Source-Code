package org.tensorflow.lite;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.tensorflow.lite.TensorFlowLite;

/* loaded from: classes8.dex */
public interface InterpreterApi extends AutoCloseable {
    static InterpreterApi t(MappedByteBuffer mappedByteBuffer, Options options) {
        Exception exc;
        InterpreterFactoryApi interpreterFactoryApi;
        Options.TfLiteRuntime tfLiteRuntime = options.f26913a;
        Logger logger = TensorFlowLite.f26914a;
        AtomicBoolean[] atomicBooleanArr = TensorFlowLite.d;
        Options.TfLiteRuntime tfLiteRuntime2 = Options.TfLiteRuntime.d;
        if (tfLiteRuntime == null) {
            tfLiteRuntime = tfLiteRuntime2;
        }
        Options.TfLiteRuntime tfLiteRuntime3 = Options.TfLiteRuntime.f;
        if (tfLiteRuntime == tfLiteRuntime3 || tfLiteRuntime == Options.TfLiteRuntime.e) {
            TensorFlowLite.PossiblyAvailableRuntime possiblyAvailableRuntime = TensorFlowLite.RuntimeFromSystem.f26918a;
            if (possiblyAvailableRuntime.f26916a != null) {
                if (!atomicBooleanArr[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info("TfLiteRuntime." + tfLiteRuntime.name() + ": Using system TF Lite runtime client from com.google.android.gms");
                }
                interpreterFactoryApi = possiblyAvailableRuntime.f26916a;
                return interpreterFactoryApi.t(mappedByteBuffer, options);
            }
            exc = possiblyAvailableRuntime.b;
        } else {
            exc = null;
        }
        if (tfLiteRuntime == tfLiteRuntime3 || tfLiteRuntime == tfLiteRuntime2) {
            TensorFlowLite.PossiblyAvailableRuntime possiblyAvailableRuntime2 = TensorFlowLite.RuntimeFromApplication.f26917a;
            InterpreterFactoryApi interpreterFactoryApi2 = possiblyAvailableRuntime2.f26916a;
            Exception exc2 = possiblyAvailableRuntime2.b;
            if (interpreterFactoryApi2 != null) {
                if (!atomicBooleanArr[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info("TfLiteRuntime." + tfLiteRuntime.name() + ": Using application TF Lite runtime client from org.tensorflow.lite");
                }
                interpreterFactoryApi = possiblyAvailableRuntime2.f26916a;
                return interpreterFactoryApi.t(mappedByteBuffer, options);
            }
            if (exc == null) {
                exc = exc2;
            } else if (exc.getSuppressed().length == 0) {
                exc.addSuppressed(exc2);
            }
        }
        int iOrdinal = tfLiteRuntime.ordinal();
        throw new IllegalStateException("Couldn't find TensorFlow Lite runtime's InterpreterFactoryImpl class -- make sure your app links in the right TensorFlow Lite runtime. ".concat(iOrdinal != 0 ? iOrdinal != 1 ? "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite or com.google.android.gms:play-services-tflite-java" : "You should declare a build dependency on com.google.android.gms:play-services-tflite-java, or call .setRuntime with a value other than TfLiteRuntime.FROM_SYSTEM_ONLY  (see docs for org.tensorflow.lite.InterpreterApi.Options#setRuntime)." : "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite, or call .setRuntime with a value other than TfLiteRuntime.FROM_APPLICATION_ONLY (see docs for org.tensorflow.lite.InterpreterApi.Options#setRuntime(TfLiteRuntime))."), exc);
    }

    void f0(Object[] objArr, Map map);

    Tensor x2(int i);

    public static class Options {

        /* renamed from: a, reason: collision with root package name */
        public final TfLiteRuntime f26913a;
        public int b;
        public Boolean c;
        public final ArrayList d;
        public final ArrayList e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TfLiteRuntime {
            public static final TfLiteRuntime d;
            public static final TfLiteRuntime e;
            public static final TfLiteRuntime f;
            public static final /* synthetic */ TfLiteRuntime[] g;

            static {
                TfLiteRuntime tfLiteRuntime = new TfLiteRuntime("FROM_APPLICATION_ONLY", 0);
                d = tfLiteRuntime;
                TfLiteRuntime tfLiteRuntime2 = new TfLiteRuntime("FROM_SYSTEM_ONLY", 1);
                e = tfLiteRuntime2;
                TfLiteRuntime tfLiteRuntime3 = new TfLiteRuntime("PREFER_SYSTEM_OVER_APPLICATION", 2);
                f = tfLiteRuntime3;
                g = new TfLiteRuntime[]{tfLiteRuntime, tfLiteRuntime2, tfLiteRuntime3};
            }

            public static TfLiteRuntime valueOf(String str) {
                return (TfLiteRuntime) Enum.valueOf(TfLiteRuntime.class, str);
            }

            public static TfLiteRuntime[] values() {
                return (TfLiteRuntime[]) g.clone();
            }
        }

        public Options() {
            this.f26913a = TfLiteRuntime.d;
            this.b = -1;
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public Options(Options options) {
            this.f26913a = TfLiteRuntime.d;
            this.b = -1;
            this.b = options.b;
            this.c = options.c;
            this.d = new ArrayList(options.d);
            this.e = new ArrayList(options.e);
            this.f26913a = options.f26913a;
        }
    }
}
