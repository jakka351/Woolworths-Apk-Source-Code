package me.oriient.positioningengine.common;

import com.salesforce.marketingcloud.storage.db.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.uploadingManager.models.UploadableSample;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.ondevice.models.Heading;
import me.oriient.positioningengine.ondevice.models.MainOrientation;
import me.oriient.positioningengine.ondevice.models.Position;
import me.oriient.positioningengine.ondevice.models.Quaternion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0012\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 y2\u00020\u0001:\u0001yBA\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fBÙ\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0011\u0012\u0006\u0010%\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010(J\t\u0010W\u001a\u00020\u0011HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0011HÆ\u0003J\t\u0010Z\u001a\u00020\u0011HÆ\u0003J\t\u0010[\u001a\u00020\u0011HÆ\u0003J\t\u0010\\\u001a\u00020\u001eHÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010_\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\"HÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\t\u0010b\u001a\u00020\u0011HÆ\u0003J\t\u0010c\u001a\u00020\u0011HÆ\u0003J\t\u0010d\u001a\u00020\u0011HÆ\u0003J\t\u0010e\u001a\u00020'HÆ\u0003J\t\u0010f\u001a\u00020\nHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010h\u001a\u00020\u000eHÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\t\u0010j\u001a\u00020\u0011HÆ\u0003J\t\u0010k\u001a\u00020\u0011HÆ\u0003J\t\u0010l\u001a\u00020\u0011HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\t\u0010n\u001a\u00020\u0011HÆ\u0003J\t\u0010o\u001a\u00020\u0011HÆ\u0003J\u0094\u0002\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\n2\b\u0010s\u001a\u0004\u0018\u00010tHÖ\u0003J\t\u0010u\u001a\u00020 HÖ\u0001J\t\u0010v\u001a\u00020\"HÖ\u0001J_\u0010w\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010xR\u0011\u0010%\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u001b\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010\u0018\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0014\u00100\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0015\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010;R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0011\u0010\u001a\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0011\u0010\u0015\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bC\u00104R\u0014\u0010D\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0014\u0010M\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u00102R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bO\u0010*R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u00102R\u0011\u0010\u0019\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010*R\u0011\u0010\u001c\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bR\u0010*R\u0011\u0010$\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bS\u0010*R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bT\u0010*R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bU\u0010*R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010.\u001a\u0004\bV\u0010-¨\u0006z"}, d2 = {"Lme/oriient/positioningengine/common/PositioningUpdate;", "Lme/oriient/internal/services/uploadingManager/models/UploadableSample;", "position", "Lme/oriient/positioningengine/ondevice/models/Position;", "serverTimeMillis", "", "timeDeterminedMillis", "mainOrientation", "Lme/oriient/positioningengine/ondevice/models/MainOrientation;", "isSmartCartMode", "", "restrictedArea", "Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$RestrictedArea;", "pdrClassification", "Lme/oriient/positioningengine/common/PDRClassification;", "(Lme/oriient/positioningengine/ondevice/models/Position;JJLme/oriient/positioningengine/ondevice/models/MainOrientation;ZLme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$RestrictedArea;Lme/oriient/positioningengine/common/PDRClassification;)V", "x", "", "y", "z", "timeBetweenUpdatesMilli", h.a.c, h.a.b, "altitude", "azimuth", "traveledDistance", "lockProgress", "accuracy", "uncertainty", "heading", "Lme/oriient/positioningengine/ondevice/models/Heading;", "floorOrder", "", "mapId", "", "floorId", "velocity", "a0", "latestQuaternion", "Lme/oriient/positioningengine/ondevice/models/Quaternion;", "(DDLjava/lang/Double;DDDLjava/lang/Double;DDJDDDLme/oriient/positioningengine/ondevice/models/Heading;Lme/oriient/positioningengine/ondevice/models/MainOrientation;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JDDLme/oriient/positioningengine/ondevice/models/Quaternion;ZLme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$RestrictedArea;Lme/oriient/positioningengine/common/PDRClassification;)V", "getA0", "()D", "getAccuracy", "getAltitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAzimuth", "endTimeMillis", "getEndTimeMillis", "()J", "getFloorId", "()Ljava/lang/String;", "getFloorOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeading", "()Lme/oriient/positioningengine/ondevice/models/Heading;", "isLocked", "()Z", "getLatestQuaternion", "()Lme/oriient/positioningengine/ondevice/models/Quaternion;", "getLatitude", "getLockProgress", "getLongitude", "getMainOrientation", "()Lme/oriient/positioningengine/ondevice/models/MainOrientation;", "getMapId", "payload", "", "getPayload", "()[B", "getPdrClassification", "()Lme/oriient/positioningengine/common/PDRClassification;", "getRestrictedArea", "()Lme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$RestrictedArea;", "getServerTimeMillis", "startTimeMillis", "getStartTimeMillis", "getTimeBetweenUpdatesMilli", "getTimeDeterminedMillis", "getTraveledDistance", "getUncertainty", "getVelocity", "getX", "getY", "getZ", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(DDLjava/lang/Double;DDDLjava/lang/Double;DDJDDDLme/oriient/positioningengine/ondevice/models/Heading;Lme/oriient/positioningengine/ondevice/models/MainOrientation;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JDDLme/oriient/positioningengine/ondevice/models/Quaternion;ZLme/oriient/positioningengine/ondevice/mappingData/MappingData$FloorFullData$RestrictedArea;Lme/oriient/positioningengine/common/PDRClassification;)Lme/oriient/positioningengine/common/PositioningUpdate;", "equals", "other", "", "hashCode", "toString", "updatedCopy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lme/oriient/positioningengine/ondevice/models/Heading;Lme/oriient/positioningengine/ondevice/models/MainOrientation;)Lme/oriient/positioningengine/common/PositioningUpdate;", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class PositioningUpdate implements UploadableSample {

    @NotNull
    private static final byte[] CHUNK_FILE_HEADER;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final double UPLOADING_FORMAT_VERSION = 3.0d;
    private final double a0;
    private final double accuracy;

    @Nullable
    private final Double altitude;
    private final double azimuth;

    @Nullable
    private final String floorId;

    @Nullable
    private final Integer floorOrder;

    @NotNull
    private final Heading heading;
    private final boolean isSmartCartMode;

    @NotNull
    private final Quaternion latestQuaternion;
    private final double latitude;
    private final double lockProgress;
    private final double longitude;

    @NotNull
    private final MainOrientation mainOrientation;

    @Nullable
    private final String mapId;

    @NotNull
    private final PDRClassification pdrClassification;

    @Nullable
    private final MappingData.FloorFullData.RestrictedArea restrictedArea;
    private final long serverTimeMillis;
    private final double timeBetweenUpdatesMilli;
    private final long timeDeterminedMillis;
    private final double traveledDistance;
    private final double uncertainty;
    private final double velocity;
    private final double x;
    private final double y;

    @Nullable
    private final Double z;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lme/oriient/positioningengine/common/PositioningUpdate$Companion;", "", "()V", "CHUNK_FILE_HEADER", "", "getCHUNK_FILE_HEADER", "()[B", "UPLOADING_FORMAT_VERSION", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final byte[] getCHUNK_FILE_HEADER() {
            return PositioningUpdate.CHUNK_FILE_HEADER;
        }

        private Companion() {
        }
    }

    static {
        byte[] bytes = CollectionsKt.M(CollectionsKt.R("x", "y", "z", h.a.c, h.a.b, "altitude", "azimuth", "traveledDistance", "lockProgress", "accuracy", "u", "heading_x", "heading_y", "mainOrientation_x", "mainOrientation_y", "floorOrder", "timestampUtc", "timeBetweenUpdatesMilli", "velocity", "isSmartCartMode", "restrictedAreaId", "pdrClassification"), ",", null, "\n", null, 58).getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        CHUNK_FILE_HEADER = bytes;
    }

    public PositioningUpdate(double d, double d2, @Nullable Double d3, double d4, double d5, double d6, @Nullable Double d7, double d8, double d9, long j, double d10, double d11, double d12, @NotNull Heading heading, @NotNull MainOrientation mainOrientation, @Nullable Integer num, @Nullable String str, @Nullable String str2, long j2, double d13, double d14, @NotNull Quaternion latestQuaternion, boolean z, @Nullable MappingData.FloorFullData.RestrictedArea restrictedArea, @NotNull PDRClassification pdrClassification) {
        Intrinsics.h(heading, "heading");
        Intrinsics.h(mainOrientation, "mainOrientation");
        Intrinsics.h(latestQuaternion, "latestQuaternion");
        Intrinsics.h(pdrClassification, "pdrClassification");
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.timeBetweenUpdatesMilli = d4;
        this.longitude = d5;
        this.latitude = d6;
        this.altitude = d7;
        this.azimuth = d8;
        this.traveledDistance = d9;
        this.serverTimeMillis = j;
        this.lockProgress = d10;
        this.accuracy = d11;
        this.uncertainty = d12;
        this.heading = heading;
        this.mainOrientation = mainOrientation;
        this.floorOrder = num;
        this.mapId = str;
        this.floorId = str2;
        this.timeDeterminedMillis = j2;
        this.velocity = d13;
        this.a0 = d14;
        this.latestQuaternion = latestQuaternion;
        this.isSmartCartMode = z;
        this.restrictedArea = restrictedArea;
        this.pdrClassification = pdrClassification;
    }

    public static /* synthetic */ PositioningUpdate copy$default(PositioningUpdate positioningUpdate, double d, double d2, Double d3, double d4, double d5, double d6, Double d7, double d8, double d9, long j, double d10, double d11, double d12, Heading heading, MainOrientation mainOrientation, Integer num, String str, String str2, long j2, double d13, double d14, Quaternion quaternion, boolean z, MappingData.FloorFullData.RestrictedArea restrictedArea, PDRClassification pDRClassification, int i, Object obj) {
        PDRClassification pDRClassification2;
        MappingData.FloorFullData.RestrictedArea restrictedArea2;
        double d15;
        double d16;
        Integer num2;
        String str3;
        Heading heading2;
        String str4;
        long j3;
        double d17;
        double d18;
        Quaternion quaternion2;
        boolean z2;
        MainOrientation mainOrientation2;
        double d19;
        double d20;
        double d21;
        Double d22;
        double d23;
        double d24;
        long j4;
        double d25;
        PositioningUpdate positioningUpdate2;
        double d26;
        Double d27;
        double d28 = (i & 1) != 0 ? positioningUpdate.x : d;
        double d29 = (i & 2) != 0 ? positioningUpdate.y : d2;
        Double d30 = (i & 4) != 0 ? positioningUpdate.z : d3;
        double d31 = (i & 8) != 0 ? positioningUpdate.timeBetweenUpdatesMilli : d4;
        double d32 = (i & 16) != 0 ? positioningUpdate.longitude : d5;
        double d33 = (i & 32) != 0 ? positioningUpdate.latitude : d6;
        Double d34 = (i & 64) != 0 ? positioningUpdate.altitude : d7;
        double d35 = (i & 128) != 0 ? positioningUpdate.azimuth : d8;
        double d36 = d28;
        double d37 = (i & 256) != 0 ? positioningUpdate.traveledDistance : d9;
        long j5 = (i & 512) != 0 ? positioningUpdate.serverTimeMillis : j;
        double d38 = (i & 1024) != 0 ? positioningUpdate.lockProgress : d10;
        double d39 = (i & 2048) != 0 ? positioningUpdate.accuracy : d11;
        double d40 = (i & 4096) != 0 ? positioningUpdate.uncertainty : d12;
        Heading heading3 = (i & 8192) != 0 ? positioningUpdate.heading : heading;
        MainOrientation mainOrientation3 = (i & 16384) != 0 ? positioningUpdate.mainOrientation : mainOrientation;
        Integer num3 = (i & 32768) != 0 ? positioningUpdate.floorOrder : num;
        String str5 = (i & 65536) != 0 ? positioningUpdate.mapId : str;
        String str6 = (i & 131072) != 0 ? positioningUpdate.floorId : str2;
        Heading heading4 = heading3;
        long j6 = (i & 262144) != 0 ? positioningUpdate.timeDeterminedMillis : j2;
        double d41 = (i & 524288) != 0 ? positioningUpdate.velocity : d13;
        double d42 = (i & 1048576) != 0 ? positioningUpdate.a0 : d14;
        Quaternion quaternion3 = (i & 2097152) != 0 ? positioningUpdate.latestQuaternion : quaternion;
        boolean z3 = (i & 4194304) != 0 ? positioningUpdate.isSmartCartMode : z;
        Quaternion quaternion4 = quaternion3;
        MappingData.FloorFullData.RestrictedArea restrictedArea3 = (i & 8388608) != 0 ? positioningUpdate.restrictedArea : restrictedArea;
        if ((i & 16777216) != 0) {
            restrictedArea2 = restrictedArea3;
            pDRClassification2 = positioningUpdate.pdrClassification;
            d16 = d40;
            num2 = num3;
            str3 = str5;
            heading2 = heading4;
            str4 = str6;
            j3 = j6;
            d17 = d41;
            d18 = d42;
            quaternion2 = quaternion4;
            z2 = z3;
            mainOrientation2 = mainOrientation3;
            d20 = d32;
            d21 = d33;
            d22 = d34;
            d23 = d35;
            d24 = d37;
            j4 = j5;
            d25 = d38;
            d15 = d39;
            positioningUpdate2 = positioningUpdate;
            d26 = d29;
            d27 = d30;
            d19 = d31;
        } else {
            pDRClassification2 = pDRClassification;
            restrictedArea2 = restrictedArea3;
            d15 = d39;
            d16 = d40;
            num2 = num3;
            str3 = str5;
            heading2 = heading4;
            str4 = str6;
            j3 = j6;
            d17 = d41;
            d18 = d42;
            quaternion2 = quaternion4;
            z2 = z3;
            mainOrientation2 = mainOrientation3;
            d19 = d31;
            d20 = d32;
            d21 = d33;
            d22 = d34;
            d23 = d35;
            d24 = d37;
            j4 = j5;
            d25 = d38;
            positioningUpdate2 = positioningUpdate;
            d26 = d29;
            d27 = d30;
        }
        return positioningUpdate2.copy(d36, d26, d27, d19, d20, d21, d22, d23, d24, j4, d25, d15, d16, heading2, mainOrientation2, num2, str3, str4, j3, d17, d18, quaternion2, z2, restrictedArea2, pDRClassification2);
    }

    public static /* synthetic */ PositioningUpdate updatedCopy$default(PositioningUpdate positioningUpdate, Double d, Double d2, Double d3, Double d4, Double d5, Heading heading, MainOrientation mainOrientation, int i, Object obj) {
        if ((i & 1) != 0) {
            d = null;
        }
        if ((i & 2) != 0) {
            d2 = null;
        }
        if ((i & 4) != 0) {
            d3 = null;
        }
        if ((i & 8) != 0) {
            d4 = null;
        }
        if ((i & 16) != 0) {
            d5 = null;
        }
        if ((i & 32) != 0) {
            heading = null;
        }
        if ((i & 64) != 0) {
            mainOrientation = null;
        }
        return positioningUpdate.updatedCopy(d, d2, d3, d4, d5, heading, mainOrientation);
    }

    /* renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component10, reason: from getter */
    public final long getServerTimeMillis() {
        return this.serverTimeMillis;
    }

    /* renamed from: component11, reason: from getter */
    public final double getLockProgress() {
        return this.lockProgress;
    }

    /* renamed from: component12, reason: from getter */
    public final double getAccuracy() {
        return this.accuracy;
    }

    /* renamed from: component13, reason: from getter */
    public final double getUncertainty() {
        return this.uncertainty;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final Heading getHeading() {
        return this.heading;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final MainOrientation getMainOrientation() {
        return this.mainOrientation;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getFloorOrder() {
        return this.floorOrder;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    /* renamed from: component19, reason: from getter */
    public final long getTimeDeterminedMillis() {
        return this.timeDeterminedMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* renamed from: component20, reason: from getter */
    public final double getVelocity() {
        return this.velocity;
    }

    /* renamed from: component21, reason: from getter */
    public final double getA0() {
        return this.a0;
    }

    @NotNull
    /* renamed from: component22, reason: from getter */
    public final Quaternion getLatestQuaternion() {
        return this.latestQuaternion;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsSmartCartMode() {
        return this.isSmartCartMode;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final MappingData.FloorFullData.RestrictedArea getRestrictedArea() {
        return this.restrictedArea;
    }

    @NotNull
    /* renamed from: component25, reason: from getter */
    public final PDRClassification getPdrClassification() {
        return this.pdrClassification;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getZ() {
        return this.z;
    }

    /* renamed from: component4, reason: from getter */
    public final double getTimeBetweenUpdatesMilli() {
        return this.timeBetweenUpdatesMilli;
    }

    /* renamed from: component5, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component6, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    /* renamed from: component8, reason: from getter */
    public final double getAzimuth() {
        return this.azimuth;
    }

    /* renamed from: component9, reason: from getter */
    public final double getTraveledDistance() {
        return this.traveledDistance;
    }

    @NotNull
    public final PositioningUpdate copy(double x, double y, @Nullable Double z, double timeBetweenUpdatesMilli, double longitude, double latitude, @Nullable Double altitude, double azimuth, double traveledDistance, long serverTimeMillis, double lockProgress, double accuracy, double uncertainty, @NotNull Heading heading, @NotNull MainOrientation mainOrientation, @Nullable Integer floorOrder, @Nullable String mapId, @Nullable String floorId, long timeDeterminedMillis, double velocity, double a0, @NotNull Quaternion latestQuaternion, boolean isSmartCartMode, @Nullable MappingData.FloorFullData.RestrictedArea restrictedArea, @NotNull PDRClassification pdrClassification) {
        Intrinsics.h(heading, "heading");
        Intrinsics.h(mainOrientation, "mainOrientation");
        Intrinsics.h(latestQuaternion, "latestQuaternion");
        Intrinsics.h(pdrClassification, "pdrClassification");
        return new PositioningUpdate(x, y, z, timeBetweenUpdatesMilli, longitude, latitude, altitude, azimuth, traveledDistance, serverTimeMillis, lockProgress, accuracy, uncertainty, heading, mainOrientation, floorOrder, mapId, floorId, timeDeterminedMillis, velocity, a0, latestQuaternion, isSmartCartMode, restrictedArea, pdrClassification);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositioningUpdate)) {
            return false;
        }
        PositioningUpdate positioningUpdate = (PositioningUpdate) other;
        return Double.compare(this.x, positioningUpdate.x) == 0 && Double.compare(this.y, positioningUpdate.y) == 0 && Intrinsics.c(this.z, positioningUpdate.z) && Double.compare(this.timeBetweenUpdatesMilli, positioningUpdate.timeBetweenUpdatesMilli) == 0 && Double.compare(this.longitude, positioningUpdate.longitude) == 0 && Double.compare(this.latitude, positioningUpdate.latitude) == 0 && Intrinsics.c(this.altitude, positioningUpdate.altitude) && Double.compare(this.azimuth, positioningUpdate.azimuth) == 0 && Double.compare(this.traveledDistance, positioningUpdate.traveledDistance) == 0 && this.serverTimeMillis == positioningUpdate.serverTimeMillis && Double.compare(this.lockProgress, positioningUpdate.lockProgress) == 0 && Double.compare(this.accuracy, positioningUpdate.accuracy) == 0 && Double.compare(this.uncertainty, positioningUpdate.uncertainty) == 0 && Intrinsics.c(this.heading, positioningUpdate.heading) && Intrinsics.c(this.mainOrientation, positioningUpdate.mainOrientation) && Intrinsics.c(this.floorOrder, positioningUpdate.floorOrder) && Intrinsics.c(this.mapId, positioningUpdate.mapId) && Intrinsics.c(this.floorId, positioningUpdate.floorId) && this.timeDeterminedMillis == positioningUpdate.timeDeterminedMillis && Double.compare(this.velocity, positioningUpdate.velocity) == 0 && Double.compare(this.a0, positioningUpdate.a0) == 0 && Intrinsics.c(this.latestQuaternion, positioningUpdate.latestQuaternion) && this.isSmartCartMode == positioningUpdate.isSmartCartMode && Intrinsics.c(this.restrictedArea, positioningUpdate.restrictedArea) && Intrinsics.c(this.pdrClassification, positioningUpdate.pdrClassification);
    }

    public final double getA0() {
        return this.a0;
    }

    public final double getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final Double getAltitude() {
        return this.altitude;
    }

    public final double getAzimuth() {
        return this.azimuth;
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    public long getEndTimeMillis() {
        return this.serverTimeMillis;
    }

    @Nullable
    public final String getFloorId() {
        return this.floorId;
    }

    @Nullable
    public final Integer getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    public final Heading getHeading() {
        return this.heading;
    }

    @NotNull
    public final Quaternion getLatestQuaternion() {
        return this.latestQuaternion;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLockProgress() {
        return this.lockProgress;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final MainOrientation getMainOrientation() {
        return this.mainOrientation;
    }

    @Nullable
    public final String getMapId() {
        return this.mapId;
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    @NotNull
    public byte[] getPayload() {
        String strValueOf;
        String str;
        String str2;
        String str3;
        String str4;
        String id;
        String strValueOf2;
        String strValueOf3 = String.valueOf(this.x);
        String strValueOf4 = String.valueOf(this.y);
        Double d = this.z;
        String strValueOf5 = d != null ? String.valueOf(d) : "";
        String strValueOf6 = String.valueOf(this.longitude);
        String strValueOf7 = String.valueOf(this.latitude);
        Double d2 = this.altitude;
        String str5 = (d2 == null || (strValueOf2 = String.valueOf(d2.doubleValue())) == null) ? "" : strValueOf2;
        String strValueOf8 = String.valueOf(this.azimuth);
        String strValueOf9 = String.valueOf(this.traveledDistance);
        String strValueOf10 = String.valueOf(this.lockProgress);
        String strValueOf11 = String.valueOf(this.accuracy);
        String strValueOf12 = String.valueOf(this.uncertainty);
        String strValueOf13 = String.valueOf(this.heading.getX());
        String strValueOf14 = String.valueOf(this.heading.getY());
        String strValueOf15 = String.valueOf(this.mainOrientation.getX());
        String strValueOf16 = String.valueOf(this.mainOrientation.getY());
        Integer num = this.floorOrder;
        if (num != null) {
            strValueOf = String.valueOf(num);
            str = "";
        } else {
            strValueOf = "";
            str = strValueOf;
        }
        String str6 = strValueOf5;
        String strA = me.oriient.positioningengine.common.util.a.a(this.serverTimeMillis, ((TimeProvider) DiKt.getDi().get(Reflection.f24268a.b(TimeProvider.class), null)).getTimeZoneGmt());
        String strValueOf17 = String.valueOf(this.timeBetweenUpdatesMilli);
        String strValueOf18 = String.valueOf(this.velocity);
        String strValueOf19 = String.valueOf(this.isSmartCartMode);
        MappingData.FloorFullData.RestrictedArea restrictedArea = this.restrictedArea;
        if (restrictedArea == null || (id = restrictedArea.getId()) == null) {
            str2 = str;
            str3 = str6;
            str4 = strA;
        } else {
            str2 = id;
            str4 = strA;
            str3 = str6;
        }
        byte[] bytes = CollectionsKt.M(CollectionsKt.R(strValueOf3, strValueOf4, str3, strValueOf6, strValueOf7, str5, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf, str4, strValueOf17, strValueOf18, strValueOf19, str2), ",", null, "\n", null, 58).getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        return bytes;
    }

    @NotNull
    public final PDRClassification getPdrClassification() {
        return this.pdrClassification;
    }

    @Nullable
    public final MappingData.FloorFullData.RestrictedArea getRestrictedArea() {
        return this.restrictedArea;
    }

    public final long getServerTimeMillis() {
        return this.serverTimeMillis;
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    public long getStartTimeMillis() {
        return this.serverTimeMillis - ((long) this.timeBetweenUpdatesMilli);
    }

    public final double getTimeBetweenUpdatesMilli() {
        return this.timeBetweenUpdatesMilli;
    }

    public final long getTimeDeterminedMillis() {
        return this.timeDeterminedMillis;
    }

    public final double getTraveledDistance() {
        return this.traveledDistance;
    }

    public final double getUncertainty() {
        return this.uncertainty;
    }

    public final double getVelocity() {
        return this.velocity;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    @Nullable
    public final Double getZ() {
        return this.z;
    }

    public int hashCode() {
        int iA = v.a(this.y, Double.hashCode(this.x) * 31, 31);
        Double d = this.z;
        int iA2 = v.a(this.latitude, v.a(this.longitude, v.a(this.timeBetweenUpdatesMilli, (iA + (d == null ? 0 : d.hashCode())) * 31, 31), 31), 31);
        Double d2 = this.altitude;
        int iHashCode = (this.mainOrientation.hashCode() + ((this.heading.hashCode() + v.a(this.uncertainty, v.a(this.accuracy, v.a(this.lockProgress, w.a(this.serverTimeMillis, v.a(this.traveledDistance, v.a(this.azimuth, (iA2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31), 31), 31), 31), 31), 31)) * 31)) * 31;
        Integer num = this.floorOrder;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.mapId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.floorId;
        int iA3 = x.a(this.isSmartCartMode, (this.latestQuaternion.hashCode() + v.a(this.a0, v.a(this.velocity, w.a(this.timeDeterminedMillis, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31)) * 31, 31);
        MappingData.FloorFullData.RestrictedArea restrictedArea = this.restrictedArea;
        return this.pdrClassification.hashCode() + ((iA3 + (restrictedArea != null ? restrictedArea.hashCode() : 0)) * 31);
    }

    public final boolean isLocked() {
        return this.lockProgress >= 1.0d;
    }

    public final boolean isSmartCartMode() {
        return this.isSmartCartMode;
    }

    @NotNull
    public String toString() {
        return "PositioningUpdate(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", timeBetweenUpdatesMilli=" + this.timeBetweenUpdatesMilli + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", altitude=" + this.altitude + ", azimuth=" + this.azimuth + ", traveledDistance=" + this.traveledDistance + ", serverTimeMillis=" + this.serverTimeMillis + ", lockProgress=" + this.lockProgress + ", accuracy=" + this.accuracy + ", uncertainty=" + this.uncertainty + ", heading=" + this.heading + ", mainOrientation=" + this.mainOrientation + ", floorOrder=" + this.floorOrder + ", mapId=" + this.mapId + ", floorId=" + this.floorId + ", timeDeterminedMillis=" + this.timeDeterminedMillis + ", velocity=" + this.velocity + ", a0=" + this.a0 + ", latestQuaternion=" + this.latestQuaternion + ", isSmartCartMode=" + this.isSmartCartMode + ", restrictedArea=" + this.restrictedArea + ", pdrClassification=" + this.pdrClassification + ')';
    }

    @NotNull
    public final PositioningUpdate updatedCopy(@Nullable Double x, @Nullable Double y, @Nullable Double lockProgress, @Nullable Double accuracy, @Nullable Double traveledDistance, @Nullable Heading heading, @Nullable MainOrientation mainOrientation) {
        return copy$default(this, x != null ? x.doubleValue() : this.x, y != null ? y.doubleValue() : this.y, null, 0.0d, 0.0d, 0.0d, null, 0.0d, traveledDistance != null ? traveledDistance.doubleValue() : this.traveledDistance, 0L, lockProgress != null ? lockProgress.doubleValue() : this.lockProgress, accuracy != null ? accuracy.doubleValue() : this.accuracy, 0.0d, heading == null ? this.heading : heading, mainOrientation == null ? this.mainOrientation : mainOrientation, null, null, null, 0L, 0.0d, 0.0d, null, false, null, null, 33526524, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PositioningUpdate(@NotNull Position position, long j, long j2, @NotNull MainOrientation mainOrientation, boolean z, @Nullable MappingData.FloorFullData.RestrictedArea restrictedArea, @NotNull PDRClassification pdrClassification) {
        double d;
        double d2;
        Double dValueOf;
        Double d3;
        Intrinsics.h(position, "position");
        Intrinsics.h(mainOrientation, "mainOrientation");
        Intrinsics.h(pdrClassification, "pdrClassification");
        double x = position.getX();
        double y = position.getY();
        if (position.isFloorDataValid()) {
            dValueOf = Double.valueOf(position.getZ());
            d = x;
            d2 = y;
            d3 = null;
        } else {
            d = x;
            d2 = y;
            dValueOf = null;
            d3 = null;
        }
        this(d, d2, dValueOf, position.getTimeBetweenUpdatesMilli(), position.getLongitude(), position.getLatitude(), position.isFloorDataValid() ? Double.valueOf(position.getAltitude()) : d3, position.getAzimuth(), position.getTraveledDistance(), j, position.getLockProgress(), position.getAccuracy(), position.getUncertainty(), position.getHeading(), mainOrientation, position.isFloorDataValid() ? Integer.valueOf((int) position.getFloorOrder()) : null, position.isFloorDataValid() ? position.getMapId() : null, position.isFloorDataValid() ? position.getFloorId() : null, j2, position.getVelocity(), position.getA0(), new Quaternion(position.getLatestQuaternion()), z, restrictedArea, pdrClassification);
    }
}
