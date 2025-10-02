package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public class CameraConfigs {

    /* renamed from: a, reason: collision with root package name */
    public static final CameraConfig f473a = new DefaultCameraConfig();

    public static final class DefaultCameraConfig implements CameraConfig {
        public final Identifier G = new AutoValue_Identifier(new Object());

        @Override // androidx.camera.core.impl.CameraConfig
        public final Identifier C() {
            return this.G;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public final Config getConfig() {
            return OptionsBundle.I;
        }
    }
}
