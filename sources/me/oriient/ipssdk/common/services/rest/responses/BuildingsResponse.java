package me.oriient.ipssdk.common.services.rest.responses;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.ipssdk.common.ofs.L;
import me.oriient.ipssdk.common.utils.ExtensionsKt;
import me.oriient.ipssdk.common.utils.models.BuildingsSearchResultV4;
import me.oriient.ipssdk.common.utils.models.PostProcessable;
import me.oriient.ipssdk.common.utils.models.WorldCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 D2\u00020\u0001:\u0002CDB}\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0002\u0010\u0016J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010#J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jz\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0006\u00108\u001a\u000209J\t\u0010:\u001a\u00020\u0005HÖ\u0001J&\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AHÁ\u0001¢\u0006\u0002\bBR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u000f\u0010%R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018¨\u0006E"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/responses/BuildingsResponse;", "Lme/oriient/ipssdk/common/utils/models/PostProcessable;", "seen1", "", "buildingId", "", "buildingName", "buildingToEnuRotation", "", "buildingOrigin", "Lme/oriient/ipssdk/common/services/rest/responses/WorldCoordinateResponse;", "geofenceOrigin", "geofenceRadius", "", "primaryFloorId", "isFloorDetectionSupported", "", "clientBuildingId", "displayName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lme/oriient/ipssdk/common/services/rest/responses/WorldCoordinateResponse;Lme/oriient/ipssdk/common/services/rest/responses/WorldCoordinateResponse;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lme/oriient/ipssdk/common/services/rest/responses/WorldCoordinateResponse;Lme/oriient/ipssdk/common/services/rest/responses/WorldCoordinateResponse;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getBuildingName", "getBuildingOrigin", "()Lme/oriient/ipssdk/common/services/rest/responses/WorldCoordinateResponse;", "getBuildingToEnuRotation", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getClientBuildingId", "getDisplayName", "getGeofenceOrigin", "getGeofenceRadius", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrimaryFloorId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lme/oriient/ipssdk/common/services/rest/responses/WorldCoordinateResponse;Lme/oriient/ipssdk/common/services/rest/responses/WorldCoordinateResponse;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lme/oriient/ipssdk/common/services/rest/responses/BuildingsResponse;", "equals", "other", "", "hashCode", "toBuildingSearchResultV4", "Lme/oriient/ipssdk/common/utils/models/BuildingsSearchResultV4;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_common", "$serializer", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class BuildingsResponse implements PostProcessable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

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

    @Nullable
    private final Boolean isFloorDetectionSupported;

    @NotNull
    private final String primaryFloorId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/common/services/rest/responses/BuildingsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/common/services/rest/responses/BuildingsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<BuildingsResponse> serializer() {
            return BuildingsResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ BuildingsResponse(int i, String str, String str2, Double d, WorldCoordinateResponse worldCoordinateResponse, WorldCoordinateResponse worldCoordinateResponse2, Float f, String str3, Boolean bool, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (639 != (i & 639)) {
            PluginExceptionsKt.a(i, 639, BuildingsResponse$$serializer.INSTANCE.getB());
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
            this.isFloorDetectionSupported = null;
        } else {
            this.isFloorDetectionSupported = bool;
        }
        if ((i & 256) == 0) {
            this.clientBuildingId = null;
        } else {
            this.clientBuildingId = str4;
        }
        this.displayName = str5;
    }

    public static /* synthetic */ BuildingsResponse copy$default(BuildingsResponse buildingsResponse, String str, String str2, Double d, WorldCoordinateResponse worldCoordinateResponse, WorldCoordinateResponse worldCoordinateResponse2, Float f, String str3, Boolean bool, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildingsResponse.buildingId;
        }
        if ((i & 2) != 0) {
            str2 = buildingsResponse.buildingName;
        }
        if ((i & 4) != 0) {
            d = buildingsResponse.buildingToEnuRotation;
        }
        if ((i & 8) != 0) {
            worldCoordinateResponse = buildingsResponse.buildingOrigin;
        }
        if ((i & 16) != 0) {
            worldCoordinateResponse2 = buildingsResponse.geofenceOrigin;
        }
        if ((i & 32) != 0) {
            f = buildingsResponse.geofenceRadius;
        }
        if ((i & 64) != 0) {
            str3 = buildingsResponse.primaryFloorId;
        }
        if ((i & 128) != 0) {
            bool = buildingsResponse.isFloorDetectionSupported;
        }
        if ((i & 256) != 0) {
            str4 = buildingsResponse.clientBuildingId;
        }
        if ((i & 512) != 0) {
            str5 = buildingsResponse.displayName;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        Boolean bool2 = bool;
        WorldCoordinateResponse worldCoordinateResponse3 = worldCoordinateResponse2;
        Float f2 = f;
        return buildingsResponse.copy(str, str2, d, worldCoordinateResponse, worldCoordinateResponse3, f2, str8, bool2, str6, str7);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_common(BuildingsResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.buildingId);
        output.p(serialDesc, 1, self.buildingName);
        output.w(serialDesc, 2, DoubleSerializer.f24792a, self.buildingToEnuRotation);
        WorldCoordinateResponse$$serializer worldCoordinateResponse$$serializer = WorldCoordinateResponse$$serializer.INSTANCE;
        output.F(serialDesc, 3, worldCoordinateResponse$$serializer, self.buildingOrigin);
        output.F(serialDesc, 4, worldCoordinateResponse$$serializer, self.geofenceOrigin);
        output.w(serialDesc, 5, FloatSerializer.f24797a, self.geofenceRadius);
        output.p(serialDesc, 6, self.primaryFloorId);
        if (output.q(serialDesc, 7) || self.isFloorDetectionSupported != null) {
            output.w(serialDesc, 7, BooleanSerializer.f24779a, self.isFloorDetectionSupported);
        }
        if (output.q(serialDesc, 8) || self.clientBuildingId != null) {
            output.w(serialDesc, 8, StringSerializer.f24821a, self.clientBuildingId);
        }
        output.p(serialDesc, 9, self.displayName);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
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
    public final Boolean getIsFloorDetectionSupported() {
        return this.isFloorDetectionSupported;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getClientBuildingId() {
        return this.clientBuildingId;
    }

    @NotNull
    public final BuildingsResponse copy(@NotNull String buildingId, @NotNull String buildingName, @Nullable Double buildingToEnuRotation, @NotNull WorldCoordinateResponse buildingOrigin, @NotNull WorldCoordinateResponse geofenceOrigin, @Nullable Float geofenceRadius, @NotNull String primaryFloorId, @Nullable Boolean isFloorDetectionSupported, @Nullable String clientBuildingId, @NotNull String displayName) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(buildingName, "buildingName");
        Intrinsics.h(buildingOrigin, "buildingOrigin");
        Intrinsics.h(geofenceOrigin, "geofenceOrigin");
        Intrinsics.h(primaryFloorId, "primaryFloorId");
        Intrinsics.h(displayName, "displayName");
        return new BuildingsResponse(buildingId, buildingName, buildingToEnuRotation, buildingOrigin, geofenceOrigin, geofenceRadius, primaryFloorId, isFloorDetectionSupported, clientBuildingId, displayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildingsResponse)) {
            return false;
        }
        BuildingsResponse buildingsResponse = (BuildingsResponse) other;
        return Intrinsics.c(this.buildingId, buildingsResponse.buildingId) && Intrinsics.c(this.buildingName, buildingsResponse.buildingName) && Intrinsics.c(this.buildingToEnuRotation, buildingsResponse.buildingToEnuRotation) && Intrinsics.c(this.buildingOrigin, buildingsResponse.buildingOrigin) && Intrinsics.c(this.geofenceOrigin, buildingsResponse.geofenceOrigin) && Intrinsics.c(this.geofenceRadius, buildingsResponse.geofenceRadius) && Intrinsics.c(this.primaryFloorId, buildingsResponse.primaryFloorId) && Intrinsics.c(this.isFloorDetectionSupported, buildingsResponse.isFloorDetectionSupported) && Intrinsics.c(this.clientBuildingId, buildingsResponse.clientBuildingId) && Intrinsics.c(this.displayName, buildingsResponse.displayName);
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
        int iA = L.a(this.buildingName, this.buildingId.hashCode() * 31, 31);
        Double d = this.buildingToEnuRotation;
        int iHashCode = (this.geofenceOrigin.hashCode() + ((this.buildingOrigin.hashCode() + ((iA + (d == null ? 0 : d.hashCode())) * 31)) * 31)) * 31;
        Float f = this.geofenceRadius;
        int iA2 = L.a(this.primaryFloorId, (iHashCode + (f == null ? 0 : f.hashCode())) * 31, 31);
        Boolean bool = this.isFloorDetectionSupported;
        int iHashCode2 = (iA2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.clientBuildingId;
        return this.displayName.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Nullable
    public final Boolean isFloorDetectionSupported() {
        return this.isFloorDetectionSupported;
    }

    @NotNull
    public final BuildingsSearchResultV4 toBuildingSearchResultV4() {
        Double dValueOf = Double.valueOf(0.0d);
        String str = this.buildingId;
        String str2 = this.buildingName;
        Double d = this.buildingToEnuRotation;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        WorldCoordinate worldCoordinate = new WorldCoordinate(this.buildingOrigin.getLatitude(), this.buildingOrigin.getLongitude(), ((Number) ExtensionsKt.m437default(this.buildingOrigin.getAltitude(), dValueOf)).doubleValue());
        WorldCoordinate worldCoordinate2 = new WorldCoordinate(this.geofenceOrigin.getLatitude(), this.geofenceOrigin.getLongitude(), ((Number) ExtensionsKt.m437default(this.geofenceOrigin.getAltitude(), dValueOf)).doubleValue());
        Float f = this.geofenceRadius;
        return new BuildingsSearchResultV4(str, str2, dDoubleValue, worldCoordinate, worldCoordinate2, f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED, this.primaryFloorId, this.clientBuildingId, this.displayName);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BuildingsResponse(buildingId=");
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
        sb.append(", isFloorDetectionSupported=");
        sb.append(this.isFloorDetectionSupported);
        sb.append(", clientBuildingId=");
        sb.append(this.clientBuildingId);
        sb.append(", displayName=");
        return b.r(sb, this.displayName, ')');
    }

    public BuildingsResponse(@NotNull String buildingId, @NotNull String buildingName, @Nullable Double d, @NotNull WorldCoordinateResponse buildingOrigin, @NotNull WorldCoordinateResponse geofenceOrigin, @Nullable Float f, @NotNull String primaryFloorId, @Nullable Boolean bool, @Nullable String str, @NotNull String displayName) {
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
        this.isFloorDetectionSupported = bool;
        this.clientBuildingId = str;
        this.displayName = displayName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BuildingsResponse(String str, String str2, Double d, WorldCoordinateResponse worldCoordinateResponse, WorldCoordinateResponse worldCoordinateResponse2, Float f, String str3, Boolean bool, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        bool = (i & 128) != 0 ? null : bool;
        if ((i & 256) != 0) {
            str6 = str5;
            str7 = null;
        } else {
            str6 = str5;
            str7 = str4;
        }
        this(str, str2, d, worldCoordinateResponse, worldCoordinateResponse2, f, str3, bool, str7, str6);
    }
}
