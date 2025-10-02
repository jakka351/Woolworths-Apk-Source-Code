package me.oriient.internal.services.geofence;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lme/oriient/internal/services/geofence/GeneralGeofenceStatus;", "", "()V", "closestBuilding", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "getClosestBuilding", "()Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "isConsideredInside", "", "()Z", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "FarAway", "HundredMetersAway", "Inactive", "InsideCircle", "InsidePolygon", "KilometersAway", "Undefined", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$FarAway;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$HundredMetersAway;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$Inactive;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$InsideCircle;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$InsidePolygon;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$KilometersAway;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$Undefined;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class GeneralGeofenceStatus {

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$FarAway;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FarAway extends GeneralGeofenceStatus {

        @NotNull
        public static final FarAway INSTANCE = new FarAway();

        private FarAway() {
            super(null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$HundredMetersAway;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus;", "building", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "(Lme/oriient/internal/services/geofence/models/GeofenceBuilding;)V", "getBuilding", "()Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "equals", "", "other", "", "hashCode", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HundredMetersAway extends GeneralGeofenceStatus {

        @NotNull
        private final GeofenceBuilding building;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HundredMetersAway(@NotNull GeofenceBuilding building) {
            super(null);
            Intrinsics.h(building, "building");
            this.building = building;
        }

        public boolean equals(@Nullable Object other) {
            return other instanceof HundredMetersAway;
        }

        @NotNull
        public final GeofenceBuilding getBuilding() {
            return this.building;
        }

        public int hashCode() {
            return HundredMetersAway.class.hashCode();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$Inactive;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Inactive extends GeneralGeofenceStatus {

        @NotNull
        public static final Inactive INSTANCE = new Inactive();

        private Inactive() {
            super(null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$InsideCircle;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus;", "building", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "(Lme/oriient/internal/services/geofence/models/GeofenceBuilding;)V", "getBuilding", "()Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InsideCircle extends GeneralGeofenceStatus {

        @NotNull
        private final GeofenceBuilding building;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InsideCircle(@NotNull GeofenceBuilding building) {
            super(null);
            Intrinsics.h(building, "building");
            this.building = building;
        }

        public static /* synthetic */ InsideCircle copy$default(InsideCircle insideCircle, GeofenceBuilding geofenceBuilding, int i, Object obj) {
            if ((i & 1) != 0) {
                geofenceBuilding = insideCircle.building;
            }
            return insideCircle.copy(geofenceBuilding);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final GeofenceBuilding getBuilding() {
            return this.building;
        }

        @NotNull
        public final InsideCircle copy(@NotNull GeofenceBuilding building) {
            Intrinsics.h(building, "building");
            return new InsideCircle(building);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof InsideCircle) && Intrinsics.c(((InsideCircle) other).building, this.building);
        }

        @NotNull
        public final GeofenceBuilding getBuilding() {
            return this.building;
        }

        public int hashCode() {
            return InsideCircle.class.hashCode();
        }

        @NotNull
        public String toString() {
            return "InsideCircle(building=" + this.building + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$InsidePolygon;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus;", "building", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "(Lme/oriient/internal/services/geofence/models/GeofenceBuilding;)V", "getBuilding", "()Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InsidePolygon extends GeneralGeofenceStatus {

        @NotNull
        private final GeofenceBuilding building;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InsidePolygon(@NotNull GeofenceBuilding building) {
            super(null);
            Intrinsics.h(building, "building");
            this.building = building;
        }

        public static /* synthetic */ InsidePolygon copy$default(InsidePolygon insidePolygon, GeofenceBuilding geofenceBuilding, int i, Object obj) {
            if ((i & 1) != 0) {
                geofenceBuilding = insidePolygon.building;
            }
            return insidePolygon.copy(geofenceBuilding);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final GeofenceBuilding getBuilding() {
            return this.building;
        }

        @NotNull
        public final InsidePolygon copy(@NotNull GeofenceBuilding building) {
            Intrinsics.h(building, "building");
            return new InsidePolygon(building);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof InsidePolygon) && Intrinsics.c(((InsidePolygon) other).building, this.building);
        }

        @NotNull
        public final GeofenceBuilding getBuilding() {
            return this.building;
        }

        public int hashCode() {
            return InsidePolygon.class.hashCode();
        }

        @NotNull
        public String toString() {
            return "InsidePolygon(building=" + this.building + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$KilometersAway;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus;", "building", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "(Lme/oriient/internal/services/geofence/models/GeofenceBuilding;)V", "getBuilding", "()Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "equals", "", "other", "", "hashCode", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class KilometersAway extends GeneralGeofenceStatus {

        @NotNull
        private final GeofenceBuilding building;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KilometersAway(@NotNull GeofenceBuilding building) {
            super(null);
            Intrinsics.h(building, "building");
            this.building = building;
        }

        public boolean equals(@Nullable Object other) {
            return other instanceof KilometersAway;
        }

        @NotNull
        public final GeofenceBuilding getBuilding() {
            return this.building;
        }

        public int hashCode() {
            return KilometersAway.class.hashCode();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/geofence/GeneralGeofenceStatus$Undefined;", "Lme/oriient/internal/services/geofence/GeneralGeofenceStatus;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Undefined extends GeneralGeofenceStatus {

        @NotNull
        public static final Undefined INSTANCE = new Undefined();

        private Undefined() {
            super(null);
        }
    }

    public /* synthetic */ GeneralGeofenceStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final GeofenceBuilding getClosestBuilding() {
        if (this instanceof FarAway) {
            return null;
        }
        if (this instanceof HundredMetersAway) {
            return ((HundredMetersAway) this).getBuilding();
        }
        if (this instanceof Inactive) {
            return null;
        }
        if (this instanceof InsideCircle) {
            return ((InsideCircle) this).getBuilding();
        }
        if (this instanceof InsidePolygon) {
            return ((InsidePolygon) this).getBuilding();
        }
        if (this instanceof KilometersAway) {
            return ((KilometersAway) this).getBuilding();
        }
        if (this instanceof Undefined) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getName() {
        String strB = Reflection.f24268a.b(getClass()).B();
        if (strB == null) {
            return "";
        }
        if (strB.length() <= 0) {
            return strB;
        }
        char lowerCase = Character.toLowerCase(strB.charAt(0));
        String strSubstring = strB.substring(1);
        Intrinsics.g(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    public final boolean isConsideredInside() {
        if ((this instanceof FarAway) || (this instanceof HundredMetersAway) || (this instanceof Inactive)) {
            return false;
        }
        if ((this instanceof InsideCircle) || (this instanceof InsidePolygon)) {
            return true;
        }
        if ((this instanceof KilometersAway) || (this instanceof Undefined)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private GeneralGeofenceStatus() {
    }
}
