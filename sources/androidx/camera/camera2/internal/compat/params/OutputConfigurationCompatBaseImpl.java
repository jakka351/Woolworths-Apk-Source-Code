package androidx.camera.camera2.internal.compat.params;

import android.view.Surface;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import java.util.Objects;

/* loaded from: classes2.dex */
class OutputConfigurationCompatBaseImpl implements OutputConfigurationCompat.OutputConfigurationCompatImpl {

    /* renamed from: a, reason: collision with root package name */
    public final Object f319a;

    public static final class OutputConfigurationParamsApi21 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f320a;

        public final boolean equals(Object obj) {
            if (obj instanceof OutputConfigurationParamsApi21) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public OutputConfigurationCompatBaseImpl(Object obj) {
        this.f319a = obj;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void a(Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!h()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void b() {
        ((OutputConfigurationParamsApi21) this.f319a).f320a = true;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void c(long j) {
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void d(long j) {
        ((OutputConfigurationParamsApi21) this.f319a).getClass();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void e(String str) {
        ((OutputConfigurationParamsApi21) this.f319a).getClass();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OutputConfigurationCompatBaseImpl)) {
            return false;
        }
        return Objects.equals(this.f319a, ((OutputConfigurationCompatBaseImpl) obj).f319a);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void f(int i) {
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Object g() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Surface getSurface() {
        ((OutputConfigurationParamsApi21) this.f319a).getClass();
        throw null;
    }

    public boolean h() {
        return ((OutputConfigurationParamsApi21) this.f319a).f320a;
    }

    public int hashCode() {
        return this.f319a.hashCode();
    }
}
