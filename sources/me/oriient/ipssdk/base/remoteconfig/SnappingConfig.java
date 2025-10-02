package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/SnappingConfig;", "", "", "enableSnappingWhenConvertingCoordinates", "", "snappingWhenConvertingMaxDistance", "tooFarToSnapWarningDistanceMeters", "<init>", "(ZDD)V", "component1", "()Z", "component2", "()D", "component3", "copy", "(ZDD)Lme/oriient/ipssdk/base/remoteconfig/SnappingConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getEnableSnappingWhenConvertingCoordinates", "b", "D", "getSnappingWhenConvertingMaxDistance", "c", "getTooFarToSnapWarningDistanceMeters", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SnappingConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean enableSnappingWhenConvertingCoordinates;

    /* renamed from: b, reason: from kotlin metadata */
    private final double snappingWhenConvertingMaxDistance;

    /* renamed from: c, reason: from kotlin metadata */
    private final double tooFarToSnapWarningDistanceMeters;

    public SnappingConfig(boolean z, double d, double d2) {
        this.enableSnappingWhenConvertingCoordinates = z;
        this.snappingWhenConvertingMaxDistance = d;
        this.tooFarToSnapWarningDistanceMeters = d2;
    }

    public static /* synthetic */ SnappingConfig copy$default(SnappingConfig snappingConfig, boolean z, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = snappingConfig.enableSnappingWhenConvertingCoordinates;
        }
        if ((i & 2) != 0) {
            d = snappingConfig.snappingWhenConvertingMaxDistance;
        }
        if ((i & 4) != 0) {
            d2 = snappingConfig.tooFarToSnapWarningDistanceMeters;
        }
        return snappingConfig.copy(z, d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableSnappingWhenConvertingCoordinates() {
        return this.enableSnappingWhenConvertingCoordinates;
    }

    /* renamed from: component2, reason: from getter */
    public final double getSnappingWhenConvertingMaxDistance() {
        return this.snappingWhenConvertingMaxDistance;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTooFarToSnapWarningDistanceMeters() {
        return this.tooFarToSnapWarningDistanceMeters;
    }

    @NotNull
    public final SnappingConfig copy(boolean enableSnappingWhenConvertingCoordinates, double snappingWhenConvertingMaxDistance, double tooFarToSnapWarningDistanceMeters) {
        return new SnappingConfig(enableSnappingWhenConvertingCoordinates, snappingWhenConvertingMaxDistance, tooFarToSnapWarningDistanceMeters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnappingConfig)) {
            return false;
        }
        SnappingConfig snappingConfig = (SnappingConfig) other;
        return this.enableSnappingWhenConvertingCoordinates == snappingConfig.enableSnappingWhenConvertingCoordinates && Double.compare(this.snappingWhenConvertingMaxDistance, snappingConfig.snappingWhenConvertingMaxDistance) == 0 && Double.compare(this.tooFarToSnapWarningDistanceMeters, snappingConfig.tooFarToSnapWarningDistanceMeters) == 0;
    }

    public final boolean getEnableSnappingWhenConvertingCoordinates() {
        return this.enableSnappingWhenConvertingCoordinates;
    }

    public final double getSnappingWhenConvertingMaxDistance() {
        return this.snappingWhenConvertingMaxDistance;
    }

    public final double getTooFarToSnapWarningDistanceMeters() {
        return this.tooFarToSnapWarningDistanceMeters;
    }

    public int hashCode() {
        return Double.hashCode(this.tooFarToSnapWarningDistanceMeters) + android.support.v4.media.session.a.a(this.snappingWhenConvertingMaxDistance, Boolean.hashCode(this.enableSnappingWhenConvertingCoordinates) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SnappingConfig(enableSnappingWhenConvertingCoordinates=");
        sb.append(this.enableSnappingWhenConvertingCoordinates);
        sb.append(", snappingWhenConvertingMaxDistance=");
        sb.append(this.snappingWhenConvertingMaxDistance);
        sb.append(", tooFarToSnapWarningDistanceMeters=");
        return androidx.camera.core.impl.b.p(sb, this.tooFarToSnapWarningDistanceMeters, ')');
    }
}
