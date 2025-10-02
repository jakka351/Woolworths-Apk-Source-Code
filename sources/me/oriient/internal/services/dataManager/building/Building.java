package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import me.oriient.internal.services.dataManager.common.WorldCoordinate$$serializer;
import me.oriient.internal.services.dataManager.utils.CoordinatesConverterKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0002\\]B»\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dB\u0099\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001eJ\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011HÆ\u0003J\t\u00108\u001a\u00020\u0015HÆ\u0003J\t\u00109\u001a\u00020\u0015HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0015HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\u000fHÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011HÆ\u0003J\u0016\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020\fJ\u000e\u0010F\u001a\u00020\t2\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\tJ¹\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010N\u001a\u00020\u00152\b\u0010O\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010P\u001a\u0004\u0018\u00010\u000f2\u0006\u0010Q\u001a\u00020\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010R\u001a\u00020\u0003H\u0016J\t\u0010S\u001a\u00020\u0005HÖ\u0001J&\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZHÁ\u0001¢\u0006\u0002\b[R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0019\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010+R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010/R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u0016\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+¨\u0006^"}, d2 = {"Lme/oriient/internal/services/dataManager/building/Building;", "", "seen1", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "spaceId", "buildingOrigin", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "geofenceOrigin", "geofenceRadiusMeters", "", "rotationToEnu", "primaryFloor", "Lme/oriient/internal/services/dataManager/building/Floor;", "floors", "", "externalRegions", "Lme/oriient/internal/services/dataManager/building/ExternalRegion;", "isFloorDetectionSupported", "", "strictModeEnabled", "clientBuildingId", "displayName", "gpsFusion", "metadata", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/WorldCoordinate;Lme/oriient/internal/services/dataManager/common/WorldCoordinate;DDLme/oriient/internal/services/dataManager/building/Floor;Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/WorldCoordinate;Lme/oriient/internal/services/dataManager/common/WorldCoordinate;DDLme/oriient/internal/services/dataManager/building/Floor;Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getBuildingOrigin", "()Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "getClientBuildingId", "()Ljava/lang/String;", "getDisplayName", "getExternalRegions", "()Ljava/util/List;", "getFloors", "getGeofenceOrigin", "getGeofenceRadiusMeters", "()D", "getGpsFusion", "()Z", "getId", "getMetadata", "setMetadata", "(Ljava/lang/String;)V", "getName", "getPrimaryFloor", "()Lme/oriient/internal/services/dataManager/building/Floor;", "getRotationToEnu", "getSpaceId", "getStrictModeEnabled", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "convertToGlobal", "x", "y", "indoorCoordinate", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "convertToIndoor", "coordinate", "copy", "equals", "other", "getFloor", "order", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class Building {

    @NotNull
    private final WorldCoordinate buildingOrigin;

    @Nullable
    private final String clientBuildingId;

    @NotNull
    private final String displayName;

    @NotNull
    private final List<ExternalRegion> externalRegions;

    @NotNull
    private final List<Floor> floors;

    @NotNull
    private final WorldCoordinate geofenceOrigin;
    private final double geofenceRadiusMeters;
    private final boolean gpsFusion;

    @NotNull
    private final String id;
    private final boolean isFloorDetectionSupported;

    @Nullable
    private String metadata;

    @NotNull
    private final String name;

    @NotNull
    private final Floor primaryFloor;
    private final double rotationToEnu;

    @NotNull
    private final String spaceId;
    private final boolean strictModeEnabled;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(Floor$$serializer.INSTANCE), new ArrayListSerializer(ExternalRegion$$serializer.INSTANCE), null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/Building$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/Building;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<Building> serializer() {
            return Building$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ Building(int i, String str, String str2, String str3, WorldCoordinate worldCoordinate, WorldCoordinate worldCoordinate2, double d, double d2, Floor floor, List list, List list2, boolean z, boolean z2, String str4, String str5, boolean z3, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (28671 != (i & 28671)) {
            PluginExceptionsKt.a(i, 28671, Building$$serializer.INSTANCE.getB());
            throw null;
        }
        this.id = str;
        this.name = str2;
        this.spaceId = str3;
        this.buildingOrigin = worldCoordinate;
        this.geofenceOrigin = worldCoordinate2;
        this.geofenceRadiusMeters = d;
        this.rotationToEnu = d2;
        this.primaryFloor = floor;
        this.floors = list;
        this.externalRegions = list2;
        this.isFloorDetectionSupported = z;
        this.strictModeEnabled = z2;
        if ((i & 4096) == 0) {
            this.clientBuildingId = null;
        } else {
            this.clientBuildingId = str4;
        }
        this.displayName = str5;
        this.gpsFusion = z3;
        if ((i & 32768) == 0) {
            this.metadata = null;
        } else {
            this.metadata = str6;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(Building self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.id);
        output.p(serialDesc, 1, self.name);
        output.p(serialDesc, 2, self.spaceId);
        WorldCoordinate$$serializer worldCoordinate$$serializer = WorldCoordinate$$serializer.INSTANCE;
        output.F(serialDesc, 3, worldCoordinate$$serializer, self.buildingOrigin);
        output.F(serialDesc, 4, worldCoordinate$$serializer, self.geofenceOrigin);
        output.G(serialDesc, 5, self.geofenceRadiusMeters);
        output.G(serialDesc, 6, self.rotationToEnu);
        output.F(serialDesc, 7, Floor$$serializer.INSTANCE, self.primaryFloor);
        output.F(serialDesc, 8, kSerializerArr[8], self.floors);
        output.F(serialDesc, 9, kSerializerArr[9], self.externalRegions);
        output.o(serialDesc, 10, self.isFloorDetectionSupported);
        output.o(serialDesc, 11, self.strictModeEnabled);
        if (output.q(serialDesc, 12) || self.clientBuildingId != null) {
            output.w(serialDesc, 12, StringSerializer.f24821a, self.clientBuildingId);
        }
        output.p(serialDesc, 13, self.displayName);
        output.o(serialDesc, 14, self.gpsFusion);
        if (!output.q(serialDesc, 15) && self.metadata == null) {
            return;
        }
        output.w(serialDesc, 15, StringSerializer.f24821a, self.metadata);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<ExternalRegion> component10() {
        return this.externalRegions;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsFloorDetectionSupported() {
        return this.isFloorDetectionSupported;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getStrictModeEnabled() {
        return this.strictModeEnabled;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getClientBuildingId() {
        return this.clientBuildingId;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getGpsFusion() {
        return this.gpsFusion;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
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
    public final double getGeofenceRadiusMeters() {
        return this.geofenceRadiusMeters;
    }

    /* renamed from: component7, reason: from getter */
    public final double getRotationToEnu() {
        return this.rotationToEnu;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Floor getPrimaryFloor() {
        return this.primaryFloor;
    }

    @NotNull
    public final List<Floor> component9() {
        return this.floors;
    }

    @NotNull
    public final WorldCoordinate convertToGlobal(@NotNull IndoorCoordinate indoorCoordinate) {
        Intrinsics.h(indoorCoordinate, "indoorCoordinate");
        return CoordinatesConverterKt.convertBuildingCoordinateToGlobal(indoorCoordinate, this.buildingOrigin, this.rotationToEnu);
    }

    @NotNull
    public final IndoorCoordinate convertToIndoor(@NotNull WorldCoordinate coordinate) {
        Intrinsics.h(coordinate, "coordinate");
        return CoordinatesConverterKt.convertGlobalCoordinateToBuilding(coordinate, coordinate, this.rotationToEnu);
    }

    @NotNull
    public final Building copy(@NotNull String id, @NotNull String name, @NotNull String spaceId, @NotNull WorldCoordinate buildingOrigin, @NotNull WorldCoordinate geofenceOrigin, double geofenceRadiusMeters, double rotationToEnu, @NotNull Floor primaryFloor, @NotNull List<Floor> floors, @NotNull List<ExternalRegion> externalRegions, boolean isFloorDetectionSupported, boolean strictModeEnabled, @Nullable String clientBuildingId, @NotNull String displayName, boolean gpsFusion, @Nullable String metadata) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloor, "primaryFloor");
        Intrinsics.h(floors, "floors");
        Intrinsics.h(externalRegions, "externalRegions");
        Intrinsics.h(displayName, "displayName");
        return new Building(id, name, spaceId, buildingOrigin, geofenceOrigin, geofenceRadiusMeters, rotationToEnu, primaryFloor, floors, externalRegions, isFloorDetectionSupported, strictModeEnabled, clientBuildingId, displayName, gpsFusion, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Building) && Intrinsics.c(this.id, ((Building) other).id);
    }

    @NotNull
    public final WorldCoordinate getBuildingOrigin() {
        return this.buildingOrigin;
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
    public final List<ExternalRegion> getExternalRegions() {
        return this.externalRegions;
    }

    @Nullable
    public final Floor getFloor(int order) {
        Object next;
        Iterator<T> it = this.floors.iterator();
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
        return (Floor) next;
    }

    @NotNull
    public final List<Floor> getFloors() {
        return this.floors;
    }

    @NotNull
    public final WorldCoordinate getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    public final double getGeofenceRadiusMeters() {
        return this.geofenceRadiusMeters;
    }

    public final boolean getGpsFusion() {
        return this.gpsFusion;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Floor getPrimaryFloor() {
        return this.primaryFloor;
    }

    public final double getRotationToEnu() {
        return this.rotationToEnu;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    public final boolean getStrictModeEnabled() {
        return this.strictModeEnabled;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final boolean isFloorDetectionSupported() {
        return this.isFloorDetectionSupported;
    }

    public final void setMetadata(@Nullable String str) {
        this.metadata = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Building(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", spaceId=");
        sb.append(this.spaceId);
        sb.append(", buildingOrigin=");
        sb.append(this.buildingOrigin);
        sb.append(", geofenceOrigin=");
        sb.append(this.geofenceOrigin);
        sb.append(", geofenceRadiusMeters=");
        sb.append(this.geofenceRadiusMeters);
        sb.append(", rotationToEnu=");
        sb.append(this.rotationToEnu);
        sb.append(", primaryFloor=");
        sb.append(this.primaryFloor);
        sb.append(", floors=");
        sb.append(this.floors);
        sb.append(", externalRegions=");
        sb.append(this.externalRegions);
        sb.append(", isFloorDetectionSupported=");
        sb.append(this.isFloorDetectionSupported);
        sb.append(", strictModeEnabled=");
        sb.append(this.strictModeEnabled);
        sb.append(", clientBuildingId=");
        sb.append(this.clientBuildingId);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", gpsFusion=");
        sb.append(this.gpsFusion);
        sb.append(", metadata=");
        return androidx.camera.core.impl.b.r(sb, this.metadata, ')');
    }

    @Nullable
    public final Floor getFloor(@NotNull String id) {
        Object next;
        Intrinsics.h(id, "id");
        Iterator<T> it = this.floors.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((Floor) next).getId(), id)) {
                break;
            }
        }
        return (Floor) next;
    }

    @NotNull
    public final WorldCoordinate convertToGlobal(double x, double y) {
        return convertToGlobal(new IndoorCoordinate(x, y, 0.0d));
    }

    public Building(@NotNull String id, @NotNull String name, @NotNull String spaceId, @NotNull WorldCoordinate buildingOrigin, @NotNull WorldCoordinate geofenceOrigin, double d, double d2, @NotNull Floor primaryFloor, @NotNull List<Floor> floors, @NotNull List<ExternalRegion> externalRegions, boolean z, boolean z2, @Nullable String str, @NotNull String displayName, boolean z3, @Nullable String str2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloor, "primaryFloor");
        Intrinsics.h(floors, "floors");
        Intrinsics.h(externalRegions, "externalRegions");
        Intrinsics.h(displayName, "displayName");
        this.id = id;
        this.name = name;
        this.spaceId = spaceId;
        this.buildingOrigin = buildingOrigin;
        this.geofenceOrigin = geofenceOrigin;
        this.geofenceRadiusMeters = d;
        this.rotationToEnu = d2;
        this.primaryFloor = primaryFloor;
        this.floors = floors;
        this.externalRegions = externalRegions;
        this.isFloorDetectionSupported = z;
        this.strictModeEnabled = z2;
        this.clientBuildingId = str;
        this.displayName = displayName;
        this.gpsFusion = z3;
        this.metadata = str2;
    }

    public /* synthetic */ Building(String str, String str2, String str3, WorldCoordinate worldCoordinate, WorldCoordinate worldCoordinate2, double d, double d2, Floor floor, List list, List list2, boolean z, boolean z2, String str4, String str5, boolean z3, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, worldCoordinate, worldCoordinate2, d, d2, floor, list, list2, z, z2, (i & 4096) != 0 ? null : str4, str5, z3, (i & 32768) != 0 ? null : str6);
    }
}
