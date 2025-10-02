package androidx.camera.core.impl;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.impl.Config;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.resolutionselector.ResolutionSelector;

/* loaded from: classes2.dex */
public final class ImageCaptureConfig implements UseCaseConfig<ImageCapture>, ImageOutputConfig, IoConfig {
    public static final Config.Option H;
    public static final Config.Option I;
    public static final Config.Option J;
    public static final Config.Option K;
    public static final Config.Option L;
    public static final Config.Option M;
    public static final Config.Option N;
    public static final Config.Option O;
    public static final Config.Option P;
    public static final Config.Option Q;
    public static final Config.Option R;
    public final OptionsBundle G;

    static {
        Class cls = Integer.TYPE;
        H = new AutoValue_Config_Option(cls, null, "camerax.core.imageCapture.captureMode");
        I = new AutoValue_Config_Option(cls, null, "camerax.core.imageCapture.flashMode");
        J = new AutoValue_Config_Option(CaptureBundle.class, null, "camerax.core.imageCapture.captureBundle");
        K = new AutoValue_Config_Option(Integer.class, null, "camerax.core.imageCapture.bufferFormat");
        L = new AutoValue_Config_Option(Integer.class, null, "camerax.core.imageCapture.outputFormat");
        new AutoValue_Config_Option(Integer.class, null, "camerax.core.imageCapture.maxCaptureStages");
        M = new AutoValue_Config_Option(ImageReaderProxyProvider.class, null, "camerax.core.imageCapture.imageReaderProxyProvider");
        N = new AutoValue_Config_Option(Boolean.TYPE, null, "camerax.core.imageCapture.useSoftwareJpegEncoder");
        O = new AutoValue_Config_Option(cls, null, "camerax.core.imageCapture.flashType");
        new AutoValue_Config_Option(cls, null, "camerax.core.imageCapture.jpegCompressionQuality");
        P = new AutoValue_Config_Option(ImageCapture.ScreenFlash.class, null, "camerax.core.imageCapture.screenFlash");
        Q = new AutoValue_Config_Option(ResolutionSelector.class, null, "camerax.core.useCase.postviewResolutionSelector");
        R = new AutoValue_Config_Option(Boolean.class, null, "camerax.core.useCase.isPostviewEnabled");
    }

    public ImageCaptureConfig(OptionsBundle optionsBundle) {
        this.G = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.G;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int j() {
        return ((Integer) a(ImageInputConfig.f)).intValue();
    }
}
