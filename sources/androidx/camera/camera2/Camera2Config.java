package androidx.camera.camera2;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;

/* loaded from: classes2.dex */
public final class Camera2Config {

    @RestrictTo
    public static final class DefaultProvider implements CameraXConfig.Provider {
        @Override // androidx.camera.core.CameraXConfig.Provider
        @NonNull
        public CameraXConfig getCameraXConfig() {
            a aVar = new a();
            b bVar = new b();
            c cVar = new c();
            CameraXConfig.Builder builder = new CameraXConfig.Builder();
            Config.Option option = CameraXConfig.H;
            MutableOptionsBundle mutableOptionsBundle = builder.f398a;
            mutableOptionsBundle.G(option, aVar);
            mutableOptionsBundle.G(CameraXConfig.I, bVar);
            mutableOptionsBundle.G(CameraXConfig.J, cVar);
            return new CameraXConfig(OptionsBundle.U(mutableOptionsBundle));
        }
    }
}
