package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;

/* loaded from: classes2.dex */
public interface UseCaseConfig<T extends UseCase> extends TargetConfig<T>, ImageInputConfig {
    public static final Config.Option A;
    public static final Config.Option B;
    public static final Config.Option r = new AutoValue_Config_Option(SessionConfig.class, null, "camerax.core.useCase.defaultSessionConfig");
    public static final Config.Option s = new AutoValue_Config_Option(CaptureConfig.class, null, "camerax.core.useCase.defaultCaptureConfig");
    public static final Config.Option t = new AutoValue_Config_Option(SessionConfig.OptionUnpacker.class, null, "camerax.core.useCase.sessionConfigUnpacker");
    public static final Config.Option u = new AutoValue_Config_Option(CaptureConfig.OptionUnpacker.class, null, "camerax.core.useCase.captureConfigUnpacker");
    public static final Config.Option v;
    public static final Config.Option w;
    public static final Config.Option x;
    public static final Config.Option y;
    public static final Config.Option z;

    public interface Builder<T extends UseCase, C extends UseCaseConfig<T>, B> extends TargetConfig.Builder<T, B>, ExtendableBuilder<T> {
        UseCaseConfig e();
    }

    static {
        Class cls = Integer.TYPE;
        v = new AutoValue_Config_Option(cls, null, "camerax.core.useCase.surfaceOccupancyPriority");
        w = new AutoValue_Config_Option(Range.class, null, "camerax.core.useCase.targetFrameRate");
        Class cls2 = Boolean.TYPE;
        x = new AutoValue_Config_Option(cls2, null, "camerax.core.useCase.zslDisabled");
        y = new AutoValue_Config_Option(cls2, null, "camerax.core.useCase.highResolutionDisabled");
        z = new AutoValue_Config_Option(UseCaseConfigFactory.CaptureType.class, null, "camerax.core.useCase.captureType");
        A = new AutoValue_Config_Option(cls, null, "camerax.core.useCase.previewStabilizationMode");
        B = new AutoValue_Config_Option(cls, null, "camerax.core.useCase.videoStabilizationMode");
    }

    default SessionConfig A() {
        return (SessionConfig) a(r);
    }

    default Range L(Range range) {
        return (Range) c(w, range);
    }

    default int O() {
        return ((Integer) c(v, 0)).intValue();
    }

    default SessionConfig.OptionUnpacker P() {
        return (SessionConfig.OptionUnpacker) c(t, null);
    }

    default UseCaseConfigFactory.CaptureType Q() {
        return (UseCaseConfigFactory.CaptureType) a(z);
    }

    default CaptureConfig S() {
        return (CaptureConfig) c(s, null);
    }

    default boolean k() {
        return ((Boolean) c(y, Boolean.FALSE)).booleanValue();
    }

    default int o() {
        return ((Integer) c(B, 0)).intValue();
    }

    default int p() {
        return ((Integer) c(A, 0)).intValue();
    }

    default boolean r() {
        return ((Boolean) c(x, Boolean.FALSE)).booleanValue();
    }

    default SessionConfig x() {
        return (SessionConfig) c(r, null);
    }
}
