package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 ?2\u00020\u0001:\u0002>?Bs\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0014J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010!J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003Jn\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0006\u00103\u001a\u000204J\t\u00105\u001a\u00020\u0005HÖ\u0001J&\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<HÁ\u0001¢\u0006\u0002\b=R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016¨\u0006@"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingSearchResponse;", "", "seen1", "", "buildingId", "", "buildingName", "buildingToEnuRotation", "", "buildingOrigin", "Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;", "geofenceOrigin", "geofenceRadius", "", "primaryFloorId", "clientBuildingId", "displayName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getBuildingName", "getBuildingOrigin", "()Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;", "getBuildingToEnuRotation", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getClientBuildingId", "getDisplayName", "getGeofenceOrigin", "getGeofenceRadius", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPrimaryFloorId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lme/oriient/internal/services/dataManager/building/BuildingSearchResponse;", "equals", "", "other", "hashCode", "toBuildingSearchResult", "Lme/oriient/internal/services/dataManager/building/BuildingSearchResult;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class BuildingSearchResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String buildingId;

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

    @NotNull
    private final WorldCoordinateResponse geofenceOrigin;

    @Nullable
    private final Float geofenceRadius;

    @NotNull
    private final String primaryFloorId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingSearchResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/BuildingSearchResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<BuildingSearchResponse> serializer() {
            return BuildingSearchResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ BuildingSearchResponse(int i, String str, String str2, Double d, WorldCoordinateResponse worldCoordinateResponse, WorldCoordinateResponse worldCoordinateResponse2, Float f, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (383 != (i & 383)) {
            PluginExceptionsKt.a(i, 383, BuildingSearchResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.buildingId = str;
        this.buildingName = str2;
        this.buildingToEnuRotation = d;
        this.buildingOrigin = worldCoordinateResponse;
        this.geofenceOrigin = worldCoordinateResponse2;
        this.geofenceRadius = f;
        this.primaryFloorId = str3;
        if ((i & 128) == 0) {
            this.clientBuildingId = null;
        } else {
            this.clientBuildingId = str4;
        }
        this.displayName = str5;
    }

    public static /* synthetic */ BuildingSearchResponse copy$default(BuildingSearchResponse buildingSearchResponse, String str, String str2, Double d, WorldCoordinateResponse worldCoordinateResponse, WorldCoordinateResponse worldCoordinateResponse2, Float f, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildingSearchResponse.buildingId;
        }
        if ((i & 2) != 0) {
            str2 = buildingSearchResponse.buildingName;
        }
        if ((i & 4) != 0) {
            d = buildingSearchResponse.buildingToEnuRotation;
        }
        if ((i & 8) != 0) {
            worldCoordinateResponse = buildingSearchResponse.buildingOrigin;
        }
        if ((i & 16) != 0) {
            worldCoordinateResponse2 = buildingSearchResponse.geofenceOrigin;
        }
        if ((i & 32) != 0) {
            f = buildingSearchResponse.geofenceRadius;
        }
        if ((i & 64) != 0) {
            str3 = buildingSearchResponse.primaryFloorId;
        }
        if ((i & 128) != 0) {
            str4 = buildingSearchResponse.clientBuildingId;
        }
        if ((i & 256) != 0) {
            str5 = buildingSearchResponse.displayName;
        }
        String str6 = str4;
        String str7 = str5;
        Float f2 = f;
        String str8 = str3;
        WorldCoordinateResponse worldCoordinateResponse3 = worldCoordinateResponse2;
        Double d2 = d;
        return buildingSearchResponse.copy(str, str2, d2, worldCoordinateResponse, worldCoordinateResponse3, f2, str8, str6, str7);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(BuildingSearchResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.buildingId);
        output.p(serialDesc, 1, self.buildingName);
        output.w(serialDesc, 2, DoubleSerializer.f24792a, self.buildingToEnuRotation);
        WorldCoordinateResponse$$serializer worldCoordinateResponse$$serializer = WorldCoordinateResponse$$serializer.INSTANCE;
        output.F(serialDesc, 3, worldCoordinateResponse$$serializer, self.buildingOrigin);
        output.F(serialDesc, 4, worldCoordinateResponse$$serializer, self.geofenceOrigin);
        output.w(serialDesc, 5, FloatSerializer.f24797a, self.geofenceRadius);
        output.p(serialDesc, 6, self.primaryFloorId);
        if (output.q(serialDesc, 7) || self.clientBuildingId != null) {
            output.w(serialDesc, 7, StringSerializer.f24821a, self.clientBuildingId);
        }
        output.p(serialDesc, 8, self.displayName);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
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
    public final BuildingSearchResponse copy(@NotNull String buildingId, @NotNull String buildingName, @Nullable Double buildingToEnuRotation, @NotNull WorldCoordinateResponse buildingOrigin, @NotNull WorldCoordinateResponse geofenceOrigin, @Nullable Float geofenceRadius, @NotNull String primaryFloorId, @Nullable String clientBuildingId, @NotNull String displayName) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(buildingName, "buildingName");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(displayName, "displayName");
        return new BuildingSearchResponse(buildingId, buildingName, buildingToEnuRotation, buildingOrigin, geofenceOrigin, geofenceRadius, primaryFloorId, clientBuildingId, displayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildingSearchResponse)) {
            return false;
        }
        BuildingSearchResponse buildingSearchResponse = (BuildingSearchResponse) other;
        return Intrinsics.c(this.buildingId, buildingSearchResponse.buildingId) && Intrinsics.c(this.buildingName, buildingSearchResponse.buildingName) && Intrinsics.c(this.buildingToEnuRotation, buildingSearchResponse.buildingToEnuRotation) && Intrinsics.c(this.buildingOrigin, buildingSearchResponse.buildingOrigin) && Intrinsics.c(this.geofenceOrigin, buildingSearchResponse.geofenceOrigin) && Intrinsics.c(this.geofenceRadius, buildingSearchResponse.geofenceRadius) && Intrinsics.c(this.primaryFloorId, buildingSearchResponse.primaryFloorId) && Intrinsics.c(this.clientBuildingId, buildingSearchResponse.clientBuildingId) && Intrinsics.c(this.displayName, buildingSearchResponse.displayName);
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

    @NotNull
    public final WorldCoordinateResponse getGeofenceOrigin() {
        return this.geofenceOrigin;
    }

    @Nullable
    public final Float getGeofenceRadius() {
        return this.geofenceRadius;
    }

    @NotNull
    public final String getPrimaryFloorId() {
        return this.primaryFloorId;
    }

    public int hashCode() {
        int iA = me.oriient.internal.infra.rest.a.a(this.buildingName, this.buildingId.hashCode() * 31, 31);
        Double d = this.buildingToEnuRotation;
        int iHashCode = (this.geofenceOrigin.hashCode() + ((this.buildingOrigin.hashCode() + ((iA + (d == null ? 0 : d.hashCode())) * 31)) * 31)) * 31;
        Float f = this.geofenceRadius;
        int iA2 = me.oriient.internal.infra.rest.a.a(this.primaryFloorId, (iHashCode + (f == null ? 0 : f.hashCode())) * 31, 31);
        String str = this.clientBuildingId;
        return this.displayName.hashCode() + ((iA2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public final BuildingSearchResult toBuildingSearchResult() {
        String str = this.buildingId;
        String str2 = this.buildingName;
        Double d = this.buildingToEnuRotation;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        WorldCoordinate worldCoordinate = this.buildingOrigin.toWorldCoordinate();
        WorldCoordinate worldCoordinate2 = this.geofenceOrigin.toWorldCoordinate();
        Float f = this.geofenceRadius;
        return new BuildingSearchResult(str, str2, dDoubleValue, worldCoordinate, worldCoordinate2, f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED, this.primaryFloorId, this.clientBuildingId, this.displayName);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BuildingSearchResponse(buildingId=");
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
        sb.append(", clientBuildingId=");
        sb.append(this.clientBuildingId);
        sb.append(", displayName=");
        return me.oriient.internal.infra.rest.e.a(sb, this.displayName, ')');
    }

    public BuildingSearchResponse(@NotNull String buildingId, @NotNull String buildingName, @Nullable Double d, @NotNull WorldCoordinateResponse buildingOrigin, @NotNull WorldCoordinateResponse geofenceOrigin, @Nullable Float f, @NotNull String primaryFloorId, @Nullable String str, @NotNull String displayName) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(buildingName, "buildingName");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(displayName, "displayName");
        this.buildingId = buildingId;
        this.buildingName = buildingName;
        this.buildingToEnuRotation = d;
        this.buildingOrigin = buildingOrigin;
        this.geofenceOrigin = geofenceOrigin;
        this.geofenceRadius = f;
        this.primaryFloorId = primaryFloorId;
        this.clientBuildingId = str;
        this.displayName = displayName;
    }

    public /* synthetic */ BuildingSearchResponse(String str, String str2, Double d, WorldCoordinateResponse worldCoordinateResponse, WorldCoordinateResponse worldCoordinateResponse2, Float f, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, worldCoordinateResponse, worldCoordinateResponse2, f, str3, (i & 128) != 0 ? null : str4, str5);
    }
}
