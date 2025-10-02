package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSFloorLayoutPartFindingResult;", "", "coordinate", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "distance", "", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;D)V", "getCoordinate", "()Lme/oriient/ipssdk/api/models/IPSCoordinate;", "getDistance", "()D", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSFloorLayoutPartFindingResult {

    @NotNull
    private final IPSCoordinate coordinate;
    private final double distance;

    public IPSFloorLayoutPartFindingResult(@NotNull IPSCoordinate coordinate, double d) {
        Intrinsics.h(coordinate, "coordinate");
        this.coordinate = coordinate;
        this.distance = d;
    }

    @NotNull
    public final IPSCoordinate getCoordinate() {
        return this.coordinate;
    }

    public final double getDistance() {
        return this.distance;
    }
}
