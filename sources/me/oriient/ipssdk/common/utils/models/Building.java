package me.oriient.ipssdk.common.utils.models;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.ipssdk.api.models.IPSBuilding;
import me.oriient.ipssdk.api.models.IPSExternalRegion;
import me.oriient.ipssdk.api.models.IPSFloor;
import me.oriient.ipssdk.api.models.IPSGlobalCoordinate;
import me.oriient.ipssdk.base.auth.SpaceId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001bJ\u0011\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0000H\u0096\u0002J\n\u00102\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u00103\u001a\u00020\u0007H\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0012H\u0016J\u0012\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u00020\u0007H\u0016J\u0012\u00109\u001a\u0004\u0018\u0001072\u0006\u0010:\u001a\u000200H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u0002070\u0012H\u0016J\b\u0010<\u001a\u00020\tH\u0016J\b\u0010=\u001a\u00020\u0007H\u0016J\b\u0010>\u001a\u00020\tH\u0016J\b\u0010?\u001a\u00020\tH\u0016J\n\u0010@\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010A\u001a\u00020\u0007H\u0016J\n\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u000207H\u0016J\b\u0010E\u001a\u00020\u0007H\u0016J\b\u0010F\u001a\u00020\tH\u0016J\r\u0010G\u001a\u00020\u0007H\u0000¢\u0006\u0002\bHJ\b\u0010I\u001a\u00020\u0017H\u0016J\b\u0010J\u001a\u00020\u0007H\u0016R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010,R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0019\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b.\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/Building;", "Lme/oriient/ipssdk/api/models/IPSBuilding;", "Lme/oriient/ipssdk/common/utils/models/PostProcessable;", "", "buildingId", "Lme/oriient/ipssdk/common/utils/models/BuildingId;", "buildingName", "", "rotation", "", "coordinate", "Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "geofenceOrigin", "buildingGeofenceRadius", "buildingPrimaryFloorId", "spaceId", "Lme/oriient/ipssdk/base/auth/SpaceId;", "buildingFloors", "", "Lme/oriient/ipssdk/common/utils/models/Floor;", "buildingExternalRegions", "Lme/oriient/ipssdk/common/utils/models/ExternalRegion;", "isFloorDetectionSupported", "", "clientBuildingId", "displayName", "metadata", "(Ljava/lang/String;Ljava/lang/String;DLme/oriient/ipssdk/common/utils/models/WorldCoordinate;Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBuildingExternalRegions", "()Ljava/util/List;", "getBuildingFloors", "getBuildingGeofenceRadius", "()D", "getBuildingId-wMWW5LA", "()Ljava/lang/String;", "Ljava/lang/String;", "getBuildingName", "buildingPrimaryFloor", "getBuildingPrimaryFloor", "()Lme/oriient/ipssdk/common/utils/models/Floor;", "getBuildingPrimaryFloorId", "getCoordinate", "()Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "getGeofenceOrigin", "()Z", "getRotation", "getSpaceId-Gy9wwTQ", "compareTo", "", "other", "getClientBuildingId", "getDisplayName", "getExternalRegions", "Lme/oriient/ipssdk/api/models/IPSExternalRegion;", "getFloorById", "Lme/oriient/ipssdk/api/models/IPSFloor;", "floorId", "getFloorByOrder", "order", "getFloors", "getGeofenceRadius", "getId", "getLatitude", "getLongitude", "getMetadata", "getName", "getOrigin", "Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;", "getPrimaryFloor", "getPrimaryFloorId", "getRotationToENU", "getSpaceId", "getSpaceId$me_oriient_sdk_common", "isInitialFloorDetectionSupported", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class Building implements IPSBuilding, PostProcessable, Comparable<Building> {

    @NotNull
    private final List<ExternalRegion> buildingExternalRegions;

    @NotNull
    private final List<Floor> buildingFloors;
    private final double buildingGeofenceRadius;

    @NotNull
    private final String buildingId;

    @NotNull
    private final String buildingName;

    @NotNull
    private final Floor buildingPrimaryFloor;

    @NotNull
    private final String buildingPrimaryFloorId;

    @Nullable
    private final String clientBuildingId;

    @NotNull
    private final WorldCoordinate coordinate;

    @NotNull
    private final String displayName;

    @NotNull
    private final WorldCoordinate geofenceOrigin;
    private final boolean isFloorDetectionSupported;

    @Nullable
    private String metadata;
    private final double rotation;

    @NotNull
    private final String spaceId;

    public /* synthetic */ Building(String str, String str2, double d, WorldCoordinate worldCoordinate, WorldCoordinate worldCoordinate2, double d2, String str3, String str4, List list, List list2, boolean z, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, worldCoordinate, worldCoordinate2, d2, str3, str4, list, list2, z, str5, str6, str7);
    }

    @NotNull
    public final List<ExternalRegion> getBuildingExternalRegions() {
        return this.buildingExternalRegions;
    }

    @NotNull
    public final List<Floor> getBuildingFloors() {
        return this.buildingFloors;
    }

    public final double getBuildingGeofenceRadius() {
        return this.buildingGeofenceRadius;
    }

    @NotNull
    /* renamed from: getBuildingId-wMWW5LA, reason: not valid java name and from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getBuildingName() {
        return this.buildingName;
    }

    @NotNull
    public final Floor getBuildingPrimaryFloor() {
        return this.buildingPrimaryFloor;
    }

    @NotNull
    public final String getBuildingPrimaryFloorId() {
        return this.buildingPrimaryFloorId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @Nullable
    public String getClientBuildingId() {
        return this.clientBuildingId;
    }

    @NotNull
    public final WorldCoordinate getCoordinate() {
        return this.coordinate;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @NotNull
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @NotNull
    public List<IPSExternalRegion> getExternalRegions() {
        return this.buildingExternalRegions;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @Nullable
    public IPSFloor getFloorById(@NotNull String floorId) {
        Object next;
        Intrinsics.h(floorId, "floorId");
        Iterator<T> it = this.buildingFloors.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((Floor) next).getId(), floorId)) {
                break;
            }
        }
        return (IPSFloor) next;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @Nullable
    public IPSFloor getFloorByOrder(int order) {
        Object next;
        Iterator<T> it = this.buildingFloors.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Floor) next).getOrder() == order) {
                break;
            }
        }
        return (IPSFloor) next;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @NotNull
    public List<IPSFloor> getFloors() {
        ArrayList arrayList = new ArrayList();
        if (!this.buildingFloors.isEmpty()) {
            arrayList.addAll(this.buildingFloors);
        }
        return arrayList;
    }

    @NotNull
    public final WorldCoordinate getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    public double getGeofenceRadius() {
        return this.buildingGeofenceRadius;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @NotNull
    public String getId() {
        return this.buildingId;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    public double getLatitude() {
        return this.geofenceOrigin.getLatitude();
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    public double getLongitude() {
        return this.geofenceOrigin.getLongitude();
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @Nullable
    public String getMetadata() {
        return this.metadata;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @NotNull
    public String getName() {
        return this.buildingName;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @Nullable
    public IPSGlobalCoordinate getOrigin() {
        return this.coordinate;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @NotNull
    public IPSFloor getPrimaryFloor() {
        Floor floor = this.buildingPrimaryFloor;
        if (floor != null) {
            return floor;
        }
        throw new IllegalStateException(("building " + getName() + " doesn't have a primary floor").toString());
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    @NotNull
    public String getPrimaryFloorId() {
        return this.buildingPrimaryFloorId;
    }

    public final double getRotation() {
        return this.rotation;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    public double getRotationToENU() {
        return this.rotation;
    }

    @NotNull
    /* renamed from: getSpaceId$me_oriient_sdk_common, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    /* renamed from: getSpaceId-Gy9wwTQ, reason: not valid java name */
    public final String m439getSpaceIdGy9wwTQ() {
        return this.spaceId;
    }

    /* renamed from: isFloorDetectionSupported, reason: from getter */
    public final boolean getIsFloorDetectionSupported() {
        return this.isFloorDetectionSupported;
    }

    @Override // me.oriient.ipssdk.api.models.IPSBuilding
    public boolean isInitialFloorDetectionSupported() {
        return this.isFloorDetectionSupported;
    }

    @NotNull
    public String toString() {
        return "BuildingV4{id='" + this.buildingId + "', name='" + getName() + "', rotation=" + this.rotation + ", coordinate=" + this.coordinate + ", geofenceOrigin=" + this.geofenceOrigin + ", geofenceRadius=" + getGeofenceRadius() + ", primaryFloorId='" + getPrimaryFloorId() + "', spaceId='" + ((Object) SpaceId.m415toStringimpl(this.spaceId)) + "', floors=" + this.buildingFloors + ", externalRegions=" + getExternalRegions() + '}';
    }

    private Building(String buildingId, String buildingName, double d, WorldCoordinate coordinate, WorldCoordinate geofenceOrigin, double d2, String buildingPrimaryFloorId, String spaceId, List<Floor> buildingFloors, List<ExternalRegion> buildingExternalRegions, boolean z, String str, String displayName, String str2) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(buildingName, "buildingName");
        Intrinsics.h(coordinate, "coordinate");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(buildingPrimaryFloorId, "buildingPrimaryFloorId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(buildingFloors, "buildingFloors");
        Intrinsics.h(buildingExternalRegions, "buildingExternalRegions");
        Intrinsics.h(displayName, "displayName");
        this.buildingId = buildingId;
        this.buildingName = buildingName;
        this.rotation = d;
        this.coordinate = coordinate;
        this.geofenceOrigin = geofenceOrigin;
        this.buildingGeofenceRadius = d2;
        this.buildingPrimaryFloorId = buildingPrimaryFloorId;
        this.spaceId = spaceId;
        this.buildingFloors = buildingFloors;
        this.buildingExternalRegions = buildingExternalRegions;
        this.clientBuildingId = str;
        this.displayName = displayName;
        this.metadata = str2;
        for (Floor floor : buildingFloors) {
            if (Intrinsics.c(floor.getId(), this.buildingPrimaryFloorId)) {
                this.buildingPrimaryFloor = floor;
                boolean z2 = true;
                if (!z && this.buildingFloors.size() != 1) {
                    z2 = false;
                }
                this.isFloorDetectionSupported = z2;
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Building other) {
        Intrinsics.h(other, "other");
        return getId().compareTo(other.getId());
    }

    public /* synthetic */ Building(String str, String str2, double d, WorldCoordinate worldCoordinate, WorldCoordinate worldCoordinate2, double d2, String str3, String str4, List list, List list2, boolean z, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, worldCoordinate, worldCoordinate2, d2, str3, str4, list, list2, z, str5, str6, (i & 8192) != 0 ? null : str7, null);
    }
}
