package me.oriient.ipssdk.common.utils.models;

import YU.a;
import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.db.h;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.base.auth.Domain;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b.\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB×\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003¢\u0006\u0002\u0010\"J\b\u0010J\u001a\u00020\u0003H\u0016R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010$\"\u0004\b/\u00100R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0019\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00103\u001a\u0004\b2\u0010$R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u00100R\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010$\"\u0004\b7\u00100R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0011\u0010\u001b\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010;\"\u0004\b<\u0010=R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010$R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010,R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010,R\u0011\u0010\u001f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010&R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010$R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/TrackingRecordMetadata;", "", "filename", "", "sessionStartTimeMilliUTC", "", "sessionEndTimeMilliUTC", "chunkStartTimeMilliUTC", "chunkEndTimeMilliUTC", "sessionId", "numberInSession", "", "dataFormatVersion", "compression", "mapId", "mapName", h.a.b, "", h.a.c, "batteryLevel", "endReason", "apiKey", "spaceId", "domain", "Lme/oriient/ipssdk/base/auth/Domain;", "buildingId", "buildingName", "floorOrder", "floorId", "isLast", "", "sessionType", "userIdentifier", "extraData", "(Ljava/lang/String;JJJJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApiKey", "()Ljava/lang/String;", "getBatteryLevel", "()I", "setBatteryLevel", "(I)V", "getBuildingId", "getBuildingName", "getChunkEndTimeMilliUTC", "()J", "getChunkStartTimeMilliUTC", "getCompression", "setCompression", "(Ljava/lang/String;)V", "getDataFormatVersion", "getDomain-2cSLe5A", "Ljava/lang/String;", "getEndReason", "setEndReason", "getExtraData", "setExtraData", "getFilename", "getFloorId", "getFloorOrder", "()Z", "setLast", "(Z)V", "getLatitude", "()D", "getLongitude", "getMapId", "getMapName", "getNumberInSession", "getSessionEndTimeMilliUTC", "getSessionId", "getSessionStartTimeMilliUTC", "getSessionType", "getSpaceId", "getUserIdentifier", "toString", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrackingRecordMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String apiKey;
    private int batteryLevel;

    @NotNull
    private final String buildingId;

    @NotNull
    private final String buildingName;
    private final long chunkEndTimeMilliUTC;
    private final long chunkStartTimeMilliUTC;

    @NotNull
    private String compression;
    private final int dataFormatVersion;

    @NotNull
    private final String domain;

    @NotNull
    private String endReason;

    @NotNull
    private String extraData;

    @NotNull
    private final String filename;

    @NotNull
    private final String floorId;
    private final int floorOrder;
    private boolean isLast;
    private final double latitude;
    private final double longitude;

    @NotNull
    private final String mapId;

    @NotNull
    private final String mapName;
    private final int numberInSession;
    private final long sessionEndTimeMilliUTC;

    @NotNull
    private final String sessionId;
    private final long sessionStartTimeMilliUTC;
    private final int sessionType;

    @NotNull
    private final String spaceId;

    @NotNull
    private final String userIdentifier;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001Já\u0001\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u0002H\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lme/oriient/ipssdk/common/utils/models/TrackingRecordMetadata$Companion;", "", "", "filename", "", "sessionStartTimeMilliUTC", "sessionEndTimeMilliUTC", "chunkStartTimeMilliUTC", "chunkEndTimeMilliUTC", "sessionId", "", "numberInSession", "dataFormatVersion", "compression", "mapId", "mapName", "", h.a.b, h.a.c, "batteryLevel", "endReason", "apiKey", "spaceId", "domain", "buildingId", "buildingName", "floorOrder", "floorId", "", "isLast", "sessionType", "userIdentifier", "extraData", "Lme/oriient/ipssdk/common/utils/models/TrackingRecordMetadata;", "createForJava", "(Ljava/lang/String;JJJJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;)Lme/oriient/ipssdk/common/utils/models/TrackingRecordMetadata;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        @NotNull
        public final TrackingRecordMetadata createForJava(@NotNull String filename, long sessionStartTimeMilliUTC, long sessionEndTimeMilliUTC, long chunkStartTimeMilliUTC, long chunkEndTimeMilliUTC, @NotNull String sessionId, int numberInSession, int dataFormatVersion, @NotNull String compression, @NotNull String mapId, @NotNull String mapName, double latitude, double longitude, int batteryLevel, @NotNull String endReason, @NotNull String apiKey, @NotNull String spaceId, @NotNull String domain, @NotNull String buildingId, @NotNull String buildingName, int floorOrder, @NotNull String floorId, boolean isLast, int sessionType, @NotNull String userIdentifier, @NotNull String extraData) {
            Intrinsics.h(filename, "filename");
            Intrinsics.h(sessionId, "sessionId");
            Intrinsics.h(compression, "compression");
            Intrinsics.h(mapId, "mapId");
            Intrinsics.h(mapName, "mapName");
            Intrinsics.h(endReason, "endReason");
            Intrinsics.h(apiKey, "apiKey");
            Intrinsics.h(spaceId, "spaceId");
            Intrinsics.h(domain, "domain");
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(buildingName, "buildingName");
            Intrinsics.h(floorId, "floorId");
            Intrinsics.h(userIdentifier, "userIdentifier");
            Intrinsics.h(extraData, "extraData");
            return new TrackingRecordMetadata(filename, sessionStartTimeMilliUTC, sessionEndTimeMilliUTC, chunkStartTimeMilliUTC, chunkEndTimeMilliUTC, sessionId, numberInSession, dataFormatVersion, compression, mapId, mapName, latitude, longitude, batteryLevel, endReason, apiKey, spaceId, Domain.m404constructorimpl(domain), buildingId, buildingName, floorOrder, floorId, isLast, sessionType, userIdentifier, extraData, null);
        }
    }

    public /* synthetic */ TrackingRecordMetadata(String str, long j, long j2, long j3, long j4, String str2, int i, int i2, String str3, String str4, String str5, double d, double d2, int i3, String str6, String str7, String str8, String str9, String str10, String str11, int i4, String str12, boolean z, int i5, String str13, String str14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, j3, j4, str2, i, i2, str3, str4, str5, d, d2, i3, str6, str7, str8, str9, str10, str11, i4, str12, z, i5, str13, str14);
    }

    @JvmStatic
    @NotNull
    public static final TrackingRecordMetadata createForJava(@NotNull String str, long j, long j2, long j3, long j4, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4, @NotNull String str5, double d, double d2, int i3, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i4, @NotNull String str12, boolean z, int i5, @NotNull String str13, @NotNull String str14) {
        return INSTANCE.createForJava(str, j, j2, j3, j4, str2, i, i2, str3, str4, str5, d, d2, i3, str6, str7, str8, str9, str10, str11, i4, str12, z, i5, str13, str14);
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getBuildingName() {
        return this.buildingName;
    }

    public final long getChunkEndTimeMilliUTC() {
        return this.chunkEndTimeMilliUTC;
    }

    public final long getChunkStartTimeMilliUTC() {
        return this.chunkStartTimeMilliUTC;
    }

    @NotNull
    public final String getCompression() {
        return this.compression;
    }

    public final int getDataFormatVersion() {
        return this.dataFormatVersion;
    }

    @NotNull
    /* renamed from: getDomain-2cSLe5A, reason: not valid java name and from getter */
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getEndReason() {
        return this.endReason;
    }

    @NotNull
    public final String getExtraData() {
        return this.extraData;
    }

    @NotNull
    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public final int getFloorOrder() {
        return this.floorOrder;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final String getMapId() {
        return this.mapId;
    }

    @NotNull
    public final String getMapName() {
        return this.mapName;
    }

    public final int getNumberInSession() {
        return this.numberInSession;
    }

    public final long getSessionEndTimeMilliUTC() {
        return this.sessionEndTimeMilliUTC;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getSessionStartTimeMilliUTC() {
        return this.sessionStartTimeMilliUTC;
    }

    public final int getSessionType() {
        return this.sessionType;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    public final String getUserIdentifier() {
        return this.userIdentifier;
    }

    /* renamed from: isLast, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    public final void setBatteryLevel(int i) {
        this.batteryLevel = i;
    }

    public final void setCompression(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.compression = str;
    }

    public final void setEndReason(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.endReason = str;
    }

    public final void setExtraData(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.extraData = str;
    }

    public final void setLast(boolean z) {
        this.isLast = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TrackingRecordMetadata(filename='");
        sb.append(this.filename);
        sb.append("', sessionStartTimeMilliUTC=");
        sb.append(this.sessionStartTimeMilliUTC);
        sb.append(", sessionStopTimeMilliUTC=");
        sb.append(this.sessionEndTimeMilliUTC);
        sb.append(", chunkStartTimeMilliUTC=");
        sb.append(this.chunkStartTimeMilliUTC);
        sb.append(", chunkEndTimeMilliUTC=");
        sb.append(this.chunkEndTimeMilliUTC);
        sb.append(", sessionId='");
        sb.append(this.sessionId);
        sb.append("', numberInSession=");
        sb.append(this.numberInSession);
        sb.append(", dataFormatVersion=");
        sb.append(this.dataFormatVersion);
        sb.append(", compression='");
        sb.append(this.compression);
        sb.append("', mapId='");
        sb.append(this.mapId);
        sb.append("', mapName='");
        sb.append(this.mapName);
        sb.append("', latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", batteryLevel=");
        sb.append(this.batteryLevel);
        sb.append(", endReason='");
        sb.append(this.endReason);
        sb.append("', apiKey='");
        sb.append(this.apiKey);
        sb.append("', spaceId='");
        sb.append(this.spaceId);
        sb.append("', buildingId='");
        sb.append(this.buildingId);
        sb.append("', buildingName='");
        sb.append(this.buildingName);
        sb.append("', floorOrder=");
        sb.append(this.floorOrder);
        sb.append(", floorId='");
        sb.append(this.floorId);
        sb.append("', isLast=");
        sb.append(this.isLast);
        sb.append(", sessionType=");
        sb.append(this.sessionType);
        sb.append(", userIdentifier=");
        sb.append(this.userIdentifier);
        sb.append(", extraData='");
        return a.o(sb, this.extraData, "')");
    }

    private TrackingRecordMetadata(String filename, long j, long j2, long j3, long j4, String sessionId, int i, int i2, String compression, String mapId, String mapName, double d, double d2, int i3, String endReason, String apiKey, String spaceId, String domain, String buildingId, String buildingName, int i4, String floorId, boolean z, int i5, String userIdentifier, String extraData) {
        Intrinsics.h(filename, "filename");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(compression, "compression");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(mapName, "mapName");
        Intrinsics.h(endReason, "endReason");
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(domain, "domain");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(buildingName, "buildingName");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(userIdentifier, "userIdentifier");
        Intrinsics.h(extraData, "extraData");
        this.filename = filename;
        this.sessionStartTimeMilliUTC = j;
        this.sessionEndTimeMilliUTC = j2;
        this.chunkStartTimeMilliUTC = j3;
        this.chunkEndTimeMilliUTC = j4;
        this.sessionId = sessionId;
        this.numberInSession = i;
        this.dataFormatVersion = i2;
        this.compression = compression;
        this.mapId = mapId;
        this.mapName = mapName;
        this.latitude = d;
        this.longitude = d2;
        this.batteryLevel = i3;
        this.endReason = endReason;
        this.apiKey = apiKey;
        this.spaceId = spaceId;
        this.domain = domain;
        this.buildingId = buildingId;
        this.buildingName = buildingName;
        this.floorOrder = i4;
        this.floorId = floorId;
        this.isLast = z;
        this.sessionType = i5;
        this.userIdentifier = userIdentifier;
        this.extraData = extraData;
    }

    public /* synthetic */ TrackingRecordMetadata(String str, long j, long j2, long j3, long j4, String str2, int i, int i2, String str3, String str4, String str5, double d, double d2, int i3, String str6, String str7, String str8, String str9, String str10, String str11, int i4, String str12, boolean z, int i5, String str13, String str14, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, j3, j4, str2, i, i2, str3, str4, str5, d, d2, i3, str6, str7, str8, str9, str10, str11, i4, str12, z, i5, str13, (i6 & 33554432) != 0 ? "" : str14, null);
    }
}
