package me.oriient.ipssdk.realtime.services.tag.model;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 62\u00020\u0001:\u00016Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0010HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J{\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\u0006\u00103\u001a\u000204J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00067"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/EventTag;", "Ljava/io/Serializable;", "timestamp", "", "customerTagId", "", "ipsClientId", "engineSessionId", "mapId", "floorId", "buildingId", "customerTagMetadata", "position", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagPosition;", "osType", "eventTagType", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/realtime/services/tag/model/EventTagPosition;Ljava/lang/String;Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType;)V", "getBuildingId", "()Ljava/lang/String;", "getCustomerTagId", "getCustomerTagMetadata", "getEngineSessionId", "getEventTagType", "()Lme/oriient/ipssdk/realtime/services/tag/model/EventTagType;", "getFloorId", "getIpsClientId", "getMapId", "getOsType", "getPosition", "()Lme/oriient/ipssdk/realtime/services/tag/model/EventTagPosition;", "getTimestamp", "()J", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toRequest", "Lme/oriient/ipssdk/realtime/services/tag/model/TagRequest;", "toString", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class EventTag implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final String buildingId;

    @NotNull
    private final String customerTagId;

    @NotNull
    private final String customerTagMetadata;

    @NotNull
    private final String engineSessionId;

    @NotNull
    private final EventTagType eventTagType;

    @Nullable
    private final String floorId;

    @NotNull
    private final String ipsClientId;

    @Nullable
    private final String mapId;

    @NotNull
    private final String osType;

    @NotNull
    private final EventTagPosition position;
    private final long timestamp;

    public EventTag(long j, @NotNull String customerTagId, @NotNull String ipsClientId, @NotNull String engineSessionId, @Nullable String str, @Nullable String str2, @NotNull String buildingId, @NotNull String customerTagMetadata, @NotNull EventTagPosition position, @NotNull String osType, @NotNull EventTagType eventTagType) {
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(ipsClientId, "ipsClientId");
        Intrinsics.h(engineSessionId, "engineSessionId");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(customerTagMetadata, "customerTagMetadata");
        Intrinsics.h(position, "position");
        Intrinsics.h(osType, "osType");
        Intrinsics.h(eventTagType, "eventTagType");
        this.timestamp = j;
        this.customerTagId = customerTagId;
        this.ipsClientId = ipsClientId;
        this.engineSessionId = engineSessionId;
        this.mapId = str;
        this.floorId = str2;
        this.buildingId = buildingId;
        this.customerTagMetadata = customerTagMetadata;
        this.position = position;
        this.osType = osType;
        this.eventTagType = eventTagType;
    }

    public static /* synthetic */ EventTag copy$default(EventTag eventTag, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, EventTagPosition eventTagPosition, String str8, EventTagType eventTagType, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eventTag.timestamp;
        }
        return eventTag.copy(j, (i & 2) != 0 ? eventTag.customerTagId : str, (i & 4) != 0 ? eventTag.ipsClientId : str2, (i & 8) != 0 ? eventTag.engineSessionId : str3, (i & 16) != 0 ? eventTag.mapId : str4, (i & 32) != 0 ? eventTag.floorId : str5, (i & 64) != 0 ? eventTag.buildingId : str6, (i & 128) != 0 ? eventTag.customerTagMetadata : str7, (i & 256) != 0 ? eventTag.position : eventTagPosition, (i & 512) != 0 ? eventTag.osType : str8, (i & 1024) != 0 ? eventTag.eventTagType : eventTagType);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getOsType() {
        return this.osType;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final EventTagType getEventTagType() {
        return this.eventTagType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCustomerTagId() {
        return this.customerTagId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIpsClientId() {
        return this.ipsClientId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getEngineSessionId() {
        return this.engineSessionId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getCustomerTagMetadata() {
        return this.customerTagMetadata;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final EventTagPosition getPosition() {
        return this.position;
    }

    @NotNull
    public final EventTag copy(long timestamp, @NotNull String customerTagId, @NotNull String ipsClientId, @NotNull String engineSessionId, @Nullable String mapId, @Nullable String floorId, @NotNull String buildingId, @NotNull String customerTagMetadata, @NotNull EventTagPosition position, @NotNull String osType, @NotNull EventTagType eventTagType) {
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(ipsClientId, "ipsClientId");
        Intrinsics.h(engineSessionId, "engineSessionId");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(customerTagMetadata, "customerTagMetadata");
        Intrinsics.h(position, "position");
        Intrinsics.h(osType, "osType");
        Intrinsics.h(eventTagType, "eventTagType");
        return new EventTag(timestamp, customerTagId, ipsClientId, engineSessionId, mapId, floorId, buildingId, customerTagMetadata, position, osType, eventTagType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTag)) {
            return false;
        }
        EventTag eventTag = (EventTag) other;
        return this.timestamp == eventTag.timestamp && Intrinsics.c(this.customerTagId, eventTag.customerTagId) && Intrinsics.c(this.ipsClientId, eventTag.ipsClientId) && Intrinsics.c(this.engineSessionId, eventTag.engineSessionId) && Intrinsics.c(this.mapId, eventTag.mapId) && Intrinsics.c(this.floorId, eventTag.floorId) && Intrinsics.c(this.buildingId, eventTag.buildingId) && Intrinsics.c(this.customerTagMetadata, eventTag.customerTagMetadata) && Intrinsics.c(this.position, eventTag.position) && Intrinsics.c(this.osType, eventTag.osType) && Intrinsics.c(this.eventTagType, eventTag.eventTagType);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getCustomerTagId() {
        return this.customerTagId;
    }

    @NotNull
    public final String getCustomerTagMetadata() {
        return this.customerTagMetadata;
    }

    @NotNull
    public final String getEngineSessionId() {
        return this.engineSessionId;
    }

    @NotNull
    public final EventTagType getEventTagType() {
        return this.eventTagType;
    }

    @Nullable
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final String getIpsClientId() {
        return this.ipsClientId;
    }

    @Nullable
    public final String getMapId() {
        return this.mapId;
    }

    @NotNull
    public final String getOsType() {
        return this.osType;
    }

    @NotNull
    public final EventTagPosition getPosition() {
        return this.position;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iC = b.c(b.c(b.c(Long.hashCode(this.timestamp) * 31, 31, this.customerTagId), 31, this.ipsClientId), 31, this.engineSessionId);
        String str = this.mapId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.floorId;
        return this.eventTagType.hashCode() + b.c((this.position.hashCode() + b.c(b.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.buildingId), 31, this.customerTagMetadata)) * 31, 31, this.osType);
    }

    @NotNull
    public final TagRequest toRequest() {
        return new TagRequest(ExtensionsKt.toIos8601WithoutTimezone(this.timestamp, ((TimeProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(TimeProvider.class))).getTimeZoneGmt()), this.customerTagId, this.ipsClientId, this.engineSessionId, this.mapId, this.floorId, this.buildingId, this.customerTagMetadata, new TagPosition(this.position.getX(), this.position.getY(), this.position.getZ(), this.position.getAccuracy(), this.position.getLockProgress(), this.position.getTravelDistance()), this.osType, this.eventTagType.getValue());
    }

    @NotNull
    public String toString() {
        return "EventTag(timestamp=" + this.timestamp + ", customerTagId=" + this.customerTagId + ", ipsClientId=" + this.ipsClientId + ", engineSessionId=" + this.engineSessionId + ", mapId=" + this.mapId + ", floorId=" + this.floorId + ", buildingId=" + this.buildingId + ", customerTagMetadata=" + this.customerTagMetadata + ", position=" + this.position + ", osType=" + this.osType + ", eventTagType=" + this.eventTagType + ')';
    }
}
