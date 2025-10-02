package androidx.camera.camera2.interop;

import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.ReadableConfig;

@ExperimentalCamera2Interop
/* loaded from: classes2.dex */
public class CaptureRequestOptions implements ReadableConfig {
    public final Config G;

    public static final class Builder implements ExtendableBuilder<CaptureRequestOptions> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f383a = MutableOptionsBundle.V();

        public static Builder c(Config config) {
            Builder builder = new Builder();
            config.g(new e(0, builder, config));
            return builder;
        }

        public final CaptureRequestOptions a() {
            return new CaptureRequestOptions(OptionsBundle.U(this.f383a));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final MutableConfig b() {
            throw null;
        }
    }

    public CaptureRequestOptions(Config config) {
        this.G = config;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.G;
    }
}
