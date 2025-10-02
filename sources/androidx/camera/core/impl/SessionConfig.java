package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.internal.compat.workaround.SurfaceSorter;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class SessionConfig {
    public static final List i = Arrays.asList(1, 5, 3);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f498a;
    public final OutputConfig b;
    public final List c;
    public final List d;
    public final List e;
    public final ErrorListener f;
    public final CaptureConfig g;
    public final InputConfiguration h;

    public static class BaseBuilder {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f499a = new LinkedHashSet();
        public final CaptureConfig.Builder b = new CaptureConfig.Builder();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public final ArrayList e = new ArrayList();
        public CloseableErrorListener f;
        public InputConfiguration g;
        public OutputConfig h;
    }

    public static class Builder extends BaseBuilder {
        public static Builder m(UseCaseConfig useCaseConfig, Size size) {
            OptionUnpacker optionUnpackerP = useCaseConfig.P();
            if (optionUnpackerP != null) {
                Builder builder = new Builder();
                optionUnpackerP.a(size, useCaseConfig, builder);
                return builder;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + useCaseConfig.m(useCaseConfig.toString()));
        }

        public final void a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
                this.b.b(cameraCaptureCallback);
                ArrayList arrayList = this.e;
                if (!arrayList.contains(cameraCaptureCallback)) {
                    arrayList.add(cameraCaptureCallback);
                }
            }
        }

        public final void b(Collection collection) {
            this.b.a(collection);
        }

        public final void c(CameraCaptureCallback cameraCaptureCallback) {
            this.b.b(cameraCaptureCallback);
            ArrayList arrayList = this.e;
            if (arrayList.contains(cameraCaptureCallback)) {
                return;
            }
            arrayList.add(cameraCaptureCallback);
        }

        public final void d(CameraDevice.StateCallback stateCallback) {
            ArrayList arrayList = this.c;
            if (arrayList.contains(stateCallback)) {
                return;
            }
            arrayList.add(stateCallback);
        }

        public final void e(Config config) {
            this.b.c(config);
        }

        public final void f(DeferrableSurface deferrableSurface, DynamicRange dynamicRange) {
            OutputConfig.Builder builderA = OutputConfig.a(deferrableSurface);
            AutoValue_SessionConfig_OutputConfig.Builder builder = (AutoValue_SessionConfig_OutputConfig.Builder) builderA;
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            builder.e = dynamicRange;
            this.f499a.add(builderA.a());
        }

        public final void g(CameraCaptureCallback cameraCaptureCallback) {
            this.b.b(cameraCaptureCallback);
        }

        public final void h(CameraCaptureSession.StateCallback stateCallback) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(stateCallback)) {
                return;
            }
            arrayList.add(stateCallback);
        }

        public final void i(DeferrableSurface deferrableSurface, DynamicRange dynamicRange, int i) {
            AutoValue_SessionConfig_OutputConfig.Builder builder = (AutoValue_SessionConfig_OutputConfig.Builder) OutputConfig.a(deferrableSurface);
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            builder.e = dynamicRange;
            builder.c = Integer.valueOf(i);
            this.f499a.add(builder.a());
            this.b.f483a.add(deferrableSurface);
        }

        public final void j(Number number, String str) {
            this.b.g.f504a.put(str, number);
        }

        public final SessionConfig k() {
            return new SessionConfig(new ArrayList(this.f499a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.d(), this.f, this.g, this.h);
        }

        public final void l() {
            this.f499a.clear();
            this.b.f483a.clear();
        }

        public final void n(CameraCaptureCallback cameraCaptureCallback) {
            this.b.e.remove(cameraCaptureCallback);
            this.e.remove(cameraCaptureCallback);
        }

        public final void o(CloseableErrorListener closeableErrorListener) {
            this.f = closeableErrorListener;
        }

        public final void p(Range range) {
            CaptureConfig.Builder builder = this.b;
            builder.getClass();
            builder.b.G(CaptureConfig.k, range);
        }

        public final void q(Config config) {
            CaptureConfig.Builder builder = this.b;
            builder.getClass();
            builder.b = MutableOptionsBundle.W(config);
        }

        public final void r(InputConfiguration inputConfiguration) {
            this.g = inputConfiguration;
        }

        public final void s(ImmediateSurface immediateSurface) {
            this.h = OutputConfig.a(immediateSurface).a();
        }

        public final void t(int i) {
            if (i != 0) {
                CaptureConfig.Builder builder = this.b;
                builder.getClass();
                if (i != 0) {
                    builder.b.G(UseCaseConfig.A, Integer.valueOf(i));
                }
            }
        }

        public final void u(int i) {
            this.b.c = i;
        }

        public final void v(int i) {
            if (i != 0) {
                CaptureConfig.Builder builder = this.b;
                builder.getClass();
                if (i != 0) {
                    builder.b.G(UseCaseConfig.B, Integer.valueOf(i));
                }
            }
        }
    }

    public static final class CloseableErrorListener implements ErrorListener {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f500a = new AtomicBoolean(false);
        public final ErrorListener b;

        public CloseableErrorListener(ErrorListener errorListener) {
            this.b = errorListener;
        }

        @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
        public final void a(SessionConfig sessionConfig) {
            if (this.f500a.get()) {
                return;
            }
            this.b.a(sessionConfig);
        }

        public final void b() {
            this.f500a.set(true);
        }
    }

    public interface ErrorListener {
        void a(SessionConfig sessionConfig);
    }

    public interface OptionUnpacker {
        void a(Size size, UseCaseConfig useCaseConfig, Builder builder);
    }

    @AutoValue
    public static abstract class OutputConfig {

        @AutoValue.Builder
        public static abstract class Builder {
            public abstract OutputConfig a();
        }

        public static Builder a(DeferrableSurface deferrableSurface) {
            AutoValue_SessionConfig_OutputConfig.Builder builder = new AutoValue_SessionConfig_OutputConfig.Builder();
            if (deferrableSurface == null) {
                throw new NullPointerException("Null surface");
            }
            builder.f467a = deferrableSurface;
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            builder.b = list;
            builder.c = -1;
            builder.d = -1;
            builder.e = DynamicRange.d;
            return builder;
        }

        public abstract DynamicRange b();

        public abstract int c();

        public abstract String d();

        public abstract List e();

        public abstract DeferrableSurface f();

        public abstract int g();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SessionError {
        public static final /* synthetic */ SessionError[] d = {new SessionError("SESSION_ERROR_SURFACE_NEEDS_RESET", 0), new SessionError("SESSION_ERROR_UNKNOWN", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        SessionError EF5;

        public static SessionError valueOf(String str) {
            return (SessionError) Enum.valueOf(SessionError.class, str);
        }

        public static SessionError[] values() {
            return (SessionError[]) d.clone();
        }
    }

    public static final class ValidatingBuilder extends BaseBuilder {
        public final SurfaceSorter i = new SurfaceSorter();
        public boolean j = true;
        public boolean k = false;
        public final ArrayList l = new ArrayList();

        public final void a(SessionConfig sessionConfig) {
            Object objA;
            CaptureConfig captureConfig = sessionConfig.g;
            int i = captureConfig.c;
            OptionsBundle optionsBundle = captureConfig.b;
            CaptureConfig.Builder builder = this.b;
            if (i != -1) {
                this.k = true;
                int i2 = builder.c;
                List list = SessionConfig.i;
                if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                    i = i2;
                }
                builder.c = i;
            }
            Config.Option option = CaptureConfig.k;
            Object objA2 = StreamSpec.f502a;
            try {
                objA2 = optionsBundle.a(option);
            } catch (IllegalArgumentException unused) {
            }
            Range range = (Range) objA2;
            Objects.requireNonNull(range);
            Range range2 = StreamSpec.f502a;
            if (!range.equals(range2)) {
                MutableOptionsBundle mutableOptionsBundle = builder.b;
                Config.Option option2 = CaptureConfig.k;
                mutableOptionsBundle.getClass();
                try {
                    objA = mutableOptionsBundle.a(option2);
                } catch (IllegalArgumentException unused2) {
                    objA = range2;
                }
                if (((Range) objA).equals(range2)) {
                    builder.b.G(CaptureConfig.k, range);
                } else {
                    MutableOptionsBundle mutableOptionsBundle2 = builder.b;
                    Config.Option option3 = CaptureConfig.k;
                    Object objA3 = StreamSpec.f502a;
                    mutableOptionsBundle2.getClass();
                    try {
                        objA3 = mutableOptionsBundle2.a(option3);
                    } catch (IllegalArgumentException unused3) {
                    }
                    if (!((Range) objA3).equals(range)) {
                        this.j = false;
                        Logger.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                    }
                }
            }
            int iB = captureConfig.b();
            if (iB != 0) {
                builder.getClass();
                if (iB != 0) {
                    builder.b.G(UseCaseConfig.A, Integer.valueOf(iB));
                }
            }
            int iC = captureConfig.c();
            if (iC != 0) {
                builder.getClass();
                if (iC != 0) {
                    builder.b.G(UseCaseConfig.B, Integer.valueOf(iC));
                }
            }
            TagBundle tagBundle = captureConfig.g;
            MutableTagBundle mutableTagBundle = builder.g;
            HashSet hashSet = builder.f483a;
            mutableTagBundle.f504a.putAll((Map) tagBundle.f504a);
            this.c.addAll(sessionConfig.c);
            this.d.addAll(sessionConfig.d);
            builder.a(captureConfig.e);
            this.e.addAll(sessionConfig.e);
            ErrorListener errorListener = sessionConfig.f;
            if (errorListener != null) {
                this.l.add(errorListener);
            }
            InputConfiguration inputConfiguration = sessionConfig.h;
            if (inputConfiguration != null) {
                this.g = inputConfiguration;
            }
            ArrayList arrayList = sessionConfig.f498a;
            LinkedHashSet<OutputConfig> linkedHashSet = this.f499a;
            linkedHashSet.addAll(arrayList);
            hashSet.addAll(Collections.unmodifiableList(captureConfig.f482a));
            ArrayList arrayList2 = new ArrayList();
            for (OutputConfig outputConfig : linkedHashSet) {
                arrayList2.add(outputConfig.f());
                Iterator it = outputConfig.e().iterator();
                while (it.hasNext()) {
                    arrayList2.add((DeferrableSurface) it.next());
                }
            }
            if (!arrayList2.containsAll(hashSet)) {
                Logger.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.j = false;
            }
            OutputConfig outputConfig2 = sessionConfig.b;
            if (outputConfig2 != null) {
                OutputConfig outputConfig3 = this.h;
                if (outputConfig3 == outputConfig2 || outputConfig3 == null) {
                    this.h = outputConfig2;
                } else {
                    Logger.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.j = false;
                }
            }
            builder.c(optionsBundle);
        }

        public final SessionConfig b() {
            if (!this.j) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f499a);
            SurfaceSorter surfaceSorter = this.i;
            if (surfaceSorter.f541a) {
                Collections.sort(arrayList, new androidx.camera.core.internal.compat.workaround.a(surfaceSorter, 0));
            }
            return new SessionConfig(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.d(), !this.l.isEmpty() ? new ErrorListener() { // from class: androidx.camera.core.impl.h
                @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
                public final void a(SessionConfig sessionConfig) {
                    Iterator it = this.f508a.l.iterator();
                    while (it.hasNext()) {
                        ((SessionConfig.ErrorListener) it.next()).a(sessionConfig);
                    }
                }
            } : null, this.g, this.h);
        }

        public final void c() {
            this.f499a.clear();
            this.b.f483a.clear();
        }
    }

    public SessionConfig(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, CaptureConfig captureConfig, ErrorListener errorListener, InputConfiguration inputConfiguration, OutputConfig outputConfig) {
        this.f498a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = errorListener;
        this.g = captureConfig;
        this.h = inputConfiguration;
        this.b = outputConfig;
    }

    public static SessionConfig a() {
        return new SessionConfig(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new CaptureConfig.Builder().d(), null, null, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f498a.iterator();
        while (it.hasNext()) {
            OutputConfig outputConfig = (OutputConfig) it.next();
            arrayList.add(outputConfig.f());
            Iterator it2 = outputConfig.e().iterator();
            while (it2.hasNext()) {
                arrayList.add((DeferrableSurface) it2.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
