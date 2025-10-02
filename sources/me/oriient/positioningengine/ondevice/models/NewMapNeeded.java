package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/NewMapNeeded;", "", "floorId", "", "mapId", "priority", "", "(Ljava/lang/String;Ljava/lang/String;D)V", "getFloorId", "()Ljava/lang/String;", "getMapId", "getPriority", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NewMapNeeded {

    @NotNull
    private final String floorId;

    @NotNull
    private final String mapId;
    private final double priority;

    public NewMapNeeded(@NotNull String floorId, @NotNull String mapId, double d) {
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        this.floorId = floorId;
        this.mapId = mapId;
        this.priority = d;
    }

    public static /* synthetic */ NewMapNeeded copy$default(NewMapNeeded newMapNeeded, String str, String str2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newMapNeeded.floorId;
        }
        if ((i & 2) != 0) {
            str2 = newMapNeeded.mapId;
        }
        if ((i & 4) != 0) {
            d = newMapNeeded.priority;
        }
        return newMapNeeded.copy(str, str2, d);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPriority() {
        return this.priority;
    }

    @NotNull
    public final NewMapNeeded copy(@NotNull String floorId, @NotNull String mapId, double priority) {
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        return new NewMapNeeded(floorId, mapId, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMapNeeded)) {
            return false;
        }
        NewMapNeeded newMapNeeded = (NewMapNeeded) other;
        return Intrinsics.c(this.floorId, newMapNeeded.floorId) && Intrinsics.c(this.mapId, newMapNeeded.mapId) && Double.compare(this.priority, newMapNeeded.priority) == 0;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final String getMapId() {
        return this.mapId;
    }

    public final double getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return Double.hashCode(this.priority) + z.a(this.mapId, this.floorId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NewMapNeeded(floorId=");
        sb.append(this.floorId);
        sb.append(", mapId=");
        sb.append(this.mapId);
        sb.append(", priority=");
        return me.oriient.positioningengine.common.a.a(sb, this.priority, ')');
    }
}
