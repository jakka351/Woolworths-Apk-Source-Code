package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSStartingPositionModel;", "Lme/oriient/ipssdk/api/models/IPSStartingPosition;", "x", "", "y", "radiusMeters", "z", "floorOrder", "", "buildingId", "", "(DDDDILjava/lang/String;)V", "getAccuracy", "getAltitude", "getBuildingId", "getFloorOrder", "getHeading", "Lme/oriient/ipssdk/api/models/IPSHeading;", "getLatitude", "getLongitude", "getTimeDeterminedMilli", "", "getX", "getY", "getZ", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSStartingPositionModel implements IPSStartingPosition {

    @NotNull
    private final String buildingId;
    private final int floorOrder;
    private final double radiusMeters;
    private final double x;
    private final double y;
    private final double z;

    public IPSStartingPositionModel(double d, double d2, double d3, double d4, int i, @NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.x = d;
        this.y = d2;
        this.radiusMeters = d3;
        this.z = d4;
        this.floorOrder = i;
        this.buildingId = buildingId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSStartingPosition
    /* renamed from: getAccuracy, reason: from getter */
    public double getRadiusMeters() {
        return this.radiusMeters;
    }

    @Override // me.oriient.ipssdk.api.models.IPSGlobalCoordinate
    public double getAltitude() {
        return 0.0d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    @NotNull
    public String getBuildingId() {
        return this.buildingId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    public int getFloorOrder() {
        return this.floorOrder;
    }

    @Override // me.oriient.ipssdk.api.models.IPSStartingPosition
    @Nullable
    public IPSHeading getHeading() {
        return null;
    }

    @Override // me.oriient.ipssdk.api.models.IPSGlobalCoordinate
    public double getLatitude() {
        return 0.0d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSGlobalCoordinate
    public double getLongitude() {
        return 0.0d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSStartingPosition
    public long getTimeDeterminedMilli() {
        return 0L;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getX() {
        return this.x;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getY() {
        return this.y;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getZ() {
        return this.z;
    }

    public /* synthetic */ IPSStartingPositionModel(double d, double d2, double d3, double d4, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, (i2 & 8) != 0 ? 0.0d : d4, i, str);
    }
}
