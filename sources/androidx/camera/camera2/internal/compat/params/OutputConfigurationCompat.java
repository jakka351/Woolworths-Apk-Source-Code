package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl;

/* loaded from: classes2.dex */
public final class OutputConfigurationCompat {

    /* renamed from: a, reason: collision with root package name */
    public final OutputConfigurationCompatApi28Impl f315a;

    public interface OutputConfigurationCompatImpl {
        void a(Surface surface);

        void b();

        void c(long j);

        void d(long j);

        void e(String str);

        void f(int i);

        Object g();

        Surface getSurface();
    }

    public OutputConfigurationCompat(int i, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f315a = new OutputConfigurationCompatApi33Impl(new OutputConfiguration(i, surface));
        } else {
            this.f315a = new OutputConfigurationCompatApi28Impl(new OutputConfigurationCompatApi28Impl.OutputConfigurationParamsApi28(new OutputConfiguration(i, surface)));
        }
    }

    public final void a(Surface surface) {
        this.f315a.a(surface);
    }

    public final void b() {
        this.f315a.b();
    }

    public final Surface c() {
        return this.f315a.getSurface();
    }

    public final void d(long j) {
        this.f315a.d(j);
    }

    public final void e(int i) {
        this.f315a.f(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OutputConfigurationCompat)) {
            return false;
        }
        return this.f315a.equals(((OutputConfigurationCompat) obj).f315a);
    }

    public final void f(String str) {
        this.f315a.e(str);
    }

    public final void g(long j) {
        this.f315a.c(j);
    }

    public final int hashCode() {
        return this.f315a.hashCode();
    }

    public OutputConfigurationCompat(OutputConfiguration outputConfiguration) {
        this.f315a = new OutputConfigurationCompatApi33Impl(outputConfiguration);
    }

    public OutputConfigurationCompat(OutputConfigurationCompatApi28Impl outputConfigurationCompatApi28Impl) {
        this.f315a = outputConfigurationCompatApi28Impl;
    }
}
