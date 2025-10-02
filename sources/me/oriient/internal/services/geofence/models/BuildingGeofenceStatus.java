package me.oriient.internal.services.geofence.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import com.google.android.gms.ads.AdError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.SystemLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "", "id", "", "(I)V", "sinceTimestampMillis", "", "getSinceTimestampMillis", "()J", "isSameStatus", "", "other", "toShortDescription", "", "withNewTimestamp", "newTimestamp", "Inside", "Outside", "Undefined", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus$Inside;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus$Outside;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus$Undefined;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BuildingGeofenceStatus {
    private final int id;

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus$Inside;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "sinceTimestampMillis", "", "location", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "(JLme/oriient/internal/infra/locationManager/SystemLocation;)V", "getLocation", "()Lme/oriient/internal/infra/locationManager/SystemLocation;", "getSinceTimestampMillis", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Inside extends BuildingGeofenceStatus {

        @NotNull
        private final SystemLocation location;
        private final long sinceTimestampMillis;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Inside(long j, @NotNull SystemLocation location) {
            super(1, null);
            Intrinsics.h(location, "location");
            this.sinceTimestampMillis = j;
            this.location = location;
        }

        public static /* synthetic */ Inside copy$default(Inside inside, long j, SystemLocation systemLocation, int i, Object obj) {
            if ((i & 1) != 0) {
                j = inside.sinceTimestampMillis;
            }
            if ((i & 2) != 0) {
                systemLocation = inside.location;
            }
            return inside.copy(j, systemLocation);
        }

        /* renamed from: component1, reason: from getter */
        public final long getSinceTimestampMillis() {
            return this.sinceTimestampMillis;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SystemLocation getLocation() {
            return this.location;
        }

        @NotNull
        public final Inside copy(long sinceTimestampMillis, @NotNull SystemLocation location) {
            Intrinsics.h(location, "location");
            return new Inside(sinceTimestampMillis, location);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Inside)) {
                return false;
            }
            Inside inside = (Inside) other;
            return this.sinceTimestampMillis == inside.sinceTimestampMillis && Intrinsics.c(this.location, inside.location);
        }

        @NotNull
        public final SystemLocation getLocation() {
            return this.location;
        }

        @Override // me.oriient.internal.services.geofence.models.BuildingGeofenceStatus
        public long getSinceTimestampMillis() {
            return this.sinceTimestampMillis;
        }

        public int hashCode() {
            return this.location.hashCode() + (Long.hashCode(this.sinceTimestampMillis) * 31);
        }

        @NotNull
        public String toString() {
            return "Inside(sinceTimestampMillis=" + this.sinceTimestampMillis + ", location=" + this.location + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus$Outside;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "sinceTimestampMillis", "", "location", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "(JLme/oriient/internal/infra/locationManager/SystemLocation;)V", "getLocation", "()Lme/oriient/internal/infra/locationManager/SystemLocation;", "getSinceTimestampMillis", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Outside extends BuildingGeofenceStatus {

        @Nullable
        private final SystemLocation location;
        private final long sinceTimestampMillis;

        public /* synthetic */ Outside(long j, SystemLocation systemLocation, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? null : systemLocation);
        }

        public static /* synthetic */ Outside copy$default(Outside outside, long j, SystemLocation systemLocation, int i, Object obj) {
            if ((i & 1) != 0) {
                j = outside.sinceTimestampMillis;
            }
            if ((i & 2) != 0) {
                systemLocation = outside.location;
            }
            return outside.copy(j, systemLocation);
        }

        /* renamed from: component1, reason: from getter */
        public final long getSinceTimestampMillis() {
            return this.sinceTimestampMillis;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final SystemLocation getLocation() {
            return this.location;
        }

        @NotNull
        public final Outside copy(long sinceTimestampMillis, @Nullable SystemLocation location) {
            return new Outside(sinceTimestampMillis, location);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Outside)) {
                return false;
            }
            Outside outside = (Outside) other;
            return this.sinceTimestampMillis == outside.sinceTimestampMillis && Intrinsics.c(this.location, outside.location);
        }

        @Nullable
        public final SystemLocation getLocation() {
            return this.location;
        }

        @Override // me.oriient.internal.services.geofence.models.BuildingGeofenceStatus
        public long getSinceTimestampMillis() {
            return this.sinceTimestampMillis;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.sinceTimestampMillis) * 31;
            SystemLocation systemLocation = this.location;
            return iHashCode + (systemLocation == null ? 0 : systemLocation.hashCode());
        }

        @NotNull
        public String toString() {
            return "Outside(sinceTimestampMillis=" + this.sinceTimestampMillis + ", location=" + this.location + ')';
        }

        public Outside(long j, @Nullable SystemLocation systemLocation) {
            super(2, null);
            this.sinceTimestampMillis = j;
            this.location = systemLocation;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus$Undefined;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "sinceTimestampMillis", "", "(J)V", "getSinceTimestampMillis", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Undefined extends BuildingGeofenceStatus {
        private final long sinceTimestampMillis;

        public Undefined(long j) {
            super(0, null);
            this.sinceTimestampMillis = j;
        }

        public static /* synthetic */ Undefined copy$default(Undefined undefined, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = undefined.sinceTimestampMillis;
            }
            return undefined.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getSinceTimestampMillis() {
            return this.sinceTimestampMillis;
        }

        @NotNull
        public final Undefined copy(long sinceTimestampMillis) {
            return new Undefined(sinceTimestampMillis);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Undefined) && this.sinceTimestampMillis == ((Undefined) other).sinceTimestampMillis;
        }

        @Override // me.oriient.internal.services.geofence.models.BuildingGeofenceStatus
        public long getSinceTimestampMillis() {
            return this.sinceTimestampMillis;
        }

        public int hashCode() {
            return Long.hashCode(this.sinceTimestampMillis);
        }

        @NotNull
        public String toString() {
            return b.q(new StringBuilder("Undefined(sinceTimestampMillis="), this.sinceTimestampMillis, ')');
        }
    }

    public /* synthetic */ BuildingGeofenceStatus(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public abstract long getSinceTimestampMillis();

    public final boolean isSameStatus(@NotNull BuildingGeofenceStatus other) {
        Intrinsics.h(other, "other");
        return this.id == other.id;
    }

    @NotNull
    public final String toShortDescription() {
        if (this instanceof Inside) {
            return "inside";
        }
        if (this instanceof Outside) {
            return "outside";
        }
        if (this instanceof Undefined) {
            return AdError.UNDEFINED_DOMAIN;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final BuildingGeofenceStatus withNewTimestamp(long newTimestamp) {
        if (this instanceof Undefined) {
            return ((Undefined) this).copy(newTimestamp);
        }
        if (this instanceof Inside) {
            return Inside.copy$default((Inside) this, newTimestamp, null, 2, null);
        }
        if (this instanceof Outside) {
            return Outside.copy$default((Outside) this, newTimestamp, null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private BuildingGeofenceStatus(int i) {
        this.id = i;
    }
}
