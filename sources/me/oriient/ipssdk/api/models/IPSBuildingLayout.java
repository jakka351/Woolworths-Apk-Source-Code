package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSBuildingLayout;", "", "buildingId", "", "floors", "", "Lme/oriient/ipssdk/api/models/IPSFloorLayout;", "primaryFloor", "(Ljava/lang/String;Ljava/util/List;Lme/oriient/ipssdk/api/models/IPSFloorLayout;)V", "getBuildingId", "()Ljava/lang/String;", "getFloors", "()Ljava/util/List;", "getPrimaryFloor", "()Lme/oriient/ipssdk/api/models/IPSFloorLayout;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSBuildingLayout {

    @NotNull
    private final String buildingId;

    @NotNull
    private final List<IPSFloorLayout> floors;

    @NotNull
    private final IPSFloorLayout primaryFloor;

    public IPSBuildingLayout(@NotNull String buildingId, @NotNull List<IPSFloorLayout> floors, @NotNull IPSFloorLayout primaryFloor) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floors, "floors");
        Intrinsics.h(primaryFloor, "primaryFloor");
        this.buildingId = buildingId;
        this.floors = floors;
        this.primaryFloor = primaryFloor;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final List<IPSFloorLayout> getFloors() {
        return this.floors;
    }

    @NotNull
    public final IPSFloorLayout getPrimaryFloor() {
        return this.primaryFloor;
    }
}
