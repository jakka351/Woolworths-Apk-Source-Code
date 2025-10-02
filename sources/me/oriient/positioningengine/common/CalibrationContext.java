package me.oriient.positioningengine.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lme/oriient/positioningengine/common/CalibrationContext;", "", "engineSession", "Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;", "initiatedBy", "Lme/oriient/positioningengine/common/InitiatedBy;", "startTimeMillis", "", "buildingId", "", "sessionId", "(Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;Lme/oriient/positioningengine/common/InitiatedBy;JLjava/lang/String;Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getEngineSession", "()Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;", "getInitiatedBy", "()Lme/oriient/positioningengine/common/InitiatedBy;", "getSessionId", "getStartTimeMillis", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CalibrationContext {

    @Nullable
    private final String buildingId;

    @NotNull
    private final OnDeviceEngineSession engineSession;

    @NotNull
    private final InitiatedBy initiatedBy;

    @NotNull
    private final String sessionId;
    private final long startTimeMillis;

    public CalibrationContext(@NotNull OnDeviceEngineSession engineSession, @NotNull InitiatedBy initiatedBy, long j, @Nullable String str, @NotNull String sessionId) {
        Intrinsics.h(engineSession, "engineSession");
        Intrinsics.h(initiatedBy, "initiatedBy");
        Intrinsics.h(sessionId, "sessionId");
        this.engineSession = engineSession;
        this.initiatedBy = initiatedBy;
        this.startTimeMillis = j;
        this.buildingId = str;
        this.sessionId = sessionId;
    }

    public static /* synthetic */ CalibrationContext copy$default(CalibrationContext calibrationContext, OnDeviceEngineSession onDeviceEngineSession, InitiatedBy initiatedBy, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            onDeviceEngineSession = calibrationContext.engineSession;
        }
        if ((i & 2) != 0) {
            initiatedBy = calibrationContext.initiatedBy;
        }
        if ((i & 4) != 0) {
            j = calibrationContext.startTimeMillis;
        }
        if ((i & 8) != 0) {
            str = calibrationContext.buildingId;
        }
        if ((i & 16) != 0) {
            str2 = calibrationContext.sessionId;
        }
        long j2 = j;
        return calibrationContext.copy(onDeviceEngineSession, initiatedBy, j2, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OnDeviceEngineSession getEngineSession() {
        return this.engineSession;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InitiatedBy getInitiatedBy() {
        return this.initiatedBy;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final CalibrationContext copy(@NotNull OnDeviceEngineSession engineSession, @NotNull InitiatedBy initiatedBy, long startTimeMillis, @Nullable String buildingId, @NotNull String sessionId) {
        Intrinsics.h(engineSession, "engineSession");
        Intrinsics.h(initiatedBy, "initiatedBy");
        Intrinsics.h(sessionId, "sessionId");
        return new CalibrationContext(engineSession, initiatedBy, startTimeMillis, buildingId, sessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CalibrationContext) && Intrinsics.c(this.sessionId, ((CalibrationContext) other).sessionId);
    }

    @Nullable
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final OnDeviceEngineSession getEngineSession() {
        return this.engineSession;
    }

    @NotNull
    public final InitiatedBy getInitiatedBy() {
        return this.initiatedBy;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public int hashCode() {
        return this.sessionId.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CalibrationContext(engineSession=");
        sb.append(this.engineSession);
        sb.append(", initiatedBy=");
        sb.append(this.initiatedBy);
        sb.append(", startTimeMillis=");
        sb.append(this.startTimeMillis);
        sb.append(", buildingId=");
        sb.append(this.buildingId);
        sb.append(", sessionId=");
        return androidx.camera.core.impl.b.r(sb, this.sessionId, ')');
    }

    public /* synthetic */ CalibrationContext(OnDeviceEngineSession onDeviceEngineSession, InitiatedBy initiatedBy, long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onDeviceEngineSession, initiatedBy, j, (i & 8) != 0 ? null : str, (i & 16) != 0 ? androidx.constraintlayout.core.state.a.h("toString(...)") : str2);
    }
}
