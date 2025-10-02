package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

@RequiresApi
/* loaded from: classes2.dex */
public class OutputConfigurationCompatApi33Impl extends OutputConfigurationCompatApi28Impl {
    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final void c(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) g()).setStreamUseCase(j);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final void d(long j) {
        ((OutputConfiguration) g()).setDynamicRangeProfile(j);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final void f(int i) {
        ((OutputConfiguration) g()).setMirrorMode(i);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public final Object g() {
        Object obj = this.f319a;
        Preconditions.b(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    public final int hashCode() {
        return this.f319a.hashCode();
    }
}
