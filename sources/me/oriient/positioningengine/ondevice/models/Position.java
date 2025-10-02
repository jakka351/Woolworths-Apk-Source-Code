package me.oriient.positioningengine.ondevice.models;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.db.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\bD\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\b¢\u0006\u0002\u0010\"J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0\u001bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\t\u0010T\u001a\u00020\bHÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\t\u0010W\u001a\u00020\bHÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\rHÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\u0099\u0002\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\bHÆ\u0001J\u0013\u0010]\u001a\u00020\u00032\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010_\u001a\u00020`HÖ\u0001J\t\u0010a\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010.R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u001b¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u001d\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\u001e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0011\u0010\u001f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0011\u0010 \u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010$¨\u0006b"}, d2 = {"Lme/oriient/positioningengine/ondevice/models/Position;", "", "isFloorDataValid", "", "x", "", "y", "z", "", "lockProgress", "accuracy", "uncertainty", "heading", "Lme/oriient/positioningengine/ondevice/models/Heading;", "floorOrder", "traveledDistance", h.a.b, h.a.c, "altitude", "azimuth", "timeBetweenUpdatesMilli", "mapId", "", "floorId", "velocity", "a0", "latestQuaternion", "", "restrictedAreaId", "pdr_accuracy_x", "pdr_accuracy_y", "pdr_class_inhand", "pdr_class_withcart", "pdr_class_oncart", "(ZFFDDFFLme/oriient/positioningengine/ondevice/models/Heading;DDDDDFDLjava/lang/String;Ljava/lang/String;DDLjava/util/List;Ljava/lang/String;DDDDD)V", "getA0", "()D", "getAccuracy", "()F", "getAltitude", "getAzimuth", "getFloorId", "()Ljava/lang/String;", "getFloorOrder", "getHeading", "()Lme/oriient/positioningengine/ondevice/models/Heading;", "()Z", "getLatestQuaternion", "()Ljava/util/List;", "getLatitude", "getLockProgress", "getLongitude", "getMapId", "getPdr_accuracy_x", "getPdr_accuracy_y", "getPdr_class_inhand", "getPdr_class_oncart", "getPdr_class_withcart", "getRestrictedAreaId", "getTimeBetweenUpdatesMilli", "getTraveledDistance", "getUncertainty", "getVelocity", "getX", "getY", "getZ", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Position {
    private final double a0;
    private final float accuracy;
    private final double altitude;
    private final float azimuth;

    @Nullable
    private final String floorId;
    private final double floorOrder;

    @NotNull
    private final Heading heading;
    private final boolean isFloorDataValid;

    @NotNull
    private final List<Double> latestQuaternion;
    private final double latitude;
    private final double lockProgress;
    private final double longitude;

    @Nullable
    private final String mapId;
    private final double pdr_accuracy_x;
    private final double pdr_accuracy_y;
    private final double pdr_class_inhand;
    private final double pdr_class_oncart;
    private final double pdr_class_withcart;

    @Nullable
    private final String restrictedAreaId;
    private final double timeBetweenUpdatesMilli;
    private final double traveledDistance;
    private final float uncertainty;
    private final double velocity;
    private final float x;
    private final float y;
    private final double z;

    public Position(boolean z, float f, float f2, double d, double d2, float f3, float f4, @NotNull Heading heading, double d3, double d4, double d5, double d6, double d7, float f5, double d8, @Nullable String str, @Nullable String str2, double d9, double d10, @NotNull List<Double> latestQuaternion, @Nullable String str3, double d11, double d12, double d13, double d14, double d15) {
        Intrinsics.h(heading, "heading");
        Intrinsics.h(latestQuaternion, "latestQuaternion");
        this.isFloorDataValid = z;
        this.x = f;
        this.y = f2;
        this.z = d;
        this.lockProgress = d2;
        this.accuracy = f3;
        this.uncertainty = f4;
        this.heading = heading;
        this.floorOrder = d3;
        this.traveledDistance = d4;
        this.latitude = d5;
        this.longitude = d6;
        this.altitude = d7;
        this.azimuth = f5;
        this.timeBetweenUpdatesMilli = d8;
        this.mapId = str;
        this.floorId = str2;
        this.velocity = d9;
        this.a0 = d10;
        this.latestQuaternion = latestQuaternion;
        this.restrictedAreaId = str3;
        this.pdr_accuracy_x = d11;
        this.pdr_accuracy_y = d12;
        this.pdr_class_inhand = d13;
        this.pdr_class_withcart = d14;
        this.pdr_class_oncart = d15;
    }

    public static /* synthetic */ Position copy$default(Position position, boolean z, float f, float f2, double d, double d2, float f3, float f4, Heading heading, double d3, double d4, double d5, double d6, double d7, float f5, double d8, String str, String str2, double d9, double d10, List list, String str3, double d11, double d12, double d13, double d14, double d15, int i, Object obj) {
        double d16;
        double d17;
        String str4;
        double d18;
        double d19;
        List list2;
        String str5;
        double d20;
        double d21;
        double d22;
        String str6;
        double d23;
        double d24;
        double d25;
        double d26;
        double d27;
        float f6;
        double d28;
        float f7;
        double d29;
        double d30;
        float f8;
        float f9;
        Heading heading2;
        boolean z2 = (i & 1) != 0 ? position.isFloorDataValid : z;
        float f10 = (i & 2) != 0 ? position.x : f;
        float f11 = (i & 4) != 0 ? position.y : f2;
        double d31 = (i & 8) != 0 ? position.z : d;
        double d32 = (i & 16) != 0 ? position.lockProgress : d2;
        float f12 = (i & 32) != 0 ? position.accuracy : f3;
        float f13 = (i & 64) != 0 ? position.uncertainty : f4;
        Heading heading3 = (i & 128) != 0 ? position.heading : heading;
        double d33 = (i & 256) != 0 ? position.floorOrder : d3;
        double d34 = (i & 512) != 0 ? position.traveledDistance : d4;
        boolean z3 = z2;
        float f14 = f10;
        double d35 = (i & 1024) != 0 ? position.latitude : d5;
        double d36 = (i & 2048) != 0 ? position.longitude : d6;
        double d37 = (i & 4096) != 0 ? position.altitude : d7;
        float f15 = (i & 8192) != 0 ? position.azimuth : f5;
        double d38 = (i & 16384) != 0 ? position.timeBetweenUpdatesMilli : d8;
        String str7 = (i & 32768) != 0 ? position.mapId : str;
        double d39 = d38;
        String str8 = (i & 65536) != 0 ? position.floorId : str2;
        double d40 = (i & 131072) != 0 ? position.velocity : d9;
        double d41 = (i & 262144) != 0 ? position.a0 : d10;
        List list3 = (i & 524288) != 0 ? position.latestQuaternion : list;
        String str9 = (i & 1048576) != 0 ? position.restrictedAreaId : str3;
        double d42 = (i & 2097152) != 0 ? position.pdr_accuracy_x : d11;
        double d43 = (i & 4194304) != 0 ? position.pdr_accuracy_y : d12;
        double d44 = (i & 8388608) != 0 ? position.pdr_class_inhand : d13;
        double d45 = (i & 16777216) != 0 ? position.pdr_class_withcart : d14;
        if ((i & 33554432) != 0) {
            d17 = d45;
            d16 = position.pdr_class_oncart;
            d18 = d40;
            d19 = d41;
            list2 = list3;
            str5 = str9;
            d20 = d42;
            d21 = d43;
            d22 = d44;
            str6 = str7;
            d24 = d34;
            d25 = d35;
            d26 = d36;
            d27 = d37;
            f6 = f15;
            d28 = d39;
            str4 = str8;
            f7 = f11;
            d29 = d31;
            d30 = d32;
            f8 = f12;
            f9 = f13;
            heading2 = heading3;
            d23 = d33;
        } else {
            d16 = d15;
            d17 = d45;
            str4 = str8;
            d18 = d40;
            d19 = d41;
            list2 = list3;
            str5 = str9;
            d20 = d42;
            d21 = d43;
            d22 = d44;
            str6 = str7;
            d23 = d33;
            d24 = d34;
            d25 = d35;
            d26 = d36;
            d27 = d37;
            f6 = f15;
            d28 = d39;
            f7 = f11;
            d29 = d31;
            d30 = d32;
            f8 = f12;
            f9 = f13;
            heading2 = heading3;
        }
        return position.copy(z3, f14, f7, d29, d30, f8, f9, heading2, d23, d24, d25, d26, d27, f6, d28, str6, str4, d18, d19, list2, str5, d20, d21, d22, d17, d16);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFloorDataValid() {
        return this.isFloorDataValid;
    }

    /* renamed from: component10, reason: from getter */
    public final double getTraveledDistance() {
        return this.traveledDistance;
    }

    /* renamed from: component11, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component12, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component13, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    /* renamed from: component14, reason: from getter */
    public final float getAzimuth() {
        return this.azimuth;
    }

    /* renamed from: component15, reason: from getter */
    public final double getTimeBetweenUpdatesMilli() {
        return this.timeBetweenUpdatesMilli;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    /* renamed from: component18, reason: from getter */
    public final double getVelocity() {
        return this.velocity;
    }

    /* renamed from: component19, reason: from getter */
    public final double getA0() {
        return this.a0;
    }

    /* renamed from: component2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    @NotNull
    public final List<Double> component20() {
        return this.latestQuaternion;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getRestrictedAreaId() {
        return this.restrictedAreaId;
    }

    /* renamed from: component22, reason: from getter */
    public final double getPdr_accuracy_x() {
        return this.pdr_accuracy_x;
    }

    /* renamed from: component23, reason: from getter */
    public final double getPdr_accuracy_y() {
        return this.pdr_accuracy_y;
    }

    /* renamed from: component24, reason: from getter */
    public final double getPdr_class_inhand() {
        return this.pdr_class_inhand;
    }

    /* renamed from: component25, reason: from getter */
    public final double getPdr_class_withcart() {
        return this.pdr_class_withcart;
    }

    /* renamed from: component26, reason: from getter */
    public final double getPdr_class_oncart() {
        return this.pdr_class_oncart;
    }

    /* renamed from: component3, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component4, reason: from getter */
    public final double getZ() {
        return this.z;
    }

    /* renamed from: component5, reason: from getter */
    public final double getLockProgress() {
        return this.lockProgress;
    }

    /* renamed from: component6, reason: from getter */
    public final float getAccuracy() {
        return this.accuracy;
    }

    /* renamed from: component7, reason: from getter */
    public final float getUncertainty() {
        return this.uncertainty;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Heading getHeading() {
        return this.heading;
    }

    /* renamed from: component9, reason: from getter */
    public final double getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    public final Position copy(boolean isFloorDataValid, float x, float y, double z, double lockProgress, float accuracy, float uncertainty, @NotNull Heading heading, double floorOrder, double traveledDistance, double latitude, double longitude, double altitude, float azimuth, double timeBetweenUpdatesMilli, @Nullable String mapId, @Nullable String floorId, double velocity, double a0, @NotNull List<Double> latestQuaternion, @Nullable String restrictedAreaId, double pdr_accuracy_x, double pdr_accuracy_y, double pdr_class_inhand, double pdr_class_withcart, double pdr_class_oncart) {
        Intrinsics.h(heading, "heading");
        Intrinsics.h(latestQuaternion, "latestQuaternion");
        return new Position(isFloorDataValid, x, y, z, lockProgress, accuracy, uncertainty, heading, floorOrder, traveledDistance, latitude, longitude, altitude, azimuth, timeBetweenUpdatesMilli, mapId, floorId, velocity, a0, latestQuaternion, restrictedAreaId, pdr_accuracy_x, pdr_accuracy_y, pdr_class_inhand, pdr_class_withcart, pdr_class_oncart);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Position)) {
            return false;
        }
        Position position = (Position) other;
        return this.isFloorDataValid == position.isFloorDataValid && Float.compare(this.x, position.x) == 0 && Float.compare(this.y, position.y) == 0 && Double.compare(this.z, position.z) == 0 && Double.compare(this.lockProgress, position.lockProgress) == 0 && Float.compare(this.accuracy, position.accuracy) == 0 && Float.compare(this.uncertainty, position.uncertainty) == 0 && Intrinsics.c(this.heading, position.heading) && Double.compare(this.floorOrder, position.floorOrder) == 0 && Double.compare(this.traveledDistance, position.traveledDistance) == 0 && Double.compare(this.latitude, position.latitude) == 0 && Double.compare(this.longitude, position.longitude) == 0 && Double.compare(this.altitude, position.altitude) == 0 && Float.compare(this.azimuth, position.azimuth) == 0 && Double.compare(this.timeBetweenUpdatesMilli, position.timeBetweenUpdatesMilli) == 0 && Intrinsics.c(this.mapId, position.mapId) && Intrinsics.c(this.floorId, position.floorId) && Double.compare(this.velocity, position.velocity) == 0 && Double.compare(this.a0, position.a0) == 0 && Intrinsics.c(this.latestQuaternion, position.latestQuaternion) && Intrinsics.c(this.restrictedAreaId, position.restrictedAreaId) && Double.compare(this.pdr_accuracy_x, position.pdr_accuracy_x) == 0 && Double.compare(this.pdr_accuracy_y, position.pdr_accuracy_y) == 0 && Double.compare(this.pdr_class_inhand, position.pdr_class_inhand) == 0 && Double.compare(this.pdr_class_withcart, position.pdr_class_withcart) == 0 && Double.compare(this.pdr_class_oncart, position.pdr_class_oncart) == 0;
    }

    public final double getA0() {
        return this.a0;
    }

    public final float getAccuracy() {
        return this.accuracy;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final float getAzimuth() {
        return this.azimuth;
    }

    @Nullable
    public final String getFloorId() {
        return this.floorId;
    }

    public final double getFloorOrder() {
        return this.floorOrder;
    }

    @NotNull
    public final Heading getHeading() {
        return this.heading;
    }

    @NotNull
    public final List<Double> getLatestQuaternion() {
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

    @Nullable
    public final String getMapId() {
        return this.mapId;
    }

    public final double getPdr_accuracy_x() {
        return this.pdr_accuracy_x;
    }

    public final double getPdr_accuracy_y() {
        return this.pdr_accuracy_y;
    }

    public final double getPdr_class_inhand() {
        return this.pdr_class_inhand;
    }

    public final double getPdr_class_oncart() {
        return this.pdr_class_oncart;
    }

    public final double getPdr_class_withcart() {
        return this.pdr_class_withcart;
    }

    @Nullable
    public final String getRestrictedAreaId() {
        return this.restrictedAreaId;
    }

    public final double getTimeBetweenUpdatesMilli() {
        return this.timeBetweenUpdatesMilli;
    }

    public final double getTraveledDistance() {
        return this.traveledDistance;
    }

    public final float getUncertainty() {
        return this.uncertainty;
    }

    public final double getVelocity() {
        return this.velocity;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final double getZ() {
        return this.z;
    }

    public int hashCode() {
        int iA = v.a(this.timeBetweenUpdatesMilli, android.support.v4.media.session.a.b(this.azimuth, v.a(this.altitude, v.a(this.longitude, v.a(this.latitude, v.a(this.traveledDistance, v.a(this.floorOrder, (this.heading.hashCode() + android.support.v4.media.session.a.b(this.uncertainty, android.support.v4.media.session.a.b(this.accuracy, v.a(this.lockProgress, v.a(this.z, android.support.v4.media.session.a.b(this.y, android.support.v4.media.session.a.b(this.x, Boolean.hashCode(this.isFloorDataValid) * 31, 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
        String str = this.mapId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.floorId;
        int iD = androidx.camera.core.impl.b.d(v.a(this.a0, v.a(this.velocity, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.latestQuaternion);
        String str3 = this.restrictedAreaId;
        return Double.hashCode(this.pdr_class_oncart) + v.a(this.pdr_class_withcart, v.a(this.pdr_class_inhand, v.a(this.pdr_accuracy_y, v.a(this.pdr_accuracy_x, (iD + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final boolean isFloorDataValid() {
        return this.isFloorDataValid;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Position(isFloorDataValid=");
        sb.append(this.isFloorDataValid);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", z=");
        sb.append(this.z);
        sb.append(", lockProgress=");
        sb.append(this.lockProgress);
        sb.append(", accuracy=");
        sb.append(this.accuracy);
        sb.append(", uncertainty=");
        sb.append(this.uncertainty);
        sb.append(", heading=");
        sb.append(this.heading);
        sb.append(", floorOrder=");
        sb.append(this.floorOrder);
        sb.append(", traveledDistance=");
        sb.append(this.traveledDistance);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", altitude=");
        sb.append(this.altitude);
        sb.append(", azimuth=");
        sb.append(this.azimuth);
        sb.append(", timeBetweenUpdatesMilli=");
        sb.append(this.timeBetweenUpdatesMilli);
        sb.append(", mapId=");
        sb.append(this.mapId);
        sb.append(", floorId=");
        sb.append(this.floorId);
        sb.append(", velocity=");
        sb.append(this.velocity);
        sb.append(", a0=");
        sb.append(this.a0);
        sb.append(", latestQuaternion=");
        sb.append(this.latestQuaternion);
        sb.append(", restrictedAreaId=");
        sb.append(this.restrictedAreaId);
        sb.append(", pdr_accuracy_x=");
        sb.append(this.pdr_accuracy_x);
        sb.append(", pdr_accuracy_y=");
        sb.append(this.pdr_accuracy_y);
        sb.append(", pdr_class_inhand=");
        sb.append(this.pdr_class_inhand);
        sb.append(", pdr_class_withcart=");
        sb.append(this.pdr_class_withcart);
        sb.append(", pdr_class_oncart=");
        return androidx.camera.core.impl.b.p(sb, this.pdr_class_oncart, ')');
    }
}
