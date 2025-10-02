package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/NewFloorNeeded;", "", "floorId", "", "priority", "", "(Ljava/lang/String;D)V", "getFloorId", "()Ljava/lang/String;", "getPriority", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NewFloorNeeded {

    @NotNull
    private final String floorId;
    private final double priority;

    public NewFloorNeeded(@NotNull String floorId, double d) {
        Intrinsics.h(floorId, "floorId");
        this.floorId = floorId;
        this.priority = d;
    }

    public static /* synthetic */ NewFloorNeeded copy$default(NewFloorNeeded newFloorNeeded, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newFloorNeeded.floorId;
        }
        if ((i & 2) != 0) {
            d = newFloorNeeded.priority;
        }
        return newFloorNeeded.copy(str, d);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    /* renamed from: component2, reason: from getter */
    public final double getPriority() {
        return this.priority;
    }

    @NotNull
    public final NewFloorNeeded copy(@NotNull String floorId, double priority) {
        Intrinsics.h(floorId, "floorId");
        return new NewFloorNeeded(floorId, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewFloorNeeded)) {
            return false;
        }
        NewFloorNeeded newFloorNeeded = (NewFloorNeeded) other;
        return Intrinsics.c(this.floorId, newFloorNeeded.floorId) && Double.compare(this.priority, newFloorNeeded.priority) == 0;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public final double getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return Double.hashCode(this.priority) + (this.floorId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NewFloorNeeded(floorId=");
        sb.append(this.floorId);
        sb.append(", priority=");
        return me.oriient.positioningengine.common.a.a(sb, this.priority, ')');
    }
}
