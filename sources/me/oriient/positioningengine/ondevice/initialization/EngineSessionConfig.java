package me.oriient.positioningengine.ondevice.initialization;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lme/oriient/positioningengine/ondevice/initialization/EngineSessionConfig;", "", "flipAxes", "", "(Z)V", "getFlipAxes", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EngineSessionConfig {
    private final boolean flipAxes;

    public EngineSessionConfig(boolean z) {
        this.flipAxes = z;
    }

    public static /* synthetic */ EngineSessionConfig copy$default(EngineSessionConfig engineSessionConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = engineSessionConfig.flipAxes;
        }
        return engineSessionConfig.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFlipAxes() {
        return this.flipAxes;
    }

    @NotNull
    public final EngineSessionConfig copy(boolean flipAxes) {
        return new EngineSessionConfig(flipAxes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EngineSessionConfig) && this.flipAxes == ((EngineSessionConfig) other).flipAxes;
    }

    public final boolean getFlipAxes() {
        return this.flipAxes;
    }

    public int hashCode() {
        return Boolean.hashCode(this.flipAxes);
    }

    @NotNull
    public String toString() {
        return androidx.camera.core.impl.b.s(new StringBuilder("EngineSessionConfig(flipAxes="), this.flipAxes, ')');
    }
}
