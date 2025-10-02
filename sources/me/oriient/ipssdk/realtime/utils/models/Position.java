package me.oriient.ipssdk.realtime.utils.models;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.android.gms.stats.CodePackage;
import com.salesforce.marketingcloud.storage.db.h;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.time.TimeFormattingExtKt;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.ipssdk.api.models.IPSHeading;
import me.oriient.ipssdk.api.models.IPSPosition;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.api.models.IPSWaypoint;
import me.oriient.ipssdk.common.utils.models.WorldCoordinate;
import me.oriient.ipssdk.realtime.ofs.C1616a3;
import me.oriient.navigation.common.models.NavigationHeading;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.positioningengine.common.PositioningUpdate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0003cdeB\u0085\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aB»\u0001\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010&\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010*Bk\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020!\u0012\u0006\u0010\n\u001a\u00020+\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010-B\u0011\b\u0016\u0012\u0006\u0010.\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010/B#\b\u0016\u0012\u0006\u0010.\u001a\u000200\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u00101B!\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b\u0019\u00106J\u000f\u00107\u001a\u00020\rH\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0007H\u0016¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010:J\u0011\u0010=\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0007H\u0016¢\u0006\u0004\b?\u0010:J\u000f\u0010@\u001a\u00020\u0003H\u0016¢\u0006\u0004\b@\u0010>J\u000f\u0010A\u001a\u00020\u0003H\u0016¢\u0006\u0004\bA\u0010>J\u000f\u0010B\u001a\u00020\u0007H\u0016¢\u0006\u0004\bB\u0010:J\u000f\u0010C\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\tH\u0016¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\u0003H\u0016¢\u0006\u0004\bF\u0010>J\u000f\u0010G\u001a\u00020\u0010H\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0007H\u0016¢\u0006\u0004\bI\u0010:J\u000f\u0010J\u001a\u00020\u0007H\u0016¢\u0006\u0004\bJ\u0010:J\u000f\u0010K\u001a\u00020\u0007H\u0016¢\u0006\u0004\bK\u0010:J\u000f\u0010L\u001a\u00020\u0007H\u0016¢\u0006\u0004\bL\u0010:J\u000f\u0010M\u001a\u00020\u0007H\u0016¢\u0006\u0004\bM\u0010:J\u000f\u0010N\u001a\u00020\u0007H\u0016¢\u0006\u0004\bN\u0010:J\u001a\u0010R\u001a\u00020Q2\b\u0010P\u001a\u0004\u0018\u00010OH\u0096\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0010H\u0016¢\u0006\u0004\bT\u0010HJ\u000f\u0010U\u001a\u00020\u0003H\u0016¢\u0006\u0004\bU\u0010>J\u0017\u0010Y\u001a\u00020V2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\bW\u0010XR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a¨\u0006f"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/Position;", "Lme/oriient/ipssdk/api/models/IPSPosition;", "Lme/oriient/ipssdk/api/models/IPSWaypoint;", "", "id", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "location", "", "accuracy", "Lme/oriient/ipssdk/api/models/IPSHeading;", "heading", "mainOrientation", "floorId", "", "timeDeterminedMilli", "buildingId", "", "floorOrder", "Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "globalCoordinate", "azimuth", "lockProgress", "travelDistance", "serverTimeUtcIso8601", "timeBetweenUpdatesMilli", "<init>", "(Ljava/lang/String;Lme/oriient/ipssdk/realtime/utils/models/Coordinate;DLme/oriient/ipssdk/api/models/IPSHeading;Lme/oriient/ipssdk/api/models/IPSHeading;Ljava/lang/String;JLjava/lang/String;ILme/oriient/ipssdk/common/utils/models/WorldCoordinate;DDDLjava/lang/String;D)V", "x", "y", "z", h.a.b, h.a.c, "altitude", "", "headingX", "headingY", "headingZ", "moX", "moY", "moZ", "serverTime", "timeDiff", "(Ljava/lang/String;DDDDDDDFDDDLjava/lang/String;JIDDDDDLjava/lang/String;D)V", "Lme/oriient/ipssdk/realtime/utils/models/Heading;", "mo", "(Ljava/lang/String;Lme/oriient/ipssdk/realtime/utils/models/Coordinate;FLme/oriient/ipssdk/realtime/utils/models/Heading;JLjava/lang/String;ILme/oriient/ipssdk/realtime/utils/models/Heading;DDLjava/lang/String;D)V", "position", "(Lme/oriient/ipssdk/api/models/IPSPosition;)V", "Lme/oriient/ipssdk/api/models/IPSStartingPosition;", "(Lme/oriient/ipssdk/api/models/IPSStartingPosition;Ljava/lang/String;Ljava/lang/String;)V", "Lme/oriient/positioningengine/common/PositioningUpdate;", "positioningUpdate", "Ljava/util/TimeZone;", "timeZone", "(Lme/oriient/positioningengine/common/PositioningUpdate;Ljava/lang/String;Ljava/util/TimeZone;)V", "getTimeDeterminedMilli", "()J", "getAzimuth", "()D", "getLockProgress", "getTravelDistance", "getServerTimeUtcIso8601", "()Ljava/lang/String;", "getTimeBetweenUpdatesMilli", "getFloorId", "getBuildingId", "getAccuracy", "getHeading", "()Lme/oriient/ipssdk/api/models/IPSHeading;", "getMainOrientation", "getId", "getFloorOrder", "()I", "getX", "getY", "getZ", "getLatitude", "getLongitude", "getAltitude", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lme/oriient/navigation/common/models/NavigationPosition;", "toNavigationPosition$me_oriient_sdk_realtime", "(Ljava/util/TimeZone;)Lme/oriient/navigation/common/models/NavigationPosition;", "toNavigationPosition", "b", "Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "getLocation", "()Lme/oriient/ipssdk/realtime/utils/models/Coordinate;", "j", "Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "getGlobalCoordinate", "()Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "Companion", "me/oriient/ipssdk/realtime/ofs/a3", "Keys", "Values", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Position implements IPSPosition, IPSWaypoint {

    @NotNull
    private static final C1616a3 Companion = new C1616a3();

    /* renamed from: a, reason: collision with root package name */
    private final String f26199a;

    /* renamed from: b, reason: from kotlin metadata */
    private final Coordinate location;
    private final double c;
    private final IPSHeading d;
    private final IPSHeading e;
    private final String f;
    private final long g;
    private final String h;
    private final int i;

    /* renamed from: j, reason: from kotlin metadata */
    private final WorldCoordinate globalCoordinate;
    private final double k;
    private final double l;
    private final double m;
    private final String n;
    private final double o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/Position$Keys;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", CodePackage.LOCATION, "X", "Y", "LOCATION_ACCURACY", "HEADING", "SOURCE", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Keys {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Keys[] $VALUES;

        @NotNull
        private final String value;
        public static final Keys LOCATION = new Keys(CodePackage.LOCATION, 0, "location");
        public static final Keys X = new Keys("X", 1, "x");
        public static final Keys Y = new Keys("Y", 2, "y");
        public static final Keys LOCATION_ACCURACY = new Keys("LOCATION_ACCURACY", 3, "accuracy");
        public static final Keys HEADING = new Keys("HEADING", 4, "heading");
        public static final Keys SOURCE = new Keys("SOURCE", 5, "source");

        private static final /* synthetic */ Keys[] $values() {
            return new Keys[]{LOCATION, X, Y, LOCATION_ACCURACY, HEADING, SOURCE};
        }

        static {
            Keys[] keysArr$values = $values();
            $VALUES = keysArr$values;
            $ENTRIES = EnumEntriesKt.a(keysArr$values);
        }

        private Keys(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Keys> getEntries() {
            return $ENTRIES;
        }

        public static Keys valueOf(String str) {
            return (Keys) Enum.valueOf(Keys.class, str);
        }

        public static Keys[] values() {
            return (Keys[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/models/Position$Values;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LAST_KNOWN", "EXTERNAL", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Values {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Values[] $VALUES;

        @NotNull
        private final String value;
        public static final Values LAST_KNOWN = new Values("LAST_KNOWN", 0, "lastKnown");
        public static final Values EXTERNAL = new Values("EXTERNAL", 1, "external");

        private static final /* synthetic */ Values[] $values() {
            return new Values[]{LAST_KNOWN, EXTERNAL};
        }

        static {
            Values[] valuesArr$values = $values();
            $VALUES = valuesArr$values;
            $ENTRIES = EnumEntriesKt.a(valuesArr$values);
        }

        private Values(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Values> getEntries() {
            return $ENTRIES;
        }

        public static Values valueOf(String str) {
            return (Values) Enum.valueOf(Values.class, str);
        }

        public static Values[] values() {
            return (Values[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public Position(@NotNull String id, @NotNull Coordinate location, double d, @NotNull IPSHeading heading, @NotNull IPSHeading mainOrientation, @NotNull String floorId, long j, @NotNull String buildingId, int i, @NotNull WorldCoordinate globalCoordinate, double d2, double d3, double d4, @Nullable String str, double d5) {
        Intrinsics.h(id, "id");
        Intrinsics.h(location, "location");
        Intrinsics.h(heading, "heading");
        Intrinsics.h(mainOrientation, "mainOrientation");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(globalCoordinate, "globalCoordinate");
        this.f26199a = id;
        this.location = location;
        this.c = d;
        this.d = heading;
        this.e = mainOrientation;
        this.f = floorId;
        this.g = j;
        this.h = buildingId;
        this.i = i;
        this.globalCoordinate = globalCoordinate;
        this.k = d2;
        this.l = d3;
        this.m = d4;
        this.n = str;
        this.o = d5;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Position.class.equals(other.getClass())) {
            Position position = (Position) other;
            if (Double.compare(this.c, position.c) == 0 && this.i == position.i && Double.compare(this.k, position.k) == 0 && Double.compare(this.l, position.l) == 0 && Intrinsics.c(this.location, position.location) && Intrinsics.c(this.d, position.d) && Intrinsics.c(this.e, position.e) && Intrinsics.c(this.f, position.f) && Intrinsics.c(this.h, position.h) && Intrinsics.c(this.globalCoordinate, position.globalCoordinate)) {
                return true;
            }
        }
        return false;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPosition, me.oriient.ipssdk.api.models.IPSStartingPosition
    /* renamed from: getAccuracy, reason: from getter */
    public double getRadiusMeters() {
        return this.c;
    }

    @Override // me.oriient.ipssdk.api.models.IPSGlobalCoordinate
    public double getAltitude() {
        return this.globalCoordinate.getAltitude();
    }

    @Override // me.oriient.ipssdk.api.models.IPSPosition
    /* renamed from: getAzimuth, reason: from getter */
    public double getK() {
        return this.k;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    @NotNull
    public String getBuildingId() {
        return this.h;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPosition
    @NotNull
    /* renamed from: getFloorId, reason: from getter */
    public String getF() {
        return this.f;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinateInBuilding
    public int getFloorOrder() {
        return this.i;
    }

    @NotNull
    public final WorldCoordinate getGlobalCoordinate() {
        return this.globalCoordinate;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPosition, me.oriient.ipssdk.api.models.IPSStartingPosition
    @NotNull
    /* renamed from: getHeading, reason: from getter */
    public IPSHeading getD() {
        return this.d;
    }

    @Override // me.oriient.ipssdk.api.models.IPSWaypoint
    @NotNull
    /* renamed from: getId, reason: from getter */
    public String getF7346a() {
        return this.f26199a;
    }

    @Override // me.oriient.ipssdk.api.models.IPSGlobalCoordinate
    public double getLatitude() {
        return this.globalCoordinate.getLatitude();
    }

    @NotNull
    public final Coordinate getLocation() {
        return this.location;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPosition
    /* renamed from: getLockProgress, reason: from getter */
    public double getL() {
        return this.l;
    }

    @Override // me.oriient.ipssdk.api.models.IPSGlobalCoordinate
    public double getLongitude() {
        return this.globalCoordinate.getLongitude();
    }

    @Override // me.oriient.ipssdk.api.models.IPSPosition
    @NotNull
    /* renamed from: getMainOrientation, reason: from getter */
    public IPSHeading getE() {
        return this.e;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPosition
    @Nullable
    /* renamed from: getServerTimeUtcIso8601, reason: from getter */
    public String getN() {
        return this.n;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPosition
    /* renamed from: getTimeBetweenUpdatesMilli, reason: from getter */
    public double getO() {
        return this.o;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPosition, me.oriient.ipssdk.api.models.IPSStartingPosition
    /* renamed from: getTimeDeterminedMilli, reason: from getter */
    public long getG() {
        return this.g;
    }

    @Override // me.oriient.ipssdk.api.models.IPSPosition
    /* renamed from: getTravelDistance, reason: from getter */
    public double getM() {
        return this.m;
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getX() {
        return this.location.getX();
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getY() {
        return this.location.getY();
    }

    @Override // me.oriient.ipssdk.api.models.IPSCoordinate
    public double getZ() {
        return this.location.getZ();
    }

    public int hashCode() {
        return Objects.hash(this.location, Double.valueOf(this.c), this.d, this.e, this.f, this.h, Integer.valueOf(this.i), this.globalCoordinate, Double.valueOf(this.k), Double.valueOf(this.l));
    }

    @NotNull
    public final NavigationPosition toNavigationPosition$me_oriient_sdk_realtime(@NotNull TimeZone timeZone) {
        Intrinsics.h(timeZone, "timeZone");
        String str = this.n;
        return new NavigationPosition(new IndoorCoordinate(getX(), getY(), getZ()), new NavigationHeading(this.d.getF26195a(), this.d.getB()), str != null ? TimeFormattingExtKt.fromIso8601WithoutTimezone(str, timeZone) : 0L, this.h, this.i);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Position{location=");
        sb.append(this.location);
        sb.append(", accuracy=");
        sb.append(this.c);
        sb.append(", heading=");
        sb.append(this.d);
        sb.append(", mainOrientation=");
        sb.append(this.e);
        sb.append(", floorId='");
        sb.append(this.f);
        sb.append("', timeDeterminedMilli=");
        sb.append(this.g);
        sb.append(", id='");
        sb.append(this.f26199a);
        sb.append("', buildingId='");
        sb.append(this.h);
        sb.append("', floorOrder=");
        sb.append(this.i);
        sb.append(", globalCoordinate=");
        sb.append(this.globalCoordinate);
        sb.append(", azimuth=");
        sb.append(this.k);
        sb.append(", lockProgress=");
        sb.append(this.l);
        sb.append(", travelDistance=");
        sb.append(this.m);
        sb.append(", serverTimeUtcIso8601='");
        sb.append(this.n);
        sb.append("', timeBetweenUpdatesMilli=");
        return b.p(sb, this.o, '}');
    }

    public /* synthetic */ Position(String str, Coordinate coordinate, double d, IPSHeading iPSHeading, IPSHeading iPSHeading2, String str2, long j, String str3, int i, WorldCoordinate worldCoordinate, double d2, double d3, double d4, String str4, double d5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? a.h("toString(...)") : str, coordinate, d, iPSHeading, iPSHeading2, str2, j, str3, i, worldCoordinate, (i2 & 1024) != 0 ? 0.0d : d2, d3, d4, str4, d5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Position(@NotNull String buildingId, double d, double d2, double d3, double d4, double d5, double d6, double d7, float f, double d8, double d9, double d10, @NotNull String floorId, long j, int i, double d11, double d12, double d13, double d14, double d15, @Nullable String str, double d16) {
        this(null, new Coordinate(d, d2, d3), f, new Heading(d8, d9, d10), new Heading(d11, d12, d13), floorId, j, buildingId, i, new WorldCoordinate(d4, d5, d6), d7, d14, d15, str, d16, 1, null);
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Position(@NotNull String buildingId, @NotNull Coordinate location, float f, @NotNull Heading heading, long j, @NotNull String floorId, int i, @NotNull Heading mo, double d, double d2, @Nullable String str, double d3) {
        this(null, location, f, heading, mo, floorId, j, buildingId, i, new WorldCoordinate(0.0d, 0.0d, 0.0d), 0.0d, d, d2, str, d3, 1025, null);
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(location, "location");
        Intrinsics.h(heading, "heading");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mo, "mo");
    }

    public Position(@NotNull IPSPosition position) {
        Intrinsics.h(position, "position");
        String h = position.getBuildingId();
        String f = position.getF();
        int i = position.getFloorOrder();
        Coordinate coordinate = new Coordinate(position.getX(), position.getY(), position.getZ());
        double c = position.getRadiusMeters();
        IPSHeading d = position.getD();
        Intrinsics.g(d, "getHeading(...)");
        Heading heading = new Heading(d);
        long g = position.getG();
        double k = position.getK();
        WorldCoordinate worldCoordinate = new WorldCoordinate(position.getLatitude(), position.getLongitude(), position.getAltitude());
        IPSHeading e = position.getE();
        double l = position.getL();
        double m = position.getM();
        String n = position.getN();
        double o = position.getO();
        Intrinsics.e(e);
        Intrinsics.e(f);
        Intrinsics.e(h);
        this(null, coordinate, c, heading, e, f, g, h, i, worldCoordinate, k, l, m, n, o, 1, null);
    }

    public Position(@NotNull IPSStartingPosition position, @NotNull String buildingId, @Nullable String str) {
        Intrinsics.h(position, "position");
        Intrinsics.h(buildingId, "buildingId");
        String str2 = str == null ? "UNDEFINED" : str;
        int i = position.getFloorOrder();
        Coordinate coordinate = new Coordinate(position.getX(), position.getY(), position.getZ());
        double c = position.getRadiusMeters();
        IPSHeading d = position.getD();
        Heading heading = d != null ? new Heading(d) : new Heading(0.0d, 1.0d);
        IPSHeading d2 = position.getD();
        this(null, coordinate, c, heading, d2 != null ? new Heading(d2) : new Heading(0.0d, 1.0d), str2, position.getG(), buildingId, i, new WorldCoordinate(position.getLatitude(), position.getLongitude(), position.getAltitude()), 0.0d, 0.0d, 0.0d, null, 0.0d, 1025, null);
    }

    public Position(@NotNull PositioningUpdate positioningUpdate, @NotNull String buildingId, @NotNull TimeZone timeZone) {
        Intrinsics.h(positioningUpdate, "positioningUpdate");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(timeZone, "timeZone");
        Integer floorOrder = positioningUpdate.getFloorOrder();
        int iIntValue = floorOrder != null ? floorOrder.intValue() : Integer.MIN_VALUE;
        double x = positioningUpdate.getX();
        double y = positioningUpdate.getY();
        Double z = positioningUpdate.getZ();
        Coordinate coordinate = new Coordinate(x, y, z != null ? z.doubleValue() : -2.147483648E9d);
        double latitude = positioningUpdate.getLatitude();
        double longitude = positioningUpdate.getLongitude();
        Double altitude = positioningUpdate.getAltitude();
        WorldCoordinate worldCoordinate = new WorldCoordinate(latitude, longitude, altitude != null ? altitude.doubleValue() : -2.147483648E9d);
        double accuracy = positioningUpdate.getAccuracy();
        double azimuth = positioningUpdate.getAzimuth();
        Heading heading = new Heading(positioningUpdate.getHeading());
        Heading heading2 = new Heading(positioningUpdate.getMainOrientation());
        long timeDeterminedMillis = positioningUpdate.getTimeDeterminedMillis();
        String floorId = positioningUpdate.getFloorId();
        this(null, coordinate, accuracy, heading, heading2, floorId == null ? "UNDEFINED" : floorId, timeDeterminedMillis, buildingId, iIntValue, worldCoordinate, azimuth, positioningUpdate.getLockProgress(), positioningUpdate.getTraveledDistance(), TimeFormattingExtKt.toIso8601WithoutTimezone(positioningUpdate.getServerTimeMillis(), timeZone), positioningUpdate.getTimeBetweenUpdatesMilli(), 1, null);
    }
}
