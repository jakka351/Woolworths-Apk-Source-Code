package me.oriient.ipssdk.realtime.services.tag.model;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 -2\u00020\u0001:\u0002,-B\u0089\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0014J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016¨\u0006."}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/TagRequest;", "", "seen1", "", "timestamp", "", "customerTagId", "ipsClientId", "engineSessionId", "mapId", "floorId", "buildingId", "customerTagMetadata", "position", "Lme/oriient/ipssdk/realtime/services/tag/model/TagPosition;", "osType", "eventType", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/realtime/services/tag/model/TagPosition;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/realtime/services/tag/model/TagPosition;Ljava/lang/String;Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getCustomerTagId", "getCustomerTagMetadata", "getEngineSessionId$annotations", "()V", "getEngineSessionId", "getEventType", "getFloorId", "getIpsClientId", "getMapId", "getOsType", "getPosition", "()Lme/oriient/ipssdk/realtime/services/tag/model/TagPosition;", "getTimestamp", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_realtime", "$serializer", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final class TagRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String buildingId;

    @NotNull
    private final String customerTagId;

    @NotNull
    private final String customerTagMetadata;

    @NotNull
    private final String engineSessionId;

    @NotNull
    private final String eventType;

    @Nullable
    private final String floorId;

    @NotNull
    private final String ipsClientId;

    @Nullable
    private final String mapId;

    @NotNull
    private final String osType;

    @NotNull
    private final TagPosition position;

    @NotNull
    private final String timestamp;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/TagRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/realtime/services/tag/model/TagRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<TagRequest> serializer() {
            return TagRequest$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ TagRequest(int i, String str, String str2, String str3, @SerialName String str4, String str5, String str6, String str7, String str8, TagPosition tagPosition, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.a(i, 2047, TagRequest$$serializer.INSTANCE.getB());
            throw null;
        }
        this.timestamp = str;
        this.customerTagId = str2;
        this.ipsClientId = str3;
        this.engineSessionId = str4;
        this.mapId = str5;
        this.floorId = str6;
        this.buildingId = str7;
        this.customerTagMetadata = str8;
        this.position = tagPosition;
        this.osType = str9;
        this.eventType = str10;
    }

    @SerialName
    public static /* synthetic */ void getEngineSessionId$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_realtime(TagRequest self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.timestamp);
        output.p(serialDesc, 1, self.customerTagId);
        output.p(serialDesc, 2, self.ipsClientId);
        output.p(serialDesc, 3, self.engineSessionId);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        output.w(serialDesc, 4, stringSerializer, self.mapId);
        output.w(serialDesc, 5, stringSerializer, self.floorId);
        output.p(serialDesc, 6, self.buildingId);
        output.p(serialDesc, 7, self.customerTagMetadata);
        output.F(serialDesc, 8, TagPosition$$serializer.INSTANCE, self.position);
        output.p(serialDesc, 9, self.osType);
        output.p(serialDesc, 10, self.eventType);
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
    public final String getEventType() {
        return this.eventType;
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
    public final TagPosition getPosition() {
        return this.position;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    public TagRequest(@NotNull String timestamp, @NotNull String customerTagId, @NotNull String ipsClientId, @NotNull String engineSessionId, @Nullable String str, @Nullable String str2, @NotNull String buildingId, @NotNull String customerTagMetadata, @NotNull TagPosition position, @NotNull String osType, @NotNull String eventType) {
        Intrinsics.h(timestamp, "timestamp");
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(ipsClientId, "ipsClientId");
        Intrinsics.h(engineSessionId, "engineSessionId");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(customerTagMetadata, "customerTagMetadata");
        Intrinsics.h(position, "position");
        Intrinsics.h(osType, "osType");
        Intrinsics.h(eventType, "eventType");
        this.timestamp = timestamp;
        this.customerTagId = customerTagId;
        this.ipsClientId = ipsClientId;
        this.engineSessionId = engineSessionId;
        this.mapId = str;
        this.floorId = str2;
        this.buildingId = buildingId;
        this.customerTagMetadata = customerTagMetadata;
        this.position = position;
        this.osType = osType;
        this.eventType = eventType;
    }
}
