package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/AutoCalibConfig;", "", "", "autoCalibCheckTimeIntervalSec", "<init>", "(D)V", "component1", "()D", "copy", "(D)Lme/oriient/ipssdk/base/remoteconfig/AutoCalibConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "getAutoCalibCheckTimeIntervalSec", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AutoCalibConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final double autoCalibCheckTimeIntervalSec;

    public AutoCalibConfig(double d) {
        this.autoCalibCheckTimeIntervalSec = d;
    }

    public static /* synthetic */ AutoCalibConfig copy$default(AutoCalibConfig autoCalibConfig, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = autoCalibConfig.autoCalibCheckTimeIntervalSec;
        }
        return autoCalibConfig.copy(d);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAutoCalibCheckTimeIntervalSec() {
        return this.autoCalibCheckTimeIntervalSec;
    }

    @NotNull
    public final AutoCalibConfig copy(double autoCalibCheckTimeIntervalSec) {
        return new AutoCalibConfig(autoCalibCheckTimeIntervalSec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutoCalibConfig) && Double.compare(this.autoCalibCheckTimeIntervalSec, ((AutoCalibConfig) other).autoCalibCheckTimeIntervalSec) == 0;
    }

    public final double getAutoCalibCheckTimeIntervalSec() {
        return this.autoCalibCheckTimeIntervalSec;
    }

    public int hashCode() {
        return Double.hashCode(this.autoCalibCheckTimeIntervalSec);
    }

    @NotNull
    public String toString() {
        return androidx.camera.core.impl.b.p(new StringBuilder("AutoCalibConfig(autoCalibCheckTimeIntervalSec="), this.autoCalibCheckTimeIntervalSec, ')');
    }
}
