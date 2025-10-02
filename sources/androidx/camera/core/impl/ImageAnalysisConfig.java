package androidx.camera.core.impl;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.impl.Config;
import androidx.camera.core.internal.ThreadConfig;

/* loaded from: classes2.dex */
public final class ImageAnalysisConfig implements UseCaseConfig<ImageAnalysis>, ImageOutputConfig, ThreadConfig {
    public static final Config.Option H = new AutoValue_Config_Option(ImageAnalysis.BackpressureStrategy.class, null, "camerax.core.imageAnalysis.backpressureStrategy");
    public static final Config.Option I = new AutoValue_Config_Option(Integer.TYPE, null, "camerax.core.imageAnalysis.imageQueueDepth");
    public static final Config.Option J = new AutoValue_Config_Option(ImageReaderProxyProvider.class, null, "camerax.core.imageAnalysis.imageReaderProxyProvider");
    public static final Config.Option K = new AutoValue_Config_Option(ImageAnalysis.OutputImageFormat.class, null, "camerax.core.imageAnalysis.outputImageFormat");
    public static final Config.Option L = new AutoValue_Config_Option(Boolean.class, null, "camerax.core.imageAnalysis.onePixelShiftEnabled");
    public static final Config.Option M = new AutoValue_Config_Option(Boolean.class, null, "camerax.core.imageAnalysis.outputImageRotationEnabled");
    public final OptionsBundle G;

    public ImageAnalysisConfig(OptionsBundle optionsBundle) {
        this.G = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.G;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int j() {
        return 35;
    }
}
