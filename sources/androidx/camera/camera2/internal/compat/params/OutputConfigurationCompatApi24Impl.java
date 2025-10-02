package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

@RequiresApi
/* loaded from: classes2.dex */
class OutputConfigurationCompatApi24Impl extends OutputConfigurationCompatBaseImpl {

    public static final class OutputConfigurationParamsApi24 {

        /* renamed from: a, reason: collision with root package name */
        public String f316a;
        public boolean b;
        public long c;

        public final boolean equals(Object obj) {
            if (obj instanceof OutputConfigurationParamsApi24) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void b() {
        ((OutputConfigurationParamsApi24) this.f319a).b = true;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void d(long j) {
        ((OutputConfigurationParamsApi24) this.f319a).c = j;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void e(String str) {
        ((OutputConfigurationParamsApi24) this.f319a).f316a = str;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Object g() {
        Object obj = this.f319a;
        Preconditions.b(obj instanceof OutputConfigurationParamsApi24);
        ((OutputConfigurationParamsApi24) obj).getClass();
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Surface getSurface() {
        return ((OutputConfiguration) g()).getSurface();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    public boolean h() {
        return ((OutputConfigurationParamsApi24) this.f319a).b;
    }
}
