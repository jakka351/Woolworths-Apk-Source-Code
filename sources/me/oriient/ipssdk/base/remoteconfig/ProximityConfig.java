package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015¨\u0006/"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/ProximityConfig;", "", "", "pendingRequestTimeoutMillis", "positionUpdatesThrottlingMillis", "", "closeWalkingDistanceMeters", "mediumWalkingDistanceMeters", "longWalkingDistanceMeters", "", "resolverErrorsToDropState", "<init>", "(JJDDDI)V", "component1", "()J", "component2", "component3", "()D", "component4", "component5", "component6", "()I", "copy", "(JJDDDI)Lme/oriient/ipssdk/base/remoteconfig/ProximityConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getPendingRequestTimeoutMillis", "b", "getPositionUpdatesThrottlingMillis", "c", "D", "getCloseWalkingDistanceMeters", "d", "getMediumWalkingDistanceMeters", "e", "getLongWalkingDistanceMeters", "f", "I", "getResolverErrorsToDropState", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProximityConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long pendingRequestTimeoutMillis;

    /* renamed from: b, reason: from kotlin metadata */
    private final long positionUpdatesThrottlingMillis;

    /* renamed from: c, reason: from kotlin metadata */
    private final double closeWalkingDistanceMeters;

    /* renamed from: d, reason: from kotlin metadata */
    private final double mediumWalkingDistanceMeters;

    /* renamed from: e, reason: from kotlin metadata */
    private final double longWalkingDistanceMeters;

    /* renamed from: f, reason: from kotlin metadata */
    private final int resolverErrorsToDropState;

    public ProximityConfig(long j, long j2, double d, double d2, double d3, int i) {
        this.pendingRequestTimeoutMillis = j;
        this.positionUpdatesThrottlingMillis = j2;
        this.closeWalkingDistanceMeters = d;
        this.mediumWalkingDistanceMeters = d2;
        this.longWalkingDistanceMeters = d3;
        this.resolverErrorsToDropState = i;
    }

    public static /* synthetic */ ProximityConfig copy$default(ProximityConfig proximityConfig, long j, long j2, double d, double d2, double d3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = proximityConfig.pendingRequestTimeoutMillis;
        }
        return proximityConfig.copy(j, (i2 & 2) != 0 ? proximityConfig.positionUpdatesThrottlingMillis : j2, (i2 & 4) != 0 ? proximityConfig.closeWalkingDistanceMeters : d, (i2 & 8) != 0 ? proximityConfig.mediumWalkingDistanceMeters : d2, (i2 & 16) != 0 ? proximityConfig.longWalkingDistanceMeters : d3, (i2 & 32) != 0 ? proximityConfig.resolverErrorsToDropState : i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPendingRequestTimeoutMillis() {
        return this.pendingRequestTimeoutMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPositionUpdatesThrottlingMillis() {
        return this.positionUpdatesThrottlingMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final double getCloseWalkingDistanceMeters() {
        return this.closeWalkingDistanceMeters;
    }

    /* renamed from: component4, reason: from getter */
    public final double getMediumWalkingDistanceMeters() {
        return this.mediumWalkingDistanceMeters;
    }

    /* renamed from: component5, reason: from getter */
    public final double getLongWalkingDistanceMeters() {
        return this.longWalkingDistanceMeters;
    }

    /* renamed from: component6, reason: from getter */
    public final int getResolverErrorsToDropState() {
        return this.resolverErrorsToDropState;
    }

    @NotNull
    public final ProximityConfig copy(long pendingRequestTimeoutMillis, long positionUpdatesThrottlingMillis, double closeWalkingDistanceMeters, double mediumWalkingDistanceMeters, double longWalkingDistanceMeters, int resolverErrorsToDropState) {
        return new ProximityConfig(pendingRequestTimeoutMillis, positionUpdatesThrottlingMillis, closeWalkingDistanceMeters, mediumWalkingDistanceMeters, longWalkingDistanceMeters, resolverErrorsToDropState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProximityConfig)) {
            return false;
        }
        ProximityConfig proximityConfig = (ProximityConfig) other;
        return this.pendingRequestTimeoutMillis == proximityConfig.pendingRequestTimeoutMillis && this.positionUpdatesThrottlingMillis == proximityConfig.positionUpdatesThrottlingMillis && Double.compare(this.closeWalkingDistanceMeters, proximityConfig.closeWalkingDistanceMeters) == 0 && Double.compare(this.mediumWalkingDistanceMeters, proximityConfig.mediumWalkingDistanceMeters) == 0 && Double.compare(this.longWalkingDistanceMeters, proximityConfig.longWalkingDistanceMeters) == 0 && this.resolverErrorsToDropState == proximityConfig.resolverErrorsToDropState;
    }

    public final double getCloseWalkingDistanceMeters() {
        return this.closeWalkingDistanceMeters;
    }

    public final double getLongWalkingDistanceMeters() {
        return this.longWalkingDistanceMeters;
    }

    public final double getMediumWalkingDistanceMeters() {
        return this.mediumWalkingDistanceMeters;
    }

    public final long getPendingRequestTimeoutMillis() {
        return this.pendingRequestTimeoutMillis;
    }

    public final long getPositionUpdatesThrottlingMillis() {
        return this.positionUpdatesThrottlingMillis;
    }

    public final int getResolverErrorsToDropState() {
        return this.resolverErrorsToDropState;
    }

    public int hashCode() {
        return Integer.hashCode(this.resolverErrorsToDropState) + android.support.v4.media.session.a.a(this.longWalkingDistanceMeters, android.support.v4.media.session.a.a(this.mediumWalkingDistanceMeters, android.support.v4.media.session.a.a(this.closeWalkingDistanceMeters, androidx.camera.core.impl.b.b(Long.hashCode(this.pendingRequestTimeoutMillis) * 31, 31, this.positionUpdatesThrottlingMillis), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ProximityConfig(pendingRequestTimeoutMillis=");
        sb.append(this.pendingRequestTimeoutMillis);
        sb.append(", positionUpdatesThrottlingMillis=");
        sb.append(this.positionUpdatesThrottlingMillis);
        sb.append(", closeWalkingDistanceMeters=");
        sb.append(this.closeWalkingDistanceMeters);
        sb.append(", mediumWalkingDistanceMeters=");
        sb.append(this.mediumWalkingDistanceMeters);
        sb.append(", longWalkingDistanceMeters=");
        sb.append(this.longWalkingDistanceMeters);
        sb.append(", resolverErrorsToDropState=");
        return YU.a.l(sb, this.resolverErrorsToDropState, ')');
    }
}
