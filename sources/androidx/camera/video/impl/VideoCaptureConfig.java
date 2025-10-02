package androidx.camera.video.impl;

import androidx.arch.core.util.Function;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final class VideoCaptureConfig<T extends VideoOutput> implements UseCaseConfig<VideoCapture<T>>, ImageOutputConfig, ThreadConfig {
    public static final Config.Option H = Config.Option.a(VideoOutput.class, "camerax.video.VideoCapture.videoOutput");
    public static final Config.Option I = Config.Option.a(Function.class, "camerax.video.VideoCapture.videoEncoderInfoFinder");
    public static final Config.Option J = Config.Option.a(Boolean.class, "camerax.video.VideoCapture.forceEnableSurfaceProcessing");
    public final OptionsBundle G;

    public VideoCaptureConfig(OptionsBundle optionsBundle) {
        Preconditions.b(optionsBundle.G.containsKey(H));
        this.G = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.G;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int j() {
        return 34;
    }
}
