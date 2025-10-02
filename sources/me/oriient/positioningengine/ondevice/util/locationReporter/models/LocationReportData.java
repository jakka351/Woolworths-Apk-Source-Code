package me.oriient.positioningengine.ondevice.util.locationReporter.models;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.db.h;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.positioningengine.common.v;
import me.oriient.positioningengine.common.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 b2\u00020\u0001:\u0002abBÃ\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018B\u008b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0019J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0013HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\t\u0010N\u001a\u00020\u0005HÆ\u0003J²\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020\u0003HÖ\u0001J\b\u0010V\u001a\u00020WH\u0016J\t\u0010X\u001a\u00020\u000fHÖ\u0001J&\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_HÁ\u0001¢\u0006\u0002\b`R\u001c\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010 R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010'\u0012\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010*R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010 R\u001c\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001dR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010 R\u001c\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010*R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001b\u001a\u0004\b4\u00105R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b6\u0010\u001b\u001a\u0004\b7\u0010 R\u001c\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u001b\u001a\u0004\b9\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001b\u001a\u0004\b;\u0010\u001dR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\u001b\u001a\u0004\b=\u0010\u001dR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010!\u0012\u0004\b>\u0010\u001b\u001a\u0004\b?\u0010 ¨\u0006c"}, d2 = {"Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportData;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "seen1", "", "x", "", "y", "z", "timeBetweenUpdatesMilli", h.a.c, h.a.b, "altitude", "azimuth", "traveledDistance", "serverTime", "", "lockProgress", "accuracy", "heading", "Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;", "mainOrientation", "floorOrder", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;DLjava/lang/String;DDLme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;DLjava/lang/String;DDLme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;Ljava/lang/Integer;)V", "getAccuracy$annotations", "()V", "getAccuracy", "()D", "getAltitude$annotations", "getAltitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAzimuth$annotations", "getAzimuth", "getFloorOrder$annotations", "getFloorOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeading$annotations", "getHeading", "()Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;", "getLatitude$annotations", "getLatitude", "getLockProgress$annotations", "getLockProgress", "getLongitude$annotations", "getLongitude", "getMainOrientation$annotations", "getMainOrientation", "getServerTime$annotations", "getServerTime", "()Ljava/lang/String;", "getTimeBetweenUpdatesMilli$annotations", "getTimeBetweenUpdatesMilli", "getTraveledDistance$annotations", "getTraveledDistance", "getX$annotations", "getX", "getY$annotations", "getY", "getZ$annotations", "getZ", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;DLjava/lang/String;DDLme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportCoordinate;Ljava/lang/Integer;)Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportData;", "equals", "", "other", "", "hashCode", "toJsonElement", "Lkotlinx/serialization/json/JsonElement;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$service_positioning_engine_publishRelease", "$serializer", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class LocationReportData implements Jsonable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final double accuracy;

    @Nullable
    private final Double altitude;

    @Nullable
    private final Double azimuth;

    @Nullable
    private final Integer floorOrder;

    @NotNull
    private final LocationReportCoordinate heading;

    @Nullable
    private final Double latitude;
    private final double lockProgress;

    @Nullable
    private final Double longitude;

    @NotNull
    private final LocationReportCoordinate mainOrientation;

    @NotNull
    private final String serverTime;

    @Nullable
    private final Double timeBetweenUpdatesMilli;
    private final double traveledDistance;
    private final double x;
    private final double y;

    @Nullable
    private final Double z;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/positioningengine/ondevice/util/locationReporter/models/LocationReportData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<LocationReportData> serializer() {
            return LocationReportData$$serializer.INSTANCE;
        }
    }

    public LocationReportData(double d, double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8, double d9, @NotNull String serverTime, double d10, double d11, @NotNull LocationReportCoordinate heading, @NotNull LocationReportCoordinate mainOrientation, @Nullable Integer num) {
        Intrinsics.h(serverTime, "serverTime");
        Intrinsics.h(heading, "heading");
        Intrinsics.h(mainOrientation, "mainOrientation");
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.timeBetweenUpdatesMilli = d4;
        this.longitude = d5;
        this.latitude = d6;
        this.altitude = d7;
        this.azimuth = d8;
        this.traveledDistance = d9;
        this.serverTime = serverTime;
        this.lockProgress = d10;
        this.accuracy = d11;
        this.heading = heading;
        this.mainOrientation = mainOrientation;
        this.floorOrder = num;
    }

    public static /* synthetic */ LocationReportData copy$default(LocationReportData locationReportData, double d, double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, double d9, String str, double d10, double d11, LocationReportCoordinate locationReportCoordinate, LocationReportCoordinate locationReportCoordinate2, Integer num, int i, Object obj) {
        double d12;
        double d13;
        double d14 = (i & 1) != 0 ? locationReportData.x : d;
        double d15 = (i & 2) != 0 ? locationReportData.y : d2;
        Double d16 = (i & 4) != 0 ? locationReportData.z : d3;
        Double d17 = (i & 8) != 0 ? locationReportData.timeBetweenUpdatesMilli : d4;
        Double d18 = (i & 16) != 0 ? locationReportData.longitude : d5;
        Double d19 = (i & 32) != 0 ? locationReportData.latitude : d6;
        Double d20 = (i & 64) != 0 ? locationReportData.altitude : d7;
        Double d21 = (i & 128) != 0 ? locationReportData.azimuth : d8;
        double d22 = (i & 256) != 0 ? locationReportData.traveledDistance : d9;
        String str2 = (i & 512) != 0 ? locationReportData.serverTime : str;
        if ((i & 1024) != 0) {
            d12 = d14;
            d13 = locationReportData.lockProgress;
        } else {
            d12 = d14;
            d13 = d10;
        }
        return locationReportData.copy(d12, d15, d16, d17, d18, d19, d20, d21, d22, str2, d13, (i & 2048) != 0 ? locationReportData.accuracy : d11, (i & 4096) != 0 ? locationReportData.heading : locationReportCoordinate, (i & 8192) != 0 ? locationReportData.mainOrientation : locationReportCoordinate2, (i & 16384) != 0 ? locationReportData.floorOrder : num);
    }

    @SerialName
    public static /* synthetic */ void getAccuracy$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getAltitude$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getAzimuth$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getFloorOrder$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getHeading$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getLockProgress$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getMainOrientation$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getServerTime$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getTimeBetweenUpdatesMilli$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getTraveledDistance$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getX$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getY$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getZ$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$service_positioning_engine_publishRelease(LocationReportData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.x);
        output.G(serialDesc, 1, self.y);
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        output.w(serialDesc, 2, doubleSerializer, self.z);
        output.w(serialDesc, 3, doubleSerializer, self.timeBetweenUpdatesMilli);
        output.w(serialDesc, 4, doubleSerializer, self.longitude);
        output.w(serialDesc, 5, doubleSerializer, self.latitude);
        output.w(serialDesc, 6, doubleSerializer, self.altitude);
        output.w(serialDesc, 7, doubleSerializer, self.azimuth);
        output.G(serialDesc, 8, self.traveledDistance);
        output.p(serialDesc, 9, self.serverTime);
        output.G(serialDesc, 10, self.lockProgress);
        output.G(serialDesc, 11, self.accuracy);
        LocationReportCoordinate$$serializer locationReportCoordinate$$serializer = LocationReportCoordinate$$serializer.INSTANCE;
        output.F(serialDesc, 12, locationReportCoordinate$$serializer, self.heading);
        output.F(serialDesc, 13, locationReportCoordinate$$serializer, self.mainOrientation);
        output.w(serialDesc, 14, IntSerializer.f24800a, self.floorOrder);
    }

    /* renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getServerTime() {
        return this.serverTime;
    }

    /* renamed from: component11, reason: from getter */
    public final double getLockProgress() {
        return this.lockProgress;
    }

    /* renamed from: component12, reason: from getter */
    public final double getAccuracy() {
        return this.accuracy;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final LocationReportCoordinate getHeading() {
        return this.heading;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final LocationReportCoordinate getMainOrientation() {
        return this.mainOrientation;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getFloorOrder() {
        return this.floorOrder;
    }

    /* renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getZ() {
        return this.z;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getTimeBetweenUpdatesMilli() {
        return this.timeBetweenUpdatesMilli;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getAzimuth() {
        return this.azimuth;
    }

    /* renamed from: component9, reason: from getter */
    public final double getTraveledDistance() {
        return this.traveledDistance;
    }

    @NotNull
    public final LocationReportData copy(double x, double y, @Nullable Double z, @Nullable Double timeBetweenUpdatesMilli, @Nullable Double longitude, @Nullable Double latitude, @Nullable Double altitude, @Nullable Double azimuth, double traveledDistance, @NotNull String serverTime, double lockProgress, double accuracy, @NotNull LocationReportCoordinate heading, @NotNull LocationReportCoordinate mainOrientation, @Nullable Integer floorOrder) {
        Intrinsics.h(serverTime, "serverTime");
        Intrinsics.h(heading, "heading");
        Intrinsics.h(mainOrientation, "mainOrientation");
        return new LocationReportData(x, y, z, timeBetweenUpdatesMilli, longitude, latitude, altitude, azimuth, traveledDistance, serverTime, lockProgress, accuracy, heading, mainOrientation, floorOrder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationReportData)) {
            return false;
        }
        LocationReportData locationReportData = (LocationReportData) other;
        return Double.compare(this.x, locationReportData.x) == 0 && Double.compare(this.y, locationReportData.y) == 0 && Intrinsics.c(this.z, locationReportData.z) && Intrinsics.c(this.timeBetweenUpdatesMilli, locationReportData.timeBetweenUpdatesMilli) && Intrinsics.c(this.longitude, locationReportData.longitude) && Intrinsics.c(this.latitude, locationReportData.latitude) && Intrinsics.c(this.altitude, locationReportData.altitude) && Intrinsics.c(this.azimuth, locationReportData.azimuth) && Double.compare(this.traveledDistance, locationReportData.traveledDistance) == 0 && Intrinsics.c(this.serverTime, locationReportData.serverTime) && Double.compare(this.lockProgress, locationReportData.lockProgress) == 0 && Double.compare(this.accuracy, locationReportData.accuracy) == 0 && Intrinsics.c(this.heading, locationReportData.heading) && Intrinsics.c(this.mainOrientation, locationReportData.mainOrientation) && Intrinsics.c(this.floorOrder, locationReportData.floorOrder);
    }

    public final double getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final Double getAltitude() {
        return this.altitude;
    }

    @Nullable
    public final Double getAzimuth() {
        return this.azimuth;
    }

    @Nullable
    public final Integer getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    public final LocationReportCoordinate getHeading() {
        return this.heading;
    }

    @Nullable
    public final Double getLatitude() {
        return this.latitude;
    }

    public final double getLockProgress() {
        return this.lockProgress;
    }

    @Nullable
    public final Double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final LocationReportCoordinate getMainOrientation() {
        return this.mainOrientation;
    }

    @NotNull
    public final String getServerTime() {
        return this.serverTime;
    }

    @Nullable
    public final Double getTimeBetweenUpdatesMilli() {
        return this.timeBetweenUpdatesMilli;
    }

    public final double getTraveledDistance() {
        return this.traveledDistance;
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
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.timeBetweenUpdatesMilli;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.longitude;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.latitude;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.altitude;
        int iHashCode5 = (iHashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.azimuth;
        int iHashCode6 = (this.mainOrientation.hashCode() + ((this.heading.hashCode() + v.a(this.accuracy, v.a(this.lockProgress, z.a(this.serverTime, v.a(this.traveledDistance, (iHashCode5 + (d6 == null ? 0 : d6.hashCode())) * 31, 31), 31), 31), 31)) * 31)) * 31;
        Integer num = this.floorOrder;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        Json.Default r0 = Json.d;
        r0.getClass();
        KSerializer<LocationReportData> serializer = INSTANCE.serializer();
        Intrinsics.h(serializer, "serializer");
        return TreeJsonEncoderKt.a(r0, this, serializer);
    }

    @NotNull
    public String toString() {
        return "LocationReportData(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", timeBetweenUpdatesMilli=" + this.timeBetweenUpdatesMilli + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", altitude=" + this.altitude + ", azimuth=" + this.azimuth + ", traveledDistance=" + this.traveledDistance + ", serverTime=" + this.serverTime + ", lockProgress=" + this.lockProgress + ", accuracy=" + this.accuracy + ", heading=" + this.heading + ", mainOrientation=" + this.mainOrientation + ", floorOrder=" + this.floorOrder + ')';
    }

    @Deprecated
    public /* synthetic */ LocationReportData(int i, @SerialName double d, @SerialName double d2, @SerialName Double d3, @SerialName Double d4, @SerialName Double d5, @SerialName Double d6, @SerialName Double d7, @SerialName Double d8, @SerialName double d9, @SerialName String str, @SerialName double d10, @SerialName double d11, @SerialName LocationReportCoordinate locationReportCoordinate, @SerialName LocationReportCoordinate locationReportCoordinate2, @SerialName Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (32767 != (i & 32767)) {
            PluginExceptionsKt.a(i, 32767, LocationReportData$$serializer.INSTANCE.getB());
            throw null;
        }
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.timeBetweenUpdatesMilli = d4;
        this.longitude = d5;
        this.latitude = d6;
        this.altitude = d7;
        this.azimuth = d8;
        this.traveledDistance = d9;
        this.serverTime = str;
        this.lockProgress = d10;
        this.accuracy = d11;
        this.heading = locationReportCoordinate;
        this.mainOrientation = locationReportCoordinate2;
        this.floorOrder = num;
    }
}
