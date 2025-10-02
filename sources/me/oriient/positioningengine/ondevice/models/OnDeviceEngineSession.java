package me.oriient.positioningengine.ondevice.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/OnDeviceEngineSession;", "", "id", "", "expirationTimeStamp", "", "(Ljava/lang/String;D)V", "getExpirationTimeStamp", "()D", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OnDeviceEngineSession {
    private final double expirationTimeStamp;

    @NotNull
    private final String id;

    public OnDeviceEngineSession(@NotNull String id, double d) {
        Intrinsics.h(id, "id");
        this.id = id;
        this.expirationTimeStamp = d;
    }

    public static /* synthetic */ OnDeviceEngineSession copy$default(OnDeviceEngineSession onDeviceEngineSession, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onDeviceEngineSession.id;
        }
        if ((i & 2) != 0) {
            d = onDeviceEngineSession.expirationTimeStamp;
        }
        return onDeviceEngineSession.copy(str, d);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getExpirationTimeStamp() {
        return this.expirationTimeStamp;
    }

    @NotNull
    public final OnDeviceEngineSession copy(@NotNull String id, double expirationTimeStamp) {
        Intrinsics.h(id, "id");
        return new OnDeviceEngineSession(id, expirationTimeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnDeviceEngineSession)) {
            return false;
        }
        OnDeviceEngineSession onDeviceEngineSession = (OnDeviceEngineSession) other;
        return Intrinsics.c(this.id, onDeviceEngineSession.id) && Double.compare(this.expirationTimeStamp, onDeviceEngineSession.expirationTimeStamp) == 0;
    }

    public final double getExpirationTimeStamp() {
        return this.expirationTimeStamp;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Double.hashCode(this.expirationTimeStamp) + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OnDeviceEngineSession(id=");
        sb.append(this.id);
        sb.append(", expirationTimeStamp=");
        return me.oriient.positioningengine.common.a.a(sb, this.expirationTimeStamp, ')');
    }
}
