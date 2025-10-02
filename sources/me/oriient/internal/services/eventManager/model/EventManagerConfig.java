package me.oriient.internal.services.eventManager.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.locationManager.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventManagerConfig;", "", "timeoutMillis", "", "timeoutsToFail", "", "dataQueueLimit", "connectionRetryInitialIntervalMillis", "connectionRetryMaxIntervalMillis", "(JIIJJ)V", "getConnectionRetryInitialIntervalMillis", "()J", "getConnectionRetryMaxIntervalMillis", "getDataQueueLimit", "()I", "getTimeoutMillis", "getTimeoutsToFail", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EventManagerConfig {
    private final long connectionRetryInitialIntervalMillis;
    private final long connectionRetryMaxIntervalMillis;
    private final int dataQueueLimit;
    private final long timeoutMillis;
    private final int timeoutsToFail;

    public EventManagerConfig(long j, int i, int i2, long j2, long j3) {
        this.timeoutMillis = j;
        this.timeoutsToFail = i;
        this.dataQueueLimit = i2;
        this.connectionRetryInitialIntervalMillis = j2;
        this.connectionRetryMaxIntervalMillis = j3;
    }

    public static /* synthetic */ EventManagerConfig copy$default(EventManagerConfig eventManagerConfig, long j, int i, int i2, long j2, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = eventManagerConfig.timeoutMillis;
        }
        long j4 = j;
        if ((i3 & 2) != 0) {
            i = eventManagerConfig.timeoutsToFail;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = eventManagerConfig.dataQueueLimit;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            j2 = eventManagerConfig.connectionRetryInitialIntervalMillis;
        }
        return eventManagerConfig.copy(j4, i4, i5, j2, (i3 & 16) != 0 ? eventManagerConfig.connectionRetryMaxIntervalMillis : j3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTimeoutsToFail() {
        return this.timeoutsToFail;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDataQueueLimit() {
        return this.dataQueueLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final long getConnectionRetryInitialIntervalMillis() {
        return this.connectionRetryInitialIntervalMillis;
    }

    /* renamed from: component5, reason: from getter */
    public final long getConnectionRetryMaxIntervalMillis() {
        return this.connectionRetryMaxIntervalMillis;
    }

    @NotNull
    public final EventManagerConfig copy(long timeoutMillis, int timeoutsToFail, int dataQueueLimit, long connectionRetryInitialIntervalMillis, long connectionRetryMaxIntervalMillis) {
        return new EventManagerConfig(timeoutMillis, timeoutsToFail, dataQueueLimit, connectionRetryInitialIntervalMillis, connectionRetryMaxIntervalMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventManagerConfig)) {
            return false;
        }
        EventManagerConfig eventManagerConfig = (EventManagerConfig) other;
        return this.timeoutMillis == eventManagerConfig.timeoutMillis && this.timeoutsToFail == eventManagerConfig.timeoutsToFail && this.dataQueueLimit == eventManagerConfig.dataQueueLimit && this.connectionRetryInitialIntervalMillis == eventManagerConfig.connectionRetryInitialIntervalMillis && this.connectionRetryMaxIntervalMillis == eventManagerConfig.connectionRetryMaxIntervalMillis;
    }

    public final long getConnectionRetryInitialIntervalMillis() {
        return this.connectionRetryInitialIntervalMillis;
    }

    public final long getConnectionRetryMaxIntervalMillis() {
        return this.connectionRetryMaxIntervalMillis;
    }

    public final int getDataQueueLimit() {
        return this.dataQueueLimit;
    }

    public final long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public final int getTimeoutsToFail() {
        return this.timeoutsToFail;
    }

    public int hashCode() {
        return Long.hashCode(this.connectionRetryMaxIntervalMillis) + K.a(this.connectionRetryInitialIntervalMillis, me.oriient.internal.services.config.a.a(this.dataQueueLimit, me.oriient.internal.services.config.a.a(this.timeoutsToFail, Long.hashCode(this.timeoutMillis) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EventManagerConfig(timeoutMillis=");
        sb.append(this.timeoutMillis);
        sb.append(", timeoutsToFail=");
        sb.append(this.timeoutsToFail);
        sb.append(", dataQueueLimit=");
        sb.append(this.dataQueueLimit);
        sb.append(", connectionRetryInitialIntervalMillis=");
        sb.append(this.connectionRetryInitialIntervalMillis);
        sb.append(", connectionRetryMaxIntervalMillis=");
        return androidx.camera.core.impl.b.q(sb, this.connectionRetryMaxIntervalMillis, ')');
    }
}
