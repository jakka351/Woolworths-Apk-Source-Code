package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.Objects;

@RequiresApi
/* loaded from: classes2.dex */
class OutputConfigurationCompatApi28Impl extends OutputConfigurationCompatApi26Impl {

    public static final class OutputConfigurationParamsApi28 {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f318a;
        public long b = 1;

        public OutputConfigurationParamsApi28(OutputConfiguration outputConfiguration) {
            this.f318a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi28)) {
                return false;
            }
            OutputConfigurationParamsApi28 outputConfigurationParamsApi28 = (OutputConfigurationParamsApi28) obj;
            return Objects.equals(this.f318a, outputConfigurationParamsApi28.f318a) && this.b == outputConfigurationParamsApi28.b;
        }

        public final int hashCode() {
            int iHashCode = this.f318a.hashCode() ^ 31;
            return Long.hashCode(this.b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void d(long j) {
        ((OutputConfigurationParamsApi28) this.f319a).b = j;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void e(String str) {
        ((OutputConfiguration) g()).setPhysicalCameraId(str);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Object g() {
        Object obj = this.f319a;
        Preconditions.b(obj instanceof OutputConfigurationParamsApi28);
        return ((OutputConfigurationParamsApi28) obj).f318a;
    }
}
