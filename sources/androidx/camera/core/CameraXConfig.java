package androidx.camera.core;

import android.os.Handler;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class CameraXConfig implements TargetConfig<CameraX> {
    public static final Config.Option H = Config.Option.a(CameraFactory.Provider.class, "camerax.core.appConfig.cameraFactoryProvider");
    public static final Config.Option I = Config.Option.a(CameraDeviceSurfaceManager.Provider.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final Config.Option J = Config.Option.a(UseCaseConfigFactory.Provider.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final Config.Option K = Config.Option.a(Executor.class, "camerax.core.appConfig.cameraExecutor");
    public static final Config.Option L = Config.Option.a(Handler.class, "camerax.core.appConfig.schedulerHandler");
    public static final Config.Option M = Config.Option.a(Integer.TYPE, "camerax.core.appConfig.minimumLoggingLevel");
    public static final Config.Option N = Config.Option.a(CameraSelector.class, "camerax.core.appConfig.availableCamerasLimiter");
    public static final Config.Option O = Config.Option.a(Long.TYPE, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");
    public static final Config.Option P = Config.Option.a(RetryPolicy.class, "camerax.core.appConfig.cameraProviderInitRetryPolicy");
    public static final Config.Option Q = Config.Option.a(QuirkSettings.class, "camerax.core.appConfig.quirksSettings");
    public final OptionsBundle G;

    public static final class Builder implements TargetConfig.Builder<CameraX, Builder> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f398a;

        public Builder() {
            Object objA;
            MutableOptionsBundle mutableOptionsBundleV = MutableOptionsBundle.V();
            this.f398a = mutableOptionsBundleV;
            Object objA2 = null;
            try {
                objA = mutableOptionsBundleV.a(TargetConfig.E);
            } catch (IllegalArgumentException unused) {
                objA = null;
            }
            Class cls = (Class) objA;
            if (cls != null && !cls.equals(CameraX.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            MutableOptionsBundle mutableOptionsBundle = this.f398a;
            mutableOptionsBundle.G(TargetConfig.E, CameraX.class);
            try {
                objA2 = mutableOptionsBundle.a(TargetConfig.D);
            } catch (IllegalArgumentException unused2) {
            }
            if (objA2 == null) {
                mutableOptionsBundle.G(TargetConfig.D, CameraX.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    public interface Provider {
        CameraXConfig getCameraXConfig();
    }

    public CameraXConfig(OptionsBundle optionsBundle) {
        this.G = optionsBundle;
    }

    public final CameraSelector U() {
        Object objA;
        try {
            objA = this.G.a(N);
        } catch (IllegalArgumentException unused) {
            objA = null;
        }
        return (CameraSelector) objA;
    }

    public final CameraFactory.Provider V() {
        Object objA;
        try {
            objA = this.G.a(H);
        } catch (IllegalArgumentException unused) {
            objA = null;
        }
        return (CameraFactory.Provider) objA;
    }

    public final long W() {
        Config.Option option = O;
        Object objA = -1L;
        OptionsBundle optionsBundle = this.G;
        optionsBundle.getClass();
        try {
            objA = optionsBundle.a(option);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objA).longValue();
    }

    public final CameraDeviceSurfaceManager.Provider X() {
        Object objA;
        try {
            objA = this.G.a(I);
        } catch (IllegalArgumentException unused) {
            objA = null;
        }
        return (CameraDeviceSurfaceManager.Provider) objA;
    }

    public final UseCaseConfigFactory.Provider Y() {
        Object objA;
        try {
            objA = this.G.a(J);
        } catch (IllegalArgumentException unused) {
            objA = null;
        }
        return (UseCaseConfigFactory.Provider) objA;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.G;
    }
}
