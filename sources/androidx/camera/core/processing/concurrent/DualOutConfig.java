package androidx.camera.core.processing.concurrent;

import androidx.camera.core.processing.util.OutConfig;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class DualOutConfig {
    public static DualOutConfig c(OutConfig outConfig, OutConfig outConfig2) {
        return new AutoValue_DualOutConfig(outConfig, outConfig2);
    }

    public abstract OutConfig a();

    public abstract OutConfig b();
}
