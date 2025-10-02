package androidx.camera.core.impl;

import androidx.camera.core.Preview;
import androidx.camera.core.internal.ThreadConfig;

/* loaded from: classes2.dex */
public final class PreviewConfig implements UseCaseConfig<Preview>, ImageOutputConfig, ThreadConfig {
    public final OptionsBundle G;

    public PreviewConfig(OptionsBundle optionsBundle) {
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
