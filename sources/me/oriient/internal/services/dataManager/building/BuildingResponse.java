package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 _2\u00020\u0001:\u0002^_BÕ\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010!B¿\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\"J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0017HÆ\u0003J\t\u0010?\u001a\u00020\u0017HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0017HÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010,J\t\u0010G\u001a\u00020\nHÆ\u0003J\t\u0010H\u001a\u00020\nHÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00106J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003JÞ\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00172\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020\u00172\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\u000e\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0005J\t\u0010U\u001a\u00020\u0005HÖ\u0001J&\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\HÁ\u0001¢\u0006\u0002\b]R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0011\u0010\u001b\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$¨\u0006`"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingResponse;", "", "seen1", "", "buildingId", "", "buildingName", "buildingToEnuRotation", "", "buildingOrigin", "Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;", "geofenceOrigin", "geofenceRadius", "", "primaryFloorId", "floors", "", "Lme/oriient/internal/services/dataManager/building/FloorResponse;", "entrances", "Lme/oriient/internal/services/dataManager/building/EntranceResponse;", "externalRegions", "Lme/oriient/internal/services/dataManager/building/ExternalRegionResponse;", "autoFloorDetection", "", "strictModeEnabled", "clientBuildingId", "displayName", "gpsFusion", "kiosks", "Lme/oriient/internal/services/dataManager/building/KioskResponse;", "buildingMetadata", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V", "getAutoFloorDetection", "()Z", "getBuildingId", "()Ljava/lang/String;", "getBuildingMetadata", "getBuildingName", "getBuildingOrigin", "()Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;", "getBuildingToEnuRotation", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getClientBuildingId", "getDisplayName", "getEntrances", "()Ljava/util/List;", "getExternalRegions", "getFloors", "getGeofenceOrigin", "getGeofenceRadius", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getGpsFusion", "getKiosks", "getPrimaryFloorId", "getStrictModeEnabled", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)Lme/oriient/internal/services/dataManager/building/BuildingResponse;", "equals", "other", "hashCode", "toBuilding", "Lme/oriient/internal/services/dataManager/building/Building;", "spaceId", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class BuildingResponse {
    private final boolean autoFloorDetection;

    @NotNull
    private final String buildingId;

    @Nullable
    private final String buildingMetadata;

    @NotNull
    private final String buildingName;

    @NotNull
    private final WorldCoordinateResponse buildingOrigin;

    @Nullable
    private final Double buildingToEnuRotation;

    @Nullable
    private final String clientBuildingId;

    @NotNull
    private final String displayName;

    @Nullable
    private final List<EntranceResponse> entrances;

    @Nullable
    private final List<ExternalRegionResponse> externalRegions;

    @NotNull
    private final List<FloorResponse> floors;

    @NotNull
    private final WorldCoordinateResponse geofenceOrigin;

    @Nullable
    private final Float geofenceRadius;
    private final boolean gpsFusion;

    @Nullable
    private final List<KioskResponse> kiosks;

    @NotNull
    private final String primaryFloorId;
    private final boolean strictModeEnabled;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(FloorResponse$$serializer.INSTANCE), new ArrayListSerializer(EntranceResponse$$serializer.INSTANCE), new ArrayListSerializer(ExternalRegionResponse$$serializer.INSTANCE), null, null, null, null, null, new ArrayListSerializer(KioskResponse$$serializer.INSTANCE), null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/BuildingResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<BuildingResponse> serializer() {
            return BuildingResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ BuildingResponse(int i, String str, String str2, Double d, WorldCoordinateResponse worldCoordinateResponse, WorldCoordinateResponse worldCoordinateResponse2, Float f, String str3, List list, List list2, List list3, boolean z, boolean z2, String str4, String str5, boolean z3, List list4, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (27775 != (i & 27775)) {
            PluginExceptionsKt.a(i, 27775, BuildingResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.buildingId = str;
        this.buildingName = str2;
        this.buildingToEnuRotation = d;
        this.buildingOrigin = worldCoordinateResponse;
        this.geofenceOrigin = worldCoordinateResponse2;
        this.geofenceRadius = f;
        this.primaryFloorId = str3;
        int i2 = i & 128;
        EmptyList emptyList = EmptyList.d;
        if (i2 == 0) {
            this.floors = emptyList;
        } else {
            this.floors = list;
        }
        if ((i & 256) == 0) {
            this.entrances = emptyList;
        } else {
            this.entrances = list2;
        }
        if ((i & 512) == 0) {
            this.externalRegions = emptyList;
        } else {
            this.externalRegions = list3;
        }
        this.autoFloorDetection = z;
        this.strictModeEnabled = z2;
        if ((i & 4096) == 0) {
            this.clientBuildingId = null;
        } else {
            this.clientBuildingId = str4;
        }
        this.displayName = str5;
        this.gpsFusion = z3;
        if ((32768 & i) == 0) {
            this.kiosks = null;
        } else {
            this.kiosks = list4;
        }
        if ((i & 65536) == 0) {
            this.buildingMetadata = null;
        } else {
            this.buildingMetadata = str6;
        }
    }

    public static /* synthetic */ BuildingResponse copy$default(BuildingResponse buildingResponse, String str, String str2, Double d, WorldCoordinateResponse worldCoordinateResponse, WorldCoordinateResponse worldCoordinateResponse2, Float f, String str3, List list, List list2, List list3, boolean z, boolean z2, String str4, String str5, boolean z3, List list4, String str6, int i, Object obj) {
        String str7;
        List list5;
        String str8;
        BuildingResponse buildingResponse2;
        boolean z4;
        String str9;
        Double d2;
        WorldCoordinateResponse worldCoordinateResponse3;
        WorldCoordinateResponse worldCoordinateResponse4;
        Float f2;
        String str10;
        List list6;
        List list7;
        List list8;
        boolean z5;
        boolean z6;
        String str11;
        String str12;
        String str13 = (i & 1) != 0 ? buildingResponse.buildingId : str;
        String str14 = (i & 2) != 0 ? buildingResponse.buildingName : str2;
        Double d3 = (i & 4) != 0 ? buildingResponse.buildingToEnuRotation : d;
        WorldCoordinateResponse worldCoordinateResponse5 = (i & 8) != 0 ? buildingResponse.buildingOrigin : worldCoordinateResponse;
        WorldCoordinateResponse worldCoordinateResponse6 = (i & 16) != 0 ? buildingResponse.geofenceOrigin : worldCoordinateResponse2;
        Float f3 = (i & 32) != 0 ? buildingResponse.geofenceRadius : f;
        String str15 = (i & 64) != 0 ? buildingResponse.primaryFloorId : str3;
        List list9 = (i & 128) != 0 ? buildingResponse.floors : list;
        List list10 = (i & 256) != 0 ? buildingResponse.entrances : list2;
        List list11 = (i & 512) != 0 ? buildingResponse.externalRegions : list3;
        boolean z7 = (i & 1024) != 0 ? buildingResponse.autoFloorDetection : z;
        boolean z8 = (i & 2048) != 0 ? buildingResponse.strictModeEnabled : z2;
        String str16 = (i & 4096) != 0 ? buildingResponse.clientBuildingId : str4;
        String str17 = (i & 8192) != 0 ? buildingResponse.displayName : str5;
        String str18 = str13;
        boolean z9 = (i & 16384) != 0 ? buildingResponse.gpsFusion : z3;
        List list12 = (i & 32768) != 0 ? buildingResponse.kiosks : list4;
        if ((i & 65536) != 0) {
            list5 = list12;
            str7 = buildingResponse.buildingMetadata;
            z4 = z9;
            str9 = str14;
            d2 = d3;
            worldCoordinateResponse3 = worldCoordinateResponse5;
            worldCoordinateResponse4 = worldCoordinateResponse6;
            f2 = f3;
            str10 = str15;
            list6 = list9;
            list7 = list10;
            list8 = list11;
            z5 = z7;
            z6 = z8;
            str11 = str16;
            str12 = str17;
            str8 = str18;
            buildingResponse2 = buildingResponse;
        } else {
            str7 = str6;
            list5 = list12;
            str8 = str18;
            buildingResponse2 = buildingResponse;
            z4 = z9;
            str9 = str14;
            d2 = d3;
            worldCoordinateResponse3 = worldCoordinateResponse5;
            worldCoordinateResponse4 = worldCoordinateResponse6;
            f2 = f3;
            str10 = str15;
            list6 = list9;
            list7 = list10;
            list8 = list11;
            z5 = z7;
            z6 = z8;
            str11 = str16;
            str12 = str17;
        }
        return buildingResponse2.copy(str8, str9, d2, worldCoordinateResponse3, worldCoordinateResponse4, f2, str10, list6, list7, list8, z5, z6, str11, str12, z4, list5, str7);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(BuildingResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.buildingId);
        output.p(serialDesc, 1, self.buildingName);
        output.w(serialDesc, 2, DoubleSerializer.f24792a, self.buildingToEnuRotation);
        WorldCoordinateResponse$$serializer worldCoordinateResponse$$serializer = WorldCoordinateResponse$$serializer.INSTANCE;
        output.F(serialDesc, 3, worldCoordinateResponse$$serializer, self.buildingOrigin);
        output.F(serialDesc, 4, worldCoordinateResponse$$serializer, self.geofenceOrigin);
        output.w(serialDesc, 5, FloatSerializer.f24797a, self.geofenceRadius);
        output.p(serialDesc, 6, self.primaryFloorId);
        boolean zQ = output.q(serialDesc, 7);
        EmptyList emptyList = EmptyList.d;
        if (zQ || !Intrinsics.c(self.floors, emptyList)) {
            output.F(serialDesc, 7, kSerializerArr[7], self.floors);
        }
        if (output.q(serialDesc, 8) || !Intrinsics.c(self.entrances, emptyList)) {
            output.w(serialDesc, 8, kSerializerArr[8], self.entrances);
        }
        if (output.q(serialDesc, 9) || !Intrinsics.c(self.externalRegions, emptyList)) {
            output.w(serialDesc, 9, kSerializerArr[9], self.externalRegions);
        }
        output.o(serialDesc, 10, self.autoFloorDetection);
        output.o(serialDesc, 11, self.strictModeEnabled);
        if (output.q(serialDesc, 12) || self.clientBuildingId != null) {
            output.w(serialDesc, 12, StringSerializer.f24821a, self.clientBuildingId);
        }
        output.p(serialDesc, 13, self.displayName);
        output.o(serialDesc, 14, self.gpsFusion);
        if (output.q(serialDesc, 15) || self.kiosks != null) {
            output.w(serialDesc, 15, kSerializerArr[15], self.kiosks);
        }
        if (!output.q(serialDesc, 16) && self.buildingMetadata == null) {
            return;
        }
        output.w(serialDesc, 16, StringSerializer.f24821a, self.buildingMetadata);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @Nullable
    public final List<ExternalRegionResponse> component10() {
        return this.externalRegions;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getAutoFloorDetection() {
        return this.autoFloorDetection;
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
    public final List<KioskResponse> component16() {
        return this.kiosks;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getBuildingMetadata() {
        return this.buildingMetadata;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBuildingName() {
        return this.buildingName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getBuildingToEnuRotation() {
        return this.buildingToEnuRotation;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final WorldCoordinateResponse getBuildingOrigin() {
        return this.buildingOrigin;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final WorldCoordinateResponse getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getGeofenceRadius() {
        return this.geofenceRadius;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getPrimaryFloorId() {
        return this.primaryFloorId;
    }

    @NotNull
    public final List<FloorResponse> component8() {
        return this.floors;
    }

    @Nullable
    public final List<EntranceResponse> component9() {
        return this.entrances;
    }

    @NotNull
    public final BuildingResponse copy(@NotNull String buildingId, @NotNull String buildingName, @Nullable Double buildingToEnuRotation, @NotNull WorldCoordinateResponse buildingOrigin, @NotNull WorldCoordinateResponse geofenceOrigin, @Nullable Float geofenceRadius, @NotNull String primaryFloorId, @NotNull List<FloorResponse> floors, @Nullable List<EntranceResponse> entrances, @Nullable List<ExternalRegionResponse> externalRegions, boolean autoFloorDetection, boolean strictModeEnabled, @Nullable String clientBuildingId, @NotNull String displayName, boolean gpsFusion, @Nullable List<KioskResponse> kiosks, @Nullable String buildingMetadata) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(buildingName, "buildingName");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(floors, "floors");
        Intrinsics.h(displayName, "displayName");
        return new BuildingResponse(buildingId, buildingName, buildingToEnuRotation, buildingOrigin, geofenceOrigin, geofenceRadius, primaryFloorId, floors, entrances, externalRegions, autoFloorDetection, strictModeEnabled, clientBuildingId, displayName, gpsFusion, kiosks, buildingMetadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildingResponse)) {
            return false;
        }
        BuildingResponse buildingResponse = (BuildingResponse) other;
        return Intrinsics.c(this.buildingId, buildingResponse.buildingId) && Intrinsics.c(this.buildingName, buildingResponse.buildingName) && Intrinsics.c(this.buildingToEnuRotation, buildingResponse.buildingToEnuRotation) && Intrinsics.c(this.buildingOrigin, buildingResponse.buildingOrigin) && Intrinsics.c(this.geofenceOrigin, buildingResponse.geofenceOrigin) && Intrinsics.c(this.geofenceRadius, buildingResponse.geofenceRadius) && Intrinsics.c(this.primaryFloorId, buildingResponse.primaryFloorId) && Intrinsics.c(this.floors, buildingResponse.floors) && Intrinsics.c(this.entrances, buildingResponse.entrances) && Intrinsics.c(this.externalRegions, buildingResponse.externalRegions) && this.autoFloorDetection == buildingResponse.autoFloorDetection && this.strictModeEnabled == buildingResponse.strictModeEnabled && Intrinsics.c(this.clientBuildingId, buildingResponse.clientBuildingId) && Intrinsics.c(this.displayName, buildingResponse.displayName) && this.gpsFusion == buildingResponse.gpsFusion && Intrinsics.c(this.kiosks, buildingResponse.kiosks) && Intrinsics.c(this.buildingMetadata, buildingResponse.buildingMetadata);
    }

    public final boolean getAutoFloorDetection() {
        return this.autoFloorDetection;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @Nullable
    public final String getBuildingMetadata() {
        return this.buildingMetadata;
    }

    @NotNull
    public final String getBuildingName() {
        return this.buildingName;
    }

    @NotNull
    public final WorldCoordinateResponse getBuildingOrigin() {
        return this.buildingOrigin;
    }

    @Nullable
    public final Double getBuildingToEnuRotation() {
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

    @Nullable
    public final List<EntranceResponse> getEntrances() {
        return this.entrances;
    }

    @Nullable
    public final List<ExternalRegionResponse> getExternalRegions() {
        return this.externalRegions;
    }

    @NotNull
    public final List<FloorResponse> getFloors() {
        return this.floors;
    }

    @NotNull
    public final WorldCoordinateResponse getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    @Nullable
    public final Float getGeofenceRadius() {
        return this.geofenceRadius;
    }

    public final boolean getGpsFusion() {
        return this.gpsFusion;
    }

    @Nullable
    public final List<KioskResponse> getKiosks() {
        return this.kiosks;
    }

    @NotNull
    public final String getPrimaryFloorId() {
        return this.primaryFloorId;
    }

    public final boolean getStrictModeEnabled() {
        return this.strictModeEnabled;
    }

    public int hashCode() {
        int iA = me.oriient.internal.infra.rest.a.a(this.buildingName, this.buildingId.hashCode() * 31, 31);
        Double d = this.buildingToEnuRotation;
        int iHashCode = (this.geofenceOrigin.hashCode() + ((this.buildingOrigin.hashCode() + ((iA + (d == null ? 0 : d.hashCode())) * 31)) * 31)) * 31;
        Float f = this.geofenceRadius;
        int iD = androidx.camera.core.impl.b.d(me.oriient.internal.infra.rest.a.a(this.primaryFloorId, (iHashCode + (f == null ? 0 : f.hashCode())) * 31, 31), 31, this.floors);
        List<EntranceResponse> list = this.entrances;
        int iHashCode2 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        List<ExternalRegionResponse> list2 = this.externalRegions;
        int iA2 = me.oriient.internal.infra.scheduler.a.a(this.strictModeEnabled, me.oriient.internal.infra.scheduler.a.a(this.autoFloorDetection, (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31), 31);
        String str = this.clientBuildingId;
        int iA3 = me.oriient.internal.infra.scheduler.a.a(this.gpsFusion, me.oriient.internal.infra.rest.a.a(this.displayName, (iA2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        List<KioskResponse> list3 = this.kiosks;
        int iHashCode3 = (iA3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.buildingMetadata;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @NotNull
    public final Building toBuilding(@NotNull String spaceId) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object next;
        Intrinsics.h(spaceId, "spaceId");
        List<EntranceResponse> list = this.entrances;
        List arrayList3 = EmptyList.d;
        if (list == null) {
            arrayList = arrayList3;
        } else {
            arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((EntranceResponse) it.next()).toEntrance());
            }
        }
        List<KioskResponse> list2 = this.kiosks;
        if (list2 == null) {
            arrayList2 = arrayList3;
        } else {
            arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((KioskResponse) it2.next()).toKiosk());
            }
        }
        List<FloorResponse> list3 = this.floors;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((FloorResponse) it3.next()).toFloor(arrayList, arrayList2));
        }
        Iterator it4 = arrayList4.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
            if (Intrinsics.c(((Floor) next).getId(), this.primaryFloorId)) {
                break;
            }
        }
        Floor floor = (Floor) next;
        if (floor == null) {
            throw new NoSuchElementException("missing primary floor");
        }
        String str = this.buildingId;
        String str2 = this.buildingName;
        WorldCoordinate worldCoordinate = this.buildingOrigin.toWorldCoordinate();
        WorldCoordinate worldCoordinate2 = this.geofenceOrigin.toWorldCoordinate();
        double dFloatValue = this.geofenceRadius != null ? r9.floatValue() : 0.0d;
        Double d = this.buildingToEnuRotation;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        List<ExternalRegionResponse> list4 = this.externalRegions;
        if (list4 != null) {
            arrayList3 = new ArrayList(CollectionsKt.s(list4, 10));
            Iterator it5 = list4.iterator();
            while (it5.hasNext()) {
                arrayList3.add(((ExternalRegionResponse) it5.next()).toExternalRegion(this.buildingId, arrayList));
                str = str;
            }
        }
        return new Building(str, str2, spaceId, worldCoordinate, worldCoordinate2, dFloatValue, dDoubleValue, floor, arrayList4, arrayList3, this.autoFloorDetection, this.strictModeEnabled, this.clientBuildingId, this.displayName, this.gpsFusion, this.buildingMetadata);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BuildingResponse(buildingId=");
        sb.append(this.buildingId);
        sb.append(", buildingName=");
        sb.append(this.buildingName);
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
        sb.append(", floors=");
        sb.append(this.floors);
        sb.append(", entrances=");
        sb.append(this.entrances);
        sb.append(", externalRegions=");
        sb.append(this.externalRegions);
        sb.append(", autoFloorDetection=");
        sb.append(this.autoFloorDetection);
        sb.append(", strictModeEnabled=");
        sb.append(this.strictModeEnabled);
        sb.append(", clientBuildingId=");
        sb.append(this.clientBuildingId);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", gpsFusion=");
        sb.append(this.gpsFusion);
        sb.append(", kiosks=");
        sb.append(this.kiosks);
        sb.append(", buildingMetadata=");
        return androidx.camera.core.impl.b.r(sb, this.buildingMetadata, ')');
    }

    public BuildingResponse(@NotNull String buildingId, @NotNull String buildingName, @Nullable Double d, @NotNull WorldCoordinateResponse buildingOrigin, @NotNull WorldCoordinateResponse geofenceOrigin, @Nullable Float f, @NotNull String primaryFloorId, @NotNull List<FloorResponse> floors, @Nullable List<EntranceResponse> list, @Nullable List<ExternalRegionResponse> list2, boolean z, boolean z2, @Nullable String str, @NotNull String displayName, boolean z3, @Nullable List<KioskResponse> list3, @Nullable String str2) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(buildingName, "buildingName");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(floors, "floors");
        Intrinsics.h(displayName, "displayName");
        this.buildingId = buildingId;
        this.buildingName = buildingName;
        this.buildingToEnuRotation = d;
        this.buildingOrigin = buildingOrigin;
        this.geofenceOrigin = geofenceOrigin;
        this.geofenceRadius = f;
        this.primaryFloorId = primaryFloorId;
        this.floors = floors;
        this.entrances = list;
        this.externalRegions = list2;
        this.autoFloorDetection = z;
        this.strictModeEnabled = z2;
        this.clientBuildingId = str;
        this.displayName = displayName;
        this.gpsFusion = z3;
        this.kiosks = list3;
        this.buildingMetadata = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BuildingResponse(String str, String str2, Double d, WorldCoordinateResponse worldCoordinateResponse, WorldCoordinateResponse worldCoordinateResponse2, Float f, String str3, List list, List list2, List list3, boolean z, boolean z2, String str4, String str5, boolean z3, List list4, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 128;
        EmptyList emptyList = EmptyList.d;
        this(str, str2, d, worldCoordinateResponse, worldCoordinateResponse2, f, str3, i2 != 0 ? emptyList : list, (i & 256) != 0 ? emptyList : list2, (i & 512) != 0 ? emptyList : list3, z, z2, (i & 4096) != 0 ? null : str4, str5, z3, (32768 & i) != 0 ? null : list4, (i & 65536) != 0 ? null : str6);
    }
}
