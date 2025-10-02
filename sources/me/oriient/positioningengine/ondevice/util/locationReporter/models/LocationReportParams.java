package me.oriient.positioningengine.ondevice.util.locationReporter.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.positioningengine.common.x;
import me.oriient.positioningengine.common.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002;<B{\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013B[\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0014J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003Js\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\b\u00100\u001a\u000201H\u0016J\t\u00102\u001a\u00020\u0005HÖ\u0001J&\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209HÁ\u0001¢\u0006\u0002\b:R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u0006="}, d2 = {"Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportParams;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "seen1", "", "spaceId", "", "buildingId", "floorId", "mapId", "startTime", "isOutOfGeofence", "", "sessionId", "startPosition", "Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportStartPosition;", "senderId", "senderName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportStartPosition;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportStartPosition;Ljava/lang/String;Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getFloorId", "()Z", "getMapId", "getSenderId", "getSenderName", "getSessionId", "getSpaceId", "getStartPosition", "()Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportStartPosition;", "getStartTime", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toJsonElement", "Lkotlinx/serialization/json/JsonElement;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class LocationReportParams implements Jsonable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String buildingId;

    @Nullable
    private final String floorId;
    private final boolean isOutOfGeofence;

    @Nullable
    private final String mapId;

    @NotNull
    private final String senderId;

    @NotNull
    private final String senderName;

    @NotNull
    private final String sessionId;

    @NotNull
    private final String spaceId;

    @Nullable
    private final LocationReportStartPosition startPosition;

    @NotNull
    private final String startTime;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportParams$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportParams;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<LocationReportParams> serializer() {
            return LocationReportParams$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ LocationReportParams(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, LocationReportStartPosition locationReportStartPosition, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.a(i, 1023, LocationReportParams$$serializer.INSTANCE.getB());
            throw null;
        }
        this.spaceId = str;
        this.buildingId = str2;
        this.floorId = str3;
        this.mapId = str4;
        this.startTime = str5;
        this.isOutOfGeofence = z;
        this.sessionId = str6;
        this.startPosition = locationReportStartPosition;
        this.senderId = str7;
        this.senderName = str8;
    }

    public static /* synthetic */ LocationReportParams copy$default(LocationReportParams locationReportParams, String str, String str2, String str3, String str4, String str5, boolean z, String str6, LocationReportStartPosition locationReportStartPosition, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locationReportParams.spaceId;
        }
        if ((i & 2) != 0) {
            str2 = locationReportParams.buildingId;
        }
        if ((i & 4) != 0) {
            str3 = locationReportParams.floorId;
        }
        if ((i & 8) != 0) {
            str4 = locationReportParams.mapId;
        }
        if ((i & 16) != 0) {
            str5 = locationReportParams.startTime;
        }
        if ((i & 32) != 0) {
            z = locationReportParams.isOutOfGeofence;
        }
        if ((i & 64) != 0) {
            str6 = locationReportParams.sessionId;
        }
        if ((i & 128) != 0) {
            locationReportStartPosition = locationReportParams.startPosition;
        }
        if ((i & 256) != 0) {
            str7 = locationReportParams.senderId;
        }
        if ((i & 512) != 0) {
            str8 = locationReportParams.senderName;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str6;
        LocationReportStartPosition locationReportStartPosition2 = locationReportStartPosition;
        String str12 = str5;
        boolean z2 = z;
        return locationReportParams.copy(str, str2, str3, str4, str12, z2, str11, locationReportStartPosition2, str9, str10);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(LocationReportParams self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.spaceId);
        output.p(serialDesc, 1, self.buildingId);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        output.w(serialDesc, 2, stringSerializer, self.floorId);
        output.w(serialDesc, 3, stringSerializer, self.mapId);
        output.p(serialDesc, 4, self.startTime);
        output.o(serialDesc, 5, self.isOutOfGeofence);
        output.p(serialDesc, 6, self.sessionId);
        output.w(serialDesc, 7, LocationReportStartPosition$$serializer.INSTANCE, self.startPosition);
        output.p(serialDesc, 8, self.senderId);
        output.p(serialDesc, 9, self.senderName);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsOutOfGeofence() {
        return this.isOutOfGeofence;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final LocationReportStartPosition getStartPosition() {
        return this.startPosition;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    @NotNull
    public final LocationReportParams copy(@NotNull String spaceId, @NotNull String buildingId, @Nullable String floorId, @Nullable String mapId, @NotNull String startTime, boolean isOutOfGeofence, @NotNull String sessionId, @Nullable LocationReportStartPosition startPosition, @NotNull String senderId, @NotNull String senderName) {
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(startTime, "startTime");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(senderId, "senderId");
        Intrinsics.h(senderName, "senderName");
        return new LocationReportParams(spaceId, buildingId, floorId, mapId, startTime, isOutOfGeofence, sessionId, startPosition, senderId, senderName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationReportParams)) {
            return false;
        }
        LocationReportParams locationReportParams = (LocationReportParams) other;
        return Intrinsics.c(this.spaceId, locationReportParams.spaceId) && Intrinsics.c(this.buildingId, locationReportParams.buildingId) && Intrinsics.c(this.floorId, locationReportParams.floorId) && Intrinsics.c(this.mapId, locationReportParams.mapId) && Intrinsics.c(this.startTime, locationReportParams.startTime) && this.isOutOfGeofence == locationReportParams.isOutOfGeofence && Intrinsics.c(this.sessionId, locationReportParams.sessionId) && Intrinsics.c(this.startPosition, locationReportParams.startPosition) && Intrinsics.c(this.senderId, locationReportParams.senderId) && Intrinsics.c(this.senderName, locationReportParams.senderName);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @Nullable
    public final String getFloorId() {
        return this.floorId;
    }

    @Nullable
    public final String getMapId() {
        return this.mapId;
    }

    @NotNull
    public final String getSenderId() {
        return this.senderId;
    }

    @NotNull
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    @Nullable
    public final LocationReportStartPosition getStartPosition() {
        return this.startPosition;
    }

    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iA = z.a(this.buildingId, this.spaceId.hashCode() * 31, 31);
        String str = this.floorId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mapId;
        int iA2 = z.a(this.sessionId, x.a(this.isOutOfGeofence, z.a(this.startTime, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        LocationReportStartPosition locationReportStartPosition = this.startPosition;
        return this.senderName.hashCode() + z.a(this.senderId, (iA2 + (locationReportStartPosition != null ? locationReportStartPosition.hashCode() : 0)) * 31, 31);
    }

    public final boolean isOutOfGeofence() {
        return this.isOutOfGeofence;
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        Json.Default r0 = Json.d;
        r0.getClass();
        KSerializer<LocationReportParams> serializer = INSTANCE.serializer();
        Intrinsics.h(serializer, "serializer");
        return TreeJsonEncoderKt.a(r0, this, serializer);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LocationReportParams(spaceId=");
        sb.append(this.spaceId);
        sb.append(", buildingId=");
        sb.append(this.buildingId);
        sb.append(", floorId=");
        sb.append(this.floorId);
        sb.append(", mapId=");
        sb.append(this.mapId);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", isOutOfGeofence=");
        sb.append(this.isOutOfGeofence);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", startPosition=");
        sb.append(this.startPosition);
        sb.append(", senderId=");
        sb.append(this.senderId);
        sb.append(", senderName=");
        return b.r(sb, this.senderName, ')');
    }

    public LocationReportParams(@NotNull String spaceId, @NotNull String buildingId, @Nullable String str, @Nullable String str2, @NotNull String startTime, boolean z, @NotNull String sessionId, @Nullable LocationReportStartPosition locationReportStartPosition, @NotNull String senderId, @NotNull String senderName) {
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(startTime, "startTime");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(senderId, "senderId");
        Intrinsics.h(senderName, "senderName");
        this.spaceId = spaceId;
        this.buildingId = buildingId;
        this.floorId = str;
        this.mapId = str2;
        this.startTime = startTime;
        this.isOutOfGeofence = z;
        this.sessionId = sessionId;
        this.startPosition = locationReportStartPosition;
        this.senderId = senderId;
        this.senderName = senderName;
    }
}
