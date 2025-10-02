package me.oriient.positioningengine.ondevice.mappingData;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.medallia.digital.mobilesdk.l3;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.ShortSerializer;
import me.oriient.internal.services.dataManager.mapGrid.MapGridRecord;
import me.oriient.internal.services.dataManager.utils.MatLabArray;
import me.oriient.internal.services.dataManager.utils.MatlabTwoLevelArray;
import me.oriient.positioningengine.common.models.IndoorCoordinate;
import me.oriient.positioningengine.common.models.WorldCoordinate;
import me.oriient.positioningengine.common.x;
import me.oriient.positioningengine.common.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData;", "", "()V", "Building", "FloorFullData", "Map", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MappingData {

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building;", "", "buildingInfo", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo;", "floorTransitions", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions;", "(Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions;)V", "getBuildingInfo", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo;", "getFloorTransitions", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BuildingInfo", "FloorTransitions", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Building {

        @NotNull
        private final BuildingInfo buildingInfo;

        @NotNull
        private final FloorTransitions floorTransitions;

        @Keep
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJz\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0015J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b4\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b5\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b6\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010!R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b;\u0010\u001f¨\u0006?"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo;", "Ljava/io/Serializable;", "", "buildingId", "buildingName", "", "buildingToEnuRotation", "Lme/oriient/positioningengine/common/models/WorldCoordinate;", "geofenceOrigin", "geofenceRadius", "buildingOrigin", "primaryFloorId", "", "strictModeEnabled", "", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;", "floors", "gpsFusion", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLme/oriient/positioningengine/common/models/WorldCoordinate;DLme/oriient/positioningengine/common/models/WorldCoordinate;Ljava/lang/String;Z[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "()Lme/oriient/positioningengine/common/models/WorldCoordinate;", "component5", "component6", "component7", "component8", "()Z", "component9", "()[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;DLme/oriient/positioningengine/common/models/WorldCoordinate;DLme/oriient/positioningengine/common/models/WorldCoordinate;Ljava/lang/String;Z[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;Z)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBuildingId", "getBuildingName", "D", "getBuildingToEnuRotation", "Lme/oriient/positioningengine/common/models/WorldCoordinate;", "getGeofenceOrigin", "getGeofenceRadius", "getBuildingOrigin", "getPrimaryFloorId", "Z", "getStrictModeEnabled", "[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;", "getFloors", "getGpsFusion", "Companion", "me/oriient/positioningengine/ondevice/mappingData/a", "FloorMetadata", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BuildingInfo implements Serializable {

            @NotNull
            public static final a Companion = new a();
            private static final long serialVersionUID = 1;

            @NotNull
            private final String buildingId;

            @NotNull
            private final String buildingName;

            @NotNull
            private final WorldCoordinate buildingOrigin;
            private final double buildingToEnuRotation;

            @NotNull
            private final FloorMetadata[] floors;

            @NotNull
            private final WorldCoordinate geofenceOrigin;
            private final double geofenceRadius;
            private final boolean gpsFusion;

            @NotNull
            private final String primaryFloorId;
            private final boolean strictModeEnabled;

            @Keep
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u0011R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;", "Ljava/io/Serializable;", "", "floorId", "floorName", "", "floorIndex", "height", "", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata;", "maps", "<init>", "(Ljava/lang/String;Ljava/lang/String;DD[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "component5", "()[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata;", "copy", "(Ljava/lang/String;Ljava/lang/String;DD[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata;)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFloorId", "getFloorName", "D", "getFloorIndex", "getHeight", "[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata;", "getMaps", "defaultMapId", "getDefaultMapId", "setDefaultMapId", "(Ljava/lang/String;)V", "Companion", "me/oriient/positioningengine/ondevice/mappingData/b", "MapMetadata", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class FloorMetadata implements Serializable {

                @NotNull
                public static final b Companion = new b();
                private static final long serialVersionUID = 1;

                @NotNull
                private String defaultMapId;

                @NotNull
                private final String floorId;
                private final double floorIndex;

                @NotNull
                private final String floorName;
                private final double height;

                @NotNull
                private final MapMetadata[] maps;

                @Keep
                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006!"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata;", "Ljava/io/Serializable;", "", "mapId", "mapName", "", "Lme/oriient/positioningengine/common/models/IndoorCoordinate;", "points", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata$MapMetadata;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMapId", "getMapName", "Ljava/util/List;", "getPoints", "Companion", "me/oriient/positioningengine/ondevice/mappingData/c", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class MapMetadata implements Serializable {

                    @NotNull
                    public static final c Companion = new c();
                    private static final long serialVersionUID = 1;

                    @NotNull
                    private final String mapId;

                    @NotNull
                    private final String mapName;

                    @NotNull
                    private final List<IndoorCoordinate> points;

                    public MapMetadata(@NotNull String mapId, @NotNull String mapName, @NotNull List<IndoorCoordinate> points) {
                        Intrinsics.h(mapId, "mapId");
                        Intrinsics.h(mapName, "mapName");
                        Intrinsics.h(points, "points");
                        this.mapId = mapId;
                        this.mapName = mapName;
                        this.points = points;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ MapMetadata copy$default(MapMetadata mapMetadata, String str, String str2, List list, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = mapMetadata.mapId;
                        }
                        if ((i & 2) != 0) {
                            str2 = mapMetadata.mapName;
                        }
                        if ((i & 4) != 0) {
                            list = mapMetadata.points;
                        }
                        return mapMetadata.copy(str, str2, list);
                    }

                    @NotNull
                    /* renamed from: component1, reason: from getter */
                    public final String getMapId() {
                        return this.mapId;
                    }

                    @NotNull
                    /* renamed from: component2, reason: from getter */
                    public final String getMapName() {
                        return this.mapName;
                    }

                    @NotNull
                    public final List<IndoorCoordinate> component3() {
                        return this.points;
                    }

                    @NotNull
                    public final MapMetadata copy(@NotNull String mapId, @NotNull String mapName, @NotNull List<IndoorCoordinate> points) {
                        Intrinsics.h(mapId, "mapId");
                        Intrinsics.h(mapName, "mapName");
                        Intrinsics.h(points, "points");
                        return new MapMetadata(mapId, mapName, points);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof MapMetadata)) {
                            return false;
                        }
                        MapMetadata mapMetadata = (MapMetadata) other;
                        return Intrinsics.c(this.mapId, mapMetadata.mapId) && Intrinsics.c(this.mapName, mapMetadata.mapName) && Intrinsics.c(this.points, mapMetadata.points);
                    }

                    @NotNull
                    public final String getMapId() {
                        return this.mapId;
                    }

                    @NotNull
                    public final String getMapName() {
                        return this.mapName;
                    }

                    @NotNull
                    public final List<IndoorCoordinate> getPoints() {
                        return this.points;
                    }

                    public int hashCode() {
                        return this.points.hashCode() + z.a(this.mapName, this.mapId.hashCode() * 31, 31);
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder sb = new StringBuilder("MapMetadata(mapId=");
                        sb.append(this.mapId);
                        sb.append(", mapName=");
                        sb.append(this.mapName);
                        sb.append(", points=");
                        return androidx.compose.ui.input.pointer.a.o(sb, this.points, ')');
                    }
                }

                public FloorMetadata(@NotNull String floorId, @NotNull String floorName, double d, double d2, @NotNull MapMetadata[] maps) {
                    Intrinsics.h(floorId, "floorId");
                    Intrinsics.h(floorName, "floorName");
                    Intrinsics.h(maps, "maps");
                    this.floorId = floorId;
                    this.floorName = floorName;
                    this.floorIndex = d;
                    this.height = d2;
                    this.maps = maps;
                    this.defaultMapId = maps[0].getMapId();
                }

                public static /* synthetic */ FloorMetadata copy$default(FloorMetadata floorMetadata, String str, String str2, double d, double d2, MapMetadata[] mapMetadataArr, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = floorMetadata.floorId;
                    }
                    if ((i & 2) != 0) {
                        str2 = floorMetadata.floorName;
                    }
                    if ((i & 4) != 0) {
                        d = floorMetadata.floorIndex;
                    }
                    if ((i & 8) != 0) {
                        d2 = floorMetadata.height;
                    }
                    if ((i & 16) != 0) {
                        mapMetadataArr = floorMetadata.maps;
                    }
                    MapMetadata[] mapMetadataArr2 = mapMetadataArr;
                    double d3 = d2;
                    return floorMetadata.copy(str, str2, d, d3, mapMetadataArr2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getFloorId() {
                    return this.floorId;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getFloorName() {
                    return this.floorName;
                }

                /* renamed from: component3, reason: from getter */
                public final double getFloorIndex() {
                    return this.floorIndex;
                }

                /* renamed from: component4, reason: from getter */
                public final double getHeight() {
                    return this.height;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final MapMetadata[] getMaps() {
                    return this.maps;
                }

                @NotNull
                public final FloorMetadata copy(@NotNull String floorId, @NotNull String floorName, double floorIndex, double height, @NotNull MapMetadata[] maps) {
                    Intrinsics.h(floorId, "floorId");
                    Intrinsics.h(floorName, "floorName");
                    Intrinsics.h(maps, "maps");
                    return new FloorMetadata(floorId, floorName, floorIndex, height, maps);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FloorMetadata)) {
                        return false;
                    }
                    FloorMetadata floorMetadata = (FloorMetadata) other;
                    return Intrinsics.c(this.floorId, floorMetadata.floorId) && Intrinsics.c(this.floorName, floorMetadata.floorName) && Double.compare(this.floorIndex, floorMetadata.floorIndex) == 0 && Double.compare(this.height, floorMetadata.height) == 0 && Intrinsics.c(this.maps, floorMetadata.maps);
                }

                @NotNull
                public final String getDefaultMapId() {
                    return this.defaultMapId;
                }

                @NotNull
                public final String getFloorId() {
                    return this.floorId;
                }

                public final double getFloorIndex() {
                    return this.floorIndex;
                }

                @NotNull
                public final String getFloorName() {
                    return this.floorName;
                }

                public final double getHeight() {
                    return this.height;
                }

                @NotNull
                public final MapMetadata[] getMaps() {
                    return this.maps;
                }

                public int hashCode() {
                    return me.oriient.positioningengine.common.v.a(this.height, me.oriient.positioningengine.common.v.a(this.floorIndex, z.a(this.floorName, this.floorId.hashCode() * 31, 31), 31), 31) + Arrays.hashCode(this.maps);
                }

                public final void setDefaultMapId(@NotNull String str) {
                    Intrinsics.h(str, "<set-?>");
                    this.defaultMapId = str;
                }

                @NotNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("FloorMetadata(floorId=");
                    sb.append(this.floorId);
                    sb.append(", floorName=");
                    sb.append(this.floorName);
                    sb.append(", floorIndex=");
                    sb.append(this.floorIndex);
                    sb.append(", height=");
                    sb.append(this.height);
                    sb.append(", maps=");
                    return androidx.camera.core.impl.b.r(sb, Arrays.toString(this.maps), ')');
                }
            }

            public BuildingInfo(@NotNull String buildingId, @NotNull String buildingName, double d, @NotNull WorldCoordinate geofenceOrigin, double d2, @NotNull WorldCoordinate buildingOrigin, @NotNull String primaryFloorId, boolean z, @NotNull FloorMetadata[] floors, boolean z2) {
                Intrinsics.h(buildingId, "buildingId");
                Intrinsics.h(buildingName, "buildingName");
                Intrinsics.h(geofenceOrigin, "geofenceOrigin");
                Intrinsics.h(buildingOrigin, "buildingOrigin");
                Intrinsics.h(primaryFloorId, "primaryFloorId");
                Intrinsics.h(floors, "floors");
                this.buildingId = buildingId;
                this.buildingName = buildingName;
                this.buildingToEnuRotation = d;
                this.geofenceOrigin = geofenceOrigin;
                this.geofenceRadius = d2;
                this.buildingOrigin = buildingOrigin;
                this.primaryFloorId = primaryFloorId;
                this.strictModeEnabled = z;
                this.floors = floors;
                this.gpsFusion = z2;
            }

            public static /* synthetic */ BuildingInfo copy$default(BuildingInfo buildingInfo, String str, String str2, double d, WorldCoordinate worldCoordinate, double d2, WorldCoordinate worldCoordinate2, String str3, boolean z, FloorMetadata[] floorMetadataArr, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = buildingInfo.buildingId;
                }
                if ((i & 2) != 0) {
                    str2 = buildingInfo.buildingName;
                }
                if ((i & 4) != 0) {
                    d = buildingInfo.buildingToEnuRotation;
                }
                if ((i & 8) != 0) {
                    worldCoordinate = buildingInfo.geofenceOrigin;
                }
                if ((i & 16) != 0) {
                    d2 = buildingInfo.geofenceRadius;
                }
                if ((i & 32) != 0) {
                    worldCoordinate2 = buildingInfo.buildingOrigin;
                }
                if ((i & 64) != 0) {
                    str3 = buildingInfo.primaryFloorId;
                }
                if ((i & 128) != 0) {
                    z = buildingInfo.strictModeEnabled;
                }
                if ((i & 256) != 0) {
                    floorMetadataArr = buildingInfo.floors;
                }
                if ((i & 512) != 0) {
                    z2 = buildingInfo.gpsFusion;
                }
                boolean z3 = z2;
                boolean z4 = z;
                WorldCoordinate worldCoordinate3 = worldCoordinate2;
                WorldCoordinate worldCoordinate4 = worldCoordinate;
                double d3 = d;
                return buildingInfo.copy(str, str2, d3, worldCoordinate4, d2, worldCoordinate3, str3, z4, floorMetadataArr, z3);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getBuildingId() {
                return this.buildingId;
            }

            /* renamed from: component10, reason: from getter */
            public final boolean getGpsFusion() {
                return this.gpsFusion;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getBuildingName() {
                return this.buildingName;
            }

            /* renamed from: component3, reason: from getter */
            public final double getBuildingToEnuRotation() {
                return this.buildingToEnuRotation;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final WorldCoordinate getGeofenceOrigin() {
                return this.geofenceOrigin;
            }

            /* renamed from: component5, reason: from getter */
            public final double getGeofenceRadius() {
                return this.geofenceRadius;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final WorldCoordinate getBuildingOrigin() {
                return this.buildingOrigin;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getPrimaryFloorId() {
                return this.primaryFloorId;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getStrictModeEnabled() {
                return this.strictModeEnabled;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final FloorMetadata[] getFloors() {
                return this.floors;
            }

            @NotNull
            public final BuildingInfo copy(@NotNull String buildingId, @NotNull String buildingName, double buildingToEnuRotation, @NotNull WorldCoordinate geofenceOrigin, double geofenceRadius, @NotNull WorldCoordinate buildingOrigin, @NotNull String primaryFloorId, boolean strictModeEnabled, @NotNull FloorMetadata[] floors, boolean gpsFusion) {
                Intrinsics.h(buildingId, "buildingId");
                Intrinsics.h(buildingName, "buildingName");
                Intrinsics.h(geofenceOrigin, "geofenceOrigin");
                Intrinsics.h(buildingOrigin, "buildingOrigin");
                Intrinsics.h(primaryFloorId, "primaryFloorId");
                Intrinsics.h(floors, "floors");
                return new BuildingInfo(buildingId, buildingName, buildingToEnuRotation, geofenceOrigin, geofenceRadius, buildingOrigin, primaryFloorId, strictModeEnabled, floors, gpsFusion);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BuildingInfo)) {
                    return false;
                }
                BuildingInfo buildingInfo = (BuildingInfo) other;
                return Intrinsics.c(this.buildingId, buildingInfo.buildingId) && Intrinsics.c(this.buildingName, buildingInfo.buildingName) && Double.compare(this.buildingToEnuRotation, buildingInfo.buildingToEnuRotation) == 0 && Intrinsics.c(this.geofenceOrigin, buildingInfo.geofenceOrigin) && Double.compare(this.geofenceRadius, buildingInfo.geofenceRadius) == 0 && Intrinsics.c(this.buildingOrigin, buildingInfo.buildingOrigin) && Intrinsics.c(this.primaryFloorId, buildingInfo.primaryFloorId) && this.strictModeEnabled == buildingInfo.strictModeEnabled && Intrinsics.c(this.floors, buildingInfo.floors) && this.gpsFusion == buildingInfo.gpsFusion;
            }

            @NotNull
            public final String getBuildingId() {
                return this.buildingId;
            }

            @NotNull
            public final String getBuildingName() {
                return this.buildingName;
            }

            @NotNull
            public final WorldCoordinate getBuildingOrigin() {
                return this.buildingOrigin;
            }

            public final double getBuildingToEnuRotation() {
                return this.buildingToEnuRotation;
            }

            @NotNull
            public final FloorMetadata[] getFloors() {
                return this.floors;
            }

            @NotNull
            public final WorldCoordinate getGeofenceOrigin() {
                return this.geofenceOrigin;
            }

            public final double getGeofenceRadius() {
                return this.geofenceRadius;
            }

            public final boolean getGpsFusion() {
                return this.gpsFusion;
            }

            @NotNull
            public final String getPrimaryFloorId() {
                return this.primaryFloorId;
            }

            public final boolean getStrictModeEnabled() {
                return this.strictModeEnabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.gpsFusion) + ((x.a(this.strictModeEnabled, z.a(this.primaryFloorId, (this.buildingOrigin.hashCode() + me.oriient.positioningengine.common.v.a(this.geofenceRadius, (this.geofenceOrigin.hashCode() + me.oriient.positioningengine.common.v.a(this.buildingToEnuRotation, z.a(this.buildingName, this.buildingId.hashCode() * 31, 31), 31)) * 31, 31)) * 31, 31), 31) + Arrays.hashCode(this.floors)) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("BuildingInfo(buildingId=");
                sb.append(this.buildingId);
                sb.append(", buildingName=");
                sb.append(this.buildingName);
                sb.append(", buildingToEnuRotation=");
                sb.append(this.buildingToEnuRotation);
                sb.append(", geofenceOrigin=");
                sb.append(this.geofenceOrigin);
                sb.append(", geofenceRadius=");
                sb.append(this.geofenceRadius);
                sb.append(", buildingOrigin=");
                sb.append(this.buildingOrigin);
                sb.append(", primaryFloorId=");
                sb.append(this.primaryFloorId);
                sb.append(", strictModeEnabled=");
                sb.append(this.strictModeEnabled);
                sb.append(", floors=");
                sb.append(Arrays.toString(this.floors));
                sb.append(", gpsFusion=");
                return androidx.camera.core.impl.b.s(sb, this.gpsFusion, ')');
            }
        }

        @Keep
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001f !B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f¨\u0006\""}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions;", "Ljava/io/Serializable;", "", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$TwoPoints;", "twoPoints", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$SinglePoint;", "singlePoint", "<init>", "([Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$TwoPoints;[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$SinglePoint;)V", "component1", "()[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$TwoPoints;", "component2", "()[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$SinglePoint;", "copy", "([Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$TwoPoints;[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$SinglePoint;)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$TwoPoints;", "getTwoPoints", "[Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$SinglePoint;", "getSinglePoint", "Companion", "me/oriient/positioningengine/ondevice/mappingData/d", "SinglePoint", "TwoPoints", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FloorTransitions implements Serializable {

            @NotNull
            public static final d Companion = new d();
            private static final long serialVersionUID = 1;

            @NotNull
            private final SinglePoint[] singlePoint;

            @NotNull
            private final TwoPoints[] twoPoints;

            @Keep
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001-B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JR\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010\u000fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017¨\u0006."}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$SinglePoint;", "Ljava/io/Serializable;", "", "transitionId", "transitionName", "Lme/oriient/positioningengine/common/models/IndoorCoordinate;", "coordinates", "", "accessible", "type", "", "floorIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/positioningengine/common/models/IndoorCoordinate;ZLjava/lang/String;[Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lme/oriient/positioningengine/common/models/IndoorCoordinate;", "component4", "()Z", "component5", "component6", "()[Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/positioningengine/common/models/IndoorCoordinate;ZLjava/lang/String;[Ljava/lang/String;)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$SinglePoint;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTransitionId", "getTransitionName", "Lme/oriient/positioningengine/common/models/IndoorCoordinate;", "getCoordinates", "Z", "getAccessible", "getType", "[Ljava/lang/String;", "getFloorIds", "Companion", "me/oriient/positioningengine/ondevice/mappingData/e", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class SinglePoint implements Serializable {

                @NotNull
                public static final e Companion = new e();
                private static final long serialVersionUID = 1;
                private final boolean accessible;

                @NotNull
                private final IndoorCoordinate coordinates;

                @NotNull
                private final String[] floorIds;

                @NotNull
                private final String transitionId;

                @NotNull
                private final String transitionName;

                @NotNull
                private final String type;

                public SinglePoint(@NotNull String transitionId, @NotNull String transitionName, @NotNull IndoorCoordinate coordinates, boolean z, @NotNull String type, @NotNull String[] floorIds) {
                    Intrinsics.h(transitionId, "transitionId");
                    Intrinsics.h(transitionName, "transitionName");
                    Intrinsics.h(coordinates, "coordinates");
                    Intrinsics.h(type, "type");
                    Intrinsics.h(floorIds, "floorIds");
                    this.transitionId = transitionId;
                    this.transitionName = transitionName;
                    this.coordinates = coordinates;
                    this.accessible = z;
                    this.type = type;
                    this.floorIds = floorIds;
                }

                public static /* synthetic */ SinglePoint copy$default(SinglePoint singlePoint, String str, String str2, IndoorCoordinate indoorCoordinate, boolean z, String str3, String[] strArr, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = singlePoint.transitionId;
                    }
                    if ((i & 2) != 0) {
                        str2 = singlePoint.transitionName;
                    }
                    if ((i & 4) != 0) {
                        indoorCoordinate = singlePoint.coordinates;
                    }
                    if ((i & 8) != 0) {
                        z = singlePoint.accessible;
                    }
                    if ((i & 16) != 0) {
                        str3 = singlePoint.type;
                    }
                    if ((i & 32) != 0) {
                        strArr = singlePoint.floorIds;
                    }
                    String str4 = str3;
                    String[] strArr2 = strArr;
                    return singlePoint.copy(str, str2, indoorCoordinate, z, str4, strArr2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getTransitionId() {
                    return this.transitionId;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getTransitionName() {
                    return this.transitionName;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final IndoorCoordinate getCoordinates() {
                    return this.coordinates;
                }

                /* renamed from: component4, reason: from getter */
                public final boolean getAccessible() {
                    return this.accessible;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                @NotNull
                /* renamed from: component6, reason: from getter */
                public final String[] getFloorIds() {
                    return this.floorIds;
                }

                @NotNull
                public final SinglePoint copy(@NotNull String transitionId, @NotNull String transitionName, @NotNull IndoorCoordinate coordinates, boolean accessible, @NotNull String type, @NotNull String[] floorIds) {
                    Intrinsics.h(transitionId, "transitionId");
                    Intrinsics.h(transitionName, "transitionName");
                    Intrinsics.h(coordinates, "coordinates");
                    Intrinsics.h(type, "type");
                    Intrinsics.h(floorIds, "floorIds");
                    return new SinglePoint(transitionId, transitionName, coordinates, accessible, type, floorIds);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SinglePoint)) {
                        return false;
                    }
                    SinglePoint singlePoint = (SinglePoint) other;
                    return Intrinsics.c(this.transitionId, singlePoint.transitionId) && Intrinsics.c(this.transitionName, singlePoint.transitionName) && Intrinsics.c(this.coordinates, singlePoint.coordinates) && this.accessible == singlePoint.accessible && Intrinsics.c(this.type, singlePoint.type) && Intrinsics.c(this.floorIds, singlePoint.floorIds);
                }

                public final boolean getAccessible() {
                    return this.accessible;
                }

                @NotNull
                public final IndoorCoordinate getCoordinates() {
                    return this.coordinates;
                }

                @NotNull
                public final String[] getFloorIds() {
                    return this.floorIds;
                }

                @NotNull
                public final String getTransitionId() {
                    return this.transitionId;
                }

                @NotNull
                public final String getTransitionName() {
                    return this.transitionName;
                }

                @NotNull
                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    return z.a(this.type, x.a(this.accessible, (this.coordinates.hashCode() + z.a(this.transitionName, this.transitionId.hashCode() * 31, 31)) * 31, 31), 31) + Arrays.hashCode(this.floorIds);
                }

                @NotNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("SinglePoint(transitionId=");
                    sb.append(this.transitionId);
                    sb.append(", transitionName=");
                    sb.append(this.transitionName);
                    sb.append(", coordinates=");
                    sb.append(this.coordinates);
                    sb.append(", accessible=");
                    sb.append(this.accessible);
                    sb.append(", type=");
                    sb.append(this.type);
                    sb.append(", floorIds=");
                    return androidx.camera.core.impl.b.r(sb, Arrays.toString(this.floorIds), ')');
                }
            }

            @Keep
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00013BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jj\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b0\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b1\u0010\u0011¨\u00064"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$TwoPoints;", "Ljava/io/Serializable;", "", "transitionId", "transitionName", "firstPointFloorId", "Lme/oriient/positioningengine/common/models/IndoorCoordinate;", "firstPointCoordinates", "secondPointFloorId", "secondPointCoordinates", "", "directed", "accessible", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/positioningengine/common/models/IndoorCoordinate;Ljava/lang/String;Lme/oriient/positioningengine/common/models/IndoorCoordinate;ZZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lme/oriient/positioningengine/common/models/IndoorCoordinate;", "component5", "component6", "component7", "()Z", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/positioningengine/common/models/IndoorCoordinate;Ljava/lang/String;Lme/oriient/positioningengine/common/models/IndoorCoordinate;ZZLjava/lang/String;)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$FloorTransitions$TwoPoints;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTransitionId", "getTransitionName", "getFirstPointFloorId", "Lme/oriient/positioningengine/common/models/IndoorCoordinate;", "getFirstPointCoordinates", "getSecondPointFloorId", "getSecondPointCoordinates", "Z", "getDirected", "getAccessible", "getType", "Companion", "me/oriient/positioningengine/ondevice/mappingData/f", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class TwoPoints implements Serializable {

                @NotNull
                public static final f Companion = new f();
                private static final long serialVersionUID = 1;
                private final boolean accessible;
                private final boolean directed;

                @NotNull
                private final IndoorCoordinate firstPointCoordinates;

                @NotNull
                private final String firstPointFloorId;

                @NotNull
                private final IndoorCoordinate secondPointCoordinates;

                @NotNull
                private final String secondPointFloorId;

                @NotNull
                private final String transitionId;

                @NotNull
                private final String transitionName;

                @NotNull
                private final String type;

                public TwoPoints(@NotNull String transitionId, @NotNull String transitionName, @NotNull String firstPointFloorId, @NotNull IndoorCoordinate firstPointCoordinates, @NotNull String secondPointFloorId, @NotNull IndoorCoordinate secondPointCoordinates, boolean z, boolean z2, @NotNull String type) {
                    Intrinsics.h(transitionId, "transitionId");
                    Intrinsics.h(transitionName, "transitionName");
                    Intrinsics.h(firstPointFloorId, "firstPointFloorId");
                    Intrinsics.h(firstPointCoordinates, "firstPointCoordinates");
                    Intrinsics.h(secondPointFloorId, "secondPointFloorId");
                    Intrinsics.h(secondPointCoordinates, "secondPointCoordinates");
                    Intrinsics.h(type, "type");
                    this.transitionId = transitionId;
                    this.transitionName = transitionName;
                    this.firstPointFloorId = firstPointFloorId;
                    this.firstPointCoordinates = firstPointCoordinates;
                    this.secondPointFloorId = secondPointFloorId;
                    this.secondPointCoordinates = secondPointCoordinates;
                    this.directed = z;
                    this.accessible = z2;
                    this.type = type;
                }

                public static /* synthetic */ TwoPoints copy$default(TwoPoints twoPoints, String str, String str2, String str3, IndoorCoordinate indoorCoordinate, String str4, IndoorCoordinate indoorCoordinate2, boolean z, boolean z2, String str5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = twoPoints.transitionId;
                    }
                    if ((i & 2) != 0) {
                        str2 = twoPoints.transitionName;
                    }
                    if ((i & 4) != 0) {
                        str3 = twoPoints.firstPointFloorId;
                    }
                    if ((i & 8) != 0) {
                        indoorCoordinate = twoPoints.firstPointCoordinates;
                    }
                    if ((i & 16) != 0) {
                        str4 = twoPoints.secondPointFloorId;
                    }
                    if ((i & 32) != 0) {
                        indoorCoordinate2 = twoPoints.secondPointCoordinates;
                    }
                    if ((i & 64) != 0) {
                        z = twoPoints.directed;
                    }
                    if ((i & 128) != 0) {
                        z2 = twoPoints.accessible;
                    }
                    if ((i & 256) != 0) {
                        str5 = twoPoints.type;
                    }
                    boolean z3 = z2;
                    String str6 = str5;
                    IndoorCoordinate indoorCoordinate3 = indoorCoordinate2;
                    boolean z4 = z;
                    String str7 = str4;
                    String str8 = str3;
                    return twoPoints.copy(str, str2, str8, indoorCoordinate, str7, indoorCoordinate3, z4, z3, str6);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getTransitionId() {
                    return this.transitionId;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getTransitionName() {
                    return this.transitionName;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final String getFirstPointFloorId() {
                    return this.firstPointFloorId;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final IndoorCoordinate getFirstPointCoordinates() {
                    return this.firstPointCoordinates;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final String getSecondPointFloorId() {
                    return this.secondPointFloorId;
                }

                @NotNull
                /* renamed from: component6, reason: from getter */
                public final IndoorCoordinate getSecondPointCoordinates() {
                    return this.secondPointCoordinates;
                }

                /* renamed from: component7, reason: from getter */
                public final boolean getDirected() {
                    return this.directed;
                }

                /* renamed from: component8, reason: from getter */
                public final boolean getAccessible() {
                    return this.accessible;
                }

                @NotNull
                /* renamed from: component9, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                @NotNull
                public final TwoPoints copy(@NotNull String transitionId, @NotNull String transitionName, @NotNull String firstPointFloorId, @NotNull IndoorCoordinate firstPointCoordinates, @NotNull String secondPointFloorId, @NotNull IndoorCoordinate secondPointCoordinates, boolean directed, boolean accessible, @NotNull String type) {
                    Intrinsics.h(transitionId, "transitionId");
                    Intrinsics.h(transitionName, "transitionName");
                    Intrinsics.h(firstPointFloorId, "firstPointFloorId");
                    Intrinsics.h(firstPointCoordinates, "firstPointCoordinates");
                    Intrinsics.h(secondPointFloorId, "secondPointFloorId");
                    Intrinsics.h(secondPointCoordinates, "secondPointCoordinates");
                    Intrinsics.h(type, "type");
                    return new TwoPoints(transitionId, transitionName, firstPointFloorId, firstPointCoordinates, secondPointFloorId, secondPointCoordinates, directed, accessible, type);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TwoPoints)) {
                        return false;
                    }
                    TwoPoints twoPoints = (TwoPoints) other;
                    return Intrinsics.c(this.transitionId, twoPoints.transitionId) && Intrinsics.c(this.transitionName, twoPoints.transitionName) && Intrinsics.c(this.firstPointFloorId, twoPoints.firstPointFloorId) && Intrinsics.c(this.firstPointCoordinates, twoPoints.firstPointCoordinates) && Intrinsics.c(this.secondPointFloorId, twoPoints.secondPointFloorId) && Intrinsics.c(this.secondPointCoordinates, twoPoints.secondPointCoordinates) && this.directed == twoPoints.directed && this.accessible == twoPoints.accessible && Intrinsics.c(this.type, twoPoints.type);
                }

                public final boolean getAccessible() {
                    return this.accessible;
                }

                public final boolean getDirected() {
                    return this.directed;
                }

                @NotNull
                public final IndoorCoordinate getFirstPointCoordinates() {
                    return this.firstPointCoordinates;
                }

                @NotNull
                public final String getFirstPointFloorId() {
                    return this.firstPointFloorId;
                }

                @NotNull
                public final IndoorCoordinate getSecondPointCoordinates() {
                    return this.secondPointCoordinates;
                }

                @NotNull
                public final String getSecondPointFloorId() {
                    return this.secondPointFloorId;
                }

                @NotNull
                public final String getTransitionId() {
                    return this.transitionId;
                }

                @NotNull
                public final String getTransitionName() {
                    return this.transitionName;
                }

                @NotNull
                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    return this.type.hashCode() + x.a(this.accessible, x.a(this.directed, (this.secondPointCoordinates.hashCode() + z.a(this.secondPointFloorId, (this.firstPointCoordinates.hashCode() + z.a(this.firstPointFloorId, z.a(this.transitionName, this.transitionId.hashCode() * 31, 31), 31)) * 31, 31)) * 31, 31), 31);
                }

                @NotNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("TwoPoints(transitionId=");
                    sb.append(this.transitionId);
                    sb.append(", transitionName=");
                    sb.append(this.transitionName);
                    sb.append(", firstPointFloorId=");
                    sb.append(this.firstPointFloorId);
                    sb.append(", firstPointCoordinates=");
                    sb.append(this.firstPointCoordinates);
                    sb.append(", secondPointFloorId=");
                    sb.append(this.secondPointFloorId);
                    sb.append(", secondPointCoordinates=");
                    sb.append(this.secondPointCoordinates);
                    sb.append(", directed=");
                    sb.append(this.directed);
                    sb.append(", accessible=");
                    sb.append(this.accessible);
                    sb.append(", type=");
                    return androidx.camera.core.impl.b.r(sb, this.type, ')');
                }
            }

            public FloorTransitions(@NotNull TwoPoints[] twoPoints, @NotNull SinglePoint[] singlePoint) {
                Intrinsics.h(twoPoints, "twoPoints");
                Intrinsics.h(singlePoint, "singlePoint");
                this.twoPoints = twoPoints;
                this.singlePoint = singlePoint;
            }

            public static /* synthetic */ FloorTransitions copy$default(FloorTransitions floorTransitions, TwoPoints[] twoPointsArr, SinglePoint[] singlePointArr, int i, Object obj) {
                if ((i & 1) != 0) {
                    twoPointsArr = floorTransitions.twoPoints;
                }
                if ((i & 2) != 0) {
                    singlePointArr = floorTransitions.singlePoint;
                }
                return floorTransitions.copy(twoPointsArr, singlePointArr);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TwoPoints[] getTwoPoints() {
                return this.twoPoints;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final SinglePoint[] getSinglePoint() {
                return this.singlePoint;
            }

            @NotNull
            public final FloorTransitions copy(@NotNull TwoPoints[] twoPoints, @NotNull SinglePoint[] singlePoint) {
                Intrinsics.h(twoPoints, "twoPoints");
                Intrinsics.h(singlePoint, "singlePoint");
                return new FloorTransitions(twoPoints, singlePoint);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FloorTransitions)) {
                    return false;
                }
                FloorTransitions floorTransitions = (FloorTransitions) other;
                return Intrinsics.c(this.twoPoints, floorTransitions.twoPoints) && Intrinsics.c(this.singlePoint, floorTransitions.singlePoint);
            }

            @NotNull
            public final SinglePoint[] getSinglePoint() {
                return this.singlePoint;
            }

            @NotNull
            public final TwoPoints[] getTwoPoints() {
                return this.twoPoints;
            }

            public int hashCode() {
                return (Arrays.hashCode(this.twoPoints) * 31) + Arrays.hashCode(this.singlePoint);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("FloorTransitions(twoPoints=");
                sb.append(Arrays.toString(this.twoPoints));
                sb.append(", singlePoint=");
                return androidx.camera.core.impl.b.r(sb, Arrays.toString(this.singlePoint), ')');
            }
        }

        public Building(@NotNull BuildingInfo buildingInfo, @NotNull FloorTransitions floorTransitions) {
            Intrinsics.h(buildingInfo, "buildingInfo");
            Intrinsics.h(floorTransitions, "floorTransitions");
            this.buildingInfo = buildingInfo;
            this.floorTransitions = floorTransitions;
        }

        public static /* synthetic */ Building copy$default(Building building, BuildingInfo buildingInfo, FloorTransitions floorTransitions, int i, Object obj) {
            if ((i & 1) != 0) {
                buildingInfo = building.buildingInfo;
            }
            if ((i & 2) != 0) {
                floorTransitions = building.floorTransitions;
            }
            return building.copy(buildingInfo, floorTransitions);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BuildingInfo getBuildingInfo() {
            return this.buildingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final FloorTransitions getFloorTransitions() {
            return this.floorTransitions;
        }

        @NotNull
        public final Building copy(@NotNull BuildingInfo buildingInfo, @NotNull FloorTransitions floorTransitions) {
            Intrinsics.h(buildingInfo, "buildingInfo");
            Intrinsics.h(floorTransitions, "floorTransitions");
            return new Building(buildingInfo, floorTransitions);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Building)) {
                return false;
            }
            Building building = (Building) other;
            return Intrinsics.c(this.buildingInfo, building.buildingInfo) && Intrinsics.c(this.floorTransitions, building.floorTransitions);
        }

        @NotNull
        public final BuildingInfo getBuildingInfo() {
            return this.buildingInfo;
        }

        @NotNull
        public final FloorTransitions getFloorTransitions() {
            return this.floorTransitions;
        }

        public int hashCode() {
            return this.floorTransitions.hashCode() + (this.buildingInfo.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Building(buildingInfo=" + this.buildingInfo + ", floorTransitions=" + this.floorTransitions + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData;", "", "metadata", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;", "obstacles", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$Obstacles;", "restrictedAreas", "", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$RestrictedArea;", "(Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$Obstacles;Ljava/util/List;)V", "getMetadata", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Building$BuildingInfo$FloorMetadata;", "getObstacles", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$Obstacles;", "getRestrictedAreas", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Obstacles", "RestrictedArea", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FloorFullData {

        @NotNull
        private final Building.BuildingInfo.FloorMetadata metadata;

        @NotNull
        private final Obstacles obstacles;

        @NotNull
        private final List<RestrictedArea> restrictedAreas;

        @Keep
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JZ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010\u0010R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b%\u0010\u0010¨\u0006)"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$Obstacles;", "Ljava/io/Serializable;", "", "mapVersion", "Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "", "pR", "pCenter", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$Obstacles$Polygon;", "poly", "box", "<init>", "(ILme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;)V", "component1", "()I", "component2", "()Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "component3", "component4", "component5", "copy", "(ILme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$Obstacles;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMapVersion", "Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "getPR", "getPCenter", "getPoly", "getBox", "Companion", "me/oriient/positioningengine/ondevice/mappingData/g", "Polygon", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Obstacles implements Serializable {

            @NotNull
            public static final g Companion = new g();
            private static final long serialVersionUID = 1;

            @NotNull
            private final MatlabTwoLevelArray<Double> box;
            private final int mapVersion;

            @NotNull
            private final MatlabTwoLevelArray<Double> pCenter;

            @NotNull
            private final MatlabTwoLevelArray<Double> pR;

            @NotNull
            private final MatlabTwoLevelArray<Polygon> poly;

            @Keep
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\n¨\u0006 "}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$Obstacles$Polygon;", "Ljava/io/Serializable;", "Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "", "x", "y", "sidesLengths", "<init>", "(Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;)V", "component1", "()Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "component2", "component3", "copy", "(Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$Obstacles$Polygon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lme/oriient/internal/services/dataManager/utils/MatlabTwoLevelArray;", "getX", "getY", "getSidesLengths", "Companion", "me/oriient/positioningengine/ondevice/mappingData/h", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Polygon implements Serializable {

                @NotNull
                public static final h Companion = new h();
                private static final long serialVersionUID = 1;

                @NotNull
                private final MatlabTwoLevelArray<Double> sidesLengths;

                @NotNull
                private final MatlabTwoLevelArray<Double> x;

                @NotNull
                private final MatlabTwoLevelArray<Double> y;

                public Polygon(@NotNull MatlabTwoLevelArray<Double> x, @NotNull MatlabTwoLevelArray<Double> y, @NotNull MatlabTwoLevelArray<Double> sidesLengths) {
                    Intrinsics.h(x, "x");
                    Intrinsics.h(y, "y");
                    Intrinsics.h(sidesLengths, "sidesLengths");
                    this.x = x;
                    this.y = y;
                    this.sidesLengths = sidesLengths;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Polygon copy$default(Polygon polygon, MatlabTwoLevelArray matlabTwoLevelArray, MatlabTwoLevelArray matlabTwoLevelArray2, MatlabTwoLevelArray matlabTwoLevelArray3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        matlabTwoLevelArray = polygon.x;
                    }
                    if ((i & 2) != 0) {
                        matlabTwoLevelArray2 = polygon.y;
                    }
                    if ((i & 4) != 0) {
                        matlabTwoLevelArray3 = polygon.sidesLengths;
                    }
                    return polygon.copy(matlabTwoLevelArray, matlabTwoLevelArray2, matlabTwoLevelArray3);
                }

                @NotNull
                public final MatlabTwoLevelArray<Double> component1() {
                    return this.x;
                }

                @NotNull
                public final MatlabTwoLevelArray<Double> component2() {
                    return this.y;
                }

                @NotNull
                public final MatlabTwoLevelArray<Double> component3() {
                    return this.sidesLengths;
                }

                @NotNull
                public final Polygon copy(@NotNull MatlabTwoLevelArray<Double> x, @NotNull MatlabTwoLevelArray<Double> y, @NotNull MatlabTwoLevelArray<Double> sidesLengths) {
                    Intrinsics.h(x, "x");
                    Intrinsics.h(y, "y");
                    Intrinsics.h(sidesLengths, "sidesLengths");
                    return new Polygon(x, y, sidesLengths);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Polygon)) {
                        return false;
                    }
                    Polygon polygon = (Polygon) other;
                    return Intrinsics.c(this.x, polygon.x) && Intrinsics.c(this.y, polygon.y) && Intrinsics.c(this.sidesLengths, polygon.sidesLengths);
                }

                @NotNull
                public final MatlabTwoLevelArray<Double> getSidesLengths() {
                    return this.sidesLengths;
                }

                @NotNull
                public final MatlabTwoLevelArray<Double> getX() {
                    return this.x;
                }

                @NotNull
                public final MatlabTwoLevelArray<Double> getY() {
                    return this.y;
                }

                public int hashCode() {
                    return this.sidesLengths.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31);
                }

                @NotNull
                public String toString() {
                    return "Polygon(x=" + this.x + ", y=" + this.y + ", sidesLengths=" + this.sidesLengths + ')';
                }
            }

            public Obstacles(int i, @NotNull MatlabTwoLevelArray<Double> pR, @NotNull MatlabTwoLevelArray<Double> pCenter, @NotNull MatlabTwoLevelArray<Polygon> poly, @NotNull MatlabTwoLevelArray<Double> box) {
                Intrinsics.h(pR, "pR");
                Intrinsics.h(pCenter, "pCenter");
                Intrinsics.h(poly, "poly");
                Intrinsics.h(box, "box");
                this.mapVersion = i;
                this.pR = pR;
                this.pCenter = pCenter;
                this.poly = poly;
                this.box = box;
            }

            public static /* synthetic */ Obstacles copy$default(Obstacles obstacles, int i, MatlabTwoLevelArray matlabTwoLevelArray, MatlabTwoLevelArray matlabTwoLevelArray2, MatlabTwoLevelArray matlabTwoLevelArray3, MatlabTwoLevelArray matlabTwoLevelArray4, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = obstacles.mapVersion;
                }
                if ((i2 & 2) != 0) {
                    matlabTwoLevelArray = obstacles.pR;
                }
                if ((i2 & 4) != 0) {
                    matlabTwoLevelArray2 = obstacles.pCenter;
                }
                if ((i2 & 8) != 0) {
                    matlabTwoLevelArray3 = obstacles.poly;
                }
                if ((i2 & 16) != 0) {
                    matlabTwoLevelArray4 = obstacles.box;
                }
                MatlabTwoLevelArray matlabTwoLevelArray5 = matlabTwoLevelArray4;
                MatlabTwoLevelArray matlabTwoLevelArray6 = matlabTwoLevelArray2;
                return obstacles.copy(i, matlabTwoLevelArray, matlabTwoLevelArray6, matlabTwoLevelArray3, matlabTwoLevelArray5);
            }

            /* renamed from: component1, reason: from getter */
            public final int getMapVersion() {
                return this.mapVersion;
            }

            @NotNull
            public final MatlabTwoLevelArray<Double> component2() {
                return this.pR;
            }

            @NotNull
            public final MatlabTwoLevelArray<Double> component3() {
                return this.pCenter;
            }

            @NotNull
            public final MatlabTwoLevelArray<Polygon> component4() {
                return this.poly;
            }

            @NotNull
            public final MatlabTwoLevelArray<Double> component5() {
                return this.box;
            }

            @NotNull
            public final Obstacles copy(int mapVersion, @NotNull MatlabTwoLevelArray<Double> pR, @NotNull MatlabTwoLevelArray<Double> pCenter, @NotNull MatlabTwoLevelArray<Polygon> poly, @NotNull MatlabTwoLevelArray<Double> box) {
                Intrinsics.h(pR, "pR");
                Intrinsics.h(pCenter, "pCenter");
                Intrinsics.h(poly, "poly");
                Intrinsics.h(box, "box");
                return new Obstacles(mapVersion, pR, pCenter, poly, box);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Obstacles)) {
                    return false;
                }
                Obstacles obstacles = (Obstacles) other;
                return this.mapVersion == obstacles.mapVersion && Intrinsics.c(this.pR, obstacles.pR) && Intrinsics.c(this.pCenter, obstacles.pCenter) && Intrinsics.c(this.poly, obstacles.poly) && Intrinsics.c(this.box, obstacles.box);
            }

            @NotNull
            public final MatlabTwoLevelArray<Double> getBox() {
                return this.box;
            }

            public final int getMapVersion() {
                return this.mapVersion;
            }

            @NotNull
            public final MatlabTwoLevelArray<Double> getPCenter() {
                return this.pCenter;
            }

            @NotNull
            public final MatlabTwoLevelArray<Double> getPR() {
                return this.pR;
            }

            @NotNull
            public final MatlabTwoLevelArray<Polygon> getPoly() {
                return this.poly;
            }

            public int hashCode() {
                return this.box.hashCode() + ((this.poly.hashCode() + ((this.pCenter.hashCode() + ((this.pR.hashCode() + (Integer.hashCode(this.mapVersion) * 31)) * 31)) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                return "Obstacles(mapVersion=" + this.mapVersion + ", pR=" + this.pR + ", pCenter=" + this.pCenter + ", poly=" + this.poly + ", box=" + this.box + ')';
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$RestrictedArea;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "vertices", "", "Lme/oriient/positioningengine/common/models/IndoorCoordinate;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getVertices", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RestrictedArea {

            @NotNull
            private final String id;

            @NotNull
            private final String name;

            @NotNull
            private final List<IndoorCoordinate> vertices;

            public RestrictedArea(@NotNull String id, @NotNull String name, @NotNull List<IndoorCoordinate> vertices) {
                Intrinsics.h(id, "id");
                Intrinsics.h(name, "name");
                Intrinsics.h(vertices, "vertices");
                this.id = id;
                this.name = name;
                this.vertices = vertices;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RestrictedArea copy$default(RestrictedArea restrictedArea, String str, String str2, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = restrictedArea.id;
                }
                if ((i & 2) != 0) {
                    str2 = restrictedArea.name;
                }
                if ((i & 4) != 0) {
                    list = restrictedArea.vertices;
                }
                return restrictedArea.copy(str, str2, list);
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

            @NotNull
            public final List<IndoorCoordinate> component3() {
                return this.vertices;
            }

            @NotNull
            public final RestrictedArea copy(@NotNull String id, @NotNull String name, @NotNull List<IndoorCoordinate> vertices) {
                Intrinsics.h(id, "id");
                Intrinsics.h(name, "name");
                Intrinsics.h(vertices, "vertices");
                return new RestrictedArea(id, name, vertices);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RestrictedArea)) {
                    return false;
                }
                RestrictedArea restrictedArea = (RestrictedArea) other;
                return Intrinsics.c(this.id, restrictedArea.id) && Intrinsics.c(this.name, restrictedArea.name) && Intrinsics.c(this.vertices, restrictedArea.vertices);
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
            public final List<IndoorCoordinate> getVertices() {
                return this.vertices;
            }

            public int hashCode() {
                return this.vertices.hashCode() + z.a(this.name, this.id.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("RestrictedArea(id=");
                sb.append(this.id);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", vertices=");
                return androidx.compose.ui.input.pointer.a.o(sb, this.vertices, ')');
            }
        }

        public FloorFullData(@NotNull Building.BuildingInfo.FloorMetadata metadata, @NotNull Obstacles obstacles, @NotNull List<RestrictedArea> restrictedAreas) {
            Intrinsics.h(metadata, "metadata");
            Intrinsics.h(obstacles, "obstacles");
            Intrinsics.h(restrictedAreas, "restrictedAreas");
            this.metadata = metadata;
            this.obstacles = obstacles;
            this.restrictedAreas = restrictedAreas;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FloorFullData copy$default(FloorFullData floorFullData, Building.BuildingInfo.FloorMetadata floorMetadata, Obstacles obstacles, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                floorMetadata = floorFullData.metadata;
            }
            if ((i & 2) != 0) {
                obstacles = floorFullData.obstacles;
            }
            if ((i & 4) != 0) {
                list = floorFullData.restrictedAreas;
            }
            return floorFullData.copy(floorMetadata, obstacles, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Building.BuildingInfo.FloorMetadata getMetadata() {
            return this.metadata;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Obstacles getObstacles() {
            return this.obstacles;
        }

        @NotNull
        public final List<RestrictedArea> component3() {
            return this.restrictedAreas;
        }

        @NotNull
        public final FloorFullData copy(@NotNull Building.BuildingInfo.FloorMetadata metadata, @NotNull Obstacles obstacles, @NotNull List<RestrictedArea> restrictedAreas) {
            Intrinsics.h(metadata, "metadata");
            Intrinsics.h(obstacles, "obstacles");
            Intrinsics.h(restrictedAreas, "restrictedAreas");
            return new FloorFullData(metadata, obstacles, restrictedAreas);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FloorFullData)) {
                return false;
            }
            FloorFullData floorFullData = (FloorFullData) other;
            return Intrinsics.c(this.metadata, floorFullData.metadata) && Intrinsics.c(this.obstacles, floorFullData.obstacles) && Intrinsics.c(this.restrictedAreas, floorFullData.restrictedAreas);
        }

        @NotNull
        public final Building.BuildingInfo.FloorMetadata getMetadata() {
            return this.metadata;
        }

        @NotNull
        public final Obstacles getObstacles() {
            return this.obstacles;
        }

        @NotNull
        public final List<RestrictedArea> getRestrictedAreas() {
            return this.restrictedAreas;
        }

        public int hashCode() {
            return this.restrictedAreas.hashCode() + ((this.obstacles.hashCode() + (this.metadata.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("FloorFullData(metadata=");
            sb.append(this.metadata);
            sb.append(", obstacles=");
            sb.append(this.obstacles);
            sb.append(", restrictedAreas=");
            return androidx.compose.ui.input.pointer.a.o(sb, this.restrictedAreas, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map;", "", "mapGrid", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid;", "(Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid;)V", "getMapGrid", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MapFullData", "MapGrid", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Map {

        @NotNull
        private final MapGrid mapGrid;

        @Keep
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0003ABCBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"Jp\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b8\u0010\u0017R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010\"R\u0013\u0010=\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010?\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006D"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData;", "Ljava/io/Serializable;", "", "downloadedAtMillis", "", "mapId", "mapName", "", "pixelToMeter", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapOffset;", "mapOffset", "", "mapVersion", "mapUrl", "mapUsage", "", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapImage;", "mapImages", "<init>", "(JLjava/lang/String;Ljava/lang/String;DLme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapOffset;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()D", "component5", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapOffset;", "component6", "()I", "component7", "component8", "component9", "()Ljava/util/List;", "copy", "(JLjava/lang/String;Ljava/lang/String;DLme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapOffset;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDownloadedAtMillis", "Ljava/lang/String;", "getMapId", "getMapName", "D", "getPixelToMeter", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapOffset;", "getMapOffset", "I", "getMapVersion", "getMapUrl", "getMapUsage", "Ljava/util/List;", "getMapImages", "getObstacles", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapImage;", "obstacles", "getDefault", "default", "Companion", "me/oriient/positioningengine/ondevice/mappingData/i", "MapImage", "MapOffset", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class MapFullData implements Serializable {

            @NotNull
            public static final i Companion = new i();
            private static final long serialVersionUID = 1;
            private final long downloadedAtMillis;

            @NotNull
            private final String mapId;

            @NotNull
            private final List<MapImage> mapImages;

            @NotNull
            private final String mapName;

            @NotNull
            private final MapOffset mapOffset;

            @NotNull
            private final String mapUrl;

            @NotNull
            private final String mapUsage;
            private final int mapVersion;
            private final double pixelToMeter;

            @Keep
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b!\u0010\f¨\u0006$"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapImage;", "Ljava/io/Serializable;", "", "mapUsage", "", "mapVersion", "mapUrl", "imageId", "mapUrlGzip", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapImage;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMapUsage", "I", "getMapVersion", "getMapUrl", "getImageId", "getMapUrlGzip", "Companion", "me/oriient/positioningengine/ondevice/mappingData/j", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class MapImage implements Serializable {

                @NotNull
                public static final j Companion = new j();
                private static final long serialVersionUID = 1;

                @NotNull
                private final String imageId;

                @NotNull
                private final String mapUrl;

                @NotNull
                private final String mapUrlGzip;

                @NotNull
                private final String mapUsage;
                private final int mapVersion;

                public MapImage(@NotNull String mapUsage, int i, @NotNull String mapUrl, @NotNull String imageId, @NotNull String mapUrlGzip) {
                    Intrinsics.h(mapUsage, "mapUsage");
                    Intrinsics.h(mapUrl, "mapUrl");
                    Intrinsics.h(imageId, "imageId");
                    Intrinsics.h(mapUrlGzip, "mapUrlGzip");
                    this.mapUsage = mapUsage;
                    this.mapVersion = i;
                    this.mapUrl = mapUrl;
                    this.imageId = imageId;
                    this.mapUrlGzip = mapUrlGzip;
                }

                public static /* synthetic */ MapImage copy$default(MapImage mapImage, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = mapImage.mapUsage;
                    }
                    if ((i2 & 2) != 0) {
                        i = mapImage.mapVersion;
                    }
                    if ((i2 & 4) != 0) {
                        str2 = mapImage.mapUrl;
                    }
                    if ((i2 & 8) != 0) {
                        str3 = mapImage.imageId;
                    }
                    if ((i2 & 16) != 0) {
                        str4 = mapImage.mapUrlGzip;
                    }
                    String str5 = str4;
                    String str6 = str2;
                    return mapImage.copy(str, i, str6, str3, str5);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getMapUsage() {
                    return this.mapUsage;
                }

                /* renamed from: component2, reason: from getter */
                public final int getMapVersion() {
                    return this.mapVersion;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final String getMapUrl() {
                    return this.mapUrl;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final String getImageId() {
                    return this.imageId;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final String getMapUrlGzip() {
                    return this.mapUrlGzip;
                }

                @NotNull
                public final MapImage copy(@NotNull String mapUsage, int mapVersion, @NotNull String mapUrl, @NotNull String imageId, @NotNull String mapUrlGzip) {
                    Intrinsics.h(mapUsage, "mapUsage");
                    Intrinsics.h(mapUrl, "mapUrl");
                    Intrinsics.h(imageId, "imageId");
                    Intrinsics.h(mapUrlGzip, "mapUrlGzip");
                    return new MapImage(mapUsage, mapVersion, mapUrl, imageId, mapUrlGzip);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MapImage)) {
                        return false;
                    }
                    MapImage mapImage = (MapImage) other;
                    return Intrinsics.c(this.mapUsage, mapImage.mapUsage) && this.mapVersion == mapImage.mapVersion && Intrinsics.c(this.mapUrl, mapImage.mapUrl) && Intrinsics.c(this.imageId, mapImage.imageId) && Intrinsics.c(this.mapUrlGzip, mapImage.mapUrlGzip);
                }

                @NotNull
                public final String getImageId() {
                    return this.imageId;
                }

                @NotNull
                public final String getMapUrl() {
                    return this.mapUrl;
                }

                @NotNull
                public final String getMapUrlGzip() {
                    return this.mapUrlGzip;
                }

                @NotNull
                public final String getMapUsage() {
                    return this.mapUsage;
                }

                public final int getMapVersion() {
                    return this.mapVersion;
                }

                public int hashCode() {
                    return this.mapUrlGzip.hashCode() + z.a(this.imageId, z.a(this.mapUrl, androidx.camera.core.impl.b.a(this.mapVersion, this.mapUsage.hashCode() * 31, 31), 31), 31);
                }

                @NotNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("MapImage(mapUsage=");
                    sb.append(this.mapUsage);
                    sb.append(", mapVersion=");
                    sb.append(this.mapVersion);
                    sb.append(", mapUrl=");
                    sb.append(this.mapUrl);
                    sb.append(", imageId=");
                    sb.append(this.imageId);
                    sb.append(", mapUrlGzip=");
                    return androidx.camera.core.impl.b.r(sb, this.mapUrlGzip, ')');
                }
            }

            @Keep
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001c"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapOffset;", "Ljava/io/Serializable;", "", "x", "y", "<init>", "(DD)V", "component1", "()D", "component2", "copy", "(DD)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapFullData$MapOffset;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getX", "getY", "Companion", "me/oriient/positioningengine/ondevice/mappingData/k", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class MapOffset implements Serializable {

                @NotNull
                public static final k Companion = new k();
                private static final long serialVersionUID = 1;
                private final double x;
                private final double y;

                public MapOffset(double d, double d2) {
                    this.x = d;
                    this.y = d2;
                }

                public static /* synthetic */ MapOffset copy$default(MapOffset mapOffset, double d, double d2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        d = mapOffset.x;
                    }
                    if ((i & 2) != 0) {
                        d2 = mapOffset.y;
                    }
                    return mapOffset.copy(d, d2);
                }

                /* renamed from: component1, reason: from getter */
                public final double getX() {
                    return this.x;
                }

                /* renamed from: component2, reason: from getter */
                public final double getY() {
                    return this.y;
                }

                @NotNull
                public final MapOffset copy(double x, double y) {
                    return new MapOffset(x, y);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MapOffset)) {
                        return false;
                    }
                    MapOffset mapOffset = (MapOffset) other;
                    return Double.compare(this.x, mapOffset.x) == 0 && Double.compare(this.y, mapOffset.y) == 0;
                }

                public final double getX() {
                    return this.x;
                }

                public final double getY() {
                    return this.y;
                }

                public int hashCode() {
                    return Double.hashCode(this.y) + (Double.hashCode(this.x) * 31);
                }

                @NotNull
                public String toString() {
                    StringBuilder sb = new StringBuilder("MapOffset(x=");
                    sb.append(this.x);
                    sb.append(", y=");
                    return me.oriient.positioningengine.common.a.a(sb, this.y, ')');
                }
            }

            public MapFullData(long j, @NotNull String mapId, @NotNull String mapName, double d, @NotNull MapOffset mapOffset, int i, @NotNull String mapUrl, @NotNull String mapUsage, @NotNull List<MapImage> mapImages) {
                Intrinsics.h(mapId, "mapId");
                Intrinsics.h(mapName, "mapName");
                Intrinsics.h(mapOffset, "mapOffset");
                Intrinsics.h(mapUrl, "mapUrl");
                Intrinsics.h(mapUsage, "mapUsage");
                Intrinsics.h(mapImages, "mapImages");
                this.downloadedAtMillis = j;
                this.mapId = mapId;
                this.mapName = mapName;
                this.pixelToMeter = d;
                this.mapOffset = mapOffset;
                this.mapVersion = i;
                this.mapUrl = mapUrl;
                this.mapUsage = mapUsage;
                this.mapImages = mapImages;
            }

            public static /* synthetic */ MapFullData copy$default(MapFullData mapFullData, long j, String str, String str2, double d, MapOffset mapOffset, int i, String str3, String str4, List list, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    j = mapFullData.downloadedAtMillis;
                }
                long j2 = j;
                if ((i2 & 2) != 0) {
                    str = mapFullData.mapId;
                }
                return mapFullData.copy(j2, str, (i2 & 4) != 0 ? mapFullData.mapName : str2, (i2 & 8) != 0 ? mapFullData.pixelToMeter : d, (i2 & 16) != 0 ? mapFullData.mapOffset : mapOffset, (i2 & 32) != 0 ? mapFullData.mapVersion : i, (i2 & 64) != 0 ? mapFullData.mapUrl : str3, (i2 & 128) != 0 ? mapFullData.mapUsage : str4, (i2 & 256) != 0 ? mapFullData.mapImages : list);
            }

            /* renamed from: component1, reason: from getter */
            public final long getDownloadedAtMillis() {
                return this.downloadedAtMillis;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getMapId() {
                return this.mapId;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getMapName() {
                return this.mapName;
            }

            /* renamed from: component4, reason: from getter */
            public final double getPixelToMeter() {
                return this.pixelToMeter;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final MapOffset getMapOffset() {
                return this.mapOffset;
            }

            /* renamed from: component6, reason: from getter */
            public final int getMapVersion() {
                return this.mapVersion;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final String getMapUrl() {
                return this.mapUrl;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final String getMapUsage() {
                return this.mapUsage;
            }

            @NotNull
            public final List<MapImage> component9() {
                return this.mapImages;
            }

            @NotNull
            public final MapFullData copy(long downloadedAtMillis, @NotNull String mapId, @NotNull String mapName, double pixelToMeter, @NotNull MapOffset mapOffset, int mapVersion, @NotNull String mapUrl, @NotNull String mapUsage, @NotNull List<MapImage> mapImages) {
                Intrinsics.h(mapId, "mapId");
                Intrinsics.h(mapName, "mapName");
                Intrinsics.h(mapOffset, "mapOffset");
                Intrinsics.h(mapUrl, "mapUrl");
                Intrinsics.h(mapUsage, "mapUsage");
                Intrinsics.h(mapImages, "mapImages");
                return new MapFullData(downloadedAtMillis, mapId, mapName, pixelToMeter, mapOffset, mapVersion, mapUrl, mapUsage, mapImages);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MapFullData)) {
                    return false;
                }
                MapFullData mapFullData = (MapFullData) other;
                return this.downloadedAtMillis == mapFullData.downloadedAtMillis && Intrinsics.c(this.mapId, mapFullData.mapId) && Intrinsics.c(this.mapName, mapFullData.mapName) && Double.compare(this.pixelToMeter, mapFullData.pixelToMeter) == 0 && Intrinsics.c(this.mapOffset, mapFullData.mapOffset) && this.mapVersion == mapFullData.mapVersion && Intrinsics.c(this.mapUrl, mapFullData.mapUrl) && Intrinsics.c(this.mapUsage, mapFullData.mapUsage) && Intrinsics.c(this.mapImages, mapFullData.mapImages);
            }

            @Nullable
            public final MapImage getDefault() {
                Object next;
                Iterator<T> it = this.mapImages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.c(((MapImage) next).getMapUsage(), "default")) {
                        break;
                    }
                }
                return (MapImage) next;
            }

            public final long getDownloadedAtMillis() {
                return this.downloadedAtMillis;
            }

            @NotNull
            public final String getMapId() {
                return this.mapId;
            }

            @NotNull
            public final List<MapImage> getMapImages() {
                return this.mapImages;
            }

            @NotNull
            public final String getMapName() {
                return this.mapName;
            }

            @NotNull
            public final MapOffset getMapOffset() {
                return this.mapOffset;
            }

            @NotNull
            public final String getMapUrl() {
                return this.mapUrl;
            }

            @NotNull
            public final String getMapUsage() {
                return this.mapUsage;
            }

            public final int getMapVersion() {
                return this.mapVersion;
            }

            @Nullable
            public final MapImage getObstacles() {
                Object next;
                Iterator<T> it = this.mapImages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.c(((MapImage) next).getMapUsage(), "obstacles")) {
                        break;
                    }
                }
                return (MapImage) next;
            }

            public final double getPixelToMeter() {
                return this.pixelToMeter;
            }

            public int hashCode() {
                return this.mapImages.hashCode() + z.a(this.mapUsage, z.a(this.mapUrl, androidx.camera.core.impl.b.a(this.mapVersion, (this.mapOffset.hashCode() + me.oriient.positioningengine.common.v.a(this.pixelToMeter, z.a(this.mapName, z.a(this.mapId, Long.hashCode(this.downloadedAtMillis) * 31, 31), 31), 31)) * 31, 31), 31), 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("MapFullData(downloadedAtMillis=");
                sb.append(this.downloadedAtMillis);
                sb.append(", mapId=");
                sb.append(this.mapId);
                sb.append(", mapName=");
                sb.append(this.mapName);
                sb.append(", pixelToMeter=");
                sb.append(this.pixelToMeter);
                sb.append(", mapOffset=");
                sb.append(this.mapOffset);
                sb.append(", mapVersion=");
                sb.append(this.mapVersion);
                sb.append(", mapUrl=");
                sb.append(this.mapUrl);
                sb.append(", mapUsage=");
                sb.append(this.mapUsage);
                sb.append(", mapImages=");
                return androidx.compose.ui.input.pointer.a.o(sb, this.mapImages, ')');
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid;", "", "record", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridRecord;", "mapGridData", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData;", "(Lme/oriient/internal/services/dataManager/mapGrid/MapGridRecord;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData;)V", "getMapGridData", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData;", "getRecord", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGridRecord;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MapGridData", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MapGrid {

            @NotNull
            private final MapGridData mapGridData;

            @NotNull
            private final MapGridRecord record;

            @Keep
            @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0007MNOPQRSB\u008d\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aBi\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u001bJ\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0015HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010!J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J\t\u0010<\u001a\u00020\u0011HÆ\u0003J\t\u0010=\u001a\u00020\u0013HÆ\u0003J\u008a\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001J&\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KHÁ\u0001¢\u0006\u0002\bLR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b1\u0010!¨\u0006T"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData;", "", "seen1", "", "mapId", "", "mgrid", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Grid;", "mgridxqRange", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range;", "mgridyqRange", "mgridcoarse", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseGrid;", "mgridcoarsexqRange", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange;", "mgridcoarseyqRange", "gmmpdf", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$GmmPdf;", "Done", "", "plmVersion", "", "majorVersion", "version", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Grid;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseGrid;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$GmmPdf;BDLjava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Grid;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseGrid;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$GmmPdf;BDLjava/lang/Double;Ljava/lang/Double;)V", "getDone", "()B", "getGmmpdf", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$GmmPdf;", "getMajorVersion", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMapId", "()Ljava/lang/String;", "getMgrid", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Grid;", "getMgridcoarse", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseGrid;", "getMgridcoarsexqRange", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange;", "getMgridcoarseyqRange", "getMgridxqRange", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range;", "getMgridyqRange", "getPlmVersion", "()D", "getVersion", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Grid;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseGrid;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange;Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$GmmPdf;BDLjava/lang/Double;Ljava/lang/Double;)Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "CoarseGrid", "CoarseRange", "Companion", "GmmPdf", "Grid", "Range", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @kotlinx.serialization.Serializable
            public static final /* data */ class MapGridData {

                /* renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion();
                private final byte Done;

                @NotNull
                private final GmmPdf gmmpdf;

                @Nullable
                private final Double majorVersion;

                @NotNull
                private final String mapId;

                @NotNull
                private final Grid mgrid;

                @NotNull
                private final CoarseGrid mgridcoarse;

                @NotNull
                private final CoarseRange mgridcoarsexqRange;

                @NotNull
                private final CoarseRange mgridcoarseyqRange;

                @NotNull
                private final Range mgridxqRange;

                @NotNull
                private final Range mgridyqRange;
                private final double plmVersion;

                @Nullable
                private final Double version;

                @Keep
                @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,Ba\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J&\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÁ\u0001¢\u0006\u0002\b*R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseGrid;", "", "seen1", "", "mx", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "my", "mz", "d", "res", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;D)V", "getD", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getMx", "getMy", "getMz", "getRes", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                public static final /* data */ class CoarseGrid {

                    @JvmField
                    @NotNull
                    private static final KSerializer<Object>[] $childSerializers;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    @NotNull
                    public static final Companion INSTANCE = new Companion();

                    @NotNull
                    private final MatLabArray<Short> d;

                    @NotNull
                    private final MatLabArray<Short> mx;

                    @NotNull
                    private final MatLabArray<Short> my;

                    @NotNull
                    private final MatLabArray<Short> mz;
                    private final double res;

                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseGrid$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseGrid;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final class Companion {
                        @NotNull
                        public final KSerializer<CoarseGrid> serializer() {
                            return MappingData$Map$MapGrid$MapGridData$CoarseGrid$$serializer.INSTANCE;
                        }
                    }

                    static {
                        MatLabArray.Companion companion = MatLabArray.INSTANCE;
                        ShortSerializer shortSerializer = ShortSerializer.f24820a;
                        $childSerializers = new KSerializer[]{companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), null};
                    }

                    @Deprecated
                    public /* synthetic */ CoarseGrid(int i, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, double d, SerializationConstructorMarker serializationConstructorMarker) {
                        if (31 != (i & 31)) {
                            PluginExceptionsKt.a(i, 31, MappingData$Map$MapGrid$MapGridData$CoarseGrid$$serializer.INSTANCE.getB());
                            throw null;
                        }
                        this.mx = matLabArray;
                        this.my = matLabArray2;
                        this.mz = matLabArray3;
                        this.d = matLabArray4;
                        this.res = d;
                    }

                    public static /* synthetic */ CoarseGrid copy$default(CoarseGrid coarseGrid, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, double d, int i, Object obj) {
                        if ((i & 1) != 0) {
                            matLabArray = coarseGrid.mx;
                        }
                        if ((i & 2) != 0) {
                            matLabArray2 = coarseGrid.my;
                        }
                        if ((i & 4) != 0) {
                            matLabArray3 = coarseGrid.mz;
                        }
                        if ((i & 8) != 0) {
                            matLabArray4 = coarseGrid.d;
                        }
                        if ((i & 16) != 0) {
                            d = coarseGrid.res;
                        }
                        double d2 = d;
                        return coarseGrid.copy(matLabArray, matLabArray2, matLabArray3, matLabArray4, d2);
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(CoarseGrid self, CompositeEncoder output, SerialDescriptor serialDesc) {
                        KSerializer<Object>[] kSerializerArr = $childSerializers;
                        output.F(serialDesc, 0, kSerializerArr[0], self.mx);
                        output.F(serialDesc, 1, kSerializerArr[1], self.my);
                        output.F(serialDesc, 2, kSerializerArr[2], self.mz);
                        output.F(serialDesc, 3, kSerializerArr[3], self.d);
                        output.G(serialDesc, 4, self.res);
                    }

                    @NotNull
                    public final MatLabArray<Short> component1() {
                        return this.mx;
                    }

                    @NotNull
                    public final MatLabArray<Short> component2() {
                        return this.my;
                    }

                    @NotNull
                    public final MatLabArray<Short> component3() {
                        return this.mz;
                    }

                    @NotNull
                    public final MatLabArray<Short> component4() {
                        return this.d;
                    }

                    /* renamed from: component5, reason: from getter */
                    public final double getRes() {
                        return this.res;
                    }

                    @NotNull
                    public final CoarseGrid copy(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, double res) {
                        Intrinsics.h(mx, "mx");
                        Intrinsics.h(my, "my");
                        Intrinsics.h(mz, "mz");
                        Intrinsics.h(d, "d");
                        return new CoarseGrid(mx, my, mz, d, res);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof CoarseGrid)) {
                            return false;
                        }
                        CoarseGrid coarseGrid = (CoarseGrid) other;
                        return Intrinsics.c(this.mx, coarseGrid.mx) && Intrinsics.c(this.my, coarseGrid.my) && Intrinsics.c(this.mz, coarseGrid.mz) && Intrinsics.c(this.d, coarseGrid.d) && Double.compare(this.res, coarseGrid.res) == 0;
                    }

                    @NotNull
                    public final MatLabArray<Short> getD() {
                        return this.d;
                    }

                    @NotNull
                    public final MatLabArray<Short> getMx() {
                        return this.mx;
                    }

                    @NotNull
                    public final MatLabArray<Short> getMy() {
                        return this.my;
                    }

                    @NotNull
                    public final MatLabArray<Short> getMz() {
                        return this.mz;
                    }

                    public final double getRes() {
                        return this.res;
                    }

                    public int hashCode() {
                        return Double.hashCode(this.res) + kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.d, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.mz, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.my, this.mx.hashCode() * 31, 31), 31), 31);
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder sb = new StringBuilder("CoarseGrid(mx=");
                        sb.append(this.mx);
                        sb.append(", my=");
                        sb.append(this.my);
                        sb.append(", mz=");
                        sb.append(this.mz);
                        sb.append(", d=");
                        sb.append(this.d);
                        sb.append(", res=");
                        return me.oriient.positioningengine.common.a.a(sb, this.res, ')');
                    }

                    public CoarseGrid(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, double d2) {
                        Intrinsics.h(mx, "mx");
                        Intrinsics.h(my, "my");
                        Intrinsics.h(mz, "mz");
                        Intrinsics.h(d, "d");
                        this.mx = mx;
                        this.my = my;
                        this.mz = mz;
                        this.d = d;
                        this.res = d2;
                    }
                }

                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Companion {
                    @NotNull
                    public final KSerializer<MapGridData> serializer() {
                        return MappingData$Map$MapGrid$MapGridData$$serializer.INSTANCE;
                    }
                }

                @Keep
                @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006&"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$GmmPdf;", "", "seen1", "", "r", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "w", "std", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;D)V", "getR", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getStd", "()D", "getW", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                public static final /* data */ class GmmPdf {

                    @JvmField
                    @NotNull
                    private static final KSerializer<Object>[] $childSerializers;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    @NotNull
                    public static final Companion INSTANCE = new Companion();

                    @NotNull
                    private final MatLabArray<Double> r;
                    private final double std;

                    @NotNull
                    private final MatLabArray<Double> w;

                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$GmmPdf$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$GmmPdf;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final class Companion {
                        @NotNull
                        public final KSerializer<GmmPdf> serializer() {
                            return MappingData$Map$MapGrid$MapGridData$GmmPdf$$serializer.INSTANCE;
                        }
                    }

                    static {
                        MatLabArray.Companion companion = MatLabArray.INSTANCE;
                        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
                        $childSerializers = new KSerializer[]{companion.serializer(doubleSerializer), companion.serializer(doubleSerializer), null};
                    }

                    @Deprecated
                    public /* synthetic */ GmmPdf(int i, MatLabArray matLabArray, MatLabArray matLabArray2, double d, SerializationConstructorMarker serializationConstructorMarker) {
                        if (7 != (i & 7)) {
                            PluginExceptionsKt.a(i, 7, MappingData$Map$MapGrid$MapGridData$GmmPdf$$serializer.INSTANCE.getB());
                            throw null;
                        }
                        this.r = matLabArray;
                        this.w = matLabArray2;
                        this.std = d;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ GmmPdf copy$default(GmmPdf gmmPdf, MatLabArray matLabArray, MatLabArray matLabArray2, double d, int i, Object obj) {
                        if ((i & 1) != 0) {
                            matLabArray = gmmPdf.r;
                        }
                        if ((i & 2) != 0) {
                            matLabArray2 = gmmPdf.w;
                        }
                        if ((i & 4) != 0) {
                            d = gmmPdf.std;
                        }
                        return gmmPdf.copy(matLabArray, matLabArray2, d);
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(GmmPdf self, CompositeEncoder output, SerialDescriptor serialDesc) {
                        KSerializer<Object>[] kSerializerArr = $childSerializers;
                        output.F(serialDesc, 0, kSerializerArr[0], self.r);
                        output.F(serialDesc, 1, kSerializerArr[1], self.w);
                        output.G(serialDesc, 2, self.std);
                    }

                    @NotNull
                    public final MatLabArray<Double> component1() {
                        return this.r;
                    }

                    @NotNull
                    public final MatLabArray<Double> component2() {
                        return this.w;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final double getStd() {
                        return this.std;
                    }

                    @NotNull
                    public final GmmPdf copy(@NotNull MatLabArray<Double> r, @NotNull MatLabArray<Double> w, double std) {
                        Intrinsics.h(r, "r");
                        Intrinsics.h(w, "w");
                        return new GmmPdf(r, w, std);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof GmmPdf)) {
                            return false;
                        }
                        GmmPdf gmmPdf = (GmmPdf) other;
                        return Intrinsics.c(this.r, gmmPdf.r) && Intrinsics.c(this.w, gmmPdf.w) && Double.compare(this.std, gmmPdf.std) == 0;
                    }

                    @NotNull
                    public final MatLabArray<Double> getR() {
                        return this.r;
                    }

                    public final double getStd() {
                        return this.std;
                    }

                    @NotNull
                    public final MatLabArray<Double> getW() {
                        return this.w;
                    }

                    public int hashCode() {
                        return Double.hashCode(this.std) + kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.w, this.r.hashCode() * 31, 31);
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder sb = new StringBuilder("GmmPdf(r=");
                        sb.append(this.r);
                        sb.append(", w=");
                        sb.append(this.w);
                        sb.append(", std=");
                        return me.oriient.positioningengine.common.a.a(sb, this.std, ')');
                    }

                    public GmmPdf(@NotNull MatLabArray<Double> r, @NotNull MatLabArray<Double> w, double d) {
                        Intrinsics.h(r, "r");
                        Intrinsics.h(w, "w");
                        this.r = r;
                        this.w = w;
                        this.std = d;
                    }
                }

                @Keep
                @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,Ba\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J&\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÁ\u0001¢\u0006\u0002\b*R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Grid;", "", "seen1", "", "mx", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "my", "mz", "d", "res", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;D)V", "getD", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getMx", "getMy", "getMz", "getRes", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                public static final /* data */ class Grid {

                    @JvmField
                    @NotNull
                    private static final KSerializer<Object>[] $childSerializers;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    @NotNull
                    public static final Companion INSTANCE = new Companion();

                    @NotNull
                    private final MatLabArray<Short> d;

                    @NotNull
                    private final MatLabArray<Short> mx;

                    @NotNull
                    private final MatLabArray<Short> my;

                    @NotNull
                    private final MatLabArray<Short> mz;
                    private final double res;

                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Grid$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Grid;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final class Companion {
                        @NotNull
                        public final KSerializer<Grid> serializer() {
                            return MappingData$Map$MapGrid$MapGridData$Grid$$serializer.INSTANCE;
                        }
                    }

                    static {
                        MatLabArray.Companion companion = MatLabArray.INSTANCE;
                        ShortSerializer shortSerializer = ShortSerializer.f24820a;
                        $childSerializers = new KSerializer[]{companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), null};
                    }

                    @Deprecated
                    public /* synthetic */ Grid(int i, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, double d, SerializationConstructorMarker serializationConstructorMarker) {
                        if (31 != (i & 31)) {
                            PluginExceptionsKt.a(i, 31, MappingData$Map$MapGrid$MapGridData$Grid$$serializer.INSTANCE.getB());
                            throw null;
                        }
                        this.mx = matLabArray;
                        this.my = matLabArray2;
                        this.mz = matLabArray3;
                        this.d = matLabArray4;
                        this.res = d;
                    }

                    public static /* synthetic */ Grid copy$default(Grid grid, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, double d, int i, Object obj) {
                        if ((i & 1) != 0) {
                            matLabArray = grid.mx;
                        }
                        if ((i & 2) != 0) {
                            matLabArray2 = grid.my;
                        }
                        if ((i & 4) != 0) {
                            matLabArray3 = grid.mz;
                        }
                        if ((i & 8) != 0) {
                            matLabArray4 = grid.d;
                        }
                        if ((i & 16) != 0) {
                            d = grid.res;
                        }
                        double d2 = d;
                        return grid.copy(matLabArray, matLabArray2, matLabArray3, matLabArray4, d2);
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(Grid self, CompositeEncoder output, SerialDescriptor serialDesc) {
                        KSerializer<Object>[] kSerializerArr = $childSerializers;
                        output.F(serialDesc, 0, kSerializerArr[0], self.mx);
                        output.F(serialDesc, 1, kSerializerArr[1], self.my);
                        output.F(serialDesc, 2, kSerializerArr[2], self.mz);
                        output.F(serialDesc, 3, kSerializerArr[3], self.d);
                        output.G(serialDesc, 4, self.res);
                    }

                    @NotNull
                    public final MatLabArray<Short> component1() {
                        return this.mx;
                    }

                    @NotNull
                    public final MatLabArray<Short> component2() {
                        return this.my;
                    }

                    @NotNull
                    public final MatLabArray<Short> component3() {
                        return this.mz;
                    }

                    @NotNull
                    public final MatLabArray<Short> component4() {
                        return this.d;
                    }

                    /* renamed from: component5, reason: from getter */
                    public final double getRes() {
                        return this.res;
                    }

                    @NotNull
                    public final Grid copy(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, double res) {
                        Intrinsics.h(mx, "mx");
                        Intrinsics.h(my, "my");
                        Intrinsics.h(mz, "mz");
                        Intrinsics.h(d, "d");
                        return new Grid(mx, my, mz, d, res);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Grid)) {
                            return false;
                        }
                        Grid grid = (Grid) other;
                        return Intrinsics.c(this.mx, grid.mx) && Intrinsics.c(this.my, grid.my) && Intrinsics.c(this.mz, grid.mz) && Intrinsics.c(this.d, grid.d) && Double.compare(this.res, grid.res) == 0;
                    }

                    @NotNull
                    public final MatLabArray<Short> getD() {
                        return this.d;
                    }

                    @NotNull
                    public final MatLabArray<Short> getMx() {
                        return this.mx;
                    }

                    @NotNull
                    public final MatLabArray<Short> getMy() {
                        return this.my;
                    }

                    @NotNull
                    public final MatLabArray<Short> getMz() {
                        return this.mz;
                    }

                    public final double getRes() {
                        return this.res;
                    }

                    public int hashCode() {
                        return Double.hashCode(this.res) + kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.d, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.mz, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.my, this.mx.hashCode() * 31, 31), 31), 31);
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder sb = new StringBuilder("Grid(mx=");
                        sb.append(this.mx);
                        sb.append(", my=");
                        sb.append(this.my);
                        sb.append(", mz=");
                        sb.append(this.mz);
                        sb.append(", d=");
                        sb.append(this.d);
                        sb.append(", res=");
                        return me.oriient.positioningengine.common.a.a(sb, this.res, ')');
                    }

                    public Grid(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, double d2) {
                        Intrinsics.h(mx, "mx");
                        Intrinsics.h(my, "my");
                        Intrinsics.h(mz, "mz");
                        Intrinsics.h(d, "d");
                        this.mx = mx;
                        this.my = my;
                        this.mz = mz;
                        this.d = d;
                        this.res = d2;
                    }
                }

                @Deprecated
                public /* synthetic */ MapGridData(int i, String str, Grid grid, Range range, Range range2, CoarseGrid coarseGrid, CoarseRange coarseRange, CoarseRange coarseRange2, GmmPdf gmmPdf, byte b, double d, Double d2, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
                    if (4095 != (i & l3.b)) {
                        PluginExceptionsKt.a(i, l3.b, MappingData$Map$MapGrid$MapGridData$$serializer.INSTANCE.getB());
                        throw null;
                    }
                    this.mapId = str;
                    this.mgrid = grid;
                    this.mgridxqRange = range;
                    this.mgridyqRange = range2;
                    this.mgridcoarse = coarseGrid;
                    this.mgridcoarsexqRange = coarseRange;
                    this.mgridcoarseyqRange = coarseRange2;
                    this.gmmpdf = gmmPdf;
                    this.Done = b;
                    this.plmVersion = d;
                    this.majorVersion = d2;
                    this.version = d3;
                }

                public static /* synthetic */ MapGridData copy$default(MapGridData mapGridData, String str, Grid grid, Range range, Range range2, CoarseGrid coarseGrid, CoarseRange coarseRange, CoarseRange coarseRange2, GmmPdf gmmPdf, byte b, double d, Double d2, Double d3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = mapGridData.mapId;
                    }
                    return mapGridData.copy(str, (i & 2) != 0 ? mapGridData.mgrid : grid, (i & 4) != 0 ? mapGridData.mgridxqRange : range, (i & 8) != 0 ? mapGridData.mgridyqRange : range2, (i & 16) != 0 ? mapGridData.mgridcoarse : coarseGrid, (i & 32) != 0 ? mapGridData.mgridcoarsexqRange : coarseRange, (i & 64) != 0 ? mapGridData.mgridcoarseyqRange : coarseRange2, (i & 128) != 0 ? mapGridData.gmmpdf : gmmPdf, (i & 256) != 0 ? mapGridData.Done : b, (i & 512) != 0 ? mapGridData.plmVersion : d, (i & 1024) != 0 ? mapGridData.majorVersion : d2, (i & 2048) != 0 ? mapGridData.version : d3);
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(MapGridData self, CompositeEncoder output, SerialDescriptor serialDesc) {
                    output.p(serialDesc, 0, self.mapId);
                    output.F(serialDesc, 1, MappingData$Map$MapGrid$MapGridData$Grid$$serializer.INSTANCE, self.mgrid);
                    MappingData$Map$MapGrid$MapGridData$Range$$serializer mappingData$Map$MapGrid$MapGridData$Range$$serializer = MappingData$Map$MapGrid$MapGridData$Range$$serializer.INSTANCE;
                    output.F(serialDesc, 2, mappingData$Map$MapGrid$MapGridData$Range$$serializer, self.mgridxqRange);
                    output.F(serialDesc, 3, mappingData$Map$MapGrid$MapGridData$Range$$serializer, self.mgridyqRange);
                    output.F(serialDesc, 4, MappingData$Map$MapGrid$MapGridData$CoarseGrid$$serializer.INSTANCE, self.mgridcoarse);
                    MappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer mappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer = MappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer.INSTANCE;
                    output.F(serialDesc, 5, mappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer, self.mgridcoarsexqRange);
                    output.F(serialDesc, 6, mappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer, self.mgridcoarseyqRange);
                    output.F(serialDesc, 7, MappingData$Map$MapGrid$MapGridData$GmmPdf$$serializer.INSTANCE, self.gmmpdf);
                    output.k(serialDesc, 8, self.Done);
                    output.G(serialDesc, 9, self.plmVersion);
                    DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
                    output.w(serialDesc, 10, doubleSerializer, self.majorVersion);
                    output.w(serialDesc, 11, doubleSerializer, self.version);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getMapId() {
                    return this.mapId;
                }

                /* renamed from: component10, reason: from getter */
                public final double getPlmVersion() {
                    return this.plmVersion;
                }

                @Nullable
                /* renamed from: component11, reason: from getter */
                public final Double getMajorVersion() {
                    return this.majorVersion;
                }

                @Nullable
                /* renamed from: component12, reason: from getter */
                public final Double getVersion() {
                    return this.version;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final Grid getMgrid() {
                    return this.mgrid;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final Range getMgridxqRange() {
                    return this.mgridxqRange;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final Range getMgridyqRange() {
                    return this.mgridyqRange;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final CoarseGrid getMgridcoarse() {
                    return this.mgridcoarse;
                }

                @NotNull
                /* renamed from: component6, reason: from getter */
                public final CoarseRange getMgridcoarsexqRange() {
                    return this.mgridcoarsexqRange;
                }

                @NotNull
                /* renamed from: component7, reason: from getter */
                public final CoarseRange getMgridcoarseyqRange() {
                    return this.mgridcoarseyqRange;
                }

                @NotNull
                /* renamed from: component8, reason: from getter */
                public final GmmPdf getGmmpdf() {
                    return this.gmmpdf;
                }

                /* renamed from: component9, reason: from getter */
                public final byte getDone() {
                    return this.Done;
                }

                @NotNull
                public final MapGridData copy(@NotNull String mapId, @NotNull Grid mgrid, @NotNull Range mgridxqRange, @NotNull Range mgridyqRange, @NotNull CoarseGrid mgridcoarse, @NotNull CoarseRange mgridcoarsexqRange, @NotNull CoarseRange mgridcoarseyqRange, @NotNull GmmPdf gmmpdf, byte Done, double plmVersion, @Nullable Double majorVersion, @Nullable Double version) {
                    Intrinsics.h(mapId, "mapId");
                    Intrinsics.h(mgrid, "mgrid");
                    Intrinsics.h(mgridxqRange, "mgridxqRange");
                    Intrinsics.h(mgridyqRange, "mgridyqRange");
                    Intrinsics.h(mgridcoarse, "mgridcoarse");
                    Intrinsics.h(mgridcoarsexqRange, "mgridcoarsexqRange");
                    Intrinsics.h(mgridcoarseyqRange, "mgridcoarseyqRange");
                    Intrinsics.h(gmmpdf, "gmmpdf");
                    return new MapGridData(mapId, mgrid, mgridxqRange, mgridyqRange, mgridcoarse, mgridcoarsexqRange, mgridcoarseyqRange, gmmpdf, Done, plmVersion, majorVersion, version);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MapGridData)) {
                        return false;
                    }
                    MapGridData mapGridData = (MapGridData) other;
                    return Intrinsics.c(this.mapId, mapGridData.mapId) && Intrinsics.c(this.mgrid, mapGridData.mgrid) && Intrinsics.c(this.mgridxqRange, mapGridData.mgridxqRange) && Intrinsics.c(this.mgridyqRange, mapGridData.mgridyqRange) && Intrinsics.c(this.mgridcoarse, mapGridData.mgridcoarse) && Intrinsics.c(this.mgridcoarsexqRange, mapGridData.mgridcoarsexqRange) && Intrinsics.c(this.mgridcoarseyqRange, mapGridData.mgridcoarseyqRange) && Intrinsics.c(this.gmmpdf, mapGridData.gmmpdf) && this.Done == mapGridData.Done && Double.compare(this.plmVersion, mapGridData.plmVersion) == 0 && Intrinsics.c(this.majorVersion, mapGridData.majorVersion) && Intrinsics.c(this.version, mapGridData.version);
                }

                public final byte getDone() {
                    return this.Done;
                }

                @NotNull
                public final GmmPdf getGmmpdf() {
                    return this.gmmpdf;
                }

                @Nullable
                public final Double getMajorVersion() {
                    return this.majorVersion;
                }

                @NotNull
                public final String getMapId() {
                    return this.mapId;
                }

                @NotNull
                public final Grid getMgrid() {
                    return this.mgrid;
                }

                @NotNull
                public final CoarseGrid getMgridcoarse() {
                    return this.mgridcoarse;
                }

                @NotNull
                public final CoarseRange getMgridcoarsexqRange() {
                    return this.mgridcoarsexqRange;
                }

                @NotNull
                public final CoarseRange getMgridcoarseyqRange() {
                    return this.mgridcoarseyqRange;
                }

                @NotNull
                public final Range getMgridxqRange() {
                    return this.mgridxqRange;
                }

                @NotNull
                public final Range getMgridyqRange() {
                    return this.mgridyqRange;
                }

                public final double getPlmVersion() {
                    return this.plmVersion;
                }

                @Nullable
                public final Double getVersion() {
                    return this.version;
                }

                public int hashCode() {
                    int iA = me.oriient.positioningengine.common.v.a(this.plmVersion, (Byte.hashCode(this.Done) + ((this.gmmpdf.hashCode() + ((this.mgridcoarseyqRange.hashCode() + ((this.mgridcoarsexqRange.hashCode() + ((this.mgridcoarse.hashCode() + ((this.mgridyqRange.hashCode() + ((this.mgridxqRange.hashCode() + ((this.mgrid.hashCode() + (this.mapId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
                    Double d = this.majorVersion;
                    int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
                    Double d2 = this.version;
                    return iHashCode + (d2 != null ? d2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "MapGridData(mapId=" + this.mapId + ", mgrid=" + this.mgrid + ", mgridxqRange=" + this.mgridxqRange + ", mgridyqRange=" + this.mgridyqRange + ", mgridcoarse=" + this.mgridcoarse + ", mgridcoarsexqRange=" + this.mgridcoarsexqRange + ", mgridcoarseyqRange=" + this.mgridcoarseyqRange + ", gmmpdf=" + this.gmmpdf + ", Done=" + ((int) this.Done) + ", plmVersion=" + this.plmVersion + ", majorVersion=" + this.majorVersion + ", version=" + this.version + ')';
                }

                public MapGridData(@NotNull String mapId, @NotNull Grid mgrid, @NotNull Range mgridxqRange, @NotNull Range mgridyqRange, @NotNull CoarseGrid mgridcoarse, @NotNull CoarseRange mgridcoarsexqRange, @NotNull CoarseRange mgridcoarseyqRange, @NotNull GmmPdf gmmpdf, byte b, double d, @Nullable Double d2, @Nullable Double d3) {
                    Intrinsics.h(mapId, "mapId");
                    Intrinsics.h(mgrid, "mgrid");
                    Intrinsics.h(mgridxqRange, "mgridxqRange");
                    Intrinsics.h(mgridyqRange, "mgridyqRange");
                    Intrinsics.h(mgridcoarse, "mgridcoarse");
                    Intrinsics.h(mgridcoarsexqRange, "mgridcoarsexqRange");
                    Intrinsics.h(mgridcoarseyqRange, "mgridcoarseyqRange");
                    Intrinsics.h(gmmpdf, "gmmpdf");
                    this.mapId = mapId;
                    this.mgrid = mgrid;
                    this.mgridxqRange = mgridxqRange;
                    this.mgridyqRange = mgridyqRange;
                    this.mgridcoarse = mgridcoarse;
                    this.mgridcoarsexqRange = mgridcoarsexqRange;
                    this.mgridcoarseyqRange = mgridcoarseyqRange;
                    this.gmmpdf = gmmpdf;
                    this.Done = b;
                    this.plmVersion = d;
                    this.majorVersion = d2;
                    this.version = d3;
                }

                @Keep
                @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006!"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange;", "", "seen1", "", "min", "", "max", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(FF)V", "getMax", "()F", "getMin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                public static final /* data */ class CoarseRange {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    @NotNull
                    public static final Companion INSTANCE = new Companion();
                    private final float max;
                    private final float min;

                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$CoarseRange;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final class Companion {
                        @NotNull
                        public final KSerializer<CoarseRange> serializer() {
                            return MappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer.INSTANCE;
                        }
                    }

                    public CoarseRange(float f, float f2) {
                        this.min = f;
                        this.max = f2;
                    }

                    public static /* synthetic */ CoarseRange copy$default(CoarseRange coarseRange, float f, float f2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            f = coarseRange.min;
                        }
                        if ((i & 2) != 0) {
                            f2 = coarseRange.max;
                        }
                        return coarseRange.copy(f, f2);
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(CoarseRange self, CompositeEncoder output, SerialDescriptor serialDesc) {
                        output.B(serialDesc, 0, self.min);
                        output.B(serialDesc, 1, self.max);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final float getMin() {
                        return this.min;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final float getMax() {
                        return this.max;
                    }

                    @NotNull
                    public final CoarseRange copy(float min, float max) {
                        return new CoarseRange(min, max);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof CoarseRange)) {
                            return false;
                        }
                        CoarseRange coarseRange = (CoarseRange) other;
                        return Float.compare(this.min, coarseRange.min) == 0 && Float.compare(this.max, coarseRange.max) == 0;
                    }

                    public final float getMax() {
                        return this.max;
                    }

                    public final float getMin() {
                        return this.min;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.max) + (Float.hashCode(this.min) * 31);
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder sb = new StringBuilder("CoarseRange(min=");
                        sb.append(this.min);
                        sb.append(", max=");
                        return android.support.v4.media.session.a.r(sb, this.max, ')');
                    }

                    @Deprecated
                    public /* synthetic */ CoarseRange(int i, float f, float f2, SerializationConstructorMarker serializationConstructorMarker) {
                        if (3 != (i & 3)) {
                            PluginExceptionsKt.a(i, 3, MappingData$Map$MapGrid$MapGridData$CoarseRange$$serializer.INSTANCE.getB());
                            throw null;
                        }
                        this.min = f;
                        this.max = f2;
                    }
                }

                @Keep
                @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006!"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range;", "", "seen1", "", "min", "", "max", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DD)V", "getMax", "()D", "getMin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                public static final /* data */ class Range {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    @NotNull
                    public static final Companion INSTANCE = new Companion();
                    private final double max;
                    private final double min;

                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$Map$MapGrid$MapGridData$Range;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final class Companion {
                        @NotNull
                        public final KSerializer<Range> serializer() {
                            return MappingData$Map$MapGrid$MapGridData$Range$$serializer.INSTANCE;
                        }
                    }

                    public Range(double d, double d2) {
                        this.min = d;
                        this.max = d2;
                    }

                    public static /* synthetic */ Range copy$default(Range range, double d, double d2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            d = range.min;
                        }
                        if ((i & 2) != 0) {
                            d2 = range.max;
                        }
                        return range.copy(d, d2);
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(Range self, CompositeEncoder output, SerialDescriptor serialDesc) {
                        output.G(serialDesc, 0, self.min);
                        output.G(serialDesc, 1, self.max);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final double getMin() {
                        return this.min;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final double getMax() {
                        return this.max;
                    }

                    @NotNull
                    public final Range copy(double min, double max) {
                        return new Range(min, max);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Range)) {
                            return false;
                        }
                        Range range = (Range) other;
                        return Double.compare(this.min, range.min) == 0 && Double.compare(this.max, range.max) == 0;
                    }

                    public final double getMax() {
                        return this.max;
                    }

                    public final double getMin() {
                        return this.min;
                    }

                    public int hashCode() {
                        return Double.hashCode(this.max) + (Double.hashCode(this.min) * 31);
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder sb = new StringBuilder("Range(min=");
                        sb.append(this.min);
                        sb.append(", max=");
                        return me.oriient.positioningengine.common.a.a(sb, this.max, ')');
                    }

                    @Deprecated
                    public /* synthetic */ Range(int i, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
                        if (3 != (i & 3)) {
                            PluginExceptionsKt.a(i, 3, MappingData$Map$MapGrid$MapGridData$Range$$serializer.INSTANCE.getB());
                            throw null;
                        }
                        this.min = d;
                        this.max = d2;
                    }
                }
            }

            public MapGrid(@NotNull MapGridRecord record, @NotNull MapGridData mapGridData) {
                Intrinsics.h(record, "record");
                Intrinsics.h(mapGridData, "mapGridData");
                this.record = record;
                this.mapGridData = mapGridData;
            }

            public static /* synthetic */ MapGrid copy$default(MapGrid mapGrid, MapGridRecord mapGridRecord, MapGridData mapGridData, int i, Object obj) {
                if ((i & 1) != 0) {
                    mapGridRecord = mapGrid.record;
                }
                if ((i & 2) != 0) {
                    mapGridData = mapGrid.mapGridData;
                }
                return mapGrid.copy(mapGridRecord, mapGridData);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final MapGridRecord getRecord() {
                return this.record;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final MapGridData getMapGridData() {
                return this.mapGridData;
            }

            @NotNull
            public final MapGrid copy(@NotNull MapGridRecord record, @NotNull MapGridData mapGridData) {
                Intrinsics.h(record, "record");
                Intrinsics.h(mapGridData, "mapGridData");
                return new MapGrid(record, mapGridData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MapGrid)) {
                    return false;
                }
                MapGrid mapGrid = (MapGrid) other;
                return Intrinsics.c(this.record, mapGrid.record) && Intrinsics.c(this.mapGridData, mapGrid.mapGridData);
            }

            @NotNull
            public final MapGridData getMapGridData() {
                return this.mapGridData;
            }

            @NotNull
            public final MapGridRecord getRecord() {
                return this.record;
            }

            public int hashCode() {
                return this.mapGridData.hashCode() + (this.record.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "MapGrid(record=" + this.record + ", mapGridData=" + this.mapGridData + ')';
            }
        }

        public Map(@NotNull MapGrid mapGrid) {
            Intrinsics.h(mapGrid, "mapGrid");
            this.mapGrid = mapGrid;
        }

        public static /* synthetic */ Map copy$default(Map map, MapGrid mapGrid, int i, Object obj) {
            if ((i & 1) != 0) {
                mapGrid = map.mapGrid;
            }
            return map.copy(mapGrid);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MapGrid getMapGrid() {
            return this.mapGrid;
        }

        @NotNull
        public final Map copy(@NotNull MapGrid mapGrid) {
            Intrinsics.h(mapGrid, "mapGrid");
            return new Map(mapGrid);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Map) && Intrinsics.c(this.mapGrid, ((Map) other).mapGrid);
        }

        @NotNull
        public final MapGrid getMapGrid() {
            return this.mapGrid;
        }

        public int hashCode() {
            return this.mapGrid.hashCode();
        }

        @NotNull
        public String toString() {
            return "Map(mapGrid=" + this.mapGrid + ')';
        }
    }
}
