package org.tensorflow.lite;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.tensorflow.lite.InterpreterApi;

/* loaded from: classes8.dex */
public final class TensorFlowLite {
    public static final UnsatisfiedLinkError b;
    public static final AtomicBoolean[] d;

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f26914a = Logger.getLogger(InterpreterApi.class.getName());
    public static volatile boolean c = false;

    /* renamed from: org.tensorflow.lite.TensorFlowLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26915a;

        static {
            int[] iArr = new int[InterpreterApi.Options.TfLiteRuntime.values().length];
            f26915a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26915a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class PossiblyAvailableRuntime {

        /* renamed from: a, reason: collision with root package name */
        public final InterpreterFactoryApi f26916a;
        public final Exception b;

        public PossiblyAvailableRuntime(String str, String str2) throws NoSuchMethodException, SecurityException {
            InterpreterFactoryApi interpreterFactoryApi;
            Exception exc = null;
            try {
                Constructor<?> declaredConstructor = Class.forName(str.concat(".InterpreterFactoryImpl")).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                interpreterFactoryApi = (InterpreterFactoryApi) declaredConstructor.newInstance(null);
                try {
                    if (interpreterFactoryApi != null) {
                        TensorFlowLite.f26914a.info("Found " + str2 + " TF Lite runtime client in " + str);
                    } else {
                        TensorFlowLite.f26914a.warning("Failed to construct TF Lite runtime client from ".concat(str));
                    }
                } catch (ClassNotFoundException e) {
                    e = e;
                    exc = e;
                    TensorFlowLite.f26914a.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                    this.b = exc;
                    this.f26916a = interpreterFactoryApi;
                } catch (IllegalAccessException e2) {
                    e = e2;
                    exc = e;
                    TensorFlowLite.f26914a.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                    this.b = exc;
                    this.f26916a = interpreterFactoryApi;
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    exc = e;
                    TensorFlowLite.f26914a.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                    this.b = exc;
                    this.f26916a = interpreterFactoryApi;
                } catch (InstantiationException e4) {
                    e = e4;
                    exc = e;
                    TensorFlowLite.f26914a.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                    this.b = exc;
                    this.f26916a = interpreterFactoryApi;
                } catch (NoSuchMethodException e5) {
                    e = e5;
                    exc = e;
                    TensorFlowLite.f26914a.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                    this.b = exc;
                    this.f26916a = interpreterFactoryApi;
                } catch (SecurityException e6) {
                    e = e6;
                    exc = e;
                    TensorFlowLite.f26914a.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                    this.b = exc;
                    this.f26916a = interpreterFactoryApi;
                } catch (InvocationTargetException e7) {
                    e = e7;
                    exc = e;
                    TensorFlowLite.f26914a.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                    this.b = exc;
                    this.f26916a = interpreterFactoryApi;
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e8) {
                e = e8;
                interpreterFactoryApi = null;
            }
            this.b = exc;
            this.f26916a = interpreterFactoryApi;
        }
    }

    public static class RuntimeFromApplication {

        /* renamed from: a, reason: collision with root package name */
        public static final PossiblyAvailableRuntime f26917a = new PossiblyAvailableRuntime("org.tensorflow.lite", "application");
    }

    public static class RuntimeFromSystem {

        /* renamed from: a, reason: collision with root package name */
        public static final PossiblyAvailableRuntime f26918a = new PossiblyAvailableRuntime("com.google.android.gms.tflite", "system");
    }

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (int i = 0; i < 2; i++) {
            for (String str : strArr[i]) {
                try {
                    System.loadLibrary(str);
                    f26914a.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e) {
                    f26914a.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e);
                    }
                }
            }
        }
        b = unsatisfiedLinkError;
        d = new AtomicBoolean[InterpreterApi.Options.TfLiteRuntime.values().length];
        for (int i2 = 0; i2 < InterpreterApi.Options.TfLiteRuntime.values().length; i2++) {
            d[i2] = new AtomicBoolean();
        }
    }

    public static void a() {
        if (c) {
            return;
        }
        try {
            nativeDoNothing();
            c = true;
        } catch (UnsatisfiedLinkError e) {
            UnsatisfiedLinkError unsatisfiedLinkError = b;
            if (unsatisfiedLinkError == null) {
                unsatisfiedLinkError = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + unsatisfiedLinkError);
            unsatisfiedLinkError2.initCause(e);
            throw unsatisfiedLinkError2;
        }
    }

    private static native void nativeDoNothing();
}
