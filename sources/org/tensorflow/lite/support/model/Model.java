package org.tensorflow.lite.support.model;

import android.util.Log;
import java.nio.MappedByteBuffer;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;

/* loaded from: classes8.dex */
public class Model {

    /* renamed from: a, reason: collision with root package name */
    public final InterpreterApi f26925a;
    public final GpuDelegateProxy b;

    /* renamed from: org.tensorflow.lite.support.model.Model$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26926a;

        static {
            int[] iArr = new int[Device.values().length];
            f26926a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26926a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26926a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Deprecated
    public static class Builder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Device {
        public static final Device d;
        public static final /* synthetic */ Device[] e;

        static {
            Device device = new Device("CPU", 0);
            d = device;
            e = new Device[]{device, new Device("NNAPI", 1), new Device("GPU", 2)};
        }

        public static Device valueOf(String str) {
            return (Device) Enum.valueOf(Device.class, str);
        }

        public static Device[] values() {
            return (Device[]) e.clone();
        }
    }

    public static class Options {

        /* renamed from: a, reason: collision with root package name */
        public final Device f26927a;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public Device f26928a;
        }

        public Options(Builder builder) {
            this.f26927a = builder.f26928a;
        }
    }

    public Model(InterpreterApi interpreterApi, GpuDelegateProxy gpuDelegateProxy) {
        this.f26925a = interpreterApi;
        this.b = gpuDelegateProxy;
    }

    public static Model b(MappedByteBuffer mappedByteBuffer, Options options) {
        InterpreterApi.Options options2 = new InterpreterApi.Options();
        int iOrdinal = options.f26927a.ordinal();
        GpuDelegateProxy gpuDelegateProxy = null;
        if (iOrdinal == 1) {
            options2.c = Boolean.TRUE;
        } else if (iOrdinal == 2) {
            try {
                gpuDelegateProxy = new GpuDelegateProxy(Class.forName("org.tensorflow.lite.gpu.GpuDelegate").getDeclaredConstructor(null).newInstance(null));
            } catch (ReflectiveOperationException e) {
                Log.e("GpuDelegateProxy", "Failed to create the GpuDelegate dynamically.", e);
            }
            SupportPreconditions.a("Cannot inference with GPU. Did you add \"tensorflow-lite-gpu\" as dependency?", gpuDelegateProxy != null);
            options2.d.add(gpuDelegateProxy);
        }
        options2.b = 1;
        return new Model(InterpreterApi.t(mappedByteBuffer, options2), gpuDelegateProxy);
    }

    public final void a() throws Exception {
        InterpreterApi interpreterApi = this.f26925a;
        if (interpreterApi != null) {
            interpreterApi.close();
        }
        GpuDelegateProxy gpuDelegateProxy = this.b;
        if (gpuDelegateProxy != null) {
            gpuDelegateProxy.close();
        }
    }
}
