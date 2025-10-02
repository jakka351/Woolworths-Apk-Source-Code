package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\u001d\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0006H\u0000¢\u0006\u0002\b/J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u00061"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingSearchResult;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "buildingToEnuRotation", "", "buildingOrigin", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "geofenceOrigin", "geofenceRadius", "", "primaryFloorId", "clientBuildingId", "displayName", "(Ljava/lang/String;Ljava/lang/String;DLme/oriient/internal/services/dataManager/common/WorldCoordinate;Lme/oriient/internal/services/dataManager/common/WorldCoordinate;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuildingOrigin", "()Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "getBuildingToEnuRotation", "()D", "getClientBuildingId", "()Ljava/lang/String;", "getDisplayName", "getGeofenceOrigin", "getGeofenceRadius", "()F", "getId", "getName", "getPrimaryFloorId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "isInsideRadius", "location", "radiusMeters", "isInsideRadius$internal_publishRelease", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BuildingSearchResult {

    @NotNull
    private final WorldCoordinate buildingOrigin;
    private final double buildingToEnuRotation;

    @Nullable
    private final String clientBuildingId;

    @NotNull
    private final String displayName;

    @NotNull
    private final WorldCoordinate geofenceOrigin;
    private final float geofenceRadius;

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    @NotNull
    private final String primaryFloorId;

    public BuildingSearchResult(@NotNull String id, @NotNull String name, double d, @NotNull WorldCoordinate buildingOrigin, @NotNull WorldCoordinate geofenceOrigin, float f, @NotNull String primaryFloorId, @Nullable String str, @NotNull String displayName) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(displayName, "displayName");
        this.id = id;
        this.name = name;
        this.buildingToEnuRotation = d;
        this.buildingOrigin = buildingOrigin;
        this.geofenceOrigin = geofenceOrigin;
        this.geofenceRadius = f;
        this.primaryFloorId = primaryFloorId;
        this.clientBuildingId = str;
        this.displayName = displayName;
    }

    public static /* synthetic */ BuildingSearchResult copy$default(BuildingSearchResult buildingSearchResult, String str, String str2, double d, WorldCoordinate worldCoordinate, WorldCoordinate worldCoordinate2, float f, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildingSearchResult.id;
        }
        if ((i & 2) != 0) {
            str2 = buildingSearchResult.name;
        }
        if ((i & 4) != 0) {
            d = buildingSearchResult.buildingToEnuRotation;
        }
        if ((i & 8) != 0) {
            worldCoordinate = buildingSearchResult.buildingOrigin;
        }
        if ((i & 16) != 0) {
            worldCoordinate2 = buildingSearchResult.geofenceOrigin;
        }
        if ((i & 32) != 0) {
            f = buildingSearchResult.geofenceRadius;
        }
        if ((i & 64) != 0) {
            str3 = buildingSearchResult.primaryFloorId;
        }
        if ((i & 128) != 0) {
            str4 = buildingSearchResult.clientBuildingId;
        }
        if ((i & 256) != 0) {
            str5 = buildingSearchResult.displayName;
        }
        String str6 = str4;
        String str7 = str5;
        double d2 = d;
        return buildingSearchResult.copy(str, str2, d2, worldCoordinate, worldCoordinate2, f, str3, str6, str7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final double getBuildingToEnuRotation() {
        return this.buildingToEnuRotation;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final WorldCoordinate getBuildingOrigin() {
        return this.buildingOrigin;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final WorldCoordinate getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    /* renamed from: component6, reason: from getter */
    public final float getGeofenceRadius() {
        return this.geofenceRadius;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getPrimaryFloorId() {
        return this.primaryFloorId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getClientBuildingId() {
        return this.clientBuildingId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final BuildingSearchResult copy(@NotNull String id, @NotNull String name, double buildingToEnuRotation, @NotNull WorldCoordinate buildingOrigin, @NotNull WorldCoordinate geofenceOrigin, float geofenceRadius, @NotNull String primaryFloorId, @Nullable String clientBuildingId, @NotNull String displayName) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(displayName, "displayName");
        return new BuildingSearchResult(id, name, buildingToEnuRotation, buildingOrigin, geofenceOrigin, geofenceRadius, primaryFloorId, clientBuildingId, displayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BuildingSearchResult) && Intrinsics.c(this.id, ((BuildingSearchResult) other).id);
    }

    @NotNull
    public final WorldCoordinate getBuildingOrigin() {
        return this.buildingOrigin;
    }

    public final double getBuildingToEnuRotation() {
        return this.buildingToEnuRotation;
    }

    @Nullable
    public final String getClientBuildingId() {
        return this.clientBuildingId;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final WorldCoordinate getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    public final float getGeofenceRadius() {
        return this.geofenceRadius;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPrimaryFloorId() {
        return this.primaryFloorId;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final boolean isInsideRadius$internal_publishRelease(@NotNull WorldCoordinate location, double radiusMeters) {
        Intrinsics.h(location, "location");
        return this.geofenceOrigin.distanceTo(location) <= radiusMeters;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BuildingSearchResult(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", buildingToEnuRotation=");
        sb.append(this.buildingToEnuRotation);
        sb.append(", buildingOrigin=");
        sb.append(this.buildingOrigin);
        sb.append(", geofenceOrigin=");
        sb.append(this.geofenceOrigin);
        sb.append(", geofenceRadius=");
        sb.append(this.geofenceRadius);
        sb.append(", primaryFloorId=");
        sb.append(this.primaryFloorId);
        sb.append(", clientBuildingId=");
        sb.append(this.clientBuildingId);
        sb.append(", displayName=");
        return me.oriient.internal.infra.rest.e.a(sb, this.displayName, ')');
    }
}
