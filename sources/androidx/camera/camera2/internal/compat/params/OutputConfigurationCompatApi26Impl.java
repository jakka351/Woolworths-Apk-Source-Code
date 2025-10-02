package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.Objects;

@RequiresApi
/* loaded from: classes2.dex */
class OutputConfigurationCompatApi26Impl extends OutputConfigurationCompatApi24Impl {

    public static final class OutputConfigurationParamsApi26 {

        /* renamed from: a, reason: collision with root package name */
        public String f317a;
        public long b;

        public final boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi26)) {
                return false;
            }
            OutputConfigurationParamsApi26 outputConfigurationParamsApi26 = (OutputConfigurationParamsApi26) obj;
            return Objects.equals(null, null) && this.b == outputConfigurationParamsApi26.b && Objects.equals(this.f317a, outputConfigurationParamsApi26.f317a);
        }

        public final int hashCode() {
            throw null;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void a(Surface surface) {
        ((OutputConfiguration) g()).addSurface(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void b() {
        ((OutputConfiguration) g()).enableSurfaceSharing();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void d(long j) {
        ((OutputConfigurationParamsApi26) this.f319a).b = j;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void e(String str) {
        ((OutputConfigurationParamsApi26) this.f319a).f317a = str;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Object g() {
        Object obj = this.f319a;
        Preconditions.b(obj instanceof OutputConfigurationParamsApi26);
        ((OutputConfigurationParamsApi26) obj).getClass();
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    public final boolean h() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }
}
